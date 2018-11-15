# python 2.7.10
# -*- coding: utf-8 -*-
# 初期勝率を求めるために途中100盤面にてMCT同士のプレイ


fp = open("/Users/shukai3264/takao/othello/player_prog/script/run3.sh", "w")
print >> fp, "#!/bin/"

for i in range(1, 101):
    print >> fp, "echo BoardNumber : %s >> /Users/shukai3264/takao/othello/player_prog/result/othello3.txt ;" % (i)
    print >> fp, "java MainApp 1 100 %s MCT MCT >> /Users/shukai3264/takao/othello/player_prog/result/othello3.txt ;" % (i)
    print >> fp, "echo  >> /Users/shukai3264/takao/othello/player_prog/result/othello3.txt"
print >> fp, "echo finished"
fp.close()
