# python 2.7.10
# -*- coding: utf-8 -*-
# 途中盤面1〜100までを???プレイヤで100試合ずつ 11/12

player = "EPT_MCT8500"


filename = "script/player_script/%s.sh" % (player)
fp = open(filename, "w")
print >> fp, "#!/bin/"
for i in range(500, 1001):
    print >> fp, "java MainApp 1 100 %s %s %s >> result/init_winrate/%s_500_1000.txt ;" % (i, player, player, player)
    print >> fp, "echo BoardNumber : %s >> result/init_winrate/%s_500_1000.txt ;" % (i, player)
    print >> fp, "echo  >> result/init_winrate/%s_500_1000.txt ; " % (player)
print >> fp, "echo finished"
fp.close()
