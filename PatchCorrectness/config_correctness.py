import pickle
import os
dirname = os.path.dirname(__file__)

class Config:
    def __init__(self):
        # # original dataset with patches text and commit messages text.
        # self.path_patch = '/Users/haoye.tian/Documents/ASE2022withTextUnique'
        # the feature from Tian et al.'s ASE2020 paper.
        self.path_ASE2020_feature = '/Users/haoye.tian/Documents/University/data/ASE_features2_bert.pickle'