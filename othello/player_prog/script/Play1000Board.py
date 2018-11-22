# python 3
# -*- coding: utf-8 -*-
# 途中盤面1〜1000を全プレイヤ1回ずつプレイ shファイルに10分割する 11/21
# takao/othello/player_prog ディレクトリで実行

player = ["random100", "hyouka-0-100", "MC-100", "MCT", "EPT_MCT1730", "EPT_MCT8500", "AlphaBeta1", "AlphaBeta2", "AlphaBeta4"]
player_len = len(player)

for count in range(10):
    filename = "script//count{}.sh".format(count)
    fp = open(filename, "w")
    fp.write("#!/bin/\n")
    for i in range(1, 101):
        for x in range(player_len):
            for y in range(player_len):
                str_java = "java MainApp 1 1 {} {} {} >> result/Play1000Board/count{}.txt ;\n".format(i + (count*100), player[x], player[y], count)
                str_log = "echo  >> result/Play1000Board/count{}.txt ; \n".format(count)
                fp.write(str_java)
                fp.write(str_log)
    fp.write("echo  finish!\n")
    fp.close()
