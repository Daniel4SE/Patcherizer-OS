''' Translate input text with trained model. '''

import torch
import torch.utils.data
import argparse
from tqdm import tqdm
import ipdb
import pickle

from dataset import collate_fn, TranslationDataset
from transformer.Translator import Translator
from preprocess import read_instances_from_file, convert_instance_to_idx_seq
from utils.postprocess import del_repeat
from transformer.Models import Transformer

if __name__ == "__main__":
    '''Main Function'''

    parser = argparse.ArgumentParser(description='translate.py')

    parser.add_argument('-model', required=True,
                        help='Path to model .pt file')
    parser.add_argument('-src', required=True,
                        help='Source sequence to decode (one line per sequence)')
    parser.add_argument('-vocab', required=True,
                        help='Path to dictionary file')
    parser.add_argument('-output', default='pred.txt',
                        help="""Path to output the predictions (each line will
                        be the decoded sequence""")
    parser.add_argument('-beam_size', type=int, default=5,
                        help='Beam size')
    parser.add_argument('-batch_size', type=int, default=30,
                        help='Batch size')
    parser.add_argument('-n_best', type=int, default=1,
                        help="""If verbose is set, will output the n_best
                        decoded sentences""")
    parser.add_argument('-no_cuda', action='store_true')
    parser.add_argument('-name', type=str, help='name of our output file')

    opt = parser.parse_args()
    opt.cuda = not opt.no_cuda

    # Prepare DataLoader
    preprocess_data = torch.load(opt.vocab)
    preprocess_settings = preprocess_data['settings']
    test_src_word_insts = read_instances_from_file(
        opt.src,
        preprocess_settings.max_word_seq_len,
        preprocess_settings.keep_case)
    test_src_insts = convert_instance_to_idx_seq(
        test_src_word_insts, preprocess_data['dict']['src'])

    test_loader = torch.utils.data.DataLoader(
        TranslationDataset(
            src_word2idx=preprocess_data['dict']['src'],
            tgt_word2idx=preprocess_data['dict']['tgt'],
            src_insts=test_src_insts),
        num_workers=2,
        batch_size=opt.batch_size,
        collate_fn=collate_fn)

    
    
    device = torch.device('cuda' if opt.cuda else 'cpu')
    if opt.model is None:
        transformer = Transformer(
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
            dropout=opt.dropout).to(device)    
    else:
        checkpoint = torch.load(opt.model)
        model_opt = checkpoint['settings']        
        transformer = Transformer(
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
            dropout=model_opt.dropout).to(device)
    
    with torch.no_grad():
        patch_ftrs = list()
        for batch in tqdm(
                test_loader, mininterval=2,
                desc='  - (Training)   ', leave=False):
            # prepare data
            src_seq, src_pos= map(lambda x: x.to(device), batch)
            embeddings = transformer.forward_commit_embeds_diff(src_seq, src_pos)
            embeddings = torch.mean(embeddings,dim=1)
            patch_ftrs.append(embeddings)

            print(embeddings.shape)
        patch_ftrs = torch.cat(patch_ftrs).cpu().detach().numpy()
    print(opt.name)
    print(patch_ftrs.shape)
    
    # pickle.dump(patch_ftrs, open(opt.name, 'wb'))
    torch.save(patch_ftrs, opt.name)

    translator = Translator(opt)
    with open(opt.output, 'w') as f:
        for batch in tqdm(test_loader, mininterval=2, desc='  - (Test)', leave=False):
            all_hyp, all_scores = translator.translate_batch(*batch)
            for idx_seqs in all_hyp:
                for idx_seq in idx_seqs:
                    pred_line = ' '.join([test_loader.dataset.tgt_idx2word[idx] for idx in idx_seq[:-1]])
                    f.write(pred_line + '\n')
                    
    print('[Info] Finished.')