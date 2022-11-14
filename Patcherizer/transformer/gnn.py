import torch.nn as nn
import torch.nn.functional as F

import math
import numpy as np
import scipy.sparse as sp

import torch

from torch.nn.parameter import Parameter
from torch.nn.modules.module import Module
import ipdb

def sparse_mx_to_torch_sparse_tensor(sparse_mx):
    """Convert a scipy sparse matrix to a torch sparse tensor."""
    sparse_mx = sparse_mx.tocoo().astype(np.float32)
    indices = torch.from_numpy(
        np.vstack((sparse_mx.row, sparse_mx.col)).astype(np.int64))
    values = torch.from_numpy(sparse_mx.data)
    shape = torch.Size(sparse_mx.shape)
    return torch.sparse.FloatTensor(indices, values, shape)

def normalize(mx):
    """Row-normalize sparse matrix"""
    rowsum = np.array(mx.sum(1))
    r_inv = np.power(rowsum, -1).flatten()
    r_inv[np.isinf(r_inv)] = 0.
    r_mat_inv = sp.diags(r_inv)
    mx = r_mat_inv.dot(mx)
    return mx


class GraphConvolution(Module):
    """
    Simple GCN layer, similar to https://arxiv.org/abs/1609.02907
    """

    def __init__(self, in_features, out_features, bias=True):
        super(GraphConvolution, self).__init__()
        self.in_features = in_features
        self.out_features = out_features
        self.weight = Parameter(torch.FloatTensor(in_features, out_features))
        if bias:
            self.bias = Parameter(torch.FloatTensor(out_features))
        else:
            self.register_parameter('bias', None)
        self.reset_parameters()

    def reset_parameters(self):
        stdv = 1. / math.sqrt(self.weight.size(1))
        self.weight.data.uniform_(-stdv, stdv)
        if self.bias is not None:
            self.bias.data.uniform_(-stdv, stdv)

    def forward(self, input, adj):
        support = torch.mm(input, self.weight)
        output = torch.spmm(adj, support)
        if self.bias is not None:
            return output + self.bias
        else:
            return output

    def __repr__(self):
        return self.__class__.__name__ + ' (' \
               + str(self.in_features) + ' -> ' \
               + str(self.out_features) + ')'

class CombinationLayer(nn.Module):
    def forward(self, query, key, value, dropout=None):
        query_key = query * key / math.sqrt(query.size(-1))
        query_value = query * value / math.sqrt(query.size(-1))
        tmpW = torch.stack([query_key, query_value], -1)
        tmpsum = torch.softmax(tmpW, dim=-1)
        tmpV = torch.stack([key, value], dim=-1)
        tmpsum = tmpsum * tmpV
        tmpsum = torch.squeeze(torch.sum(tmpsum, dim=-1), -1)  
        if dropout:
            tmpsum = dropout(tmpsum)
        return tmpsum
        
class Combination(nn.Module):

    def __init__(self, h, d_model, dropout_rate=0.1):
        super().__init__()
        
        assert d_model % h == 0

        self.d_k = d_model // h
        self.h = h

        self.linear_layers = nn.ModuleList([nn.Linear(d_model, d_model) for _ in range(3)])
        self.output_linear = nn.Linear(d_model, d_model)
        self.combination = CombinationLayer()

        self.dropout = nn.Dropout(p=dropout_rate)
        self.layernorm = nn.LayerNorm(d_model)

    def forward(self, query, key, value, mask=None):
        old_query = query

        batch_size = query.size(0)

        query, key, value = [l(x).view(batch_size, -1, self.h, self.d_k).transpose(1, 2)
                             for l, x in zip(self.linear_layers, (query, key, value))]

        x = self.combination(query, key, value, dropout=self.dropout)

        x = x.transpose(1, 2).contiguous().view(batch_size, -1, self.h * self.d_k)
        output = self.output_linear(x)
        
        return self.layernorm(self.dropout(output) + old_query)

class GCN(nn.Module):
    def __init__(self, nfeat, dropout_rate):
        super(GCN, self).__init__()

        self.gc1 = GraphConvolution(nfeat, nfeat)
        self.gc2 = GraphConvolution(nfeat, nfeat)
        self.fc1 = nn.Linear(nfeat, nfeat)
        self.dropout = nn.Dropout(dropout_rate)
        self.tgt_word_prj = nn.Linear(nfeat, nfeat, bias=False)
        nn.init.xavier_normal_(self.tgt_word_prj.weight)
        self.layernorm = nn.LayerNorm(nfeat)

    def forward(self, x, adj, input_em):
        input_em = self.fc1(input_em)
        x1 = F.relu(self.gc1(x, adj))
        x1 = F.dropout(x1)#, self.dropout_rate)#, training=self.training)
        x1 = self.gc2(x1, adj)

        x1 = self.tgt_word_prj(x1)
        x1 = self.layernorm(self.dropout(x1) + x+input_em)
        
        return F.log_softmax(x1, dim=1)
