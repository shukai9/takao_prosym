# python 3
# -*- coding: utf-8 -*-
import re
import pandas as pd
import openpyxl

file = open("test.txt", "r")
string = file.readlines()

string.to_excel("excel.xlsx")

file.close()
