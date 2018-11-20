#!/bin/
python rate/rate10_1T_random.py ;
sh rate/rate10_1T_random.sh ;
python3  rate/rate1T_random.py ;
python rate/rate10_1T_MC.py ;
sh rate/rate10_1T_MC.sh ;
python3  rate/rate1T_MC.py ;
python rate/rate10_1T_MCT.py ;
sh rate/rate10_1T_MCT.sh ;
python3  rate/rate1T_MCT.py ;
python rate/rate10_1T_EPT1730.py ;
sh rate/rate10_1T_EPT1730.sh ;
python3  rate/rate1T_EPT1730.py ;
python rate/rate10_1T_EPT8500.py ;
sh rate/rate10_1T_EPT8500.sh ;
python3  rate/rate1T_EPT8500.py ;
