# python 2.7.10
# -*- coding: utf-8 -*-

style = ["1", "1"]
gamecount = ["2", "3"]
bplayer = ["random100", "random100"]
wplayer = ["random100", "MCT"]

for i in range(2):
    filename = "run_%02d.sh" % i
    fp = open(filename, "w")

    print >> fp, "#!/bin/"
    print >> fp, "java MainApp %s %s %s %s > result/othello_%s.txt" % (style[i], gamecount[i], bplayer[i], wplayer[i], i)
    print >> fp, "echo finished"
    fp.close()
