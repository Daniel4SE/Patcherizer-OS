
echo "result of NMT"
python metric_evaluate.py -metric meteor -hyp Experiment_Result/OverallPerformance/NMT/nmt.msg -ref Experiment_Result/OverallPerformance/groud.truth.msg
python multi_bleu.py -hyp Experiment_Result/OverallPerformance/NMT/nmt.msg -ref Experiment_Result/OverallPerformance/groud.truth.msg
python metric_evaluate.py -metric rouge -hyp Experiment_Result/OverallPerformance/NMT/nmt.msg -ref Experiment_Result/OverallPerformance/groud.truth.msg

echo "result of CoDiSum"
python metric_evaluate.py -metric meteor -hyp Experiment_Result/OverallPerformance/Codisum/codisum.msg -ref Experiment_Result/OverallPerformance/groud.truth.msg
python multi_bleu.py -hyp Experiment_Result/OverallPerformance/Codisum/codisum.msg -ref Experiment_Result/OverallPerformance/groud.truth.msg
python metric_evaluate.py -metric rouge -hyp Experiment_Result/OverallPerformance/Codisum/codisum.msg -ref Experiment_Result/OverallPerformance/groud.truth.msg

echo "result of CoreGen"
python metric_evaluate.py -metric meteor -hyp Experiment_Result/OverallPerformance/CoreGen/coregen.msg -ref Experiment_Result/OverallPerformance/groud.truth.msg
python multi_bleu.py -hyp Experiment_Result/OverallPerformance/CoreGen/coregen.msg -ref Experiment_Result/OverallPerformance/groud.truth.msg
python metric_evaluate.py -metric rouge -hyp Experiment_Result/OverallPerformance/CoreGen/coregen.msg -ref Experiment_Result/OverallPerformance/groud.truth.msg

echo "result of ATOM"
python metric_evaluate.py -metric meteor -hyp Experiment_Result/OverallPerformance/ATOM/atom.msg -ref Experiment_Result/OverallPerformance/groud.truth.msg
python multi_bleu.py -hyp Experiment_Result/OverallPerformance/ATOM/atom.msg -ref Experiment_Result/OverallPerformance/groud.truth.msg
python metric_evaluate.py -metric rouge -hyp Experiment_Result/OverallPerformance/ATOM/atom.msg -ref Experiment_Result/OverallPerformance/groud.truth.msg

echo "result of FIRA"
python metric_evaluate.py -metric meteor -hyp Experiment_Result/OverallPerformance/FIRA/fira.msg -ref Experiment_Result/OverallPerformance/groud.truth.msg
python multi_bleu.py -hyp Experiment_Result/OverallPerformance/FIRA/fira.msg -ref Experiment_Result/OverallPerformance/groud.truth.msg
python metric_evaluate.py -metric rouge -hyp Experiment_Result/OverallPerformance/FIRA/fira.msg -ref Experiment_Result/OverallPerformance/groud.truth.msg

echo "result of Patcherizer"
python metric_evaluate.py -metric meteor -hyp Experiment_Result/OverallPerformance/Patcherizer-DS-DA/patcherizerall.msg -ref Experiment_Result/OverallPerformance/groud.truth.msg
python multi_bleu.py -hyp Experiment_Result/OverallPerformance/Patcherizer-DS-DA/patcherizerall.msg -ref Experiment_Result/OverallPerformance/groud.truth.msg
python metric_evaluate.py -metric rouge -hyp Experiment_Result/OverallPerformance/Patcherizer-DS-DA/patcherizerall.msg -ref Experiment_Result/OverallPerformance/groud.truth.msg


echo "retrieval"
echo "result of cc2vec"
python metric_evaluate.py -metric meteor -hyp Experiment_Result/OverallPerformance/CC2Vec/cc2vec.msg -ref Experiment_Result/OverallPerformance/groud.truth.msg
python multi_bleu.py -hyp Experiment_Result/OverallPerformance/CC2Vec/cc2vec.msg -ref Experiment_Result/OverallPerformance/groud.truth.msg
python metric_evaluate.py -metric rouge -hyp Experiment_Result/OverallPerformance/CC2Vec/cc2vec.msg -ref Experiment_Result/OverallPerformance/groud.truth.msg


echo "result of NNGen"
python metric_evaluate.py -metric meteor -hyp Experiment_Result/OverallPerformance/NNGen/nngen.msg -ref Experiment_Result/OverallPerformance/groud.truth.msg
python multi_bleu.py -hyp Experiment_Result/OverallPerformance/NNGen/nngen.msg -ref Experiment_Result/OverallPerformance/groud.truth.msg
python metric_evaluate.py -metric rouge -hyp Experiment_Result/OverallPerformance/NNGen/nngen.msg -ref Experiment_Result/OverallPerformance/groud.truth.msg

echo "result of CoRec"
python metric_evaluate.py -metric meteor -hyp Experiment_Result/OverallPerformance/CoRec/corec.msg -ref Experiment_Result/OverallPerformance/groud.truth.msg
python multi_bleu.py -hyp Experiment_Result/OverallPerformance/CoRec/corec.msg -ref Experiment_Result/OverallPerformance/groud.truth.msg
python metric_evaluate.py -metric rouge -hyp Experiment_Result/OverallPerformance/CoRec/corec.msg -ref Experiment_Result/OverallPerformance/groud.truth.msg

echo "result of Patcherizer-retrival"
python metric_evaluate.py -metric meteor -hyp Experiment_Result/OverallPerformance/Patcherizer-DS-DA/patcherizerretrival.msg -ref Experiment_Result/OverallPerformance/groud.truth.msg
python multi_bleu.py -hyp Experiment_Result/OverallPerformance/Patcherizer-DS-DA/patcherizerretrival.msg -ref Experiment_Result/OverallPerformance/groud.truth.msg
python metric_evaluate.py -metric rouge -hyp Experiment_Result/OverallPerformance/Patcherizer-DS-DA/patcherizerretrival.msg -ref Experiment_Result/OverallPerformance/groud.truth.msg

