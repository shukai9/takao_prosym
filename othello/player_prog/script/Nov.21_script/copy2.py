# python 2.7.10
# -*- coding: utf-8 -*-

board_data = [641, 795, 433, 411, 184, 530, 334, 798, 722, 204, 505, 587, 215, 82, 453, 856, 201, 598, 676, 74, 616, 719, 980, 600, 123, 583, 432, 994, 333, 585, 464, 4, 53, 738, 812, 70, 69, 442, 537, 644, 963, 683, 388, 133, 354, 861, 152, 335, 465, 904, 953, 64, 230, 832, 834, 568, 778, 135, 450, 289, 504, 239, 750, 866, 106, 186, 83, 574, 605, 677, 900, 225, 229, 562, 408, 496, 237, 311, 702, 761, 56, 241, 243, 502, 988, 197, 111, 33, 393, 398, 338, 622, 326, 894, 370, 940, 991, 493, 137, 430]

fp = open("script/copy2.sh", "w")
for i in range(100):
    print >> fp, "#!/bin/"
    print >> fp, "grep PLAYDATA result/board2/board%d.txt > result/board2copy/board%d.txt" % (board_data[i], board_data[i])
fp.close()