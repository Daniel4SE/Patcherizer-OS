import torch
import pickle
import os
import os, sys
SCRIPT_DIR = os.path.dirname(os.path.abspath(__file__))
sys.path.append(os.path.dirname(SCRIPT_DIR))
sys.path.append(os.path.dirname(os.path.dirname(SCRIPT_DIR)))
import numpy as np
import random
import math
from representation.CC2Vec import lmg_cc2ftr_interface
from sklearn.preprocessing import StandardScaler, MinMaxScaler, Normalizer
from sklearn.tree import DecisionTreeClassifier
from sklearn.linear_model import LogisticRegression
from sklearn.ensemble import RandomForestClassifier
from sklearn.naive_bayes import GaussianNB
import xgboost as xgb
from sklearn.metrics import roc_curve, auc, accuracy_score, recall_score, precision_score
from sklearn.metrics import confusion_matrix
import config_correctness as config
import warnings
warnings.filterwarnings("ignore")
dirname = os.path.dirname(os.path.abspath(__file__))
print('dirname: {}'.format(dirname))
MODEL_CC2Vec = dirname + '/representation/CC2Vec/'
Data_folder = dirname + '/data/'

dictionary = pickle.load(open(MODEL_CC2Vec + 'dict.pkl', 'rb'))

# subset = set([])
# with open('./bugreport_patch.txt','r+') as f:
#     for line in f:
#         bugid = line.split('$$')[0]
#         subset.add(bugid)

def obtain_ASE_features2(path_patch, w2v):
    cnt, succ = 0, 0
    dict_ASE_feature = {}
    datasets = os.listdir(path_patch)
    for dataset in datasets:
        path_dataset = os.path.join(path_patch, dataset)
        benchmarks = os.listdir(path_dataset)
        for benchmark in benchmarks:
            path_benchmark = os.path.join(path_dataset, benchmark)
            tools = os.listdir(path_benchmark)
            for tool in tools:
                path_tool = os.path.join(path_benchmark, tool)
                labels = os.listdir(path_tool)
                for label in labels:
                    path_label = os.path.join(path_tool, label)
                    projects = os.listdir(path_label)
                    for project in projects:
                        path_project = os.path.join(path_label, project)
                        ids = os.listdir(path_project)
                        for id in ids:
                            path_id = os.path.join(path_project, id)
                            patches = os.listdir(path_id)
                            for patch in patches:
                                # parse patch
                                cnt += 1
                                print(cnt)
                                if label == 'Correct':
                                    label_int = 1
                                elif label == 'Incorrect':
                                    label_int = 0
                                else:
                                    raise
                                patch_diff = []
                                path_single_patch = os.path.join(path_id, patch)
                                # for root, dirs, files in os.walk(path_single_patch):
                                #     for file in files:
                                #         if file.endswith('.patch'):
                                #             try:
                                #                 with open(os.path.join(root, file), 'r+') as f:
                                #                     patch_diff += f.readlines()
                                #             except Exception as e:
                                #                 print(e)
                                #                 continue
                                try:
                                    if w2v == 'CC2Vec':
                                        multi_vector = []  # sum up vectors of different parts of patch
                                        for root, dirs, files in os.walk(path_single_patch):
                                            for file in files:
                                                if file.endswith('.patch'):
                                                    p = os.path.join(root, file)
                                                    learned_vector = lmg_cc2ftr_interface.learned_feature(p,load_model=MODEL_CC2Vec + 'cc2ftr.pt',dictionary=dictionary)
                                                    multi_vector.append(list(learned_vector.flatten()))
                                        combined_vector = np.array(multi_vector).sum(axis=0)
                                except Exception as e:
                                    print(e)
                                    continue
                                if combined_vector == []:
                                    continue

                                ASE_feature_combined = combined_vector
                                if len(ASE_feature_combined) != 482: # CC2Vec dimension
                                    print('???: {}'.format(len(ASE_feature_combined)))
                                if benchmark == 'Bugsjar' and '+' in project:
                                    project1 = project.split('+')[1]
                                    project = project1.lower()
                                    project_id = project + '-' + id
                                else:
                                    project_id = project + '-' + id

                                key = project_id
                                # key = project
                                key = key.lower()
                                # value = [ASE_feature_combined, label_int]
                                # dict_ASE_feature[key] = value

                                # saved by project id as key
                                patch_id = patch + '-' + project_id + '_' + tool + '_' + dataset

                                if not key in dict_ASE_feature.keys():
                                    dict_ASE_feature[key] = [[patch_id, ASE_feature_combined, label_int]]
                                else:
                                    dict_ASE_feature[key].append([patch_id, ASE_feature_combined, label_int])
                                succ += 1

    print('cnt: {}, succ: {}'.format(cnt, succ))
    # save ASE feature
    with open('./data/ASE-'+w2v+'_feature.pickle', 'wb') as f:
        pickle.dump(dict_ASE_feature, f)

def save_patcherizer_feature(embeddings='patcherizer'):
    # read embeddings
    if embeddings == 'patcherizer':
        path_embedding = 'data/patcherizer.h5'
    # elif embeddings == 'bert':
    #     path_embedding = './patch_bert.h5'
    # elif embeddings == 'cc2vec':
    #     path_embedding = './cc2vec.h5'
    patch_embeddings = torch.load(path_embedding)
    dict_patcherizer = {}
    with open('data/newpath.txt') as f:
        cnt = 0
        for line in f:
            dataset = line.split('/')[2]
            benchmark = line.split('/')[3]
            tool = line.split('/')[4]
            label = line.split('/')[5]
            project = line.split('/')[6]
            id = line.split('/')[7]
            patch = line.split('/')[8].strip()
            if benchmark == 'Bugsjar' and '+' in project:
                project1 = project.split('+')[1]
                project = project1.lower()
                project_id = project + '-' + id
            else:
                project_id = project + '-' + id

            key = project_id
            # key = project
            key = key.lower()

            # saved by project id as key
            patch_id = patch + '-' + project_id + '_' + tool + '_' + dataset
            if label == 'Correct':
                label_int = 1
            elif label == 'Incorrect':
                label_int = 0
            else:
                raise
            patcherizer_feature = list(patch_embeddings[cnt])

            if not key in dict_patcherizer.keys():
                dict_patcherizer[key] = [[patch_id, patcherizer_feature, label_int]]
            else:
                dict_patcherizer[key].append([patch_id, patcherizer_feature, label_int])
            cnt += 1

    print('cnt: {}'.format(cnt))
    # save ASE feature
    with open('./data/'+embeddings+'_feature.pickle', 'wb') as f:
        pickle.dump(dict_patcherizer, f)

def compare_embeddings(times=10, algorithm='xgb', path_ASE_bert=None):
    # patcherizer average list
    aucs_p, rcs_p_p, rcs_n_p = list(), list(), list()
    accs_p, prcs_p, rcs_p, f1s_p,  =  list(), list(), list(), list()
    # cc2vec average list
    aucs_c, rcs_p_c, rcs_n_c = list(), list(), list()
    accs_c, prcs_c, rcs_c, f1s_c,  =  list(), list(), list(), list()
    # bert average list
    aucs_b, rcs_p_b, rcs_n_b = list(), list(), list()
    accs_b, prcs_b, rcs_b, f1s_b,  =  list(), list(), list(), list()

    patcherizer_features = pickle.load(open(Data_folder+'patcherizer_feature.pickle', 'rb'))
    Bert_features = pickle.load(open(path_ASE_bert, 'rb'))
    CC2Vec_features = pickle.load(open(Data_folder+'ASE-CC2Vec_feature.pickle', 'rb'))

    project_ids = list(patcherizer_features.keys())
    # new_project_ids = []
    # for pd in project_ids:
    #     if pd in subset:
    #         new_project_ids.append(pd)
    # project_ids = new_project_ids

    random.seed(10)
    random.shuffle(project_ids, )
    n = int(math.ceil(len(project_ids) / float(times)))
    groups = [project_ids[i:i + n] for i in range(0, len(project_ids), n)]

    all_labels = []
    for id in project_ids:
        value = patcherizer_features[id]
        for p in range(0, len(value)):
            label = value[p][2]
            all_labels.append(label)
    print('Dataset size: {}, Incorrect: {}, Correct: {}'.format(len(all_labels), all_labels.count(0),
                                                                all_labels.count(1)))
    # print('Algorithm: {}'.format(algorithm))
    print('#####')
    for i in range(times):
        print('***************')
        print('ROUND: {}'.format(str(i + 1)))
        test_group = groups[i]
        train_group = groups[:i] + groups[i + 1:]
        test_ids = test_group
        train_ids = []
        for j in train_group:
            train_ids += j
        # train_group = groups[i]
        # test_group = groups[:i] + groups[i + 1:]
        # train_ids = train_group
        # test_ids = []
        # for j in test_group:
        #     test_ids += j

        train_patcherizer, train_patcherizer_labels, train_cc2vec, train_cc2vec_labels, train_bert, train_bert_labels = obtain_dataset(train_ids, patcherizer_features, CC2Vec_features, Bert_features)
        test_patcherizer, test_patcherizer_labels, test_cc2vec, test_cc2vec_labels, test_bert, test_bert_labels = obtain_dataset(test_ids, patcherizer_features, CC2Vec_features, Bert_features)

        # #debug
        # cnt = 0
        # for i in range(len(train_patcherizer)):
        #     for j in range(len(test_patcherizer)):
        #         if (train_patcherizer[i] == test_patcherizer[j]).all():
        #             print(train_patch_ids[i])
        #             print(test_patch_ids[j])
        #             cnt += 1
        print('Train data size: {}, Incorrect: {}, Correct: {}'.format(len(train_patcherizer_labels), list(train_patcherizer_labels).count(0), list(train_patcherizer_labels).count(1)))
        print('Test data size: {}, Incorrect: {}, Correct: {}'.format(len(test_patcherizer_labels), list(test_patcherizer_labels).count(0), list(test_patcherizer_labels).count(1)))
        print('Algorithm: {}'.format(algorithm))
        # print('#####')
        # patcherizer
        auc_, recall_p, recall_n, acc, prc, rc, f1 = patch_validation(i, algorithm, train_patcherizer, train_patcherizer_labels, test_patcherizer, test_patcherizer_labels)
        aucs_p.append(auc_)
        rcs_p_p.append(recall_p)
        rcs_n_p.append(recall_n)
        accs_p.append(acc)
        prcs_p.append(prc)
        rcs_p.append(rc)
        f1s_p.append(f1)

        # cc2vec
        auc_, recall_p, recall_n, acc, prc, rc, f1 = patch_validation(i, algorithm, train_cc2vec, train_cc2vec_labels, test_cc2vec, test_cc2vec_labels)
        aucs_c.append(auc_)
        rcs_p_c.append(recall_p)
        rcs_n_c.append(recall_n)
        accs_c.append(acc)
        prcs_c.append(prc)
        rcs_c.append(rc)
        f1s_c.append(f1)

        # bert
        auc_, recall_p, recall_n, acc, prc, rc, f1 = patch_validation(i, algorithm, train_bert, train_bert_labels, test_bert, test_bert_labels)
        aucs_b.append(auc_)
        rcs_p_b.append(recall_p)
        rcs_n_b.append(recall_n)
        accs_b.append(acc)
        prcs_b.append(prc)
        rcs_b.append(rc)
        f1s_b.append(f1)

    print('################')
    print('Patcherizer')
    print('Accuracy: {:.1f} -- Precision: {:.1f} -- +Recall: {:.1f} -- F1: {:.1f}'.format(
        np.array(accs_p).mean() * 100, np.array(prcs_p).mean() * 100, np.array(rcs_p).mean() * 100,
        np.array(f1s_p).mean() * 100,))
    print('AUC: {:.3f}, +Recall: {:.3f}, -Recall: {:.3f}'.format(np.array(aucs_p).mean(), np.array(rcs_p_p).mean(),
                                                                 np.array(rcs_n_p).mean()))
    print('-------')
    print('Bert')
    print('Accuracy: {:.1f} -- Precision: {:.1f} -- +Recall: {:.1f} -- F1: {:.1f}'.format(
        np.array(accs_b).mean() * 100, np.array(prcs_b).mean() * 100, np.array(rcs_b).mean() * 100,
        np.array(f1s_b).mean() * 100, ))
    print('AUC: {:.3f}, +Recall: {:.3f}, -Recall: {:.3f}'.format(np.array(aucs_b).mean(), np.array(rcs_p_b).mean(),
                                                                 np.array(rcs_n_b).mean()))
    print('################')
    print('-------')
    print('CC2Vec')
    print('Accuracy: {:.1f} -- Precision: {:.1f} -- +Recall: {:.1f} -- F1: {:.1f}'.format(
        np.array(accs_c).mean() * 100, np.array(prcs_c).mean() * 100, np.array(rcs_c).mean() * 100,
        np.array(f1s_c).mean() * 100, ))
    print('AUC: {:.3f}, +Recall: {:.3f}, -Recall: {:.3f}'.format(np.array(aucs_c).mean(), np.array(rcs_p_c).mean(),
                                                                 np.array(rcs_n_c).mean()))
    print('################')

def obtain_dataset(ids, patcherizer_features, CC2Vec_features, Bert_features):
    train_patcherizer, train_patcherizer_labels = [], []
    train_cc2vec, train_cc2vec_labels = [], []
    train_bert, train_bert_labels = [], []

    for id in ids:
        # patcherzier
        try:
            patcherizer_feature = patcherizer_features[id]
            for p in range(len(patcherizer_feature)):
                patch_id_p, vector_p, label_p = patcherizer_feature[p][0], patcherizer_feature[p][1], patcherizer_feature[p][2]
                train_patcherizer.append(np.array(vector_p))
                train_patcherizer_labels.append(label_p)
                # patch_ids.append(patch_id_p)
        except Exception as e:
            pass
            # print(e)
        # cc2vec
        try:
            CC2Vec_feature = CC2Vec_features[id]
            for p in range(len(CC2Vec_feature)):
                patch_id_c, vector_c, label_c = CC2Vec_feature[p][0], CC2Vec_feature[p][1], CC2Vec_feature[p][2]
                train_cc2vec.append(np.array(vector_c))
                train_cc2vec_labels.append(label_c)
        except Exception as e:
            pass
            # print(e)
        # bert
        try:
            Bert_feature = Bert_features[id]
            for p in range(len(Bert_feature)):
                patch_id_b, vector_b, label_b = Bert_feature[p][0], Bert_feature[p][1], Bert_feature[p][2]
                train_bert.append(np.array(vector_b))
                train_bert_labels.append(label_b)
        except Exception as e:
            pass
            # print(e)
    return train_patcherizer, train_patcherizer_labels, train_cc2vec, train_cc2vec_labels, train_bert, train_bert_labels

def patch_validation(i, algorithm, train_features, train_labels, test_features, test_labels):
    x_train, y_train = train_features, train_labels
    x_test, y_test = test_features, test_labels

    # standard data
    scaler = StandardScaler().fit(x_train)
    x_train = scaler.transform(x_train)
    x_test = scaler.transform(x_test)

    clf = None
    if algorithm == 'lr':
        clf = LogisticRegression(random_state=0,).fit(X=x_train, y=y_train)
    elif algorithm == 'dt':
        clf = DecisionTreeClassifier().fit(X=x_train, y=y_train, sample_weight=None)
    elif algorithm == 'rf':
        clf = RandomForestClassifier(random_state=0).fit(X=x_train, y=y_train, )
    elif algorithm == 'xgb':
        dtrain = xgb.DMatrix(x_train, label=y_train)
        clf = xgb.train(params={'objective': 'binary:logistic', 'verbosity': 0}, dtrain=dtrain, )
    elif algorithm == 'nb':
        clf = GaussianNB().fit(X=x_train, y=y_train)

    # predict
    if algorithm == 'xgb':
        x_test_xgb = x_test
        x_test_xgb_dmatrix = xgb.DMatrix(x_test_xgb, label=y_test)
        y_pred = clf.predict(x_test_xgb_dmatrix)
    else:
        y_pred = clf.predict_proba(x_test)[:, 1]

    auc_, recall_p, recall_n, acc, prc, rc, f1 = evaluation_metrics(y_true=list(y_test), y_pred_prob=list(y_pred),threshold=0.5)
    return auc_, recall_p, recall_n, acc, prc, rc, f1

def evaluation_metrics(y_true, y_pred_prob, threshold=0.5):
    fpr, tpr, thresholds = roc_curve(y_true=y_true, y_score=y_pred_prob, pos_label=1)
    auc_ = auc(fpr, tpr)

    y_pred = [1 if p >= threshold else 0 for p in y_pred_prob]
    acc = accuracy_score(y_true=y_true, y_pred=y_pred)
    prc = precision_score(y_true=y_true, y_pred=y_pred)
    rc = recall_score(y_true=y_true, y_pred=y_pred)
    f1 = 2 * prc * rc / (prc + rc)

    print('AUC: %f -- F1: %f -- Accuracy: %f -- Precision: %f ' % (auc_, f1, acc, prc,))
    if y_true == y_pred:
        tn, fp, fn, tp = 1, 0, 0, 1
    else:
        tn, fp, fn, tp = confusion_matrix(y_true, y_pred).ravel()
    recall_p = tp / (tp + fn)
    recall_n = tn / (tn + fp)
    # print('AUC: {:.3f}, +Recall: {:.3f}, -Recall: {:.3f}'.format(auc_, recall_p, recall_n))

    # return , auc_
    return auc_, recall_p, recall_n, acc, prc, rc, f1

if __name__ == '__main__':
    cf = config.Config()
    path_ASE_bert = cf.path_ASE2020_feature
    # path_patch = cf.path_patch

    # # obtain embeddings
    # obtain_ASE_features2(path_patch, 'CC2Vec')
    # save_patcherizer_feature('patcherizer')

    # experiment
    compare_embeddings(algorithm='lr', path_ASE_bert=path_ASE_bert)

