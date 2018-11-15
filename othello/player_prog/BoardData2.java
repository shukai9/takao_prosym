import java.util.*;
import java.util.Scanner;

public class BoardData2 {
  final static int SIZE = 100;
  int data[] = new int[SIZE];
  int player;
  boolean isLastPass;

  public BoardData2(int boardnum){
      if (boardnum == 201){
    player = -1;
    isLastPass = false;
    data[32] = 1; data[33] = 1; data[34] = 1; data[35] = 1; data[36] = -1;
    data[41] = 1; data[42] = 1; data[43] = 1; data[44] = 1; data[45] = 1;
    data[46] = -1; data[51] = 1; data[52] = 1; data[53] = -1; data[54] = -1;
    data[55] = 1; data[56] = -1; data[61] = 1; data[62] = 1; data[63] = 1;
    data[64] = -1; data[65] = -1; data[66] = -1; data[74] = -1; data[75] = -1;
    data[76] = -1; data[83] = 1; data[84] = 1; data[85] = 1; }




      if (boardnum == 202){
    player = -1;
    isLastPass = false;
    data[23] = 1; data[24] = -1; data[32] = 1; data[33] = 1; data[34] = -1;
    data[35] = -1; data[36] = 1; data[38] = 1; data[43] = 1; data[44] = 1;
    data[45] = 1; data[46] = -1; data[47] = 1; data[52] = 1; data[53] = 1;
    data[54] = -1; data[55] = -1; data[56] = 1; data[63] = 1; data[64] = -1;
    data[65] = -1; }




      if (boardnum == 203){
    player = 1;
    isLastPass = false;
    data[11] = -1; data[16] = -1; data[21] = 1; data[22] = 1; data[23] = 1;
    data[26] = -1; data[32] = 1; data[33] = -1; data[34] = -1; data[35] = 1;
    data[36] = -1; data[41] = 1; data[44] = 1; data[45] = -1; data[52] = 1;
    data[54] = -1; data[55] = -1; data[56] = 1; data[63] = 1; data[64] = -1;
    data[65] = -1; data[73] = 1; data[74] = 1; data[75] = 1; }




      if (boardnum == 204){
    player = 1;
    isLastPass = false;
    data[13] = -1; data[23] = -1; data[24] = -1; data[25] = 1; data[26] = -1;
    data[33] = -1; data[34] = 1; data[35] = 1; data[36] = 1; data[37] = 1;
    data[42] = -1; data[43] = -1; data[44] = -1; data[45] = -1; data[46] = -1;
    data[47] = 1; data[53] = 1; data[54] = 1; data[55] = 1; data[56] = -1;
    data[57] = -1; data[63] = 1; data[64] = 1; data[65] = 1; data[66] = 1;
    data[73] = -1; data[74] = 1; data[76] = -1; }




      if (boardnum == 205){
    player = -1;
    isLastPass = false;
    data[11] = 1; data[12] = 1; data[13] = 1; data[14] = 1; data[15] = 1;
    data[16] = 1; data[17] = 1; data[18] = 1; data[21] = 1; data[22] = 1;
    data[23] = -1; data[24] = 1; data[25] = 1; data[26] = 1; data[27] = 1;
    data[28] = -1; data[31] = 1; data[32] = -1; data[33] = 1; data[34] = 1;
    data[35] = -1; data[36] = 1; data[37] = -1; data[41] = -1; data[44] = -1;
    data[45] = -1; data[46] = -1; data[47] = -1; data[53] = -1; data[54] = -1;
    data[55] = 1; data[56] = -1; data[57] = -1; data[64] = -1; data[65] = -1;
    data[66] = -1; data[76] = -1; }




      if (boardnum == 206){
    player = 1;
    isLastPass = false;
    data[24] = -1; data[31] = 1; data[33] = -1; data[34] = -1; data[35] = 1;
    data[41] = 1; data[42] = -1; data[43] = -1; data[44] = -1; data[45] = 1;
    data[51] = 1; data[52] = -1; data[53] = -1; data[54] = -1; data[55] = 1;
    data[56] = 1; data[57] = 1; data[61] = 1; data[62] = 1; data[63] = -1;
    data[64] = -1; data[65] = 1; data[66] = 1; data[71] = 1; data[73] = -1;
    data[74] = -1; data[75] = -1; data[83] = 1; data[84] = -1; data[86] = -1;
    }




      if (boardnum == 207){
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




      if (boardnum == 208){
    player = 1;
    isLastPass = false;
    data[25] = -1; data[34] = -1; data[35] = -1; data[36] = 1; data[37] = 1;
    data[42] = 1; data[43] = -1; data[44] = 1; data[45] = 1; data[46] = 1;
    data[52] = -1; data[54] = -1; data[55] = 1; data[57] = -1; data[64] = -1;
    data[66] = 1; }




      if (boardnum == 209){
    player = 1;
    isLastPass = false;
    data[12] = 1; data[13] = 1; data[14] = 1; data[21] = -1; data[23] = 1;
    data[32] = -1; data[33] = -1; data[34] = 1; data[35] = 1; data[37] = -1;
    data[43] = -1; data[44] = 1; data[45] = 1; data[46] = -1; data[52] = -1;
    data[53] = -1; data[54] = -1; data[55] = -1; data[56] = -1; data[57] = -1;
    data[62] = 1; data[63] = -1; data[64] = -1; data[65] = -1; data[73] = -1;
    data[74] = -1; data[75] = -1; data[76] = -1; data[84] = 1; data[87] = -1;
    }




      if (boardnum == 210){
    player = -1;
    isLastPass = false;
    data[21] = -1; data[32] = -1; data[33] = -1; data[34] = -1; data[35] = -1;
    data[36] = -1; data[37] = -1; data[43] = -1; data[44] = -1; data[45] = -1;
    data[46] = -1; data[47] = -1; data[48] = -1; data[51] = -1; data[52] = -1;
    data[53] = -1; data[54] = -1; data[55] = 1; data[56] = 1; data[57] = -1;
    data[62] = -1; data[63] = -1; data[64] = -1; data[65] = 1; data[66] = 1;
    data[67] = -1; data[74] = 1; data[75] = -1; data[78] = -1; }




      if (boardnum == 211){
    player = -1;
    isLastPass = false;
    data[11] = 1; data[12] = 1; data[13] = 1; data[14] = 1; data[15] = 1;
    data[16] = 1; data[17] = 1; data[18] = 1; data[21] = 1; data[22] = 1;
    data[23] = 1; data[24] = 1; data[25] = -1; data[26] = -1; data[27] = 1;
    data[28] = 1; data[31] = 1; data[32] = 1; data[33] = 1; data[34] = 1;
    data[35] = 1; data[36] = 1; data[37] = 1; data[38] = 1; data[42] = 1;
    data[43] = -1; data[44] = -1; data[45] = -1; data[46] = -1; data[47] = -1;
    data[48] = -1; data[51] = 1; data[53] = -1; data[54] = -1; data[55] = 1;
    data[56] = -1; data[57] = -1; data[64] = -1; data[65] = -1; data[66] = 1;
    data[74] = -1; }




      if (boardnum == 212){
    player = -1;
    isLastPass = false;
    data[11] = -1; data[12] = -1; data[13] = -1; data[14] = -1; data[15] = -1;
    data[16] = -1; data[17] = -1; data[18] = -1; data[21] = 1; data[22] = 1;
    data[23] = 1; data[24] = 1; data[25] = 1; data[26] = 1; data[27] = -1;
    data[28] = -1; data[31] = 1; data[32] = 1; data[33] = 1; data[34] = 1;
    data[35] = 1; data[36] = 1; data[37] = 1; data[38] = 1; data[41] = -1;
    data[42] = -1; data[43] = 1; data[44] = -1; data[45] = 1; data[46] = 1;
    data[47] = 1; data[52] = 1; data[53] = 1; data[54] = 1; data[55] = 1;
    data[56] = 1; data[57] = 1; data[61] = 1; data[62] = 1; data[63] = 1;
    data[64] = 1; data[65] = 1; data[73] = 1; }




      if (boardnum == 213){
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




      if (boardnum == 214){
    player = -1;
    isLastPass = false;
    data[24] = 1; data[26] = 1; data[31] = -1; data[33] = -1; data[34] = -1;
    data[35] = 1; data[36] = 1; data[41] = -1; data[42] = -1; data[43] = 1;
    data[44] = -1; data[45] = -1; data[46] = 1; data[51] = -1; data[52] = -1;
    data[53] = -1; data[54] = -1; data[55] = 1; data[56] = 1; data[62] = -1;
    data[63] = -1; data[64] = -1; data[65] = 1; data[73] = 1; data[74] = -1;
    data[83] = 1; data[85] = -1; }




      if (boardnum == 215){
    player = 1;
    isLastPass = false;
    data[13] = -1; data[23] = -1; data[24] = -1; data[25] = 1; data[26] = -1;
    data[33] = -1; data[34] = 1; data[35] = 1; data[36] = 1; data[37] = 1;
    data[42] = -1; data[43] = -1; data[44] = -1; data[45] = -1; data[46] = -1;
    data[47] = 1; data[53] = 1; data[54] = 1; data[55] = 1; data[56] = -1;
    data[57] = -1; data[63] = 1; data[64] = 1; data[65] = 1; data[66] = 1;
    data[73] = -1; data[74] = 1; data[76] = -1; }




      if (boardnum == 216){
    player = -1;
    isLastPass = false;
    data[13] = -1; data[16] = 1; data[23] = -1; data[24] = -1; data[25] = 1;
    data[26] = 1; data[31] = -1; data[32] = -1; data[33] = -1; data[34] = 1;
    data[35] = 1; data[36] = 1; data[37] = -1; data[38] = -1; data[41] = 1;
    data[42] = -1; data[43] = 1; data[44] = 1; data[45] = -1; data[46] = -1;
    data[47] = -1; data[48] = -1; data[52] = 1; data[53] = -1; data[54] = 1;
    data[55] = -1; data[56] = -1; data[57] = -1; data[58] = -1; data[61] = 1;
    data[63] = -1; data[64] = 1; data[65] = -1; data[66] = 1; data[67] = -1;
    data[68] = -1; data[73] = -1; data[74] = 1; data[75] = 1; data[83] = -1;
    data[84] = 1; data[85] = 1; data[86] = -1; }




      if (boardnum == 217){
    player = -1;
    isLastPass = false;
    data[11] = -1; data[12] = -1; data[13] = -1; data[14] = -1; data[15] = -1;
    data[16] = -1; data[17] = -1; data[21] = -1; data[22] = 1; data[23] = -1;
    data[24] = 1; data[25] = 1; data[26] = 1; data[31] = -1; data[32] = 1;
    data[33] = 1; data[34] = 1; data[35] = 1; data[36] = 1; data[37] = -1;
    data[41] = -1; data[42] = 1; data[43] = -1; data[44] = -1; data[45] = -1;
    data[46] = -1; data[52] = -1; data[53] = -1; data[54] = -1; data[55] = -1;
    data[56] = -1; data[57] = -1; data[61] = -1; data[62] = -1; data[63] = -1;
    data[64] = -1; data[65] = -1; data[73] = -1; data[74] = -1; data[75] = -1;
    data[76] = -1; data[84] = 1; data[87] = -1; }





      if (boardnum == 219){
    player = -1;
    isLastPass = false;
    data[24] = 1; data[31] = 1; data[33] = 1; data[35] = 1; data[42] = 1;
    data[44] = -1; data[45] = -1; data[46] = 1; data[53] = -1; data[54] = -1;
    data[55] = 1; data[62] = -1; data[63] = -1; data[64] = -1; data[65] = -1;
    data[66] = -1; data[73] = 1; }




      if (boardnum == 220){
    player = -1;
    isLastPass = false;
    data[21] = -1; data[32] = -1; data[33] = -1; data[34] = -1; data[35] = -1;
    data[36] = -1; data[37] = -1; data[43] = -1; data[44] = 1; data[45] = 1;
    data[46] = 1; data[47] = 1; data[51] = -1; data[52] = -1; data[53] = -1;
    data[54] = -1; data[55] = 1; data[56] = 1; data[57] = -1; data[62] = -1;
    data[63] = -1; data[64] = -1; data[65] = -1; data[66] = 1; data[67] = -1;
    data[75] = -1; data[78] = -1; }




      if (boardnum == 221){
    player = -1;
    isLastPass = false;
    data[15] = 1; data[24] = 1; data[25] = 1; data[26] = 1; data[32] = 1;
    data[33] = 1; data[34] = 1; data[35] = 1; data[43] = -1; data[44] = -1;
    data[45] = 1; data[46] = -1; data[53] = 1; data[54] = 1; data[55] = 1;
    data[56] = 1; data[62] = 1; data[64] = 1; data[74] = 1; }




      if (boardnum == 222){
    player = -1;
    isLastPass = false;
    data[13] = -1; data[14] = -1; data[15] = -1; data[16] = -1; data[24] = -1;
    data[25] = -1; data[26] = 1; data[32] = 1; data[33] = 1; data[34] = 1;
    data[35] = -1; data[36] = 1; data[37] = 1; data[43] = 1; data[44] = -1;
    data[45] = -1; data[46] = 1; data[47] = 1; data[53] = 1; data[54] = 1;
    data[55] = 1; data[56] = 1; data[57] = -1; data[64] = 1; data[65] = -1;
    }




      if (boardnum == 223){
    player = 1;
    isLastPass = false;
    data[12] = 1; data[13] = 1; data[14] = 1; data[15] = 1; data[23] = 1;
    data[24] = 1; data[25] = 1; data[26] = 1; data[28] = -1; data[32] = 1;
    data[33] = 1; data[34] = 1; data[35] = 1; data[36] = 1; data[37] = -1;
    data[43] = 1; data[44] = 1; data[45] = -1; data[46] = -1; data[47] = -1;
    data[52] = 1; data[53] = 1; data[54] = -1; data[55] = 1; data[56] = -1;
    data[57] = -1; data[58] = -1; data[62] = 1; data[63] = 1; data[64] = 1;
    data[65] = -1; data[66] = -1; data[67] = -1; data[73] = 1; data[74] = -1;
    data[75] = -1; data[76] = -1; data[85] = -1; }




      if (boardnum == 224){
    player = -1;
    isLastPass = false;
    data[13] = -1; data[16] = 1; data[17] = -1; data[18] = -1; data[23] = -1;
    data[24] = -1; data[25] = 1; data[26] = 1; data[27] = 1; data[31] = 1;
    data[33] = -1; data[34] = 1; data[35] = 1; data[36] = 1; data[37] = 1;
    data[38] = 1; data[42] = 1; data[43] = -1; data[44] = -1; data[45] = 1;
    data[46] = 1; data[47] = 1; data[52] = -1; data[53] = 1; data[54] = 1;
    data[55] = 1; data[56] = 1; data[57] = 1; data[62] = 1; data[63] = 1;
    data[64] = 1; data[65] = 1; data[73] = 1; }




      if (boardnum == 225){
    player = 1;
    isLastPass = false;
    data[24] = -1; data[33] = -1; data[34] = -1; data[35] = 1; data[42] = -1;
    data[43] = -1; data[44] = -1; data[45] = 1; data[52] = -1; data[53] = -1;
    data[54] = -1; data[55] = 1; data[56] = 1; data[61] = -1; data[62] = 1;
    data[63] = -1; data[64] = 1; data[65] = 1; data[66] = -1; data[73] = -1;
    data[74] = -1; data[75] = 1; }




      if (boardnum == 226){
    player = 1;
    isLastPass = false;
    data[11] = -1; data[16] = -1; data[21] = 1; data[22] = 1; data[23] = 1;
    data[26] = -1; data[32] = 1; data[33] = -1; data[34] = -1; data[35] = 1;
    data[36] = -1; data[41] = 1; data[44] = 1; data[45] = -1; data[52] = 1;
    data[54] = -1; data[55] = -1; data[56] = 1; data[63] = 1; data[64] = -1;
    data[65] = -1; data[73] = 1; data[74] = 1; data[75] = 1; }




      if (boardnum == 227){
    player = 1;
    isLastPass = false;
    data[13] = -1; data[14] = 1; data[15] = 1; data[24] = 1; data[25] = 1;
    data[26] = 1; data[32] = 1; data[33] = 1; data[34] = 1; data[35] = 1;
    data[36] = 1; data[37] = -1; data[43] = 1; data[44] = -1; data[45] = 1;
    data[46] = -1; data[53] = 1; data[54] = 1; data[55] = -1; data[56] = 1;
    data[62] = 1; data[63] = 1; data[64] = 1; data[66] = -1; data[73] = 1;
    data[74] = 1; }




      if (boardnum == 228){
    player = 1;
    isLastPass = false;
    data[11] = 1; data[12] = 1; data[13] = 1; data[14] = 1; data[15] = 1;
    data[16] = 1; data[17] = 1; data[21] = 1; data[22] = 1; data[23] = 1;
    data[24] = 1; data[25] = 1; data[26] = 1; data[31] = 1; data[32] = 1;
    data[33] = -1; data[34] = 1; data[35] = 1; data[36] = -1; data[37] = -1;
    data[41] = 1; data[42] = 1; data[43] = -1; data[44] = 1; data[45] = 1;
    data[46] = -1; data[51] = -1; data[52] = -1; data[53] = -1; data[54] = -1;
    data[55] = -1; data[56] = -1; data[63] = -1; data[65] = -1; }




      if (boardnum == 229){
    player = 1;
    isLastPass = false;
    data[12] = 1; data[23] = 1; data[24] = 1; data[27] = -1; data[31] = -1;
    data[32] = -1; data[33] = -1; data[34] = -1; data[35] = -1; data[36] = -1;
    data[37] = -1; data[38] = -1; data[42] = 1; data[43] = 1; data[44] = -1;
    data[45] = -1; data[46] = 1; data[47] = -1; data[52] = 1; data[53] = 1;
    data[54] = 1; data[55] = -1; data[56] = -1; data[58] = -1; data[61] = 1;
    data[62] = 1; data[63] = 1; data[64] = 1; data[65] = 1; data[66] = 1;
    data[67] = -1; data[73] = 1; data[74] = 1; data[75] = 1; data[76] = 1;
    data[77] = -1; data[78] = -1; data[82] = 1; data[86] = 1; data[87] = -1;
    }




      if (boardnum == 230){
    player = -1;
    isLastPass = false;
    data[32] = -1; data[33] = 1; data[34] = 1; data[35] = 1; data[36] = 1;
    data[42] = -1; data[43] = -1; data[44] = 1; data[45] = 1; data[46] = 1;
    data[52] = -1; data[53] = 1; data[54] = -1; data[55] = 1; data[56] = 1;
    data[64] = -1; data[65] = -1; data[66] = -1; data[67] = 1; }




      if (boardnum == 231){
    player = 1;
    isLastPass = false;
    data[11] = -1; data[12] = -1; data[13] = -1; data[22] = -1; data[23] = 1;
    data[24] = -1; data[25] = 1; data[28] = 1; data[32] = -1; data[33] = 1;
    data[34] = 1; data[35] = -1; data[36] = -1; data[37] = 1; data[43] = 1;
    data[44] = 1; data[45] = 1; data[46] = 1; data[47] = 1; data[54] = 1;
    data[55] = 1; data[56] = -1; data[63] = -1; data[65] = 1; data[66] = 1;
    data[67] = -1; }




      if (boardnum == 232){
    player = 1;
    isLastPass = false;
    data[21] = 1; data[22] = 1; data[23] = 1; data[26] = -1; data[31] = -1;
    data[32] = -1; data[33] = -1; data[34] = 1; data[35] = -1; data[42] = -1;
    data[43] = -1; data[44] = -1; data[45] = 1; data[46] = 1; data[53] = -1;
    data[54] = -1; data[55] = -1; data[56] = 1; data[57] = 1; data[62] = -1;
    data[63] = -1; data[64] = -1; data[65] = -1; data[66] = 1; data[73] = 1;
    data[75] = 1; data[76] = 1; data[77] = -1; data[78] = -1; data[86] = 1;
    }





      if (boardnum == 234){
    player = -1;
    isLastPass = false;
    data[12] = 1; data[13] = 1; data[14] = 1; data[22] = 1; data[23] = 1;
    data[24] = 1; data[25] = 1; data[26] = 1; data[27] = 1; data[28] = 1;
    data[31] = -1; data[32] = 1; data[33] = 1; data[34] = -1; data[35] = -1;
    data[36] = 1; data[37] = 1; data[38] = 1; data[41] = 1; data[42] = 1;
    data[43] = 1; data[44] = -1; data[45] = -1; data[46] = 1; data[47] = 1;
    data[48] = 1; data[51] = 1; data[52] = 1; data[53] = -1; data[54] = 1;
    data[55] = -1; data[56] = 1; data[57] = -1; data[58] = 1; data[61] = -1;
    data[62] = 1; data[63] = 1; data[64] = -1; data[65] = 1; data[66] = 1;
    data[72] = 1; data[73] = 1; data[76] = 1; }




      if (boardnum == 235){
    player = 1;
    isLastPass = false;
    data[13] = -1; data[21] = -1; data[23] = -1; data[24] = -1; data[31] = -1;
    data[32] = -1; data[33] = 1; data[34] = -1; data[35] = -1; data[36] = -1;
    data[37] = -1; data[41] = -1; data[42] = -1; data[43] = -1; data[44] = -1;
    data[45] = -1; data[46] = -1; data[47] = -1; data[48] = -1; data[51] = -1;
    data[52] = -1; data[53] = 1; data[54] = 1; data[55] = 1; data[56] = -1;
    data[57] = -1; data[62] = -1; data[63] = -1; data[64] = 1; data[65] = 1;
    data[66] = -1; data[67] = -1; data[73] = -1; data[74] = 1; data[75] = -1;
    data[76] = -1; data[78] = -1; data[82] = -1; data[83] = -1; data[84] = -1;
    data[85] = -1; data[86] = -1; }




      if (boardnum == 236){
    player = 1;
    isLastPass = false;
    data[13] = 1; data[14] = -1; data[15] = -1; data[16] = -1; data[17] = -1;
    data[18] = -1; data[24] = 1; data[25] = -1; data[26] = 1; data[33] = -1;
    data[34] = 1; data[35] = 1; data[36] = -1; data[42] = -1; data[43] = -1;
    data[44] = -1; data[45] = -1; data[54] = -1; data[55] = 1; data[56] = 1;
    data[63] = -1; data[65] = 1; data[66] = 1; data[67] = 1; }




      if (boardnum == 237){
    player = -1;
    isLastPass = false;
    data[24] = -1; data[34] = -1; data[35] = -1; data[36] = 1; data[43] = -1;
    data[44] = -1; data[45] = 1; data[46] = 1; data[52] = 1; data[53] = 1;
    data[54] = -1; data[55] = 1; data[56] = 1; data[62] = 1; data[63] = 1;
    data[64] = 1; data[65] = -1; data[66] = 1; data[73] = 1; data[74] = -1;
    data[75] = -1; }




      if (boardnum == 238){
    player = 1;
    isLastPass = false;
    data[16] = 1; data[23] = -1; data[24] = 1; data[25] = 1; data[33] = -1;
    data[34] = -1; data[37] = 1; data[41] = 1; data[42] = 1; data[43] = -1;
    data[44] = -1; data[45] = -1; data[46] = -1; data[47] = -1; data[51] = 1;
    data[52] = 1; data[53] = -1; data[54] = -1; data[55] = -1; data[56] = -1;
    data[61] = 1; data[63] = -1; data[64] = -1; data[65] = -1; data[66] = -1;
    data[73] = -1; }




      if (boardnum == 239){
    player = -1;
    isLastPass = false;
    data[34] = 1; data[42] = -1; data[43] = -1; data[44] = 1; data[45] = 1;
    data[52] = -1; data[53] = 1; data[54] = 1; data[55] = 1; data[56] = 1;
    data[61] = -1; data[63] = 1; data[64] = -1; data[65] = -1; data[66] = -1;
    }




      if (boardnum == 240){
    player = 1;
    isLastPass = false;
    data[22] = 1; data[23] = 1; data[24] = 1; data[33] = 1; data[34] = 1;
    data[35] = -1; data[43] = 1; data[44] = -1; data[45] = -1; data[46] = 1;
    data[47] = 1; data[53] = -1; data[54] = -1; data[55] = -1; data[56] = 1;
    data[65] = -1; data[66] = 1; data[75] = -1; }




      if (boardnum == 241){
    player = 1;
    isLastPass = false;
    data[24] = -1; data[26] = 1; data[33] = -1; data[34] = -1; data[35] = -1;
    data[36] = 1; data[38] = -1; data[43] = 1; data[44] = 1; data[45] = 1;
    data[46] = -1; data[47] = -1; data[54] = 1; data[55] = -1; data[56] = -1;
    data[57] = -1; }




      if (boardnum == 242){
    player = 1;
    isLastPass = false;
    data[13] = 1; data[14] = 1; data[17] = -1; data[18] = -1; data[24] = 1;
    data[25] = 1; data[26] = -1; data[27] = -1; data[31] = 1; data[33] = 1;
    data[34] = 1; data[35] = -1; data[36] = 1; data[37] = 1; data[38] = 1;
    data[42] = 1; data[43] = -1; data[44] = -1; data[45] = 1; data[46] = 1;
    data[53] = 1; data[54] = 1; data[55] = 1; data[56] = 1; data[62] = 1;
    data[64] = 1; }




      if (boardnum == 243){
    player = 1;
    isLastPass = false;
    data[16] = 1; data[25] = 1; data[26] = 1; data[33] = -1; data[34] = -1;
    data[35] = -1; data[36] = 1; data[37] = -1; data[43] = -1; data[44] = -1;
    data[45] = -1; data[46] = -1; data[47] = -1; data[48] = -1; data[54] = -1;
    data[55] = -1; data[56] = 1; data[65] = -1; }




      if (boardnum == 244){
    player = 1;
    isLastPass = false;
    data[13] = 1; data[14] = 1; data[15] = 1; data[16] = 1; data[17] = 1;
    data[18] = 1; data[24] = 1; data[25] = 1; data[26] = 1; data[27] = 1;
    data[28] = 1; data[33] = -1; data[34] = -1; data[35] = 1; data[36] = 1;
    data[37] = 1; data[38] = 1; data[43] = -1; data[44] = 1; data[45] = -1;
    data[46] = 1; data[47] = 1; data[48] = 1; data[52] = -1; data[54] = -1;
    data[55] = -1; data[56] = -1; data[57] = 1; data[58] = 1; data[65] = -1;
    data[66] = -1; data[67] = -1; data[68] = 1; data[76] = 1; data[77] = -1;
    data[78] = -1; }




      if (boardnum == 245){
    player = 1;
    isLastPass = false;
    data[14] = 1; data[23] = -1; data[24] = 1; data[25] = 1; data[31] = 1;
    data[32] = 1; data[33] = -1; data[34] = 1; data[35] = 1; data[36] = 1;
    data[37] = 1; data[38] = 1; data[41] = 1; data[42] = 1; data[43] = -1;
    data[44] = -1; data[45] = 1; data[46] = 1; data[47] = 1; data[48] = -1;
    data[51] = -1; data[52] = -1; data[53] = -1; data[54] = -1; data[55] = 1;
    data[56] = 1; data[57] = 1; data[58] = 1; data[61] = -1; data[62] = -1;
    data[63] = 1; data[64] = 1; data[65] = 1; data[66] = -1; data[67] = 1;
    data[73] = 1; data[74] = 1; data[75] = 1; data[76] = 1; data[77] = -1;
    data[83] = 1; data[86] = 1; }




      if (boardnum == 246){
    player = -1;
    isLastPass = false;
    data[24] = -1; data[31] = 1; data[33] = -1; data[34] = -1; data[35] = 1;
    data[41] = 1; data[42] = -1; data[43] = -1; data[44] = -1; data[45] = 1;
    data[51] = 1; data[52] = -1; data[53] = -1; data[54] = -1; data[55] = 1;
    data[56] = 1; data[57] = 1; data[61] = 1; data[62] = 1; data[63] = -1;
    data[64] = -1; data[65] = 1; data[66] = 1; data[71] = 1; data[73] = -1;
    data[74] = 1; data[75] = -1; data[83] = 1; data[86] = -1; }




      if (boardnum == 247){
    player = 1;
    isLastPass = false;
    data[15] = 1; data[24] = 1; data[25] = 1; data[26] = 1; data[31] = -1;
    data[33] = 1; data[34] = 1; data[35] = 1; data[36] = 1; data[37] = 1;
    data[42] = 1; data[43] = -1; data[44] = -1; data[45] = -1; data[46] = 1;
    data[47] = 1; data[51] = 1; data[53] = -1; data[54] = -1; data[55] = -1;
    data[56] = 1; data[63] = -1; data[66] = -1; data[73] = -1; }




      if (boardnum == 248){
    player = 1;
    isLastPass = false;
    data[23] = -1; data[25] = 1; data[26] = 1; data[32] = 1; data[33] = -1;
    data[34] = -1; data[35] = -1; data[36] = -1; data[37] = -1; data[42] = 1;
    data[43] = 1; data[44] = 1; data[45] = 1; data[46] = 1; data[47] = 1;
    data[53] = -1; data[54] = 1; data[55] = 1; data[56] = 1; data[65] = 1;
    data[66] = 1; data[76] = 1; }




      if (boardnum == 249){
    player = 1;
    isLastPass = false;
    data[11] = -1; data[12] = -1; data[13] = -1; data[14] = -1; data[15] = -1;
    data[16] = -1; data[21] = -1; data[22] = -1; data[23] = -1; data[24] = -1;
    data[25] = -1; data[26] = 1; data[31] = -1; data[32] = -1; data[33] = -1;
    data[34] = -1; data[35] = 1; data[36] = 1; data[41] = -1; data[42] = -1;
    data[43] = -1; data[44] = 1; data[45] = 1; data[46] = 1; data[51] = -1;
    data[52] = -1; data[53] = -1; data[54] = 1; data[55] = 1; data[56] = 1;
    data[62] = -1; data[63] = -1; data[64] = 1; data[65] = 1; data[73] = -1;
    data[74] = 1; data[82] = -1; data[83] = -1; data[84] = -1; data[85] = -1;
    }




      if (boardnum == 250){
    player = 1;
    isLastPass = false;
    data[25] = 1; data[26] = -1; data[32] = -1; data[34] = -1; data[35] = 1;
    data[42] = -1; data[43] = -1; data[44] = -1; data[45] = -1; data[46] = -1;
    data[52] = -1; data[54] = -1; data[55] = -1; data[56] = -1; data[57] = -1;
    data[64] = -1; data[65] = 1; data[66] = -1; data[67] = 1; data[68] = 1;
    data[74] = 1; data[75] = -1; data[76] = -1; data[77] = -1; data[84] = 1;
    data[86] = -1; }




      if (boardnum == 251){
    player = -1;
    isLastPass = false;
    data[23] = -1; data[24] = 1; data[25] = 1; data[34] = 1; data[35] = 1;
    data[43] = -1; data[44] = -1; data[45] = -1; data[46] = 1; data[52] = 1;
    data[53] = 1; data[54] = 1; data[55] = 1; data[56] = 1; data[57] = 1;
    data[64] = 1; data[65] = 1; data[73] = 1; data[75] = 1; data[76] = 1;
    data[82] = 1; }




      if (boardnum == 252){
    player = -1;
    isLastPass = false;
    data[14] = -1; data[15] = -1; data[16] = -1; data[23] = -1; data[24] = -1;
    data[25] = -1; data[32] = -1; data[33] = 1; data[34] = 1; data[35] = 1;
    data[36] = 1; data[42] = 1; data[43] = -1; data[44] = -1; data[45] = 1;
    data[46] = 1; data[51] = 1; data[52] = 1; data[53] = 1; data[54] = 1;
    data[55] = 1; data[56] = 1; data[61] = -1; data[62] = -1; data[63] = -1;
    data[64] = 1; data[65] = 1; }




      if (boardnum == 253){
    player = -1;
    isLastPass = false;
    data[22] = -1; data[23] = 1; data[31] = -1; data[33] = -1; data[34] = 1;
    data[35] = 1; data[42] = -1; data[43] = 1; data[44] = 1; data[45] = 1;
    data[46] = 1; data[53] = -1; data[54] = -1; data[55] = -1; data[56] = 1;
    data[57] = 1; data[62] = -1; data[63] = -1; data[64] = -1; data[65] = -1;
    data[66] = 1; data[73] = 1; data[75] = 1; data[76] = 1; data[77] = -1;
    data[78] = -1; data[86] = 1; }




      if (boardnum == 254){
    player = -1;
    isLastPass = false;
    data[11] = -1; data[12] = 1; data[13] = 1; data[14] = 1; data[15] = 1;
    data[16] = 1; data[17] = 1; data[18] = 1; data[21] = 1; data[22] = 1;
    data[23] = 1; data[24] = -1; data[25] = -1; data[26] = 1; data[27] = 1;
    data[31] = -1; data[32] = 1; data[33] = -1; data[34] = 1; data[35] = 1;
    data[36] = -1; data[37] = 1; data[43] = 1; data[44] = 1; data[45] = 1;
    data[46] = -1; data[47] = -1; data[53] = 1; data[54] = -1; data[55] = 1;
    data[56] = -1; data[62] = 1; data[64] = 1; data[65] = 1; data[66] = -1;
    data[67] = -1; data[74] = 1; data[75] = 1; data[76] = -1; }




      if (boardnum == 255){
    player = -1;
    isLastPass = false;
    data[14] = 1; data[15] = 1; data[17] = -1; data[23] = 1; data[24] = 1;
    data[26] = -1; data[28] = -1; data[32] = -1; data[33] = -1; data[34] = 1;
    data[35] = -1; data[36] = -1; data[37] = -1; data[42] = -1; data[43] = -1;
    data[44] = -1; data[45] = 1; data[46] = -1; data[47] = 1; data[48] = 1;
    data[52] = -1; data[53] = -1; data[54] = -1; data[55] = 1; data[56] = -1;
    data[62] = -1; data[63] = -1; data[64] = -1; data[65] = 1; data[67] = -1;
    data[72] = -1; data[73] = -1; data[74] = -1; }




      if (boardnum == 256){
    player = 1;
    isLastPass = false;
    data[13] = -1; data[17] = -1; data[23] = -1; data[24] = 1; data[26] = -1;
    data[31] = -1; data[32] = -1; data[33] = -1; data[34] = 1; data[35] = -1;
    data[36] = -1; data[43] = -1; data[44] = 1; data[45] = -1; data[53] = -1;
    data[54] = -1; data[55] = 1; data[56] = 1; data[65] = 1; data[66] = -1;
    data[74] = 1; data[76] = -1; }




      if (boardnum == 257){
    player = 1;
    isLastPass = false;
    data[13] = 1; data[15] = -1; data[18] = -1; data[21] = -1; data[23] = 1;
    data[24] = -1; data[25] = -1; data[27] = -1; data[31] = 1; data[32] = 1;
    data[33] = 1; data[34] = 1; data[35] = 1; data[36] = -1; data[37] = -1;
    data[38] = -1; data[42] = 1; data[43] = -1; data[44] = -1; data[45] = 1;
    data[46] = -1; data[47] = -1; data[52] = 1; data[53] = -1; data[54] = -1;
    data[55] = -1; data[56] = -1; data[57] = 1; data[61] = 1; data[63] = -1;
    data[64] = 1; data[65] = -1; data[66] = -1; data[67] = 1; data[68] = 1;
    data[73] = -1; data[74] = -1; data[75] = -1; data[76] = -1; data[77] = -1;
    data[83] = -1; data[88] = -1; }




      if (boardnum == 258){
    player = 1;
    isLastPass = false;
    data[16] = 1; data[18] = -1; data[24] = -1; data[25] = 1; data[26] = 1;
    data[27] = -1; data[33] = 1; data[34] = -1; data[35] = -1; data[36] = -1;
    data[37] = 1; data[43] = 1; data[44] = -1; data[45] = -1; data[46] = 1;
    data[47] = 1; data[53] = 1; data[54] = -1; data[55] = 1; data[56] = 1;
    data[57] = 1; data[63] = 1; data[64] = 1; data[65] = 1; data[66] = 1;
    data[67] = 1; data[73] = 1; data[74] = 1; data[75] = 1; data[76] = 1;
    data[82] = 1; data[83] = 1; }




      if (boardnum == 259){
    player = -1;
    isLastPass = false;
    data[14] = 1; data[23] = -1; data[24] = 1; data[25] = -1; data[26] = -1;
    data[33] = -1; data[34] = -1; data[35] = -1; data[36] = -1; data[37] = 1;
    data[44] = 1; data[45] = 1; data[46] = 1; data[47] = -1; data[54] = 1;
    data[55] = 1; data[56] = 1; data[57] = -1; data[58] = -1; data[63] = -1;
    data[64] = 1; data[65] = 1; data[66] = 1; }




      if (boardnum == 260){
    player = 1;
    isLastPass = false;
    data[16] = 1; data[24] = 1; data[25] = 1; data[33] = 1; data[34] = 1;
    data[37] = 1; data[42] = -1; data[43] = 1; data[44] = -1; data[45] = -1;
    data[46] = -1; data[47] = -1; data[51] = -1; data[52] = -1; data[53] = -1;
    data[54] = -1; data[55] = -1; data[56] = -1; data[63] = 1; data[64] = -1;
    data[65] = -1; data[66] = -1; }




      if (boardnum == 261){
    player = -1;
    isLastPass = false;
    data[23] = 1; data[24] = -1; data[32] = -1; data[33] = -1; data[34] = -1;
    data[44] = -1; data[45] = 1; data[46] = 1; data[47] = 1; data[54] = -1;
    data[55] = 1; data[56] = 1; data[63] = 1; data[64] = -1; data[66] = 1;
    }




      if (boardnum == 262){
    player = 1;
    isLastPass = false;
    data[12] = -1; data[15] = 1; data[16] = 1; data[17] = 1; data[18] = 1;
    data[23] = -1; data[25] = 1; data[26] = -1; data[27] = 1; data[28] = 1;
    data[32] = -1; data[34] = -1; data[35] = -1; data[36] = -1; data[37] = 1;
    data[43] = -1; data[44] = -1; data[45] = -1; data[46] = -1; data[47] = -1;
    data[54] = -1; data[55] = 1; data[56] = -1; data[57] = -1; data[64] = -1;
    data[65] = -1; data[66] = 1; data[74] = -1; }




      if (boardnum == 263){
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




      if (boardnum == 264){
    player = 1;
    isLastPass = false;
    data[33] = -1; data[34] = -1; data[35] = -1; data[44] = -1; data[45] = -1;
    data[52] = 1; data[53] = 1; data[54] = -1; data[55] = -1; data[56] = -1;
    data[57] = -1; data[62] = 1; data[63] = 1; data[64] = 1; data[66] = 1;
    data[76] = 1; }




      if (boardnum == 265){
    player = 1;
    isLastPass = false;
    data[13] = -1; data[16] = -1; data[21] = -1; data[22] = -1; data[23] = 1;
    data[24] = 1; data[25] = 1; data[26] = -1; data[32] = -1; data[33] = -1;
    data[34] = 1; data[35] = -1; data[36] = -1; data[42] = 1; data[43] = 1;
    data[44] = -1; data[45] = -1; data[46] = -1; data[51] = 1; data[52] = 1;
    data[53] = 1; data[54] = -1; data[55] = -1; data[56] = -1; data[62] = -1;
    data[63] = -1; data[64] = 1; data[65] = -1; data[73] = -1; data[74] = -1;
    data[76] = -1; data[83] = -1; }




      if (boardnum == 266){
    player = 1;
    isLastPass = false;
    data[13] = 1; data[14] = 1; data[15] = 1; data[16] = 1; data[17] = 1;
    data[18] = 1; data[23] = 1; data[24] = 1; data[25] = 1; data[26] = 1;
    data[27] = 1; data[32] = -1; data[33] = 1; data[34] = -1; data[35] = -1;
    data[36] = -1; data[37] = -1; data[38] = -1; data[42] = 1; data[43] = 1;
    data[44] = 1; data[45] = 1; data[46] = -1; data[47] = -1; data[54] = 1;
    data[55] = -1; data[56] = -1; data[57] = -1; }




      if (boardnum == 267){
    player = 1;
    isLastPass = false;
    data[14] = 1; data[24] = 1; data[25] = 1; data[33] = 1; data[34] = 1;
    data[35] = 1; data[36] = 1; data[37] = 1; data[43] = 1; data[44] = -1;
    data[45] = 1; data[46] = 1; data[53] = -1; data[54] = -1; data[55] = -1;
    data[56] = 1; data[57] = 1; data[63] = 1; data[64] = -1; data[65] = -1;
    data[66] = -1; data[67] = 1; data[72] = 1; data[73] = 1; data[74] = -1;
    data[75] = -1; data[76] = 1; data[77] = 1; data[78] = 1; data[84] = -1;
    data[85] = -1; data[86] = -1; data[87] = -1; data[88] = -1; }




      if (boardnum == 268){
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




      if (boardnum == 269){
    player = 1;
    isLastPass = false;
    data[12] = 1; data[13] = 1; data[14] = 1; data[22] = 1; data[23] = 1;
    data[24] = 1; data[25] = 1; data[26] = 1; data[27] = 1; data[28] = 1;
    data[31] = -1; data[32] = 1; data[33] = 1; data[34] = -1; data[35] = -1;
    data[36] = 1; data[37] = 1; data[38] = 1; data[41] = 1; data[42] = 1;
    data[43] = -1; data[44] = -1; data[45] = -1; data[46] = 1; data[47] = 1;
    data[48] = 1; data[51] = 1; data[52] = 1; data[53] = -1; data[54] = -1;
    data[55] = -1; data[56] = -1; data[57] = -1; data[58] = 1; data[61] = -1;
    data[62] = 1; data[63] = 1; data[64] = -1; data[65] = -1; data[66] = -1;
    data[72] = 1; data[73] = 1; }




      if (boardnum == 270){
    player = -1;
    isLastPass = false;
    data[15] = -1; data[16] = 1; data[17] = 1; data[18] = 1; data[23] = -1;
    data[24] = -1; data[25] = 1; data[26] = 1; data[27] = 1; data[28] = 1;
    data[33] = -1; data[34] = 1; data[35] = -1; data[36] = 1; data[37] = -1;
    data[38] = 1; data[43] = -1; data[44] = 1; data[45] = -1; data[46] = -1;
    data[47] = -1; data[48] = 1; data[52] = -1; data[53] = -1; data[54] = -1;
    data[55] = -1; data[56] = -1; data[57] = -1; data[65] = -1; }




      if (boardnum == 271){
    player = -1;
    isLastPass = false;
    data[15] = 1; data[16] = -1; data[21] = 1; data[23] = 1; data[25] = -1;
    data[26] = 1; data[32] = 1; data[34] = 1; data[36] = -1; data[37] = 1;
    data[41] = 1; data[42] = -1; data[43] = -1; data[44] = -1; data[45] = 1;
    data[46] = -1; data[47] = -1; data[52] = -1; data[54] = 1; data[55] = -1;
    data[56] = 1; data[57] = -1; data[63] = -1; data[64] = -1; data[65] = -1;
    data[66] = -1; data[67] = -1; data[68] = -1; data[73] = 1; data[74] = 1;
    data[75] = 1; data[76] = 1; data[85] = -1; }




      if (boardnum == 272){
    player = -1;
    isLastPass = false;
    data[14] = 1; data[15] = 1; data[16] = 1; data[17] = 1; data[18] = 1;
    data[22] = 1; data[24] = -1; data[25] = 1; data[26] = 1; data[27] = 1;
    data[33] = 1; data[34] = 1; data[35] = -1; data[36] = -1; data[37] = -1;
    data[43] = -1; data[44] = 1; data[45] = -1; data[46] = -1; data[52] = -1;
    data[53] = -1; data[54] = -1; data[55] = -1; data[56] = -1; data[57] = -1;
    data[64] = 1; data[65] = -1; data[66] = -1; data[67] = -1; data[68] = -1;
    data[74] = -1; data[75] = -1; data[76] = -1; data[83] = -1; data[86] = -1;
    }




      if (boardnum == 273){
    player = 1;
    isLastPass = false;
    data[24] = 1; data[33] = 1; data[34] = 1; data[35] = 1; data[36] = -1;
    data[42] = -1; data[43] = -1; data[44] = -1; data[45] = -1; data[46] = -1;
    data[52] = -1; data[53] = 1; data[54] = -1; data[55] = 1; data[56] = 1;
    data[62] = 1; data[63] = 1; data[64] = 1; data[65] = 1; data[73] = 1;
    }




      if (boardnum == 274){
    player = 1;
    isLastPass = false;
    data[33] = 1; data[34] = -1; data[35] = -1; data[37] = 1; data[42] = 1;
    data[43] = 1; data[44] = -1; data[45] = -1; data[46] = 1; data[54] = -1;
    data[55] = -1; data[56] = 1; data[64] = 1; data[65] = -1; data[66] = 1;
    data[74] = 1; data[75] = -1; data[76] = 1; }




      if (boardnum == 275){
    player = -1;
    isLastPass = false;
    data[13] = -1; data[14] = -1; data[15] = -1; data[16] = -1; data[24] = 1;
    data[25] = 1; data[26] = 1; data[32] = 1; data[33] = 1; data[34] = 1;
    data[35] = 1; data[36] = 1; data[37] = 1; data[38] = 1; data[42] = 1;
    data[43] = 1; data[44] = -1; data[45] = -1; data[46] = 1; data[47] = 1;
    data[48] = -1; data[52] = 1; data[53] = 1; data[54] = 1; data[55] = -1;
    data[56] = 1; data[57] = 1; data[62] = 1; data[63] = 1; data[64] = 1;
    data[66] = 1; data[67] = 1; data[73] = 1; data[74] = 1; data[76] = 1;
    }




      if (boardnum == 276){
    player = 1;
    isLastPass = false;
    data[15] = -1; data[23] = -1; data[25] = 1; data[26] = -1; data[27] = -1;
    data[33] = -1; data[34] = -1; data[35] = 1; data[36] = 1; data[37] = -1;
    data[43] = 1; data[44] = 1; data[45] = -1; data[46] = 1; data[47] = 1;
    data[53] = -1; data[54] = -1; data[55] = -1; data[56] = 1; data[65] = -1;
    }




      if (boardnum == 277){
    player = 1;
    isLastPass = false;
    data[24] = -1; data[33] = -1; data[34] = -1; data[35] = 1; data[42] = -1;
    data[43] = -1; data[44] = -1; data[45] = 1; data[52] = -1; data[53] = 1;
    data[54] = -1; data[55] = 1; data[56] = 1; data[61] = -1; data[63] = -1;
    data[64] = -1; data[65] = 1; data[66] = -1; data[74] = -1; data[75] = 1;
    }




      if (boardnum == 278){
    player = 1;
    isLastPass = false;
    data[15] = 1; data[24] = 1; data[25] = 1; data[26] = 1; data[31] = -1;
    data[32] = -1; data[33] = 1; data[34] = 1; data[35] = 1; data[36] = 1;
    data[37] = 1; data[41] = -1; data[42] = -1; data[43] = -1; data[44] = 1;
    data[45] = -1; data[46] = 1; data[47] = 1; data[51] = 1; data[53] = 1;
    data[54] = -1; data[55] = -1; data[56] = 1; data[63] = 1; data[64] = 1;
    data[65] = 1; data[66] = -1; data[73] = 1; data[74] = 1; data[83] = 1;
    }




      if (boardnum == 279){
    player = 1;
    isLastPass = false;
    data[11] = -1; data[14] = -1; data[15] = -1; data[16] = -1; data[17] = -1;
    data[21] = -1; data[22] = -1; data[23] = -1; data[25] = 1; data[26] = -1;
    data[31] = -1; data[32] = -1; data[33] = -1; data[34] = 1; data[35] = -1;
    data[36] = 1; data[37] = 1; data[38] = -1; data[41] = -1; data[42] = -1;
    data[43] = -1; data[44] = -1; data[45] = -1; data[46] = -1; data[47] = 1;
    data[48] = 1; data[51] = 1; data[53] = 1; data[54] = 1; data[55] = 1;
    data[56] = 1; data[57] = 1; data[62] = 1; data[63] = 1; data[64] = 1;
    data[65] = 1; data[66] = 1; data[73] = 1; data[74] = 1; data[75] = 1;
    data[77] = 1; data[85] = 1; }




      if (boardnum == 280){
    player = -1;
    isLastPass = false;
    data[16] = 1; data[23] = -1; data[25] = 1; data[26] = 1; data[32] = 1;
    data[33] = 1; data[34] = 1; data[35] = 1; data[36] = 1; data[37] = -1;
    data[42] = -1; data[43] = 1; data[44] = 1; data[45] = -1; data[46] = -1;
    data[53] = -1; data[54] = 1; data[55] = -1; data[63] = -1; data[64] = -1;
    data[73] = -1; data[74] = -1; data[75] = -1; }




      if (boardnum == 281){
    player = 1;
    isLastPass = false;
    data[16] = 1; data[24] = 1; data[25] = 1; data[33] = 1; data[34] = 1;
    data[37] = 1; data[42] = -1; data[43] = 1; data[44] = -1; data[45] = -1;
    data[46] = -1; data[47] = -1; data[51] = -1; data[52] = -1; data[53] = -1;
    data[54] = -1; data[55] = -1; data[56] = -1; data[63] = 1; data[64] = -1;
    data[65] = -1; data[66] = -1; }




      if (boardnum == 282){
    player = -1;
    isLastPass = false;
    data[11] = 1; data[12] = 1; data[13] = 1; data[14] = 1; data[15] = 1;
    data[16] = 1; data[17] = 1; data[18] = 1; data[21] = 1; data[22] = 1;
    data[23] = -1; data[24] = 1; data[25] = 1; data[26] = 1; data[27] = 1;
    data[28] = 1; data[31] = 1; data[32] = 1; data[33] = 1; data[34] = 1;
    data[35] = -1; data[36] = 1; data[37] = 1; data[38] = 1; data[41] = -1;
    data[42] = 1; data[43] = 1; data[44] = 1; data[45] = 1; data[46] = 1;
    data[47] = 1; data[48] = 1; data[53] = -1; data[54] = -1; data[55] = 1;
    data[56] = -1; data[57] = -1; data[64] = -1; data[65] = -1; data[66] = -1;
    data[76] = -1; }




      if (boardnum == 283){
    player = -1;
    isLastPass = false;
    data[12] = -1; data[23] = -1; data[24] = -1; data[33] = -1; data[34] = -1;
    data[35] = -1; data[36] = -1; data[37] = -1; data[43] = -1; data[44] = -1;
    data[45] = -1; data[46] = -1; data[52] = 1; data[53] = 1; data[54] = -1;
    data[55] = -1; data[63] = 1; data[64] = -1; data[65] = 1; data[72] = -1;
    data[73] = 1; }




      if (boardnum == 284){
    player = 1;
    isLastPass = false;
    data[25] = 1; data[34] = 1; data[35] = 1; data[36] = 1; data[44] = 1;
    data[45] = 1; data[46] = 1; data[47] = -1; data[48] = -1; data[53] = -1;
    data[54] = -1; data[55] = -1; data[57] = 1; data[64] = -1; data[65] = -1;
    data[66] = -1; data[67] = -1; data[68] = 1; data[75] = -1; data[76] = 1;
    }




      if (boardnum == 285){
    player = 1;
    isLastPass = false;
    data[26] = 1; data[31] = -1; data[33] = -1; data[34] = -1; data[35] = -1;
    data[36] = 1; data[42] = -1; data[43] = 1; data[44] = -1; data[45] = -1;
    data[46] = 1; data[52] = -1; data[53] = -1; data[54] = -1; data[55] = 1;
    data[56] = 1; data[62] = -1; data[63] = -1; data[64] = -1; data[65] = 1;
    data[73] = 1; data[74] = -1; data[83] = 1; data[85] = -1; }




      if (boardnum == 286){
    player = 1;
    isLastPass = false;
    data[15] = 1; data[23] = 1; data[24] = 1; data[31] = -1; data[32] = -1;
    data[33] = 1; data[34] = 1; data[35] = 1; data[41] = 1; data[42] = -1;
    data[43] = -1; data[44] = 1; data[45] = 1; data[51] = 1; data[52] = 1;
    data[53] = 1; data[54] = -1; data[55] = -1; data[56] = -1; data[61] = 1;
    data[62] = 1; data[63] = 1; data[64] = 1; data[65] = 1; }




      if (boardnum == 287){
    player = -1;
    isLastPass = false;
    data[11] = 1; data[12] = 1; data[13] = 1; data[14] = 1; data[17] = -1;
    data[22] = 1; data[23] = 1; data[24] = 1; data[25] = -1; data[27] = -1;
    data[28] = -1; data[33] = 1; data[34] = 1; data[37] = -1; data[44] = 1;
    data[45] = -1; data[46] = -1; data[47] = 1; data[54] = -1; data[55] = 1;
    data[56] = -1; data[64] = -1; data[65] = -1; data[66] = -1; data[76] = -1;
    }




      if (boardnum == 288){
    player = -1;
    isLastPass = false;
    data[14] = 1; data[24] = 1; data[25] = 1; data[31] = 1; data[32] = 1;
    data[33] = 1; data[34] = 1; data[35] = 1; data[36] = 1; data[37] = 1;
    data[42] = 1; data[43] = 1; data[44] = 1; data[45] = 1; data[46] = 1;
    data[52] = 1; data[53] = 1; data[54] = -1; data[55] = 1; data[56] = 1;
    data[57] = 1; data[63] = -1; data[64] = -1; data[65] = -1; data[66] = -1;
    data[67] = -1; data[68] = -1; data[71] = 1; data[72] = 1; data[73] = 1;
    data[74] = 1; data[75] = -1; data[76] = -1; data[77] = -1; data[78] = -1;
    data[81] = -1; data[82] = -1; data[83] = -1; data[84] = -1; data[85] = -1;
    data[86] = -1; data[87] = -1; data[88] = -1; }




      if (boardnum == 289){
    player = 1;
    isLastPass = false;
    data[23] = -1; data[24] = 1; data[27] = -1; data[32] = 1; data[33] = 1;
    data[34] = 1; data[35] = 1; data[36] = -1; data[37] = -1; data[38] = -1;
    data[42] = 1; data[43] = 1; data[44] = -1; data[45] = -1; data[46] = 1;
    data[47] = -1; data[52] = 1; data[53] = 1; data[54] = 1; data[55] = -1;
    data[56] = 1; data[58] = -1; data[61] = 1; data[62] = 1; data[63] = 1;
    data[64] = 1; data[65] = 1; data[66] = 1; data[73] = 1; data[74] = 1;
    data[75] = 1; data[76] = -1; data[77] = -1; data[78] = -1; data[82] = 1;
    data[87] = -1; }




      if (boardnum == 290){
    player = -1;
    isLastPass = false;
    data[25] = 1; data[26] = -1; data[32] = -1; data[34] = -1; data[35] = 1;
    data[42] = -1; data[43] = -1; data[44] = -1; data[45] = 1; data[52] = -1;
    data[54] = -1; data[55] = 1; data[56] = 1; data[57] = -1; data[64] = -1;
    data[65] = 1; data[66] = 1; data[67] = 1; data[68] = 1; data[74] = 1;
    data[75] = -1; data[76] = 1; data[77] = -1; data[84] = 1; data[86] = -1;
    }




      if (boardnum == 291){
    player = 1;
    isLastPass = false;
    data[13] = 1; data[14] = 1; data[15] = 1; data[16] = 1; data[23] = -1;
    data[24] = -1; data[25] = 1; data[26] = -1; data[27] = -1; data[33] = -1;
    data[34] = -1; data[35] = 1; data[36] = -1; data[37] = -1; data[43] = -1;
    data[44] = -1; data[45] = -1; data[46] = 1; data[47] = 1; data[53] = -1;
    data[54] = -1; data[55] = -1; }




      if (boardnum == 292){
    player = 1;
    isLastPass = false;
    data[23] = -1; data[25] = 1; data[26] = 1; data[32] = 1; data[33] = -1;
    data[34] = -1; data[35] = -1; data[36] = -1; data[37] = -1; data[42] = 1;
    data[43] = 1; data[44] = 1; data[45] = 1; data[46] = 1; data[47] = 1;
    data[53] = -1; data[54] = 1; data[55] = 1; data[56] = 1; data[65] = 1;
    data[66] = 1; data[76] = 1; }




      if (boardnum == 293){
    player = -1;
    isLastPass = false;
    data[15] = 1; data[16] = -1; data[21] = 1; data[22] = -1; data[23] = 1;
    data[25] = 1; data[26] = 1; data[32] = -1; data[34] = 1; data[35] = 1;
    data[36] = 1; data[37] = 1; data[41] = 1; data[42] = -1; data[43] = -1;
    data[44] = -1; data[45] = 1; data[46] = -1; data[47] = -1; data[52] = -1;
    data[54] = 1; data[55] = -1; data[56] = 1; data[57] = -1; data[63] = -1;
    data[64] = -1; data[65] = -1; data[66] = -1; data[67] = -1; data[68] = -1;
    data[73] = 1; data[74] = 1; data[75] = 1; data[76] = 1; data[85] = -1;
    }




      if (boardnum == 294){
    player = -1;
    isLastPass = false;
    data[24] = 1; data[26] = -1; data[27] = 1; data[33] = 1; data[34] = 1;
    data[35] = -1; data[36] = 1; data[42] = -1; data[43] = -1; data[44] = -1;
    data[45] = 1; data[46] = 1; data[52] = -1; data[53] = 1; data[54] = 1;
    data[55] = 1; data[56] = 1; data[57] = 1; data[62] = 1; data[63] = 1;
    data[64] = 1; data[65] = 1; data[73] = 1; }




      if (boardnum == 295){
    player = -1;
    isLastPass = false;
    data[18] = 1; data[25] = 1; data[27] = 1; data[32] = -1; data[34] = -1;
    data[35] = 1; data[36] = -1; data[37] = -1; data[43] = -1; data[44] = -1;
    data[45] = 1; data[46] = -1; data[54] = -1; data[55] = 1; data[56] = -1;
    data[57] = -1; data[64] = -1; data[65] = 1; data[66] = 1; }




      if (boardnum == 296){
    player = -1;
    isLastPass = false;
    data[24] = 1; data[25] = 1; data[26] = -1; data[33] = 1; data[34] = 1;
    data[35] = 1; data[42] = 1; data[44] = 1; data[45] = 1; data[46] = 1;
    data[47] = 1; data[53] = -1; data[54] = 1; data[55] = 1; data[56] = 1;
    data[63] = -1; data[73] = -1; }




      if (boardnum == 297){
    player = -1;
    isLastPass = false;
    data[34] = 1; data[35] = 1; data[42] = 1; data[43] = 1; data[44] = 1;
    data[45] = 1; data[46] = 1; data[54] = 1; data[55] = 1; data[56] = -1;
    data[57] = 1; data[63] = 1; data[64] = -1; data[65] = -1; data[66] = -1;
    data[67] = -1; data[77] = 1; }




      if (boardnum == 298){
    player = -1;
    isLastPass = false;
    data[12] = 1; data[13] = 1; data[14] = 1; data[22] = 1; data[23] = 1;
    data[24] = 1; data[25] = 1; data[26] = 1; data[32] = 1; data[33] = 1;
    data[34] = 1; data[35] = -1; data[36] = 1; data[37] = 1; data[43] = -1;
    data[44] = 1; data[45] = 1; data[46] = 1; data[47] = 1; data[48] = -1;
    data[52] = -1; data[53] = -1; data[54] = 1; data[55] = 1; data[56] = 1;
    data[57] = 1; data[58] = 1; data[62] = 1; data[63] = -1; }




      if (boardnum == 299){
    player = 1;
    isLastPass = false;
    data[13] = -1; data[14] = 1; data[15] = 1; data[23] = -1; data[24] = 1;
    data[25] = 1; data[26] = 1; data[27] = 1; data[32] = -1; data[33] = -1;
    data[34] = -1; data[35] = -1; data[36] = 1; data[37] = -1; data[38] = -1;
    data[42] = -1; data[43] = -1; data[44] = -1; data[45] = -1; data[46] = -1;
    data[47] = -1; data[48] = -1; data[52] = 1; data[53] = 1; data[54] = 1;
    data[55] = -1; data[56] = -1; data[57] = -1; data[63] = 1; data[64] = 1;
    data[65] = -1; data[66] = -1; data[67] = -1; data[73] = -1; data[74] = 1;
    data[75] = -1; data[76] = -1; data[85] = -1; }




      if (boardnum == 300){
    player = 1;
    isLastPass = false;
    data[15] = 1; data[16] = -1; data[21] = 1; data[22] = -1; data[23] = 1;
    data[25] = 1; data[26] = 1; data[27] = -1; data[32] = -1; data[34] = 1;
    data[35] = 1; data[36] = -1; data[37] = -1; data[41] = 1; data[42] = -1;
    data[43] = -1; data[44] = -1; data[45] = -1; data[46] = -1; data[47] = -1;
    data[52] = -1; data[54] = -1; data[55] = -1; data[56] = 1; data[57] = -1;
    data[63] = -1; data[64] = -1; data[65] = -1; data[66] = -1; data[67] = -1;
    data[68] = -1; data[73] = 1; data[74] = 1; data[75] = 1; data[76] = 1;
    data[85] = -1; }




      if (boardnum == 301){
    player = -1;
    isLastPass = false;
    data[13] = 1; data[14] = 1; data[15] = 1; data[16] = 1; data[17] = 1;
    data[18] = 1; data[24] = 1; data[25] = 1; data[26] = 1; data[27] = 1;
    data[28] = 1; data[33] = -1; data[34] = -1; data[35] = 1; data[36] = 1;
    data[37] = 1; data[38] = 1; data[43] = -1; data[44] = 1; data[45] = 1;
    data[46] = 1; data[47] = 1; data[48] = 1; data[52] = -1; data[54] = -1;
    data[55] = 1; data[56] = -1; data[57] = 1; data[58] = 1; data[65] = 1;
    data[66] = 1; data[67] = -1; data[68] = 1; data[75] = 1; data[76] = 1;
    data[77] = -1; data[78] = -1; }




      if (boardnum == 302){
    player = -1;
    isLastPass = false;
    data[11] = -1; data[16] = 1; data[21] = -1; data[22] = -1; data[23] = -1;
    data[24] = -1; data[25] = -1; data[26] = -1; data[27] = 1; data[31] = -1;
    data[32] = -1; data[33] = 1; data[34] = -1; data[35] = 1; data[36] = -1;
    data[38] = 1; data[42] = -1; data[43] = 1; data[44] = -1; data[45] = -1;
    data[46] = 1; data[53] = 1; data[54] = -1; data[55] = -1; data[56] = -1;
    data[57] = -1; data[58] = -1; data[62] = 1; data[63] = 1; data[64] = -1;
    data[65] = -1; data[66] = -1; data[68] = -1; data[71] = 1; data[73] = -1;
    data[75] = -1; data[76] = 1; data[77] = 1; data[78] = -1; data[82] = -1;
    data[83] = -1; data[84] = -1; data[86] = 1; }




      if (boardnum == 303){
    player = 1;
    isLastPass = false;
    data[14] = 1; data[25] = 1; data[33] = 1; data[34] = 1; data[35] = -1;
    data[36] = 1; data[37] = 1; data[44] = -1; data[45] = -1; data[46] = 1;
    data[54] = -1; data[55] = -1; data[56] = 1; data[57] = 1; data[63] = -1;
    data[64] = -1; data[65] = -1; data[66] = -1; data[67] = 1; data[73] = 1;
    data[74] = 1; data[75] = 1; data[76] = -1; data[77] = -1; data[87] = -1;
    data[88] = -1; }




      if (boardnum == 304){
    player = 1;
    isLastPass = false;
    data[13] = -1; data[23] = -1; data[24] = -1; data[25] = 1; data[26] = -1;
    data[34] = -1; data[35] = -1; data[36] = -1; data[44] = -1; data[45] = 1;
    data[46] = -1; data[47] = -1; data[53] = -1; data[54] = -1; data[55] = -1;
    data[56] = -1; data[58] = -1; data[65] = 1; }




      if (boardnum == 305){
    player = -1;
    isLastPass = false;
    data[14] = 1; data[22] = 1; data[23] = 1; data[24] = 1; data[25] = -1;
    data[32] = 1; data[33] = 1; data[34] = -1; data[35] = -1; data[36] = 1;
    data[38] = 1; data[42] = -1; data[43] = -1; data[44] = 1; data[45] = -1;
    data[46] = -1; data[47] = 1; data[52] = -1; data[53] = -1; data[54] = 1;
    data[55] = 1; data[56] = 1; data[61] = -1; data[63] = 1; data[64] = 1;
    data[65] = 1; data[66] = 1; data[75] = -1; data[76] = 1; }




      if (boardnum == 306){
    player = -1;
    isLastPass = false;
    data[11] = -1; data[12] = -1; data[13] = -1; data[14] = -1; data[15] = -1;
    data[16] = -1; data[17] = -1; data[21] = 1; data[22] = 1; data[23] = -1;
    data[24] = 1; data[25] = 1; data[26] = 1; data[28] = 1; data[31] = 1;
    data[32] = 1; data[33] = 1; data[34] = 1; data[35] = 1; data[36] = 1;
    data[37] = 1; data[41] = -1; data[43] = 1; data[44] = 1; data[45] = 1;
    data[46] = 1; data[47] = 1; data[54] = 1; data[55] = 1; data[56] = 1;
    data[57] = 1; data[63] = -1; data[65] = 1; data[66] = 1; data[67] = -1;
    }




      if (boardnum == 307){
    player = 1;
    isLastPass = false;
    data[12] = -1; data[13] = -1; data[14] = -1; data[15] = -1; data[16] = -1;
    data[17] = -1; data[18] = -1; data[23] = -1; data[24] = 1; data[25] = 1;
    data[26] = -1; data[27] = -1; data[32] = -1; data[33] = -1; data[34] = -1;
    data[35] = -1; data[36] = -1; data[37] = 1; data[38] = -1; data[43] = -1;
    data[44] = -1; data[45] = -1; data[46] = 1; data[47] = 1; data[48] = 1;
    data[53] = -1; data[54] = -1; data[55] = 1; data[56] = 1; data[62] = 1;
    data[63] = 1; data[64] = 1; data[66] = 1; data[67] = -1; }




      if (boardnum == 308){
    player = 1;
    isLastPass = false;
    data[24] = 1; data[26] = 1; data[31] = -1; data[32] = -1; data[33] = -1;
    data[34] = -1; data[35] = 1; data[36] = 1; data[41] = -1; data[42] = -1;
    data[43] = -1; data[44] = -1; data[45] = -1; data[46] = 1; data[51] = -1;
    data[52] = -1; data[53] = -1; data[54] = -1; data[55] = 1; data[56] = 1;
    data[62] = -1; data[63] = -1; data[64] = -1; data[65] = 1; data[73] = 1;
    data[74] = -1; data[83] = 1; data[85] = -1; }




      if (boardnum == 309){
    player = 1;
    isLastPass = false;
    data[14] = 1; data[23] = -1; data[24] = 1; data[26] = 1; data[33] = -1;
    data[34] = 1; data[35] = 1; data[36] = 1; data[42] = 1; data[43] = -1;
    data[44] = -1; data[45] = 1; data[46] = 1; data[51] = 1; data[52] = 1;
    data[53] = -1; data[54] = -1; data[55] = -1; data[56] = 1; data[57] = 1;
    data[62] = 1; data[63] = -1; data[64] = -1; data[66] = 1; data[73] = -1;
    data[75] = 1; }




      if (boardnum == 310){
    player = -1;
    isLastPass = false;
    data[11] = -1; data[12] = -1; data[13] = -1; data[21] = 1; data[22] = 1;
    data[23] = 1; data[24] = -1; data[25] = 1; data[28] = 1; data[32] = 1;
    data[33] = 1; data[34] = 1; data[35] = -1; data[36] = -1; data[37] = 1;
    data[43] = 1; data[44] = 1; data[45] = 1; data[46] = 1; data[47] = 1;
    data[54] = 1; data[55] = 1; data[56] = -1; data[63] = -1; data[65] = 1;
    data[66] = 1; data[67] = -1; }




      if (boardnum == 311){
    player = 1;
    isLastPass = false;
    data[32] = 1; data[33] = 1; data[34] = 1; data[35] = 1; data[36] = -1;
    data[41] = 1; data[42] = 1; data[43] = 1; data[44] = 1; data[45] = 1;
    data[46] = -1; data[51] = 1; data[52] = 1; data[53] = -1; data[54] = -1;
    data[55] = 1; data[56] = -1; data[61] = 1; data[62] = 1; data[63] = 1;
    data[64] = 1; data[65] = 1; data[66] = -1; data[75] = -1; data[76] = -1;
    data[84] = -1; }




      if (boardnum == 312){
    player = -1;
    isLastPass = false;
    data[11] = -1; data[12] = -1; data[13] = -1; data[14] = -1; data[15] = -1;
    data[16] = 1; data[21] = 1; data[22] = 1; data[23] = 1; data[24] = 1;
    data[25] = 1; data[26] = 1; data[28] = 1; data[32] = 1; data[33] = 1;
    data[34] = 1; data[35] = 1; data[36] = 1; data[37] = 1; data[43] = 1;
    data[44] = 1; data[45] = 1; data[46] = 1; data[47] = 1; data[54] = 1;
    data[55] = 1; data[56] = -1; data[63] = -1; data[65] = 1; data[66] = 1;
    data[67] = -1; }




      if (boardnum == 313){
    player = -1;
    isLastPass = false;
    data[15] = 1; data[16] = -1; data[25] = 1; data[26] = 1; data[32] = -1;
    data[33] = -1; data[34] = -1; data[35] = 1; data[36] = 1; data[37] = -1;
    data[43] = -1; data[44] = 1; data[45] = -1; data[46] = 1; data[47] = 1;
    data[53] = -1; data[54] = -1; data[55] = 1; data[56] = 1; data[63] = -1;
    data[64] = 1; data[66] = 1; data[67] = -1; }




      if (boardnum == 314){
    player = 1;
    isLastPass = false;
    data[14] = 1; data[23] = -1; data[24] = 1; data[25] = -1; data[26] = -1;
    data[34] = 1; data[36] = -1; data[44] = 1; data[45] = -1; data[46] = 1;
    data[47] = -1; data[54] = -1; data[55] = 1; data[58] = -1; data[63] = -1;
    data[65] = 1; }




      if (boardnum == 315){
    player = -1;
    isLastPass = false;
    data[13] = 1; data[14] = 1; data[15] = 1; data[16] = 1; data[17] = 1;
    data[18] = 1; data[23] = 1; data[24] = 1; data[25] = 1; data[26] = 1;
    data[27] = 1; data[28] = 1; data[33] = -1; data[34] = 1; data[35] = 1;
    data[36] = 1; data[37] = 1; data[38] = 1; data[43] = -1; data[44] = 1;
    data[45] = 1; data[46] = 1; data[47] = 1; data[48] = 1; data[52] = -1;
    data[54] = -1; data[55] = 1; data[56] = -1; data[57] = 1; data[58] = 1;
    data[64] = -1; data[65] = -1; data[66] = 1; data[67] = -1; data[68] = 1;
    data[75] = 1; data[76] = -1; data[77] = 1; data[78] = 1; data[87] = -1;
    data[88] = 1; }




      if (boardnum == 316){
    player = 1;
    isLastPass = false;
    data[11] = 1; data[12] = 1; data[13] = 1; data[14] = 1; data[15] = 1;
    data[16] = 1; data[17] = 1; data[21] = 1; data[22] = -1; data[23] = 1;
    data[24] = -1; data[25] = -1; data[26] = 1; data[27] = -1; data[31] = 1;
    data[32] = 1; data[33] = -1; data[34] = 1; data[35] = 1; data[36] = -1;
    data[41] = 1; data[42] = -1; data[43] = -1; data[44] = 1; data[45] = -1;
    data[46] = -1; data[47] = -1; data[51] = 1; data[53] = -1; data[54] = 1;
    data[55] = 1; data[56] = -1; data[61] = 1; data[63] = -1; data[64] = 1;
    data[65] = -1; data[66] = -1; data[73] = -1; data[74] = -1; data[75] = -1;
    data[76] = -1; data[83] = -1; data[84] = -1; data[85] = -1; }




      if (boardnum == 317){
    player = -1;
    isLastPass = false;
    data[33] = 1; data[34] = -1; data[42] = 1; data[43] = 1; data[44] = 1;
    data[45] = 1; data[46] = 1; data[53] = 1; data[54] = -1; data[55] = 1;
    data[56] = -1; data[63] = 1; data[64] = 1; data[65] = -1; data[66] = -1;
    data[73] = 1; data[75] = 1; data[76] = -1; data[77] = 1; }




      if (boardnum == 318){
    player = -1;
    isLastPass = false;
    data[11] = 1; data[13] = -1; data[14] = -1; data[16] = 1; data[21] = 1;
    data[22] = 1; data[23] = -1; data[24] = -1; data[25] = -1; data[27] = -1;
    data[31] = 1; data[32] = -1; data[33] = 1; data[34] = 1; data[35] = -1;
    data[36] = -1; data[37] = -1; data[41] = 1; data[42] = -1; data[43] = 1;
    data[44] = 1; data[45] = -1; data[46] = 1; data[47] = -1; data[48] = 1;
    data[51] = 1; data[52] = -1; data[53] = -1; data[54] = -1; data[55] = -1;
    data[56] = -1; data[57] = 1; data[58] = 1; data[61] = 1; data[62] = -1;
    data[67] = -1; data[68] = 1; data[76] = -1; data[78] = 1; data[85] = -1;
    data[88] = 1; }




      if (boardnum == 319){
    player = -1;
    isLastPass = false;
    data[12] = -1; data[13] = -1; data[14] = -1; data[15] = -1; data[16] = -1;
    data[17] = -1; data[23] = -1; data[24] = 1; data[25] = 1; data[26] = -1;
    data[27] = 1; data[32] = -1; data[33] = -1; data[34] = -1; data[35] = -1;
    data[36] = 1; data[37] = 1; data[38] = -1; data[43] = -1; data[44] = -1;
    data[45] = 1; data[46] = 1; data[47] = 1; data[48] = 1; data[53] = -1;
    data[54] = -1; data[55] = 1; data[56] = 1; data[62] = 1; data[63] = 1;
    data[64] = 1; data[66] = 1; data[67] = -1; }




      if (boardnum == 320){
    player = -1;
    isLastPass = false;
    data[12] = 1; data[13] = 1; data[14] = 1; data[22] = 1; data[23] = 1;
    data[24] = 1; data[25] = 1; data[26] = 1; data[27] = 1; data[28] = 1;
    data[31] = -1; data[32] = 1; data[33] = 1; data[34] = -1; data[35] = -1;
    data[36] = 1; data[37] = 1; data[38] = 1; data[41] = 1; data[43] = -1;
    data[44] = -1; data[45] = 1; data[46] = 1; data[47] = 1; data[48] = 1;
    data[51] = 1; data[52] = 1; data[53] = 1; data[54] = -1; data[55] = 1;
    data[56] = -1; data[57] = -1; data[58] = 1; data[61] = -1; data[62] = -1;
    data[63] = -1; data[64] = -1; data[66] = -1; data[73] = 1; }




      if (boardnum == 321){
    player = -1;
    isLastPass = false;
    data[13] = 1; data[14] = 1; data[15] = 1; data[16] = 1; data[17] = 1;
    data[18] = 1; data[24] = 1; data[25] = 1; data[26] = 1; data[27] = 1;
    data[28] = 1; data[33] = -1; data[34] = -1; data[35] = 1; data[36] = 1;
    data[37] = 1; data[38] = 1; data[43] = -1; data[44] = 1; data[45] = 1;
    data[46] = 1; data[47] = 1; data[48] = 1; data[52] = -1; data[54] = -1;
    data[55] = 1; data[56] = -1; data[57] = 1; data[58] = 1; data[65] = 1;
    data[66] = 1; data[67] = -1; data[68] = 1; data[75] = 1; data[76] = 1;
    data[77] = -1; data[78] = -1; }




      if (boardnum == 322){
    player = -1;
    isLastPass = false;
    data[13] = -1; data[21] = -1; data[23] = 1; data[24] = 1; data[25] = 1;
    data[26] = 1; data[32] = -1; data[33] = 1; data[34] = 1; data[35] = -1;
    data[36] = -1; data[42] = 1; data[43] = 1; data[44] = 1; data[45] = -1;
    data[46] = -1; data[52] = -1; data[53] = 1; data[54] = -1; data[55] = -1;
    data[56] = -1; data[62] = -1; data[63] = -1; data[64] = 1; data[65] = -1;
    data[73] = -1; data[74] = -1; data[76] = -1; data[83] = -1; }




      if (boardnum == 323){
    player = 1;
    isLastPass = false;
    data[13] = -1; data[16] = 1; data[17] = -1; data[18] = -1; data[23] = -1;
    data[24] = -1; data[25] = 1; data[26] = 1; data[27] = 1; data[33] = -1;
    data[34] = 1; data[35] = 1; data[36] = 1; data[37] = 1; data[38] = 1;
    data[42] = -1; data[43] = -1; data[44] = -1; data[45] = 1; data[46] = 1;
    data[47] = 1; data[52] = -1; data[53] = 1; data[54] = 1; data[55] = 1;
    data[56] = 1; data[57] = 1; data[62] = 1; data[63] = 1; data[64] = 1;
    data[65] = 1; data[73] = 1; }




      if (boardnum == 324){
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




      if (boardnum == 325){
    player = 1;
    isLastPass = false;
    data[12] = 1; data[23] = 1; data[24] = 1; data[27] = -1; data[31] = -1;
    data[32] = 1; data[33] = -1; data[34] = -1; data[35] = -1; data[36] = -1;
    data[37] = -1; data[38] = -1; data[41] = 1; data[42] = 1; data[43] = 1;
    data[44] = -1; data[45] = -1; data[46] = 1; data[47] = -1; data[52] = 1;
    data[53] = -1; data[54] = 1; data[55] = -1; data[56] = -1; data[58] = -1;
    data[61] = 1; data[62] = -1; data[63] = 1; data[64] = 1; data[65] = 1;
    data[66] = 1; data[67] = -1; data[71] = -1; data[73] = 1; data[74] = 1;
    data[75] = 1; data[76] = 1; data[77] = -1; data[78] = -1; data[82] = 1;
    data[86] = 1; data[87] = -1; }




      if (boardnum == 326){
    player = -1;
    isLastPass = false;
    data[25] = -1; data[32] = -1; data[33] = 1; data[34] = 1; data[35] = 1;
    data[36] = 1; data[37] = -1; data[43] = -1; data[44] = 1; data[45] = -1;
    data[46] = 1; data[47] = 1; data[48] = 1; data[53] = -1; data[54] = -1;
    data[55] = -1; data[57] = -1; }




      if (boardnum == 327){
    player = -1;
    isLastPass = false;
    data[24] = 1; data[25] = 1; data[26] = 1; data[33] = -1; data[34] = 1;
    data[35] = 1; data[36] = -1; data[43] = -1; data[44] = 1; data[45] = -1;
    data[46] = -1; data[52] = -1; data[53] = 1; data[54] = -1; data[55] = -1;
    data[56] = -1; data[62] = -1; data[63] = -1; data[64] = 1; data[65] = -1;
    data[73] = -1; data[74] = 1; data[76] = -1; }




      if (boardnum == 328){
    player = 1;
    isLastPass = false;
    data[25] = 1; data[26] = 1; data[33] = -1; data[34] = -1; data[35] = 1;
    data[36] = -1; data[43] = -1; data[44] = -1; data[45] = -1; data[46] = -1;
    data[52] = -1; data[54] = -1; data[55] = -1; data[56] = -1; data[63] = 1;
    data[64] = -1; data[65] = 1; data[73] = -1; }




      if (boardnum == 329){
    player = 1;
    isLastPass = false;
    data[11] = -1; data[14] = -1; data[16] = -1; data[21] = -1; data[22] = 1;
    data[23] = 1; data[24] = 1; data[26] = -1; data[31] = -1; data[32] = -1;
    data[33] = -1; data[34] = 1; data[35] = 1; data[36] = 1; data[37] = 1;
    data[38] = 1; data[41] = 1; data[43] = -1; data[44] = -1; data[45] = -1;
    data[47] = 1; data[52] = 1; data[53] = -1; data[54] = -1; data[55] = -1;
    data[56] = 1; data[61] = 1; data[62] = 1; data[63] = -1; data[64] = -1;
    data[65] = 1; data[66] = -1; data[71] = 1; data[72] = 1; data[73] = -1;
    data[74] = 1; data[75] = 1; data[76] = -1; data[77] = -1; data[81] = -1;
    data[82] = -1; data[83] = -1; data[87] = -1; data[88] = -1; }




      if (boardnum == 330){
    player = 1;
    isLastPass = false;
    data[11] = -1; data[12] = -1; data[13] = -1; data[15] = 1; data[21] = -1;
    data[22] = -1; data[23] = -1; data[24] = 1; data[31] = -1; data[32] = 1;
    data[33] = -1; data[34] = 1; data[35] = 1; data[37] = 1; data[41] = -1;
    data[42] = 1; data[43] = 1; data[44] = -1; data[45] = 1; data[46] = 1;
    data[51] = -1; data[52] = 1; data[53] = 1; data[54] = -1; data[55] = 1;
    data[56] = 1; data[61] = -1; data[62] = 1; data[63] = -1; data[64] = 1;
    data[65] = 1; data[67] = 1; data[71] = -1; data[72] = -1; data[73] = -1;
    data[74] = 1; data[75] = 1; data[81] = -1; data[82] = -1; data[83] = -1;
    }




      if (boardnum == 331){
    player = -1;
    isLastPass = false;
    data[11] = 1; data[12] = 1; data[13] = 1; data[23] = -1; data[24] = 1;
    data[25] = 1; data[31] = -1; data[32] = -1; data[33] = 1; data[34] = -1;
    data[35] = 1; data[36] = 1; data[43] = 1; data[44] = 1; data[45] = -1;
    data[46] = 1; data[47] = 1; data[52] = 1; data[53] = 1; data[54] = -1;
    data[55] = 1; data[56] = 1; data[62] = 1; data[63] = 1; data[64] = 1;
    data[65] = 1; data[67] = -1; data[73] = 1; data[74] = 1; data[75] = 1;
    data[82] = 1; }




      if (boardnum == 332){
    player = -1;
    isLastPass = false;
    data[13] = -1; data[14] = -1; data[15] = -1; data[16] = -1; data[24] = 1;
    data[25] = 1; data[26] = 1; data[32] = 1; data[33] = 1; data[34] = 1;
    data[35] = 1; data[36] = 1; data[37] = 1; data[38] = 1; data[42] = 1;
    data[43] = 1; data[44] = -1; data[45] = -1; data[46] = 1; data[47] = 1;
    data[48] = -1; data[52] = 1; data[53] = 1; data[54] = 1; data[55] = -1;
    data[56] = 1; data[57] = 1; data[62] = 1; data[63] = 1; data[64] = 1;
    data[66] = 1; data[67] = 1; data[73] = 1; data[74] = 1; data[76] = 1;
    }




      if (boardnum == 333){
    player = -1;
    isLastPass = false;
    data[13] = -1; data[16] = -1; data[21] = -1; data[22] = -1; data[23] = 1;
    data[24] = 1; data[25] = -1; data[26] = -1; data[32] = 1; data[33] = -1;
    data[34] = -1; data[35] = -1; data[36] = -1; data[41] = 1; data[42] = 1;
    data[43] = 1; data[44] = 1; data[45] = 1; data[46] = 1; data[47] = 1;
    data[51] = 1; data[52] = -1; data[53] = 1; data[54] = -1; data[55] = -1;
    data[56] = -1; data[61] = -1; data[62] = -1; data[63] = -1; data[64] = 1;
    data[65] = -1; data[73] = -1; data[74] = -1; data[76] = -1; data[83] = -1;
    }




      if (boardnum == 334){
    player = -1;
    isLastPass = false;
    data[14] = 1; data[16] = -1; data[25] = -1; data[26] = 1; data[33] = -1;
    data[34] = -1; data[35] = 1; data[36] = 1; data[37] = 1; data[38] = 1;
    data[42] = -1; data[44] = 1; data[45] = -1; data[46] = 1; data[53] = -1;
    data[54] = 1; data[55] = -1; data[56] = 1; data[57] = 1; data[64] = -1;
    data[66] = 1; data[73] = -1; data[76] = 1; }




      if (boardnum == 335){
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




      if (boardnum == 336){
    player = 1;
    isLastPass = false;
    data[25] = 1; data[26] = -1; data[32] = -1; data[34] = -1; data[35] = 1;
    data[42] = -1; data[43] = -1; data[44] = -1; data[45] = -1; data[46] = -1;
    data[52] = -1; data[54] = -1; data[55] = -1; data[56] = -1; data[57] = -1;
    data[64] = -1; data[65] = 1; data[66] = -1; data[67] = 1; data[68] = 1;
    data[74] = 1; data[75] = -1; data[76] = -1; data[77] = -1; data[84] = 1;
    data[86] = -1; }




      if (boardnum == 337){
    player = 1;
    isLastPass = false;
    data[14] = 1; data[16] = -1; data[25] = -1; data[26] = -1; data[33] = -1;
    data[34] = -1; data[35] = 1; data[36] = -1; data[37] = 1; data[38] = 1;
    data[42] = -1; data[44] = 1; data[45] = -1; data[46] = -1; data[53] = -1;
    data[54] = 1; data[55] = -1; data[56] = -1; data[57] = 1; data[64] = -1;
    data[66] = -1; data[73] = -1; data[76] = -1; data[86] = -1; }




      if (boardnum == 338){
    player = -1;
    isLastPass = false;
    data[32] = -1; data[42] = 1; data[43] = 1; data[44] = 1; data[45] = 1;
    data[46] = -1; data[53] = 1; data[54] = -1; data[55] = -1; data[56] = -1;
    data[57] = -1; data[62] = 1; data[64] = -1; data[65] = -1; data[66] = -1;
    data[67] = 1; data[76] = -1; }




      if (boardnum == 339){
    player = 1;
    isLastPass = false;
    data[11] = 1; data[13] = -1; data[14] = -1; data[15] = -1; data[16] = -1;
    data[21] = -1; data[22] = -1; data[23] = -1; data[24] = -1; data[25] = -1;
    data[26] = -1; data[27] = -1; data[28] = -1; data[31] = 1; data[32] = -1;
    data[33] = 1; data[34] = 1; data[35] = 1; data[36] = -1; data[37] = -1;
    data[38] = 1; data[42] = -1; data[43] = 1; data[44] = 1; data[45] = -1;
    data[46] = -1; data[53] = -1; data[54] = -1; data[55] = -1; data[62] = -1;
    data[63] = -1; data[64] = -1; data[66] = 1; data[73] = 1; }




      if (boardnum == 340){
    player = 1;
    isLastPass = false;
    data[12] = -1; data[13] = -1; data[14] = -1; data[15] = -1; data[23] = -1;
    data[24] = 1; data[25] = -1; data[26] = -1; data[33] = -1; data[34] = -1;
    data[35] = -1; data[36] = -1; data[37] = -1; data[38] = 1; data[43] = -1;
    data[44] = 1; data[45] = -1; data[46] = 1; data[47] = -1; data[48] = 1;
    data[52] = -1; data[53] = 1; data[54] = 1; data[55] = 1; data[56] = -1;
    data[57] = -1; data[58] = 1; data[62] = 1; data[63] = 1; data[64] = 1;
    data[65] = 1; data[66] = 1; data[67] = -1; data[68] = 1; }




      if (boardnum == 341){
    player = 1;
    isLastPass = false;
    data[32] = -1; data[33] = -1; data[34] = 1; data[43] = -1; data[44] = 1;
    data[45] = 1; data[46] = 1; data[53] = 1; data[54] = 1; data[55] = -1;
    data[56] = 1; data[62] = -1; data[63] = -1; data[64] = -1; data[65] = -1;
    data[66] = -1; data[75] = -1; data[76] = -1; data[77] = -1; data[84] = -1;
    }




      if (boardnum == 342){
    player = 1;
    isLastPass = false;
    data[33] = -1; data[34] = -1; data[35] = -1; data[36] = -1; data[37] = -1;
    data[38] = -1; data[42] = -1; data[43] = 1; data[44] = 1; data[45] = 1;
    data[46] = -1; data[47] = -1; data[51] = -1; data[53] = 1; data[54] = 1;
    data[55] = -1; data[56] = -1; data[57] = -1; data[62] = 1; data[63] = 1;
    }




      if (boardnum == 343){
    player = 1;
    isLastPass = false;
    data[11] = 1; data[12] = 1; data[13] = 1; data[14] = 1; data[15] = 1;
    data[16] = 1; data[17] = 1; data[18] = 1; data[21] = 1; data[22] = 1;
    data[23] = 1; data[24] = -1; data[25] = -1; data[26] = -1; data[27] = 1;
    data[28] = 1; data[31] = 1; data[32] = 1; data[33] = 1; data[34] = 1;
    data[35] = 1; data[36] = 1; data[37] = -1; data[43] = -1; data[44] = -1;
    data[45] = -1; data[46] = -1; data[47] = -1; data[48] = -1; data[53] = -1;
    data[54] = -1; data[55] = 1; data[56] = -1; data[57] = -1; data[64] = -1;
    data[65] = -1; data[66] = 1; data[74] = -1; }




      if (boardnum == 344){
    player = 1;
    isLastPass = false;
    data[13] = -1; data[14] = 1; data[15] = 1; data[16] = 1; data[21] = -1;
    data[22] = -1; data[23] = -1; data[24] = 1; data[25] = -1; data[32] = -1;
    data[33] = 1; data[34] = 1; data[35] = -1; data[36] = -1; data[41] = 1;
    data[42] = 1; data[43] = -1; data[44] = -1; data[45] = -1; data[46] = -1;
    data[51] = 1; data[52] = 1; data[53] = -1; data[54] = -1; data[55] = -1;
    data[56] = -1; data[61] = 1; data[62] = 1; data[63] = -1; data[64] = -1;
    data[65] = -1; data[66] = -1; data[71] = 1; data[72] = 1; data[74] = -1;
    data[75] = -1; data[76] = -1; data[81] = 1; data[82] = 1; data[83] = 1;
    data[84] = 1; data[85] = 1; }




      if (boardnum == 345){
    player = 1;
    isLastPass = false;
    data[11] = 1; data[13] = 1; data[14] = 1; data[15] = 1; data[16] = -1;
    data[22] = 1; data[23] = 1; data[24] = 1; data[25] = -1; data[26] = -1;
    data[27] = -1; data[31] = 1; data[32] = 1; data[33] = 1; data[34] = -1;
    data[35] = 1; data[36] = -1; data[37] = 1; data[38] = 1; data[42] = -1;
    data[44] = -1; data[45] = -1; data[46] = 1; data[53] = -1; data[54] = -1;
    data[55] = 1; data[56] = -1; data[57] = -1; data[58] = -1; data[63] = -1;
    data[64] = -1; data[65] = -1; data[66] = -1; data[73] = 1; data[75] = -1;
    data[76] = -1; data[82] = 1; data[86] = -1; }




      if (boardnum == 346){
    player = -1;
    isLastPass = false;
    data[13] = -1; data[21] = -1; data[22] = -1; data[23] = 1; data[24] = 1;
    data[25] = 1; data[26] = 1; data[32] = -1; data[33] = -1; data[34] = 1;
    data[35] = -1; data[36] = -1; data[42] = 1; data[43] = 1; data[44] = -1;
    data[45] = -1; data[46] = -1; data[51] = 1; data[52] = 1; data[53] = 1;
    data[54] = -1; data[55] = -1; data[56] = -1; data[62] = -1; data[63] = -1;
    data[64] = 1; data[65] = -1; data[73] = -1; data[74] = -1; data[76] = -1;
    data[83] = -1; }




      if (boardnum == 347){
    player = -1;
    isLastPass = false;
    data[11] = 1; data[13] = -1; data[14] = 1; data[15] = 1; data[16] = -1;
    data[22] = 1; data[23] = -1; data[24] = -1; data[25] = -1; data[26] = -1;
    data[27] = -1; data[31] = 1; data[32] = 1; data[33] = 1; data[34] = 1;
    data[35] = 1; data[36] = -1; data[43] = -1; data[44] = 1; data[45] = 1;
    data[46] = 1; data[53] = -1; data[54] = -1; data[55] = 1; data[56] = 1;
    data[63] = -1; data[64] = -1; data[65] = -1; data[66] = -1; data[73] = -1;
    data[74] = -1; data[75] = -1; data[76] = -1; }




      if (boardnum == 348){
    player = 1;
    isLastPass = false;
    data[11] = -1; data[12] = -1; data[13] = -1; data[14] = -1; data[15] = -1;
    data[16] = -1; data[17] = -1; data[23] = 1; data[24] = -1; data[25] = 1;
    data[31] = 1; data[33] = -1; data[34] = 1; data[35] = -1; data[36] = -1;
    data[37] = -1; data[38] = -1; data[41] = 1; data[42] = 1; data[43] = 1;
    data[44] = 1; data[45] = -1; data[46] = -1; data[47] = -1; data[51] = 1;
    data[52] = 1; data[53] = 1; data[54] = -1; data[55] = 1; data[56] = -1;
    data[57] = -1; data[61] = 1; data[62] = 1; data[63] = -1; data[64] = -1;
    data[65] = -1; data[66] = -1; data[67] = -1; data[72] = -1; data[73] = -1;
    data[74] = -1; data[75] = -1; }




      if (boardnum == 349){
    player = -1;
    isLastPass = false;
    data[13] = 1; data[14] = -1; data[15] = -1; data[16] = -1; data[23] = 1;
    data[24] = 1; data[25] = 1; data[26] = 1; data[32] = -1; data[33] = -1;
    data[34] = -1; data[35] = 1; data[36] = -1; data[37] = -1; data[38] = -1;
    data[43] = -1; data[44] = -1; data[45] = 1; data[46] = 1; data[47] = 1;
    data[48] = 1; data[53] = -1; data[54] = -1; data[55] = 1; data[56] = 1;
    data[63] = -1; data[64] = 1; data[66] = 1; data[67] = -1; }




      if (boardnum == 350){
    player = -1;
    isLastPass = false;
    data[13] = 1; data[14] = 1; data[15] = 1; data[23] = 1; data[24] = 1;
    data[25] = 1; data[33] = 1; data[34] = -1; data[35] = 1; data[36] = 1;
    data[37] = 1; data[42] = 1; data[43] = 1; data[44] = -1; data[45] = 1;
    data[46] = 1; data[52] = 1; data[53] = -1; data[54] = -1; data[55] = 1;
    data[56] = 1; data[61] = 1; data[63] = 1; data[64] = 1; data[65] = 1;
    data[66] = 1; data[72] = 1; data[74] = 1; data[75] = 1; data[76] = 1;
    data[83] = -1; data[84] = 1; data[86] = 1; }




      if (boardnum == 351){
    player = -1;
    isLastPass = false;
    data[12] = -1; data[13] = -1; data[14] = -1; data[15] = 1; data[16] = 1;
    data[17] = -1; data[18] = 1; data[22] = -1; data[23] = -1; data[24] = -1;
    data[25] = 1; data[26] = 1; data[27] = 1; data[28] = 1; data[33] = -1;
    data[34] = -1; data[35] = 1; data[36] = -1; data[37] = 1; data[38] = 1;
    data[43] = -1; data[44] = -1; data[45] = 1; data[46] = 1; data[47] = -1;
    data[48] = 1; data[52] = 1; data[53] = 1; data[54] = 1; data[55] = 1;
    data[56] = -1; data[62] = -1; data[66] = 1; data[71] = -1; data[77] = 1;
    }




      if (boardnum == 352){
    player = 1;
    isLastPass = false;
    data[13] = -1; data[16] = 1; data[17] = -1; data[18] = -1; data[23] = -1;
    data[24] = -1; data[25] = 1; data[26] = 1; data[27] = 1; data[33] = -1;
    data[34] = 1; data[35] = 1; data[36] = 1; data[37] = 1; data[38] = 1;
    data[42] = -1; data[43] = -1; data[44] = -1; data[45] = 1; data[46] = 1;
    data[47] = 1; data[52] = -1; data[53] = 1; data[54] = 1; data[55] = 1;
    data[56] = 1; data[57] = 1; data[62] = 1; data[63] = 1; data[64] = 1;
    data[65] = 1; data[73] = 1; }




      if (boardnum == 353){
    player = -1;
    isLastPass = false;
    data[11] = -1; data[12] = 1; data[13] = -1; data[21] = 1; data[22] = 1;
    data[23] = -1; data[24] = -1; data[26] = -1; data[32] = 1; data[33] = -1;
    data[34] = -1; data[36] = -1; data[37] = -1; data[38] = 1; data[41] = 1;
    data[42] = 1; data[43] = 1; data[44] = -1; data[45] = -1; data[46] = 1;
    data[47] = -1; data[48] = 1; data[51] = -1; data[52] = 1; data[53] = -1;
    data[54] = -1; data[55] = -1; data[56] = -1; data[57] = -1; data[58] = 1;
    data[62] = 1; data[63] = 1; data[64] = -1; data[65] = 1; data[66] = -1;
    data[67] = -1; data[72] = 1; data[73] = 1; data[74] = 1; data[75] = -1;
    data[81] = 1; }




      if (boardnum == 354){
    player = 1;
    isLastPass = false;
    data[11] = -1; data[12] = 1; data[13] = 1; data[14] = 1; data[15] = 1;
    data[16] = 1; data[17] = 1; data[18] = 1; data[21] = 1; data[22] = 1;
    data[23] = 1; data[24] = -1; data[25] = -1; data[26] = 1; data[27] = 1;
    data[31] = -1; data[32] = 1; data[33] = -1; data[34] = -1; data[35] = 1;
    data[36] = -1; data[37] = 1; data[43] = -1; data[44] = 1; data[45] = 1;
    data[46] = -1; data[47] = -1; data[52] = -1; data[53] = -1; data[54] = -1;
    data[55] = 1; data[56] = -1; data[62] = 1; data[64] = 1; data[65] = 1;
    data[66] = -1; data[67] = -1; data[74] = 1; data[75] = 1; data[76] = -1;
    }




      if (boardnum == 355){
    player = -1;
    isLastPass = false;
    data[11] = -1; data[15] = 1; data[21] = -1; data[22] = -1; data[23] = 1;
    data[24] = 1; data[31] = -1; data[32] = -1; data[33] = -1; data[34] = 1;
    data[35] = 1; data[37] = 1; data[41] = -1; data[42] = -1; data[43] = 1;
    data[44] = -1; data[45] = 1; data[46] = 1; data[51] = -1; data[52] = -1;
    data[53] = 1; data[54] = -1; data[55] = 1; data[56] = 1; data[61] = -1;
    data[62] = 1; data[63] = -1; data[64] = 1; data[65] = 1; data[67] = 1;
    data[71] = -1; data[72] = 1; data[73] = 1; data[74] = 1; data[75] = 1;
    data[81] = -1; data[82] = 1; }




      if (boardnum == 356){
    player = 1;
    isLastPass = false;
    data[12] = -1; data[23] = -1; data[24] = -1; data[33] = -1; data[34] = -1;
    data[35] = -1; data[36] = -1; data[37] = -1; data[43] = -1; data[44] = -1;
    data[45] = -1; data[46] = -1; data[53] = -1; data[54] = -1; data[55] = 1;
    data[63] = -1; data[65] = 1; data[72] = -1; }





      if (boardnum == 358){
    player = -1;
    isLastPass = false;
    data[14] = -1; data[15] = -1; data[23] = 1; data[24] = -1; data[25] = -1;
    data[26] = -1; data[33] = 1; data[34] = 1; data[35] = -1; data[36] = -1;
    data[37] = 1; data[38] = 1; data[42] = 1; data[43] = 1; data[44] = -1;
    data[45] = -1; data[46] = 1; data[47] = -1; data[48] = 1; data[52] = 1;
    data[53] = 1; data[54] = -1; data[55] = -1; data[56] = -1; data[57] = 1;
    data[58] = 1; data[62] = -1; data[63] = -1; data[64] = 1; data[65] = -1;
    data[66] = -1; data[67] = 1; data[68] = 1; data[72] = -1; data[73] = -1;
    data[74] = -1; data[75] = 1; data[76] = 1; data[83] = 1; data[84] = 1;
    data[85] = 1; data[86] = 1; data[87] = 1; }




      if (boardnum == 359){
    player = -1;
    isLastPass = false;
    data[14] = 1; data[25] = 1; data[33] = 1; data[34] = 1; data[35] = -1;
    data[36] = 1; data[37] = 1; data[44] = -1; data[45] = 1; data[46] = 1;
    data[54] = 1; data[55] = -1; data[56] = 1; data[57] = 1; data[63] = 1;
    data[64] = -1; data[65] = -1; data[66] = -1; data[67] = 1; data[72] = 1;
    data[73] = 1; data[74] = 1; data[75] = 1; data[76] = -1; data[77] = -1;
    data[87] = -1; data[88] = -1; }




      if (boardnum == 360){
    player = 1;
    isLastPass = false;
    data[13] = -1; data[14] = -1; data[15] = -1; data[23] = 1; data[24] = -1;
    data[25] = -1; data[26] = -1; data[31] = -1; data[32] = -1; data[33] = 1;
    data[34] = 1; data[35] = -1; data[36] = 1; data[37] = -1; data[41] = -1;
    data[42] = -1; data[43] = 1; data[44] = 1; data[45] = -1; data[46] = -1;
    data[47] = -1; data[48] = -1; data[52] = -1; data[53] = 1; data[54] = -1;
    data[55] = 1; data[56] = 1; data[62] = -1; data[63] = -1; data[64] = 1;
    data[65] = 1; data[66] = 1; data[71] = -1; data[72] = -1; data[73] = 1;
    data[74] = 1; data[83] = 1; data[84] = 1; }




      if (boardnum == 361){
    player = 1;
    isLastPass = false;
    data[12] = 1; data[13] = -1; data[15] = 1; data[23] = 1; data[24] = -1;
    data[25] = 1; data[26] = 1; data[27] = -1; data[33] = 1; data[34] = 1;
    data[35] = -1; data[36] = 1; data[37] = 1; data[41] = -1; data[42] = -1;
    data[43] = -1; data[44] = -1; data[45] = -1; data[46] = -1; data[51] = -1;
    data[52] = -1; data[53] = -1; data[54] = -1; data[55] = -1; data[56] = -1;
    data[57] = -1; data[62] = -1; data[64] = 1; data[65] = 1; data[66] = 1;
    data[67] = 1; data[73] = -1; data[74] = 1; data[75] = 1; data[76] = -1;
    data[84] = 1; }




      if (boardnum == 362){
    player = 1;
    isLastPass = false;
    data[16] = -1; data[18] = 1; data[25] = -1; data[27] = 1; data[32] = -1;
    data[34] = -1; data[35] = 1; data[36] = -1; data[37] = -1; data[43] = -1;
    data[44] = -1; data[45] = 1; data[46] = -1; data[54] = -1; data[55] = 1;
    data[56] = -1; data[57] = -1; data[64] = -1; data[65] = 1; data[66] = 1;
    }




      if (boardnum == 363){
    player = 1;
    isLastPass = false;
    data[13] = 1; data[16] = 1; data[21] = -1; data[22] = 1; data[24] = 1;
    data[26] = 1; data[31] = -1; data[32] = -1; data[33] = -1; data[34] = 1;
    data[35] = 1; data[36] = 1; data[37] = 1; data[41] = -1; data[42] = -1;
    data[43] = -1; data[44] = -1; data[45] = 1; data[46] = 1; data[47] = 1;
    data[51] = -1; data[53] = 1; data[54] = 1; data[55] = -1; data[56] = 1;
    data[57] = 1; data[61] = 1; data[62] = -1; data[63] = 1; data[64] = -1;
    data[65] = 1; data[66] = -1; data[73] = 1; data[74] = 1; data[75] = -1;
    data[77] = -1; data[81] = 1; data[82] = 1; data[83] = 1; data[84] = -1;
    data[86] = -1; data[88] = -1; }




      if (boardnum == 364){
    player = -1;
    isLastPass = false;
    data[15] = -1; data[17] = 1; data[18] = 1; data[23] = -1; data[24] = -1;
    data[25] = -1; data[26] = -1; data[27] = -1; data[28] = 1; data[33] = -1;
    data[34] = 1; data[35] = 1; data[36] = 1; data[37] = -1; data[38] = 1;
    data[43] = -1; data[44] = 1; data[45] = -1; data[46] = 1; data[47] = 1;
    data[48] = 1; data[52] = -1; data[53] = -1; data[54] = -1; data[55] = -1;
    data[56] = -1; data[65] = -1; }




      if (boardnum == 365){
    player = -1;
    isLastPass = false;
    data[13] = -1; data[14] = -1; data[15] = -1; data[16] = -1; data[23] = 1;
    data[24] = 1; data[25] = 1; data[26] = 1; data[32] = 1; data[33] = 1;
    data[34] = 1; data[35] = -1; data[36] = -1; data[37] = -1; data[38] = -1;
    data[43] = 1; data[44] = -1; data[45] = -1; data[46] = -1; data[47] = -1;
    data[48] = -1; data[53] = 1; data[54] = 1; data[55] = -1; data[56] = 1;
    data[57] = 1; data[58] = 1; data[64] = 1; data[65] = 1; data[66] = 1;
    data[67] = 1; data[68] = 1; data[75] = 1; data[76] = 1; data[78] = 1;
    }




      if (boardnum == 366){
    player = 1;
    isLastPass = false;
    data[14] = -1; data[16] = 1; data[23] = -1; data[24] = -1; data[25] = -1;
    data[26] = -1; data[27] = -1; data[33] = -1; data[34] = 1; data[35] = -1;
    data[36] = -1; data[37] = -1; data[38] = -1; data[42] = -1; data[43] = -1;
    data[44] = 1; data[45] = 1; data[46] = -1; data[47] = 1; data[48] = 1;
    data[51] = -1; data[53] = -1; data[54] = -1; data[55] = 1; data[56] = -1;
    data[57] = -1; data[58] = -1; data[64] = -1; data[65] = -1; data[66] = 1;
    data[67] = -1; data[68] = -1; data[74] = -1; data[75] = -1; data[76] = -1;
    data[77] = -1; data[87] = -1; data[88] = 1; }




      if (boardnum == 367){
    player = 1;
    isLastPass = false;
    data[33] = 1; data[34] = -1; data[35] = -1; data[37] = 1; data[44] = -1;
    data[45] = -1; data[46] = 1; data[54] = -1; data[55] = -1; data[56] = 1;
    data[64] = -1; data[65] = -1; data[66] = 1; data[67] = -1; data[74] = -1;
    data[75] = 1; data[76] = 1; data[77] = 1; }




      if (boardnum == 368){
    player = -1;
    isLastPass = false;
    data[25] = -1; data[31] = 1; data[35] = -1; data[36] = -1; data[42] = 1;
    data[44] = -1; data[45] = -1; data[46] = -1; data[52] = -1; data[53] = 1;
    data[54] = -1; data[55] = 1; data[56] = -1; data[57] = -1; data[61] = 1;
    data[62] = 1; data[63] = 1; data[64] = 1; data[65] = 1; data[66] = -1;
    data[67] = 1; data[74] = -1; data[75] = -1; data[76] = -1; data[84] = -1;
    data[85] = -1; data[86] = 1; data[87] = 1; data[88] = 1; }




      if (boardnum == 369){
    player = -1;
    isLastPass = false;
    data[22] = 1; data[23] = 1; data[24] = 1; data[25] = 1; data[26] = 1;
    data[31] = 1; data[32] = 1; data[33] = 1; data[34] = -1; data[35] = -1;
    data[36] = 1; data[42] = 1; data[43] = -1; data[44] = -1; data[45] = -1;
    data[46] = 1; data[51] = 1; data[52] = 1; data[53] = 1; data[54] = 1;
    data[55] = 1; data[56] = 1; data[63] = 1; data[64] = 1; data[65] = 1;
    data[66] = 1; data[74] = 1; data[75] = 1; data[76] = 1; data[83] = 1;
    data[85] = 1; }




      if (boardnum == 370){
    player = 1;
    isLastPass = false;
    data[32] = -1; data[34] = 1; data[36] = -1; data[42] = 1; data[43] = 1;
    data[44] = 1; data[45] = 1; data[46] = -1; data[47] = -1; data[53] = 1;
    data[54] = -1; data[55] = -1; data[56] = -1; data[57] = -1; data[62] = 1;
    data[64] = -1; data[65] = -1; data[66] = -1; data[67] = 1; data[76] = -1;
    }




      if (boardnum == 371){
    player = 1;
    isLastPass = false;
    data[13] = -1; data[14] = -1; data[23] = -1; data[24] = -1; data[25] = -1;
    data[26] = -1; data[34] = -1; data[35] = -1; data[36] = -1; data[44] = -1;
    data[45] = 1; data[46] = -1; data[47] = -1; data[53] = -1; data[54] = 1;
    data[55] = -1; data[56] = -1; data[58] = -1; data[63] = 1; data[65] = 1;
    }




      if (boardnum == 372){
    player = 1;
    isLastPass = false;
    data[15] = 1; data[16] = -1; data[18] = 1; data[25] = 1; data[26] = -1;
    data[27] = 1; data[32] = -1; data[34] = -1; data[35] = -1; data[36] = -1;
    data[37] = -1; data[43] = -1; data[44] = -1; data[45] = 1; data[46] = -1;
    data[54] = -1; data[55] = 1; data[56] = -1; data[57] = -1; data[64] = -1;
    data[65] = 1; data[66] = 1; }




      if (boardnum == 373){
    player = 1;
    isLastPass = false;
    data[12] = 1; data[13] = 1; data[14] = 1; data[15] = 1; data[16] = 1;
    data[17] = 1; data[23] = 1; data[24] = 1; data[25] = 1; data[26] = 1;
    data[32] = -1; data[33] = -1; data[34] = 1; data[35] = -1; data[42] = -1;
    data[43] = -1; data[44] = 1; data[45] = -1; data[46] = -1; data[52] = -1;
    data[53] = -1; data[54] = -1; data[55] = 1; data[56] = -1; data[57] = -1;
    data[58] = -1; data[63] = 1; data[64] = -1; data[65] = -1; data[66] = 1;
    data[67] = -1; data[68] = -1; data[74] = -1; data[75] = -1; data[76] = -1;
    data[77] = -1; data[78] = -1; data[83] = -1; data[84] = -1; data[85] = -1;
    data[86] = -1; data[88] = 1; }




      if (boardnum == 374){
    player = -1;
    isLastPass = false;
    data[15] = 1; data[23] = 1; data[25] = 1; data[26] = 1; data[28] = 1;
    data[32] = -1; data[33] = 1; data[34] = -1; data[35] = 1; data[36] = 1;
    data[37] = 1; data[38] = 1; data[42] = -1; data[43] = 1; data[44] = 1;
    data[45] = -1; data[46] = 1; data[47] = -1; data[48] = 1; data[51] = -1;
    data[52] = -1; data[53] = 1; data[54] = -1; data[55] = -1; data[56] = -1;
    data[57] = -1; data[58] = 1; data[62] = 1; data[63] = 1; data[64] = 1;
    data[65] = 1; data[66] = -1; data[67] = -1; data[68] = 1; data[73] = 1;
    data[74] = 1; data[75] = 1; data[76] = -1; data[77] = -1; data[84] = 1;
    data[85] = 1; data[86] = 1; data[87] = 1; }




      if (boardnum == 375){
    player = -1;
    isLastPass = false;
    data[11] = -1; data[12] = -1; data[13] = -1; data[22] = 1; data[23] = 1;
    data[24] = 1; data[25] = 1; data[32] = 1; data[33] = 1; data[34] = 1;
    data[35] = 1; data[36] = 1; data[42] = -1; data[43] = -1; data[44] = 1;
    data[45] = 1; data[46] = 1; data[51] = -1; data[52] = 1; data[53] = -1;
    data[54] = 1; data[55] = 1; data[56] = 1; data[57] = 1; data[61] = 1;
    data[62] = 1; data[63] = 1; data[64] = 1; data[65] = 1; data[66] = 1;
    data[67] = 1; data[71] = 1; data[72] = 1; data[73] = 1; data[74] = 1;
    data[75] = 1; data[76] = 1; data[81] = 1; data[82] = 1; data[83] = 1;
    data[84] = 1; }




      if (boardnum == 376){
    player = 1;
    isLastPass = false;
    data[11] = 1; data[12] = 1; data[13] = 1; data[14] = 1; data[15] = 1;
    data[16] = 1; data[17] = 1; data[21] = -1; data[22] = -1; data[23] = -1;
    data[24] = -1; data[25] = -1; data[32] = -1; data[33] = 1; data[34] = 1;
    data[35] = 1; data[36] = -1; data[37] = -1; data[43] = -1; data[44] = 1;
    data[45] = 1; data[46] = -1; data[52] = -1; data[54] = -1; data[55] = -1;
    data[56] = -1; data[65] = -1; }




      if (boardnum == 377){
    player = -1;
    isLastPass = false;
    data[11] = 1; data[12] = 1; data[13] = 1; data[14] = 1; data[15] = 1;
    data[16] = 1; data[17] = 1; data[22] = 1; data[23] = 1; data[24] = -1;
    data[25] = 1; data[26] = 1; data[32] = 1; data[33] = 1; data[34] = -1;
    data[35] = 1; data[36] = 1; data[37] = 1; data[38] = 1; data[42] = 1;
    data[43] = 1; data[44] = -1; data[45] = 1; data[46] = 1; data[47] = 1;
    data[48] = 1; data[52] = 1; data[53] = 1; data[54] = -1; data[55] = -1;
    data[56] = 1; data[57] = 1; data[58] = 1; data[62] = 1; data[63] = 1;
    data[64] = -1; data[65] = -1; data[66] = 1; data[67] = 1; data[73] = 1;
    data[74] = -1; data[76] = 1; data[84] = -1; }




      if (boardnum == 378){
    player = 1;
    isLastPass = false;
    data[15] = 1; data[25] = 1; data[31] = 1; data[32] = -1; data[35] = 1;
    data[36] = -1; data[42] = -1; data[44] = -1; data[45] = 1; data[46] = -1;
    data[48] = -1; data[52] = -1; data[53] = 1; data[54] = -1; data[55] = 1;
    data[56] = 1; data[57] = -1; data[58] = 1; data[61] = 1; data[62] = 1;
    data[63] = 1; data[64] = 1; data[65] = 1; data[66] = -1; data[67] = -1;
    data[74] = -1; data[75] = -1; data[76] = -1; data[77] = -1; data[84] = -1;
    data[85] = -1; data[86] = 1; data[87] = 1; data[88] = 1; }




      if (boardnum == 379){
    player = 1;
    isLastPass = false;
    data[31] = -1; data[32] = -1; data[33] = -1; data[34] = -1; data[35] = -1;
    data[41] = -1; data[42] = -1; data[43] = -1; data[44] = -1; data[45] = -1;
    data[46] = 1; data[52] = -1; data[53] = -1; data[54] = 1; data[55] = 1;
    data[56] = 1; data[62] = -1; data[63] = -1; data[64] = 1; data[65] = 1;
    data[66] = 1; data[71] = -1; data[73] = 1; data[74] = 1; data[83] = 1;
    data[84] = 1; }




      if (boardnum == 380){
    player = -1;
    isLastPass = false;
    data[21] = -1; data[32] = -1; data[33] = -1; data[34] = -1; data[35] = -1;
    data[36] = -1; data[37] = -1; data[43] = -1; data[44] = -1; data[45] = -1;
    data[46] = -1; data[47] = -1; data[48] = -1; data[51] = -1; data[52] = -1;
    data[53] = -1; data[54] = -1; data[55] = 1; data[56] = -1; data[57] = -1;
    data[62] = -1; data[63] = -1; data[64] = -1; data[65] = 1; data[66] = -1;
    data[67] = -1; data[73] = -1; data[74] = 1; data[75] = -1; data[76] = -1;
    data[78] = -1; data[83] = 1; data[84] = -1; data[85] = -1; data[86] = -1;
    }




      if (boardnum == 381){
    player = 1;
    isLastPass = false;
    data[11] = -1; data[12] = -1; data[13] = -1; data[14] = -1; data[15] = -1;
    data[16] = -1; data[17] = -1; data[18] = 1; data[22] = -1; data[23] = -1;
    data[24] = -1; data[25] = -1; data[26] = -1; data[27] = -1; data[28] = 1;
    data[31] = -1; data[32] = -1; data[33] = 1; data[34] = -1; data[35] = -1;
    data[36] = 1; data[38] = 1; data[41] = -1; data[42] = -1; data[43] = -1;
    data[44] = -1; data[45] = -1; data[46] = 1; data[47] = 1; data[48] = 1;
    data[51] = 1; data[52] = 1; data[53] = 1; data[54] = 1; data[55] = 1;
    data[56] = -1; data[65] = 1; data[66] = 1; data[67] = -1; data[74] = 1;
    data[75] = 1; data[76] = 1; }




      if (boardnum == 382){
    player = 1;
    isLastPass = false;
    data[13] = -1; data[14] = 1; data[17] = -1; data[23] = -1; data[24] = 1;
    data[25] = 1; data[26] = 1; data[27] = 1; data[33] = -1; data[34] = 1;
    data[35] = -1; data[36] = 1; data[37] = -1; data[38] = -1; data[43] = -1;
    data[44] = -1; data[45] = 1; data[46] = 1; data[47] = -1; data[48] = -1;
    data[52] = 1; data[53] = -1; data[54] = 1; data[55] = 1; data[56] = 1;
    data[57] = -1; data[61] = 1; data[62] = 1; data[63] = -1; data[64] = -1;
    data[65] = 1; data[66] = -1; data[67] = -1; data[73] = -1; data[74] = -1;
    data[75] = -1; data[76] = 1; data[77] = -1; data[83] = -1; data[84] = -1;
    data[85] = 1; data[86] = 1; }




      if (boardnum == 383){
    player = 1;
    isLastPass = false;
    data[14] = -1; data[16] = 1; data[23] = -1; data[24] = -1; data[25] = -1;
    data[26] = -1; data[27] = -1; data[33] = -1; data[34] = 1; data[35] = 1;
    data[36] = -1; data[37] = -1; data[38] = -1; data[42] = -1; data[43] = -1;
    data[44] = 1; data[45] = -1; data[46] = 1; data[47] = -1; data[51] = -1;
    data[53] = -1; data[54] = -1; data[55] = -1; data[56] = -1; data[57] = -1;
    data[58] = -1; data[64] = -1; data[65] = -1; data[66] = 1; data[67] = -1;
    data[76] = 1; data[77] = -1; }




      if (boardnum == 384){
    player = 1;
    isLastPass = false;
    data[13] = -1; data[14] = 1; data[17] = -1; data[23] = -1; data[24] = 1;
    data[25] = 1; data[26] = -1; data[33] = -1; data[34] = -1; data[35] = -1;
    data[36] = -1; data[37] = -1; data[38] = -1; data[43] = -1; data[44] = -1;
    data[45] = -1; data[46] = 1; data[47] = -1; data[48] = -1; data[53] = -1;
    data[54] = 1; data[55] = -1; data[56] = 1; data[57] = -1; data[61] = 1;
    data[62] = 1; data[63] = 1; data[64] = 1; data[65] = 1; data[66] = -1;
    data[67] = -1; data[73] = 1; data[74] = 1; data[75] = 1; data[76] = 1;
    data[77] = -1; data[85] = 1; data[86] = 1; }




      if (boardnum == 385){
    player = -1;
    isLastPass = false;
    data[25] = 1; data[34] = 1; data[35] = 1; data[36] = 1; data[44] = -1;
    data[45] = 1; data[46] = 1; data[52] = 1; data[53] = 1; data[54] = 1;
    data[55] = 1; data[56] = 1; data[63] = -1; data[64] = -1; data[73] = -1;
    }




      if (boardnum == 386){
    player = -1;
    isLastPass = false;
    data[25] = 1; data[34] = 1; data[35] = 1; data[44] = -1; data[45] = -1;
    data[46] = -1; data[52] = 1; data[53] = 1; data[54] = -1; data[55] = -1;
    data[56] = 1; data[64] = 1; data[65] = 1; data[75] = 1; data[76] = 1;
    }




      if (boardnum == 387){
    player = 1;
    isLastPass = false;
    data[34] = 1; data[35] = 1; data[42] = 1; data[43] = 1; data[44] = 1;
    data[45] = 1; data[46] = 1; data[47] = 1; data[48] = -1; data[53] = 1;
    data[54] = -1; data[55] = -1; data[56] = -1; data[57] = -1; data[58] = -1;
    data[62] = 1; data[63] = 1; data[64] = -1; data[65] = -1; data[66] = -1;
    data[67] = 1; data[77] = 1; }




      if (boardnum == 388){
    player = 1;
    isLastPass = false;
    data[25] = 1; data[26] = 1; data[33] = -1; data[34] = -1; data[35] = 1;
    data[36] = -1; data[43] = -1; data[44] = 1; data[45] = -1; data[46] = -1;
    data[52] = -1; data[53] = 1; data[54] = -1; data[55] = -1; data[56] = -1;
    data[62] = -1; data[63] = -1; data[64] = -1; data[65] = 1; data[73] = -1;
    }




      if (boardnum == 389){
    player = 1;
    isLastPass = false;
    data[33] = 1; data[34] = -1; data[35] = -1; data[37] = 1; data[44] = -1;
    data[45] = -1; data[46] = 1; data[54] = -1; data[55] = -1; data[56] = 1;
    data[57] = 1; data[63] = -1; data[64] = -1; data[65] = -1; data[66] = -1;
    data[67] = 1; data[73] = 1; data[74] = 1; data[75] = 1; data[76] = 1;
    data[77] = -1; data[88] = -1; }




      if (boardnum == 390){
    player = 1;
    isLastPass = false;
    data[33] = -1; data[34] = -1; data[35] = -1; data[43] = 1; data[44] = -1;
    data[45] = -1; data[52] = 1; data[53] = 1; data[54] = -1; data[55] = -1;
    data[56] = 1; data[63] = -1; data[64] = -1; data[65] = 1; data[66] = 1;
    data[74] = -1; }




      if (boardnum == 391){
    player = -1;
    isLastPass = false;
    data[23] = 1; data[24] = -1; data[26] = 1; data[33] = 1; data[34] = -1;
    data[36] = 1; data[44] = -1; data[45] = -1; data[46] = 1; data[54] = -1;
    data[55] = 1; data[56] = 1; data[63] = 1; data[64] = 1; data[65] = 1;
    }




      if (boardnum == 392){
    player = 1;
    isLastPass = false;
    data[13] = 1; data[16] = 1; data[17] = -1; data[18] = -1; data[24] = 1;
    data[25] = 1; data[26] = -1; data[27] = -1; data[33] = 1; data[34] = -1;
    data[35] = -1; data[36] = -1; data[37] = 1; data[43] = 1; data[44] = -1;
    data[45] = -1; data[46] = 1; data[47] = 1; data[53] = 1; data[54] = -1;
    data[55] = 1; data[56] = 1; data[57] = 1; data[63] = 1; data[64] = 1;
    data[65] = 1; data[66] = 1; data[67] = 1; data[73] = 1; data[74] = 1;
    data[75] = 1; data[76] = 1; data[82] = 1; data[83] = 1; }




      if (boardnum == 393){
    player = 1;
    isLastPass = false;
    data[12] = 1; data[13] = 1; data[14] = 1; data[21] = -1; data[22] = 1;
    data[23] = 1; data[25] = -1; data[32] = -1; data[33] = 1; data[34] = -1;
    data[35] = -1; data[37] = -1; data[43] = -1; data[44] = 1; data[45] = -1;
    data[46] = -1; data[52] = -1; data[53] = -1; data[54] = -1; data[55] = -1;
    data[56] = -1; data[57] = -1; data[62] = 1; data[63] = -1; data[64] = -1;
    data[65] = -1; data[73] = -1; data[74] = -1; data[75] = -1; data[76] = -1;
    data[84] = 1; data[87] = -1; }




      if (boardnum == 394){
    player = 1;
    isLastPass = false;
    data[14] = 1; data[22] = 1; data[23] = 1; data[24] = 1; data[25] = -1;
    data[32] = 1; data[33] = 1; data[34] = -1; data[35] = -1; data[36] = 1;
    data[38] = 1; data[42] = -1; data[43] = -1; data[44] = 1; data[45] = -1;
    data[46] = -1; data[47] = 1; data[52] = -1; data[53] = -1; data[54] = 1;
    data[55] = -1; data[56] = 1; data[61] = -1; data[63] = 1; data[64] = -1;
    data[65] = -1; data[75] = -1; data[76] = 1; }




      if (boardnum == 395){
    player = 1;
    isLastPass = false;
    data[13] = -1; data[14] = -1; data[15] = -1; data[16] = -1; data[17] = -1;
    data[18] = -1; data[23] = -1; data[24] = -1; data[25] = -1; data[26] = -1;
    data[27] = -1; data[28] = -1; data[33] = 1; data[34] = -1; data[35] = -1;
    data[36] = -1; data[37] = -1; data[38] = -1; data[44] = 1; data[45] = -1;
    data[46] = 1; data[47] = 1; data[48] = 1; data[53] = 1; data[54] = 1;
    data[55] = 1; data[56] = 1; data[57] = 1; data[58] = 1; data[62] = 1;
    data[63] = 1; data[64] = 1; data[65] = 1; data[66] = 1; data[67] = 1;
    data[68] = 1; }




      if (boardnum == 396){
    player = -1;
    isLastPass = false;
    data[14] = -1; data[16] = 1; data[23] = -1; data[24] = -1; data[25] = -1;
    data[26] = -1; data[27] = -1; data[33] = -1; data[34] = 1; data[35] = 1;
    data[36] = -1; data[37] = -1; data[38] = -1; data[42] = -1; data[43] = -1;
    data[44] = 1; data[45] = -1; data[46] = 1; data[47] = -1; data[51] = -1;
    data[53] = -1; data[54] = -1; data[55] = -1; data[56] = 1; data[57] = 1;
    data[64] = -1; data[65] = -1; data[66] = 1; data[67] = -1; }




      if (boardnum == 397){
    player = -1;
    isLastPass = false;
    data[23] = -1; data[24] = 1; data[25] = 1; data[34] = 1; data[35] = 1;
    data[43] = -1; data[44] = -1; data[45] = -1; data[46] = 1; data[52] = 1;
    data[53] = 1; data[54] = 1; data[55] = -1; data[56] = 1; data[57] = 1;
    data[64] = 1; data[65] = 1; data[75] = 1; data[76] = 1; }




      if (boardnum == 398){
    player = 1;
    isLastPass = false;
    data[12] = 1; data[23] = 1; data[33] = -1; data[34] = -1; data[35] = -1;
    data[36] = -1; data[44] = 1; data[45] = 1; data[46] = 1; data[47] = 1;
    data[54] = -1; data[55] = 1; data[56] = 1; data[63] = -1; data[65] = 1;
    data[66] = 1; }




      if (boardnum == 399){
    player = -1;
    isLastPass = false;
    data[14] = -1; data[15] = -1; data[16] = -1; data[25] = 1; data[26] = 1;
    data[32] = -1; data[33] = -1; data[34] = -1; data[35] = 1; data[36] = 1;
    data[37] = 1; data[43] = -1; data[44] = 1; data[45] = -1; data[46] = 1;
    data[47] = 1; data[48] = 1; data[53] = -1; data[54] = -1; data[55] = 1;
    data[56] = 1; data[63] = -1; data[64] = 1; data[66] = 1; data[67] = -1;
    }




      if (boardnum == 400){
    player = 1;
    isLastPass = false;
    data[32] = -1; data[36] = -1; data[37] = -1; data[38] = -1; data[43] = -1;
    data[44] = 1; data[45] = 1; data[46] = 1; data[47] = -1; data[48] = -1;
    data[53] = -1; data[54] = -1; data[55] = -1; data[56] = -1; data[57] = 1;
    data[58] = -1; data[63] = -1; data[64] = 1; data[65] = 1; data[66] = 1;
    data[67] = 1; data[68] = 1; data[73] = 1; data[74] = 1; data[75] = 1;
    data[76] = -1; data[84] = 1; data[85] = 1; data[86] = 1; data[87] = 1;
    }


  }
}
