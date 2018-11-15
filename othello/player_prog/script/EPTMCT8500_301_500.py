# python 2.7.10
# -*- coding: utf-8 -*-
# 途中盤面165〜300までをEPTMCT8500プレイヤで100試合ずつ 11/14

player = "EPT_MCT8500"


filename = "script/player_script/EPTMCT8500_301_500.sh"
fp = open(filename, "w")
print >> fp, "#!/bin/"
for i in range(301, 501):
    print >> fp, "java MainApp 1 100 %s %s %s >> result/init_winrate/EPTMCT8500_301_501.txt ;" % (i, player, player)
    print >> fp, "echo BoardNumber : %s >> result/init_winrate/EPTMCT8500_301_501.txt ;" % (i)
    print >> fp, "echo  >> result/init_winrate/EPTMCT8500_301_501.txt ; "
print >> fp, "echo finished"
fp.close()