# python 2
# -*- coding: utf-8 -*-
# シードを10から100まで+10ずつ

board_data = [130, 452, 789, 680, 891, 544, 954, 995, 361, 673, 52, 399, 417, 631, 648, 714, 390, 615, 566, 401, 731, 596, 162, 745, 827, 708, 514, 113, 541, 675, 348, 686, 172, 259, 216, 907, 804, 826, 246, 261, 264, 886, 569, 897, 837, 391, 872, 156, 379, 252, 749, 195, 257, 238, 654, 658, 126, 284, 151, 314, 611, 770, 328, 823, 6, 666, 967, 485, 54, 155, 169, 208, 733, 817, 546, 486, 774, 682, 174, 958, 112, 769, 148, 664, 972, 5, 454, 455, 80, 429, 16, 46, 198, 549, 313, 423, 735, 281, 178, 592]
win_rate = [49, 50, 48, 51, 51, 50, 47, 49, 20, 46, 45, 45, 53, 45, 45, 52, 53, 53, 54, 44, 54, 44, 52, 55, 55, 42, 56, 42, 56, 56, 57, 54, 42, 57, 58, 58, 40, 41, 40, 40, 57, 58, 59, 36, 39, 40, 40, 59, 60, 37, 59, 60, 48, 58, 59, 61, 38, 38, 61, 61, 61, 60, 61, 62, 37, 37, 61, 62, 37, 62, 62, 62, 62, 63, 63, 34, 36, 62, 63, 64, 35, 35, 63, 63, 64, 34, 64, 65, 33, 33, 34, 34, 64, 65, 33, 33, 64, 65, 66, 66]

fp = open("rate/rate10_1T_EPT8500.sh", "w")
for i in range(100):
    for seed in range(10, 110, 10):
        print >> fp, "#!/bin/"
        print >> fp, "java Trate %d 1 %d %d ../result/board1copy/board%d.txt >> ../result/board1rateT_EPT8500/board%d.txt ;" % (seed, board_data[i], win_rate[i], board_data[i], board_data[i])
fp.close()
