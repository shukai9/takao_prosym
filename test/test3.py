# python 3
# -*- coding: utf-8 -*-
import re
import openpyxl as px

player = ["random100", "hyouka-0-100", "MC-100", "MCT", "EPT_MCT1730", "EPT_MCT8500", "AlphaBeta1", "AlphaBeta2", "AlphaBeta4"]


file = open("test.txt", "r")
string = file.readlines()
wb = px.Workbook()

player_len = len(player)
datalist = []
count = 0
# for j in range(player_len):
#     for i in range(player_len):
#         data = [string[count].split(":")[1]]
#         datalist.append(data)
#         count+=1
df = pd.DataFrame([[(59, 39, 1)], [(67, 67, 5)], [(54, 65, 2)]], index = player, columns = player)
print(df)
# sheet.cell(row=0, column=0, value="boardnum")

file.close()
