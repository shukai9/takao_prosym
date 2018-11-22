# python 2
# -*- coding: utf-8 -*-
# シードを10から100まで+10ずつ

board_data = [130, 452, 789, 680, 891, 544, 954, 995, 361, 673, 52, 399, 417, 631, 648, 714, 390, 615, 566, 401, 731, 596, 162, 745, 827, 708, 514, 113, 541, 675, 348, 686, 172, 259, 216, 907, 804, 826, 246, 261, 264, 886, 569, 897, 837, 391, 872, 156, 379, 252, 749, 195, 257, 238, 654, 658, 126, 284, 151, 314, 611, 770, 328, 823, 6, 666, 967, 485, 54, 155, 169, 208, 733, 817, 546, 486, 774, 682, 174, 958, 112, 769, 148, 664, 972, 5, 454, 455, 80, 429, 16, 46, 198, 549, 313, 423, 735, 281, 178, 592]
win_rate = [32, 72, 33, 51, 51, 68, 33, 58, 21, 53, 28, 52, 68, 33, 84, 74, 28, 41, 40, 35, 61, 48, 64, 65, 55, 71, 73, 24, 12, 84, 71, 40, 38, 64, 72, 12, 23, 11, 56, 48, 43, 45, 38, 29, 23, 29, 55, 60, 53, 32, 65, 54, 84, 64, 41, 68, 22, 55, 48, 55, 45, 72, 76, 73, 53, 11, 69, 51, 46, 44, 50, 56, 47, 74, 51, 31, 19, 64, 48, 23, 29, 39, 61, 69, 55, 28, 38, 75, 32, 34, 22, 62, 67, 71, 40, 24, 66, 65, 70, 23]

fp = open("rate/rate10_1T_EPT1730.sh", "w")
for i in range(100):
    for seed in range(10, 110, 10):
        print >> fp, "#!/bin/"
        print >> fp, "java Trate %d 1 %d %d ../result/board1copy/board%d.txt >> ../result/board1rateT_EPT1730/board%d.txt ;" % (seed, board_data[i], win_rate[i], board_data[i], board_data[i])
fp.close()