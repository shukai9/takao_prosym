# python 2.7.10
# -*- coding: utf-8 -*-
# 途中盤面101〜200までを各プレイヤで100試合ずつ 11/15

player = ["random100", "hyouka-0-100", "MC-100", "MCT", "EPT_MCT1730", "EPT_MCT8500", "AlphaBeta1", "AlphaBeta2", "AlphaBeta4"]
board1 = [130, 452, 789, 680, 891, 544, 954, 995, 361, 673, 52, 399, 417, 631, 648, 714, 390, 615, 566, 401, 731, 596, 162, 745, 827, 708, 514, 113, 541, 675, 348, 686, 172, 259, 216, 907, 804, 826, 246, 261, 264, 886, 569, 897, 837, 391, 872, 156, 379, 252, 749, 195, 257, 238, 654, 658, 126, 284, 151, 314, 611, 770, 328, 823, 6, 666, 967, 485, 54, 155, 169, 208, 733, 817, 546, 486, 774, 682, 174, 958, 112, 769, 148, 664, 972, 5, 454, 455, 80, 429, 16, 46, 198, 549, 313, 423, 735, 281, 178, 592]
board2 = [641, 795, 433, 411, 184, 530, 334, 798, 722, 204, 505, 587, 215, 82, 453, 856, 201, 598, 676, 74, 616, 719, 980, 600, 123, 583, 432, 994, 333, 585, 464, 4, 53, 738, 812, 70, 69, 442, 537, 644, 963, 683, 388, 133, 354, 861, 152, 335, 465, 904, 953, 64, 230, 832, 834, 568, 778, 135, 450, 289, 504, 239, 750, 866, 106, 186, 83, 574, 605, 677, 900, 225, 229, 562, 408, 496, 237, 311, 702, 761, 56, 241, 243, 502, 988, 197, 111, 33, 393, 398, 338, 622, 326, 894, 370, 940, 991, 493, 137, 430]
board3 = [624, 811, 575, 961, 883, 179, 260, 500, 688, 824, 165, 509, 555, 520, 122, 18, 109, 285, 413, 277, 981, 48, 402, 414, 642, 944, 767, 783, 488, 209, 467, 639, 764, 947, 86, 427, 501, 743, 918, 986, 24, 371, 623, 668, 748, 807, 217, 638, 495, 254, 604, 618, 57, 202, 2, 190, 881, 26, 158, 607, 819, 715, 916, 517, 788, 840, 177, 171, 591, 818, 72, 558, 822, 874, 424, 489, 1000, 862, 554, 97, 780, 908, 49, 563, 943, 168, 337, 539, 61, 468, 550, 829, 327, 752, 800, 849, 890, 349, 633, 828]

fp = open("script/board1.sh", "w")
print >> fp, "#!/bin/"
for i in range(100):
    for x in range(9):
        for y in range(9):
            print >> fp, "java MainApp 1 100 %s %s %s >> result/board1/board%s.txt ;" % (board1[i], player[x], player[y], board1[i])
            print >> fp, "echo BoardNumber : %s >> result/board1/board%s.txt ;" % (board1[i], board1[i])
            print >> fp, "echo  >> result/board1/board%s.txt ; " % (board1[i])
print >> fp, "echo finished"
fp.close()

fp = open("script/board2.sh", "w")
print >> fp, "#!/bin/"
for i in range(100):
    for x in range(9):
        for y in range(9):
            print >> fp, "java MainApp 1 100 %s %s %s >> result/board2/board%s.txt ;" % (board2[i], player[x], player[y], board2[i])
            print >> fp, "echo BoardNumber : %s >> result/board2/board%s.txt ;" % (board2[i], board2[i])
            print >> fp, "echo  >> result/board2/board%s.txt ; " % (board2[i])
print >> fp, "echo finished"
fp.close()

fp = open("script/board3.sh", "w")
print >> fp, "#!/bin/"
for i in range(100):
    for x in range(9):
        for y in range(9):
            print >> fp, "java MainApp 1 100 %s %s %s >> result/board3/board%s.txt ;" % (board3[i], player[x], player[y], board3[i])
            print >> fp, "echo BoardNumber : %s >> result/board3/board%s.txt ;" % (board3[i], board3[i])
            print >> fp, "echo  >> result/board3/board%s.txt ; " % (board3[i])
print >> fp, "echo finished"
fp.close()
