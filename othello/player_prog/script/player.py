# python 2.7.10
# -*- coding: utf-8 -*-
# 途中盤面1〜100までを???プレイヤで100試合ずつ 11/12

player = ["random100", "MC-100", "MCT", "EPT_MCT1730", "EPT_MCT8500"]

for p in range(5):
    filename = "script/player_script/%s.sh" % (player[p])
    fp = open(filename, "w")
    print >> fp, "#!/bin/"
    for i in range(1, 1001):
        print >> fp, "java MainApp 1 100 %s %s %s >> result/init_winrate/%s.txt ;" % (i, player[p], player[p], player[p])
        print >> fp, "echo BoardNumber : %s >> result/init_winrate/%s.txt ;" % (i, player[p])
        print >> fp, "echo  >> result/init_winrate/%s.txt ; " % (player[p])
    print >> fp, "echo finished"
    fp.close()
