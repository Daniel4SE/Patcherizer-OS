#!/bin/sh

if [ "$#" -ne 2 ]; then
    echo "Usage: $0 LAYER_NUM HEAD_NUM (Example: ./run_all.sh 2 6)" >&2
    exit 1
fi

DATAPATH=./quatrain
SAVEPATH=./exp_ast_diff
Quatrainpath=./quatrain

# hyper-parameter configuration
LAYER=$1
HEAD=$2
STAGE1_BATCH_SIZE=32
STAGE2_BATCH_SIZE=64
STAGE1_EPOCH=30
STAGE2_EPOCH=100
MASK_RATE=0.5
MAX_LENGTH=512
MIN_WORD_COUNT=0

# BEST_MODEL=/home/daniel/OOPSLA-1/SOTAs/CoreGen/exp_diff_merge/finetune/finetune_4layer_6head_0.5mask_accu_40.914.chkpt
BEST_MODEL=/home/daniel/OOPSLA-1/SOTAs/CoreGen/exp_ast_diff/pretrain/pretrain_4layer_6head_0.5mask_accu_62.259.chkpt
# inference
# mkdir -p ${SAVEPATH}/result/
# BEST_MODEL=$(ls "$SAVEPATH"/finetune/ | grep finetune_"${LAYER}"layer_"${HEAD}"head* | tail -n1)
python translate.py -model ${BEST_MODEL} -vocab ${SAVEPATH}/vocab/vocab -src ${DATAPATH}/patch.txt -output ${Quatrainpath}/pred.msg