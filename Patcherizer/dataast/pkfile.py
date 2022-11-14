import pickle
train_diff_file = open('cleaned.train.diff','rb')
train_diff = train_diff_file.readlines()
train_diff = [i.decode('utf-8') for i in train_diff]
train_diff_file.close()

valid_diff_file = open('cleaned.valid.diff','rb')
valid_diff = valid_diff_file.readlines()
valid_diff = [i.decode('utf-8') for i in valid_diff]
valid_diff_file.close()

train_msg_file = open('cleaned.train.msg','rb')
train_msg = train_msg_file.readlines()
train_msg = [i.decode('utf-8') for i in train_msg]
train_msg_file.close()

valid_msg_file = open('cleaned.valid.msg','rb')
valid_msg = valid_msg_file.readlines()
valid_msg = [i.decode('utf-8') for i in valid_msg]
valid_msg_file.close()

_tdiff = train_diff+valid_diff
_tmsg = train_msg+valid_msg
_tr = (_tmsg, _tdiff)




test_diff_file = open('cleaned.test.diff','rb')
test_diff = test_diff_file.readlines()
test_diff = [i.decode('utf-8') for i in test_diff]
test_diff_file.close()

test_msg_file = open('cleaned.test.msg','rb')
test_msg = test_msg_file.readlines()
test_msg = [i.decode('utf-8') for i in test_msg]
test_msg_file.close()

_te = (test_msg, test_diff)

dftrain =open('train.pkl','wb')
pickle.dump(_tr, dftrain)
dftrain.close()

dftrain =open('test.pkl','wb')
pickle.dump(_te, dftrain)
dftrain.close()