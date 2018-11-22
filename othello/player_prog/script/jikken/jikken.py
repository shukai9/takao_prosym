# python 2.7.10
# -*- coding: utf-8 -*-
# 初期レート 11/12

player = ["random100", "MC-100", "MCT", "EPT_MCT1730", "EPT_MCT8500"]

fp = open("script/jikken/jikken.sh", "w")
print >> fp, "#!/bin/"
for x in range(5):
    for y in range(5):
        print >> fp, "java MainApp 1 100 0 %s %s >> result/init.txt ;" % (player[x], player[y])
        print >> fp, "echo BoardNumber : 0 >> result/init.txt ;"
        print >> fp, "echo  >> result/init.txt ; "
print >> fp, "echo finished"
fp.close()
