# python 2.7.10
# -*- coding: utf-8 -*-
# 全盤面を100試合ずつプレイ

player = ["random100", "hyouka-0-100", "hyouka-1-100", "MC-100", "MCT", "MCT2", "MCT+CF", "MCT+CF2", "AlphaBeta1", "AlphaBeta2", "AlphaBeta3"]

fp = open("/Users/shukai3264/takao/othello/player_prog/script/run4.sh", "w")
print >> fp, "#!/bin/"
for i in range(1, 101):
    for y in range(10):
        for x in range(10):
            print >> fp, "java MainApp 1 100 %s %s %s >> /Users/shukai3264/takao/othello/player_prog/result/result4_board%s.txt ;" % (i, player[x], player[y], i)
            print >> fp, "echo BoardNumber : %s >> /Users/shukai3264/takao/othello/player_prog/result/result4_board%s.txt ;" % (i, i)
            print >> fp, "echo  >> /Users/shukai3264/takao/othello/player_prog/result/result4_board%s.txt" % (i)
print >> fp, "echo finished"
fp.close()
