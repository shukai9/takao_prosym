# python 2.7.10
# -*- coding: utf-8 -*-

board_data = [130, 452, 789, 680, 891, 544, 954, 995, 361, 673, 52, 399, 417, 631, 648, 714, 390, 615, 566, 401, 731, 596, 162, 745, 827, 708, 514, 113, 541, 675, 348, 686, 172, 259, 216, 907, 804, 826, 246, 261, 264, 886, 569, 897, 837, 391, 872, 156, 379, 252, 749, 195, 257, 238, 654, 658, 126, 284, 151, 314, 611, 770, 328, 823, 6, 666, 967, 485, 54, 155, 169, 208, 733, 817, 546, 486, 774, 682, 174, 958, 112, 769, 148, 664, 972, 5, 454, 455, 80, 429, 16, 46, 198, 549, 313, 423, 735, 281, 178, 592]

fp = open("script/copy1.sh", "w")
for i in range(100):
    print >> fp, "#!/bin/"
    print >> fp, "grep PLAYDATA result/board1/board%d.txt > result/board1copy/board%d.txt" % (board_data[i], board_data[i])
fp.close()