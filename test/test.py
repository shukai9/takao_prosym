# python 2.7.10
# -*- coding: utf-8 -*-
import re

player = ["random100", "hyouka-0-100", "MC-100", "MCT", "EPT_MCT1730", "EPT_MCT8500", "AlphaBeta1", "AlphaBeta2", "AlphaBeta4"]

file = open("test.txt", "r")
excel = open("excel.txt", "w")

string = file.readlines()
s1 = ""
for i in range(len(player)):
    s1 = s1 + " " + player[i]
s1 = s1 + "\n"
excel.write(s1)

player_len = len(player)
count = 0
for j in range(player_len):
    excel.write(player[j])
    excel.write(" ")
    for i in range(player_len):
        data = string[count].split(":")[1]
        data = data.replace(" ", "")
        data = data.replace("\n", "")
        data = data.replace("\r", "")
        data = data + (" ")
        excel.write(data)
        count += 1
        if (count==9):
            excel.write("\n")
            count = 0
file.close()
excel.close()
