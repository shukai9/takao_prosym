# python 3
# -*- coding: utf-8 -*-
import re
import xlwt

player = ["random100", "hyouka-0-100", "MC-100", "MCT", "EPT_MCT1730", "EPT_MCT8500", "AlphaBeta1", "AlphaBeta2", "AlphaBeta4"]


file = open("test.txt", "r")
book = xlwt.Workbook()
sheet1 = book.add_sheet('sheet1')

string = file.readlines()
sheet1.write(0, 0, "boardnum") #boardnum
for i in range(1, len(player) + 1):
    sheet1.write(0, i, player[i-1])
    sheet1.write(i, 0, player[i-1])

# player_len = len(player)
# count = 0
# for j in range(player_len):
#     sheet1.write(j, 0, player[j])
#     for i in range(player_len):
#         data = string[count].split(":")[1]
#         sheet1.write(j, i, data)
book.save("test.xls")
file.close()
