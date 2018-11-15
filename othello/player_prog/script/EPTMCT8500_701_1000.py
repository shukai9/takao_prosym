# python 2.7.10
# -*- coding: utf-8 -*-
# 途中盤面165〜300までをEPTMCT8500プレイヤで100試合ずつ 11/14

player = "EPT_MCT8500"


filename = "script/player_script/EPTMCT8500_701_1000.sh"
fp = open(filename, "w")
print >> fp, "#!/bin/"
for i in range(701, 1001):
    print >> fp, "java MainApp 1 100 %s %s %s >> result/init_winrate/EPTMCT8500_701_1000.txt ;" % (i, player, player)
    print >> fp, "echo BoardNumber : %s >> result/init_winrate/EPTMCT8500_701_1000.txt ;" % (i)
    print >> fp, "echo  >> result/init_winrate/EPTMCT8500_701_1000.txt ; "
print >> fp, "echo finished"
fp.close()
