import torch
vocab = torch.load('../exp/exp/vocab/vocab')
prevocab = torch.load('../exp/exp/vocab/pretrain_vocab')

print(vocab['settings'], '\n', prevocab['settings'])

print(vocab['dict']['src']==prevocab['dict']['src'])
print(vocab['dict']['tgt']==prevocab['dict']['tgt'])

