# python 2.7.10
# -*- coding: utf-8 -*-
# 通常盤面での初期レートを求める

player = ["random100", "hyouka-0-100", "hyouka-1-100", "MC-100", "MCT", "MCT2", "MCT+CF", "MCT+CF2", "AlphaBeta1", "AlphaBeta2", "AlphaBeta3"]

fp = open("/Users/shukai3264/takao/othello/player_prog/script/run2.sh", "w")
print >> fp, "#!/bin/"

for y in range(10):
    for x in range(10):

        print >> fp, "echo black : %s, white : %s >> /Users/shukai3264/takao/othello/player_prog/result/othello1.txt" % (player[x], player[y])
        print >> fp, "java MainApp 1 100 %s %s >> /Users/shukai3264/takao/othello/player_prog/result/othello1.txt ;" % (player[x], player[y])
        print >> fp, "echo  >> /Users/shukai3264/takao/othello/player_prog/result/othello1.txt"
print >> fp, "echo finished"
fp.close()
