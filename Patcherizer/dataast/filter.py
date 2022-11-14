import ipdb
import numpy as np

max_sent_len =512
trimmed_sent_count = 0
_train_difffile = 'cleaned.train.diff'
_valid_difffile = 'cleaned.valid.diff'
_test_difffile = 'cleaned.test.diff'

_train_diff_towrite = 'train.diff'
_test_diff_towrite = 'test.diff'
_valid_diff_towrite = 'valid.diff'

train_diff = open(_train_difffile,'r')
train_diff_rds = train_diff.readlines()
train_diff.close()

train_diff = []
print(len(train_diff_rds))
for i in range(len(train_diff_rds)):
    if i %2==0:
        print(i)
        ipdb.set_trace()
        train_diff.append(train_diff_rds[i].replace('\n',' ')+train_diff_rds[i+1].replace('\n', ' '))
    else:
        continue
ipdb.set_trace()
with open(_train_diff_towrite, 'w') as f:
    for d in train_diff:
        f.write(d)
        f.write('\n')

valid_diff = open(_valid_difffile,'r')
valid_diff_rds = valid_diff.readlines()
valid_diff.close()

valid_diff = []
for i in range(len(valid_diff_rds)):
    if i %2==0:
        valid_diff.append(valid_diff_rds[i].replace('\n',' ')+valid_diff_rds[i+1].replace('\n', ' '))
    else:
        continue
with open(_valid_diff_towrite, 'w') as f:
    for d in valid_diff:
        f.write(d)
        f.write('\n')


test_diff = open(_test_difffile,'r')
test_diff_rds = test_diff.readlines()
test_diff.close()

test_diff = []
for i in range(len(test_diff_rds)):
    if i %2==0:
        test_diff.append(test_diff_rds[i].replace('\n',' ')+test_diff_rds[i+1].replace('\n', ' '))
    else:
        continue
with open(_test_diff_towrite, 'w') as f:
    for d in test_diff:
        f.write(d)
        f.write('\n')
a=train_diff[0].split('<nl>')

### write beforepatch.java and afterpatch.java
_train_before_patch = 'train.before.patch.java'
_train_after_patch = 'train.after.patch.java'
_valid_before_patch = 'valid.before.patch.java'
_valid_after_patch = 'valid.after.patch.java'
_test_before_patch = 'test.before.patch.java'
_test_after_patch = 'test.after.patch.java'


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

with open(_train_before_patch, 'w') as f:
    for d in train_before_patch_list:
        f.write(d)
        f.write('\n')
with open(_train_after_patch, 'w') as f:
    for d in train_before_patch_list:
        f.write(d)
        f.write('\n')

with open(_valid_before_patch, 'w') as f:
    for d in valid_before_patch_list:
        f.write(d)
        f.write('\n')
with open(_valid_after_patch, 'w') as f:
    for d in valid_before_patch_list:
        f.write(d)
        f.write('\n')

with open(_test_before_patch, 'w') as f:
    for d in test_before_patch_list:
        f.write(d)
        f.write('\n')
with open(_test_after_patch, 'w') as f:
    for d in test_before_patch_list:
        f.write(d)
        f.write('\n')
ipdb.set_trace()