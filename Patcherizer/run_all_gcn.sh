#!/bin/sh

if [ "$#" -ne 2 ]; then
    echo "Usage: $0 LAYER_NUM HEAD_NUM (Example: ./run_all.sh 2 6)" >&2
    exit 1
fi

LOADPATH=./exp

DATAPATH=./data/dataast_diff
SAVEPATH=./gcn_diff

# hyper-parameter configuration
LAYER=$1
HEAD=$2
STAGE1_BATCH_SIZE=16
STAGE2_BATCH_SIZE=16
STAGE1_EPOCH=30
STAGE2_EPOCH=130
MASK_RATE=0.5
MAX_LENGTH=512
MIN_WORD_COUNT=0

# preparing directories
if [ -d ${SAVEPATH} ]; then
    echo "$SAVEPATH exist"
else
    echo "build folder: $SAVEPATH"
    mkdir -p ${SAVEPATH}
    mkdir -p ${SAVEPATH}/vocab/
    mkdir -p ${SAVEPATH}/log/
    mkdir -p ${SAVEPATH}/pretrain/
    mkdir -p ${SAVEPATH}/finetune/
fi
# cp exp/pretrain/* ${SAVEPATH}/pretrain/
# cp exp/finetune/* ${SAVEPATH}/finetune/

# preprocessing
python preprocess_gcn.py \
        -train_src ${DATAPATH}/cleaned.train.diff \
        -train_tgt ${DATAPATH}/cleaned.train.msg \
        -valid_src ${DATAPATH}/cleaned.valid.diff \
        -valid_tgt ${DATAPATH}/cleaned.valid.msg \
        -graph_info ${DATAPATH}/G.info \
        -save_data ${SAVEPATH}/vocab/vocab \
        -max_word_seq_len ${MAX_LENGTH} \
        -min_word_count ${MIN_WORD_COUNT} \
        -share_vocab 
        #-vocab #${SAVEPATH}/vocab/vocab #pretrain dataset1 vocab

python pretrain_gcn.py \
        -train_src ${DATAPATH}/cleaned.train.diff \
        -valid_src ${DATAPATH}/cleaned.valid.diff \
        -vocab ${SAVEPATH}/vocab/vocab \
        -save_data ${SAVEPATH}/vocab/pretrain_vocab \
        -mask_rate ${MASK_RATE} \
        -max_word_seq_len ${MAX_LENGTH} \
        -min_word_count ${MIN_WORD_COUNT}  

# stage I training
python train_gcn_run.py -data ${SAVEPATH}/vocab/pretrain_vocab -save_model ${SAVEPATH}/pretrain/pretrain_${LAYER}layer_${HEAD}head_${MASK_RATE}mask -log ${SAVEPATH}/log/pretrain_${LAYER}layer_${HEAD}head_${MASK_RATE}mask -save_mode best -proj_share_weight -embs_share_weight -label_smoothing -epoch ${STAGE1_EPOCH} -batch_size ${STAGE1_BATCH_SIZE} -n_head ${HEAD} -n_layers ${LAYER}



# stage II training 
BEST_PRETRAIN=$(ls "$SAVEPATH"/pretrain/ | grep pretrain_"${LAYER}"layer_"${HEAD}"head* | tail -n1)
echo ${BEST_PRETRAIN}
# BEST_PRETRAIN=pretrain_4layer_6head_0.5mask_accu_94.985.chkpt
python train_gcn_run.py \
    -data ${SAVEPATH}/vocab/vocab \
    -save_model ${SAVEPATH}/finetune/finetune_${LAYER}layer_${HEAD}head_${MASK_RATE}mask \
    -log ${SAVEPATH}/log/finetune_${LAYER}layer_${HEAD}head_${MASK_RATE}mask \
    -save_mode best \
    -proj_share_weight \
    -embs_share_weight \
    -label_smoothing \
    -epoch ${STAGE2_EPOCH} \
    -batch_size ${STAGE2_BATCH_SIZE} \
    -n_head ${HEAD} \
    -n_layers ${LAYER}

# inference
mkdir -p ${SAVEPATH}/result/
BEST_MODEL=$(ls "$SAVEPATH"/finetune/ | grep finetune_"${LAYER}"layer_"${HEAD}"head* | tail -n1)
python translate_gcn.py \
    -model ${SAVEPATH}/finetune/${BEST_MODEL} \
    -vocab ${SAVEPATH}/vocab/vocab \
    -src ${DATAPATH}/cleaned.test.diff \
    -output ${SAVEPATH}/result/${LAYER}layer_${HEAD}head_${MASK_RATE}mask.msg

