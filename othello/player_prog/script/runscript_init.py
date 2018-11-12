# python 2.7.10
# -*- coding: utf-8 -*-
# 初期レート

player = ["random100", "hyouka-0-100", "hyouka-1-100", "MC-100", "MCT", "MCT2", "MCT+CF", "MCT+CF2", "AlphaBeta1", "AlphaBeta2", "AlphaBeta3"]

fp = open("/Users/shukai3264/takao/othello/player_prog/script/run_init.sh", "w")
print >> fp, "#!/bin/"
for y in range(11):
    for x in range(11):
        print >> fp, "java MainApp 1 100 0 %s %s >> /Users/shukai3264/takao/othello/player_prog/result/init.txt ;" % (player[x], player[y])
        print >> fp, "echo BoardNumber : 0 >> /Users/shukai3264/takao/othello/player_prog/result/init.txt ;"
        print >> fp, "echo  >> /Users/shukai3264/takao/othello/player_prog/result/init.txt"
print >> fp, "echo finished"
fp.close()
