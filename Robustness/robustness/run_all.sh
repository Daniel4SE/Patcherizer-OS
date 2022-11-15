#!/bin/sh

if [ "$#" -ne 2 ]; then
    echo "Usage: $0 LAYER_NUM HEAD_NUM (Example: ./run_all.sh 2 6)" >&2
    exit 1
fi

DATAPATH=./robustness
SAVEPATH=./exp_robustness

# hyper-parameter configuration
LAYER=$1
HEAD=$2
STAGE1_BATCH_SIZE=16
STAGE2_BATCH_SIZE=16
STAGE1_EPOCH=30
STAGE2_EPOCH=100
MASK_RATE=0.5
MAX_LENGTH=512
MIN_WORD_COUNT=0

# preparing directories
mkdir -p ${SAVEPATH}
mkdir -p ${SAVEPATH}/vocab/
mkdir -p ${SAVEPATH}/log/
mkdir -p ${SAVEPATH}/pretrain/
mkdir -p ${SAVEPATH}/finetune/

# inference
mkdir -p ${SAVEPATH}/result/
BEST_MODEL=$(ls "$SAVEPATH"/finetune/ | grep finetune_"${LAYER}"layer_"${HEAD}"head* | tail -n1)
python translate.py -model ${SAVEPATH}/finetune/${BEST_MODEL} -vocab ${SAVEPATH}/vocab/vocab -src ${DATAPATH}/cleaned.test.diff -output ${SAVEPATH}/result/${LAYER}layer_${HEAD}head_${MASK_RATE}mask.msg