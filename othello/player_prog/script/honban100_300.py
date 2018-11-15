# python 2.7.10
# -*- coding: utf-8 -*-
# 途中盤面101〜200までを各プレイヤで100試合ずつ 11/15

player = ["random100", "hyouka-0-100", "MC-100", "MCT", "EPT_MCT1730", "EPT_MCT8500", "AlphaBeta1", "AlphaBeta2", "AlphaBeta4"]

fp = open("script/honban100_150.sh", "w")
print >> fp, "#!/bin/"
for i in range(101, 151):
    for x in range(9):
        for y in range(9):
            print >> fp, "java MainApp 1 100 %s %s %s >> result/board101_200/board%s.txt ;" % (i, player[x], player[y], i)
            print >> fp, "echo BoardNumber : %s >> result/board101_200/board%s.txt ;" % (i, i)
            print >> fp, "echo  >> result/board101_200/board%s.txt ; " % (i)
print >> fp, "echo finished"
fp.close()

fp = open("script/honban151_200.sh", "w")
print >> fp, "#!/bin/"
for i in range(151, 201):
    for x in range(9):
        for y in range(9):
            print >> fp, "java MainApp 1 100 %s %s %s >> result/board101_200/board%s.txt ;" % (i, player[x], player[y], i)
            print >> fp, "echo BoardNumber : %s >> result/board101_200/board%s.txt ;" % (i, i)
            print >> fp, "echo  >> result/board101_200/board%s.txt ; " % (i)
print >> fp, "echo finished"
fp.close()

fp = open("script/honban201_250.sh", "w")
print >> fp, "#!/bin/"
for i in range(201, 251):
    for x in range(9):
        for y in range(9):
            print >> fp, "java MainApp 1 100 %s %s %s >> result/board201_300/board%s.txt ;" % (i, player[x], player[y], i)
            print >> fp, "echo BoardNumber : %s >> result/board201_300/board%s.txt ;" % (i, i)
            print >> fp, "echo  >> result/board201_300/board%s.txt ; " % (i)
print >> fp, "echo finished"
fp.close()

fp = open("script/honban251_300.sh", "w")
print >> fp, "#!/bin/"
for i in range(251, 301):
    for x in range(9):
        for y in range(9):
            print >> fp, "java MainApp 1 100 %s %s %s >> result/board201_300/board%s.txt ;" % (i, player[x], player[y], i)
            print >> fp, "echo BoardNumber : %s >> result/board201_300/board%s.txt ;" % (i, i)
            print >> fp, "echo  >> result/board201_300/board%s.txt ; " % (i)
print >> fp, "echo finished"
fp.close()
