# python 2.7.10
# -*- coding: utf-8 -*-
# 途中盤面1〜100までを各プレイヤで100試合ずつ 11/13

player = ["random100", "hyouka-0-100", "MC-100", "MCT", "EPT_MCT1730", "EPT_MCT8500", "AlphaBeta1", "AlphaBeta2", "AlphaBeta4"]

fp = open("script/honban1_100.sh", "w")
print >> fp, "#!/bin/"
for i in range(1, 101):
    for x in range(9):
        for y in range(9):
            print >> fp, "java MainApp 1 100 %s %s %s >> result/board1_100/board%s.txt ;" % (i, player[x], player[y], i)
            print >> fp, "echo BoardNumber : %s >> result/board1_100/board%s.txt ;" % (i, i)
            print >> fp, "echo  >> result/board1_100/board%s.txt ; " % (i)
print >> fp, "echo finished"
fp.close()
