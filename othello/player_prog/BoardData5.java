import java.util.*;
import java.util.Scanner;

public class BoardData5 {
  final static int SIZE = 100;
  int data[] = new int[SIZE];
  int player;
  boolean isLastPass;

  public BoardData5(int boardnum){
      if (boardnum == 801){
    player = 1;
    isLastPass = false;
    data[13] = 1; data[14] = 1; data[15] = 1; data[16] = 1; data[17] = -1;
    data[23] = 1; data[25] = 1; data[26] = -1; data[33] = 1; data[34] = -1;
    data[35] = -1; data[36] = 1; data[38] = -1; data[43] = 1; data[44] = 1;
    data[45] = 1; data[46] = 1; data[47] = -1; data[54] = 1; data[55] = -1;
    data[56] = -1; data[57] = -1; }




      if (boardnum == 802){
    player = -1;
    isLastPass = false;
    data[33] = 1; data[34] = 1; data[35] = 1; data[36] = 1; data[37] = 1;
    data[42] = 1; data[43] = 1; data[44] = -1; data[45] = 1; data[46] = 1;
    data[52] = 1; data[53] = -1; data[54] = -1; data[55] = -1; data[56] = 1;
    data[61] = 1; data[63] = 1; data[64] = 1; data[65] = -1; data[66] = 1;
    data[72] = 1; data[74] = 1; data[75] = 1; data[76] = 1; data[83] = -1;
    data[84] = 1; data[86] = 1; }




      if (boardnum == 803){
    player = -1;
    isLastPass = false;
    data[14] = -1; data[16] = 1; data[23] = -1; data[24] = -1; data[25] = -1;
    data[26] = -1; data[27] = -1; data[33] = -1; data[34] = 1; data[35] = 1;
    data[36] = -1; data[37] = -1; data[38] = -1; data[42] = -1; data[43] = -1;
    data[44] = 1; data[45] = -1; data[46] = 1; data[47] = -1; data[51] = -1;
    data[53] = -1; data[54] = -1; data[55] = -1; data[56] = 1; data[57] = 1;
    data[64] = -1; data[65] = -1; data[66] = 1; data[67] = -1; }




      if (boardnum == 804){
    player = 1;
    isLastPass = false;
    data[16] = 1; data[24] = 1; data[25] = 1; data[33] = 1; data[34] = 1;
    data[37] = 1; data[42] = -1; data[43] = 1; data[44] = -1; data[45] = -1;
    data[46] = -1; data[47] = -1; data[51] = -1; data[52] = 1; data[53] = -1;
    data[54] = -1; data[55] = -1; data[56] = -1; data[61] = 1; data[63] = -1;
    data[64] = -1; data[65] = -1; data[66] = -1; data[73] = -1; }




      if (boardnum == 805){
    player = -1;
    isLastPass = false;
    data[24] = 1; data[26] = -1; data[31] = 1; data[32] = 1; data[33] = 1;
    data[34] = 1; data[35] = -1; data[36] = -1; data[42] = 1; data[43] = 1;
    data[44] = 1; data[45] = 1; data[46] = -1; data[47] = -1; data[53] = 1;
    data[54] = 1; data[55] = 1; data[56] = -1; data[61] = 1; data[62] = 1;
    data[63] = 1; data[64] = 1; data[65] = 1; data[66] = -1; data[73] = 1;
    data[74] = 1; data[75] = 1; data[77] = -1; data[88] = -1; }




      if (boardnum == 806){
    player = 1;
    isLastPass = false;
    data[11] = 1; data[12] = 1; data[13] = 1; data[14] = 1; data[15] = 1;
    data[22] = 1; data[23] = 1; data[24] = 1; data[25] = 1; data[26] = 1;
    data[28] = -1; data[32] = 1; data[33] = 1; data[34] = 1; data[35] = -1;
    data[36] = 1; data[37] = -1; data[42] = -1; data[43] = 1; data[44] = -1;
    data[45] = 1; data[46] = -1; data[47] = -1; data[51] = -1; data[52] = -1;
    data[54] = 1; data[55] = -1; data[56] = -1; data[57] = -1; data[58] = -1;
    data[63] = -1; data[64] = 1; data[65] = 1; data[66] = -1; data[67] = -1;
    data[68] = -1; data[76] = 1; data[77] = 1; data[86] = 1; data[88] = 1;
    }




      if (boardnum == 807){
    player = 1;
    isLastPass = false;
    data[33] = -1; data[34] = -1; data[35] = -1; data[36] = -1; data[37] = -1;
    data[43] = 1; data[44] = -1; data[45] = 1; data[46] = -1; data[54] = 1;
    data[55] = -1; data[56] = 1; data[57] = -1; data[62] = -1; data[63] = -1;
    data[64] = -1; }




      if (boardnum == 808){
    player = 1;
    isLastPass = false;
    data[21] = -1; data[32] = -1; data[33] = -1; data[34] = -1; data[35] = -1;
    data[36] = -1; data[37] = -1; data[43] = -1; data[44] = -1; data[45] = -1;
    data[46] = -1; data[47] = -1; data[48] = -1; data[51] = -1; data[52] = -1;
    data[53] = -1; data[54] = -1; data[55] = 1; data[56] = -1; data[57] = -1;
    data[62] = -1; data[63] = -1; data[64] = -1; data[65] = 1; data[66] = -1;
    data[67] = -1; data[73] = -1; data[74] = -1; data[75] = -1; data[76] = -1;
    data[78] = -1; data[84] = -1; data[85] = -1; data[86] = -1; }




      if (boardnum == 809){
    player = -1;
    isLastPass = false;
    data[15] = 1; data[24] = 1; data[25] = 1; data[26] = 1; data[31] = -1;
    data[32] = -1; data[33] = 1; data[34] = 1; data[35] = 1; data[36] = 1;
    data[37] = 1; data[42] = 1; data[43] = -1; data[44] = 1; data[45] = -1;
    data[46] = 1; data[47] = 1; data[51] = 1; data[53] = 1; data[54] = -1;
    data[55] = -1; data[56] = 1; data[63] = 1; data[64] = 1; data[65] = 1;
    data[66] = -1; data[73] = 1; data[74] = 1; data[83] = 1; }




      if (boardnum == 810){
    player = -1;
    isLastPass = false;
    data[18] = 1; data[25] = 1; data[27] = 1; data[32] = -1; data[34] = -1;
    data[35] = 1; data[36] = -1; data[37] = -1; data[43] = -1; data[44] = -1;
    data[45] = 1; data[46] = -1; data[54] = -1; data[55] = 1; data[56] = -1;
    data[57] = -1; data[64] = -1; data[65] = 1; data[66] = 1; }




      if (boardnum == 811){
    player = -1;
    isLastPass = false;
    data[25] = 1; data[34] = 1; data[35] = 1; data[44] = -1; data[45] = -1;
    data[46] = -1; data[52] = 1; data[53] = 1; data[54] = -1; data[55] = -1;
    data[56] = 1; data[64] = 1; data[65] = 1; data[75] = 1; data[76] = 1;
    }




      if (boardnum == 812){
    player = 1;
    isLastPass = false;
    data[13] = -1; data[24] = -1; data[33] = -1; data[34] = 1; data[35] = -1;
    data[36] = 1; data[37] = 1; data[44] = 1; data[45] = 1; data[46] = 1;
    data[47] = 1; data[53] = -1; data[54] = -1; data[55] = -1; data[56] = 1;
    data[64] = 1; data[65] = -1; data[76] = -1; }




      if (boardnum == 813){
    player = -1;
    isLastPass = false;
    data[25] = 1; data[26] = -1; data[32] = -1; data[33] = 1; data[34] = 1;
    data[35] = 1; data[42] = -1; data[43] = -1; data[44] = 1; data[45] = -1;
    data[46] = -1; data[52] = -1; data[53] = -1; data[54] = -1; data[55] = 1;
    data[56] = -1; data[57] = -1; data[58] = -1; data[63] = 1; data[64] = -1;
    data[65] = 1; data[66] = 1; data[67] = -1; data[68] = 1; data[74] = 1;
    data[75] = -1; data[76] = -1; data[77] = 1; data[84] = 1; data[86] = -1;
    data[88] = 1; }




      if (boardnum == 814){
    player = 1;
    isLastPass = false;
    data[11] = -1; data[12] = -1; data[13] = -1; data[14] = -1; data[15] = -1;
    data[16] = -1; data[17] = -1; data[18] = -1; data[21] = 1; data[22] = 1;
    data[23] = -1; data[24] = -1; data[25] = 1; data[26] = 1; data[27] = -1;
    data[28] = -1; data[31] = 1; data[32] = 1; data[33] = 1; data[34] = -1;
    data[35] = 1; data[36] = -1; data[37] = -1; data[38] = -1; data[41] = -1;
    data[43] = 1; data[44] = -1; data[45] = -1; data[46] = -1; data[47] = 1;
    data[54] = -1; data[55] = -1; data[56] = 1; data[57] = 1; data[63] = -1;
    data[64] = -1; data[65] = 1; data[66] = -1; data[67] = 1; data[74] = 1;
    data[76] = -1; data[78] = 1; }




      if (boardnum == 815){
    player = 1;
    isLastPass = false;
    data[13] = -1; data[14] = -1; data[23] = -1; data[24] = -1; data[25] = -1;
    data[26] = -1; data[33] = -1; data[34] = -1; data[35] = -1; data[36] = -1;
    data[42] = -1; data[44] = -1; data[45] = 1; data[46] = -1; data[47] = -1;
    data[48] = -1; data[53] = -1; data[54] = -1; data[55] = 1; data[56] = 1;
    data[57] = -1; data[58] = -1; data[63] = 1; data[64] = -1; data[65] = 1;
    data[66] = -1; data[67] = 1; data[75] = 1; }




      if (boardnum == 816){
    player = 1;
    isLastPass = false;
    data[15] = 1; data[16] = -1; data[21] = 1; data[22] = -1; data[23] = 1;
    data[25] = -1; data[26] = 1; data[32] = -1; data[34] = 1; data[36] = -1;
    data[37] = 1; data[41] = 1; data[42] = -1; data[43] = -1; data[44] = -1;
    data[45] = 1; data[46] = -1; data[47] = -1; data[52] = -1; data[54] = 1;
    data[55] = -1; data[56] = 1; data[57] = -1; data[63] = -1; data[64] = -1;
    data[65] = -1; data[66] = -1; data[67] = -1; data[68] = -1; data[73] = 1;
    data[74] = 1; data[75] = 1; data[76] = 1; data[85] = -1; }




      if (boardnum == 817){
    player = -1;
    isLastPass = false;
    data[13] = -1; data[14] = 1; data[24] = 1; data[25] = 1; data[26] = -1;
    data[33] = -1; data[34] = 1; data[35] = -1; data[36] = 1; data[43] = -1;
    data[44] = -1; data[45] = 1; data[46] = 1; data[47] = 1; data[53] = -1;
    data[54] = -1; data[55] = 1; data[56] = 1; data[63] = -1; data[64] = -1;
    data[65] = -1; }




      if (boardnum == 818){
    player = -1;
    isLastPass = false;
    data[13] = 1; data[14] = 1; data[15] = 1; data[16] = 1; data[23] = -1;
    data[24] = -1; data[25] = 1; data[26] = -1; data[27] = -1; data[33] = -1;
    data[34] = 1; data[35] = 1; data[36] = -1; data[37] = -1; data[43] = 1;
    data[44] = -1; data[45] = -1; data[46] = 1; data[47] = 1; data[52] = 1;
    data[53] = -1; data[54] = -1; data[55] = -1; }




      if (boardnum == 819){
    player = -1;
    isLastPass = false;
    data[13] = -1; data[16] = 1; data[23] = -1; data[24] = -1; data[25] = 1;
    data[26] = 1; data[32] = 1; data[33] = -1; data[34] = -1; data[35] = 1;
    data[36] = 1; data[37] = -1; data[38] = -1; data[41] = 1; data[42] = 1;
    data[43] = 1; data[44] = 1; data[45] = -1; data[46] = -1; data[47] = -1;
    data[48] = -1; data[53] = -1; data[54] = 1; data[55] = -1; data[56] = -1;
    data[57] = -1; data[58] = -1; data[63] = -1; data[64] = -1; data[65] = 1;
    data[66] = 1; data[67] = -1; data[68] = -1; data[73] = -1; data[74] = 1;
    }




      if (boardnum == 820){
    player = -1;
    isLastPass = false;
    data[11] = -1; data[12] = 1; data[13] = -1; data[21] = -1; data[23] = 1;
    data[24] = 1; data[26] = 1; data[31] = -1; data[32] = 1; data[33] = -1;
    data[34] = 1; data[35] = 1; data[36] = 1; data[41] = -1; data[42] = -1;
    data[43] = 1; data[44] = 1; data[45] = -1; data[46] = 1; data[51] = -1;
    data[52] = -1; data[53] = -1; data[54] = 1; data[55] = 1; data[56] = 1;
    data[62] = -1; data[63] = -1; data[64] = 1; data[65] = 1; data[73] = -1;
    data[74] = 1; data[82] = -1; data[83] = -1; data[84] = -1; data[85] = -1;
    }




      if (boardnum == 821){
    player = 1;
    isLastPass = false;
    data[21] = 1; data[24] = -1; data[25] = 1; data[31] = 1; data[32] = 1;
    data[33] = -1; data[34] = 1; data[35] = 1; data[41] = 1; data[42] = -1;
    data[43] = 1; data[44] = -1; data[45] = 1; data[51] = 1; data[52] = 1;
    data[53] = -1; data[54] = 1; data[55] = 1; data[56] = 1; data[57] = 1;
    data[61] = 1; data[62] = 1; data[63] = -1; data[64] = -1; data[65] = 1;
    data[66] = 1; data[71] = 1; data[73] = -1; data[74] = -1; data[75] = -1;
    data[82] = -1; data[83] = -1; data[84] = -1; data[86] = -1; }




      if (boardnum == 822){
    player = -1;
    isLastPass = false;
    data[25] = 1; data[34] = 1; data[35] = 1; data[36] = 1; data[44] = 1;
    data[45] = 1; data[46] = 1; data[47] = -1; data[48] = -1; data[54] = 1;
    data[55] = -1; data[57] = 1; data[64] = -1; data[65] = -1; data[66] = -1;
    data[67] = -1; data[68] = 1; data[75] = -1; data[76] = 1; }




      if (boardnum == 823){
    player = -1;
    isLastPass = false;
    data[25] = -1; data[26] = 1; data[34] = 1; data[35] = 1; data[36] = 1;
    data[37] = -1; data[43] = 1; data[44] = 1; data[45] = -1; data[46] = -1;
    data[53] = -1; data[54] = 1; data[55] = -1; data[64] = -1; data[73] = -1;
    }




      if (boardnum == 824){
    player = -1;
    isLastPass = false;
    data[15] = 1; data[16] = -1; data[24] = 1; data[25] = 1; data[26] = 1;
    data[33] = -1; data[34] = -1; data[35] = 1; data[36] = 1; data[37] = 1;
    data[43] = -1; data[44] = -1; data[45] = 1; data[46] = -1; data[53] = 1;
    data[54] = 1; data[55] = 1; data[56] = 1; data[57] = -1; }




      if (boardnum == 825){
    player = 1;
    isLastPass = false;
    data[23] = -1; data[25] = -1; data[32] = -1; data[33] = -1; data[34] = -1;
    data[35] = 1; data[36] = 1; data[37] = -1; data[43] = -1; data[44] = 1;
    data[45] = -1; data[46] = 1; data[47] = 1; data[48] = 1; data[53] = -1;
    data[54] = -1; data[55] = -1; data[57] = -1; }




      if (boardnum == 826){
    player = 1;
    isLastPass = false;
    data[13] = 1; data[15] = -1; data[18] = -1; data[21] = -1; data[23] = 1;
    data[24] = -1; data[25] = -1; data[27] = -1; data[32] = -1; data[33] = 1;
    data[34] = 1; data[35] = 1; data[36] = -1; data[37] = -1; data[38] = -1;
    data[42] = 1; data[43] = -1; data[44] = -1; data[45] = 1; data[46] = -1;
    data[47] = -1; data[52] = 1; data[53] = -1; data[54] = -1; data[55] = -1;
    data[56] = -1; data[57] = 1; data[61] = 1; data[63] = 1; data[64] = 1;
    data[65] = -1; data[66] = -1; data[67] = 1; data[68] = 1; data[73] = 1;
    data[74] = 1; data[75] = -1; data[76] = -1; data[77] = -1; data[88] = -1;
    }




      if (boardnum == 827){
    player = -1;
    isLastPass = false;
    data[13] = -1; data[14] = 1; data[23] = -1; data[24] = 1; data[25] = 1;
    data[26] = 1; data[32] = -1; data[33] = -1; data[34] = 1; data[35] = 1;
    data[36] = 1; data[43] = -1; data[44] = 1; data[45] = 1; data[46] = 1;
    data[53] = -1; data[54] = 1; data[55] = 1; data[63] = -1; data[64] = 1;
    data[65] = -1; data[66] = -1; data[73] = -1; data[75] = 1; data[76] = -1;
    }




      if (boardnum == 828){
    player = 1;
    isLastPass = false;
    data[25] = 1; data[34] = 1; data[35] = 1; data[36] = 1; data[43] = 1;
    data[44] = -1; data[45] = 1; data[46] = -1; data[47] = -1; data[53] = 1;
    data[54] = -1; data[55] = -1; data[56] = -1; data[57] = -1; data[63] = 1;
    data[64] = -1; data[65] = -1; data[67] = 1; }




      if (boardnum == 829){
    player = 1;
    isLastPass = false;
    data[36] = -1; data[42] = -1; data[44] = -1; data[45] = -1; data[52] = -1;
    data[53] = -1; data[54] = -1; data[55] = 1; data[56] = 1; data[62] = -1;
    data[63] = -1; data[64] = 1; data[65] = 1; data[66] = 1; data[74] = -1;
    data[75] = -1; data[76] = 1; data[85] = -1; }




      if (boardnum == 830){
    player = 1;
    isLastPass = false;
    data[11] = 1; data[13] = -1; data[14] = -1; data[15] = -1; data[16] = -1;
    data[21] = -1; data[22] = -1; data[23] = -1; data[24] = -1; data[25] = 1;
    data[26] = -1; data[31] = 1; data[32] = -1; data[33] = 1; data[34] = 1;
    data[35] = 1; data[36] = -1; data[37] = 1; data[38] = 1; data[42] = -1;
    data[43] = 1; data[44] = 1; data[45] = -1; data[46] = -1; data[53] = -1;
    data[54] = -1; data[55] = -1; data[62] = -1; data[63] = -1; data[64] = -1;
    data[66] = 1; data[73] = 1; }




      if (boardnum == 831){
    player = -1;
    isLastPass = false;
    data[15] = 1; data[24] = 1; data[26] = 1; data[32] = 1; data[33] = 1;
    data[34] = 1; data[35] = -1; data[44] = 1; data[45] = 1; data[46] = -1;
    data[53] = 1; data[54] = 1; data[55] = 1; data[56] = 1; data[62] = 1;
    data[64] = 1; data[74] = 1; }




      if (boardnum == 832){
    player = 1;
    isLastPass = false;
    data[32] = -1; data[34] = 1; data[36] = -1; data[42] = 1; data[43] = 1;
    data[44] = 1; data[45] = 1; data[46] = -1; data[47] = -1; data[53] = 1;
    data[54] = -1; data[55] = -1; data[56] = -1; data[57] = -1; data[62] = 1;
    data[64] = -1; data[65] = -1; data[66] = -1; data[67] = 1; data[76] = -1;
    }




      if (boardnum == 833){
    player = -1;
    isLastPass = false;
    data[12] = 1; data[13] = -1; data[15] = 1; data[23] = 1; data[24] = -1;
    data[25] = 1; data[26] = 1; data[27] = -1; data[33] = 1; data[34] = 1;
    data[35] = -1; data[36] = 1; data[37] = 1; data[41] = -1; data[42] = -1;
    data[43] = -1; data[44] = -1; data[45] = -1; data[46] = -1; data[48] = 1;
    data[51] = -1; data[52] = -1; data[53] = -1; data[54] = -1; data[55] = -1;
    data[56] = -1; data[57] = 1; data[62] = -1; data[64] = 1; data[65] = 1;
    data[66] = 1; data[67] = 1; data[73] = -1; data[74] = 1; data[75] = 1;
    data[76] = -1; data[84] = 1; }




      if (boardnum == 834){
    player = 1;
    isLastPass = false;
    data[15] = 1; data[16] = -1; data[24] = -1; data[25] = -1; data[26] = -1;
    data[33] = -1; data[34] = -1; data[35] = -1; data[36] = -1; data[43] = -1;
    data[44] = 1; data[45] = 1; data[46] = -1; data[47] = 1; data[53] = -1;
    data[54] = -1; data[55] = 1; data[56] = -1; data[57] = 1; data[58] = 1;
    data[64] = -1; data[65] = 1; data[66] = -1; data[67] = 1; data[68] = 1;
    data[73] = -1; data[74] = 1; data[75] = 1; data[76] = 1; data[83] = 1;
    data[84] = 1; data[85] = 1; data[86] = 1; data[87] = 1; }




      if (boardnum == 835){
    player = -1;
    isLastPass = false;
    data[13] = 1; data[14] = 1; data[15] = 1; data[16] = 1; data[17] = 1;
    data[23] = 1; data[24] = 1; data[25] = -1; data[33] = 1; data[34] = -1;
    data[35] = 1; data[36] = 1; data[37] = 1; data[42] = 1; data[43] = 1;
    data[44] = -1; data[45] = 1; data[46] = 1; data[52] = 1; data[53] = -1;
    data[54] = -1; data[55] = 1; data[56] = 1; data[61] = 1; data[63] = 1;
    data[64] = 1; data[65] = 1; data[66] = 1; data[72] = 1; data[74] = 1;
    data[75] = 1; data[76] = 1; data[83] = -1; data[84] = 1; data[86] = 1;
    }




      if (boardnum == 836){
    player = 1;
    isLastPass = false;
    data[13] = -1; data[14] = 1; data[15] = 1; data[16] = -1; data[23] = -1;
    data[24] = 1; data[25] = 1; data[26] = 1; data[32] = -1; data[33] = -1;
    data[34] = -1; data[35] = 1; data[36] = 1; data[43] = -1; data[44] = -1;
    data[45] = 1; data[46] = 1; data[53] = -1; data[54] = -1; data[55] = 1;
    data[63] = -1; data[64] = -1; data[65] = -1; data[66] = -1; data[73] = -1;
    data[74] = -1; data[75] = -1; data[76] = -1; }




      if (boardnum == 837){
    player = 1;
    isLastPass = false;
    data[16] = 1; data[24] = 1; data[25] = 1; data[33] = 1; data[34] = 1;
    data[37] = 1; data[42] = -1; data[43] = 1; data[44] = -1; data[45] = -1;
    data[46] = -1; data[47] = -1; data[51] = -1; data[52] = 1; data[53] = -1;
    data[54] = -1; data[55] = -1; data[56] = -1; data[61] = 1; data[63] = -1;
    data[64] = -1; data[65] = -1; data[66] = -1; data[73] = -1; }




      if (boardnum == 838){
    player = -1;
    isLastPass = false;
    data[25] = -1; data[28] = 1; data[32] = -1; data[33] = -1; data[34] = -1;
    data[35] = -1; data[36] = -1; data[37] = 1; data[38] = 1; data[42] = 1;
    data[43] = 1; data[44] = 1; data[45] = -1; data[46] = 1; data[47] = -1;
    data[48] = 1; data[53] = 1; data[54] = 1; data[55] = -1; data[56] = -1;
    data[57] = 1; data[58] = 1; data[62] = 1; data[63] = 1; data[64] = 1;
    data[65] = 1; data[66] = 1; data[67] = 1; data[68] = 1; data[73] = 1;
    data[74] = 1; data[75] = 1; data[76] = -1; data[84] = 1; data[85] = 1;
    data[86] = 1; data[87] = 1; }




      if (boardnum == 839){
    player = -1;
    isLastPass = false;
    data[13] = -1; data[21] = -1; data[23] = -1; data[24] = -1; data[31] = 1;
    data[32] = 1; data[33] = 1; data[34] = -1; data[35] = -1; data[36] = -1;
    data[37] = -1; data[42] = 1; data[43] = 1; data[44] = 1; data[45] = -1;
    data[46] = -1; data[47] = -1; data[48] = -1; data[51] = -1; data[52] = -1;
    data[53] = 1; data[54] = 1; data[55] = 1; data[56] = -1; data[57] = -1;
    data[62] = -1; data[63] = -1; data[64] = 1; data[65] = 1; data[66] = -1;
    data[67] = -1; data[73] = -1; data[74] = 1; data[75] = -1; data[76] = -1;
    data[78] = -1; data[82] = -1; data[83] = -1; data[84] = -1; data[85] = -1;
    data[86] = -1; }




      if (boardnum == 840){
    player = -1;
    isLastPass = false;
    data[32] = -1; data[34] = 1; data[35] = -1; data[36] = -1; data[38] = 1;
    data[42] = 1; data[43] = 1; data[44] = 1; data[45] = -1; data[46] = -1;
    data[47] = 1; data[53] = 1; data[54] = -1; data[55] = -1; data[56] = 1;
    data[57] = 1; data[58] = 1; data[62] = 1; data[63] = -1; data[64] = -1;
    data[65] = -1; data[66] = 1; data[67] = 1; data[76] = 1; data[86] = 1;
    }




      if (boardnum == 841){
    player = -1;
    isLastPass = false;
    data[13] = 1; data[15] = 1; data[16] = 1; data[17] = -1; data[18] = -1;
    data[23] = 1; data[24] = 1; data[25] = 1; data[26] = 1; data[27] = -1;
    data[33] = 1; data[34] = 1; data[35] = -1; data[36] = -1; data[37] = 1;
    data[43] = 1; data[44] = -1; data[45] = 1; data[46] = -1; data[47] = -1;
    data[48] = -1; data[53] = 1; data[54] = -1; data[55] = 1; data[56] = 1;
    data[57] = 1; data[63] = 1; data[64] = 1; data[65] = 1; data[66] = 1;
    data[67] = 1; data[73] = 1; data[74] = 1; data[75] = 1; data[76] = 1;
    data[82] = 1; data[83] = 1; }




      if (boardnum == 842){
    player = -1;
    isLastPass = false;
    data[24] = 1; data[25] = 1; data[26] = -1; data[33] = -1; data[34] = 1;
    data[35] = 1; data[44] = 1; data[45] = 1; data[46] = 1; data[47] = 1;
    data[53] = -1; data[54] = 1; data[55] = 1; data[56] = 1; data[63] = 1;
    }




      if (boardnum == 843){
    player = -1;
    isLastPass = false;
    data[23] = -1; data[24] = 1; data[25] = 1; data[34] = 1; data[35] = 1;
    data[43] = -1; data[44] = -1; data[45] = -1; data[46] = 1; data[52] = 1;
    data[53] = 1; data[54] = 1; data[55] = 1; data[56] = 1; data[57] = 1;
    data[64] = 1; data[65] = 1; data[73] = 1; data[75] = 1; data[76] = 1;
    data[82] = 1; }




      if (boardnum == 844){
    player = 1;
    isLastPass = false;
    data[32] = 1; data[33] = 1; data[34] = 1; data[35] = -1; data[36] = -1;
    data[37] = -1; data[38] = -1; data[42] = 1; data[43] = -1; data[44] = -1;
    data[45] = -1; data[46] = -1; data[47] = -1; data[51] = 1; data[53] = -1;
    data[54] = 1; data[55] = 1; data[56] = -1; data[62] = 1; data[63] = 1;
    data[64] = 1; data[65] = 1; data[66] = 1; data[73] = 1; data[74] = 1;
    data[75] = 1; data[77] = 1; data[85] = 1; }




      if (boardnum == 845){
    player = 1;
    isLastPass = false;
    data[15] = 1; data[16] = -1; data[21] = 1; data[24] = 1; data[25] = 1;
    data[26] = -1; data[31] = 1; data[32] = 1; data[33] = 1; data[34] = 1;
    data[35] = 1; data[36] = -1; data[37] = -1; data[38] = -1; data[41] = 1;
    data[42] = -1; data[43] = 1; data[44] = 1; data[45] = -1; data[46] = 1;
    data[47] = 1; data[51] = 1; data[53] = 1; data[54] = 1; data[55] = 1;
    data[56] = 1; data[57] = 1; data[63] = 1; data[64] = 1; data[65] = 1;
    data[66] = -1; data[73] = 1; data[74] = 1; data[83] = 1; }




      if (boardnum == 846){
    player = -1;
    isLastPass = false;
    data[13] = 1; data[14] = 1; data[15] = 1; data[16] = 1; data[17] = 1;
    data[23] = 1; data[24] = 1; data[25] = 1; data[26] = 1; data[27] = 1;
    data[28] = -1; data[31] = 1; data[32] = 1; data[33] = 1; data[34] = 1;
    data[35] = -1; data[36] = 1; data[37] = 1; data[38] = -1; data[41] = -1;
    data[42] = 1; data[43] = -1; data[44] = -1; data[45] = -1; data[46] = -1;
    data[47] = 1; data[48] = -1; data[52] = 1; data[53] = 1; data[54] = 1;
    data[55] = -1; data[56] = 1; data[57] = 1; data[64] = 1; data[65] = 1;
    data[66] = 1; data[67] = 1; data[74] = 1; data[76] = 1; }





      if (boardnum == 848){
    player = -1;
    isLastPass = false;
    data[13] = 1; data[16] = 1; data[22] = 1; data[24] = 1; data[26] = 1;
    data[31] = 1; data[32] = 1; data[33] = -1; data[34] = 1; data[35] = 1;
    data[36] = 1; data[37] = 1; data[42] = 1; data[43] = 1; data[44] = -1;
    data[45] = 1; data[46] = 1; data[47] = 1; data[51] = -1; data[53] = 1;
    data[54] = 1; data[55] = -1; data[56] = 1; data[57] = 1; data[61] = 1;
    data[62] = -1; data[63] = 1; data[64] = -1; data[65] = 1; data[66] = -1;
    data[73] = 1; data[74] = 1; data[75] = -1; data[77] = -1; data[82] = -1;
    data[83] = 1; data[84] = -1; data[86] = -1; data[88] = -1; }




      if (boardnum == 849){
    player = -1;
    isLastPass = false;
    data[27] = -1; data[32] = -1; data[35] = 1; data[36] = -1; data[43] = -1;
    data[44] = 1; data[45] = 1; data[46] = 1; data[54] = -1; data[55] = 1;
    data[56] = -1; data[57] = -1; data[64] = -1; data[65] = 1; data[66] = 1;
    }




      if (boardnum == 850){
    player = -1;
    isLastPass = false;
    data[13] = 1; data[14] = 1; data[24] = 1; data[25] = 1; data[26] = 1;
    data[27] = 1; data[31] = 1; data[33] = 1; data[34] = 1; data[35] = 1;
    data[36] = 1; data[37] = 1; data[38] = 1; data[42] = 1; data[43] = -1;
    data[44] = -1; data[45] = -1; data[46] = -1; data[53] = 1; data[54] = 1;
    data[55] = -1; data[62] = 1; data[64] = 1; }




      if (boardnum == 851){
    player = 1;
    isLastPass = false;
    data[23] = -1; data[24] = -1; data[26] = 1; data[32] = 1; data[33] = 1;
    data[34] = -1; data[35] = 1; data[36] = 1; data[37] = 1; data[44] = -1;
    data[45] = -1; data[46] = 1; data[47] = -1; data[48] = -1; data[53] = 1;
    data[54] = 1; data[55] = 1; data[56] = 1; data[58] = 1; data[62] = 1;
    }




      if (boardnum == 852){
    player = 1;
    isLastPass = false;
    data[13] = 1; data[14] = -1; data[16] = 1; data[23] = -1; data[24] = -1;
    data[25] = -1; data[26] = -1; data[27] = -1; data[33] = -1; data[34] = -1;
    data[35] = 1; data[36] = -1; data[37] = -1; data[43] = -1; data[44] = -1;
    data[45] = -1; data[46] = 1; data[47] = 1; data[54] = 1; data[55] = -1;
    }




      if (boardnum == 853){
    player = -1;
    isLastPass = false;
    data[12] = 1; data[22] = 1; data[23] = 1; data[24] = 1; data[25] = 1;
    data[28] = 1; data[32] = -1; data[33] = -1; data[34] = -1; data[35] = -1;
    data[36] = -1; data[37] = 1; data[44] = 1; data[45] = 1; data[46] = 1;
    data[47] = 1; data[54] = -1; data[55] = 1; data[56] = -1; data[63] = -1;
    data[65] = 1; data[66] = 1; data[67] = -1; }




      if (boardnum == 854){
    player = 1;
    isLastPass = false;
    data[13] = 1; data[14] = -1; data[15] = -1; data[16] = -1; data[17] = -1;
    data[18] = -1; data[24] = 1; data[25] = -1; data[26] = -1; data[31] = -1;
    data[32] = -1; data[33] = -1; data[34] = -1; data[35] = -1; data[36] = -1;
    data[37] = -1; data[42] = 1; data[43] = 1; data[44] = -1; data[45] = -1;
    data[52] = 1; data[54] = -1; data[55] = 1; data[56] = 1; data[63] = 1;
    data[64] = -1; data[65] = 1; data[66] = 1; data[67] = 1; data[74] = 1;
    }




      if (boardnum == 855){
    player = -1;
    isLastPass = false;
    data[26] = 1; data[32] = 1; data[33] = 1; data[34] = 1; data[35] = 1;
    data[36] = 1; data[37] = -1; data[38] = -1; data[42] = 1; data[43] = -1;
    data[44] = 1; data[45] = -1; data[46] = 1; data[47] = -1; data[51] = 1;
    data[53] = 1; data[54] = 1; data[55] = 1; data[56] = 1; data[62] = 1;
    data[63] = 1; data[64] = 1; data[65] = 1; data[66] = 1; data[73] = 1;
    data[74] = 1; data[75] = 1; data[77] = 1; data[85] = 1; }




      if (boardnum == 856){
    player = -1;
    isLastPass = false;
    data[33] = -1; data[34] = -1; data[35] = -1; data[36] = -1; data[42] = 1;
    data[43] = 1; data[44] = -1; data[45] = -1; data[46] = 1; data[52] = -1;
    data[53] = 1; data[54] = -1; data[55] = 1; data[56] = 1; data[62] = -1;
    data[63] = -1; data[64] = -1; data[65] = 1; data[73] = 1; data[74] = 1;
    data[83] = 1; }




      if (boardnum == 857){
    player = 1;
    isLastPass = false;
    data[12] = -1; data[21] = -1; data[23] = -1; data[24] = -1; data[31] = -1;
    data[32] = -1; data[33] = -1; data[34] = -1; data[35] = -1; data[36] = -1;
    data[37] = -1; data[41] = 1; data[42] = -1; data[43] = -1; data[44] = -1;
    data[45] = -1; data[46] = -1; data[47] = -1; data[51] = 1; data[52] = 1;
    data[53] = -1; data[54] = -1; data[55] = -1; data[56] = -1; data[61] = 1;
    data[62] = -1; data[63] = -1; data[64] = -1; data[65] = -1; data[66] = -1;
    data[71] = 1; data[72] = -1; data[73] = -1; data[74] = -1; data[75] = -1;
    data[81] = 1; data[82] = -1; data[84] = -1; }




      if (boardnum == 858){
    player = 1;
    isLastPass = false;
    data[15] = 1; data[23] = 1; data[24] = 1; data[33] = 1; data[34] = -1;
    data[41] = 1; data[42] = 1; data[43] = 1; data[44] = -1; data[45] = 1;
    data[51] = -1; data[52] = -1; data[53] = -1; data[54] = -1; data[55] = -1;
    data[56] = -1; data[62] = -1; data[63] = 1; data[64] = 1; data[65] = 1;
    }




      if (boardnum == 859){
    player = 1;
    isLastPass = false;
    data[24] = -1; data[31] = 1; data[33] = -1; data[34] = -1; data[35] = 1;
    data[41] = 1; data[42] = -1; data[43] = -1; data[44] = -1; data[45] = 1;
    data[51] = 1; data[52] = -1; data[53] = -1; data[54] = -1; data[55] = 1;
    data[56] = 1; data[57] = 1; data[61] = 1; data[62] = 1; data[63] = -1;
    data[64] = -1; data[65] = 1; data[66] = 1; data[71] = 1; data[73] = -1;
    data[74] = -1; data[75] = -1; data[83] = 1; data[84] = -1; data[86] = -1;
    }




      if (boardnum == 860){
    player = -1;
    isLastPass = false;
    data[13] = -1; data[17] = -1; data[23] = -1; data[26] = -1; data[31] = -1;
    data[32] = -1; data[33] = -1; data[34] = -1; data[35] = -1; data[43] = 1;
    data[44] = 1; data[45] = 1; data[54] = 1; data[55] = 1; data[56] = 1;
    data[65] = 1; data[66] = -1; }




      if (boardnum == 861){
    player = 1;
    isLastPass = false;
    data[13] = 1; data[14] = -1; data[15] = -1; data[16] = -1; data[17] = -1;
    data[18] = -1; data[24] = 1; data[25] = -1; data[26] = -1; data[31] = -1;
    data[32] = -1; data[33] = -1; data[34] = -1; data[35] = -1; data[36] = -1;
    data[37] = -1; data[42] = 1; data[43] = 1; data[44] = -1; data[45] = -1;
    data[52] = 1; data[53] = 1; data[54] = 1; data[55] = 1; data[56] = 1;
    data[63] = 1; data[64] = -1; data[65] = -1; data[66] = -1; data[67] = -1;
    data[68] = -1; data[74] = 1; }




      if (boardnum == 862){
    player = -1;
    isLastPass = false;
    data[24] = -1; data[31] = -1; data[32] = 1; data[34] = -1; data[35] = -1;
    data[36] = 1; data[41] = 1; data[42] = 1; data[43] = 1; data[44] = 1;
    data[45] = 1; data[46] = 1; data[52] = 1; data[53] = -1; data[54] = -1;
    data[55] = 1; data[56] = 1; data[62] = 1; data[63] = 1; data[64] = -1;
    data[65] = -1; data[66] = 1; data[73] = 1; data[74] = -1; data[75] = -1;
    }




      if (boardnum == 863){
    player = 1;
    isLastPass = false;
    data[15] = 1; data[16] = 1; data[17] = 1; data[24] = -1; data[25] = -1;
    data[26] = 1; data[33] = -1; data[34] = -1; data[35] = 1; data[36] = -1;
    data[43] = -1; data[44] = 1; data[45] = 1; data[46] = -1; data[47] = 1;
    data[53] = -1; data[54] = -1; data[55] = 1; data[56] = -1; data[57] = 1;
    data[58] = 1; data[64] = -1; data[65] = 1; data[66] = -1; data[67] = 1;
    data[68] = 1; data[73] = -1; data[74] = -1; data[75] = -1; data[76] = -1;
    data[77] = -1; data[83] = 1; data[84] = 1; data[85] = 1; data[86] = 1;
    data[87] = 1; }




      if (boardnum == 864){
    player = -1;
    isLastPass = false;
    data[21] = -1; data[32] = -1; data[33] = -1; data[34] = -1; data[35] = -1;
    data[36] = -1; data[37] = -1; data[43] = -1; data[44] = 1; data[45] = 1;
    data[46] = 1; data[47] = 1; data[51] = -1; data[52] = -1; data[53] = -1;
    data[54] = -1; data[55] = 1; data[56] = 1; data[57] = -1; data[62] = -1;
    data[63] = -1; data[64] = -1; data[65] = -1; data[66] = 1; data[67] = -1;
    data[75] = -1; data[78] = -1; }




      if (boardnum == 865){
    player = -1;
    isLastPass = false;
    data[24] = -1; data[31] = -1; data[32] = -1; data[33] = -1; data[34] = -1;
    data[35] = -1; data[36] = 1; data[41] = 1; data[42] = 1; data[43] = -1;
    data[44] = 1; data[45] = 1; data[46] = 1; data[52] = 1; data[53] = 1;
    data[54] = -1; data[55] = 1; data[56] = 1; data[62] = 1; data[63] = 1;
    data[64] = 1; data[65] = -1; data[66] = 1; data[73] = 1; data[74] = -1;
    data[75] = 1; data[86] = 1; }




      if (boardnum == 866){
    player = -1;
    isLastPass = false;
    data[32] = -1; data[34] = -1; data[36] = 1; data[37] = 1; data[41] = 1;
    data[42] = -1; data[43] = -1; data[44] = -1; data[45] = -1; data[46] = 1;
    data[52] = -1; data[54] = 1; data[55] = 1; data[56] = -1; data[57] = -1;
    data[63] = 1; data[64] = 1; data[65] = 1; data[66] = -1; data[74] = 1;
    data[76] = 1; }




      if (boardnum == 867){
    player = 1;
    isLastPass = false;
    data[22] = 1; data[23] = 1; data[32] = -1; data[33] = -1; data[34] = -1;
    data[35] = -1; data[36] = -1; data[44] = 1; data[45] = -1; data[52] = -1;
    data[54] = -1; data[55] = 1; data[56] = 1; data[63] = -1; data[64] = -1;
    data[73] = 1; data[74] = 1; data[75] = 1; }




      if (boardnum == 868){
    player = 1;
    isLastPass = false;
    data[14] = -1; data[22] = -1; data[23] = 1; data[24] = -1; data[32] = -1;
    data[33] = -1; data[34] = 1; data[35] = -1; data[36] = -1; data[37] = -1;
    data[42] = -1; data[43] = -1; data[44] = -1; data[45] = 1; data[53] = -1;
    data[54] = 1; data[55] = -1; data[62] = -1; }




      if (boardnum == 869){
    player = 1;
    isLastPass = false;
    data[11] = 1; data[12] = 1; data[13] = 1; data[14] = 1; data[15] = 1;
    data[16] = 1; data[17] = 1; data[18] = 1; data[21] = 1; data[22] = -1;
    data[23] = -1; data[24] = -1; data[25] = -1; data[26] = 1; data[27] = 1;
    data[28] = 1; data[31] = 1; data[32] = -1; data[33] = 1; data[34] = -1;
    data[35] = -1; data[36] = -1; data[37] = -1; data[38] = 1; data[41] = 1;
    data[42] = -1; data[43] = 1; data[44] = -1; data[45] = -1; data[46] = -1;
    data[47] = -1; data[48] = 1; data[51] = 1; data[52] = -1; data[53] = -1;
    data[54] = -1; data[55] = -1; data[56] = -1; data[57] = -1; data[61] = 1;
    data[62] = -1; data[65] = -1; }




      if (boardnum == 870){
    player = 1;
    isLastPass = false;
    data[14] = -1; data[16] = 1; data[23] = -1; data[24] = -1; data[25] = -1;
    data[26] = -1; data[27] = -1; data[33] = -1; data[34] = 1; data[35] = 1;
    data[36] = -1; data[37] = -1; data[38] = -1; data[42] = -1; data[43] = -1;
    data[44] = 1; data[45] = 1; data[46] = 1; data[47] = -1; data[51] = -1;
    data[53] = -1; data[54] = -1; data[55] = 1; data[56] = -1; data[57] = -1;
    data[58] = -1; data[64] = -1; data[65] = -1; data[66] = 1; data[67] = -1;
    data[74] = -1; data[75] = -1; data[76] = -1; data[77] = -1; }




      if (boardnum == 871){
    player = 1;
    isLastPass = false;
    data[16] = 1; data[18] = -1; data[24] = -1; data[25] = 1; data[26] = 1;
    data[27] = -1; data[33] = 1; data[34] = -1; data[35] = -1; data[36] = -1;
    data[37] = 1; data[43] = 1; data[44] = -1; data[45] = -1; data[46] = 1;
    data[47] = 1; data[53] = 1; data[54] = -1; data[55] = 1; data[56] = 1;
    data[57] = 1; data[63] = 1; data[64] = 1; data[65] = 1; data[66] = 1;
    data[67] = 1; data[73] = 1; data[74] = 1; data[75] = 1; data[76] = 1;
    data[82] = 1; data[83] = 1; }




      if (boardnum == 872){
    player = -1;
    isLastPass = false;
    data[13] = -1; data[16] = 1; data[23] = -1; data[24] = -1; data[25] = 1;
    data[26] = 1; data[32] = 1; data[33] = -1; data[34] = 1; data[35] = -1;
    data[36] = 1; data[37] = -1; data[38] = -1; data[42] = -1; data[43] = -1;
    data[44] = -1; data[45] = 1; data[46] = -1; data[47] = -1; data[48] = -1;
    data[54] = -1; data[55] = -1; data[56] = 1; data[57] = -1; data[58] = -1;
    data[65] = 1; data[66] = 1; data[68] = -1; data[74] = 1; }




      if (boardnum == 873){
    player = -1;
    isLastPass = false;
    data[21] = 1; data[22] = 1; data[23] = 1; data[25] = 1; data[26] = -1;
    data[31] = -1; data[32] = -1; data[33] = -1; data[34] = 1; data[35] = 1;
    data[42] = -1; data[43] = -1; data[44] = -1; data[45] = 1; data[46] = 1;
    data[53] = -1; data[54] = -1; data[55] = -1; data[56] = 1; data[57] = 1;
    data[62] = -1; data[63] = -1; data[64] = -1; data[65] = -1; data[66] = 1;
    data[73] = 1; data[75] = 1; data[76] = 1; data[77] = -1; data[78] = -1;
    data[86] = 1; }




      if (boardnum == 874){
    player = 1;
    isLastPass = false;
    data[32] = -1; data[34] = 1; data[35] = -1; data[36] = -1; data[38] = 1;
    data[42] = 1; data[43] = 1; data[44] = 1; data[45] = -1; data[46] = -1;
    data[47] = 1; data[53] = 1; data[54] = -1; data[55] = -1; data[56] = 1;
    data[57] = 1; data[58] = 1; data[61] = -1; data[62] = -1; data[63] = -1;
    data[64] = -1; data[65] = -1; data[66] = 1; data[67] = 1; data[76] = 1;
    data[86] = 1; }




      if (boardnum == 875){
    player = -1;
    isLastPass = false;
    data[11] = 1; data[12] = 1; data[13] = 1; data[14] = 1; data[15] = 1;
    data[16] = 1; data[17] = 1; data[21] = 1; data[22] = 1; data[23] = 1;
    data[24] = 1; data[25] = 1; data[26] = 1; data[27] = -1; data[31] = 1;
    data[32] = 1; data[33] = 1; data[34] = 1; data[35] = 1; data[36] = -1;
    data[37] = -1; data[43] = -1; data[44] = -1; data[45] = 1; data[46] = -1;
    data[47] = -1; data[48] = -1; data[52] = -1; data[53] = -1; data[54] = -1;
    data[55] = 1; data[56] = -1; data[64] = -1; data[65] = -1; data[66] = -1;
    data[75] = 1; data[76] = -1; }




      if (boardnum == 876){
    player = -1;
    isLastPass = false;
    data[11] = 1; data[12] = 1; data[13] = 1; data[14] = 1; data[15] = 1;
    data[16] = 1; data[21] = 1; data[22] = 1; data[23] = 1; data[24] = 1;
    data[25] = 1; data[26] = -1; data[27] = -1; data[31] = 1; data[32] = 1;
    data[33] = 1; data[34] = 1; data[35] = 1; data[36] = -1; data[37] = -1;
    data[43] = -1; data[44] = -1; data[45] = 1; data[46] = -1; data[47] = -1;
    data[48] = -1; data[52] = -1; data[53] = -1; data[54] = -1; data[55] = 1;
    data[56] = -1; data[64] = -1; data[65] = 1; data[66] = -1; data[75] = 1;
    }




      if (boardnum == 877){
    player = -1;
    isLastPass = false;
    data[13] = 1; data[16] = 1; data[22] = 1; data[24] = 1; data[26] = 1;
    data[31] = 1; data[32] = 1; data[33] = -1; data[34] = 1; data[35] = 1;
    data[36] = 1; data[37] = 1; data[41] = -1; data[42] = -1; data[43] = -1;
    data[44] = -1; data[45] = 1; data[46] = 1; data[47] = 1; data[51] = -1;
    data[53] = 1; data[54] = 1; data[55] = -1; data[56] = 1; data[57] = 1;
    data[61] = 1; data[62] = -1; data[63] = 1; data[64] = -1; data[65] = 1;
    data[66] = -1; data[73] = 1; data[74] = 1; data[75] = -1; data[77] = -1;
    data[81] = 1; data[82] = 1; data[83] = 1; data[84] = -1; data[86] = -1;
    data[88] = -1; }




      if (boardnum == 878){
    player = -1;
    isLastPass = false;
    data[14] = -1; data[16] = 1; data[18] = 1; data[22] = -1; data[23] = -1;
    data[24] = -1; data[25] = -1; data[26] = -1; data[27] = -1; data[28] = -1;
    data[32] = -1; data[33] = -1; data[34] = 1; data[35] = -1; data[36] = 1;
    data[37] = -1; data[38] = -1; data[42] = -1; data[43] = -1; data[44] = -1;
    data[45] = 1; data[46] = -1; data[47] = 1; data[48] = 1; data[51] = -1;
    data[53] = -1; data[54] = -1; data[55] = -1; data[56] = 1; data[57] = -1;
    data[58] = -1; data[64] = -1; data[65] = 1; data[66] = -1; data[67] = -1;
    data[68] = -1; data[74] = 1; data[75] = -1; data[76] = -1; data[77] = -1;
    data[83] = 1; data[87] = -1; data[88] = 1; }




      if (boardnum == 879){
    player = -1;
    isLastPass = false;
    data[14] = 1; data[16] = 1; data[23] = 1; data[24] = 1; data[25] = 1;
    data[26] = 1; data[32] = 1; data[33] = 1; data[34] = 1; data[35] = -1;
    data[36] = 1; data[42] = 1; data[43] = 1; data[44] = -1; data[45] = 1;
    data[46] = 1; data[51] = 1; data[52] = 1; data[53] = 1; data[54] = -1;
    data[55] = 1; data[56] = 1; data[57] = 1; data[62] = 1; data[63] = 1;
    data[64] = -1; data[65] = 1; data[66] = 1; data[72] = -1; data[73] = 1;
    data[74] = 1; data[75] = 1; data[81] = -1; data[83] = 1; data[84] = 1;
    data[85] = 1; data[86] = -1; }




      if (boardnum == 880){
    player = -1;
    isLastPass = false;
    data[24] = 1; data[31] = 1; data[32] = 1; data[33] = 1; data[35] = 1;
    data[36] = 1; data[42] = 1; data[43] = 1; data[44] = -1; data[45] = 1;
    data[46] = 1; data[47] = -1; data[53] = -1; data[54] = 1; data[55] = -1;
    data[56] = 1; data[61] = 1; data[62] = 1; data[63] = 1; data[64] = 1;
    data[65] = 1; data[66] = -1; data[73] = 1; data[77] = -1; data[88] = -1;
    }




      if (boardnum == 881){
    player = 1;
    isLastPass = false;
    data[14] = 1; data[15] = -1; data[25] = -1; data[26] = 1; data[33] = -1;
    data[34] = -1; data[35] = -1; data[36] = 1; data[43] = 1; data[44] = 1;
    data[45] = -1; data[46] = -1; data[54] = 1; data[55] = -1; data[56] = -1;
    data[57] = -1; }




      if (boardnum == 882){
    player = -1;
    isLastPass = false;
    data[26] = 1; data[33] = -1; data[34] = -1; data[35] = 1; data[43] = -1;
    data[44] = 1; data[45] = 1; data[46] = 1; data[53] = -1; data[54] = -1;
    data[55] = 1; data[56] = 1; data[64] = 1; data[65] = 1; data[66] = 1;
    data[73] = -1; data[74] = -1; data[75] = 1; data[76] = -1; data[83] = 1;
    data[85] = 1; }




      if (boardnum == 883){
    player = -1;
    isLastPass = false;
    data[23] = 1; data[24] = -1; data[32] = 1; data[33] = -1; data[34] = -1;
    data[35] = -1; data[36] = 1; data[38] = 1; data[42] = -1; data[43] = 1;
    data[44] = -1; data[45] = -1; data[46] = -1; data[47] = 1; data[52] = 1;
    data[53] = -1; data[54] = 1; data[55] = -1; data[56] = 1; data[63] = 1;
    data[64] = -1; data[65] = 1; data[76] = 1; }




      if (boardnum == 884){
    player = 1;
    isLastPass = false;
    data[11] = -1; data[16] = -1; data[21] = -1; data[22] = 1; data[23] = 1;
    data[26] = -1; data[31] = -1; data[32] = -1; data[33] = -1; data[34] = -1;
    data[35] = 1; data[36] = -1; data[41] = 1; data[43] = 1; data[44] = 1;
    data[45] = -1; data[52] = 1; data[54] = -1; data[55] = -1; data[56] = 1;
    data[63] = 1; data[64] = -1; data[65] = -1; data[73] = 1; data[74] = 1;
    data[75] = 1; }




      if (boardnum == 885){
    player = -1;
    isLastPass = false;
    data[13] = 1; data[23] = 1; data[24] = 1; data[25] = -1; data[27] = 1;
    data[32] = 1; data[33] = -1; data[34] = -1; data[35] = 1; data[36] = 1;
    data[37] = -1; data[38] = -1; data[42] = 1; data[43] = -1; data[44] = -1;
    data[45] = 1; data[46] = 1; data[52] = -1; data[53] = -1; data[54] = 1;
    data[55] = 1; data[57] = 1; data[64] = -1; data[66] = -1; data[68] = 1;
    data[74] = 1; data[75] = -1; }




      if (boardnum == 886){
    player = -1;
    isLastPass = false;
    data[13] = -1; data[14] = -1; data[15] = -1; data[16] = -1; data[17] = -1;
    data[22] = 1; data[24] = -1; data[25] = 1; data[26] = -1; data[33] = 1;
    data[34] = 1; data[35] = -1; data[36] = 1; data[43] = -1; data[44] = 1;
    data[45] = 1; data[46] = 1; data[47] = 1; data[53] = -1; data[54] = -1;
    data[55] = 1; data[56] = 1; data[63] = -1; data[64] = -1; data[65] = -1;
    }




      if (boardnum == 887){
    player = 1;
    isLastPass = false;
    data[25] = 1; data[32] = -1; data[34] = 1; data[35] = 1; data[36] = 1;
    data[38] = 1; data[42] = 1; data[43] = 1; data[44] = 1; data[45] = 1;
    data[46] = -1; data[47] = 1; data[48] = -1; data[53] = 1; data[54] = 1;
    data[55] = -1; data[56] = 1; data[57] = 1; data[58] = 1; data[61] = -1;
    data[62] = -1; data[63] = -1; data[64] = -1; data[65] = 1; data[66] = 1;
    data[67] = 1; data[73] = -1; data[74] = 1; data[75] = 1; data[76] = 1;
    data[83] = 1; data[84] = 1; data[85] = 1; data[86] = 1; }




      if (boardnum == 888){
    player = 1;
    isLastPass = false;
    data[11] = -1; data[12] = 1; data[13] = -1; data[14] = -1; data[15] = -1;
    data[16] = -1; data[17] = -1; data[21] = -1; data[22] = 1; data[24] = -1;
    data[25] = 1; data[26] = -1; data[31] = -1; data[32] = 1; data[33] = -1;
    data[34] = -1; data[35] = -1; data[36] = -1; data[37] = -1; data[41] = -1;
    data[42] = -1; data[43] = -1; data[44] = 1; data[45] = 1; data[46] = 1;
    data[47] = 1; data[51] = -1; data[52] = -1; data[53] = 1; data[54] = 1;
    data[55] = 1; data[56] = 1; data[62] = 1; data[63] = 1; data[64] = 1;
    data[65] = 1; data[73] = 1; data[74] = 1; data[75] = 1; data[76] = -1;
    }




      if (boardnum == 889){
    player = -1;
    isLastPass = false;
    data[11] = 1; data[12] = 1; data[13] = 1; data[14] = 1; data[15] = 1;
    data[16] = 1; data[17] = 1; data[21] = 1; data[22] = 1; data[23] = 1;
    data[24] = 1; data[25] = 1; data[26] = 1; data[31] = 1; data[32] = 1;
    data[33] = -1; data[34] = 1; data[35] = 1; data[36] = -1; data[37] = -1;
    data[41] = 1; data[42] = 1; data[43] = 1; data[44] = 1; data[45] = 1;
    data[46] = -1; data[52] = -1; data[54] = -1; data[55] = -1; data[56] = -1;
    data[65] = -1; }




      if (boardnum == 890){
    player = 1;
    isLastPass = false;
    data[33] = -1; data[34] = -1; data[35] = -1; data[42] = -1; data[44] = -1;
    data[45] = -1; data[48] = 1; data[52] = 1; data[53] = -1; data[54] = -1;
    data[55] = -1; data[56] = -1; data[57] = 1; data[61] = -1; data[62] = -1;
    data[63] = -1; data[64] = -1; data[65] = -1; data[66] = 1; data[73] = 1;
    data[74] = 1; data[76] = 1; data[83] = 1; data[85] = 1; }




      if (boardnum == 891){
    player = -1;
    isLastPass = false;
    data[31] = 1; data[32] = 1; data[33] = 1; data[34] = 1; data[35] = 1;
    data[36] = 1; data[37] = 1; data[38] = 1; data[41] = 1; data[42] = 1;
    data[43] = 1; data[44] = 1; data[45] = 1; data[46] = -1; data[48] = -1;
    data[51] = 1; data[52] = 1; data[53] = 1; data[54] = 1; data[55] = -1;
    data[56] = -1; data[57] = -1; data[58] = -1; data[61] = 1; data[62] = 1;
    data[63] = -1; data[64] = -1; data[65] = -1; data[66] = -1; data[67] = -1;
    data[68] = -1; data[71] = 1; data[73] = -1; data[74] = -1; data[75] = 1;
    data[76] = 1; data[77] = -1; data[83] = -1; data[84] = -1; data[85] = -1;
    data[86] = -1; data[87] = -1; data[88] = -1; }




      if (boardnum == 892){
    player = -1;
    isLastPass = false;
    data[13] = -1; data[14] = 1; data[23] = -1; data[24] = 1; data[25] = 1;
    data[26] = 1; data[33] = -1; data[34] = -1; data[35] = -1; data[36] = -1;
    data[37] = -1; data[38] = -1; data[43] = -1; data[44] = -1; data[45] = -1;
    data[46] = 1; data[47] = -1; data[48] = -1; data[53] = -1; data[54] = 1;
    data[55] = -1; data[56] = 1; data[57] = -1; data[61] = 1; data[62] = 1;
    data[63] = 1; data[64] = 1; data[65] = 1; data[66] = -1; data[67] = -1;
    data[73] = 1; data[74] = 1; data[75] = 1; data[76] = 1; data[77] = -1;
    data[85] = 1; data[86] = 1; }




      if (boardnum == 893){
    player = -1;
    isLastPass = false;
    data[13] = 1; data[24] = 1; data[26] = 1; data[31] = 1; data[33] = 1;
    data[34] = 1; data[35] = -1; data[36] = -1; data[42] = 1; data[43] = -1;
    data[44] = 1; data[45] = -1; data[53] = 1; data[54] = 1; data[55] = -1;
    data[62] = 1; data[64] = 1; }




      if (boardnum == 894){
    player = 1;
    isLastPass = false;
    data[23] = -1; data[24] = 1; data[27] = -1; data[33] = -1; data[34] = 1;
    data[35] = 1; data[36] = -1; data[37] = 1; data[43] = -1; data[44] = -1;
    data[45] = -1; data[46] = 1; data[47] = 1; data[52] = -1; data[53] = -1;
    data[54] = -1; data[55] = -1; data[56] = 1; data[61] = 1; data[62] = 1;
    data[63] = 1; data[64] = 1; data[65] = 1; data[66] = 1; data[73] = 1;
    data[74] = 1; data[75] = 1; data[76] = -1; data[77] = -1; data[78] = -1;
    data[82] = 1; data[87] = -1; }




      if (boardnum == 895){
    player = 1;
    isLastPass = false;
    data[22] = 1; data[23] = 1; data[24] = 1; data[25] = 1; data[26] = 1;
    data[31] = 1; data[32] = 1; data[33] = 1; data[34] = -1; data[35] = -1;
    data[36] = 1; data[42] = 1; data[43] = -1; data[44] = -1; data[45] = -1;
    data[46] = 1; data[52] = -1; data[53] = -1; data[54] = -1; data[55] = 1;
    data[56] = 1; data[63] = 1; data[64] = 1; data[65] = 1; data[66] = 1;
    data[74] = 1; data[75] = 1; data[76] = 1; data[83] = 1; data[85] = 1;
    }




      if (boardnum == 896){
    player = 1;
    isLastPass = false;
    data[11] = 1; data[13] = 1; data[15] = -1; data[16] = -1; data[17] = -1;
    data[21] = 1; data[22] = 1; data[23] = -1; data[24] = -1; data[25] = -1;
    data[26] = -1; data[27] = -1; data[31] = 1; data[32] = 1; data[33] = 1;
    data[34] = -1; data[35] = -1; data[36] = -1; data[37] = -1; data[41] = -1;
    data[42] = -1; data[43] = -1; data[44] = 1; data[45] = -1; data[46] = -1;
    data[51] = -1; data[52] = -1; data[53] = -1; data[54] = 1; data[55] = 1;
    data[62] = -1; data[63] = -1; data[64] = -1; data[65] = 1; data[66] = 1;
    data[73] = -1; data[74] = -1; data[75] = -1; }




      if (boardnum == 897){
    player = 1;
    isLastPass = false;
    data[14] = -1; data[15] = -1; data[16] = -1; data[23] = -1; data[24] = -1;
    data[25] = -1; data[26] = -1; data[32] = -1; data[33] = 1; data[34] = 1;
    data[35] = -1; data[36] = 1; data[42] = 1; data[43] = -1; data[44] = -1;
    data[45] = 1; data[46] = 1; data[51] = 1; data[52] = 1; data[53] = 1;
    data[54] = 1; data[55] = 1; data[56] = 1; data[61] = -1; data[62] = -1;
    data[63] = -1; data[64] = 1; data[65] = 1; }




      if (boardnum == 898){
    player = -1;
    isLastPass = false;
    data[15] = 1; data[23] = 1; data[24] = 1; data[25] = 1; data[33] = 1;
    data[34] = 1; data[35] = 1; data[36] = 1; data[37] = 1; data[42] = 1;
    data[43] = 1; data[44] = -1; data[45] = 1; data[46] = 1; data[52] = 1;
    data[53] = -1; data[54] = -1; data[55] = 1; data[56] = 1; data[61] = 1;
    data[63] = 1; data[64] = 1; data[65] = 1; data[66] = 1; data[72] = 1;
    data[74] = 1; data[75] = 1; data[76] = 1; data[83] = -1; data[84] = 1;
    data[86] = 1; }




      if (boardnum == 899){
    player = -1;
    isLastPass = false;
    data[21] = 1; data[24] = -1; data[25] = 1; data[31] = 1; data[32] = 1;
    data[33] = -1; data[34] = 1; data[35] = 1; data[41] = 1; data[42] = -1;
    data[43] = 1; data[44] = -1; data[45] = 1; data[51] = 1; data[52] = 1;
    data[53] = -1; data[54] = 1; data[55] = 1; data[56] = 1; data[57] = 1;
    data[61] = 1; data[62] = 1; data[63] = 1; data[64] = -1; data[65] = 1;
    data[66] = 1; data[71] = 1; data[73] = -1; data[74] = -1; data[75] = -1;
    data[76] = -1; data[81] = 1; data[82] = 1; data[83] = 1; data[84] = 1;
    data[85] = 1; data[86] = -1; }




      if (boardnum == 900){
    player = -1;
    isLastPass = false;
    data[13] = -1; data[16] = 1; data[23] = -1; data[24] = -1; data[25] = 1;
    data[26] = 1; data[32] = 1; data[33] = -1; data[34] = -1; data[35] = 1;
    data[36] = 1; data[37] = -1; data[38] = -1; data[42] = -1; data[43] = -1;
    data[44] = 1; data[45] = -1; data[46] = -1; data[47] = -1; data[48] = -1;
    data[53] = -1; data[54] = 1; data[55] = -1; data[56] = -1; data[57] = -1;
    data[58] = -1; data[63] = -1; data[64] = 1; data[65] = 1; data[66] = 1;
    data[67] = -1; data[68] = -1; data[74] = 1; }




      if (boardnum == 901){
    player = 1;
    isLastPass = false;
    data[14] = 1; data[16] = 1; data[23] = 1; data[24] = 1; data[25] = 1;
    data[26] = 1; data[32] = 1; data[33] = 1; data[34] = 1; data[35] = -1;
    data[36] = 1; data[41] = -1; data[42] = -1; data[43] = -1; data[44] = -1;
    data[45] = 1; data[46] = 1; data[51] = -1; data[52] = -1; data[53] = 1;
    data[54] = -1; data[55] = 1; data[56] = 1; data[57] = 1; data[61] = -1;
    data[62] = -1; data[63] = -1; data[64] = -1; data[65] = 1; data[66] = 1;
    data[71] = -1; data[72] = -1; data[73] = 1; data[74] = 1; data[75] = 1;
    data[81] = -1; data[82] = -1; data[83] = -1; data[84] = -1; data[85] = -1;
    data[86] = -1; }




      if (boardnum == 902){
    player = -1;
    isLastPass = false;
    data[33] = 1; data[34] = -1; data[35] = -1; data[37] = 1; data[44] = -1;
    data[45] = -1; data[46] = 1; data[54] = -1; data[55] = 1; data[56] = 1;
    data[57] = 1; data[63] = -1; data[64] = -1; data[65] = -1; data[66] = 1;
    data[67] = 1; data[73] = 1; data[74] = 1; data[75] = 1; data[76] = 1;
    data[77] = 1; }




      if (boardnum == 903){
    player = -1;
    isLastPass = false;
    data[31] = 1; data[32] = 1; data[33] = 1; data[34] = 1; data[35] = 1;
    data[36] = 1; data[41] = 1; data[42] = 1; data[43] = 1; data[44] = 1;
    data[45] = 1; data[46] = 1; data[48] = -1; data[52] = 1; data[53] = 1;
    data[54] = 1; data[55] = 1; data[56] = 1; data[57] = -1; data[58] = -1;
    data[61] = -1; data[62] = -1; data[63] = -1; data[64] = 1; data[65] = 1;
    data[66] = -1; data[67] = -1; data[68] = -1; data[75] = 1; }




      if (boardnum == 904){
    player = -1;
    isLastPass = false;
    data[16] = 1; data[25] = 1; data[26] = 1; data[34] = 1; data[35] = 1;
    data[36] = 1; data[37] = -1; data[42] = -1; data[43] = -1; data[44] = -1;
    data[45] = -1; data[46] = -1; data[53] = -1; data[54] = 1; data[55] = -1;
    data[64] = -1; data[73] = -1; }




      if (boardnum == 905){
    player = -1;
    isLastPass = false;
    data[11] = -1; data[12] = -1; data[13] = -1; data[14] = -1; data[15] = -1;
    data[16] = -1; data[17] = -1; data[21] = 1; data[22] = 1; data[23] = 1;
    data[24] = 1; data[25] = 1; data[26] = 1; data[28] = 1; data[32] = 1;
    data[33] = 1; data[34] = 1; data[35] = 1; data[36] = 1; data[37] = 1;
    data[43] = 1; data[44] = 1; data[45] = 1; data[46] = 1; data[47] = 1;
    data[54] = 1; data[55] = 1; data[56] = 1; data[57] = 1; data[63] = -1;
    data[65] = 1; data[66] = 1; data[67] = -1; }




      if (boardnum == 906){
    player = -1;
    isLastPass = false;
    data[24] = 1; data[26] = -1; data[31] = 1; data[32] = 1; data[33] = 1;
    data[34] = 1; data[35] = 1; data[36] = -1; data[42] = 1; data[43] = 1;
    data[44] = 1; data[45] = 1; data[46] = 1; data[47] = -1; data[53] = 1;
    data[54] = 1; data[55] = 1; data[56] = 1; data[57] = 1; data[61] = 1;
    data[62] = 1; data[63] = 1; data[64] = -1; data[65] = 1; data[66] = 1;
    data[73] = -1; data[74] = 1; data[75] = 1; data[77] = -1; data[82] = -1;
    data[88] = -1; }




      if (boardnum == 907){
    player = 1;
    isLastPass = false;
    data[14] = -1; data[24] = -1; data[25] = -1; data[31] = -1; data[32] = -1;
    data[33] = -1; data[34] = 1; data[35] = 1; data[36] = -1; data[37] = -1;
    data[41] = 1; data[42] = 1; data[43] = 1; data[44] = 1; data[45] = 1;
    data[46] = 1; data[47] = -1; data[52] = 1; data[53] = 1; data[54] = -1;
    data[55] = 1; data[56] = 1; data[57] = 1; data[62] = 1; data[63] = 1;
    data[64] = 1; data[65] = -1; data[66] = 1; data[73] = 1; data[74] = 1;
    data[75] = 1; data[84] = 1; data[85] = 1; data[86] = 1; }




      if (boardnum == 908){
    player = 1;
    isLastPass = false;
    data[16] = 1; data[25] = 1; data[26] = 1; data[33] = -1; data[34] = -1;
    data[35] = -1; data[36] = -1; data[37] = -1; data[43] = -1; data[44] = -1;
    data[45] = 1; data[46] = -1; data[54] = -1; data[55] = -1; data[56] = 1;
    data[65] = -1; }




      if (boardnum == 909){
    player = 1;
    isLastPass = false;
    data[24] = 1; data[25] = 1; data[26] = -1; data[31] = -1; data[33] = 1;
    data[34] = 1; data[35] = 1; data[36] = 1; data[37] = 1; data[42] = 1;
    data[43] = -1; data[44] = -1; data[45] = -1; data[46] = 1; data[47] = 1;
    data[51] = 1; data[53] = -1; data[54] = -1; data[55] = 1; data[56] = 1;
    data[63] = -1; data[73] = -1; }




      if (boardnum == 910){
    player = -1;
    isLastPass = false;
    data[11] = -1; data[12] = -1; data[13] = -1; data[14] = -1; data[15] = -1;
    data[16] = -1; data[17] = -1; data[23] = 1; data[24] = -1; data[25] = 1;
    data[31] = 1; data[33] = -1; data[34] = 1; data[35] = -1; data[36] = -1;
    data[37] = -1; data[38] = -1; data[42] = 1; data[43] = 1; data[44] = 1;
    data[45] = -1; data[46] = -1; data[47] = -1; data[51] = -1; data[52] = 1;
    data[53] = 1; data[54] = 1; data[55] = 1; data[56] = -1; data[57] = -1;
    data[61] = 1; data[62] = 1; data[63] = 1; data[64] = -1; data[65] = -1;
    data[66] = -1; data[67] = -1; data[73] = -1; data[74] = 1; }




      if (boardnum == 911){
    player = 1;
    isLastPass = false;
    data[13] = -1; data[14] = 1; data[15] = 1; data[24] = 1; data[25] = 1;
    data[26] = 1; data[32] = 1; data[33] = 1; data[34] = 1; data[35] = 1;
    data[36] = 1; data[37] = 1; data[38] = 1; data[42] = -1; data[43] = -1;
    data[44] = -1; data[45] = 1; data[46] = -1; data[53] = 1; data[54] = 1;
    data[55] = -1; data[56] = 1; data[62] = 1; data[63] = 1; data[64] = 1;
    data[66] = -1; data[73] = 1; data[74] = 1; }




      if (boardnum == 912){
    player = 1;
    isLastPass = false;
    data[11] = 1; data[12] = 1; data[13] = 1; data[14] = 1; data[15] = 1;
    data[16] = 1; data[21] = -1; data[22] = 1; data[24] = -1; data[25] = -1;
    data[26] = -1; data[27] = -1; data[32] = -1; data[33] = 1; data[34] = 1;
    data[35] = -1; data[36] = -1; data[37] = -1; data[43] = -1; data[44] = -1;
    data[45] = -1; data[46] = -1; data[47] = -1; data[48] = -1; data[52] = -1;
    data[53] = -1; data[54] = -1; data[55] = -1; data[56] = -1; data[66] = -1;
    }




      if (boardnum == 913){
    player = -1;
    isLastPass = false;
    data[13] = -1; data[14] = -1; data[15] = -1; data[16] = -1; data[23] = -1;
    data[24] = 1; data[25] = 1; data[26] = 1; data[32] = 1; data[33] = 1;
    data[34] = -1; data[35] = 1; data[36] = 1; data[37] = 1; data[38] = 1;
    data[42] = 1; data[43] = 1; data[44] = -1; data[45] = -1; data[46] = 1;
    data[47] = 1; data[48] = 1; data[52] = 1; data[53] = 1; data[54] = 1;
    data[55] = -1; data[56] = 1; data[57] = 1; data[58] = 1; data[62] = 1;
    data[63] = 1; data[64] = 1; data[66] = 1; data[67] = 1; data[73] = 1;
    data[74] = 1; data[76] = 1; }




      if (boardnum == 914){
    player = 1;
    isLastPass = false;
    data[12] = 1; data[23] = 1; data[24] = 1; data[25] = 1; data[32] = 1;
    data[34] = 1; data[35] = 1; data[43] = 1; data[44] = -1; data[45] = -1;
    data[46] = 1; data[52] = 1; data[53] = 1; data[54] = -1; data[55] = -1;
    data[56] = 1; data[57] = 1; data[63] = -1; data[64] = -1; data[65] = 1;
    data[66] = -1; data[73] = 1; data[74] = -1; data[75] = 1; data[76] = 1;
    data[82] = 1; }




      if (boardnum == 915){
    player = -1;
    isLastPass = false;
    data[31] = 1; data[32] = 1; data[33] = 1; data[34] = 1; data[35] = 1;
    data[36] = 1; data[41] = 1; data[42] = 1; data[43] = 1; data[44] = 1;
    data[45] = 1; data[46] = 1; data[48] = -1; data[51] = -1; data[52] = 1;
    data[53] = -1; data[54] = 1; data[55] = 1; data[56] = -1; data[57] = -1;
    data[58] = -1; data[61] = -1; data[62] = -1; data[63] = 1; data[64] = 1;
    data[65] = -1; data[66] = -1; data[67] = -1; data[68] = -1; data[74] = 1;
    data[75] = -1; data[76] = 1; data[77] = 1; data[83] = -1; data[84] = 1;
    data[85] = -1; data[87] = 1; }




      if (boardnum == 916){
    player = -1;
    isLastPass = false;
    data[23] = 1; data[24] = 1; data[25] = 1; data[26] = 1; data[33] = 1;
    data[34] = -1; data[36] = 1; data[43] = -1; data[44] = -1; data[45] = -1;
    data[46] = 1; data[53] = 1; data[54] = -1; data[55] = 1; data[56] = 1;
    data[63] = 1; data[64] = 1; data[65] = 1; data[66] = -1; data[75] = 1;
    data[85] = 1; }




      if (boardnum == 917){
    player = -1;
    isLastPass = false;
    data[12] = -1; data[23] = -1; data[24] = -1; data[33] = -1; data[34] = -1;
    data[35] = -1; data[36] = -1; data[37] = -1; data[43] = -1; data[44] = -1;
    data[45] = -1; data[46] = -1; data[51] = -1; data[52] = -1; data[53] = -1;
    data[54] = -1; data[55] = -1; data[61] = 1; data[62] = 1; data[63] = 1;
    data[64] = -1; data[65] = 1; data[72] = -1; data[73] = 1; data[74] = 1;
    }




      if (boardnum == 918){
    player = 1;
    isLastPass = false;
    data[12] = -1; data[13] = -1; data[14] = -1; data[15] = -1; data[16] = -1;
    data[17] = -1; data[18] = -1; data[24] = 1; data[25] = -1; data[26] = 1;
    data[27] = 1; data[31] = -1; data[32] = -1; data[33] = -1; data[34] = -1;
    data[35] = 1; data[36] = -1; data[37] = 1; data[42] = -1; data[43] = 1;
    data[44] = -1; data[45] = 1; data[46] = 1; data[47] = 1; data[48] = 1;
    data[51] = -1; data[52] = -1; data[53] = -1; data[54] = -1; data[55] = -1;
    data[56] = 1; data[57] = 1; data[58] = -1; data[63] = -1; data[64] = -1;
    data[65] = -1; data[66] = 1; data[67] = 1; data[68] = -1; data[74] = -1;
    data[75] = -1; data[76] = -1; data[77] = 1; data[85] = -1; }




      if (boardnum == 919){
    player = 1;
    isLastPass = false;
    data[11] = -1; data[12] = -1; data[13] = -1; data[14] = -1; data[15] = -1;
    data[16] = -1; data[17] = -1; data[21] = 1; data[22] = 1; data[23] = -1;
    data[24] = 1; data[25] = 1; data[26] = 1; data[28] = 1; data[32] = -1;
    data[33] = 1; data[34] = 1; data[35] = 1; data[36] = 1; data[37] = 1;
    data[41] = -1; data[43] = 1; data[44] = 1; data[45] = 1; data[46] = 1;
    data[47] = 1; data[54] = 1; data[55] = 1; data[56] = 1; data[57] = 1;
    data[63] = -1; data[65] = 1; data[66] = 1; data[67] = -1; }




      if (boardnum == 920){
    player = 1;
    isLastPass = false;
    data[15] = -1; data[23] = -1; data[25] = 1; data[26] = -1; data[27] = -1;
    data[33] = -1; data[34] = -1; data[35] = 1; data[36] = 1; data[37] = -1;
    data[43] = 1; data[44] = 1; data[45] = -1; data[46] = 1; data[47] = 1;
    data[53] = -1; data[54] = -1; data[55] = -1; data[56] = 1; data[65] = -1;
    }




      if (boardnum == 921){
    player = 1;
    isLastPass = false;
    data[11] = 1; data[12] = -1; data[13] = -1; data[14] = -1; data[16] = 1;
    data[21] = 1; data[22] = -1; data[23] = -1; data[24] = -1; data[25] = -1;
    data[27] = -1; data[31] = 1; data[32] = -1; data[33] = 1; data[34] = 1;
    data[35] = -1; data[36] = -1; data[37] = -1; data[41] = 1; data[42] = -1;
    data[43] = 1; data[44] = 1; data[45] = -1; data[46] = 1; data[47] = -1;
    data[48] = 1; data[51] = 1; data[52] = -1; data[53] = -1; data[54] = -1;
    data[55] = -1; data[56] = -1; data[57] = 1; data[58] = 1; data[61] = 1;
    data[62] = -1; data[67] = -1; data[68] = 1; data[72] = -1; data[73] = 1;
    data[76] = -1; data[78] = 1; data[85] = -1; data[88] = 1; }




      if (boardnum == 922){
    player = 1;
    isLastPass = false;
    data[13] = -1; data[14] = 1; data[23] = -1; data[24] = 1; data[25] = 1;
    data[26] = 1; data[33] = -1; data[34] = -1; data[35] = -1; data[36] = -1;
    data[37] = -1; data[38] = -1; data[43] = -1; data[44] = -1; data[45] = -1;
    data[46] = 1; data[47] = -1; data[48] = -1; data[53] = -1; data[54] = 1;
    data[55] = -1; data[56] = 1; data[57] = -1; data[62] = -1; data[63] = -1;
    data[64] = -1; data[65] = 1; data[66] = -1; data[67] = -1; data[73] = 1;
    data[74] = 1; data[75] = 1; data[76] = 1; data[77] = -1; data[85] = 1;
    data[86] = 1; }




      if (boardnum == 923){
    player = 1;
    isLastPass = false;
    data[33] = 1; data[34] = -1; data[42] = 1; data[43] = 1; data[44] = 1;
    data[45] = 1; data[46] = 1; data[53] = 1; data[54] = -1; data[55] = 1;
    data[56] = 1; data[57] = 1; data[62] = -1; data[63] = -1; data[64] = -1;
    data[65] = -1; data[66] = 1; data[73] = 1; data[75] = 1; data[76] = -1;
    data[77] = -1; data[78] = -1; }




      if (boardnum == 924){
    player = 1;
    isLastPass = false;
    data[12] = -1; data[13] = -1; data[14] = -1; data[15] = 1; data[16] = 1;
    data[17] = -1; data[18] = 1; data[22] = -1; data[23] = -1; data[24] = -1;
    data[25] = 1; data[26] = 1; data[27] = 1; data[28] = 1; data[33] = -1;
    data[34] = -1; data[35] = 1; data[36] = -1; data[37] = 1; data[38] = 1;
    data[43] = -1; data[44] = -1; data[45] = -1; data[46] = 1; data[47] = -1;
    data[48] = 1; data[52] = 1; data[53] = -1; data[54] = -1; data[55] = 1;
    data[56] = -1; data[62] = -1; data[63] = -1; data[66] = 1; data[71] = -1;
    data[77] = 1; }




      if (boardnum == 925){
    player = -1;
    isLastPass = false;
    data[11] = 1; data[12] = 1; data[13] = 1; data[15] = -1; data[16] = -1;
    data[17] = -1; data[21] = 1; data[22] = 1; data[23] = 1; data[24] = -1;
    data[25] = -1; data[26] = -1; data[27] = -1; data[31] = 1; data[32] = 1;
    data[33] = 1; data[34] = 1; data[35] = 1; data[36] = 1; data[37] = 1;
    data[38] = 1; data[41] = -1; data[42] = -1; data[43] = -1; data[44] = 1;
    data[45] = -1; data[46] = -1; data[51] = -1; data[52] = -1; data[53] = -1;
    data[54] = 1; data[55] = 1; data[62] = -1; data[63] = -1; data[64] = -1;
    data[65] = -1; data[66] = -1; data[67] = -1; data[73] = -1; data[74] = -1;
    data[75] = -1; }




      if (boardnum == 926){
    player = -1;
    isLastPass = false;
    data[14] = 1; data[15] = 1; data[16] = 1; data[21] = -1; data[22] = 1;
    data[23] = 1; data[24] = 1; data[25] = 1; data[26] = 1; data[27] = 1;
    data[31] = -1; data[32] = 1; data[33] = 1; data[34] = 1; data[35] = -1;
    data[36] = 1; data[37] = 1; data[41] = -1; data[42] = 1; data[43] = 1;
    data[44] = 1; data[45] = 1; data[46] = 1; data[48] = 1; data[51] = -1;
    data[52] = 1; data[53] = 1; data[54] = 1; data[55] = 1; data[56] = 1;
    data[61] = -1; data[62] = 1; data[63] = 1; data[64] = 1; data[65] = 1;
    data[66] = 1; data[71] = -1; data[74] = 1; data[75] = 1; data[76] = 1;
    data[81] = -1; data[83] = 1; data[85] = 1; }




      if (boardnum == 927){
    player = -1;
    isLastPass = false;
    data[12] = -1; data[13] = -1; data[14] = -1; data[15] = -1; data[23] = -1;
    data[24] = 1; data[25] = -1; data[26] = -1; data[32] = -1; data[33] = -1;
    data[34] = -1; data[35] = -1; data[36] = -1; data[37] = -1; data[38] = 1;
    data[41] = 1; data[42] = -1; data[43] = 1; data[44] = 1; data[45] = 1;
    data[46] = 1; data[47] = -1; data[48] = 1; data[51] = 1; data[52] = 1;
    data[53] = -1; data[54] = -1; data[55] = -1; data[56] = -1; data[57] = -1;
    data[58] = 1; data[61] = 1; data[62] = 1; data[63] = 1; data[64] = 1;
    data[65] = 1; data[66] = 1; data[67] = 1; data[68] = 1; data[77] = -1;
    data[78] = 1; data[87] = -1; data[88] = 1; }




      if (boardnum == 928){
    player = 1;
    isLastPass = false;
    data[15] = 1; data[23] = 1; data[24] = 1; data[33] = 1; data[34] = -1;
    data[41] = 1; data[42] = 1; data[43] = 1; data[44] = -1; data[45] = 1;
    data[51] = -1; data[52] = -1; data[53] = -1; data[54] = -1; data[55] = -1;
    data[56] = -1; data[62] = -1; data[63] = 1; data[64] = 1; data[65] = 1;
    }




      if (boardnum == 929){
    player = -1;
    isLastPass = false;
    data[32] = -1; data[43] = -1; data[44] = 1; data[45] = 1; data[46] = 1;
    data[53] = 1; data[54] = -1; data[55] = 1; data[56] = 1; data[63] = 1;
    data[64] = 1; data[65] = -1; data[66] = -1; data[75] = -1; data[76] = -1;
    data[77] = -1; data[84] = -1; }




      if (boardnum == 930){
    player = 1;
    isLastPass = false;
    data[11] = -1; data[12] = -1; data[13] = -1; data[14] = -1; data[15] = -1;
    data[16] = -1; data[17] = -1; data[18] = -1; data[21] = 1; data[22] = 1;
    data[23] = -1; data[24] = -1; data[25] = 1; data[26] = 1; data[27] = -1;
    data[28] = -1; data[31] = 1; data[32] = 1; data[33] = 1; data[34] = -1;
    data[35] = 1; data[36] = -1; data[37] = -1; data[38] = -1; data[41] = -1;
    data[43] = 1; data[44] = -1; data[45] = -1; data[46] = -1; data[47] = 1;
    data[54] = -1; data[55] = -1; data[56] = 1; data[57] = 1; data[63] = -1;
    data[64] = -1; data[65] = 1; data[66] = -1; data[67] = 1; data[74] = 1;
    data[76] = -1; data[78] = 1; }




      if (boardnum == 931){
    player = -1;
    isLastPass = false;
    data[34] = 1; data[35] = 1; data[42] = 1; data[43] = 1; data[44] = 1;
    data[45] = 1; data[46] = 1; data[47] = 1; data[48] = -1; data[52] = 1;
    data[53] = -1; data[54] = -1; data[55] = -1; data[56] = -1; data[57] = -1;
    data[58] = -1; data[61] = 1; data[62] = 1; data[63] = -1; data[64] = -1;
    data[65] = 1; data[66] = 1; data[67] = -1; data[68] = -1; data[73] = 1;
    data[74] = -1; data[76] = 1; data[77] = 1; data[78] = -1; }




      if (boardnum == 932){
    player = -1;
    isLastPass = false;
    data[14] = 1; data[24] = -1; data[25] = 1; data[27] = 1; data[34] = -1;
    data[35] = -1; data[36] = 1; data[37] = -1; data[44] = -1; data[45] = 1;
    data[46] = -1; data[53] = -1; data[54] = 1; data[55] = -1; data[63] = 1;
    }




      if (boardnum == 933){
    player = -1;
    isLastPass = false;
    data[15] = -1; data[25] = -1; data[27] = -1; data[28] = 1; data[32] = -1;
    data[33] = -1; data[34] = -1; data[35] = -1; data[36] = -1; data[37] = 1;
    data[38] = 1; data[42] = -1; data[43] = -1; data[44] = -1; data[45] = -1;
    data[46] = 1; data[47] = -1; data[48] = 1; data[51] = -1; data[52] = -1;
    data[53] = -1; data[54] = -1; data[55] = -1; data[56] = 1; data[57] = -1;
    data[58] = 1; data[62] = -1; data[64] = -1; data[67] = -1; data[68] = 1;
    data[73] = -1; }




      if (boardnum == 934){
    player = -1;
    isLastPass = false;
    data[11] = 1; data[12] = 1; data[13] = 1; data[14] = 1; data[15] = 1;
    data[16] = 1; data[17] = 1; data[21] = 1; data[22] = 1; data[23] = 1;
    data[24] = 1; data[25] = 1; data[26] = 1; data[31] = 1; data[32] = 1;
    data[33] = -1; data[34] = 1; data[35] = 1; data[36] = 1; data[37] = -1;
    data[41] = 1; data[42] = 1; data[43] = 1; data[44] = 1; data[45] = 1;
    data[46] = 1; data[47] = 1; data[51] = 1; data[52] = 1; data[53] = 1;
    data[54] = -1; data[55] = -1; data[56] = -1; data[61] = 1; data[62] = 1;
    data[63] = -1; data[65] = -1; }




      if (boardnum == 935){
    player = 1;
    isLastPass = false;
    data[11] = -1; data[12] = -1; data[13] = -1; data[14] = -1; data[15] = -1;
    data[16] = -1; data[17] = -1; data[18] = -1; data[22] = -1; data[23] = 1;
    data[24] = -1; data[25] = 1; data[26] = 1; data[27] = 1; data[28] = 1;
    data[32] = -1; data[33] = -1; data[34] = 1; data[35] = -1; data[36] = -1;
    data[37] = 1; data[38] = 1; data[41] = -1; data[42] = -1; data[43] = 1;
    data[44] = 1; data[45] = -1; data[46] = 1; data[47] = 1; data[48] = 1;
    data[52] = -1; data[53] = 1; data[54] = 1; data[55] = 1; data[56] = 1;
    data[62] = 1; data[63] = -1; data[64] = 1; data[66] = 1; data[67] = 1;
    data[68] = 1; data[73] = -1; }




      if (boardnum == 936){
    player = -1;
    isLastPass = false;
    data[11] = -1; data[12] = -1; data[14] = 1; data[21] = -1; data[22] = -1;
    data[23] = -1; data[24] = 1; data[25] = 1; data[28] = 1; data[32] = 1;
    data[33] = -1; data[34] = -1; data[35] = -1; data[36] = 1; data[37] = 1;
    data[38] = 1; data[41] = 1; data[42] = 1; data[43] = 1; data[44] = -1;
    data[45] = -1; data[46] = 1; data[47] = 1; data[48] = 1; data[52] = 1;
    data[53] = -1; data[54] = 1; data[55] = -1; data[56] = 1; data[57] = 1;
    data[58] = 1; data[61] = -1; data[63] = 1; data[64] = 1; data[65] = 1;
    data[66] = 1; data[74] = 1; data[75] = 1; data[76] = 1; data[77] = 1;
    data[84] = 1; data[86] = 1; data[88] = 1; }




      if (boardnum == 937){
    player = 1;
    isLastPass = false;
    data[13] = -1; data[15] = -1; data[21] = -1; data[23] = -1; data[24] = -1;
    data[25] = -1; data[31] = -1; data[32] = -1; data[33] = 1; data[34] = -1;
    data[35] = -1; data[36] = -1; data[37] = -1; data[41] = -1; data[42] = -1;
    data[43] = -1; data[44] = -1; data[45] = -1; data[46] = -1; data[47] = -1;
    data[48] = -1; data[51] = -1; data[52] = -1; data[53] = 1; data[54] = 1;
    data[55] = -1; data[56] = -1; data[57] = -1; data[62] = -1; data[63] = -1;
    data[64] = 1; data[65] = -1; data[66] = -1; data[67] = -1; data[73] = -1;
    data[74] = 1; data[75] = -1; data[76] = -1; data[78] = -1; data[82] = -1;
    data[83] = -1; data[84] = -1; data[85] = -1; data[86] = -1; }




      if (boardnum == 938){
    player = 1;
    isLastPass = false;
    data[14] = 1; data[15] = 1; data[16] = 1; data[17] = 1; data[18] = 1;
    data[22] = 1; data[24] = -1; data[25] = -1; data[26] = -1; data[27] = 1;
    data[28] = 1; data[33] = 1; data[34] = 1; data[35] = 1; data[36] = -1;
    data[37] = 1; data[38] = 1; data[43] = -1; data[44] = 1; data[45] = -1;
    data[46] = -1; data[47] = -1; data[52] = -1; data[53] = -1; data[54] = -1;
    data[55] = -1; data[56] = -1; data[57] = -1; data[64] = 1; data[65] = -1;
    data[66] = -1; data[67] = -1; data[68] = -1; data[74] = -1; data[75] = -1;
    data[76] = -1; data[83] = -1; data[86] = -1; }




      if (boardnum == 939){
    player = 1;
    isLastPass = false;
    data[14] = -1; data[22] = -1; data[23] = 1; data[24] = -1; data[26] = -1;
    data[31] = 1; data[32] = 1; data[33] = 1; data[34] = 1; data[35] = -1;
    data[36] = -1; data[37] = 1; data[38] = 1; data[42] = -1; data[43] = -1;
    data[44] = -1; data[45] = -1; data[46] = -1; data[53] = -1; data[54] = 1;
    data[55] = -1; data[62] = -1; }




      if (boardnum == 940){
    player = -1;
    isLastPass = false;
    data[14] = 1; data[15] = 1; data[16] = -1; data[18] = -1; data[24] = -1;
    data[25] = 1; data[27] = -1; data[34] = -1; data[35] = 1; data[36] = -1;
    data[37] = 1; data[44] = -1; data[45] = 1; data[46] = 1; data[47] = 1;
    data[53] = -1; data[54] = 1; data[55] = 1; data[56] = -1; data[63] = 1;
    data[64] = 1; data[66] = 1; data[67] = -1; }




      if (boardnum == 941){
    player = -1;
    isLastPass = false;
    data[15] = 1; data[16] = -1; data[21] = 1; data[24] = 1; data[25] = 1;
    data[26] = -1; data[31] = 1; data[32] = 1; data[33] = 1; data[34] = 1;
    data[35] = 1; data[36] = -1; data[37] = -1; data[38] = -1; data[41] = 1;
    data[42] = -1; data[43] = 1; data[44] = 1; data[45] = -1; data[46] = 1;
    data[47] = 1; data[51] = 1; data[53] = 1; data[54] = 1; data[55] = 1;
    data[56] = 1; data[57] = 1; data[63] = 1; data[64] = 1; data[65] = 1;
    data[66] = 1; data[67] = 1; data[73] = 1; data[74] = 1; data[83] = 1;
    }




      if (boardnum == 942){
    player = 1;
    isLastPass = false;
    data[11] = -1; data[12] = -1; data[14] = 1; data[21] = -1; data[22] = -1;
    data[23] = -1; data[24] = 1; data[25] = 1; data[28] = 1; data[32] = 1;
    data[33] = -1; data[34] = -1; data[35] = -1; data[36] = 1; data[37] = 1;
    data[38] = 1; data[41] = 1; data[42] = 1; data[43] = 1; data[44] = -1;
    data[45] = -1; data[46] = 1; data[47] = 1; data[48] = 1; data[52] = 1;
    data[53] = -1; data[54] = 1; data[55] = -1; data[56] = 1; data[57] = 1;
    data[58] = 1; data[61] = -1; data[63] = 1; data[64] = 1; data[65] = 1;
    data[66] = 1; data[74] = 1; data[75] = 1; data[76] = 1; data[77] = -1;
    data[84] = 1; data[86] = 1; }




      if (boardnum == 943){
    player = 1;
    isLastPass = false;
    data[24] = 1; data[25] = 1; data[26] = -1; data[31] = -1; data[33] = 1;
    data[34] = 1; data[35] = 1; data[36] = -1; data[42] = 1; data[44] = 1;
    data[45] = -1; data[46] = 1; data[47] = 1; data[51] = 1; data[53] = -1;
    data[54] = -1; data[55] = 1; data[56] = 1; data[63] = -1; data[73] = -1;
    }




      if (boardnum == 944){
    player = 1;
    isLastPass = false;
    data[26] = -1; data[32] = -1; data[34] = -1; data[35] = -1; data[42] = 1;
    data[43] = 1; data[44] = -1; data[45] = 1; data[54] = -1; data[55] = 1;
    data[56] = 1; data[57] = -1; data[64] = -1; data[66] = -1; data[67] = 1;
    data[75] = -1; }




      if (boardnum == 945){
    player = -1;
    isLastPass = false;
    data[26] = 1; data[33] = -1; data[34] = -1; data[35] = 1; data[43] = -1;
    data[44] = 1; data[45] = 1; data[46] = 1; data[53] = -1; data[54] = -1;
    data[55] = 1; data[56] = 1; data[64] = 1; data[65] = 1; data[66] = 1;
    data[73] = -1; data[74] = -1; data[75] = 1; data[76] = -1; data[83] = 1;
    data[85] = 1; }




      if (boardnum == 946){
    player = -1;
    isLastPass = false;
    data[13] = 1; data[15] = -1; data[23] = 1; data[24] = -1; data[25] = -1;
    data[27] = 1; data[32] = 1; data[33] = -1; data[34] = -1; data[35] = 1;
    data[36] = 1; data[37] = -1; data[38] = -1; data[42] = 1; data[43] = -1;
    data[44] = -1; data[45] = 1; data[46] = 1; data[52] = -1; data[53] = -1;
    data[54] = 1; data[55] = 1; data[57] = 1; data[64] = 1; data[66] = -1;
    data[68] = 1; data[73] = 1; data[74] = 1; data[75] = -1; }




      if (boardnum == 947){
    player = -1;
    isLastPass = false;
    data[13] = -1; data[15] = 1; data[23] = -1; data[24] = -1; data[25] = 1;
    data[26] = 1; data[32] = 1; data[33] = 1; data[34] = 1; data[35] = 1;
    data[36] = 1; data[37] = 1; data[43] = 1; data[44] = 1; data[45] = -1;
    data[46] = 1; data[52] = 1; data[53] = 1; data[54] = -1; data[55] = 1;
    data[56] = -1; data[57] = 1; data[62] = 1; data[63] = 1; data[64] = 1;
    data[65] = -1; data[66] = -1; data[67] = -1; data[75] = -1; data[76] = -1;
    data[85] = -1; }




      if (boardnum == 948){
    player = -1;
    isLastPass = false;
    data[14] = 1; data[15] = 1; data[16] = 1; data[21] = -1; data[22] = 1;
    data[23] = 1; data[24] = 1; data[25] = 1; data[26] = 1; data[27] = 1;
    data[31] = -1; data[32] = 1; data[33] = 1; data[34] = 1; data[35] = -1;
    data[36] = 1; data[37] = 1; data[41] = -1; data[42] = 1; data[43] = 1;
    data[44] = 1; data[45] = 1; data[46] = 1; data[48] = 1; data[51] = -1;
    data[52] = 1; data[53] = 1; data[54] = 1; data[55] = 1; data[56] = 1;
    data[61] = -1; data[62] = 1; data[63] = 1; data[64] = 1; data[65] = 1;
    data[66] = 1; data[71] = -1; data[74] = 1; data[75] = 1; data[76] = 1;
    data[81] = -1; data[83] = 1; data[85] = 1; }




      if (boardnum == 949){
    player = 1;
    isLastPass = false;
    data[11] = -1; data[12] = 1; data[13] = -1; data[14] = -1; data[15] = -1;
    data[16] = -1; data[21] = -1; data[22] = -1; data[23] = 1; data[24] = -1;
    data[25] = -1; data[26] = -1; data[31] = -1; data[33] = -1; data[34] = -1;
    data[35] = 1; data[36] = -1; data[42] = -1; data[43] = -1; data[44] = 1;
    data[45] = 1; data[46] = -1; data[47] = -1; data[48] = -1; data[52] = -1;
    data[53] = 1; data[54] = -1; data[55] = -1; data[56] = -1; data[57] = -1;
    data[58] = -1; data[62] = 1; data[63] = -1; data[64] = -1; data[65] = -1;
    data[66] = -1; data[67] = -1; data[74] = -1; data[75] = 1; data[76] = -1;
    data[78] = -1; data[87] = -1; }




      if (boardnum == 950){
    player = -1;
    isLastPass = false;
    data[22] = 1; data[23] = 1; data[24] = 1; data[25] = 1; data[26] = 1;
    data[31] = 1; data[32] = 1; data[33] = 1; data[34] = -1; data[35] = -1;
    data[36] = 1; data[42] = 1; data[43] = -1; data[44] = -1; data[45] = -1;
    data[46] = 1; data[51] = 1; data[52] = 1; data[53] = 1; data[54] = 1;
    data[55] = 1; data[56] = 1; data[63] = 1; data[64] = 1; data[65] = 1;
    data[66] = 1; data[74] = 1; data[75] = 1; data[76] = 1; data[83] = 1;
    data[85] = 1; }




      if (boardnum == 951){
    player = 1;
    isLastPass = false;
    data[12] = 1; data[22] = 1; data[23] = 1; data[33] = 1; data[34] = -1;
    data[35] = -1; data[36] = -1; data[44] = 1; data[45] = -1; data[46] = 1;
    data[47] = 1; data[54] = -1; data[55] = 1; data[56] = -1; data[63] = -1;
    data[65] = 1; data[66] = 1; data[67] = -1; }




      if (boardnum == 952){
    player = 1;
    isLastPass = false;
    data[11] = -1; data[12] = 1; data[13] = 1; data[14] = 1; data[15] = 1;
    data[16] = 1; data[17] = 1; data[18] = 1; data[21] = 1; data[22] = 1;
    data[23] = 1; data[24] = -1; data[25] = -1; data[26] = 1; data[27] = 1;
    data[31] = -1; data[32] = 1; data[33] = -1; data[34] = 1; data[35] = 1;
    data[36] = -1; data[37] = 1; data[43] = 1; data[44] = 1; data[45] = -1;
    data[46] = -1; data[47] = -1; data[53] = 1; data[54] = -1; data[55] = -1;
    data[56] = -1; data[62] = 1; data[64] = -1; data[65] = -1; data[66] = -1;
    data[67] = -1; data[74] = 1; data[76] = -1; }




      if (boardnum == 953){
    player = 1;
    isLastPass = false;
    data[11] = -1; data[13] = -1; data[14] = -1; data[15] = -1; data[16] = -1;
    data[17] = -1; data[22] = -1; data[24] = -1; data[25] = 1; data[26] = -1;
    data[31] = -1; data[32] = -1; data[33] = -1; data[34] = -1; data[35] = -1;
    data[36] = -1; data[37] = -1; data[41] = 1; data[42] = -1; data[43] = 1;
    data[44] = 1; data[45] = 1; data[46] = 1; data[47] = 1; data[53] = 1;
    data[54] = 1; data[55] = 1; data[56] = 1; data[62] = 1; data[63] = 1;
    data[64] = 1; data[65] = 1; data[73] = 1; data[74] = 1; data[75] = 1;
    data[76] = -1; }




      if (boardnum == 954){
    player = 1;
    isLastPass = false;
    data[31] = 1; data[33] = 1; data[35] = -1; data[42] = 1; data[44] = -1;
    data[45] = -1; data[46] = 1; data[53] = -1; data[54] = -1; data[55] = 1;
    data[62] = -1; data[63] = -1; data[64] = -1; data[65] = -1; data[66] = -1;
    data[73] = 1; }




      if (boardnum == 955){
    player = 1;
    isLastPass = false;
    data[13] = -1; data[14] = -1; data[15] = -1; data[16] = -1; data[24] = 1;
    data[25] = 1; data[26] = 1; data[32] = 1; data[33] = 1; data[34] = 1;
    data[35] = 1; data[36] = 1; data[37] = 1; data[38] = 1; data[42] = 1;
    data[43] = 1; data[44] = -1; data[45] = -1; data[46] = 1; data[47] = -1;
    data[48] = -1; data[52] = 1; data[53] = 1; data[54] = 1; data[55] = -1;
    data[56] = 1; data[57] = -1; data[62] = 1; data[63] = 1; data[64] = 1;
    data[66] = 1; data[73] = 1; data[74] = 1; data[76] = 1; }




      if (boardnum == 956){
    player = -1;
    isLastPass = false;
    data[11] = -1; data[12] = -1; data[13] = -1; data[14] = -1; data[15] = -1;
    data[16] = -1; data[17] = -1; data[21] = 1; data[22] = 1; data[23] = -1;
    data[24] = -1; data[25] = 1; data[26] = 1; data[27] = 1; data[28] = 1;
    data[31] = 1; data[32] = 1; data[33] = 1; data[34] = -1; data[35] = 1;
    data[36] = 1; data[37] = 1; data[41] = -1; data[43] = 1; data[44] = -1;
    data[45] = 1; data[46] = -1; data[47] = 1; data[54] = -1; data[55] = -1;
    data[56] = 1; data[57] = 1; data[63] = -1; data[64] = -1; data[65] = -1;
    data[66] = -1; data[67] = 1; data[76] = -1; data[78] = 1; }




      if (boardnum == 957){
    player = 1;
    isLastPass = false;
    data[11] = -1; data[12] = -1; data[13] = -1; data[14] = -1; data[15] = -1;
    data[16] = -1; data[17] = -1; data[21] = 1; data[22] = 1; data[23] = -1;
    data[24] = 1; data[25] = 1; data[26] = -1; data[28] = 1; data[31] = 1;
    data[32] = 1; data[33] = 1; data[34] = 1; data[35] = 1; data[36] = -1;
    data[37] = 1; data[41] = -1; data[43] = 1; data[44] = 1; data[45] = 1;
    data[46] = -1; data[47] = 1; data[54] = 1; data[55] = 1; data[56] = -1;
    data[57] = 1; data[63] = -1; data[65] = 1; data[66] = -1; data[67] = -1;
    data[76] = -1; }




      if (boardnum == 958){
    player = 1;
    isLastPass = false;
    data[12] = 1; data[13] = -1; data[15] = 1; data[23] = 1; data[24] = -1;
    data[25] = 1; data[26] = 1; data[27] = -1; data[32] = -1; data[33] = -1;
    data[34] = -1; data[35] = -1; data[36] = 1; data[37] = 1; data[41] = -1;
    data[42] = -1; data[43] = -1; data[44] = -1; data[45] = -1; data[46] = -1;
    data[48] = 1; data[51] = -1; data[52] = -1; data[53] = -1; data[54] = -1;
    data[55] = -1; data[56] = -1; data[57] = 1; data[62] = -1; data[64] = 1;
    data[65] = 1; data[66] = 1; data[67] = 1; data[73] = -1; data[74] = 1;
    data[75] = 1; data[76] = -1; data[84] = 1; }




      if (boardnum == 959){
    player = 1;
    isLastPass = false;
    data[13] = 1; data[23] = 1; data[24] = -1; data[25] = 1; data[26] = 1;
    data[32] = 1; data[33] = 1; data[34] = -1; data[35] = -1; data[36] = 1;
    data[37] = 1; data[38] = 1; data[42] = 1; data[43] = 1; data[44] = -1;
    data[45] = 1; data[46] = -1; data[47] = 1; data[53] = -1; data[54] = -1;
    data[55] = -1; data[56] = 1; data[64] = -1; data[65] = 1; data[66] = 1;
    data[76] = 1; }




      if (boardnum == 960){
    player = -1;
    isLastPass = false;
    data[13] = -1; data[14] = -1; data[23] = -1; data[24] = -1; data[25] = -1;
    data[26] = -1; data[33] = 1; data[34] = -1; data[35] = -1; data[36] = -1;
    data[44] = 1; data[45] = 1; data[46] = -1; data[47] = -1; data[48] = -1;
    data[53] = -1; data[54] = 1; data[55] = 1; data[56] = 1; data[57] = -1;
    data[58] = -1; data[63] = 1; data[65] = 1; data[66] = -1; data[67] = 1;
    }




      if (boardnum == 961){
    player = 1;
    isLastPass = false;
    data[13] = 1; data[14] = -1; data[15] = -1; data[16] = -1; data[23] = -1;
    data[24] = 1; data[25] = -1; data[32] = -1; data[33] = -1; data[34] = -1;
    data[35] = 1; data[36] = -1; data[37] = -1; data[43] = -1; data[44] = 1;
    data[45] = 1; data[46] = -1; data[52] = -1; data[54] = -1; data[55] = -1;
    data[56] = -1; data[65] = -1; }




      if (boardnum == 962){
    player = 1;
    isLastPass = false;
    data[24] = -1; data[33] = 1; data[35] = -1; data[37] = 1; data[44] = 1;
    data[45] = 1; data[46] = -1; data[54] = -1; data[55] = 1; data[56] = -1;
    data[57] = -1; data[63] = -1; data[65] = 1; data[66] = 1; data[67] = -1;
    data[77] = -1; }




      if (boardnum == 963){
    player = 1;
    isLastPass = false;
    data[23] = -1; data[25] = 1; data[33] = -1; data[34] = -1; data[35] = 1;
    data[36] = 1; data[37] = -1; data[38] = -1; data[43] = 1; data[44] = 1;
    data[45] = -1; data[46] = 1; data[47] = -1; data[54] = 1; data[55] = -1;
    data[56] = -1; data[65] = -1; data[67] = -1; }




      if (boardnum == 964){
    player = 1;
    isLastPass = false;
    data[34] = 1; data[35] = 1; data[42] = 1; data[43] = 1; data[44] = 1;
    data[45] = 1; data[46] = 1; data[54] = 1; data[55] = 1; data[56] = -1;
    data[57] = -1; data[58] = -1; data[63] = 1; data[64] = -1; data[65] = -1;
    data[66] = -1; data[67] = -1; data[77] = 1; }




      if (boardnum == 965){
    player = -1;
    isLastPass = false;
    data[12] = -1; data[23] = -1; data[24] = -1; data[33] = -1; data[34] = -1;
    data[35] = -1; data[36] = -1; data[37] = -1; data[41] = 1; data[43] = -1;
    data[44] = -1; data[45] = -1; data[46] = -1; data[47] = -1; data[51] = 1;
    data[52] = 1; data[53] = 1; data[54] = 1; data[55] = 1; data[56] = -1;
    data[61] = 1; data[62] = 1; data[63] = 1; data[64] = 1; data[65] = 1;
    data[72] = -1; data[73] = -1; data[74] = -1; data[75] = 1; data[82] = -1;
    data[84] = -1; }




      if (boardnum == 966){
    player = -1;
    isLastPass = false;
    data[12] = 1; data[13] = -1; data[15] = 1; data[23] = 1; data[24] = -1;
    data[25] = 1; data[26] = 1; data[27] = 1; data[28] = 1; data[32] = -1;
    data[33] = -1; data[34] = -1; data[35] = -1; data[36] = 1; data[37] = 1;
    data[41] = -1; data[42] = -1; data[43] = -1; data[44] = -1; data[45] = -1;
    data[46] = -1; data[48] = 1; data[51] = -1; data[52] = -1; data[53] = -1;
    data[54] = -1; data[55] = -1; data[56] = -1; data[57] = 1; data[62] = -1;
    data[64] = 1; data[65] = 1; data[66] = 1; data[67] = 1; data[73] = -1;
    data[74] = 1; data[75] = 1; data[76] = -1; data[84] = 1; }




      if (boardnum == 967){
    player = 1;
    isLastPass = false;
    data[13] = -1; data[14] = 1; data[15] = 1; data[23] = -1; data[24] = 1;
    data[25] = 1; data[26] = 1; data[32] = -1; data[33] = -1; data[34] = 1;
    data[35] = 1; data[36] = 1; data[37] = 1; data[42] = -1; data[43] = -1;
    data[44] = -1; data[45] = -1; data[46] = -1; data[47] = -1; data[48] = -1;
    data[52] = 1; data[53] = 1; data[54] = -1; data[55] = 1; data[56] = -1;
    data[57] = -1; data[63] = 1; data[64] = 1; data[65] = -1; data[66] = -1;
    data[67] = -1; data[73] = -1; data[74] = 1; data[76] = -1; }




      if (boardnum == 968){
    player = -1;
    isLastPass = false;
    data[13] = 1; data[15] = -1; data[18] = -1; data[23] = 1; data[24] = -1;
    data[25] = -1; data[27] = -1; data[32] = 1; data[33] = 1; data[34] = -1;
    data[35] = 1; data[36] = -1; data[37] = -1; data[38] = -1; data[42] = 1;
    data[43] = 1; data[44] = -1; data[45] = 1; data[46] = -1; data[47] = -1;
    data[52] = -1; data[53] = 1; data[54] = 1; data[55] = 1; data[57] = 1;
    data[63] = 1; data[64] = 1; data[65] = 1; data[66] = -1; data[68] = 1;
    data[73] = 1; data[74] = 1; data[75] = -1; data[77] = -1; data[88] = -1;
    }




      if (boardnum == 969){
    player = 1;
    isLastPass = false;
    data[11] = -1; data[12] = -1; data[13] = -1; data[14] = 1; data[21] = -1;
    data[22] = -1; data[23] = -1; data[24] = -1; data[25] = 1; data[28] = 1;
    data[32] = 1; data[33] = -1; data[34] = -1; data[35] = -1; data[36] = 1;
    data[37] = 1; data[38] = 1; data[41] = 1; data[42] = 1; data[43] = 1;
    data[44] = -1; data[45] = -1; data[46] = 1; data[47] = 1; data[48] = 1;
    data[52] = 1; data[53] = -1; data[54] = 1; data[55] = -1; data[56] = 1;
    data[57] = 1; data[58] = 1; data[61] = -1; data[63] = 1; data[64] = 1;
    data[65] = 1; data[66] = 1; data[74] = 1; data[75] = 1; data[76] = 1;
    data[77] = 1; data[84] = 1; data[86] = 1; data[88] = 1; }




      if (boardnum == 970){
    player = 1;
    isLastPass = false;
    data[23] = -1; data[24] = 1; data[25] = 1; data[34] = 1; data[35] = 1;
    data[43] = -1; data[44] = -1; data[45] = -1; data[46] = 1; data[52] = 1;
    data[53] = 1; data[54] = 1; data[55] = -1; data[56] = 1; data[57] = 1;
    data[64] = -1; data[65] = 1; data[73] = -1; data[75] = 1; data[76] = 1;
    }




      if (boardnum == 971){
    player = -1;
    isLastPass = false;
    data[15] = 1; data[22] = -1; data[24] = 1; data[25] = 1; data[33] = -1;
    data[35] = 1; data[37] = 1; data[44] = -1; data[45] = 1; data[46] = -1;
    data[54] = -1; data[55] = -1; data[56] = -1; data[57] = -1; data[63] = -1;
    data[65] = 1; data[66] = -1; data[67] = -1; data[77] = -1; }




      if (boardnum == 972){
    player = -1;
    isLastPass = false;
    data[31] = -1; data[32] = -1; data[33] = -1; data[34] = -1; data[35] = -1;
    data[36] = 1; data[41] = -1; data[42] = -1; data[43] = -1; data[44] = -1;
    data[45] = 1; data[46] = 1; data[52] = -1; data[53] = -1; data[54] = 1;
    data[55] = 1; data[56] = 1; data[62] = -1; data[63] = -1; data[64] = 1;
    data[65] = 1; data[66] = 1; data[71] = -1; data[73] = 1; data[74] = 1;
    data[83] = 1; data[84] = 1; }




      if (boardnum == 973){
    player = 1;
    isLastPass = false;
    data[24] = -1; data[25] = 1; data[26] = 1; data[28] = -1; data[33] = -1;
    data[34] = -1; data[35] = -1; data[36] = -1; data[37] = -1; data[38] = -1;
    data[43] = 1; data[44] = 1; data[45] = 1; data[46] = -1; data[47] = -1;
    data[48] = -1; data[54] = 1; data[55] = -1; data[56] = -1; data[57] = 1;
    data[58] = -1; data[66] = -1; data[67] = 1; data[68] = 1; }




      if (boardnum == 974){
    player = -1;
    isLastPass = false;
    data[11] = 1; data[12] = 1; data[13] = 1; data[14] = 1; data[15] = 1;
    data[16] = 1; data[17] = 1; data[18] = 1; data[21] = 1; data[22] = 1;
    data[23] = 1; data[24] = -1; data[25] = -1; data[26] = -1; data[27] = 1;
    data[28] = 1; data[31] = 1; data[32] = 1; data[33] = 1; data[34] = 1;
    data[35] = 1; data[36] = 1; data[37] = 1; data[38] = 1; data[43] = -1;
    data[44] = -1; data[45] = -1; data[46] = -1; data[47] = -1; data[48] = -1;
    data[53] = -1; data[54] = -1; data[55] = 1; data[56] = -1; data[57] = -1;
    data[64] = -1; data[65] = -1; data[66] = 1; data[74] = -1; }




      if (boardnum == 975){
    player = 1;
    isLastPass = false;
    data[11] = -1; data[14] = -1; data[16] = -1; data[21] = -1; data[22] = 1;
    data[23] = 1; data[24] = 1; data[26] = -1; data[31] = -1; data[32] = -1;
    data[33] = -1; data[34] = 1; data[35] = 1; data[36] = -1; data[41] = 1;
    data[43] = 1; data[44] = 1; data[45] = -1; data[47] = -1; data[52] = 1;
    data[53] = 1; data[54] = 1; data[55] = 1; data[56] = -1; data[63] = 1;
    data[64] = 1; data[65] = -1; data[73] = 1; data[74] = 1; data[75] = 1;
    }




      if (boardnum == 976){
    player = -1;
    isLastPass = false;
    data[15] = 1; data[16] = -1; data[21] = 1; data[24] = 1; data[25] = 1;
    data[26] = -1; data[31] = 1; data[32] = 1; data[33] = 1; data[34] = 1;
    data[35] = 1; data[36] = -1; data[37] = -1; data[38] = -1; data[41] = 1;
    data[42] = -1; data[43] = 1; data[44] = 1; data[45] = -1; data[46] = 1;
    data[47] = 1; data[51] = 1; data[53] = 1; data[54] = 1; data[55] = 1;
    data[56] = 1; data[57] = 1; data[63] = 1; data[64] = 1; data[65] = 1;
    data[66] = 1; data[67] = 1; data[73] = 1; data[74] = 1; data[83] = 1;
    }




      if (boardnum == 977){
    player = 1;
    isLastPass = false;
    data[13] = -1; data[14] = -1; data[15] = -1; data[16] = -1; data[24] = 1;
    data[25] = 1; data[26] = 1; data[32] = 1; data[33] = 1; data[34] = 1;
    data[35] = 1; data[36] = 1; data[37] = 1; data[38] = 1; data[42] = 1;
    data[43] = 1; data[44] = -1; data[45] = -1; data[46] = 1; data[47] = -1;
    data[48] = -1; data[52] = 1; data[53] = 1; data[54] = 1; data[55] = -1;
    data[56] = 1; data[57] = -1; data[62] = 1; data[63] = 1; data[64] = 1;
    data[66] = 1; data[73] = 1; data[74] = 1; data[76] = 1; }




      if (boardnum == 978){
    player = -1;
    isLastPass = false;
    data[12] = -1; data[21] = -1; data[23] = -1; data[24] = -1; data[25] = 1;
    data[31] = -1; data[32] = -1; data[33] = -1; data[34] = 1; data[35] = -1;
    data[36] = -1; data[37] = -1; data[41] = 1; data[42] = -1; data[43] = 1;
    data[44] = -1; data[45] = -1; data[46] = -1; data[47] = -1; data[51] = 1;
    data[52] = 1; data[53] = -1; data[54] = -1; data[55] = -1; data[56] = -1;
    data[61] = 1; data[62] = -1; data[63] = -1; data[64] = -1; data[65] = -1;
    data[66] = -1; data[71] = 1; data[72] = -1; data[73] = -1; data[74] = -1;
    data[75] = -1; data[81] = 1; data[82] = -1; data[84] = -1; }




      if (boardnum == 979){
    player = -1;
    isLastPass = false;
    data[13] = -1; data[14] = 1; data[15] = 1; data[16] = 1; data[23] = -1;
    data[24] = -1; data[25] = 1; data[31] = 1; data[33] = -1; data[34] = 1;
    data[35] = -1; data[36] = -1; data[37] = -1; data[38] = -1; data[42] = 1;
    data[43] = 1; data[44] = 1; data[45] = -1; data[46] = -1; data[47] = -1;
    data[51] = -1; data[52] = 1; data[53] = 1; data[54] = 1; data[55] = 1;
    data[56] = -1; data[57] = -1; data[62] = -1; data[63] = 1; data[64] = -1;
    data[65] = -1; data[66] = -1; data[67] = -1; data[73] = -1; data[74] = 1;
    }




      if (boardnum == 980){
    player = 1;
    isLastPass = false;
    data[13] = -1; data[22] = 1; data[23] = -1; data[24] = -1; data[32] = -1;
    data[33] = 1; data[34] = -1; data[43] = -1; data[44] = 1; data[45] = 1;
    data[46] = 1; data[47] = 1; data[52] = -1; data[54] = -1; data[55] = 1;
    data[56] = 1; data[63] = -1; data[64] = -1; data[66] = 1; data[72] = -1;
    }




      if (boardnum == 981){
    player = -1;
    isLastPass = false;
    data[13] = -1; data[23] = -1; data[24] = -1; data[25] = 1; data[26] = -1;
    data[34] = -1; data[35] = 1; data[36] = -1; data[44] = 1; data[45] = 1;
    data[46] = -1; data[47] = -1; data[54] = 1; data[55] = 1; data[56] = -1;
    data[58] = -1; data[65] = 1; }




      if (boardnum == 982){
    player = 1;
    isLastPass = false;
    data[24] = -1; data[33] = 1; data[35] = -1; data[37] = 1; data[44] = 1;
    data[45] = 1; data[46] = -1; data[54] = -1; data[55] = 1; data[56] = -1;
    data[57] = -1; data[63] = -1; data[65] = 1; data[66] = 1; data[67] = -1;
    data[77] = -1; }




      if (boardnum == 983){
    player = -1;
    isLastPass = false;
    data[11] = -1; data[12] = -1; data[13] = -1; data[14] = -1; data[15] = -1;
    data[16] = -1; data[17] = -1; data[18] = 1; data[22] = -1; data[23] = -1;
    data[24] = -1; data[25] = -1; data[26] = -1; data[27] = 1; data[28] = -1;
    data[31] = -1; data[32] = -1; data[33] = 1; data[34] = -1; data[35] = -1;
    data[36] = 1; data[41] = -1; data[42] = -1; data[43] = -1; data[44] = -1;
    data[45] = 1; data[46] = 1; data[47] = 1; data[51] = 1; data[52] = 1;
    data[53] = 1; data[54] = 1; data[55] = 1; data[56] = 1; data[65] = 1;
    data[66] = 1; data[74] = 1; data[75] = 1; data[76] = 1; }




      if (boardnum == 984){
    player = -1;
    isLastPass = false;
    data[34] = 1; data[35] = 1; data[42] = 1; data[43] = 1; data[44] = 1;
    data[45] = 1; data[46] = 1; data[47] = 1; data[48] = -1; data[53] = 1;
    data[54] = -1; data[55] = 1; data[56] = -1; data[57] = -1; data[58] = -1;
    data[62] = 1; data[63] = 1; data[64] = 1; data[65] = -1; data[66] = -1;
    data[67] = 1; data[73] = 1; data[77] = 1; }




      if (boardnum == 985){
    player = 1;
    isLastPass = false;
    data[16] = 1; data[25] = 1; data[26] = 1; data[34] = 1; data[35] = -1;
    data[36] = -1; data[37] = -1; data[43] = 1; data[44] = -1; data[45] = 1;
    data[46] = -1; data[47] = -1; data[53] = 1; data[54] = 1; data[55] = -1;
    data[56] = 1; data[57] = -1; data[63] = 1; data[64] = 1; data[65] = 1;
    data[66] = 1; data[67] = 1; data[74] = 1; data[75] = 1; data[76] = 1;
    data[83] = 1; }




      if (boardnum == 986){
    player = 1;
    isLastPass = false;
    data[23] = -1; data[24] = 1; data[27] = -1; data[33] = -1; data[34] = 1;
    data[35] = 1; data[36] = -1; data[37] = 1; data[43] = -1; data[44] = -1;
    data[45] = -1; data[46] = 1; data[47] = 1; data[52] = -1; data[53] = -1;
    data[54] = -1; data[55] = -1; data[56] = 1; data[61] = 1; data[62] = 1;
    data[63] = 1; data[64] = 1; data[65] = 1; data[66] = 1; data[73] = 1;
    data[74] = 1; data[75] = 1; data[76] = -1; data[77] = -1; data[78] = -1;
    data[82] = 1; data[87] = -1; }




      if (boardnum == 987){
    player = -1;
    isLastPass = false;
    data[11] = -1; data[14] = -1; data[16] = -1; data[21] = -1; data[22] = 1;
    data[23] = 1; data[24] = 1; data[26] = -1; data[31] = -1; data[32] = -1;
    data[33] = -1; data[34] = 1; data[35] = -1; data[36] = -1; data[41] = 1;
    data[43] = -1; data[44] = -1; data[45] = -1; data[47] = -1; data[52] = 1;
    data[53] = -1; data[54] = -1; data[55] = 1; data[56] = -1; data[61] = 1;
    data[62] = 1; data[63] = -1; data[64] = 1; data[65] = -1; data[66] = 1;
    data[72] = 1; data[73] = 1; data[74] = 1; data[75] = 1; data[76] = 1;
    data[77] = 1; data[83] = -1; }




      if (boardnum == 988){
    player = 1;
    isLastPass = false;
    data[25] = 1; data[32] = -1; data[33] = -1; data[34] = -1; data[35] = -1;
    data[36] = -1; data[37] = -1; data[43] = -1; data[44] = 1; data[45] = 1;
    data[46] = 1; data[47] = 1; data[53] = -1; data[54] = -1; data[55] = 1;
    data[56] = 1; data[63] = -1; data[64] = 1; }




      if (boardnum == 989){
    player = -1;
    isLastPass = false;
    data[12] = 1; data[13] = 1; data[14] = 1; data[15] = 1; data[16] = 1;
    data[21] = 1; data[23] = 1; data[24] = -1; data[25] = -1; data[26] = 1;
    data[31] = 1; data[33] = -1; data[34] = 1; data[35] = -1; data[36] = 1;
    data[37] = 1; data[41] = 1; data[42] = -1; data[43] = -1; data[44] = 1;
    data[45] = -1; data[46] = -1; data[47] = 1; data[51] = 1; data[52] = 1;
    data[53] = -1; data[54] = -1; data[55] = -1; data[56] = -1; data[58] = 1;
    data[61] = 1; data[62] = 1; data[63] = 1; data[64] = -1; data[65] = -1;
    data[66] = -1; data[73] = -1; data[74] = -1; data[75] = -1; data[84] = -1;
    data[85] = -1; data[86] = -1; data[87] = -1; }




      if (boardnum == 990){
    player = -1;
    isLastPass = false;
    data[14] = -1; data[16] = 1; data[23] = -1; data[24] = -1; data[25] = -1;
    data[26] = -1; data[27] = -1; data[33] = -1; data[34] = 1; data[35] = 1;
    data[36] = -1; data[37] = -1; data[38] = -1; data[42] = -1; data[43] = -1;
    data[44] = 1; data[45] = -1; data[46] = 1; data[47] = -1; data[51] = -1;
    data[53] = -1; data[54] = -1; data[55] = -1; data[56] = 1; data[57] = 1;
    data[64] = -1; data[65] = -1; data[66] = 1; data[67] = -1; }




      if (boardnum == 991){
    player = -1;
    isLastPass = false;
    data[32] = -1; data[42] = 1; data[43] = 1; data[44] = 1; data[45] = 1;
    data[46] = -1; data[53] = 1; data[54] = -1; data[55] = -1; data[56] = -1;
    data[57] = -1; data[62] = 1; data[64] = -1; data[65] = -1; data[66] = -1;
    data[67] = 1; data[76] = -1; }




      if (boardnum == 992){
    player = 1;
    isLastPass = false;
    data[11] = -1; data[12] = -1; data[13] = -1; data[22] = -1; data[23] = 1;
    data[24] = -1; data[25] = 1; data[28] = 1; data[32] = -1; data[33] = 1;
    data[34] = 1; data[35] = -1; data[36] = -1; data[37] = 1; data[43] = 1;
    data[44] = 1; data[45] = 1; data[46] = 1; data[47] = 1; data[54] = 1;
    data[55] = 1; data[56] = -1; data[63] = -1; data[65] = 1; data[66] = 1;
    data[67] = -1; }




      if (boardnum == 993){
    player = 1;
    isLastPass = false;
    data[14] = 1; data[15] = 1; data[16] = 1; data[17] = 1; data[18] = 1;
    data[22] = 1; data[23] = 1; data[24] = 1; data[25] = 1; data[26] = 1;
    data[27] = 1; data[28] = 1; data[33] = 1; data[34] = 1; data[35] = 1;
    data[36] = -1; data[37] = 1; data[38] = 1; data[43] = -1; data[44] = 1;
    data[45] = -1; data[46] = -1; data[47] = -1; data[52] = -1; data[53] = -1;
    data[54] = -1; data[55] = -1; data[56] = -1; data[57] = -1; data[64] = -1;
    data[65] = -1; data[66] = -1; data[67] = -1; data[68] = -1; data[73] = -1;
    data[74] = -1; data[75] = -1; data[76] = -1; data[83] = -1; data[86] = -1;
    }




      if (boardnum == 994){
    player = -1;
    isLastPass = false;
    data[16] = 1; data[25] = 1; data[26] = 1; data[34] = 1; data[35] = 1;
    data[36] = 1; data[37] = -1; data[42] = -1; data[43] = -1; data[44] = 1;
    data[45] = -1; data[46] = -1; data[53] = -1; data[54] = 1; data[55] = -1;
    data[63] = -1; data[64] = 1; data[73] = -1; data[74] = 1; }




      if (boardnum == 995){
    player = 1;
    isLastPass = false;
    data[16] = 1; data[23] = -1; data[24] = 1; data[25] = 1; data[33] = -1;
    data[34] = -1; data[35] = -1; data[36] = -1; data[37] = 1; data[41] = 1;
    data[42] = 1; data[43] = -1; data[44] = 1; data[45] = -1; data[46] = -1;
    data[47] = -1; data[51] = 1; data[52] = 1; data[53] = 1; data[54] = -1;
    data[55] = 1; data[56] = -1; data[61] = 1; data[62] = 1; data[63] = 1;
    data[64] = 1; data[65] = 1; data[66] = -1; data[73] = -1; data[74] = -1;
    data[75] = -1; data[84] = -1; }




      if (boardnum == 996){
    player = 1;
    isLastPass = false;
    data[13] = -1; data[15] = 1; data[22] = -1; data[24] = -1; data[25] = 1;
    data[33] = -1; data[35] = -1; data[37] = 1; data[44] = -1; data[45] = 1;
    data[46] = -1; data[54] = -1; data[55] = -1; data[56] = -1; data[57] = -1;
    data[63] = -1; data[65] = 1; data[66] = -1; data[67] = -1; data[77] = -1;
    }




      if (boardnum == 997){
    player = -1;
    isLastPass = false;
    data[15] = 1; data[21] = 1; data[24] = 1; data[25] = 1; data[26] = 1;
    data[31] = 1; data[32] = 1; data[33] = 1; data[34] = 1; data[35] = 1;
    data[36] = 1; data[37] = 1; data[41] = 1; data[42] = -1; data[43] = 1;
    data[44] = 1; data[45] = -1; data[46] = 1; data[47] = 1; data[51] = 1;
    data[53] = 1; data[54] = 1; data[55] = -1; data[56] = 1; data[63] = 1;
    data[64] = 1; data[65] = 1; data[66] = -1; data[73] = 1; data[74] = 1;
    data[83] = 1; }




      if (boardnum == 998){
    player = 1;
    isLastPass = false;
    data[23] = -1; data[24] = 1; data[26] = 1; data[33] = -1; data[34] = -1;
    data[35] = 1; data[36] = -1; data[42] = -1; data[43] = 1; data[44] = 1;
    data[45] = -1; data[46] = 1; data[47] = 1; data[48] = 1; data[51] = -1;
    data[52] = -1; data[53] = -1; data[54] = -1; data[55] = -1; data[56] = 1;
    data[57] = 1; data[61] = -1; data[62] = -1; data[63] = 1; data[64] = -1;
    data[65] = -1; data[66] = 1; data[73] = -1; data[74] = -1; data[75] = -1;
    data[76] = 1; data[83] = 1; data[84] = -1; data[85] = 1; }




      if (boardnum == 999){
    player = 1;
    isLastPass = false;
    data[11] = -1; data[12] = -1; data[13] = -1; data[14] = -1; data[15] = -1;
    data[16] = -1; data[17] = -1; data[18] = -1; data[22] = -1; data[23] = -1;
    data[24] = -1; data[25] = -1; data[26] = -1; data[27] = -1; data[28] = -1;
    data[32] = -1; data[33] = -1; data[34] = -1; data[35] = -1; data[36] = -1;
    data[37] = -1; data[38] = -1; data[44] = 1; data[45] = 1; data[46] = 1;
    data[47] = 1; data[48] = 1; data[53] = 1; data[54] = 1; data[55] = 1;
    data[56] = 1; data[57] = 1; data[58] = 1; data[62] = 1; data[63] = 1;
    data[64] = 1; data[65] = 1; data[66] = 1; data[67] = 1; data[68] = 1;
    }




      if (boardnum == 1000){
    player = -1;
    isLastPass = false;
    data[13] = -1; data[14] = -1; data[15] = -1; data[16] = -1; data[21] = 1;
    data[22] = 1; data[23] = -1; data[24] = -1; data[25] = -1; data[26] = -1;
    data[32] = 1; data[33] = 1; data[34] = -1; data[35] = -1; data[36] = -1;
    data[37] = -1; data[38] = 1; data[41] = -1; data[42] = -1; data[43] = 1;
    data[44] = -1; data[45] = -1; data[46] = -1; data[47] = -1; data[48] = 1;
    data[52] = -1; data[53] = -1; data[54] = -1; data[55] = -1; data[56] = -1;
    data[57] = -1; data[58] = 1; data[62] = 1; data[63] = -1; data[64] = -1;
    data[65] = 1; data[66] = 1; data[67] = 1; data[68] = 1; data[74] = 1;
    data[75] = 1; data[83] = 1; data[84] = 1; }




  }
}
