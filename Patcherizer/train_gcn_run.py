'''
This script handling the training process.
'''

import argparse
import math
import time
import random
import numpy as np
import networkx as nx
import torch.nn as nn
import scipy.sparse as sp

from tqdm import tqdm
import torch
import torch.nn.functional as F
import torch.optim as optim
import torch.utils.data
import transformer.Constants as Constants
from dataset_gcn_run import TranslationDataset, paired_collate_fn
from transformer.Models import Transformer_GCN
from transformer.Optim import ScheduledOptim
import ipdb
from collections import OrderedDict
import os
from transformer.gnn import GCN
from graph_preprocess.ParserNameExtract import normalize,sparse_mx_to_torch_sparse_tensor
os.environ["CUDA_DEVICE_ORDER"] = "PCI_BUS_ID"
os.environ["CUDA_VISIBLE_DEVICES"]= "0"
CUDA_LAUNCH_BLOCKING=1

def set_seed(seed):
    random.seed(seed)
    np.random.seed(seed)
    torch.manual_seed(seed)

def cal_performance(pred, gold, smoothing=False):
    ''' Apply label smoothing if needed '''

    loss = cal_loss(pred, gold, smoothing)

    pred = pred.max(1)[1]
    gold = gold.contiguous().view(-1)
    non_pad_mask = gold.ne(Constants.PAD)
    
    n_correct = pred.eq(gold)
    n_correct = n_correct.masked_select(non_pad_mask).sum().item()

    return loss, n_correct


def cal_loss(pred, gold, smoothing):
    ''' Calculate cross entropy loss, apply label smoothing if needed. '''

    gold = gold.contiguous().view(-1)

    if smoothing:
        eps = 0.1
        if pred==None:
            print(pred)
        n_class = pred.size(1)

        one_hot = torch.zeros_like(pred).scatter(1, gold.view(-1, 1), 1)
        one_hot = one_hot * (1 - eps) + (1 - one_hot) * eps / (n_class - 1)
        log_prb = F.log_softmax(pred, dim=1)

        non_pad_mask = gold.ne(Constants.PAD)
        loss = -(one_hot * log_prb).sum(dim=1)
        loss = loss.masked_select(non_pad_mask).sum()  # average later
    else:
        if type(gold)=='NoneType' or type(pred)=='NoneType':
            ipdb.set_trace()
        loss = F.cross_entropy(pred, gold, ignore_index=Constants.PAD, reduction='sum') # 忽略pad对应的index

    return loss


def train_epoch(model, training_data, optimizer, device, smoothing):
    ''' Epoch operation in training phase'''

    model.train()

    total_loss = 0
    n_word_total = 0
    n_word_correct = 0

    ii = 0
    for batch in tqdm(
            training_data, mininterval=2,
            desc='  - (Training)   ', leave=False):
        
        
        # prepare data
        # src_seq, src_pos, tgt_seq, tgt_pos, gb = map(lambda x: x.to(device), batch)
        src_seq, src_pos, tgt_seq, tgt_pos, gb = batch
        src_seq = src_seq.to(device)
        src_pos = src_pos.to(device)
        tgt_seq = tgt_seq.to(device)
        tgt_pos = tgt_pos.to(device)
        gb = gb.to(device)
        gold = tgt_seq[:, 1:]

        # forward
        optimizer.zero_grad()
        pred = model(src_seq, src_pos, tgt_seq, tgt_pos, gb)
        # ipdb.set_trace()

        ii+=1
        # if ii==2:
        #     ipdb.set_trace()

        # backward
        loss, n_correct = cal_performance(pred, gold, smoothing=smoothing)
        loss.backward()

        # update parameters
        optimizer.step_and_update_lr()

        # note keeping
        total_loss += loss.item()

        non_pad_mask = gold.ne(Constants.PAD)
        n_word = non_pad_mask.sum().item()
        n_word_total += n_word
        n_word_correct += n_correct
        # ipdb.set_trace()

    loss_per_word = total_loss/n_word_total
    accuracy = n_word_correct/n_word_total
    return loss_per_word, accuracy

def eval_epoch(model, validation_data, device):
    ''' Epoch operation in evaluation phase '''

    model.eval()

    total_loss = 0
    n_word_total = 0
    n_word_correct = 0

    preds = []
    golds = []
    
    with torch.no_grad():
        for batch in tqdm(
                validation_data, mininterval=2,
                desc='  - (Validation) ', leave=False):

            # prepare data
            
            # src_seq, src_pos, tgt_seq, tgt_pos = map(lambda x: x.to(device), batch)
            src_seq, src_pos, tgt_seq, tgt_pos, gb = batch
            src_seq = src_seq.to(device)
            src_pos = src_pos.to(device)
            tgt_seq = tgt_seq.to(device)
            tgt_pos = tgt_pos.to(device)
            gb = gb.to(device) 
            gold = tgt_seq[:, 1:]

            # forward
            pred = model(src_seq, src_pos, tgt_seq, tgt_pos, gb)

            preds.append(pred)
            golds.append(gold)

            loss, n_correct = cal_performance(pred, gold, smoothing=False)

            # note keeping
            total_loss += loss.item()

            non_pad_mask = gold.ne(Constants.PAD)
            n_word = non_pad_mask.sum().item()
            n_word_total += n_word
            n_word_correct += n_correct

    loss_per_word = total_loss/n_word_total
    accuracy = n_word_correct/n_word_total
    return loss_per_word, accuracy, preds, golds

def train(model, training_data, validation_data, optimizer, device, opt):
    ''' Start training '''

    log_train_file = None
    log_valid_file = None

    if opt.log:
        log_train_file = opt.log + '.train.log'
        log_valid_file = opt.log + '.valid.log'

        print('[Info] Training performance will be written to file: {} and {}'.format(
            log_train_file, log_valid_file))

        with open(log_train_file, 'w') as log_tf, open(log_valid_file, 'w') as log_vf:
            log_tf.write(str(opt)+"\n")
            log_vf.write(str(opt)+"\n")
            log_tf.write('epoch,loss,ppl,accuracy\n')
            log_vf.write('epoch,loss,ppl,accuracy\n')

    valid_accus = []

    predss = []
    goldss = []
    for epoch_i in range(opt.epoch):
        print('[ Epoch', epoch_i, ']')

        start = time.time()
        train_loss, train_accu = train_epoch(
            model, training_data, optimizer, device, smoothing=opt.label_smoothing)
        
        
        print('  - (Training)   ppl: {ppl: 8.5f}, accuracy: {accu:3.3f} %, '\
              'elapse: {elapse:3.3f} min'.format(
                  ppl=math.exp(min(train_loss, 100)), accu=100*train_accu,
                  elapse=(time.time()-start)/60))

        start = time.time()
        valid_loss, valid_accu, preds, golds = eval_epoch(model, validation_data, device)
        print('  - (Validation) ppl: {ppl: 8.5f}, accuracy: {accu:3.3f} %, '\
                'elapse: {elapse:3.3f} min'.format(
                    ppl=math.exp(min(valid_loss, 100)), accu=100*valid_accu,
                    elapse=(time.time()-start)/60))

        predss.append(preds)
        goldss.append(golds)

        valid_accus += [valid_accu]

        model_state_dict = model.state_dict()
        checkpoint = {
            'model': model_state_dict,
            'settings': opt,
            'epoch': epoch_i}

        if opt.save_model:
            if opt.save_mode == 'all':
                model_name = opt.save_model + '_accu_{accu:3.3f}.chkpt'.format(accu=100*valid_accu)
                torch.save(checkpoint, model_name)
            elif opt.save_mode == 'best':
                model_name = opt.save_model + '_accu_{accu:3.3f}.chkpt'.format(accu=100*valid_accu)
                if opt.save_thres:
                    if valid_accu > opt.save_thres and valid_accu >= max(valid_accus):
                        torch.save(checkpoint, model_name)
                        print('    - [Info] The checkpoint file has been updated.')
                elif valid_accu >= max(valid_accus):
                    torch.save(checkpoint, model_name)
                    print('    - [Info] The checkpoint file has been updated.')
            elif opt.save_mode == 'record':
                model_name = opt.save_model + '_epoch_{0}.chkpt'.format(epoch_i)
                torch.save(checkpoint, model_name)

        if log_train_file and log_valid_file:
            with open(log_train_file, 'a') as log_tf, open(log_valid_file, 'a') as log_vf:
                log_tf.write('{epoch},{loss: 8.5f},{ppl: 8.5f},{accu:3.3f}\n'.format(
                    epoch=epoch_i, loss=train_loss,
                    ppl=math.exp(min(train_loss, 100)), accu=100*train_accu))
                log_vf.write('{epoch},{loss: 8.5f},{ppl: 8.5f},{accu:3.3f}\n'.format(
                    epoch=epoch_i, loss=valid_loss,
                    ppl=math.exp(min(valid_loss, 100)), accu=100*valid_accu))

def main():
    ''' Main function '''
    parser = argparse.ArgumentParser()

    parser.add_argument('-data', required=True) # /vocab/pretrain_vocab

    parser.add_argument('-epoch', type=int, default=100) # 30 
    parser.add_argument('-batch_size', type=int, default=64) # 4

    parser.add_argument('-d_model', type=int, default=512) # 模型输出向量维度 512
    parser.add_argument('-d_inner_hid', type=int, default=2048) # 中间向量维度 2048
    parser.add_argument('-d_k', type=int, default=64) # 默认64
    parser.add_argument('-d_v', type=int, default=64) # 默认64

    parser.add_argument('-n_head', type=int, default=6) # 4
    parser.add_argument('-n_layers', type=int, default=2) # 6
    parser.add_argument('-n_warmup_steps', type=int, default=4000) # 默认 4000

    parser.add_argument('-seed', type=int, default=42) # 默认42
    parser.add_argument('-dropout', type=float, default=0.1) # 默认0.1
    parser.add_argument('-embs_share_weight', action='store_true') # ture
    parser.add_argument('-proj_share_weight', action='store_true') # true

    parser.add_argument('-log', default=None) #默认 None
    parser.add_argument('-save_model', default=None) # pretrain/pretrain_4layer_6head_0.5mask_accu_xxx (.chkpt)
    parser.add_argument('-save_mode', type=str, choices=['all', 'best', 'record'], default='best') # best
    parser.add_argument('-save_thres', type=float, default=None) # 默认None

    parser.add_argument('-no_cuda', action='store_true') # 默认 true
    parser.add_argument('-label_smoothing', action='store_true') # True

    parser.add_argument('-model', default=None, help='Path to model .pt file') # 默认None

    opt = parser.parse_args()
    opt.cuda = not opt.no_cuda
    
    opt.d_word_vec = opt.d_model
    set_seed(opt.seed)

    #========= Loading Dataset =========#

    data = torch.load(opt.data)

    
    opt.max_token_seq_len = data['settings'].max_token_seq_len # 514
    training_data, validation_data = prepare_dataloaders(data, opt)

    # for batch in tqdm(
    #         training_data, mininterval=2,
    #         desc='  - (Training)   ', leave=False):
    #     src_seq, src_pos, tgt_seq, tgt_pos, gb = batch
    #     ipdb.set_trace()

    

    opt.src_vocab_size = training_data.dataset.src_vocab_size
    opt.tgt_vocab_size = training_data.dataset.tgt_vocab_size



    #========= Preparing Model =========# 这段只是检验一下是否共享了参数
    if opt.embs_share_weight:
        assert training_data.dataset.src_word2idx == training_data.dataset.tgt_word2idx, \
            'The src/tgt word2idx table are different but asked to share word embedding.'

    # print(opt)

    device = torch.device('cuda' if opt.cuda else 'cpu')

    G = data['train']['graph']
    """test if names in G exist in dictionary.
    for i in list(G.nodes):
        print(training_data.dataset.tgt_idx2word[i])
    """

    # ipdb.set_trace() # debug point 1


    if opt.model is None:
        transformer = Transformer_GCN(
            opt.src_vocab_size,
            opt.tgt_vocab_size,
            opt.max_token_seq_len,
            tgt_emb_prj_weight_sharing=opt.proj_share_weight,
            emb_src_tgt_weight_sharing=opt.embs_share_weight,
            d_k=opt.d_k,
            d_v=opt.d_v,
            d_model=opt.d_model,
            d_word_vec=opt.d_word_vec,
            d_inner=opt.d_inner_hid,
            n_layers=opt.n_layers,
            n_head=opt.n_head,
            g = G,
            dropout=opt.dropout).to(device)
        
    else:
        checkpoint = torch.load(opt.model)
        model_opt = checkpoint['settings']
        
        
        transformer = Transformer_GCN(
            model_opt.src_vocab_size,
            model_opt.tgt_vocab_size,
            model_opt.max_token_seq_len,
            tgt_emb_prj_weight_sharing=model_opt.proj_share_weight,
            emb_src_tgt_weight_sharing=model_opt.embs_share_weight,
            d_k=model_opt.d_k,
            d_v=model_opt.d_v,
            d_model=model_opt.d_model,
            d_word_vec=model_opt.d_word_vec,
            d_inner=model_opt.d_inner_hid,
            n_layers=model_opt.n_layers,
            n_head=model_opt.n_head,
            g = G,
            dropout=model_opt.dropout).to(device)
        
        # # for pretrain: sequence pre-trained model, do next        
        ck = checkpoint['model']
        # ipdb.set_trace()
        ck['encoder.GCN.gc1.weight'] = torch.nn.Embedding(opt.d_word_vec,opt.d_word_vec).weight.data.to(device) #torch.Tensor(opt.d_word_vec,opt.d_word_vec).to(device)
        ck['encoder.GCN.gc1.bias'] = torch.nn.Embedding(opt.d_word_vec,1).weight.data.view(opt.d_word_vec).to(device)
        ck['encoder.GCN.gc2.weight']=torch.nn.Embedding(opt.d_word_vec,opt.d_word_vec).weight.data.to(device)
        ck['encoder.GCN.gc2.bias'] = torch.nn.Embedding(opt.d_word_vec,1).weight.data.view(opt.d_word_vec).to(device)
        ck['encoder.GCN.tgt_word_prj.weight'] = torch.nn.Embedding(opt.d_word_vec,opt.d_word_vec).weight.data.to(device)
        # ipdb.set_trace()
        new_state_dict = OrderedDict()

        if [*dict(ck.items())][0][:7] == 'encoder' or [*dict(ck.items())][0][:7] == 'decoder':
            transformer.load_state_dict(checkpoint['model'])
        else:
            for k, v in ck.items():
                # print(k, v, type(k), type(v), '\n')
                name = k[7:] 
                new_state_dict[name] = v
            transformer.load_state_dict(new_state_dict)
            #transformer.load_state_dict(checkpoint['model'])
            print('[Info] Trained model state loaded.')

    optimizer = ScheduledOptim(
        optim.Adam(
            filter(lambda x: x.requires_grad, transformer.parameters()),
            betas=(0.9, 0.98), eps=1e-09),
        opt.d_model, opt.n_warmup_steps)
    # optimizer = optim.Adam(transformer.parameters(),
    #                    lr=0.01, weight_decay=5e-4)
    
    
    
    train(transformer, training_data, validation_data, optimizer, device, opt)
    



def prepare_dataloaders(data, opt):
    # ========= Preparing DataLoader =========#
    train_loader = torch.utils.data.DataLoader(
        TranslationDataset(
            src_word2idx=data['dict']['src'],
            tgt_word2idx=data['dict']['tgt'],
            graphdiff = data['train']['graphdiff'],
            src_insts=data['train']['src'],
            tgt_insts=data['train']['tgt']),
        num_workers=2,
        batch_size=opt.batch_size,
        collate_fn=paired_collate_fn,
        shuffle=True) # collate_fn自动加载data
    

    valid_loader = torch.utils.data.DataLoader(
        TranslationDataset(
            src_word2idx=data['dict']['src'],
            tgt_word2idx=data['dict']['tgt'],
            graphdiff = data['valid']['graphdiff'],
            src_insts=data['valid']['src'],
            tgt_insts=data['valid']['tgt']),
        num_workers=2,
        batch_size=opt.batch_size,
        collate_fn=paired_collate_fn)
    return train_loader, valid_loader


    


if __name__ == '__main__':
    main()
