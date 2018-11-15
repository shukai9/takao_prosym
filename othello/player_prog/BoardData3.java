import java.util.*;
import java.util.Scanner;

public class BoardData3 {
  final static int SIZE = 100;
  int data[] = new int[SIZE];
  int player;
  boolean isLastPass;

  public BoardData3(int boardnum){
      if (boardnum == 401){
    player = -1;
    isLastPass = false;
    data[23] = 1; data[24] = -1; data[32] = -1; data[33] = -1; data[34] = -1;
    data[35] = -1; data[42] = 1; data[43] = 1; data[44] = 1; data[45] = 1;
    data[46] = 1; data[53] = 1; data[54] = -1; data[55] = 1; data[56] = 1;
    data[63] = -1; data[64] = 1; }




      if (boardnum == 402){
    player = -1;
    isLastPass = false;
    data[26] = -1; data[34] = 1; data[35] = -1; data[44] = 1; data[45] = 1;
    data[46] = -1; data[54] = 1; data[55] = -1; data[56] = 1; data[57] = -1;
    data[65] = 1; data[66] = -1; data[68] = -1; data[74] = 1; data[75] = -1;
    data[76] = -1; data[86] = -1; }




      if (boardnum == 403){
    player = -1;
    isLastPass = false;
    data[13] = -1; data[15] = 1; data[16] = -1; data[21] = 1; data[24] = -1;
    data[25] = 1; data[26] = -1; data[31] = 1; data[32] = 1; data[33] = 1;
    data[34] = 1; data[35] = -1; data[36] = -1; data[37] = -1; data[38] = -1;
    data[41] = 1; data[42] = -1; data[43] = 1; data[44] = 1; data[45] = -1;
    data[46] = -1; data[47] = 1; data[51] = 1; data[53] = 1; data[54] = 1;
    data[55] = 1; data[56] = -1; data[57] = 1; data[63] = 1; data[64] = 1;
    data[65] = 1; data[66] = 1; data[67] = 1; data[73] = 1; data[74] = 1;
    data[75] = 1; data[76] = 1; data[83] = 1; data[85] = 1; }




      if (boardnum == 404){
    player = 1;
    isLastPass = false;
    data[13] = 1; data[14] = -1; data[15] = -1; data[16] = -1; data[17] = -1;
    data[18] = -1; data[24] = 1; data[25] = -1; data[26] = 1; data[27] = 1;
    data[31] = -1; data[32] = -1; data[33] = -1; data[34] = -1; data[35] = -1;
    data[36] = -1; data[37] = -1; data[42] = 1; data[43] = 1; data[44] = -1;
    data[45] = 1; data[47] = -1; data[52] = 1; data[53] = 1; data[54] = 1;
    data[55] = 1; data[56] = -1; data[63] = 1; data[64] = -1; data[65] = -1;
    data[66] = -1; data[67] = -1; data[68] = -1; data[74] = 1; }




      if (boardnum == 405){
    player = 1;
    isLastPass = false;
    data[12] = -1; data[13] = -1; data[14] = -1; data[15] = -1; data[23] = -1;
    data[24] = 1; data[25] = -1; data[26] = -1; data[33] = -1; data[34] = -1;
    data[35] = -1; data[36] = -1; data[37] = -1; data[38] = 1; data[43] = -1;
    data[44] = 1; data[45] = -1; data[46] = 1; data[47] = -1; data[48] = 1;
    data[52] = -1; data[53] = 1; data[54] = 1; data[55] = 1; data[56] = -1;
    data[57] = -1; data[58] = 1; data[62] = 1; data[63] = 1; data[64] = 1;
    data[65] = 1; data[66] = 1; data[67] = -1; data[68] = 1; }




      if (boardnum == 406){
    player = -1;
    isLastPass = false;
    data[15] = -1; data[25] = -1; data[27] = -1; data[28] = 1; data[32] = -1;
    data[33] = -1; data[34] = -1; data[35] = -1; data[36] = -1; data[37] = 1;
    data[38] = 1; data[42] = -1; data[43] = -1; data[44] = -1; data[45] = -1;
    data[46] = 1; data[47] = 1; data[48] = 1; data[51] = -1; data[52] = -1;
    data[53] = -1; data[54] = -1; data[55] = -1; data[56] = 1; data[57] = 1;
    data[58] = 1; data[62] = -1; data[64] = -1; data[65] = -1; data[66] = 1;
    data[67] = 1; data[68] = 1; data[73] = -1; data[77] = 1; data[78] = 1;
    data[86] = 1; data[87] = 1; data[88] = 1; }




      if (boardnum == 407){
    player = -1;
    isLastPass = false;
    data[14] = -1; data[15] = -1; data[16] = -1; data[21] = 1; data[23] = -1;
    data[24] = -1; data[25] = -1; data[26] = -1; data[32] = 1; data[33] = 1;
    data[34] = 1; data[35] = -1; data[36] = -1; data[37] = -1; data[42] = 1;
    data[43] = 1; data[44] = -1; data[45] = -1; data[46] = -1; data[47] = -1;
    data[51] = 1; data[52] = 1; data[53] = 1; data[54] = 1; data[55] = 1;
    data[56] = 1; data[61] = -1; data[62] = 1; data[63] = 1; data[64] = 1;
    data[65] = 1; data[73] = 1; data[74] = 1; }




      if (boardnum == 408){
    player = 1;
    isLastPass = false;
    data[33] = -1; data[34] = 1; data[35] = 1; data[42] = -1; data[43] = -1;
    data[44] = 1; data[45] = 1; data[52] = -1; data[53] = 1; data[54] = 1;
    data[55] = -1; data[56] = 1; data[61] = -1; data[63] = -1; data[64] = -1;
    data[65] = -1; data[66] = -1; data[74] = -1; }




      if (boardnum == 409){
    player = -1;
    isLastPass = false;
    data[11] = 1; data[12] = 1; data[13] = 1; data[14] = 1; data[15] = 1;
    data[16] = 1; data[17] = 1; data[21] = 1; data[22] = 1; data[23] = 1;
    data[24] = 1; data[25] = 1; data[26] = 1; data[27] = -1; data[31] = 1;
    data[32] = 1; data[33] = -1; data[34] = 1; data[35] = 1; data[36] = -1;
    data[37] = 1; data[41] = 1; data[42] = 1; data[43] = 1; data[44] = 1;
    data[45] = -1; data[46] = 1; data[47] = 1; data[48] = 1; data[51] = 1;
    data[52] = 1; data[53] = 1; data[54] = -1; data[55] = -1; data[56] = -1;
    data[61] = 1; data[62] = 1; data[63] = -1; data[65] = -1; }




      if (boardnum == 410){
    player = 1;
    isLastPass = false;
    data[13] = 1; data[14] = 1; data[15] = 1; data[16] = 1; data[17] = 1;
    data[18] = 1; data[23] = 1; data[24] = -1; data[25] = -1; data[26] = -1;
    data[33] = 1; data[34] = -1; data[35] = -1; data[36] = 1; data[38] = -1;
    data[43] = 1; data[44] = 1; data[45] = 1; data[46] = 1; data[47] = -1;
    data[54] = 1; data[55] = -1; data[56] = -1; data[57] = -1; }




      if (boardnum == 411){
    player = 1;
    isLastPass = false;
    data[13] = -1; data[14] = -1; data[15] = -1; data[16] = -1; data[17] = -1;
    data[22] = 1; data[24] = -1; data[25] = 1; data[26] = -1; data[32] = -1;
    data[33] = -1; data[34] = -1; data[35] = -1; data[36] = 1; data[43] = -1;
    data[44] = 1; data[45] = 1; data[46] = 1; data[47] = 1; data[53] = -1;
    data[54] = -1; data[55] = 1; data[56] = 1; data[63] = -1; data[64] = -1;
    data[65] = -1; }




      if (boardnum == 412){
    player = -1;
    isLastPass = false;
    data[33] = -1; data[34] = -1; data[35] = -1; data[36] = 1; data[38] = 1;
    data[44] = -1; data[45] = -1; data[46] = -1; data[47] = 1; data[52] = 1;
    data[53] = 1; data[54] = 1; data[55] = 1; data[56] = 1; data[63] = 1;
    }




      if (boardnum == 413){
    player = -1;
    isLastPass = false;
    data[24] = -1; data[25] = 1; data[31] = 1; data[33] = -1; data[34] = 1;
    data[35] = 1; data[41] = 1; data[42] = -1; data[43] = 1; data[44] = -1;
    data[45] = 1; data[51] = 1; data[52] = 1; data[53] = -1; data[54] = -1;
    data[55] = 1; data[56] = 1; data[57] = 1; data[61] = 1; data[62] = 1;
    data[63] = -1; data[64] = -1; data[65] = 1; data[66] = 1; data[71] = 1;
    data[73] = -1; data[74] = -1; data[75] = -1; data[83] = 1; data[84] = -1;
    data[86] = -1; }




      if (boardnum == 414){
    player = -1;
    isLastPass = false;
    data[33] = -1; data[34] = -1; data[35] = -1; data[36] = -1; data[37] = -1;
    data[43] = 1; data[44] = -1; data[45] = 1; data[46] = -1; data[54] = 1;
    data[55] = -1; data[56] = 1; data[57] = -1; data[63] = 1; data[64] = -1;
    }




      if (boardnum == 415){
    player = -1;
    isLastPass = false;
    data[13] = -1; data[21] = 1; data[23] = -1; data[24] = 1; data[26] = 1;
    data[31] = -1; data[32] = 1; data[33] = -1; data[34] = 1; data[35] = 1;
    data[36] = 1; data[41] = -1; data[42] = -1; data[43] = 1; data[44] = 1;
    data[45] = -1; data[46] = 1; data[51] = -1; data[52] = -1; data[53] = -1;
    data[54] = 1; data[55] = 1; data[56] = 1; data[62] = -1; data[63] = -1;
    data[64] = 1; data[65] = 1; data[73] = -1; data[74] = 1; data[82] = -1;
    data[83] = -1; data[84] = -1; data[85] = -1; }




      if (boardnum == 416){
    player = -1;
    isLastPass = false;
    data[33] = 1; data[34] = 1; data[35] = 1; data[36] = 1; data[37] = 1;
    data[42] = 1; data[43] = 1; data[44] = -1; data[45] = -1; data[46] = 1;
    data[53] = 1; data[54] = -1; data[55] = -1; data[56] = 1; data[64] = 1;
    data[65] = -1; data[66] = 1; data[74] = 1; data[75] = 1; data[76] = 1;
    data[86] = 1; }




      if (boardnum == 417){
    player = 1;
    isLastPass = false;
    data[11] = 1; data[14] = 1; data[15] = 1; data[16] = -1; data[22] = 1;
    data[23] = -1; data[24] = -1; data[25] = -1; data[26] = -1; data[27] = -1;
    data[31] = 1; data[32] = 1; data[33] = 1; data[34] = -1; data[35] = 1;
    data[36] = -1; data[37] = 1; data[38] = 1; data[42] = -1; data[44] = -1;
    data[45] = -1; data[46] = 1; data[53] = -1; data[54] = -1; data[55] = 1;
    data[56] = -1; data[57] = 1; data[63] = -1; data[64] = -1; data[65] = -1;
    data[66] = -1; data[73] = 1; data[75] = -1; data[76] = -1; data[82] = 1;
    data[86] = -1; }




      if (boardnum == 418){
    player = 1;
    isLastPass = false;
    data[13] = 1; data[14] = 1; data[15] = -1; data[17] = -1; data[18] = -1;
    data[24] = 1; data[25] = -1; data[26] = -1; data[27] = -1; data[31] = 1;
    data[32] = 1; data[33] = 1; data[34] = 1; data[35] = -1; data[36] = 1;
    data[37] = 1; data[38] = 1; data[42] = 1; data[43] = 1; data[44] = -1;
    data[45] = 1; data[46] = 1; data[53] = 1; data[54] = 1; data[55] = 1;
    data[56] = 1; data[62] = 1; data[64] = 1; }




      if (boardnum == 419){
    player = -1;
    isLastPass = false;
    data[25] = 1; data[26] = -1; data[32] = -1; data[33] = 1; data[34] = 1;
    data[35] = 1; data[42] = -1; data[43] = -1; data[44] = 1; data[45] = -1;
    data[46] = -1; data[52] = -1; data[53] = -1; data[54] = -1; data[55] = 1;
    data[56] = -1; data[57] = -1; data[58] = -1; data[63] = 1; data[64] = -1;
    data[65] = 1; data[66] = 1; data[67] = -1; data[68] = 1; data[74] = 1;
    data[75] = -1; data[76] = -1; data[77] = 1; data[84] = 1; data[86] = -1;
    data[88] = 1; }




      if (boardnum == 420){
    player = -1;
    isLastPass = false;
    data[14] = -1; data[16] = 1; data[23] = -1; data[24] = -1; data[25] = -1;
    data[26] = -1; data[27] = -1; data[33] = -1; data[34] = 1; data[35] = 1;
    data[36] = -1; data[37] = -1; data[38] = -1; data[42] = -1; data[43] = -1;
    data[44] = 1; data[45] = -1; data[46] = 1; data[47] = -1; data[51] = -1;
    data[53] = -1; data[54] = -1; data[55] = 1; data[56] = 1; data[65] = -1;
    data[66] = 1; data[67] = -1; }




      if (boardnum == 421){
    player = -1;
    isLastPass = false;
    data[25] = 1; data[34] = 1; data[35] = 1; data[36] = 1; data[43] = 1;
    data[44] = -1; data[45] = 1; data[46] = -1; data[47] = -1; data[53] = 1;
    data[54] = 1; data[55] = 1; data[56] = -1; data[57] = -1; data[63] = 1;
    data[64] = 1; data[65] = 1; data[67] = 1; data[74] = -1; data[75] = 1;
    data[76] = 1; }




      if (boardnum == 422){
    player = 1;
    isLastPass = false;
    data[13] = -1; data[23] = -1; data[24] = -1; data[25] = -1; data[27] = -1;
    data[32] = -1; data[33] = -1; data[34] = 1; data[35] = -1; data[36] = -1;
    data[37] = -1; data[43] = -1; data[44] = 1; data[45] = -1; data[46] = 1;
    data[47] = -1; data[48] = 1; data[53] = -1; data[54] = -1; data[55] = -1;
    data[56] = -1; data[57] = -1; data[58] = 1; data[67] = -1; }




      if (boardnum == 423){
    player = -1;
    isLastPass = false;
    data[32] = 1; data[33] = 1; data[34] = 1; data[35] = 1; data[43] = 1;
    data[44] = -1; data[45] = 1; data[46] = -1; data[53] = -1; data[54] = 1;
    data[55] = -1; data[56] = -1; data[64] = 1; data[65] = 1; data[66] = -1;
    }




      if (boardnum == 424){
    player = 1;
    isLastPass = false;
    data[13] = -1; data[14] = 1; data[16] = -1; data[23] = -1; data[24] = 1;
    data[25] = -1; data[26] = 1; data[32] = -1; data[33] = -1; data[34] = -1;
    data[35] = 1; data[36] = 1; data[43] = -1; data[44] = 1; data[45] = 1;
    data[46] = 1; data[53] = -1; data[54] = 1; data[55] = 1; data[63] = -1;
    data[64] = 1; data[65] = -1; data[66] = -1; data[73] = -1; data[75] = 1;
    data[76] = -1; }




      if (boardnum == 425){
    player = -1;
    isLastPass = false;
    data[13] = -1; data[21] = -1; data[23] = 1; data[24] = 1; data[25] = 1;
    data[26] = 1; data[32] = -1; data[33] = 1; data[34] = 1; data[35] = -1;
    data[36] = -1; data[42] = 1; data[43] = 1; data[44] = 1; data[45] = -1;
    data[46] = -1; data[52] = -1; data[53] = 1; data[54] = -1; data[55] = -1;
    data[56] = -1; data[62] = -1; data[63] = -1; data[64] = 1; data[65] = -1;
    data[73] = -1; data[74] = -1; data[76] = -1; data[83] = -1; }




      if (boardnum == 426){
    player = 1;
    isLastPass = false;
    data[14] = 1; data[24] = 1; data[26] = 1; data[33] = 1; data[34] = 1;
    data[35] = 1; data[36] = 1; data[42] = 1; data[43] = -1; data[44] = -1;
    data[45] = 1; data[46] = 1; data[51] = 1; data[52] = 1; data[53] = -1;
    data[54] = -1; data[55] = -1; data[56] = 1; data[62] = 1; data[63] = -1;
    data[64] = -1; data[66] = -1; data[73] = -1; data[75] = 1; }




      if (boardnum == 427){
    player = -1;
    isLastPass = false;
    data[14] = 1; data[24] = 1; data[26] = 1; data[33] = -1; data[34] = 1;
    data[35] = 1; data[36] = 1; data[44] = 1; data[45] = 1; data[46] = 1;
    data[53] = 1; data[54] = 1; data[55] = 1; data[56] = 1; data[62] = 1;
    }




      if (boardnum == 428){
    player = -1;
    isLastPass = false;
    data[24] = 1; data[26] = 1; data[31] = -1; data[33] = -1; data[34] = -1;
    data[35] = 1; data[36] = 1; data[41] = -1; data[42] = -1; data[43] = 1;
    data[44] = -1; data[45] = -1; data[46] = 1; data[51] = -1; data[52] = -1;
    data[53] = -1; data[54] = -1; data[55] = 1; data[56] = 1; data[62] = -1;
    data[63] = -1; data[64] = -1; data[65] = 1; data[73] = 1; data[74] = -1;
    data[83] = 1; data[85] = -1; }




      if (boardnum == 429){
    player = -1;
    isLastPass = false;
    data[33] = -1; data[34] = -1; data[35] = -1; data[42] = 1; data[43] = 1;
    data[44] = -1; data[45] = 1; data[46] = 1; data[52] = -1; data[53] = -1;
    data[54] = 1; data[55] = 1; data[56] = 1; data[62] = -1; data[63] = -1;
    data[64] = 1; data[65] = 1; }




      if (boardnum == 430){
    player = 1;
    isLastPass = false;
    data[31] = 1; data[32] = 1; data[33] = 1; data[34] = 1; data[35] = 1;
    data[36] = 1; data[37] = 1; data[38] = 1; data[41] = 1; data[42] = 1;
    data[43] = 1; data[44] = 1; data[45] = 1; data[46] = -1; data[48] = -1;
    data[51] = -1; data[52] = 1; data[53] = -1; data[54] = 1; data[55] = -1;
    data[56] = -1; data[57] = -1; data[58] = -1; data[61] = -1; data[62] = -1;
    data[63] = -1; data[64] = -1; data[65] = -1; data[66] = -1; data[67] = -1;
    data[68] = -1; data[73] = -1; data[74] = -1; data[75] = 1; data[76] = 1;
    data[77] = -1; data[83] = -1; data[84] = -1; data[85] = -1; data[86] = -1;
    data[87] = -1; data[88] = -1; }




      if (boardnum == 431){
    player = -1;
    isLastPass = false;
    data[14] = -1; data[16] = 1; data[23] = -1; data[24] = 1; data[25] = 1;
    data[33] = -1; data[34] = 1; data[35] = 1; data[36] = -1; data[37] = -1;
    data[38] = -1; data[42] = 1; data[43] = -1; data[44] = 1; data[45] = -1;
    data[46] = 1; data[47] = -1; data[53] = -1; data[54] = -1; data[55] = -1;
    data[56] = -1; data[65] = -1; data[67] = -1; }




      if (boardnum == 432){
    player = -1;
    isLastPass = false;
    data[33] = -1; data[34] = -1; data[35] = -1; data[36] = 1; data[37] = -1;
    data[43] = 1; data[44] = 1; data[45] = 1; data[46] = 1; data[47] = 1;
    data[53] = -1; data[54] = -1; data[55] = -1; data[56] = 1; data[65] = -1;
    }




      if (boardnum == 433){
    player = -1;
    isLastPass = false;
    data[24] = -1; data[25] = 1; data[26] = 1; data[33] = -1; data[34] = -1;
    data[35] = -1; data[36] = -1; data[37] = 1; data[38] = -1; data[43] = 1;
    data[44] = 1; data[45] = 1; data[46] = 1; data[47] = -1; data[48] = -1;
    data[54] = 1; data[55] = -1; data[56] = -1; data[57] = 1; data[58] = -1;
    data[66] = -1; data[67] = 1; data[68] = 1; }




      if (boardnum == 434){
    player = 1;
    isLastPass = false;
    data[15] = 1; data[24] = -1; data[25] = 1; data[33] = 1; data[34] = -1;
    data[35] = 1; data[36] = 1; data[37] = 1; data[42] = 1; data[43] = 1;
    data[44] = -1; data[45] = 1; data[46] = 1; data[52] = 1; data[53] = -1;
    data[54] = -1; data[55] = 1; data[56] = 1; data[61] = 1; data[63] = 1;
    data[64] = 1; data[65] = 1; data[66] = 1; data[72] = 1; data[74] = 1;
    data[75] = 1; data[76] = 1; data[83] = -1; data[84] = 1; data[86] = 1;
    }




      if (boardnum == 435){
    player = 1;
    isLastPass = false;
    data[11] = 1; data[13] = -1; data[14] = -1; data[15] = -1; data[16] = -1;
    data[18] = 1; data[21] = -1; data[22] = -1; data[23] = -1; data[24] = -1;
    data[25] = -1; data[26] = -1; data[27] = -1; data[28] = 1; data[31] = 1;
    data[32] = -1; data[33] = 1; data[34] = 1; data[35] = 1; data[36] = -1;
    data[37] = -1; data[38] = 1; data[42] = -1; data[43] = 1; data[44] = 1;
    data[45] = -1; data[46] = -1; data[53] = -1; data[54] = -1; data[55] = -1;
    data[62] = -1; data[63] = -1; data[64] = -1; data[66] = 1; data[73] = -1;
    data[82] = -1; }




      if (boardnum == 436){
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




      if (boardnum == 437){
    player = 1;
    isLastPass = false;
    data[14] = -1; data[16] = 1; data[23] = -1; data[24] = 1; data[25] = 1;
    data[33] = -1; data[34] = 1; data[35] = 1; data[36] = -1; data[37] = -1;
    data[38] = -1; data[42] = -1; data[43] = -1; data[44] = 1; data[45] = -1;
    data[46] = 1; data[47] = -1; data[51] = -1; data[53] = -1; data[54] = -1;
    data[55] = -1; data[56] = -1; data[65] = -1; data[67] = -1; }




      if (boardnum == 438){
    player = -1;
    isLastPass = false;
    data[35] = 1; data[36] = -1; data[42] = -1; data[44] = -1; data[45] = 1;
    data[52] = -1; data[53] = -1; data[54] = -1; data[55] = 1; data[56] = 1;
    data[62] = -1; data[63] = -1; data[64] = 1; data[65] = 1; data[66] = 1;
    data[74] = -1; data[75] = -1; data[76] = 1; data[85] = -1; }




      if (boardnum == 439){
    player = 1;
    isLastPass = false;
    data[24] = -1; data[26] = 1; data[32] = 1; data[33] = 1; data[34] = 1;
    data[35] = -1; data[44] = 1; data[45] = 1; data[46] = -1; data[53] = 1;
    data[54] = 1; data[55] = 1; data[56] = 1; data[62] = 1; data[64] = 1;
    data[74] = 1; }




      if (boardnum == 440){
    player = -1;
    isLastPass = false;
    data[13] = -1; data[14] = -1; data[15] = -1; data[16] = -1; data[22] = 1;
    data[23] = -1; data[24] = -1; data[25] = -1; data[26] = -1; data[32] = -1;
    data[33] = 1; data[34] = -1; data[35] = -1; data[36] = -1; data[37] = -1;
    data[38] = 1; data[41] = -1; data[42] = -1; data[43] = -1; data[44] = 1;
    data[45] = 1; data[46] = -1; data[47] = 1; data[53] = 1; data[54] = 1;
    data[55] = 1; data[56] = 1; data[58] = -1; data[64] = 1; data[65] = 1;
    data[66] = 1; data[67] = 1; data[75] = -1; }




      if (boardnum == 441){
    player = 1;
    isLastPass = false;
    data[11] = -1; data[12] = -1; data[13] = -1; data[14] = -1; data[15] = -1;
    data[16] = -1; data[17] = -1; data[21] = -1; data[22] = -1; data[23] = -1;
    data[24] = -1; data[25] = -1; data[26] = -1; data[31] = -1; data[32] = -1;
    data[33] = -1; data[34] = -1; data[35] = -1; data[36] = 1; data[41] = -1;
    data[42] = -1; data[43] = -1; data[44] = -1; data[45] = -1; data[46] = 1;
    data[51] = -1; data[52] = -1; data[53] = -1; data[54] = 1; data[55] = 1;
    data[56] = -1; data[61] = 1; data[62] = 1; data[63] = 1; data[64] = 1;
    data[65] = 1; data[67] = -1; data[72] = 1; data[73] = 1; data[74] = 1;
    data[82] = -1; data[83] = -1; data[84] = -1; data[85] = -1; }




      if (boardnum == 442){
    player = 1;
    isLastPass = false;
    data[32] = -1; data[42] = 1; data[43] = 1; data[44] = 1; data[45] = 1;
    data[46] = -1; data[53] = -1; data[54] = -1; data[55] = -1; data[56] = -1;
    data[57] = -1; data[64] = -1; data[65] = -1; data[66] = -1; data[67] = 1;
    data[76] = -1; }




      if (boardnum == 443){
    player = 1;
    isLastPass = false;
    data[11] = -1; data[13] = -1; data[14] = -1; data[15] = -1; data[16] = -1;
    data[17] = -1; data[22] = -1; data[24] = -1; data[25] = 1; data[26] = -1;
    data[31] = -1; data[32] = -1; data[33] = -1; data[34] = -1; data[35] = -1;
    data[36] = 1; data[41] = 1; data[42] = -1; data[43] = 1; data[44] = 1;
    data[45] = 1; data[46] = 1; data[47] = 1; data[53] = -1; data[54] = 1;
    data[55] = 1; data[56] = 1; data[62] = 1; data[63] = -1; data[64] = 1;
    data[65] = 1; data[74] = 1; data[75] = 1; data[76] = -1; }




      if (boardnum == 444){
    player = 1;
    isLastPass = false;
    data[12] = -1; data[13] = -1; data[14] = -1; data[15] = -1; data[16] = -1;
    data[17] = -1; data[18] = 1; data[23] = -1; data[24] = -1; data[25] = 1;
    data[26] = 1; data[28] = 1; data[32] = -1; data[33] = -1; data[34] = -1;
    data[35] = -1; data[36] = 1; data[37] = -1; data[38] = 1; data[42] = -1;
    data[43] = -1; data[44] = -1; data[45] = 1; data[46] = -1; data[47] = -1;
    data[48] = 1; data[52] = -1; data[53] = -1; data[54] = -1; data[55] = 1;
    data[56] = -1; data[62] = -1; data[63] = -1; data[64] = -1; data[65] = -1;
    data[67] = -1; data[72] = -1; data[73] = -1; data[74] = -1; data[76] = -1;
    }




      if (boardnum == 445){
    player = -1;
    isLastPass = false;
    data[25] = 1; data[26] = -1; data[32] = -1; data[34] = -1; data[35] = 1;
    data[42] = -1; data[43] = -1; data[44] = -1; data[45] = 1; data[52] = -1;
    data[54] = -1; data[55] = 1; data[56] = 1; data[57] = -1; data[64] = -1;
    data[65] = 1; data[66] = 1; data[67] = 1; data[68] = 1; data[74] = 1;
    data[75] = -1; data[76] = 1; data[77] = -1; data[84] = 1; data[86] = -1;
    }




      if (boardnum == 446){
    player = -1;
    isLastPass = false;
    data[13] = -1; data[14] = 1; data[15] = 1; data[24] = 1; data[25] = 1;
    data[26] = 1; data[32] = 1; data[33] = 1; data[34] = 1; data[35] = 1;
    data[36] = 1; data[37] = 1; data[38] = 1; data[43] = 1; data[44] = -1;
    data[45] = 1; data[46] = -1; data[53] = 1; data[54] = 1; data[55] = -1;
    data[56] = 1; data[62] = 1; data[63] = 1; data[64] = 1; data[66] = -1;
    data[73] = 1; data[74] = 1; }




      if (boardnum == 447){
    player = -1;
    isLastPass = false;
    data[11] = -1; data[21] = 1; data[22] = 1; data[23] = 1; data[26] = 1;
    data[32] = 1; data[33] = -1; data[34] = -1; data[35] = 1; data[36] = -1;
    data[41] = 1; data[44] = 1; data[45] = -1; data[52] = 1; data[54] = -1;
    data[55] = -1; data[56] = 1; data[63] = 1; data[64] = -1; data[65] = -1;
    data[73] = 1; data[74] = 1; data[75] = 1; }




      if (boardnum == 448){
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




      if (boardnum == 449){
    player = 1;
    isLastPass = false;
    data[11] = -1; data[14] = -1; data[15] = -1; data[21] = -1; data[23] = 1;
    data[25] = -1; data[26] = -1; data[31] = -1; data[32] = 1; data[33] = 1;
    data[34] = 1; data[35] = 1; data[36] = -1; data[37] = -1; data[38] = -1;
    data[42] = 1; data[43] = 1; data[44] = 1; data[45] = 1; data[46] = 1;
    data[47] = -1; data[51] = 1; data[53] = 1; data[54] = 1; data[55] = 1;
    data[56] = 1; data[62] = 1; data[63] = 1; data[64] = 1; data[65] = 1;
    data[66] = 1; data[73] = 1; data[74] = 1; data[75] = 1; data[77] = 1;
    data[85] = 1; }




      if (boardnum == 450){
    player = -1;
    isLastPass = false;
    data[13] = -1; data[14] = 1; data[15] = 1; data[23] = -1; data[24] = 1;
    data[25] = 1; data[26] = 1; data[27] = 1; data[32] = -1; data[33] = -1;
    data[34] = -1; data[35] = -1; data[36] = 1; data[37] = -1; data[38] = -1;
    data[42] = -1; data[43] = -1; data[44] = -1; data[45] = -1; data[46] = 1;
    data[47] = -1; data[48] = -1; data[52] = 1; data[53] = 1; data[54] = 1;
    data[55] = -1; data[56] = 1; data[57] = -1; data[63] = 1; data[64] = 1;
    data[65] = -1; data[66] = 1; data[67] = -1; data[73] = -1; data[74] = 1;
    data[75] = 1; data[76] = 1; data[85] = -1; data[86] = 1; }




      if (boardnum == 451){
    player = 1;
    isLastPass = false;
    data[13] = -1; data[14] = -1; data[15] = -1; data[16] = -1; data[18] = -1;
    data[24] = -1; data[25] = -1; data[26] = 1; data[27] = -1; data[28] = -1;
    data[34] = -1; data[35] = -1; data[36] = -1; data[37] = -1; data[44] = 1;
    data[45] = 1; data[46] = -1; data[47] = -1; data[53] = 1; data[54] = 1;
    data[55] = 1; data[56] = -1; data[57] = -1; data[58] = -1; data[62] = 1;
    data[63] = 1; data[64] = 1; data[66] = 1; data[67] = 1; data[68] = 1;
    }




      if (boardnum == 452){
    player = 1;
    isLastPass = false;
    data[12] = -1; data[13] = 1; data[23] = -1; data[24] = 1; data[27] = 1;
    data[28] = -1; data[33] = 1; data[34] = -1; data[37] = -1; data[44] = 1;
    data[45] = -1; data[46] = -1; data[47] = 1; data[54] = -1; data[55] = -1;
    data[56] = -1; data[64] = -1; data[65] = 1; }




      if (boardnum == 453){
    player = 1;
    isLastPass = false;
    data[23] = -1; data[24] = -1; data[25] = 1; data[26] = 1; data[32] = 1;
    data[33] = 1; data[34] = -1; data[35] = 1; data[36] = -1; data[43] = 1;
    data[44] = 1; data[45] = -1; data[46] = -1; data[52] = 1; data[53] = 1;
    data[54] = -1; data[55] = -1; data[56] = -1; data[57] = 1; data[62] = 1;
    data[63] = 1; data[64] = 1; data[65] = -1; data[66] = -1; data[67] = -1;
    data[75] = -1; data[76] = -1; data[85] = -1; }




      if (boardnum == 454){
    player = 1;
    isLastPass = false;
    data[13] = -1; data[24] = -1; data[33] = -1; data[34] = 1; data[35] = -1;
    data[36] = 1; data[37] = 1; data[44] = 1; data[45] = 1; data[46] = 1;
    data[53] = -1; data[54] = -1; data[55] = -1; data[56] = -1; data[64] = 1;
    data[65] = 1; }




      if (boardnum == 455){
    player = 1;
    isLastPass = false;
    data[25] = 1; data[26] = 1; data[33] = -1; data[34] = -1; data[35] = 1;
    data[36] = -1; data[43] = -1; data[44] = -1; data[45] = -1; data[46] = -1;
    data[52] = -1; data[54] = -1; data[55] = -1; data[56] = -1; data[64] = -1;
    data[65] = 1; }




      if (boardnum == 456){
    player = -1;
    isLastPass = false;
    data[13] = -1; data[14] = 1; data[15] = 1; data[24] = 1; data[25] = 1;
    data[26] = 1; data[32] = 1; data[33] = 1; data[34] = 1; data[35] = 1;
    data[36] = 1; data[43] = 1; data[44] = -1; data[45] = 1; data[46] = 1;
    data[53] = 1; data[54] = 1; data[55] = -1; data[56] = 1; data[62] = 1;
    data[63] = 1; data[64] = 1; data[66] = -1; data[73] = 1; data[74] = 1;
    }




      if (boardnum == 457){
    player = 1;
    isLastPass = false;
    data[13] = -1; data[14] = -1; data[15] = -1; data[16] = -1; data[17] = -1;
    data[22] = 1; data[24] = -1; data[25] = 1; data[26] = -1; data[32] = -1;
    data[33] = -1; data[34] = -1; data[35] = -1; data[36] = 1; data[42] = -1;
    data[43] = -1; data[44] = 1; data[45] = 1; data[46] = 1; data[47] = 1;
    data[53] = -1; data[54] = -1; data[55] = 1; data[56] = 1; data[62] = 1;
    data[63] = -1; data[64] = -1; data[65] = -1; }




      if (boardnum == 458){
    player = 1;
    isLastPass = false;
    data[34] = 1; data[35] = 1; data[42] = 1; data[43] = 1; data[44] = 1;
    data[45] = 1; data[46] = 1; data[47] = 1; data[48] = -1; data[52] = 1;
    data[53] = -1; data[54] = 1; data[55] = -1; data[56] = -1; data[57] = -1;
    data[58] = -1; data[61] = 1; data[62] = 1; data[63] = 1; data[64] = -1;
    data[65] = 1; data[66] = -1; data[67] = -1; data[68] = -1; data[72] = 1;
    data[73] = 1; data[74] = -1; data[76] = -1; data[77] = -1; data[78] = -1;
    data[85] = -1; data[88] = -1; }




      if (boardnum == 459){
    player = 1;
    isLastPass = false;
    data[14] = -1; data[16] = 1; data[23] = -1; data[24] = -1; data[25] = -1;
    data[26] = -1; data[27] = -1; data[33] = -1; data[34] = 1; data[35] = 1;
    data[36] = -1; data[37] = -1; data[38] = -1; data[42] = -1; data[43] = -1;
    data[44] = 1; data[45] = -1; data[46] = 1; data[47] = -1; data[51] = -1;
    data[53] = -1; data[54] = -1; data[55] = -1; data[56] = -1; data[65] = -1;
    data[67] = -1; }




      if (boardnum == 460){
    player = -1;
    isLastPass = false;
    data[25] = -1; data[28] = 1; data[32] = -1; data[33] = -1; data[34] = -1;
    data[36] = -1; data[37] = 1; data[38] = 1; data[43] = -1; data[44] = 1;
    data[45] = 1; data[46] = 1; data[47] = -1; data[48] = 1; data[53] = 1;
    data[54] = 1; data[55] = -1; data[56] = -1; data[57] = 1; data[58] = 1;
    data[62] = 1; data[63] = 1; data[64] = 1; data[65] = 1; data[66] = 1;
    data[67] = 1; data[68] = 1; data[73] = 1; data[74] = 1; data[75] = 1;
    data[76] = -1; data[84] = 1; data[85] = 1; data[86] = 1; data[87] = 1;
    }




      if (boardnum == 461){
    player = -1;
    isLastPass = false;
    data[11] = -1; data[21] = 1; data[22] = 1; data[23] = 1; data[26] = 1;
    data[32] = 1; data[33] = -1; data[34] = -1; data[35] = 1; data[36] = -1;
    data[41] = 1; data[44] = 1; data[45] = -1; data[52] = 1; data[54] = -1;
    data[55] = -1; data[56] = 1; data[63] = 1; data[64] = -1; data[65] = -1;
    data[73] = 1; data[74] = 1; data[75] = 1; }




      if (boardnum == 462){
    player = 1;
    isLastPass = false;
    data[13] = 1; data[14] = 1; data[18] = -1; data[24] = 1; data[25] = 1;
    data[26] = 1; data[27] = -1; data[31] = 1; data[33] = 1; data[34] = 1;
    data[35] = 1; data[36] = -1; data[37] = 1; data[38] = 1; data[42] = 1;
    data[43] = -1; data[44] = -1; data[45] = -1; data[46] = -1; data[53] = 1;
    data[54] = 1; data[55] = -1; data[62] = 1; data[64] = 1; }




      if (boardnum == 463){
    player = -1;
    isLastPass = false;
    data[14] = -1; data[15] = -1; data[16] = -1; data[17] = 1; data[24] = -1;
    data[25] = -1; data[26] = 1; data[33] = -1; data[34] = 1; data[35] = 1;
    data[36] = -1; data[43] = 1; data[44] = 1; data[45] = 1; data[54] = 1;
    data[55] = 1; data[56] = 1; data[65] = 1; data[66] = -1; }




      if (boardnum == 464){
    player = -1;
    isLastPass = false;
    data[23] = 1; data[24] = -1; data[32] = -1; data[33] = -1; data[34] = -1;
    data[35] = -1; data[42] = 1; data[43] = 1; data[44] = -1; data[45] = 1;
    data[46] = 1; data[53] = -1; data[54] = 1; data[55] = 1; data[56] = 1;
    data[62] = -1; data[63] = -1; data[64] = 1; data[65] = 1; }




      if (boardnum == 465){
    player = -1;
    isLastPass = false;
    data[33] = -1; data[34] = -1; data[35] = -1; data[44] = -1; data[45] = -1;
    data[48] = 1; data[52] = 1; data[53] = 1; data[54] = -1; data[55] = -1;
    data[56] = -1; data[57] = 1; data[62] = 1; data[63] = 1; data[64] = 1;
    data[66] = 1; data[76] = 1; }




      if (boardnum == 466){
    player = -1;
    isLastPass = false;
    data[14] = -1; data[16] = 1; data[23] = -1; data[24] = -1; data[25] = -1;
    data[26] = -1; data[27] = -1; data[33] = -1; data[34] = 1; data[35] = 1;
    data[36] = -1; data[37] = -1; data[38] = -1; data[42] = -1; data[43] = -1;
    data[44] = 1; data[45] = 1; data[46] = 1; data[47] = 1; data[48] = 1;
    data[51] = -1; data[53] = -1; data[54] = -1; data[55] = 1; data[56] = -1;
    data[57] = 1; data[58] = -1; data[64] = -1; data[65] = -1; data[66] = 1;
    data[67] = -1; data[74] = -1; data[75] = -1; data[76] = -1; data[77] = -1;
    data[87] = -1; data[88] = 1; }




      if (boardnum == 467){
    player = -1;
    isLastPass = false;
    data[32] = -1; data[34] = 1; data[35] = 1; data[36] = 1; data[37] = -1;
    data[43] = -1; data[44] = 1; data[45] = 1; data[46] = 1; data[47] = 1;
    data[48] = 1; data[53] = -1; data[54] = -1; data[55] = -1; data[57] = -1;
    }




      if (boardnum == 468){
    player = 1;
    isLastPass = false;
    data[25] = 1; data[32] = -1; data[34] = 1; data[35] = 1; data[36] = 1;
    data[38] = 1; data[42] = 1; data[43] = 1; data[44] = 1; data[45] = 1;
    data[46] = -1; data[47] = 1; data[48] = -1; data[53] = 1; data[54] = 1;
    data[55] = -1; data[56] = 1; data[57] = 1; data[58] = 1; data[61] = -1;
    data[62] = -1; data[63] = -1; data[64] = -1; data[65] = 1; data[66] = 1;
    data[67] = 1; data[73] = -1; data[74] = 1; data[75] = 1; data[76] = 1;
    data[83] = 1; data[84] = 1; data[85] = 1; data[86] = 1; }




      if (boardnum == 469){
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




      if (boardnum == 470){
    player = 1;
    isLastPass = false;
    data[13] = 1; data[24] = 1; data[25] = -1; data[26] = 1; data[31] = 1;
    data[33] = 1; data[34] = -1; data[35] = -1; data[36] = -1; data[42] = 1;
    data[43] = -1; data[44] = 1; data[45] = -1; data[53] = 1; data[54] = 1;
    data[55] = -1; data[62] = 1; data[64] = 1; }




      if (boardnum == 471){
    player = 1;
    isLastPass = false;
    data[12] = 1; data[13] = 1; data[14] = 1; data[15] = 1; data[23] = 1;
    data[24] = 1; data[25] = 1; data[26] = 1; data[32] = 1; data[33] = 1;
    data[34] = 1; data[35] = 1; data[36] = 1; data[37] = 1; data[43] = 1;
    data[44] = 1; data[45] = -1; data[46] = -1; data[47] = -1; data[52] = 1;
    data[53] = 1; data[54] = -1; data[55] = 1; data[56] = -1; data[57] = -1;
    data[58] = -1; data[62] = 1; data[63] = 1; data[64] = -1; data[65] = -1;
    data[66] = -1; data[67] = -1; data[74] = -1; data[75] = -1; data[76] = -1;
    data[85] = -1; }




      if (boardnum == 472){
    player = 1;
    isLastPass = false;
    data[12] = -1; data[14] = -1; data[15] = 1; data[16] = 1; data[17] = 1;
    data[18] = 1; data[23] = -1; data[25] = -1; data[26] = -1; data[27] = 1;
    data[28] = 1; data[32] = -1; data[33] = 1; data[34] = 1; data[35] = 1;
    data[36] = -1; data[37] = 1; data[43] = -1; data[44] = 1; data[45] = -1;
    data[46] = -1; data[47] = -1; data[54] = -1; data[55] = 1; data[56] = -1;
    data[57] = -1; data[64] = -1; data[65] = -1; data[66] = 1; data[74] = -1;
    }




      if (boardnum == 473){
    player = 1;
    isLastPass = false;
    data[13] = -1; data[21] = -1; data[23] = -1; data[24] = -1; data[32] = -1;
    data[33] = 1; data[34] = -1; data[35] = -1; data[36] = -1; data[37] = -1;
    data[42] = 1; data[43] = 1; data[44] = 1; data[45] = -1; data[46] = -1;
    data[47] = -1; data[48] = -1; data[51] = -1; data[52] = -1; data[53] = 1;
    data[54] = 1; data[55] = 1; data[56] = -1; data[57] = -1; data[62] = -1;
    data[63] = -1; data[64] = 1; data[65] = 1; data[66] = -1; data[67] = -1;
    data[73] = -1; data[74] = 1; data[75] = -1; data[76] = -1; data[78] = -1;
    data[82] = -1; data[83] = -1; data[84] = -1; data[85] = -1; data[86] = -1;
    }




      if (boardnum == 474){
    player = -1;
    isLastPass = false;
    data[12] = 1; data[23] = 1; data[24] = 1; data[25] = 1; data[32] = 1;
    data[34] = 1; data[35] = 1; data[43] = 1; data[44] = -1; data[45] = -1;
    data[46] = 1; data[52] = 1; data[53] = 1; data[54] = 1; data[55] = -1;
    data[56] = 1; data[57] = 1; data[64] = -1; data[65] = 1; data[66] = -1;
    data[73] = 1; data[74] = -1; data[75] = 1; data[76] = 1; data[82] = 1;
    }




      if (boardnum == 475){
    player = 1;
    isLastPass = false;
    data[23] = -1; data[26] = 1; data[33] = -1; data[34] = -1; data[35] = 1;
    data[36] = 1; data[44] = -1; data[45] = -1; data[46] = -1; data[47] = 1;
    data[53] = 1; data[54] = 1; data[55] = 1; data[56] = 1; data[58] = 1;
    data[62] = 1; }




      if (boardnum == 476){
    player = 1;
    isLastPass = false;
    data[12] = -1; data[23] = -1; data[24] = -1; data[33] = -1; data[34] = -1;
    data[35] = -1; data[36] = -1; data[37] = -1; data[41] = 1; data[43] = -1;
    data[44] = -1; data[45] = -1; data[46] = -1; data[47] = -1; data[51] = 1;
    data[52] = 1; data[53] = -1; data[54] = 1; data[55] = 1; data[56] = -1;
    data[61] = 1; data[62] = -1; data[63] = 1; data[64] = 1; data[65] = 1;
    data[71] = -1; data[72] = -1; data[73] = -1; data[74] = -1; data[75] = 1;
    data[82] = -1; data[84] = -1; }




      if (boardnum == 477){
    player = -1;
    isLastPass = false;
    data[13] = -1; data[15] = 1; data[16] = 1; data[17] = 1; data[21] = 1;
    data[23] = -1; data[24] = -1; data[25] = 1; data[26] = 1; data[31] = 1;
    data[32] = 1; data[33] = 1; data[34] = 1; data[35] = 1; data[36] = -1;
    data[37] = -1; data[38] = -1; data[41] = 1; data[42] = -1; data[43] = 1;
    data[44] = 1; data[45] = -1; data[46] = -1; data[47] = 1; data[51] = 1;
    data[52] = 1; data[53] = -1; data[54] = -1; data[55] = -1; data[56] = -1;
    data[57] = 1; data[61] = 1; data[63] = 1; data[64] = 1; data[65] = 1;
    data[66] = 1; data[67] = 1; data[73] = 1; data[74] = 1; data[75] = 1;
    data[76] = 1; data[83] = 1; data[85] = 1; }




      if (boardnum == 478){
    player = -1;
    isLastPass = false;
    data[33] = -1; data[34] = -1; data[35] = -1; data[36] = -1; data[37] = -1;
    data[42] = 1; data[43] = 1; data[44] = 1; data[45] = 1; data[46] = 1;
    data[47] = 1; data[53] = -1; data[54] = -1; data[55] = -1; data[56] = -1;
    }




      if (boardnum == 479){
    player = -1;
    isLastPass = false;
    data[24] = -1; data[31] = -1; data[32] = -1; data[33] = -1; data[34] = -1;
    data[35] = -1; data[36] = 1; data[41] = 1; data[42] = 1; data[43] = -1;
    data[44] = 1; data[45] = 1; data[46] = 1; data[52] = 1; data[53] = 1;
    data[54] = -1; data[55] = 1; data[56] = 1; data[62] = 1; data[63] = 1;
    data[64] = 1; data[65] = -1; data[66] = 1; data[73] = 1; data[74] = -1;
    data[75] = 1; data[86] = 1; }




      if (boardnum == 480){
    player = -1;
    isLastPass = false;
    data[14] = 1; data[25] = 1; data[33] = 1; data[34] = 1; data[35] = -1;
    data[36] = 1; data[37] = 1; data[43] = 1; data[44] = 1; data[45] = 1;
    data[46] = 1; data[54] = 1; data[55] = -1; data[56] = 1; data[57] = 1;
    data[63] = 1; data[64] = -1; data[65] = -1; data[66] = -1; data[67] = 1;
    data[72] = 1; data[73] = 1; data[74] = 1; data[75] = -1; data[76] = -1;
    data[77] = -1; data[86] = -1; data[87] = -1; data[88] = -1; }




      if (boardnum == 481){
    player = -1;
    isLastPass = false;
    data[13] = -1; data[23] = -1; data[24] = -1; data[25] = -1; data[27] = -1;
    data[32] = -1; data[33] = -1; data[34] = 1; data[35] = -1; data[36] = -1;
    data[37] = -1; data[43] = -1; data[44] = 1; data[45] = -1; data[46] = 1;
    data[47] = 1; data[48] = 1; data[53] = -1; data[54] = -1; data[55] = -1;
    data[56] = 1; data[57] = 1; data[58] = 1; }




      if (boardnum == 482){
    player = 1;
    isLastPass = false;
    data[13] = 1; data[14] = 1; data[15] = 1; data[16] = 1; data[17] = 1;
    data[18] = 1; data[23] = 1; data[24] = 1; data[25] = 1; data[26] = 1;
    data[27] = 1; data[32] = -1; data[33] = 1; data[34] = -1; data[35] = -1;
    data[36] = -1; data[37] = -1; data[38] = -1; data[42] = 1; data[43] = 1;
    data[44] = 1; data[45] = 1; data[46] = -1; data[47] = -1; data[54] = 1;
    data[55] = -1; data[56] = -1; data[57] = -1; }




      if (boardnum == 483){
    player = -1;
    isLastPass = false;
    data[13] = -1; data[14] = -1; data[15] = -1; data[16] = -1; data[24] = -1;
    data[25] = -1; data[26] = 1; data[32] = 1; data[33] = 1; data[34] = 1;
    data[35] = -1; data[36] = -1; data[37] = -1; data[38] = -1; data[43] = 1;
    data[44] = -1; data[45] = 1; data[46] = 1; data[47] = 1; data[53] = 1;
    data[54] = 1; data[55] = -1; data[56] = 1; data[57] = 1; data[58] = 1;
    data[64] = 1; data[65] = 1; data[66] = 1; data[67] = 1; data[68] = 1;
    data[75] = 1; data[76] = 1; data[78] = 1; }




      if (boardnum == 484){
    player = 1;
    isLastPass = false;
    data[21] = 1; data[24] = -1; data[25] = 1; data[31] = 1; data[32] = 1;
    data[33] = -1; data[34] = -1; data[35] = -1; data[36] = -1; data[41] = 1;
    data[42] = -1; data[43] = 1; data[44] = -1; data[45] = 1; data[51] = 1;
    data[52] = 1; data[53] = -1; data[54] = 1; data[55] = 1; data[56] = 1;
    data[57] = 1; data[61] = 1; data[62] = 1; data[63] = 1; data[64] = -1;
    data[65] = 1; data[66] = 1; data[71] = 1; data[73] = -1; data[74] = -1;
    data[75] = -1; data[76] = -1; data[81] = 1; data[82] = 1; data[83] = 1;
    data[84] = 1; data[85] = 1; data[86] = -1; }




      if (boardnum == 485){
    player = -1;
    isLastPass = false;
    data[24] = -1; data[25] = 1; data[26] = 1; data[33] = -1; data[34] = -1;
    data[35] = -1; data[36] = -1; data[37] = 1; data[38] = -1; data[43] = 1;
    data[44] = 1; data[45] = 1; data[46] = 1; data[47] = 1; data[48] = 1;
    data[54] = 1; data[55] = -1; data[56] = -1; data[57] = -1; data[66] = -1;
    data[67] = 1; }




      if (boardnum == 486){
    player = 1;
    isLastPass = false;
    data[33] = -1; data[34] = -1; data[35] = -1; data[36] = -1; data[42] = 1;
    data[43] = 1; data[44] = -1; data[45] = -1; data[46] = 1; data[52] = -1;
    data[53] = -1; data[54] = -1; data[55] = 1; data[56] = 1; data[62] = -1;
    data[63] = -1; data[64] = 1; data[65] = 1; }




      if (boardnum == 487){
    player = 1;
    isLastPass = false;
    data[15] = 1; data[16] = -1; data[21] = 1; data[24] = 1; data[25] = 1;
    data[26] = -1; data[31] = 1; data[32] = 1; data[33] = 1; data[34] = 1;
    data[35] = 1; data[36] = -1; data[37] = 1; data[41] = 1; data[42] = -1;
    data[43] = 1; data[44] = 1; data[45] = -1; data[46] = -1; data[47] = 1;
    data[51] = 1; data[53] = 1; data[54] = 1; data[55] = -1; data[56] = -1;
    data[63] = 1; data[64] = 1; data[65] = 1; data[66] = -1; data[73] = 1;
    data[74] = 1; data[83] = 1; }




      if (boardnum == 488){
    player = 1;
    isLastPass = false;
    data[24] = -1; data[31] = -1; data[32] = -1; data[33] = -1; data[34] = -1;
    data[35] = -1; data[36] = 1; data[41] = 1; data[42] = 1; data[43] = -1;
    data[44] = 1; data[45] = 1; data[46] = 1; data[52] = 1; data[53] = 1;
    data[54] = -1; data[55] = 1; data[56] = 1; data[62] = 1; data[63] = 1;
    data[64] = 1; data[65] = -1; data[66] = 1; data[73] = 1; data[74] = -1;
    data[75] = -1; data[85] = -1; data[86] = 1; }




      if (boardnum == 489){
    player = 1;
    isLastPass = false;
    data[25] = -1; data[26] = 1; data[33] = -1; data[34] = -1; data[35] = -1;
    data[43] = -1; data[44] = 1; data[45] = -1; data[46] = 1; data[47] = 1;
    data[53] = -1; data[54] = -1; data[55] = -1; data[56] = -1; data[57] = -1;
    data[64] = -1; data[65] = -1; data[66] = -1; data[67] = -1; data[73] = -1;
    data[74] = 1; data[75] = -1; data[76] = 1; data[83] = 1; data[84] = 1;
    data[85] = 1; data[86] = 1; data[87] = 1; }




      if (boardnum == 490){
    player = 1;
    isLastPass = false;
    data[12] = -1; data[23] = -1; data[24] = -1; data[33] = -1; data[34] = -1;
    data[35] = -1; data[36] = -1; data[37] = -1; data[43] = -1; data[44] = -1;
    data[45] = -1; data[46] = -1; data[52] = 1; data[53] = 1; data[54] = -1;
    data[55] = -1; data[63] = -1; data[64] = -1; data[65] = 1; data[72] = -1;
    }




      if (boardnum == 491){
    player = -1;
    isLastPass = false;
    data[11] = -1; data[14] = 1; data[21] = -1; data[22] = -1; data[23] = 1;
    data[24] = 1; data[25] = 1; data[28] = 1; data[32] = 1; data[33] = -1;
    data[34] = 1; data[35] = -1; data[36] = 1; data[37] = 1; data[38] = 1;
    data[41] = 1; data[42] = 1; data[43] = 1; data[44] = 1; data[45] = -1;
    data[46] = 1; data[47] = 1; data[48] = 1; data[52] = 1; data[53] = -1;
    data[54] = 1; data[55] = 1; data[56] = 1; data[58] = 1; data[61] = -1;
    data[63] = 1; data[64] = 1; data[65] = 1; data[66] = 1; data[74] = 1;
    data[75] = 1; data[76] = 1; data[84] = 1; data[86] = 1; }




      if (boardnum == 492){
    player = -1;
    isLastPass = false;
    data[11] = -1; data[12] = 1; data[13] = -1; data[14] = -1; data[15] = -1;
    data[16] = -1; data[21] = 1; data[22] = 1; data[23] = 1; data[24] = -1;
    data[25] = -1; data[26] = -1; data[33] = -1; data[34] = -1; data[35] = 1;
    data[36] = -1; data[42] = -1; data[43] = -1; data[44] = 1; data[45] = 1;
    data[46] = -1; data[47] = -1; data[48] = -1; data[52] = -1; data[53] = 1;
    data[54] = -1; data[55] = -1; data[56] = -1; data[57] = -1; data[58] = -1;
    data[62] = 1; data[63] = -1; data[64] = -1; data[65] = -1; data[66] = -1;
    data[67] = -1; data[74] = -1; data[75] = 1; data[76] = -1; data[78] = -1;
    data[87] = -1; }




      if (boardnum == 493){
    player = -1;
    isLastPass = false;
    data[16] = 1; data[25] = 1; data[26] = 1; data[33] = -1; data[34] = -1;
    data[35] = -1; data[36] = 1; data[43] = -1; data[44] = -1; data[45] = 1;
    data[46] = 1; data[54] = -1; data[55] = -1; data[56] = 1; data[65] = -1;
    }




      if (boardnum == 494){
    player = -1;
    isLastPass = false;
    data[16] = 1; data[17] = 1; data[18] = 1; data[24] = -1; data[25] = 1;
    data[26] = -1; data[28] = 1; data[33] = -1; data[34] = -1; data[35] = -1;
    data[36] = -1; data[37] = -1; data[38] = 1; data[43] = 1; data[44] = 1;
    data[45] = 1; data[46] = -1; data[47] = -1; data[48] = 1; data[54] = 1;
    data[55] = -1; data[56] = -1; data[57] = 1; data[58] = 1; data[66] = -1;
    data[67] = 1; data[68] = 1; }




      if (boardnum == 495){
    player = -1;
    isLastPass = false;
    data[13] = 1; data[14] = -1; data[15] = -1; data[16] = -1; data[23] = 1;
    data[24] = 1; data[25] = 1; data[26] = 1; data[32] = -1; data[33] = -1;
    data[34] = -1; data[35] = 1; data[36] = -1; data[37] = -1; data[38] = -1;
    data[43] = -1; data[44] = -1; data[45] = 1; data[46] = 1; data[47] = 1;
    data[48] = 1; data[53] = -1; data[54] = -1; data[55] = 1; data[56] = 1;
    data[63] = -1; data[64] = 1; data[66] = 1; data[67] = -1; }




      if (boardnum == 496){
    player = 1;
    isLastPass = false;
    data[16] = 1; data[24] = 1; data[25] = 1; data[33] = 1; data[34] = 1;
    data[37] = 1; data[43] = -1; data[44] = -1; data[45] = -1; data[46] = -1;
    data[47] = -1; data[53] = -1; data[54] = -1; data[55] = -1; data[56] = -1;
    data[64] = -1; data[65] = -1; data[66] = -1; }




      if (boardnum == 497){
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




      if (boardnum == 498){
    player = -1;
    isLastPass = false;
    data[33] = -1; data[34] = -1; data[35] = -1; data[36] = -1; data[37] = -1;
    data[43] = -1; data[44] = -1; data[45] = 1; data[46] = -1; data[53] = -1;
    data[54] = -1; data[55] = -1; data[56] = 1; data[57] = -1; data[62] = -1;
    data[63] = -1; data[64] = -1; data[65] = 1; data[67] = 1; }




      if (boardnum == 499){
    player = -1;
    isLastPass = false;
    data[33] = 1; data[34] = 1; data[35] = 1; data[36] = 1; data[37] = 1;
    data[44] = -1; data[45] = -1; data[46] = 1; data[54] = -1; data[55] = -1;
    data[56] = 1; data[57] = 1; data[63] = -1; data[64] = -1; data[65] = -1;
    data[66] = -1; data[67] = 1; data[73] = 1; data[74] = 1; data[75] = 1;
    data[76] = 1; data[77] = -1; data[88] = -1; }




      if (boardnum == 500){
    player = 1;
    isLastPass = false;
    data[14] = 1; data[16] = -1; data[24] = -1; data[25] = -1; data[27] = 1;
    data[34] = -1; data[35] = -1; data[36] = 1; data[37] = -1; data[44] = -1;
    data[45] = -1; data[46] = 1; data[53] = -1; data[54] = 1; data[55] = 1;
    data[56] = -1; data[63] = 1; data[64] = 1; data[66] = 1; data[67] = -1;
    }




      if (boardnum == 501){
    player = 1;
    isLastPass = false;
    data[33] = -1; data[34] = -1; data[35] = -1; data[42] = -1; data[43] = 1;
    data[44] = 1; data[45] = 1; data[46] = 1; data[47] = 1; data[48] = 1;
    data[51] = -1; data[52] = -1; data[53] = -1; data[54] = -1; data[55] = -1;
    data[56] = 1; data[57] = 1; data[61] = -1; data[62] = -1; data[63] = 1;
    data[64] = -1; data[65] = -1; data[66] = 1; data[73] = -1; data[74] = -1;
    data[75] = -1; data[76] = 1; data[83] = 1; data[84] = -1; data[85] = 1;
    }




      if (boardnum == 502){
    player = -1;
    isLastPass = false;
    data[25] = 1; data[26] = 1; data[32] = -1; data[33] = -1; data[34] = -1;
    data[35] = 1; data[36] = 1; data[37] = -1; data[43] = -1; data[44] = 1;
    data[45] = 1; data[46] = 1; data[47] = 1; data[53] = -1; data[54] = -1;
    data[55] = 1; data[56] = 1; data[63] = -1; data[64] = 1; }




      if (boardnum == 503){
    player = -1;
    isLastPass = false;
    data[11] = 1; data[12] = 1; data[13] = 1; data[14] = 1; data[15] = 1;
    data[21] = 1; data[22] = -1; data[23] = -1; data[24] = 1; data[25] = 1;
    data[31] = 1; data[32] = -1; data[33] = -1; data[34] = -1; data[35] = 1;
    data[36] = 1; data[41] = 1; data[42] = -1; data[43] = 1; data[44] = -1;
    data[45] = -1; data[46] = 1; data[47] = 1; data[51] = 1; data[52] = 1;
    data[53] = 1; data[54] = 1; data[55] = -1; data[56] = 1; data[57] = 1;
    data[62] = 1; data[63] = 1; data[64] = 1; data[65] = 1; data[66] = 1;
    data[67] = 1; data[73] = 1; data[74] = 1; data[75] = 1; data[78] = 1;
    data[82] = 1; }




      if (boardnum == 504){
    player = -1;
    isLastPass = false;
    data[11] = 1; data[13] = -1; data[14] = -1; data[16] = -1; data[21] = -1;
    data[22] = 1; data[23] = 1; data[24] = -1; data[25] = -1; data[26] = -1;
    data[32] = 1; data[33] = 1; data[34] = -1; data[35] = -1; data[36] = -1;
    data[41] = 1; data[42] = 1; data[43] = 1; data[44] = 1; data[45] = 1;
    data[46] = 1; data[47] = 1; data[51] = 1; data[52] = -1; data[53] = 1;
    data[54] = -1; data[55] = -1; data[56] = -1; data[61] = -1; data[62] = -1;
    data[63] = -1; data[64] = 1; data[65] = -1; data[73] = -1; data[74] = -1;
    data[76] = -1; data[83] = -1; }




      if (boardnum == 505){
    player = 1;
    isLastPass = false;
    data[31] = 1; data[32] = 1; data[33] = 1; data[34] = 1; data[35] = 1;
    data[36] = 1; data[41] = 1; data[42] = 1; data[43] = 1; data[44] = 1;
    data[45] = 1; data[46] = 1; data[52] = 1; data[53] = 1; data[54] = -1;
    data[55] = -1; data[56] = -1; data[57] = -1; data[61] = -1; data[62] = -1;
    data[63] = -1; data[64] = -1; data[65] = -1; data[66] = -1; data[67] = -1;
    data[68] = -1; }




      if (boardnum == 506){
    player = 1;
    isLastPass = false;
    data[11] = -1; data[12] = -1; data[13] = -1; data[14] = -1; data[15] = -1;
    data[16] = -1; data[17] = -1; data[21] = 1; data[22] = 1; data[23] = -1;
    data[24] = 1; data[25] = 1; data[26] = 1; data[28] = 1; data[32] = -1;
    data[33] = 1; data[34] = 1; data[35] = 1; data[36] = 1; data[37] = 1;
    data[41] = -1; data[43] = 1; data[44] = 1; data[45] = 1; data[46] = 1;
    data[47] = 1; data[54] = 1; data[55] = 1; data[56] = 1; data[57] = 1;
    data[63] = -1; data[65] = 1; data[66] = 1; data[67] = -1; }




      if (boardnum == 507){
    player = -1;
    isLastPass = false;
    data[36] = -1; data[37] = -1; data[38] = -1; data[43] = 1; data[44] = 1;
    data[45] = 1; data[46] = 1; data[47] = -1; data[48] = -1; data[53] = -1;
    data[54] = -1; data[55] = -1; data[56] = -1; data[57] = 1; data[58] = -1;
    data[63] = -1; data[64] = 1; data[65] = 1; data[66] = 1; data[67] = 1;
    data[68] = 1; data[73] = 1; data[74] = 1; data[75] = 1; data[76] = -1;
    data[84] = 1; data[85] = 1; data[86] = 1; data[87] = 1; }




      if (boardnum == 508){
    player = 1;
    isLastPass = false;
    data[13] = -1; data[16] = 1; data[23] = -1; data[24] = -1; data[25] = 1;
    data[26] = 1; data[31] = -1; data[32] = -1; data[33] = -1; data[34] = 1;
    data[35] = 1; data[36] = 1; data[37] = -1; data[38] = -1; data[41] = 1;
    data[42] = -1; data[43] = 1; data[44] = 1; data[45] = -1; data[46] = -1;
    data[47] = -1; data[48] = -1; data[52] = 1; data[53] = -1; data[54] = 1;
    data[55] = -1; data[56] = -1; data[57] = -1; data[58] = -1; data[61] = 1;
    data[63] = -1; data[64] = -1; data[65] = 1; data[66] = 1; data[67] = -1;
    data[68] = -1; data[73] = -1; data[74] = 1; data[75] = -1; data[86] = -1;
    }




      if (boardnum == 509){
    player = 1;
    isLastPass = false;
    data[24] = -1; data[25] = 1; data[31] = -1; data[32] = -1; data[33] = -1;
    data[34] = 1; data[35] = 1; data[36] = -1; data[37] = -1; data[41] = 1;
    data[42] = 1; data[43] = 1; data[44] = 1; data[45] = 1; data[46] = 1;
    data[47] = -1; data[52] = 1; data[53] = 1; data[54] = -1; data[55] = 1;
    data[56] = -1; data[62] = 1; data[63] = 1; data[64] = 1; data[65] = -1;
    data[66] = 1; data[73] = 1; data[74] = 1; data[75] = 1; data[84] = 1;
    data[85] = 1; data[86] = 1; }




      if (boardnum == 510){
    player = -1;
    isLastPass = false;
    data[13] = 1; data[14] = 1; data[15] = 1; data[16] = 1; data[17] = 1;
    data[18] = 1; data[22] = -1; data[23] = 1; data[24] = 1; data[25] = 1;
    data[26] = 1; data[27] = 1; data[28] = 1; data[32] = 1; data[33] = -1;
    data[34] = -1; data[35] = 1; data[36] = -1; data[37] = 1; data[38] = 1;
    data[41] = 1; data[42] = 1; data[43] = 1; data[44] = -1; data[45] = 1;
    data[46] = 1; data[47] = 1; data[48] = 1; data[53] = -1; data[54] = -1;
    data[55] = -1; data[56] = -1; data[57] = -1; data[58] = 1; data[62] = -1;
    data[64] = -1; data[68] = 1; data[78] = 1; data[88] = 1; }




      if (boardnum == 511){
    player = 1;
    isLastPass = false;
    data[34] = 1; data[35] = 1; data[42] = 1; data[43] = 1; data[44] = 1;
    data[45] = 1; data[46] = 1; data[47] = 1; data[53] = -1; data[54] = -1;
    data[55] = -1; data[56] = -1; data[57] = 1; data[58] = -1; data[63] = 1;
    data[64] = -1; data[65] = -1; data[66] = -1; data[67] = 1; data[77] = 1;
    }




      if (boardnum == 512){
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




      if (boardnum == 513){
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




      if (boardnum == 514){
    player = 1;
    isLastPass = false;
    data[13] = -1; data[14] = 1; data[15] = 1; data[23] = -1; data[24] = 1;
    data[25] = 1; data[26] = 1; data[32] = -1; data[33] = -1; data[34] = 1;
    data[35] = 1; data[36] = 1; data[37] = 1; data[42] = -1; data[43] = -1;
    data[44] = -1; data[45] = -1; data[46] = -1; data[47] = -1; data[48] = -1;
    data[52] = 1; data[53] = 1; data[54] = -1; data[55] = 1; data[56] = -1;
    data[57] = -1; data[63] = 1; data[64] = 1; data[65] = -1; data[66] = -1;
    data[67] = -1; data[73] = -1; data[74] = 1; data[76] = -1; }




      if (boardnum == 515){
    player = -1;
    isLastPass = false;
    data[24] = 1; data[26] = -1; data[27] = 1; data[33] = 1; data[34] = 1;
    data[35] = -1; data[36] = 1; data[42] = -1; data[43] = -1; data[44] = -1;
    data[45] = 1; data[46] = 1; data[52] = -1; data[53] = 1; data[54] = 1;
    data[55] = 1; data[56] = 1; data[57] = 1; data[62] = 1; data[63] = 1;
    data[64] = 1; data[65] = 1; data[73] = 1; }




      if (boardnum == 516){
    player = 1;
    isLastPass = false;
    data[13] = -1; data[14] = -1; data[15] = -1; data[16] = -1; data[17] = -1;
    data[18] = -1; data[23] = -1; data[24] = -1; data[25] = -1; data[26] = -1;
    data[27] = -1; data[28] = -1; data[33] = 1; data[34] = -1; data[35] = 1;
    data[36] = 1; data[37] = 1; data[44] = 1; data[45] = -1; data[46] = 1;
    data[47] = 1; data[48] = 1; data[53] = 1; data[54] = 1; data[55] = 1;
    data[56] = -1; data[57] = 1; data[58] = 1; data[62] = 1; data[63] = 1;
    data[64] = 1; data[66] = 1; data[67] = 1; data[68] = 1; }




      if (boardnum == 517){
    player = -1;
    isLastPass = false;
    data[33] = -1; data[34] = -1; data[35] = -1; data[44] = -1; data[45] = -1;
    data[46] = 1; data[52] = 1; data[53] = 1; data[54] = -1; data[55] = 1;
    data[56] = 1; data[57] = 1; data[62] = 1; data[63] = 1; data[64] = 1;
    data[66] = -1; data[67] = -1; }




      if (boardnum == 518){
    player = -1;
    isLastPass = false;
    data[16] = 1; data[21] = 1; data[22] = 1; data[23] = 1; data[25] = 1;
    data[26] = 1; data[31] = -1; data[32] = -1; data[33] = -1; data[34] = -1;
    data[35] = -1; data[36] = 1; data[42] = -1; data[43] = -1; data[44] = -1;
    data[45] = -1; data[46] = 1; data[53] = -1; data[54] = -1; data[55] = -1;
    data[56] = 1; data[57] = 1; data[62] = -1; data[63] = -1; data[64] = -1;
    data[65] = -1; data[66] = 1; data[73] = 1; data[75] = 1; data[76] = 1;
    data[77] = -1; data[78] = -1; data[86] = 1; }




      if (boardnum == 519){
    player = 1;
    isLastPass = false;
    data[11] = 1; data[12] = 1; data[13] = 1; data[14] = -1; data[23] = -1;
    data[24] = -1; data[25] = 1; data[31] = -1; data[32] = -1; data[33] = 1;
    data[34] = -1; data[35] = 1; data[36] = 1; data[41] = -1; data[42] = -1;
    data[43] = -1; data[44] = -1; data[45] = -1; data[46] = 1; data[47] = 1;
    data[51] = 1; data[52] = 1; data[53] = 1; data[54] = -1; data[55] = 1;
    data[56] = 1; data[62] = 1; data[63] = 1; data[64] = 1; data[65] = 1;
    data[67] = 1; data[73] = 1; data[74] = 1; data[75] = 1; data[78] = 1;
    data[82] = 1; }




      if (boardnum == 520){
    player = 1;
    isLastPass = false;
    data[14] = 1; data[15] = 1; data[16] = 1; data[23] = -1; data[25] = 1;
    data[26] = 1; data[33] = -1; data[34] = -1; data[35] = -1; data[36] = 1;
    data[38] = -1; data[43] = 1; data[44] = 1; data[45] = 1; data[46] = 1;
    data[47] = -1; data[54] = 1; data[55] = -1; data[56] = -1; data[57] = -1;
    }




      if (boardnum == 521){
    player = -1;
    isLastPass = false;
    data[11] = 1; data[12] = 1; data[13] = 1; data[14] = 1; data[15] = 1;
    data[21] = 1; data[22] = -1; data[23] = -1; data[24] = 1; data[25] = 1;
    data[31] = 1; data[32] = -1; data[33] = -1; data[34] = -1; data[35] = 1;
    data[36] = 1; data[41] = 1; data[42] = -1; data[43] = 1; data[44] = -1;
    data[45] = -1; data[46] = 1; data[47] = 1; data[51] = 1; data[52] = 1;
    data[53] = 1; data[54] = 1; data[55] = -1; data[56] = 1; data[57] = 1;
    data[62] = 1; data[63] = 1; data[64] = 1; data[65] = 1; data[66] = 1;
    data[67] = 1; data[73] = 1; data[74] = 1; data[75] = 1; data[78] = 1;
    data[82] = 1; }




      if (boardnum == 522){
    player = -1;
    isLastPass = false;
    data[15] = -1; data[16] = 1; data[22] = 1; data[23] = 1; data[24] = 1;
    data[25] = 1; data[26] = 1; data[27] = 1; data[31] = 1; data[32] = 1;
    data[33] = 1; data[34] = 1; data[35] = -1; data[36] = 1; data[37] = 1;
    data[41] = 1; data[42] = 1; data[43] = 1; data[44] = 1; data[45] = 1;
    data[46] = 1; data[48] = 1; data[51] = 1; data[52] = 1; data[53] = 1;
    data[54] = 1; data[55] = 1; data[56] = 1; data[61] = -1; data[62] = 1;
    data[63] = 1; data[64] = 1; data[65] = 1; data[66] = 1; data[71] = -1;
    data[74] = 1; data[75] = 1; data[76] = 1; data[81] = -1; data[83] = 1;
    data[85] = 1; }




      if (boardnum == 523){
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




      if (boardnum == 524){
    player = 1;
    isLastPass = false;
    data[13] = 1; data[14] = -1; data[15] = -1; data[16] = -1; data[17] = -1;
    data[18] = -1; data[23] = 1; data[24] = -1; data[25] = -1; data[26] = 1;
    data[27] = 1; data[33] = 1; data[34] = -1; data[35] = -1; data[36] = -1;
    data[37] = 1; data[38] = 1; data[43] = 1; data[44] = -1; data[45] = 1;
    data[46] = -1; data[47] = 1; data[48] = -1; data[53] = 1; data[54] = -1;
    data[55] = -1; data[56] = 1; data[57] = -1; data[58] = -1; data[63] = 1;
    data[64] = 1; data[65] = 1; data[66] = 1; data[67] = 1; data[73] = 1;
    data[74] = 1; data[75] = 1; data[76] = 1; data[82] = 1; data[83] = 1;
    }




      if (boardnum == 525){
    player = 1;
    isLastPass = false;
    data[11] = -1; data[13] = -1; data[14] = -1; data[15] = -1; data[16] = -1;
    data[17] = -1; data[22] = -1; data[24] = -1; data[25] = 1; data[26] = -1;
    data[31] = -1; data[32] = -1; data[33] = -1; data[34] = -1; data[35] = -1;
    data[36] = 1; data[41] = 1; data[42] = -1; data[43] = 1; data[44] = 1;
    data[45] = 1; data[46] = 1; data[47] = 1; data[53] = -1; data[54] = 1;
    data[55] = 1; data[56] = 1; data[62] = 1; data[63] = -1; data[64] = 1;
    data[65] = 1; data[74] = 1; data[75] = 1; data[76] = -1; }




      if (boardnum == 526){
    player = -1;
    isLastPass = false;
    data[32] = -1; data[33] = -1; data[34] = 1; data[43] = -1; data[44] = 1;
    data[45] = 1; data[46] = 1; data[53] = 1; data[54] = 1; data[55] = -1;
    data[56] = 1; data[63] = 1; data[64] = 1; data[65] = -1; data[66] = -1;
    data[75] = -1; data[76] = -1; data[77] = -1; data[84] = -1; }




      if (boardnum == 527){
    player = -1;
    isLastPass = false;
    data[11] = 1; data[12] = 1; data[13] = 1; data[23] = -1; data[24] = 1;
    data[25] = 1; data[31] = -1; data[32] = -1; data[33] = 1; data[34] = -1;
    data[35] = 1; data[36] = 1; data[43] = 1; data[44] = 1; data[45] = -1;
    data[46] = 1; data[47] = 1; data[52] = 1; data[53] = 1; data[54] = -1;
    data[55] = 1; data[56] = 1; data[62] = 1; data[63] = 1; data[64] = 1;
    data[65] = 1; data[67] = -1; data[73] = 1; data[74] = 1; data[75] = 1;
    data[82] = 1; }




      if (boardnum == 528){
    player = 1;
    isLastPass = false;
    data[13] = -1; data[15] = 1; data[16] = 1; data[17] = 1; data[23] = -1;
    data[24] = -1; data[25] = 1; data[26] = 1; data[32] = -1; data[33] = -1;
    data[34] = 1; data[35] = -1; data[42] = -1; data[43] = -1; data[44] = 1;
    data[45] = -1; data[46] = -1; data[52] = -1; data[53] = -1; data[54] = -1;
    data[55] = 1; data[56] = -1; data[57] = -1; data[58] = -1; data[63] = 1;
    data[64] = -1; data[65] = -1; data[66] = 1; data[67] = -1; data[68] = 1;
    data[74] = -1; data[75] = -1; data[76] = -1; data[77] = 1; data[83] = -1;
    data[84] = 1; data[86] = -1; data[88] = 1; }




      if (boardnum == 529){
    player = -1;
    isLastPass = false;
    data[11] = 1; data[12] = 1; data[13] = 1; data[14] = 1; data[17] = -1;
    data[22] = 1; data[23] = 1; data[24] = 1; data[25] = -1; data[27] = -1;
    data[28] = -1; data[33] = 1; data[34] = 1; data[37] = -1; data[44] = 1;
    data[45] = -1; data[46] = -1; data[47] = 1; data[54] = -1; data[55] = 1;
    data[56] = -1; data[64] = -1; data[65] = -1; data[66] = -1; data[76] = -1;
    }




      if (boardnum == 530){
    player = -1;
    isLastPass = false;
    data[43] = 1; data[44] = 1; data[45] = 1; data[46] = -1; data[54] = 1;
    data[55] = 1; data[56] = -1; data[57] = -1; data[64] = -1; data[65] = -1;
    data[66] = -1; data[67] = -1; data[74] = -1; data[75] = 1; data[85] = 1;
    data[86] = 1; data[87] = 1; }




      if (boardnum == 531){
    player = 1;
    isLastPass = false;
    data[13] = -1; data[14] = -1; data[15] = -1; data[16] = -1; data[23] = 1;
    data[24] = 1; data[25] = 1; data[26] = 1; data[32] = 1; data[33] = 1;
    data[34] = 1; data[35] = -1; data[36] = -1; data[37] = -1; data[38] = -1;
    data[43] = 1; data[44] = -1; data[45] = -1; data[46] = -1; data[47] = -1;
    data[48] = -1; data[53] = 1; data[54] = 1; data[55] = -1; data[56] = 1;
    data[57] = 1; data[58] = -1; data[64] = 1; data[65] = 1; data[66] = 1;
    data[67] = 1; data[68] = -1; data[75] = 1; data[76] = 1; data[78] = -1;
    data[88] = -1; }




      if (boardnum == 532){
    player = -1;
    isLastPass = false;
    data[13] = 1; data[15] = -1; data[18] = -1; data[23] = 1; data[24] = -1;
    data[25] = -1; data[27] = -1; data[32] = 1; data[33] = 1; data[34] = 1;
    data[35] = 1; data[36] = -1; data[37] = -1; data[38] = -1; data[42] = 1;
    data[43] = 1; data[44] = -1; data[45] = 1; data[46] = -1; data[47] = -1;
    data[52] = -1; data[53] = -1; data[54] = -1; data[55] = -1; data[56] = 1;
    data[57] = 1; data[63] = 1; data[64] = 1; data[65] = 1; data[66] = 1;
    data[67] = 1; data[68] = 1; data[73] = 1; data[74] = 1; data[75] = -1;
    data[77] = -1; data[88] = -1; }




      if (boardnum == 533){
    player = 1;
    isLastPass = false;
    data[15] = -1; data[22] = 1; data[23] = 1; data[24] = 1; data[25] = -1;
    data[26] = 1; data[31] = 1; data[32] = 1; data[33] = 1; data[34] = -1;
    data[35] = -1; data[36] = -1; data[37] = 1; data[42] = 1; data[43] = -1;
    data[44] = 1; data[45] = -1; data[46] = 1; data[48] = 1; data[51] = 1;
    data[52] = 1; data[53] = 1; data[54] = 1; data[55] = 1; data[56] = 1;
    data[62] = 1; data[63] = 1; data[64] = 1; data[65] = 1; data[66] = 1;
    data[71] = 1; data[74] = 1; data[75] = 1; data[76] = 1; data[83] = 1;
    data[85] = 1; }




      if (boardnum == 534){
    player = -1;
    isLastPass = false;
    data[11] = -1; data[14] = -1; data[16] = -1; data[21] = -1; data[22] = 1;
    data[23] = 1; data[24] = 1; data[26] = -1; data[31] = -1; data[32] = -1;
    data[33] = -1; data[34] = 1; data[35] = -1; data[36] = -1; data[41] = 1;
    data[43] = -1; data[44] = -1; data[45] = -1; data[47] = -1; data[52] = 1;
    data[53] = -1; data[54] = -1; data[55] = 1; data[56] = -1; data[61] = 1;
    data[62] = 1; data[63] = 1; data[64] = 1; data[65] = -1; data[66] = 1;
    data[73] = 1; data[74] = 1; data[75] = 1; data[76] = 1; data[77] = 1;
    }




      if (boardnum == 535){
    player = -1;
    isLastPass = false;
    data[24] = 1; data[31] = 1; data[33] = 1; data[35] = 1; data[42] = 1;
    data[44] = 1; data[45] = -1; data[46] = 1; data[53] = -1; data[54] = -1;
    data[55] = 1; data[56] = -1; data[62] = -1; data[63] = -1; data[64] = -1;
    data[65] = -1; data[66] = 1; data[73] = 1; data[77] = 1; }




      if (boardnum == 536){
    player = 1;
    isLastPass = false;
    data[13] = 1; data[14] = -1; data[15] = -1; data[16] = -1; data[17] = -1;
    data[18] = -1; data[24] = 1; data[25] = -1; data[26] = 1; data[27] = 1;
    data[31] = -1; data[32] = -1; data[33] = -1; data[34] = -1; data[35] = 1;
    data[36] = -1; data[37] = 1; data[42] = -1; data[43] = 1; data[44] = -1;
    data[45] = 1; data[46] = 1; data[47] = -1; data[48] = 1; data[51] = -1;
    data[52] = -1; data[53] = -1; data[54] = -1; data[55] = -1; data[56] = 1;
    data[58] = -1; data[63] = 1; data[64] = -1; data[65] = -1; data[66] = 1;
    data[67] = -1; data[68] = -1; data[74] = 1; data[75] = -1; data[76] = 1;
    }




      if (boardnum == 537){
    player = -1;
    isLastPass = false;
    data[16] = 1; data[23] = 1; data[25] = 1; data[26] = 1; data[33] = -1;
    data[34] = 1; data[35] = -1; data[36] = 1; data[37] = -1; data[43] = -1;
    data[44] = -1; data[45] = 1; data[46] = -1; data[47] = -1; data[48] = -1;
    data[54] = -1; data[55] = -1; data[56] = 1; data[65] = -1; }




      if (boardnum == 538){
    player = -1;
    isLastPass = false;
    data[11] = -1; data[12] = -1; data[15] = 1; data[16] = 1; data[22] = -1;
    data[23] = -1; data[24] = 1; data[25] = 1; data[26] = 1; data[32] = 1;
    data[33] = 1; data[34] = 1; data[35] = 1; data[36] = 1; data[42] = 1;
    data[43] = 1; data[44] = -1; data[45] = 1; data[46] = 1; data[47] = 1;
    data[51] = 1; data[53] = -1; data[54] = 1; data[55] = 1; data[56] = 1;
    data[65] = 1; data[66] = 1; data[74] = 1; data[75] = -1; }




      if (boardnum == 539){
    player = -1;
    isLastPass = false;
    data[15] = -1; data[17] = 1; data[18] = 1; data[23] = -1; data[25] = 1;
    data[26] = 1; data[27] = 1; data[33] = -1; data[34] = -1; data[35] = 1;
    data[36] = 1; data[37] = -1; data[43] = -1; data[44] = 1; data[45] = -1;
    data[46] = 1; data[47] = 1; data[52] = -1; data[53] = -1; data[54] = -1;
    data[55] = -1; data[56] = 1; data[65] = -1; }




      if (boardnum == 540){
    player = -1;
    isLastPass = false;
    data[13] = 1; data[15] = -1; data[23] = 1; data[24] = -1; data[25] = -1;
    data[27] = 1; data[32] = 1; data[33] = -1; data[34] = -1; data[35] = 1;
    data[36] = 1; data[37] = -1; data[38] = -1; data[42] = 1; data[43] = -1;
    data[44] = -1; data[45] = 1; data[46] = 1; data[52] = -1; data[53] = -1;
    data[54] = 1; data[55] = 1; data[57] = 1; data[64] = 1; data[66] = -1;
    data[68] = 1; data[73] = 1; data[74] = 1; data[75] = -1; }




      if (boardnum == 541){
    player = 1;
    isLastPass = false;
    data[14] = -1; data[24] = -1; data[25] = -1; data[31] = -1; data[32] = -1;
    data[33] = -1; data[34] = 1; data[35] = 1; data[36] = -1; data[37] = -1;
    data[41] = 1; data[42] = 1; data[43] = 1; data[44] = 1; data[45] = 1;
    data[46] = 1; data[47] = -1; data[52] = 1; data[53] = 1; data[54] = -1;
    data[55] = 1; data[56] = 1; data[57] = 1; data[62] = 1; data[63] = 1;
    data[64] = 1; data[65] = -1; data[66] = 1; data[73] = 1; data[74] = 1;
    data[75] = 1; data[84] = 1; data[85] = 1; data[86] = 1; }




      if (boardnum == 542){
    player = 1;
    isLastPass = false;
    data[11] = -1; data[14] = -1; data[15] = -1; data[16] = -1; data[17] = -1;
    data[22] = -1; data[24] = -1; data[25] = 1; data[26] = -1; data[31] = -1;
    data[32] = 1; data[33] = -1; data[34] = 1; data[35] = -1; data[36] = 1;
    data[37] = -1; data[41] = -1; data[42] = -1; data[43] = 1; data[44] = 1;
    data[45] = 1; data[46] = -1; data[47] = -1; data[51] = -1; data[52] = -1;
    data[53] = -1; data[54] = -1; data[55] = -1; data[56] = 1; data[57] = -1;
    data[62] = 1; data[63] = 1; data[64] = 1; data[65] = 1; data[66] = 1;
    data[67] = 1; data[68] = -1; data[73] = 1; data[74] = 1; data[75] = 1;
    data[76] = 1; data[84] = 1; data[85] = 1; data[86] = 1; }




      if (boardnum == 543){
    player = 1;
    isLastPass = false;
    data[11] = 1; data[13] = -1; data[14] = -1; data[16] = -1; data[21] = -1;
    data[22] = 1; data[23] = 1; data[24] = -1; data[25] = -1; data[26] = -1;
    data[32] = 1; data[33] = 1; data[34] = -1; data[35] = -1; data[36] = -1;
    data[41] = 1; data[42] = 1; data[43] = 1; data[44] = 1; data[45] = 1;
    data[46] = 1; data[47] = -1; data[51] = 1; data[52] = -1; data[53] = 1;
    data[54] = -1; data[55] = -1; data[56] = -1; data[58] = -1; data[61] = -1;
    data[62] = -1; data[63] = -1; data[64] = 1; data[65] = -1; data[73] = -1;
    data[74] = -1; data[76] = -1; data[83] = -1; }




      if (boardnum == 544){
    player = -1;
    isLastPass = false;
    data[12] = 1; data[23] = 1; data[24] = 1; data[25] = 1; data[32] = 1;
    data[34] = 1; data[35] = 1; data[36] = 1; data[42] = -1; data[43] = 1;
    data[44] = -1; data[45] = 1; data[46] = 1; data[51] = -1; data[52] = 1;
    data[53] = -1; data[54] = 1; data[55] = -1; data[56] = 1; data[57] = 1;
    data[61] = 1; data[62] = 1; data[63] = 1; data[64] = 1; data[65] = 1;
    data[66] = -1; data[71] = -1; data[72] = 1; data[73] = 1; data[74] = 1;
    data[75] = 1; data[76] = 1; data[82] = 1; data[83] = 1; data[84] = 1;
    }




      if (boardnum == 545){
    player = -1;
    isLastPass = false;
    data[15] = 1; data[16] = 1; data[17] = 1; data[18] = 1; data[21] = 1;
    data[22] = -1; data[23] = 1; data[24] = 1; data[25] = 1; data[26] = -1;
    data[27] = 1; data[32] = -1; data[33] = -1; data[34] = 1; data[35] = 1;
    data[36] = 1; data[37] = -1; data[41] = 1; data[42] = -1; data[43] = -1;
    data[44] = 1; data[45] = 1; data[46] = 1; data[47] = -1; data[48] = -1;
    data[52] = -1; data[54] = 1; data[55] = -1; data[56] = 1; data[57] = 1;
    data[58] = -1; data[62] = 1; data[63] = 1; data[64] = 1; data[65] = 1;
    data[66] = 1; data[67] = 1; data[68] = -1; data[73] = 1; data[74] = 1;
    data[75] = 1; data[76] = 1; data[85] = -1; }




      if (boardnum == 546){
    player = -1;
    isLastPass = false;
    data[12] = -1; data[13] = 1; data[23] = -1; data[24] = 1; data[27] = 1;
    data[28] = -1; data[33] = 1; data[34] = -1; data[37] = -1; data[44] = 1;
    data[45] = -1; data[46] = -1; data[47] = 1; data[54] = -1; data[55] = 1;
    data[56] = -1; data[64] = -1; data[65] = 1; data[66] = 1; }




      if (boardnum == 547){
    player = 1;
    isLastPass = false;
    data[11] = -1; data[14] = -1; data[16] = -1; data[21] = -1; data[22] = 1;
    data[23] = 1; data[24] = 1; data[26] = -1; data[31] = -1; data[32] = -1;
    data[33] = -1; data[34] = 1; data[35] = -1; data[36] = -1; data[41] = 1;
    data[43] = -1; data[44] = -1; data[45] = -1; data[47] = -1; data[52] = 1;
    data[53] = -1; data[54] = -1; data[55] = 1; data[56] = -1; data[61] = 1;
    data[62] = 1; data[63] = -1; data[64] = 1; data[65] = -1; data[66] = 1;
    data[72] = -1; data[73] = 1; data[74] = 1; data[75] = 1; data[76] = 1;
    data[77] = 1; data[81] = -1; data[83] = -1; }




      if (boardnum == 548){
    player = 1;
    isLastPass = false;
    data[13] = 1; data[14] = 1; data[15] = -1; data[17] = -1; data[18] = -1;
    data[24] = 1; data[25] = 1; data[26] = 1; data[27] = 1; data[28] = 1;
    data[31] = 1; data[32] = 1; data[33] = 1; data[34] = 1; data[35] = -1;
    data[36] = 1; data[37] = 1; data[38] = 1; data[42] = 1; data[43] = 1;
    data[44] = -1; data[45] = -1; data[46] = 1; data[53] = 1; data[54] = 1;
    data[55] = -1; data[56] = 1; data[62] = 1; data[64] = 1; data[65] = -1;
    }




      if (boardnum == 549){
    player = 1;
    isLastPass = false;
    data[16] = 1; data[25] = 1; data[26] = 1; data[34] = 1; data[35] = 1;
    data[36] = 1; data[37] = -1; data[42] = -1; data[43] = -1; data[44] = -1;
    data[45] = -1; data[46] = -1; data[53] = -1; data[54] = -1; data[55] = -1;
    data[63] = -1; data[64] = -1; data[73] = -1; }




      if (boardnum == 550){
    player = -1;
    isLastPass = false;
    data[13] = -1; data[14] = -1; data[15] = -1; data[16] = -1; data[22] = 1;
    data[23] = -1; data[24] = -1; data[25] = -1; data[26] = -1; data[32] = -1;
    data[33] = 1; data[34] = -1; data[35] = -1; data[36] = -1; data[37] = -1;
    data[38] = 1; data[41] = -1; data[42] = -1; data[43] = -1; data[44] = 1;
    data[45] = 1; data[46] = -1; data[47] = 1; data[53] = 1; data[54] = 1;
    data[55] = 1; data[56] = 1; data[58] = -1; data[64] = 1; data[65] = 1;
    data[66] = 1; data[67] = 1; data[75] = -1; }




      if (boardnum == 551){
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




      if (boardnum == 552){
    player = 1;
    isLastPass = false;
    data[11] = 1; data[12] = 1; data[13] = 1; data[14] = -1; data[23] = -1;
    data[24] = -1; data[25] = 1; data[31] = -1; data[32] = -1; data[33] = 1;
    data[34] = -1; data[35] = 1; data[36] = 1; data[42] = -1; data[43] = -1;
    data[44] = -1; data[45] = -1; data[46] = 1; data[47] = 1; data[52] = 1;
    data[53] = 1; data[54] = -1; data[55] = 1; data[56] = 1; data[62] = 1;
    data[63] = 1; data[64] = 1; data[65] = 1; data[67] = 1; data[73] = 1;
    data[74] = 1; data[75] = 1; data[78] = 1; data[82] = 1; }




      if (boardnum == 553){
    player = -1;
    isLastPass = false;
    data[13] = -1; data[14] = -1; data[15] = -1; data[16] = -1; data[23] = 1;
    data[24] = 1; data[25] = 1; data[26] = 1; data[27] = 1; data[32] = 1;
    data[33] = 1; data[34] = 1; data[35] = -1; data[36] = 1; data[37] = 1;
    data[38] = -1; data[43] = 1; data[44] = -1; data[45] = 1; data[46] = -1;
    data[47] = 1; data[48] = -1; data[53] = 1; data[54] = 1; data[55] = -1;
    data[56] = 1; data[57] = 1; data[58] = -1; data[64] = 1; data[65] = 1;
    data[66] = 1; data[67] = 1; data[68] = -1; data[75] = 1; data[76] = 1;
    data[78] = -1; data[88] = -1; }




      if (boardnum == 554){
    player = 1;
    isLastPass = false;
    data[32] = -1; data[34] = 1; data[35] = -1; data[36] = -1; data[38] = 1;
    data[42] = 1; data[43] = 1; data[44] = 1; data[45] = -1; data[46] = -1;
    data[47] = 1; data[53] = 1; data[54] = -1; data[55] = -1; data[56] = 1;
    data[57] = 1; data[58] = 1; data[62] = 1; data[63] = -1; data[64] = -1;
    data[65] = -1; data[66] = -1; data[67] = 1; data[76] = -1; }




      if (boardnum == 555){
    player = 1;
    isLastPass = false;
    data[32] = -1; data[36] = -1; data[42] = 1; data[43] = 1; data[44] = 1;
    data[45] = -1; data[46] = -1; data[53] = 1; data[54] = -1; data[55] = -1;
    data[56] = -1; data[57] = -1; data[62] = 1; data[64] = -1; data[65] = -1;
    data[66] = -1; data[67] = 1; data[76] = -1; }




      if (boardnum == 556){
    player = -1;
    isLastPass = false;
    data[22] = -1; data[23] = 1; data[33] = -1; data[34] = 1; data[35] = 1;
    data[42] = 1; data[43] = 1; data[44] = 1; data[45] = 1; data[46] = 1;
    data[53] = 1; data[54] = -1; data[55] = -1; data[56] = 1; data[57] = 1;
    data[62] = -1; data[63] = -1; data[64] = -1; data[65] = -1; data[66] = -1;
    data[73] = 1; data[75] = 1; data[76] = -1; data[77] = -1; data[78] = -1;
    }




      if (boardnum == 557){
    player = 1;
    isLastPass = false;
    data[13] = -1; data[14] = 1; data[15] = 1; data[24] = 1; data[25] = 1;
    data[26] = 1; data[32] = 1; data[33] = 1; data[34] = 1; data[35] = 1;
    data[36] = 1; data[37] = 1; data[38] = 1; data[42] = 1; data[43] = 1;
    data[44] = -1; data[45] = 1; data[46] = -1; data[52] = 1; data[53] = 1;
    data[54] = 1; data[55] = -1; data[56] = -1; data[57] = -1; data[62] = 1;
    data[63] = 1; data[64] = 1; data[66] = -1; data[73] = 1; data[74] = 1;
    }




      if (boardnum == 558){
    player = 1;
    isLastPass = false;
    data[23] = -1; data[25] = 1; data[34] = -1; data[35] = 1; data[44] = -1;
    data[45] = -1; data[46] = -1; data[52] = 1; data[53] = 1; data[54] = -1;
    data[55] = -1; data[56] = 1; data[64] = 1; data[65] = 1; data[75] = 1;
    data[76] = 1; }




      if (boardnum == 559){
    player = -1;
    isLastPass = false;
    data[13] = 1; data[15] = 1; data[23] = 1; data[24] = 1; data[25] = 1;
    data[26] = 1; data[32] = 1; data[33] = 1; data[34] = -1; data[35] = -1;
    data[36] = 1; data[37] = 1; data[38] = 1; data[42] = 1; data[43] = 1;
    data[44] = -1; data[45] = 1; data[46] = -1; data[47] = 1; data[53] = -1;
    data[54] = -1; data[55] = -1; data[56] = 1; data[64] = -1; data[65] = 1;
    data[66] = 1; data[76] = 1; }




      if (boardnum == 560){
    player = 1;
    isLastPass = false;
    data[33] = 1; data[34] = -1; data[35] = -1; data[37] = 1; data[42] = 1;
    data[43] = 1; data[44] = -1; data[45] = -1; data[46] = 1; data[54] = -1;
    data[55] = -1; data[56] = 1; data[64] = 1; data[65] = -1; data[66] = 1;
    data[74] = 1; data[75] = -1; data[76] = 1; }




      if (boardnum == 561){
    player = 1;
    isLastPass = false;
    data[32] = -1; data[34] = 1; data[35] = -1; data[36] = -1; data[38] = 1;
    data[42] = 1; data[43] = 1; data[44] = 1; data[45] = -1; data[46] = -1;
    data[47] = -1; data[48] = -1; data[53] = 1; data[54] = -1; data[55] = -1;
    data[56] = 1; data[57] = 1; data[58] = 1; data[62] = 1; data[63] = -1;
    data[64] = -1; data[65] = -1; data[66] = 1; data[67] = 1; data[74] = -1;
    data[75] = 1; data[76] = 1; data[86] = 1; }




      if (boardnum == 562){
    player = -1;
    isLastPass = false;
    data[14] = 1; data[23] = -1; data[24] = 1; data[25] = -1; data[26] = -1;
    data[34] = 1; data[36] = -1; data[44] = 1; data[45] = 1; data[46] = 1;
    data[47] = -1; data[54] = 1; data[55] = 1; data[58] = -1; data[65] = 1;
    }




      if (boardnum == 563){
    player = -1;
    isLastPass = false;
    data[32] = -1; data[33] = -1; data[34] = -1; data[35] = -1; data[36] = -1;
    data[37] = -1; data[42] = -1; data[43] = 1; data[44] = -1; data[45] = 1;
    data[46] = 1; data[47] = 1; data[48] = 1; data[51] = -1; data[53] = -1;
    data[54] = -1; data[55] = -1; data[56] = 1; data[57] = 1; data[58] = 1;
    data[62] = -1; data[64] = -1; data[67] = -1; data[68] = 1; data[73] = -1;
    }




      if (boardnum == 564){
    player = 1;
    isLastPass = false;
    data[33] = 1; data[34] = 1; data[35] = 1; data[36] = 1; data[37] = 1;
    data[42] = 1; data[43] = 1; data[44] = -1; data[45] = 1; data[46] = 1;
    data[52] = -1; data[53] = -1; data[54] = -1; data[55] = -1; data[56] = 1;
    data[63] = 1; data[64] = 1; data[65] = -1; data[66] = 1; data[72] = 1;
    data[74] = 1; data[75] = 1; data[76] = 1; data[83] = -1; data[84] = 1;
    data[86] = 1; }




      if (boardnum == 565){
    player = 1;
    isLastPass = false;
    data[13] = -1; data[14] = -1; data[15] = -1; data[16] = -1; data[23] = -1;
    data[24] = -1; data[25] = -1; data[26] = -1; data[33] = -1; data[34] = -1;
    data[35] = 1; data[36] = -1; data[42] = -1; data[43] = 1; data[44] = 1;
    data[45] = 1; data[46] = -1; data[47] = -1; data[48] = -1; data[53] = 1;
    data[54] = 1; data[55] = 1; data[56] = -1; data[57] = -1; data[58] = -1;
    data[63] = 1; data[64] = -1; data[65] = -1; data[66] = -1; data[67] = 1;
    data[74] = -1; data[75] = 1; }




      if (boardnum == 566){
    player = -1;
    isLastPass = false;
    data[25] = 1; data[34] = 1; data[35] = 1; data[36] = 1; data[44] = 1;
    data[45] = 1; data[46] = -1; data[47] = 1; data[54] = 1; data[55] = -1;
    data[57] = -1; data[64] = -1; data[65] = -1; data[66] = -1; data[67] = -1;
    data[75] = -1; data[76] = 1; }




      if (boardnum == 567){
    player = -1;
    isLastPass = false;
    data[11] = -1; data[12] = 1; data[13] = -1; data[21] = 1; data[22] = 1;
    data[23] = -1; data[24] = -1; data[26] = -1; data[32] = 1; data[33] = -1;
    data[34] = -1; data[36] = -1; data[37] = -1; data[38] = 1; data[41] = 1;
    data[42] = 1; data[43] = 1; data[44] = -1; data[45] = -1; data[46] = 1;
    data[47] = -1; data[48] = 1; data[52] = 1; data[53] = -1; data[54] = -1;
    data[55] = -1; data[56] = -1; data[57] = -1; data[58] = 1; data[63] = 1;
    data[64] = -1; data[65] = 1; data[66] = -1; data[67] = -1; data[72] = 1;
    data[73] = 1; data[74] = 1; data[75] = -1; data[81] = 1; }




      if (boardnum == 568){
    player = -1;
    isLastPass = false;
    data[13] = -1; data[24] = -1; data[33] = -1; data[34] = 1; data[35] = -1;
    data[36] = 1; data[37] = 1; data[44] = 1; data[45] = 1; data[46] = 1;
    data[53] = -1; data[54] = 1; data[55] = 1; data[64] = 1; data[65] = 1;
    }




      if (boardnum == 569){
    player = 1;
    isLastPass = false;
    data[12] = -1; data[13] = 1; data[23] = -1; data[24] = 1; data[25] = 1;
    data[31] = -1; data[32] = -1; data[33] = 1; data[34] = -1; data[35] = 1;
    data[36] = 1; data[43] = 1; data[44] = 1; data[45] = 1; data[46] = 1;
    data[52] = 1; data[53] = 1; data[54] = -1; data[55] = 1; data[56] = 1;
    data[62] = 1; data[63] = 1; data[64] = 1; data[65] = 1; data[73] = 1;
    data[74] = 1; data[75] = 1; data[82] = 1; }




      if (boardnum == 570){
    player = -1;
    isLastPass = false;
    data[11] = -1; data[22] = -1; data[23] = 1; data[26] = 1; data[32] = 1;
    data[33] = -1; data[34] = -1; data[35] = 1; data[36] = -1; data[41] = 1;
    data[44] = 1; data[45] = -1; data[52] = 1; data[54] = -1; data[55] = 1;
    data[56] = 1; data[63] = 1; data[64] = -1; data[73] = 1; data[74] = 1;
    data[75] = 1; }




      if (boardnum == 571){
    player = 1;
    isLastPass = false;
    data[11] = -1; data[22] = -1; data[23] = 1; data[26] = 1; data[32] = 1;
    data[33] = -1; data[34] = -1; data[35] = 1; data[36] = -1; data[41] = 1;
    data[44] = 1; data[45] = -1; data[52] = 1; data[54] = -1; data[55] = -1;
    data[56] = 1; data[63] = 1; data[64] = -1; data[65] = -1; data[73] = 1;
    data[74] = 1; data[75] = 1; }




      if (boardnum == 572){
    player = 1;
    isLastPass = false;
    data[13] = -1; data[14] = -1; data[15] = -1; data[16] = -1; data[22] = -1;
    data[23] = -1; data[24] = 1; data[25] = 1; data[26] = 1; data[32] = 1;
    data[33] = -1; data[34] = -1; data[35] = 1; data[36] = 1; data[37] = 1;
    data[38] = 1; data[42] = 1; data[43] = 1; data[44] = -1; data[45] = -1;
    data[46] = 1; data[47] = 1; data[48] = 1; data[52] = 1; data[53] = 1;
    data[54] = 1; data[55] = -1; data[56] = 1; data[57] = 1; data[58] = 1;
    data[62] = 1; data[63] = 1; data[64] = 1; data[66] = 1; data[67] = 1;
    data[73] = 1; data[74] = 1; data[76] = 1; }




      if (boardnum == 573){
    player = -1;
    isLastPass = false;
    data[13] = -1; data[14] = 1; data[15] = 1; data[23] = 1; data[24] = 1;
    data[25] = 1; data[26] = 1; data[32] = 1; data[33] = 1; data[34] = 1;
    data[35] = 1; data[36] = 1; data[37] = 1; data[43] = 1; data[44] = 1;
    data[45] = -1; data[46] = 1; data[52] = 1; data[53] = 1; data[54] = -1;
    data[55] = 1; data[56] = -1; data[57] = -1; data[58] = -1; data[62] = 1;
    data[63] = 1; data[64] = 1; data[65] = -1; data[66] = -1; data[67] = -1;
    data[75] = -1; data[76] = -1; data[85] = -1; }




      if (boardnum == 574){
    player = 1;
    isLastPass = false;
    data[24] = -1; data[25] = 1; data[33] = -1; data[34] = 1; data[35] = -1;
    data[36] = -1; data[43] = 1; data[44] = 1; data[45] = -1; data[46] = -1;
    data[52] = 1; data[53] = 1; data[54] = -1; data[55] = -1; data[56] = -1;
    data[57] = 1; data[62] = 1; data[63] = 1; data[64] = 1; data[65] = -1;
    data[66] = -1; data[67] = -1; data[75] = 1; data[76] = -1; }




      if (boardnum == 575){
    player = -1;
    isLastPass = false;
    data[13] = -1; data[14] = -1; data[15] = -1; data[16] = -1; data[23] = -1;
    data[24] = -1; data[25] = -1; data[26] = -1; data[32] = -1; data[33] = -1;
    data[34] = -1; data[35] = -1; data[36] = -1; data[38] = 1; data[43] = -1;
    data[44] = -1; data[45] = -1; data[46] = -1; data[47] = 1; data[54] = 1;
    data[55] = 1; data[56] = 1; data[58] = -1; data[65] = 1; data[67] = 1;
    }




      if (boardnum == 576){
    player = -1;
    isLastPass = false;
    data[13] = 1; data[15] = 1; data[16] = 1; data[17] = -1; data[18] = -1;
    data[23] = 1; data[24] = 1; data[25] = 1; data[26] = 1; data[27] = 1;
    data[33] = 1; data[34] = 1; data[35] = -1; data[36] = -1; data[37] = 1;
    data[38] = 1; data[43] = 1; data[44] = -1; data[45] = 1; data[46] = -1;
    data[47] = 1; data[48] = -1; data[53] = 1; data[54] = -1; data[55] = -1;
    data[56] = 1; data[57] = -1; data[58] = -1; data[63] = 1; data[64] = 1;
    data[65] = 1; data[66] = 1; data[67] = 1; data[73] = 1; data[74] = 1;
    data[75] = 1; data[76] = 1; data[82] = 1; data[83] = 1; }




      if (boardnum == 577){
    player = 1;
    isLastPass = false;
    data[32] = -1; data[33] = -1; data[34] = -1; data[35] = -1; data[36] = -1;
    data[38] = 1; data[42] = 1; data[43] = 1; data[44] = -1; data[45] = -1;
    data[46] = -1; data[47] = -1; data[48] = -1; data[53] = 1; data[54] = -1;
    data[55] = -1; data[56] = 1; data[57] = 1; data[58] = 1; data[61] = -1;
    data[62] = -1; data[63] = 1; data[64] = -1; data[65] = 1; data[66] = 1;
    data[67] = 1; data[73] = 1; data[74] = 1; data[75] = 1; data[76] = 1;
    data[83] = 1; data[86] = 1; }




      if (boardnum == 578){
    player = 1;
    isLastPass = false;
    data[13] = 1; data[14] = -1; data[15] = -1; data[16] = -1; data[17] = -1;
    data[18] = -1; data[24] = 1; data[25] = -1; data[26] = 1; data[27] = 1;
    data[31] = -1; data[32] = -1; data[33] = -1; data[34] = -1; data[35] = -1;
    data[36] = -1; data[37] = -1; data[42] = 1; data[43] = 1; data[44] = -1;
    data[45] = 1; data[47] = -1; data[52] = 1; data[53] = 1; data[54] = 1;
    data[55] = 1; data[56] = -1; data[63] = 1; data[64] = -1; data[65] = -1;
    data[66] = -1; data[67] = -1; data[68] = -1; data[74] = 1; }




      if (boardnum == 579){
    player = -1;
    isLastPass = false;
    data[13] = 1; data[14] = 1; data[15] = 1; data[16] = 1; data[17] = 1;
    data[18] = 1; data[22] = -1; data[23] = 1; data[24] = 1; data[25] = 1;
    data[26] = 1; data[27] = 1; data[28] = 1; data[32] = -1; data[33] = -1;
    data[34] = -1; data[35] = 1; data[36] = -1; data[37] = 1; data[38] = -1;
    data[42] = 1; data[43] = 1; data[44] = -1; data[45] = 1; data[46] = 1;
    data[47] = -1; data[54] = 1; data[55] = -1; data[56] = -1; data[57] = 1;
    data[68] = 1; }




      if (boardnum == 580){
    player = 1;
    isLastPass = false;
    data[11] = -1; data[12] = -1; data[13] = -1; data[16] = 1; data[17] = -1;
    data[18] = -1; data[23] = 1; data[24] = -1; data[25] = -1; data[26] = -1;
    data[27] = -1; data[28] = -1; data[31] = 1; data[33] = -1; data[34] = 1;
    data[35] = 1; data[36] = 1; data[37] = 1; data[38] = 1; data[42] = 1;
    data[43] = -1; data[44] = -1; data[45] = 1; data[46] = 1; data[47] = 1;
    data[52] = -1; data[53] = 1; data[54] = 1; data[55] = 1; data[56] = 1;
    data[57] = 1; data[62] = 1; data[63] = 1; data[64] = 1; data[65] = 1;
    data[73] = 1; }




      if (boardnum == 581){
    player = -1;
    isLastPass = false;
    data[11] = -1; data[12] = 1; data[14] = -1; data[15] = -1; data[16] = -1;
    data[21] = -1; data[23] = 1; data[24] = -1; data[25] = -1; data[26] = -1;
    data[31] = -1; data[32] = -1; data[33] = -1; data[34] = 1; data[35] = -1;
    data[36] = -1; data[37] = -1; data[41] = -1; data[42] = 1; data[43] = 1;
    data[44] = -1; data[45] = 1; data[46] = 1; data[47] = 1; data[48] = 1;
    data[51] = -1; data[52] = 1; data[53] = -1; data[54] = 1; data[55] = 1;
    data[56] = 1; data[61] = -1; data[62] = -1; data[63] = 1; data[64] = 1;
    data[65] = 1; data[71] = -1; data[72] = 1; data[73] = 1; data[74] = 1;
    data[81] = 1; }




      if (boardnum == 582){
    player = -1;
    isLastPass = false;
    data[13] = -1; data[15] = 1; data[22] = -1; data[24] = 1; data[25] = 1;
    data[33] = 1; data[35] = -1; data[36] = -1; data[37] = 1; data[42] = 1;
    data[44] = -1; data[45] = -1; data[46] = 1; data[54] = -1; data[55] = 1;
    data[56] = -1; data[57] = -1; data[63] = -1; data[64] = 1; data[65] = -1;
    data[66] = 1; data[67] = -1; data[76] = -1; data[77] = 1; data[88] = 1;
    }




      if (boardnum == 583){
    player = 1;
    isLastPass = false;
    data[36] = -1; data[37] = -1; data[38] = -1; data[43] = 1; data[44] = 1;
    data[45] = 1; data[46] = 1; data[47] = 1; data[53] = -1; data[54] = -1;
    data[55] = 1; data[56] = 1; data[57] = -1; data[63] = -1; data[64] = 1;
    data[65] = 1; data[66] = -1; data[67] = -1; data[73] = 1; data[74] = 1;
    data[75] = -1; data[76] = -1; data[84] = 1; data[85] = 1; data[86] = 1;
    data[87] = 1; }




      if (boardnum == 584){
    player = 1;
    isLastPass = false;
    data[25] = 1; data[34] = 1; data[35] = 1; data[36] = 1; data[43] = 1;
    data[44] = -1; data[45] = -1; data[46] = -1; data[47] = -1; data[53] = 1;
    data[54] = -1; data[55] = -1; data[56] = -1; data[63] = 1; data[64] = -1;
    data[65] = -1; }




      if (boardnum == 585){
    player = -1;
    isLastPass = false;
    data[33] = 1; data[34] = 1; data[35] = 1; data[42] = 1; data[43] = 1;
    data[44] = 1; data[45] = 1; data[46] = -1; data[52] = -1; data[53] = 1;
    data[54] = 1; data[55] = 1; data[56] = -1; data[64] = -1; data[66] = -1;
    }




      if (boardnum == 586){
    player = 1;
    isLastPass = false;
    data[13] = -1; data[14] = -1; data[15] = -1; data[16] = -1; data[22] = 1;
    data[23] = -1; data[24] = -1; data[25] = -1; data[26] = -1; data[32] = -1;
    data[33] = 1; data[34] = -1; data[35] = -1; data[36] = -1; data[37] = -1;
    data[38] = 1; data[41] = -1; data[42] = -1; data[43] = -1; data[44] = 1;
    data[45] = -1; data[46] = -1; data[47] = 1; data[53] = -1; data[54] = -1;
    data[55] = 1; data[56] = 1; data[58] = -1; data[63] = -1; data[64] = 1;
    data[65] = 1; data[66] = 1; data[67] = 1; data[75] = -1; }




      if (boardnum == 587){
    player = 1;
    isLastPass = false;
    data[24] = -1; data[34] = -1; data[35] = -1; data[36] = 1; data[42] = -1;
    data[43] = -1; data[44] = -1; data[45] = 1; data[46] = 1; data[52] = 1;
    data[53] = -1; data[54] = -1; data[55] = 1; data[56] = 1; data[62] = 1;
    data[63] = 1; data[64] = -1; data[65] = -1; data[66] = 1; data[73] = 1;
    data[74] = -1; data[75] = -1; }




      if (boardnum == 588){
    player = 1;
    isLastPass = false;
    data[12] = -1; data[13] = -1; data[14] = -1; data[15] = -1; data[16] = -1;
    data[17] = -1; data[18] = -1; data[23] = -1; data[24] = 1; data[25] = -1;
    data[26] = 1; data[27] = 1; data[33] = 1; data[34] = -1; data[35] = 1;
    data[36] = -1; data[37] = 1; data[38] = 1; data[43] = 1; data[44] = -1;
    data[45] = 1; data[46] = 1; data[47] = 1; data[48] = 1; data[53] = 1;
    data[54] = -1; data[55] = -1; data[56] = 1; data[57] = 1; data[58] = 1;
    data[63] = 1; data[64] = -1; data[65] = 1; data[66] = 1; data[67] = 1;
    data[68] = 1; data[73] = 1; data[74] = 1; data[75] = 1; data[76] = 1;
    data[82] = 1; data[83] = 1; data[84] = 1; data[85] = 1; }




      if (boardnum == 589){
    player = -1;
    isLastPass = false;
    data[14] = 1; data[24] = 1; data[26] = 1; data[33] = 1; data[34] = 1;
    data[35] = 1; data[36] = 1; data[42] = 1; data[44] = -1; data[45] = 1;
    data[46] = 1; data[51] = 1; data[52] = 1; data[53] = 1; data[54] = -1;
    data[55] = -1; data[56] = 1; data[62] = 1; data[63] = 1; data[64] = -1;
    data[66] = -1; data[73] = -1; data[75] = 1; }




      if (boardnum == 590){
    player = -1;
    isLastPass = false;
    data[25] = 1; data[26] = -1; data[32] = -1; data[33] = 1; data[34] = 1;
    data[35] = 1; data[42] = -1; data[43] = -1; data[44] = 1; data[45] = -1;
    data[46] = -1; data[52] = -1; data[53] = -1; data[54] = -1; data[55] = 1;
    data[56] = -1; data[57] = -1; data[58] = -1; data[63] = 1; data[64] = -1;
    data[65] = 1; data[66] = 1; data[67] = -1; data[68] = 1; data[74] = 1;
    data[75] = -1; data[76] = -1; data[77] = 1; data[84] = 1; data[86] = -1;
    data[88] = 1; }




      if (boardnum == 591){
    player = -1;
    isLastPass = false;
    data[26] = 1; data[33] = -1; data[34] = -1; data[35] = 1; data[43] = -1;
    data[44] = 1; data[45] = 1; data[46] = 1; data[53] = -1; data[54] = -1;
    data[55] = -1; data[56] = -1; data[57] = -1; data[64] = -1; data[65] = 1;
    data[66] = 1; data[73] = -1; data[74] = 1; data[75] = -1; data[76] = 1;
    data[83] = 1; data[84] = 1; data[85] = 1; data[86] = 1; data[87] = 1;
    }




      if (boardnum == 592){
    player = 1;
    isLastPass = false;
    data[13] = -1; data[14] = -1; data[15] = -1; data[16] = -1; data[17] = -1;
    data[22] = 1; data[24] = -1; data[25] = 1; data[26] = -1; data[32] = -1;
    data[33] = -1; data[34] = -1; data[35] = -1; data[36] = 1; data[43] = -1;
    data[44] = 1; data[45] = 1; data[46] = 1; data[47] = 1; data[53] = -1;
    data[54] = -1; data[55] = 1; data[56] = 1; data[63] = -1; data[64] = -1;
    data[65] = -1; }




      if (boardnum == 593){
    player = 1;
    isLastPass = false;
    data[11] = -1; data[12] = -1; data[13] = -1; data[14] = -1; data[15] = -1;
    data[16] = -1; data[17] = -1; data[21] = -1; data[22] = 1; data[23] = -1;
    data[24] = 1; data[25] = -1; data[26] = 1; data[31] = -1; data[32] = 1;
    data[33] = 1; data[34] = 1; data[35] = 1; data[36] = -1; data[37] = -1;
    data[41] = -1; data[42] = 1; data[43] = -1; data[44] = -1; data[45] = -1;
    data[46] = -1; data[47] = -1; data[52] = -1; data[53] = -1; data[54] = -1;
    data[55] = -1; data[56] = -1; data[57] = -1; data[61] = -1; data[62] = -1;
    data[63] = -1; data[64] = -1; data[65] = -1; data[73] = -1; data[74] = -1;
    data[75] = -1; data[76] = -1; data[84] = 1; data[87] = -1; }




      if (boardnum == 594){
    player = -1;
    isLastPass = false;
    data[11] = -1; data[15] = 1; data[21] = -1; data[23] = 1; data[24] = 1;
    data[31] = -1; data[32] = 1; data[33] = 1; data[34] = 1; data[35] = 1;
    data[37] = 1; data[41] = -1; data[42] = -1; data[43] = -1; data[44] = -1;
    data[45] = 1; data[46] = 1; data[51] = -1; data[52] = 1; data[53] = -1;
    data[54] = 1; data[55] = 1; data[56] = 1; data[61] = -1; data[62] = 1;
    data[63] = 1; data[64] = 1; data[65] = 1; data[67] = 1; data[71] = -1;
    data[72] = 1; }




      if (boardnum == 595){
    player = -1;
    isLastPass = false;
    data[24] = 1; data[25] = 1; data[26] = -1; data[31] = -1; data[33] = 1;
    data[34] = 1; data[35] = 1; data[36] = 1; data[37] = 1; data[42] = 1;
    data[44] = 1; data[45] = -1; data[46] = 1; data[47] = 1; data[51] = 1;
    data[53] = -1; data[54] = -1; data[55] = 1; data[56] = 1; data[63] = -1;
    data[73] = -1; }




      if (boardnum == 596){
    player = -1;
    isLastPass = false;
    data[23] = 1; data[24] = -1; data[32] = -1; data[33] = -1; data[34] = -1;
    data[44] = -1; data[45] = 1; data[46] = 1; data[47] = 1; data[54] = -1;
    data[55] = 1; data[56] = 1; data[63] = 1; data[64] = -1; data[66] = 1;
    }




      if (boardnum == 597){
    player = -1;
    isLastPass = false;
    data[11] = -1; data[12] = 1; data[13] = -1; data[14] = -1; data[15] = -1;
    data[16] = -1; data[22] = -1; data[23] = 1; data[24] = -1; data[25] = -1;
    data[26] = -1; data[33] = -1; data[34] = 1; data[35] = 1; data[36] = -1;
    data[42] = -1; data[43] = 1; data[44] = -1; data[45] = 1; data[46] = -1;
    data[47] = -1; data[48] = -1; data[53] = 1; data[54] = 1; data[55] = -1;
    data[56] = -1; data[57] = -1; data[58] = -1; data[63] = 1; data[64] = -1;
    data[65] = 1; data[66] = -1; data[67] = -1; data[74] = -1; data[75] = 1;
    data[76] = 1; data[78] = -1; }




      if (boardnum == 598){
    player = 1;
    isLastPass = false;
    data[13] = -1; data[15] = 1; data[16] = -1; data[24] = -1; data[25] = 1;
    data[26] = 1; data[33] = -1; data[34] = -1; data[35] = -1; data[36] = 1;
    data[37] = 1; data[43] = -1; data[44] = -1; data[45] = 1; data[46] = -1;
    data[53] = 1; data[54] = 1; data[55] = 1; data[56] = 1; data[57] = -1;
    }




      if (boardnum == 599){
    player = 1;
    isLastPass = false;
    data[11] = 1; data[12] = 1; data[13] = 1; data[14] = -1; data[23] = -1;
    data[24] = -1; data[25] = 1; data[31] = -1; data[32] = -1; data[33] = 1;
    data[34] = -1; data[35] = 1; data[36] = 1; data[42] = -1; data[43] = -1;
    data[44] = -1; data[45] = -1; data[46] = 1; data[47] = 1; data[52] = 1;
    data[53] = 1; data[54] = -1; data[55] = 1; data[56] = 1; data[62] = 1;
    data[63] = 1; data[64] = 1; data[65] = 1; data[67] = 1; data[73] = 1;
    data[74] = 1; data[75] = 1; data[78] = 1; data[82] = 1; }




      if (boardnum == 600){
    player = -1;
    isLastPass = false;
    data[13] = -1; data[24] = -1; data[33] = -1; data[34] = 1; data[35] = -1;
    data[36] = 1; data[37] = 1; data[44] = 1; data[45] = 1; data[46] = 1;
    data[47] = 1; data[53] = -1; data[54] = -1; data[55] = -1; data[56] = 1;
    data[64] = 1; data[65] = 1; data[74] = 1; data[76] = -1; }


  }
}
