''' Handling the data io '''
import argparse
import torch
import networkx as nx
import pickle
import transformer.Constants as Constants
from graph_preprocess.ParserNameExtract import returnelements
import ipdb
def read_instances_from_file(inst_file, max_sent_len, keep_case):
    ''' Convert file into word seq lists and vocab '''

    word_insts = []
    trimmed_sent_count = 0
    with open(inst_file) as f:
        for sent in f:
            if not keep_case:
                sent = sent.lower()
            words = sent.split()
            if len(words) > max_sent_len:
                trimmed_sent_count += 1
            word_inst = words[:max_sent_len] # it does not matter if the length is larger than max_sent_len

            if word_inst:
                word_insts += [[Constants.BOS_WORD] + word_inst + [Constants.EOS_WORD]]
            else:
                word_insts += [None]

    print('[Info] Get {} instances from {}'.format(len(word_insts), inst_file))

    if trimmed_sent_count > 0:
        print('[Warning] {} instances are trimmed to the max sentence length {}.'
              .format(trimmed_sent_count, max_sent_len))

    return word_insts

def build_vocab_idx(word_insts, min_word_count):
    ''' Trim vocab by number of occurence '''

    full_vocab = set(w for sent in word_insts for w in sent)
    
    print('[Info] Original Vocabulary size =', len(full_vocab))

    word2idx = {
        Constants.BOS_WORD: Constants.BOS,
        Constants.EOS_WORD: Constants.EOS,
        Constants.PAD_WORD: Constants.PAD,
        Constants.UNK_WORD: Constants.UNK,
        Constants.MSK_WORD: Constants.MSK}

    word_count = {w: 0 for w in full_vocab}

    for sent in word_insts:
        for word in sent:
            word_count[word] += 1
    

    ignored_word_count = 0
    for word, count in word_count.items():
        if word not in word2idx:
            if count > min_word_count:
                word2idx[word] = len(word2idx)
            else:
                ignored_word_count += 1
    
    print('[Info] Trimmed vocabulary size = {},'.format(len(word2idx)),
          'each with minimum occurrence = {}'.format(min_word_count))
    print("[Info] Ignored word count = {}".format(ignored_word_count))
    return word2idx

def convert_instance_to_idx_seq(word_insts, word2idx):
    ''' Mapping words to idx sequence. '''
    return [[word2idx.get(w, Constants.UNK) for w in s] for s in word_insts]

def main():
    ''' Main function '''

    parser = argparse.ArgumentParser()
    parser.add_argument('-train_src', required=True)      
    parser.add_argument('-train_tgt', required=True)

    parser.add_argument('-valid_src', required=True)    
    parser.add_argument('-valid_tgt', required=True)

    parser.add_argument('-graph_info', type=str, required=True)
    
    parser.add_argument('-save_data', required=True)
    parser.add_argument('-max_word_seq_len', type=int, default=50)
    parser.add_argument('-min_word_count', type=int, default=5)
    parser.add_argument('-keep_case', action='store_true') # 默认
    parser.add_argument('-share_vocab', action='store_true')
    parser.add_argument('-vocab', default=None) # 默认

    
    opt = parser.parse_args()
    opt.max_token_seq_len = opt.max_word_seq_len + 2 # include the <s> and </s>
    graphinfo = torch.load(opt.graph_info)
    train_nodes_pres = graphinfo['train_nodes_pres']
    train_nodes_posts = graphinfo['train_nodes_posts']
    valid_nodes_pres = graphinfo['valid_nodes_pres']
    valid_nodes_posts = graphinfo['valid_nodes_posts']
    test_nodes_pres = graphinfo['test_nodes_pres']
    test_nodes_posts = graphinfo['test_nodes_posts']
    allpairs = graphinfo['allpairs']







    # Training set
    train_src_word_insts = read_instances_from_file(
        opt.train_src, opt.max_word_seq_len, opt.keep_case)
    train_tgt_word_insts = read_instances_from_file(
        opt.train_tgt, opt.max_word_seq_len, opt.keep_case)
    

    if len(train_src_word_insts) != len(train_tgt_word_insts):
        print('[Warning] The training instance count is not equal.')
        min_inst_count = min(len(train_src_word_insts), len(train_tgt_word_insts))
        train_src_word_insts = train_src_word_insts[:min_inst_count]
        train_tgt_word_insts = train_tgt_word_insts[:min_inst_count]

    # #- Remove empty instances
    # train_src_word_insts, train_tgt_word_insts = list(zip(*[
    #     (s, t) for s, t in zip(train_src_word_insts, train_tgt_word_insts) if s and t]))
    
    

    # Validation set
    valid_src_word_insts = read_instances_from_file(
        opt.valid_src, opt.max_word_seq_len, opt.keep_case)
    valid_tgt_word_insts = read_instances_from_file(
        opt.valid_tgt, opt.max_word_seq_len, opt.keep_case)

    if len(valid_src_word_insts) != len(valid_tgt_word_insts):
        print('[Warning] The validation instance count is not equal.')
        min_inst_count = min(len(valid_src_word_insts), len(valid_tgt_word_insts))
        valid_src_word_insts = valid_src_word_insts[:min_inst_count]
        valid_tgt_word_insts = valid_tgt_word_insts[:min_inst_count]
    

    



    # #- Remove empty instances
    # valid_src_word_insts, valid_tgt_word_insts = list(zip(*[
    #     (s, t) for s, t in zip(valid_src_word_insts, valid_tgt_word_insts) if s and t]))

    # Build vocabulary
    if opt.vocab:
        
        print("$"*100)
        predefined_data = torch.load(opt.vocab)
        assert 'dict' in predefined_data

        print('[Info] Pre-defined vocabulary found.')
        src_word2idx = predefined_data['dict']['src']
        tgt_word2idx = predefined_data['dict']['tgt']

        
        # ipdb.set_trace()
    else:
        print("%"*100)
        if opt.share_vocab:
            print('[Info] Build shared vocabulary for source and target.')
            
            word2idx = build_vocab_idx(
                train_src_word_insts + train_tgt_word_insts, opt.min_word_count)
            # namesfromparser = pickle.load(open('graph_preprocess/parsenames.pkl','rb'))
            namesfromparser = returnelements(allpairs)
            for name in namesfromparser:
                if name not in word2idx.keys():
                    word2idx[name]=word2idx[list(word2idx.keys())[-1]]+1
            src_word2idx = tgt_word2idx = word2idx
        else:
            print('[Info] Build vocabulary for source.')
            src_word2idx = build_vocab_idx(train_src_word_insts, opt.min_word_count)
            print('[Info] Build vocabulary for target.')
            tgt_word2idx = build_vocab_idx(train_tgt_word_insts, opt.min_word_count)
    
    # build global graph
    allpairs = [(src_word2idx[p[0]], src_word2idx[p[1]]) for p in allpairs]
    G = nx.Graph()    
    G.add_edges_from(allpairs)

    # compute graph diff node
    train_graph_diffs = []
    for i in range(len(train_nodes_pres)):
        _union = list(set(train_nodes_pres[i]).union(set(train_nodes_posts[i])))
        _intersection = list(set(train_nodes_pres[i]).intersection(set(train_nodes_posts[i])))
        _graphdiff = list(set(_union).difference(set(_intersection)))
        train_graph_diffs.append(_graphdiff)
    valid_graph_diffs = []
    for i in range(len(valid_nodes_pres)):
        _union = list(set(valid_nodes_pres[i]).union(set(valid_nodes_posts[i])))
        _intersection = list(set(valid_nodes_pres[i]).intersection(set(valid_nodes_posts[i])))
        _graphdiff = list(set(_union).difference(set(_intersection)))
        valid_graph_diffs.append(_graphdiff)
    
    # train_graph_diffs = [src_word2idx[i] for l in i for i in train_graph_diffs]
    tgd = []
    for line in train_graph_diffs:
        _list = []
        if line ==[]:
            tgd.append([src_word2idx[Constants.UNK_WORD]])
        else:
            for l in line:
                _list.append(src_word2idx[l])
            tgd.append(_list)
    
    train_graph_diffs = tgd

    vgd = []
    for line in valid_graph_diffs:
        _list = []
        if line ==[]:
            vgd.append([src_word2idx[Constants.UNK_WORD]])
        else:
            for l in line:
                _list.append(src_word2idx[l])
            vgd.append(_list)
    
    valid_graph_diffs = vgd


    # word to index
    print('[Info] Convert source word instances into sequences of word index.')
    train_src_insts = convert_instance_to_idx_seq(train_src_word_insts, src_word2idx)
    valid_src_insts = convert_instance_to_idx_seq(valid_src_word_insts, src_word2idx)

    

    print('[Info] Convert target word instances into sequences of word index.')
    train_tgt_insts = convert_instance_to_idx_seq(train_tgt_word_insts, tgt_word2idx)
    valid_tgt_insts = convert_instance_to_idx_seq(valid_tgt_word_insts, tgt_word2idx)
    
    data = {
        'settings': opt,
        'dict': {
            'src': src_word2idx,
            'tgt': tgt_word2idx},
        'train': {
            'src': train_src_insts,
            'graph': G,
            'namepre': train_nodes_pres,
            'namepost': train_nodes_posts,
            'graphdiff': train_graph_diffs,
            'tgt': train_tgt_insts},
        'valid': {
            'src': valid_src_insts,
            'graph': G,
            'namepre': valid_nodes_pres,
            'namepost': valid_nodes_posts,
            'graphdiff': valid_graph_diffs,
            'tgt': valid_tgt_insts}}

    print('[Info] Dumping the processed data to pickle file', opt.save_data)
    torch.save(data, opt.save_data)
    
    print('[Info] Finish.')

    a = torch.load(opt.save_data)

if __name__ == '__main__':
    main()
