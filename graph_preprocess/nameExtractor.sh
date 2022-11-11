# train.before.patch.java
# train.after.patch.java
# valid.before.patch.java
# valid.after.patch.java
# test.before.patch.java
# test.after.patch.java
python ParserNameExtract.py \
    -javafile '../AST_JAVA_DIFF/' \
    -savepair 'graph.pdf'

