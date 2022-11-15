from sklearn.feature_extraction.text import CountVectorizer
from sentence_transformers import SentenceTransformer
from sklearn.metrics.pairwise import cosine_similarity
import ipdb
import torch
model  =SentenceTransformer('sentence-transformers/bert-base-nli-mean-tokens')

patchfile =open('quatrain_1/patch.txt','r')
patches =patchfile.readlines()
patchfile.close()

patch_bert_emb = model.encode(patches)
# patch_bert_emb = patch_bert_emb[:,:100]

torch.save(patch_bert_emb,'patch_bert.h5')
ipdb.set_trace()