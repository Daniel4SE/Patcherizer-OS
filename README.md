# Title: Learning to Fully Represent Patches

Patcherizer
=======
Patcherizer, a novel representation learning approach that fuses contextual, structural and sequential information drawn from patches.

## Ⅰ) Dataset

### A) Patch description generation.
 Download dataset.zip [data in Zenodo](https://zenodo.org/record/7317318#.Y3H9jezMLYI "Dataset for Patch Description Generation"), 

### B) Patch correctness assessment. 
  Download _ASE_features2_bert.pickle_ from [data in Zenodo](https://zenodo.org/record/7029808#.YwuKF2QzZb8 "Dataset for Quatrain"), 
  accordingly change the absolute path in **PatchCorrectness/config_correctness.py** of this repository as below.
  1. self.path_ASE2020_feature ---> ASE_features2_bert.pickle. The feature from Tian et al.'s ASE2020 [paper](https://ieeexplore.ieee.org/abstract/document/9286101) for our RQ3 DL experiment. 

### C) JIT defect prediction.

## Ⅱ) Requirements
### A) Environment 
  * python 3.8
  * pip install -r requirements.txt

## Ⅲ) Experiment

[//]: # (To obtain the experimental results of our paper, execute `run.py` with the following parameters:)

### A) RQ1 (Performance of Patcherizer)
#### RQ 1.1 Patch description generation
  1. Evaluate results of different models: 
    1) cd PatchDescriptionGeneration; 
    2) sh evaluate_all_models.sh
  2. Reproduction:
  [Data of pre-train and fine-tune files](https://zenodo.org/record/7317990#.Y3LM1OzML3s "Data of pre-train and fine-tune files"),
    1) Download pretrain file and put it in the folder: Patcherzier/exp/pretrain/
    2) Download finetune file and put it in the folder: Patcherzier/exp/finetuen/
    3) 
    ```
    sh run_all_gcn.sh 4 6
    ```


#### RQ 1.2 Patch correctness assessment
go to /PatchCorrectness/, and execute the following script:
```
python main.py
```
#### RQ 1.3 JIT defect prediction
get embedding: go to Patcherizer/ and ```sh get_embedding.sh```
for comparison, refer to cc2vec


### B) RQ2 (ablation study)
go to PatchDescriptionGeneration/, and execute the following script:
```
sh evaluate_all_models.sh
```

### C) RQ3 (robustness)
Download [Data of Robustness](https://zenodo.org/record/7320397#.Y3LY5OzML3s "Robustness"), unzip and go to robustness/.
run
```
sh run_all.sh 4 6
```

