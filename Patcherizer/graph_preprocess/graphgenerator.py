import javalang
import torch
import ipdb
import re
import numpy as np
import matplotlib.colors as mcolors
from pylab import rcParams
import argparse
from networkx import nx_agraph
import networkx as nx
import matplotlib.pyplot as plt
import pickle

import sys
sys.path.append("..")
import transformer.Constants as Constants
plt.figure(figsize=(20, 20), dpi=80)

def file2str(txtfile):
    file = open(txtfile, 'r')
    lines = file.readlines()
    lines = [line.replace('\n', '') for line in lines]
    _str = ''.join(lines)
    return _str
def pos_find(parserstr):
    sub1 = '\('
    sub2 = '\)'
    pos1 = [substr.start() for substr in re.finditer(sub1 , parserstr)]
    pos2 = [substr.start() for substr in re.finditer(sub2 , parserstr)]
    total_pos = sorted(pos1+pos2)
    return (pos1, pos2, total_pos)
def parser2pairs(a, pos1, pos2, total_pos):
    parent_list = ['root']
    # parent_child_pairs = []
    str_parent_child_pairs=[]
    for i in total_pos:    
        if i in pos1:        
            #parent_child_pairs.append((parent_list[-1], i))
            idx = total_pos.index(i)
            nodes_str = ''
            if idx==0:
                str_parent_child_pairs.append((parent_list[-1],a[:i]))
                parent_list.append(a[:i])
            else:
                nodes_str = a[total_pos[idx-1]+1:total_pos[idx]]
            # print(nodes_str,i,idx)
            if len(nodes_str)==0:
                # parent_list.append()
                continue
                
            else:
                _list = nodes_str.split(',')
                if _list[0]=='':
                    _list.remove('')
                for j in range(len(_list)):
                    _list[j]=_list[j].replace(' ','')
                    if _list[j].endswith('='):
                        _list[j]= _list[j][0:len(_list[j])-1]
                        #_list[i]=_list[i].strip()

                if len(_list)==1:
                    if '=' not in _list[0]:
                        str_parent_child_pairs.append((parent_list[-1], _list[0]))
                        
                        parent_list.append(_list[0])
                        # print('list', _list[0])
                    else:
                        idxx = _list[0].index('=')
                        # print(_list[0][0:idxx], _list[0][idxx+1:])
                        str_parent_child_pairs.append((parent_list[-1], _list[0][0:idxx]))
                        str_parent_child_pairs.append((_list[0][0:idxx], _list[0][idxx+1:]))
                        parent_list.append(_list[0][idxx+1:])
                        # print('listidxx', _list[0][idxx+1:])
                else:
                    for j in range(len(_list)):
                        if j<len(_list)-1:
                            if '=' not in _list[j]:
                                str_parent_child_pairs.append((parent_list[-1], _list[j]))
                            else:
                                idxx = _list[j].index('=')
                                str_parent_child_pairs.append((parent_list[-1], _list[j][0:idxx]))
                                str_parent_child_pairs.append((_list[j][0:idxx], _list[j][idxx+1:]))
                        else:
                            if '=' not in _list[j]:
                                str_parent_child_pairs.append((parent_list[-1], _list[j]))
                                parent_list.append(_list[j])
                            else:
                                idxx = _list[j].index('=')
                                str_parent_child_pairs.append((parent_list[-1], _list[j][0:idxx]))
                                str_parent_child_pairs.append((_list[j][0:idxx], _list[j][idxx+1:]))
                                parent_list.append(_list[j][idxx+1:])
        else:
            parent_list.pop()
    return str_parent_child_pairs

def graph_draw(str_parent_child_pairs, savefile, layout='spring_layout'):
    # G = nx.OrderedDiGraph()
    G = nx.Graph()
    
    G.add_edges_from(str_parent_child_pairs)
    # nx.spring_layout(G)
    pos = nx.spring_layout(G)
    if layout=='spring_layout':
        pos = nx.spring_layout(G)
    if layout=='kamada_kawai_layout':
        pos = nx.kamada_kawai_layout(G)
    
    nx.draw(G, pos, with_labels=True, node_size=1000, node_color="lightgray")

    # draw_clu(G, pos, nx.core_number(G),'k-Core')
    # draw(G, pos, nx.degree_centrality(G),'k-Core')
    plt.savefig(savefile, dpi=80)


def draw(G, pos, measures, measure_name):
    nodes = nx.draw_networkx_nodes(G, pos, node_size=400, cmap=plt.cm.plasma, 
                                   node_color=list(measures.values()),
                                   nodelist=list(measures.keys())) 
    nodes.set_norm(mcolors.SymLogNorm(linthresh=0.03, linscale=1))
    labels = nx.draw_networkx_labels(G, pos, font_color='white')
    edges = nx.draw_networkx_edges(G, pos)
    plt.title(measure_name,size=18)
    cbar = plt.colorbar(nodes)
    cbar.set_label('weight of central nodes', rotation=0)
    plt.axis('off')
    plt.show()
    pass


def draw_clu(G, pos, measures, measure_name):
    # measures = nx.core_number(G) 

    clusters=np.array(list(set(measures.values())))
    plt.figure()
    nodes = nx.draw_networkx_nodes(G, pos, node_size=250, cmap=mcolors.ListedColormap(plt.cm.Set3(clusters)), 
                                   node_color=np.array(list(measures.values()))-1,
                                   nodelist=list(measures.keys()))
    print(measures.values())
    print(measures.keys())
    labels = nx.draw_networkx_labels(G, pos)
    edges = nx.draw_networkx_edges(G, pos)
    plt.title(measure_name)
    rcParams['figure.figsize'] = 12, 8
    rcParams['font.sans-serif'] = ['SimHei']
    cb = plt.colorbar(nodes,ticks=range(0,len(clusters)), label='labels for sub-group')
    cb.ax.tick_params(length=0)
    cb.set_ticklabels(list(set(measures.values())))
    nodes.set_clim(-0.5, len(clusters)-0.5)
    plt.axis('off')
    plt.show()

def NoneRemove(str_parent_child_pairs):
    str_parent_child_pairs=[l for l in str_parent_child_pairs if 'None' not in l]
    return str_parent_child_pairs

def returnelements(str_parent_child_pairs):
    elements = []
    for p in str_parent_child_pairs:
        elements.append(p[0])
        elements.append(p[1])
    return list(set(elements))

def main():
    ''' Main function '''
    parser = argparse.ArgumentParser()
    parser.add_argument('-javafile', type = str, default = None)
    parser.add_argument('-savepair', type=str, default='./')
    
    args = parser.parse_args()

    _filelist = ['train.pre.patch.java','train.post.patch.java','valid.pre.patch.java','valid.post.patch.java','test.pre.patch.java','test.post.patch.java']
    allnames = []
    for item in _filelist:
        filepath = args.javafile+item
        files = open(filepath,'r')
        readfiles = files.readlines()
        i = 1
        for source_code in readfiles:
            source_code =source_code.replace('\n','')
            print(i, filepath)
            a = str(javalang.parse.parse(source_code))
            a = a.replace('[','(').replace(']',')').replace('{','(').replace('}',')')
            pos1, pos2, total_pos = pos_find(a)
            str_parent_child_pairs = parser2pairs(a, pos1, pos2, total_pos)
            str_parent_child_pairs = NoneRemove(str_parent_child_pairs)

            elements = returnelements(str_parent_child_pairs)
            allnames = allnames+elements
            i +=1
    allnames = list(set(allnames))

    vocab = torch.load('../exp/exp_data_gcn/vocab/vocab')
    vocab['dict']['src']
    try:
        with open(args.savepair, 'wb') as f:
            pickle.dump(allnames,f)
    except IOError:
        print('savepair is missing')

if __name__=='__main__':
    main()