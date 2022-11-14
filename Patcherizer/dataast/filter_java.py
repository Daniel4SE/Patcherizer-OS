import ipdb
import numpy as np
_train_difffile = 'cleaned.train.diff'
_valid_difffile = 'cleaned.valid.diff'
_test_difffile = 'cleaned.test.diff'

train_diff = open(_train_difffile,'r')
train_diff_rds = train_diff.readlines()
train_diff.close()

train_diff = []
for i in range(len(train_diff_rds)):
    train_diff.append(train_diff_rds[i].replace('\n',' '))

valid_diff = open(_valid_difffile,'r')
valid_diff_rds = valid_diff.readlines()
valid_diff.close()

valid_diff = []
for i in range(len(valid_diff_rds)):
    valid_diff.append(valid_diff_rds[i].replace('\n',' '))


test_diff = open(_test_difffile,'r')
test_diff_rds = test_diff.readlines()
test_diff.close()

test_diff = []
for i in range(len(test_diff_rds)):
    test_diff.append(test_diff_rds[i].replace('\n',' '))




### write beforepatch.java and afterpatch.java
_train_before_patch = 'train.pre.patch.java'
_train_after_patch = 'train.post.patch.java'
_valid_before_patch = 'valid.pre.patch.java'
_valid_after_patch = 'valid.post.patch.java'
_test_before_patch = 'test.pre.patch.java'
_test_after_patch = 'test.post.patch.java'


train_before_patch_list = []
train_after_patch_list = []
for i in range(len(train_diff)):
    train_before_patch_item =[]
    train_after_patch_item =[]
    if i%1000 ==0:
        print('\n', i)
    tdr = train_diff[i].split('<nl>')
    
    for l in tdr:
        if l.startswith(' -'):
            train_before_patch_item.append(l.replace(' -', ''))
        elif l.startswith(' +'):
            train_after_patch_item.append(l.replace(' +', ''))
        else:
            train_before_patch_item.append(l)
            train_after_patch_item.append(l)
    train_before_patch_list.append(' '.join(train_before_patch_item))
    train_after_patch_list.append(' '.join(train_after_patch_item))


valid_before_patch_list = []
valid_after_patch_list = []
for i in range(len(valid_diff)):
    valid_before_patch_item =[]
    valid_after_patch_item =[]
    if i%1000 ==0:
        print('\n', i)
    tdr = valid_diff[i].split('<nl>')
    
    for l in tdr:
        if l.startswith(' -'):
            valid_before_patch_item.append(l.replace(' -', ''))
        elif l.startswith(' +'):
            valid_after_patch_item.append(l.replace(' +', ''))
        else:
            valid_before_patch_item.append(l)
            valid_after_patch_item.append(l)
    valid_before_patch_list.append(' '.join(valid_before_patch_item))
    valid_after_patch_list.append(' '.join(valid_after_patch_item))

test_before_patch_list = []
test_after_patch_list = []
for i in range(len(test_diff)):
    test_before_patch_item =[]
    test_after_patch_item =[]
    if i%1000 ==0:
        print('\n', i)
    tdr = test_diff[i].split('<nl>')
    
    for l in tdr:
        if l.startswith(' -'):
            test_before_patch_item.append(l.replace(' -', ''))
        elif l.startswith(' +'):
            test_after_patch_item.append(l.replace(' +', ''))
        else:
            test_before_patch_item.append(l)
            test_after_patch_item.append(l)
    test_before_patch_list.append(' '.join(test_before_patch_item))
    test_after_patch_list.append(' '.join(test_after_patch_item))

# with open(_train_before_patch, 'w') as f:
#     for d in train_before_patch_list:
#         f.write(d)
#         f.write('\n')
with open(_train_after_patch, 'w') as f:
    for d in train_after_patch_list:
        f.write(d)
        f.write('\n')

# with open(_valid_before_patch, 'w') as f:
#     for d in valid_before_patch_list:
#         f.write(d)
#         f.write('\n')
with open(_valid_after_patch, 'w') as f:
    for d in valid_after_patch_list:
        f.write(d)
        f.write('\n')

# with open(_test_before_patch, 'w') as f:
#     for d in test_before_patch_list:
#         f.write(d)
#         f.write('\n')
with open(_test_after_patch, 'w') as f:
    for d in test_after_patch_list:
        f.write(d)
        f.write('\n')