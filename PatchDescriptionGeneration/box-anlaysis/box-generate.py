import pandas as pd
import matplotlib.pyplot as plt
import torch
import ipdb

# patcherizer_diffSEQ=[0.625, 1.0, 0.0, 1.0, 0.2, 0.0, 0.0, 0.0, 0.25, 1.0, 0.0, 0.5, 0.2, 0.5714, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 1.0, 0.0, 0.1429, 0.0, 0.0, 0.0, 0.0, 0.1667, 0.5, 0.0, 0.0, 0.2, 0.0, 0.6667, 0.0, 0.0, 0.0, 0.0, 0.25, 0.0, 0.0, 1.0, 0.5, 0.0, 0.0, 0.125, 0.5, 0.5, 0.0, 0.25, 0.25, 1.0, 0.6, 1.0, 0.0, 0.0, 0.2857, 0.0, 0.0, 0.0, 0.0476, 1.0, 0.0, 0.6, 0.0, 0.0, 0.0, 0.0, 0.0, 0.3333, 0.0, 0.0833, 0.0, 0.0, 0.1111, 0.3333, 0.5, 0.5, 0.1111, 0.8571, 0.3333, 0.2, 0.3333, 0.0, 0.0, 1.0, 1.0, 0.8, 0.5, 1.0, 0.0, 0.3333, 1.0, 0.0, 0.5, 0.0, 0.0, 0.8889, 0.0, 0.3333, 0.5, 0.0, 0.2, 0.0, 0.0909, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.125, 0.0, 0.5, 0.6667, 0.3, 0.1, 0.0, 0.1429, 0.0, 0.25, 0.1667, 0.0769, 0.5, 0.0, 0.3333, 0.0, 0.0, 0.1429, 0.0, 0.0, 0.0, 0.0, 1.0, 0.25, 0.0, 0.0, 0.0, 0.0, 0.2, 0.25, 0.0, 0.0, 0.6667, 0.0, 0.1, 0.2, 0.0, 0.0, 0.0, 0.5, 0.0, 0.2857, 0.0, 0.3333, 0.0, 0.1111, 1.0, 0.0, 0.3333, 0.0, 0.0, 0.5, 0.1667, 0.3333, 0.25, 0.0, 0.0, 0.25, 1.0, 0.1429, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.1, 0.8333, 0.5, 0.0, 1.0, 0.1429, 0.0, 0.3333, 0.0, 0.25, 1.0, 0.2, 0.125, 0.6667, 0.0, 0.0, 0.0, 0.0, 0.3333]
NMT = [0.4615, 0.75, 0.0, 1.0, 0.1667, 0.0, 0.1, 0.25, 0.0, 1.0, 0.2, 0.0, 0.0, 0.2, 0.0, 0.2, 0.0, 0.2, 0.0, 0.2, 0.9, 0.0, 0.1429, 0.0, 0.3333, 0.0, 0.0, 0.0, 0.2222, 0.0, 0.1111, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.875, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.2, 0.0, 0.2, 0.7143, 0.0, 0.6667, 0.2, 0.1429, 0.3333, 0.2, 0.0, 0.1667, 0.0, 0.5, 0.0, 0.0, 0.0, 0.6, 0.0, 0.0, 0.0, 0.0, 0.0, 0.2, 0.0, 0.0, 0.0, 0.3333, 0.2, 0.0, 0.0, 0.5556, 0.2, 0.0, 0.0, 0.1111, 0.0, 0.8, 0.5, 0.0, 0.0, 0.0, 0.1667, 0.0, 0.6667, 0.0, 0.1667, 0.1667, 0.0, 0.8571, 0.0, 0.0, 0.0, 0.0, 0.0, 0.2857, 0.0, 0.3333, 0.0, 0.2, 0.2, 0.8333, 0.1111, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.2222, 0.25, 0.2, 0.2222, 0.0, 0.0, 0.0, 0.2857, 1.0, 0.0, 0.2, 0.2, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.3333, 0.25, 0.3333, 0.0, 0.0, 0.0, 0.0, 0.3333, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.1429, 0.0, 0.0, 0.1, 0.125, 0.5, 0.125, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.375, 0.75, 0.0, 0.0, 0.0, 0.2, 0.0, 0.125, 0.0, 0.1, 0.7778, 0.2, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]
CoDiSum = [0.0, 0.3333, 0.0, 0.4, 0.0, 0.0, 0.5, 0.0, 0.0, 0.0, 0.25, 0.5, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.1667, 0.0, 0.0, 0.0, 0.0, 0.25, 0.0, 0.0, 0.3333, 0.2, 0.0, 0.0, 0.0, 0.0, 0.5, 0.3333, 0.0, 0.0, 0.25, 0.0, 0.3333, 0.0, 0.25, 0.25, 0.2222, 0.0, 0.0, 0.0, 0.0, 0.3333, 0.0, 0.0, 0.0, 0.25, 0.6667, 0.3333, 0.0, 0.0, 0.25, 0.25, 0.25, 0.0, 0.1, 0.25, 0.0, 0.5, 0.3333, 0.0, 0.0, 0.1429, 0.0, 0.6667, 0.0, 0.5, 0.0, 0.0, 0.25, 0.0, 0.25, 0.25, 0.0, 0.0, 0.6667, 0.0, 0.3333, 0.0, 0.5, 0.0, 0.0, 0.0, 0.6667, 1.0, 0.0, 0.0, 0.1, 0.25, 0.25, 0.2, 0.0, 0.2, 0.0, 0.0, 0.5, 0.0, 0.0, 0.25, 0.1, 0.3333, 0.0, 0.6667, 0.0, 0.0, 0.0, 0.2, 0.6667, 0.5, 0.0, 0.0, 0.5, 0.5556, 0.0, 0.2, 0.25, 0.0, 0.25, 0.3333, 0.3333, 0.0, 0.0, 0.5, 0.6667, 0.0, 0.0, 0.0, 0.0, 0.0, 0.25, 0.0, 0.0, 0.2222, 0.0, 0.0, 0.25, 0.25, 0.0, 0.0, 0.0, 0.25, 0.25, 0.25, 0.0, 0.1667, 0.25, 0.0, 0.2, 0.3333, 0.3333, 0.3333, 0.0, 0.0, 0.0, 0.25, 0.0, 0.0, 0.0, 0.0, 0.5, 0.3333, 1.0, 0.3333, 0.3333, 0.25, 0.0, 0.0, 0.0, 0.25, 0.0, 0.6667, 0.0, 0.3333, 0.25, 0.0, 0.4, 0.0, 0.0, 0.3333, 0.2, 0.3333, 0.0, 0.3333, 0.0, 0.0, 0.0, 0.6667, 0.0, 0.3333, 0.0, 0.0, 0.6667]
CoreGen = [0, 0.0, 0.2, 0.0, 0.2, 0.0, 0.0, 0.2, 0.0, 0, 0.0, 0.0, 0.0, 0.6667, 0.3333, 0.0909, 0.0, 0.0, 0.0465, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0, 0.3333, 0.0, 0.0, 0.3333, 0.0, 0, 0.0, 0.2, 0.3333, 0, 0.0, 0.0, 0.0, 0, 0.0714, 0, 0.0, 0.0769, 0.0, 0.0, 0.0, 0.0, 0.3333, 0.0, 0.125, 0.25, 0.3333, 0.1111, 0.0, 0.5, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0, 0.0, 0.0, 0.0, 0.0, 0.3333, 0.0, 0.0, 0.0, 0.0, 0.0, 0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0, 0.0, 0.1111, 0.0, 0.0, 0.0, 0.0, 0.0, 0.3333, 0.0, 0, 0, 0.5, 0.0, 0.0465, 0.0, 0.0, 0, 0.0, 0.0, 0.0, 0, 0.2, 0, 0.0, 0, 0.4, 0.25, 0, 0.0, 0.0, 0.0, 0.0, 0, 0.0, 0.1667, 0.2, 0.0, 0.0, 0.0, 0.2, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.1, 0.3333, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.1429, 0.0, 0.2, 0.125, 0.0, 0.0222, 0.2, 0, 0.0, 0.0, 0.0, 0.0, 0.0263, 0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.25, 0.0]
ATOM = [0.0, 0.3333, 0.0, 0.3333, 0.2857, 0.1176, 0.3333, 0.1111, 0.0, 0.0, 0.25, 0.25, 0.2, 0.2, 0.0, 0.6667, 0.0, 0.2857, 0.0, 0.3333, 0.1429, 0.0, 0.0, 0.0, 0.2222, 0.25, 0.0, 0.125, 0.2857, 0.0, 0.0, 0.0, 0.25, 0.6, 0.0, 0.0, 0.0, 0.0, 0.0, 0.25, 0.0, 0.2, 0.0, 0.2857, 0.0, 0.2, 0.875, 0.0, 0.25, 0.0, 0.0, 0.1667, 0.1429, 0.6, 0.25, 0.0, 0.0714, 0.2857, 0.25, 0.25, 0.0, 0.1667, 0.2, 0.0, 0.3333, 0.2, 0.1429, 0.0, 0.0, 0.2857, 0.6667, 0.2, 0.0, 0.3333, 0.0, 0.0, 0.0, 0.0, 0.3333, 0.0, 0.4286, 0.5, 0.0, 0.3333, 0.0909, 0.2, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.2222, 0.25, 0.0, 0.1667, 0.0, 0.0, 0.0, 0.0, 0.4, 0.0, 0.0, 0.0, 0.0909, 0.25, 0.0, 0.3333, 0.1818, 0.0, 0.0, 0.0, 0.3333, 0.0, 0.0, 0.0, 0.0, 0.3636, 0.0, 0.1667, 0.2, 0.0, 0.6, 0.0909, 0.3333, 0.0, 0.3333, 0.0, 0.5, 0.1667, 0.6, 0.0, 0.0, 0.4, 0.3333, 0.0, 0.0, 0.0833, 0.0, 0.0, 0.3333, 0.0, 0.0, 0.0, 0.0, 0.2, 0.125, 0.3333, 0.25, 0.3333, 0.3333, 0.0, 0.0, 0.5714, 0.2, 0.6667, 0.0, 0.125, 0.0, 0.3333, 0.0, 0.0, 0.0, 0.0, 0.1429, 0.0, 1.0, 0.3333, 0.1667, 0.0, 0.0, 0.25, 0.0, 0.0, 0.0, 0.3333, 0.0909, 0.3333, 0.0, 0.0, 0.6, 0.0, 0.0, 0.0, 0.1, 0.25, 0.0, 0.3333, 0.0, 0.0, 0.0, 0.6667, 0.0, 0.25, 0.1667, 0.25, 0.3333]
FIRA = [0.4, 0.3333, 0.0, 0.5, 0.2, 0.1429, 0.8, 0.0, 0.0, 0.1429, 0.3333, 0.5, 0.0, 0.0, 0.0, 0.3333, 0.0, 0.2, 0.0, 0.3333, 0.0, 0.0, 0.0, 0.0, 0.1429, 0.25, 0.0, 0.0, 0.2, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.5, 0.25, 0.0, 0.0, 0.2, 0.0, 0.0, 0.6, 0.0, 0.3333, 0.0, 0.0, 0.3333, 0.0, 0.0, 0.0, 0.0, 0.6667, 0.3333, 0.3333, 0.125, 0.2, 0.25, 0.3333, 0.0, 0.0, 0.25, 0.0, 0.3333, 0.3333, 0.0, 0.0, 0.375, 0.0, 0.6667, 0.0, 0.4, 0.0, 0.0, 0.0, 0.0, 0.2, 0.3333, 0.0, 0.0, 0.6667, 0.0, 0.25, 0.0, 0.5, 0.25, 0.0, 0.3333, 0.6667, 1.0, 0.0, 0.3333, 0.0, 0.25, 0.2, 0.2, 0.0, 0.0, 0.0, 0.2, 0.2727, 0.0, 0.25, 0.1429, 0.1111, 0.3333, 0.0, 0.3333, 0.0, 0.0, 0.0, 0.0, 0.3333, 0.2, 0.0, 0.2, 0.4, 0.5556, 0.0, 0.0, 0.0, 0.25, 0.6667, 0.25, 0.3333, 0.0, 0.0, 0.5, 1.0, 0.0, 0.6667, 0.1429, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0909, 0.0, 0.0, 0.4, 0.25, 0.3333, 0.25, 0.0, 0.25, 0.3333, 0.3333, 0.0, 0.1429, 0.3333, 0.0, 0.2, 0.25, 0.2, 0.3333, 0.0, 0.0, 0.0, 0.25, 0.25, 0.2, 0.0, 0.0, 0.25, 0.0, 1.0, 0.3333, 0.3333, 0.0, 0.3333, 0.5, 0.0, 0.3333, 0.25, 0.3333, 0.0, 0.3333, 0.0, 0.25, 0.4, 0.0, 0.0, 0.0, 0.2, 0.25, 0.0, 0.3333, 0.0, 0.0, 0.1, 1.0, 0.0, 0.3333, 0.0, 0.0, 0.0]
patcherizer = [0.4286, 0.6667, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.5, 0.0, 0.0, 0.625, 0.0, 0.0, 0.0, 0.4286, 0.0, 0.0, 0.25, 0.0, 0.0, 0.0, 0.5, 0.0, 0.0, 0.0, 0.125, 0.0, 0.25, 0.0, 0.0, 0.0, 0.3333, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.875, 0.25, 0.0909, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.75, 0.0, 0.6667, 0.0, 0.0, 0.3333, 0.4286, 0.1818, 0.0, 0.0, 0.5, 0.125, 0.0, 0.0, 0.0625, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.3333, 0.0, 0.6364, 0.1111, 0.0, 0.0, 0.0, 0.0, 0.8182, 0.5, 0.4286, 1.0, 1.0, 0.25, 0.25, 0.7778, 0.0, 0.0, 0.3333, 0.0, 0.875, 0.0, 0.25, 0.0, 0.0, 0.0, 0.0, 0.25, 0.0, 0.0, 0.0909, 0.3333, 0.0, 0.0, 0.0, 0.0, 0.0, 0.25, 0.0, 0.2857, 0.25, 0.0, 0.0, 0.0, 0.0, 0.75, 0.0, 0.0, 0.0, 0.1, 0.3333, 0.3333, 0.0, 0.125, 0.0, 0.0, 0.0, 0.5, 0.25, 0.0, 0.5, 0.0, 0.0, 0.0, 0.125, 0.0, 0.0, 0.0, 0.125, 0.0, 0.3333, 0.0, 0.0, 0.0, 0.3333, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.2, 1.0, 0.0, 0.0, 0.3333, 0.0, 0.0909, 0.0, 0.0, 0.0, 0.6667, 0.0, 0.0, 0.0, 0.6, 0.375, 0.1667, 0.0, 0.0, 0.1, 0.1, 0.0, 0.3333, 0.7778, 0.0, 0.0, 0.0, 0.125, 0.0, 0.0, 0.0, 0.0]
patcherizer = [i for i in patcherizer if i!=0.0]

# patcherizer=[0.625, 1.0, 0.0, 1.0, 0.1, 0.0, 0.0, 0.0, 0.5, 1.0, 0.25, 0.25, 0.2, 0.4286, 0.25, 0.0, 0.0, 0.2727, 0.0, 0.0, 0.2, 0.0, 0.0, 0.1429, 0.2, 0.0, 0.0, 0.1667, 0.0, 0.5, 0.0, 0.0, 0.2, 0.0, 0.6667, 0.25, 0.0, 0.0769, 0.0, 0.25, 0.0, 0.1667, 1.0, 0.1667, 0.125, 0.0, 0.0, 0.5, 0.0, 0.0, 0.0, 0.25, 1.0, 0.0, 1.0, 0.0, 0.0, 0.1429, 0.25, 0.25, 0.0, 0.0476, 1.0, 0.0, 0.2, 0.0, 0.125, 0.0, 0.0, 0.0, 0.3333, 0.0, 0.0833, 0.0, 0.0, 0.1111, 0.3333, 0.0, 1.0, 0.0, 0.8571, 0.6667, 0.0, 0.0, 0.0, 0.0, 1.0, 1.0, 0.8, 1.0, 1.0, 0.0, 0.0, 1.0, 0.0, 0.25, 0.0, 0.0, 0.8889, 0.0, 0.3333, 0.1667, 0.0, 0.0, 0.0, 0.0909, 0.0, 0.0, 0.25, 0.0526, 0.0, 0.0, 0.1667, 0.125, 0.0, 0.5, 0.3333, 0.2, 0.2, 0.0, 0.1429, 0.0, 0.0, 0.3333, 0.0, 0.5, 0.0, 0.3333, 0.0, 0.3333, 0.1429, 0.0, 0.0, 0.0, 0.0476, 0.25, 0.5, 0.0, 0.0714, 0.0, 0.0, 0.1, 0.5, 0.0, 0.2, 0.3333, 0.5, 0.0, 0.4, 0.0, 0.0, 0.0, 0.5, 0.0769, 0.1429, 0.0, 0.3333, 0.0, 0.0, 1.0, 0.0833, 0.1667, 0.0, 0.0, 0.5, 0.0, 0.3333, 0.75, 0.0, 0.0, 0.25, 0.0, 0.0, 0.0, 0.0, 0.0, 0.6667, 0.0, 0.0, 0.1, 1.0, 0.6667, 0.2, 1.0, 0.0, 0.3333, 0.3333, 0.0, 0.25, 1.0, 0.2, 0.125, 0.3333, 0.0, 0.0, 0.0, 0.0, 0.3333]
# patcherizer=[i for i in patcherizer if i!=0.0]
# patcherizer=[i for i in patcherizer if i!=1.0]

# patcherizer_retrival =[0.625, 1.0, 0.0, 1.0, 0.3, 0.0769, 0.0909, 0.125, 0.25, 1.0, 0.25, 0.5, 0.4, 0.4286, 0.25, 0.0, 0.1667, 0.1818, 0.1667, 0.1667, 1.0, 1.0, 0.1429, 0.1429, 0.0, 0.25, 0.3333, 0.1667, 0.3333, 0.5, 0.0, 0.3333, 0.4, 0.0, 0.6667, 0.25, 0.2857, 0.0769, 0.0, 0.25, 0.25, 0.5, 1.0, 0.3333, 0.0, 0.4, 0.0, 0.5, 1.0, 0.0, 0.25, 0.25, 1.0, 0.6, 1.0, 0.0, 0.0, 0.4286, 0.0, 0.25, 0.0, 0.0476, 1.0, 0.125, 0.4, 1.0, 0.125, 0.1, 0.0, 0.0833, 1.0, 0.25, 0.1667, 0.5, 0.0, 0.3333, 0.0, 0.0, 1.0, 0.0, 0.8571, 1.0, 0.0, 0.3333, 0.1111, 0.4, 1.0, 1.0, 0.8, 1.0, 1.0, 0.0, 0.3333, 1.0, 0.1667, 0.25, 0.1333, 0.0, 0.8889, 0.1667, 0.1667, 0.5, 0.0, 0.0, 0.1538, 0.0909, 0.6667, 0.2, 0.25, 0.0526, 1.0, 0.125, 0.0, 0.375, 0.25, 0.5, 0.6667, 0.3, 0.6, 0.0, 0.2857, 0.0833, 0.0, 0.3333, 0.0769, 1.0, 0.1667, 0.0, 0.0, 1.0, 0.1429, 0.125, 0.0, 0.0, 0.1429, 1.0, 0.25, 0.5, 0.0714, 0.0, 0.0, 0.2, 0.5, 0.2, 0.2, 1.0, 0.5, 0.05, 0.4, 0.25, 0.0, 0.6667, 1.0, 0.2308, 0.1429, 0.1, 0.6667, 0.3333, 0.0556, 1.0, 0.1667, 0.1667, 0.4, 0.1667, 0.5, 0.3333, 0.3333, 1.0, 0.2857, 0.5, 0.0, 1.0, 0.4286, 0.125, 1.0, 0.3333, 1.0, 0.1429, 0.6667, 0.1, 1.0, 0.1667, 0.2, 1.0, 0.2857, 0.1667, 0.3333, 0.25, 0.75, 1.0, 0.4, 0.0, 0.6667, 0.0, 0.0, 0.0, 0.0, 1.0]
# patcherizer_retrival=[i for i in patcherizer_retrival if i!=0.0]
# patcherizer_retrival=[i for i in patcherizer_retrival if i!=1.0]

# fira = [0.25, 0.5, 0.0, 0.2, 0.2, 0.0769, 0.2727, 0.0, 0.25, 0.1429, 0.25, 0.75, 0.2, 0.1429, 0.25, 0.25, 0.0, 0.0909, 0.0, 0.3333, 0.1, 1.0, 0.0, 0.1429, 0.2, 0.25, 0.0, 0.1667, 0.3333, 0.5, 0.0, 0.0, 0.2, 0.0, 0.3333, 0.25, 0.2857, 0.0769, 0.0, 0.25, 0.125, 0.0, 0.0, 0.5, 0.125, 0.4, 0.0, 0.5, 1.0, 0.0, 0.25, 0.25, 0.0, 0.6, 0.6667, 0.3333, 0.1667, 0.2857, 0.25, 0.25, 0.0, 0.0, 0.4, 0.0, 0.4, 0.5, 0.0, 0.0, 0.5, 0.0, 1.0, 0.5, 0.25, 0.0, 0.0, 0.1111, 0.0, 0.25, 1.0, 0.1111, 0.1429, 0.6667, 0.0, 0.3333, 0.0, 0.4, 0.1, 0.25, 0.4, 1.0, 1.0, 0.0, 0.3333, 0.0, 0.1667, 0.5, 0.0667, 0.0, 0.0, 0.0, 0.3333, 0.6667, 0.0, 0.2, 0.0769, 0.0909, 0.3333, 0.2, 0.5, 0.0, 0.0, 0.0, 0.0, 0.25, 0.5, 0.5, 0.6667, 0.3, 0.6, 0.0, 0.1429, 0.0, 0.25, 0.5, 0.0769, 1.0, 0.0, 0.0, 0.2857, 1.0, 0.1429, 0.125, 0.125, 0.3333, 0.0476, 0.0, 0.25, 0.0, 0.0714, 0.0, 0.0, 0.3, 0.5, 0.6, 0.2, 0.0, 0.5, 0.1, 0.4, 0.25, 0.0769, 0.6667, 0.0, 0.1538, 0.2857, 0.1, 0.6667, 0.3333, 0.0, 0.0, 0.0833, 0.3333, 0.4, 0.0, 0.5, 0.1667, 0.0, 0.75, 0.2857, 0.3333, 0.25, 1.0, 0.2857, 0.0, 0.5, 0.1667, 0.6667, 0.0, 0.6667, 0.1, 0.1667, 0.3333, 0.2, 0.5, 0.1429, 0.3333, 0.3333, 0.0, 0.75, 0.0, 0.4, 0.125, 1.0, 0.0, 0.25, 0.0, 0.0, 0.3333]
# # fira = [i for i in fira if i!=0.0]
# # fira = [i for i in fira if i!=1.0]

# atom = [0.125, 0.5, 0.0, 0.2, 0.4, 0.1538, 0.1818, 0.125, 0.25, 0.0, 0.25, 0.5, 0.4, 0.1429, 0.25, 0.5, 0.0, 0.1818, 0.0, 0.4167, 0.1, 1.0, 0.0, 0.1429, 0.4, 0.25, 0.0, 0.3333, 0.3333, 0.5, 0.0, 0.0, 0.4, 0.6, 0.6667, 0.25, 0.0, 0.0769, 0.0, 0.5, 0.0, 0.5, 0.0, 0.3333, 0.125, 0.2, 1.0, 0.5, 1.0, 0.0, 0.25, 0.5, 0.1429, 0.8, 0.6667, 0.0, 0.1667, 0.2857, 0.5, 0.25, 0.0, 0.1429, 0.4, 0.125, 0.4, 0.5, 0.125, 0.0, 0.0, 0.1667, 1.0, 0.25, 0.0833, 0.5, 0.125, 0.1111, 0.0, 0.0, 1.0, 0.0, 0.8571, 0.6667, 0.0, 0.3333, 0.1111, 0.2, 0.0, 0.25, 0.2, 0.0, 1.0, 0.0, 0.0, 0.3333, 0.1667, 0.0, 0.0667, 0.125, 0.0, 0.0, 0.1667, 0.3333, 0.0, 0.0, 0.0, 0.0909, 0.3333, 0.2, 0.5, 0.1053, 0.0, 0.0, 0.0, 0.375, 0.0, 0.0, 0.0, 0.1, 0.5, 0.0909, 0.2857, 0.0833, 0.0, 0.6667, 0.0769, 1.0, 0.0, 0.3333, 0.0, 0.6667, 0.2857, 0.25, 0.125, 0.0, 0.0952, 0.125, 0.25, 0.0, 0.0714, 0.0, 0.0, 0.3, 0.25, 0.2, 0.0, 0.6667, 0.5, 0.1, 0.4, 0.5, 0.1538, 0.6667, 0.5, 0.0769, 0.7143, 0.2, 1.0, 0.0, 0.1111, 0.25, 0.25, 0.0, 0.0, 0.0, 0.5, 0.1667, 0.0, 0.75, 0.2857, 0.1667, 0.0, 0.5, 0.2857, 0.125, 0.0, 0.3333, 1.0, 0.0714, 0.6667, 0.1, 0.1667, 0.3333, 0.0, 0.0, 0.1429, 0.3333, 0.3333, 0.5, 0.5, 0.0, 0.4, 0.125, 1.0, 0.0, 0.25, 0.1429, 0.1429, 1.0]
# # atom = [i for i in atom if i!=0.0]
# # atom = [i for i in atom if i!=1.0]

# codisum = [0.0, 0.5, 0.0, 0.2, 0.0, 0.0, 0.1818, 0.0, 0.25, 0.0, 0.25, 0.75, 0.2, 0.1429, 0.25, 0.25, 0.0, 0.0, 0.0, 0.1667, 0.1, 1.0, 0.0, 0.1429, 0.2, 0.0, 0.0, 0.5, 0.3333, 0.5, 0.0, 0.0, 0.2, 0.4, 0.6667, 0.25, 0.0, 0.0769, 0.0, 0.5, 0.0, 0.5, 0.125, 0.3333, 0.0, 0.0, 0.0, 0.5, 1.0, 0.0, 0.25, 0.25, 0.1429, 0.6, 0.6667, 0.1667, 0.0, 0.2857, 0.25, 0.25, 0.0, 0.0476, 0.4, 0.0, 0.6, 1.0, 0.0, 0.0, 0.125, 0.0, 1.0, 0.25, 0.25, 0.0, 0.0, 0.2222, 0.0, 0.25, 1.0, 0.0, 0.0, 0.6667, 0.0, 0.3333, 0.0, 0.4, 0.0, 0.25, 0.2, 1.0, 1.0, 0.0, 0.0, 0.1667, 0.1667, 0.5, 0.0667, 0.0, 0.1111, 0.0, 0.1667, 0.5, 0.0, 0.0, 0.0769, 0.0909, 0.3333, 0.2, 0.75, 0.0, 0.0, 0.0, 0.1667, 0.375, 0.75, 0.5, 0.3333, 0.3, 0.6, 0.0, 0.2857, 0.0833, 0.0, 0.3333, 0.0769, 1.0, 0.0, 0.0, 0.2857, 0.6667, 0.0, 0.0, 0.0, 0.0, 0.0476, 0.125, 0.25, 0.0, 0.1429, 0.0, 0.0, 0.2, 0.5, 0.4, 0.0, 0.0, 0.5, 0.05, 0.4, 0.25, 0.0769, 0.6667, 0.5, 0.1538, 0.2857, 0.1, 0.6667, 0.3333, 0.0, 0.0, 0.0833, 0.0, 0.0, 0.0, 0.5, 0.5, 0.3333, 0.75, 0.2857, 0.1667, 0.5, 0.5, 0.0, 0.0, 0.5, 0.1667, 1.0, 0.0, 0.6667, 0.2, 0.0, 0.3333, 0.2, 0.0, 0.2857, 0.3333, 0.3333, 0.0, 0.5, 0.0, 0.4, 0.0, 0.6667, 0.0, 0.25, 0.0, 0.0, 1.0]
# # codisum = [i for i in codisum if i!=0.0]
# # codisum = [i for i in codisum if i!=1.0]

# corec = [0.25, 0.5, 0.0, 0.2, 0.3, 0.1538, 0.0, 0.0, 0.0, 0.0, 0.25, 0.5, 0.4, 0.1429, 0.5, 0.5, 0.1667, 0.1818, 0.0, 0.0833, 0.1, 1.0, 0.0, 0.1429, 0.2, 0.25, 0.3333, 0.5, 0.1667, 0.5, 0.0, 0.0, 0.2, 0.0, 0.6667, 0.25, 0.4286, 0.0769, 0.0, 0.5, 0.125, 0.3333, 0.0, 0.3333, 0.125, 0.4, 0.0, 0.5, 1.0, 0.2, 0.5, 0.25, 0.0, 0.6, 0.6667, 0.0, 0.1667, 0.1429, 0.0, 0.0, 0.0667, 0.0, 0.2, 0.0, 0.4, 1.0, 0.125, 0.0, 0.25, 0.0833, 1.0, 0.5, 0.25, 0.0, 0.0, 0.1111, 0.0, 0.5, 0.5, 0.1111, 0.2857, 0.6667, 0.2, 0.3333, 0.1111, 0.4, 0.0, 0.25, 0.2, 1.0, 1.0, 0.1429, 0.3333, 0.0, 0.0, 0.5, 0.1333, 0.125, 0.2222, 0.0, 0.1667, 0.5, 0.0, 0.2, 0.1538, 0.0, 0.3333, 0.2, 0.75, 0.0, 0.0, 0.125, 0.0, 0.375, 0.25, 0.5, 0.6667, 0.3, 0.4, 0.0, 0.2857, 0.0833, 0.0, 0.1667, 0.0769, 1.0, 0.0, 0.0, 0.2857, 0.6667, 0.2857, 0.25, 0.0, 0.0, 0.0952, 0.125, 0.25, 0.0, 0.1429, 0.0, 0.0, 0.2, 0.25, 0.6, 0.2, 0.3333, 0.5, 0.05, 0.4, 0.25, 0.0769, 0.6667, 0.5, 0.1538, 0.2857, 0.1, 1.0, 0.3333, 0.0556, 0.25, 0.0833, 0.3333, 0.2, 0.0, 0.5, 0.5, 0.3333, 0.75, 0.2857, 0.3333, 0.5, 1.0, 0.1429, 0.125, 0.5, 0.5, 1.0, 0.0, 0.6667, 0.2, 0.1667, 0.3333, 0.2, 0.5, 0.2857, 0.1667, 0.6667, 0.5, 0.5, 0.125, 0.2, 1.0, 1.0, 0.0, 0.25, 0.0, 0.0, 1.0]
# # corec = [i for i in corec if i!=0.0]
# # corec = [i for i in corec if i!=1.0]


# NNgen = [0.625, 1.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.5, 0.2, 0.2857, 0.0, 0.0, 0.0, 0.0909, 0.0, 0.0, 1.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.1667, 0.5, 0.25, 0.3333, 0.0, 0.0, 0.3333, 0.0, 0.0, 0.0, 0.0, 0.25, 0.0, 0.1667, 1.0, 0.1667, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.4, 1.0, 0.0, 0.0, 0.2857, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.4, 0.0, 0.375, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0833, 0.0, 0.0, 0.0, 0.3333, 0.0, 0.5, 0.1111, 0.8571, 0.3333, 0.0, 0.0, 0.0, 0.0, 1.0, 1.0, 0.0, 0.0, 1.0, 0.0, 0.0, 1.0, 0.1667, 0.0, 0.0667, 0.25, 0.8889, 0.0, 0.0, 0.1667, 0.0, 0.0, 0.0, 0.0, 0.3333, 0.0, 0.0, 0.0, 1.0, 0.0, 0.1667, 0.125, 0.25, 0.0, 0.0, 0.2, 0.0, 0.0, 0.0, 0.0833, 0.0, 0.1667, 0.0769, 0.5, 0.0, 0.0, 0.0, 1.0, 0.1429, 0.125, 0.0, 0.0, 0.0, 1.0, 0.25, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.15, 0.2, 0.0, 0.0, 0.0, 0.5, 0.0769, 0.0, 0.1, 0.0, 0.0, 0.0, 1.0, 0.25, 0.0, 0.0, 0.0, 0.0, 0.1667, 0.3333, 0.75, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.2, 1.0, 0.1429, 0.1667, 0.0, 0.0, 0.75, 1.0, 0.2, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]
# # NNgen = [i for i in NNgen if i!=0.0]
# # NNgen = [i for i in NNgen if i!=1.0]

# CC2vec = [0.625, 0.5, 0.0, 1.0, 0.1, 0.0, 0.0, 0.125, 0.0, 0.0, 0.5, 0.25, 0.0, 0.2857, 0.0, 0.0, 0.1667, 0.0, 0.1667, 0.0833, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.1667, 0.5, 0.0, 0.3333, 0.0, 0.0, 0.3333, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.125, 0.2, 0.0, 1.0, 0.5, 0.0, 0.0, 0.0, 1.0, 0.0, 1.0, 0.0, 0.0, 0.2857, 0.0, 0.0, 0.0, 0.0476, 0.0, 0.0, 0.0, 0.0, 0.375, 0.0, 0.0, 0.0833, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.3333, 0.0, 1.0, 0.0, 0.8571, 0.3333, 0.0, 0.0, 0.0, 0.4, 1.0, 1.0, 0.8, 0.0, 1.0, 0.0, 0.0, 1.0, 0.0, 0.25, 0.0667, 0.25, 0.8889, 0.0, 0.3333, 0.0, 0.0, 0.0, 0.0769, 0.0909, 0.3333, 0.0, 0.0, 0.0, 1.0, 0.0, 0.1667, 0.125, 0.25, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.3333, 0.0769, 0.5, 0.1667, 0.0, 0.0, 1.0, 0.1429, 0.125, 0.0, 0.0, 0.0476, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.2, 0.25, 0.4, 0.0, 0.6667, 0.0, 0.15, 0.4, 0.0, 0.0, 0.0, 0.5, 0.0, 0.1429, 0.0, 1.0, 0.0, 0.0556, 1.0, 0.0, 0.1667, 0.0, 0.1667, 1.0, 0.3333, 0.0, 0.75, 0.0, 0.0, 0.0, 0.5, 0.0, 0.125, 0.5, 0.0, 1.0, 0.0, 0.3333, 0.1, 1.0, 0.0, 0.2, 1.0, 0.0, 0.0, 0.0, 0.0, 0.25, 1.0, 0.2, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]
# CC2vec=[i for i in CC2vec if i!=0.0]
# CC2vec=[i for i in CC2vec if i!=1.0]

# print(len(patcherizer),len(patcherizer_retrival), len(NNgen),len(CC2vec), len(codisum), len(fira), len(atom))

minlen = min([len(patcherizer), len(CoDiSum), len(FIRA), len(ATOM), len(CoreGen), len(NMT)])
patcherizer = sorted(patcherizer,reverse=True)[:minlen]
codisum = sorted(CoDiSum, reverse=True)[:minlen]
coregen = sorted(CoreGen, reverse=True)[:minlen]
nmt = sorted(NMT, reverse = True)[:minlen]
atom = sorted(ATOM, reverse=True)[:minlen]
fira = sorted(FIRA, reverse=True)[:minlen]

print(len(patcherizer), len(codisum), len(coregen), len(nmt), len(atom),len(fira))

font1 = {'family':'Nimbus Roman', 'weight': 'bold', 'style': 'normal', 'size': 16}
print(patcherizer)
plt.figure(figsize=(6,7))
# plt.title('Generation-Based models rouge result', fontsize=20)
labels=['NMT', 'CoDiSum', 'ATOM', 'CoreGen','FIRA','Patcherizer']
plt.ylabel('BLEU score', font1)
plt.xlabel(labels, font1)
ax = plt.gca()
# ax.axes.xaxis.set_visible(False)
f =plt.boxplot([nmt, codisum, atom, coregen, fira, patcherizer], labels=labels)

# plt.boxplot([[],[],[],[],[],patcherizer],patch_artist=True, boxprops={'color':'grey','facecolor':'grey'})

# (f['boxes'][5].get_path(), color='grey')

# f['boxes'][5].set_facecolor((1.0, 0.47, 0.42))
# f['boxes'][5].set(facecolor='grey')
plt.xticks(rotation=30)

plt.savefig('box-generate.png')