import java.util.*;
import java.util.Scanner;

public class BoardData4 {
  final static int SIZE = 100;
  int data[] = new int[SIZE];
  int player;
  boolean isLastPass;

  public BoardData4(int boardnum){



      if (boardnum == 602){
    player = -1;
    isLastPass = false;
    data[13] = 1; data[15] = -1; data[18] = -1; data[23] = 1; data[24] = -1;
    data[25] = -1; data[27] = -1; data[32] = 1; data[33] = 1; data[34] = 1;
    data[35] = 1; data[36] = -1; data[37] = -1; data[38] = -1; data[42] = 1;
    data[43] = 1; data[44] = -1; data[45] = 1; data[46] = -1; data[47] = -1;
    data[52] = 1; data[53] = -1; data[54] = -1; data[55] = -1; data[56] = -1;
    data[57] = 1; data[61] = 1; data[63] = 1; data[64] = 1; data[65] = -1;
    data[66] = -1; data[67] = 1; data[68] = 1; data[73] = 1; data[74] = 1;
    data[75] = -1; data[76] = -1; data[77] = -1; data[88] = -1; }




      if (boardnum == 603){
    player = -1;
    isLastPass = false;
    data[11] = -1; data[14] = -1; data[16] = -1; data[21] = -1; data[22] = 1;
    data[23] = 1; data[24] = 1; data[26] = -1; data[31] = -1; data[32] = -1;
    data[33] = -1; data[34] = 1; data[35] = 1; data[36] = 1; data[37] = 1;
    data[41] = 1; data[43] = -1; data[44] = -1; data[45] = -1; data[47] = -1;
    data[52] = 1; data[53] = -1; data[54] = -1; data[55] = -1; data[56] = -1;
    data[61] = 1; data[62] = 1; data[63] = -1; data[64] = 1; data[65] = -1;
    data[66] = -1; data[71] = 1; data[72] = 1; data[73] = 1; data[74] = 1;
    data[75] = 1; data[76] = 1; data[77] = -1; data[81] = -1; data[83] = -1;
    data[88] = -1; }




      if (boardnum == 604){
    player = -1;
    isLastPass = false;
    data[23] = -1; data[24] = 1; data[27] = -1; data[32] = 1; data[33] = 1;
    data[34] = 1; data[35] = 1; data[36] = -1; data[37] = 1; data[42] = 1;
    data[43] = 1; data[44] = -1; data[45] = -1; data[46] = 1; data[47] = -1;
    data[52] = 1; data[53] = 1; data[54] = 1; data[55] = -1; data[56] = 1;
    data[58] = -1; data[61] = 1; data[62] = 1; data[63] = 1; data[64] = 1;
    data[65] = 1; data[66] = 1; data[73] = 1; data[74] = 1; data[75] = 1;
    data[76] = -1; data[77] = -1; data[78] = -1; data[82] = 1; data[87] = -1;
    }




      if (boardnum == 605){
    player = -1;
    isLastPass = false;
    data[24] = 1; data[33] = 1; data[34] = 1; data[35] = 1; data[36] = -1;
    data[43] = 1; data[44] = 1; data[45] = 1; data[46] = -1; data[53] = 1;
    data[54] = -1; data[55] = 1; data[56] = 1; data[63] = -1; data[64] = 1;
    data[65] = 1; data[73] = 1; }




      if (boardnum == 606){
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




      if (boardnum == 607){
    player = -1;
    isLastPass = false;
    data[18] = 1; data[24] = -1; data[25] = 1; data[26] = 1; data[28] = 1;
    data[33] = -1; data[34] = -1; data[35] = -1; data[36] = -1; data[37] = -1;
    data[38] = 1; data[43] = 1; data[44] = 1; data[45] = 1; data[46] = -1;
    data[47] = -1; data[48] = 1; data[54] = 1; data[55] = -1; data[56] = -1;
    data[57] = 1; data[58] = 1; data[66] = -1; data[67] = 1; data[68] = 1;
    }




      if (boardnum == 608){
    player = -1;
    isLastPass = false;
    data[13] = 1; data[23] = 1; data[24] = 1; data[25] = -1; data[27] = 1;
    data[32] = 1; data[33] = -1; data[34] = -1; data[35] = 1; data[36] = 1;
    data[37] = -1; data[38] = -1; data[42] = 1; data[43] = -1; data[44] = -1;
    data[45] = 1; data[46] = 1; data[52] = -1; data[53] = -1; data[54] = 1;
    data[55] = 1; data[57] = 1; data[64] = -1; data[66] = -1; data[68] = 1;
    data[74] = 1; data[75] = -1; }




      if (boardnum == 609){
    player = 1;
    isLastPass = false;
    data[23] = -1; data[33] = -1; data[34] = -1; data[35] = 1; data[43] = -1;
    data[44] = 1; data[45] = 1; data[46] = 1; data[52] = -1; data[53] = -1;
    data[54] = -1; data[55] = -1; data[56] = -1; data[57] = -1; data[62] = 1;
    data[63] = -1; data[64] = -1; data[65] = -1; data[73] = -1; data[74] = -1;
    data[75] = -1; data[76] = -1; data[84] = 1; data[87] = -1; }




      if (boardnum == 610){
    player = -1;
    isLastPass = false;
    data[21] = 1; data[24] = -1; data[25] = 1; data[31] = 1; data[32] = 1;
    data[33] = -1; data[34] = 1; data[35] = 1; data[41] = 1; data[42] = -1;
    data[43] = 1; data[44] = -1; data[45] = 1; data[51] = 1; data[52] = 1;
    data[53] = -1; data[54] = 1; data[55] = 1; data[56] = 1; data[57] = 1;
    data[61] = 1; data[62] = 1; data[63] = 1; data[64] = -1; data[65] = 1;
    data[66] = 1; data[71] = 1; data[73] = -1; data[74] = 1; data[75] = 1;
    data[82] = -1; data[83] = -1; data[84] = -1; data[85] = 1; data[86] = -1;
    }




      if (boardnum == 611){
    player = -1;
    isLastPass = false;
    data[13] = -1; data[14] = -1; data[15] = -1; data[16] = -1; data[17] = -1;
    data[22] = 1; data[24] = -1; data[25] = 1; data[26] = -1; data[33] = 1;
    data[34] = 1; data[35] = -1; data[36] = 1; data[43] = -1; data[44] = 1;
    data[45] = 1; data[46] = 1; data[47] = 1; data[53] = -1; data[54] = -1;
    data[55] = 1; data[56] = 1; data[63] = -1; data[64] = -1; data[65] = -1;
    }




      if (boardnum == 612){
    player = -1;
    isLastPass = false;
    data[11] = -1; data[12] = 1; data[13] = 1; data[14] = 1; data[15] = 1;
    data[16] = 1; data[17] = 1; data[18] = 1; data[21] = 1; data[22] = 1;
    data[23] = 1; data[24] = -1; data[25] = -1; data[26] = 1; data[27] = -1;
    data[31] = -1; data[32] = 1; data[33] = -1; data[34] = 1; data[35] = 1;
    data[36] = -1; data[43] = 1; data[44] = 1; data[45] = -1; data[46] = 1;
    data[53] = 1; data[54] = -1; data[55] = -1; data[56] = 1; data[62] = 1;
    data[64] = -1; data[65] = -1; data[66] = -1; data[74] = 1; data[76] = -1;
    }




      if (boardnum == 613){
    player = 1;
    isLastPass = false;
    data[25] = 1; data[32] = -1; data[34] = 1; data[35] = 1; data[36] = 1;
    data[38] = 1; data[42] = 1; data[43] = 1; data[44] = 1; data[45] = 1;
    data[46] = -1; data[47] = 1; data[48] = -1; data[53] = 1; data[54] = -1;
    data[55] = 1; data[56] = 1; data[57] = 1; data[58] = 1; data[61] = -1;
    data[62] = -1; data[63] = -1; data[64] = -1; data[65] = 1; data[66] = 1;
    data[67] = 1; data[74] = -1; data[75] = 1; data[76] = 1; data[83] = 1;
    data[85] = -1; data[86] = 1; }




      if (boardnum == 614){
    player = -1;
    isLastPass = false;
    data[11] = -1; data[12] = -1; data[13] = -1; data[14] = -1; data[15] = -1;
    data[16] = -1; data[17] = -1; data[18] = -1; data[23] = 1; data[24] = -1;
    data[25] = 1; data[26] = 1; data[27] = -1; data[28] = -1; data[31] = 1;
    data[33] = 1; data[34] = 1; data[35] = 1; data[36] = 1; data[37] = 1;
    data[38] = 1; data[42] = 1; data[43] = 1; data[44] = -1; data[45] = 1;
    data[46] = 1; data[47] = 1; data[52] = 1; data[53] = 1; data[54] = 1;
    data[55] = 1; data[56] = 1; data[57] = 1; data[61] = 1; data[62] = 1;
    data[63] = 1; data[64] = 1; data[65] = 1; data[73] = 1; }




      if (boardnum == 615){
    player = 1;
    isLastPass = false;
    data[16] = 1; data[23] = -1; data[24] = 1; data[25] = 1; data[33] = -1;
    data[34] = -1; data[37] = 1; data[41] = 1; data[42] = 1; data[43] = -1;
    data[44] = -1; data[45] = -1; data[46] = -1; data[47] = -1; data[51] = 1;
    data[52] = 1; data[53] = 1; data[54] = -1; data[55] = -1; data[56] = -1;
    data[61] = 1; data[63] = -1; data[64] = -1; data[65] = -1; data[66] = -1;
    data[73] = -1; data[74] = -1; data[75] = 1; }




      if (boardnum == 616){
    player = 1;
    isLastPass = false;
    data[32] = 1; data[33] = -1; data[34] = -1; data[35] = -1; data[42] = -1;
    data[43] = -1; data[44] = -1; data[45] = -1; data[52] = 1; data[53] = -1;
    data[54] = 1; data[55] = -1; data[56] = 1; data[62] = 1; data[63] = -1;
    data[64] = -1; data[65] = 1; data[66] = 1; data[73] = -1; data[74] = -1;
    }




      if (boardnum == 617){
    player = 1;
    isLastPass = false;
    data[11] = 1; data[12] = 1; data[13] = 1; data[14] = 1; data[15] = 1;
    data[16] = 1; data[17] = 1; data[18] = 1; data[21] = -1; data[22] = -1;
    data[23] = 1; data[24] = -1; data[25] = -1; data[26] = 1; data[27] = -1;
    data[28] = 1; data[31] = 1; data[32] = -1; data[33] = 1; data[34] = -1;
    data[35] = 1; data[36] = -1; data[37] = -1; data[38] = 1; data[42] = -1;
    data[43] = -1; data[44] = 1; data[45] = -1; data[46] = -1; data[52] = -1;
    data[53] = -1; data[54] = -1; data[55] = -1; data[62] = -1; data[63] = -1;
    data[64] = -1; data[66] = -1; data[73] = -1; data[77] = -1; data[82] = -1;
    }




      if (boardnum == 618){
    player = -1;
    isLastPass = false;
    data[13] = -1; data[17] = -1; data[23] = -1; data[24] = 1; data[26] = -1;
    data[31] = -1; data[32] = -1; data[33] = -1; data[34] = 1; data[35] = 1;
    data[36] = -1; data[43] = -1; data[44] = 1; data[45] = 1; data[46] = 1;
    data[53] = -1; data[54] = -1; data[55] = 1; data[56] = 1; data[65] = 1;
    data[66] = -1; data[74] = 1; data[76] = -1; }




      if (boardnum == 619){
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




      if (boardnum == 620){
    player = -1;
    isLastPass = false;
    data[32] = 1; data[33] = 1; data[34] = 1; data[35] = 1; data[36] = -1;
    data[41] = 1; data[42] = 1; data[43] = 1; data[44] = 1; data[45] = -1;
    data[46] = -1; data[51] = 1; data[52] = 1; data[53] = -1; data[54] = -1;
    data[55] = -1; data[56] = -1; data[61] = 1; data[62] = 1; data[63] = 1;
    data[64] = 1; data[65] = 1; data[66] = -1; }




      if (boardnum == 621){
    player = 1;
    isLastPass = false;
    data[13] = -1; data[15] = 1; data[16] = -1; data[21] = 1; data[23] = -1;
    data[24] = -1; data[25] = 1; data[26] = -1; data[31] = 1; data[32] = 1;
    data[33] = 1; data[34] = -1; data[35] = -1; data[36] = -1; data[37] = -1;
    data[38] = -1; data[41] = 1; data[42] = -1; data[43] = 1; data[44] = 1;
    data[45] = -1; data[46] = -1; data[47] = 1; data[51] = 1; data[53] = 1;
    data[54] = 1; data[55] = 1; data[56] = -1; data[57] = 1; data[63] = 1;
    data[64] = 1; data[65] = 1; data[66] = 1; data[67] = 1; data[73] = 1;
    data[74] = 1; data[75] = 1; data[76] = 1; data[83] = 1; data[85] = 1;
    }




      if (boardnum == 622){
    player = -1;
    isLastPass = false;
    data[11] = 1; data[13] = -1; data[14] = -1; data[15] = -1; data[16] = -1;
    data[21] = -1; data[22] = -1; data[23] = -1; data[24] = -1; data[25] = 1;
    data[26] = 1; data[27] = 1; data[31] = 1; data[32] = -1; data[33] = 1;
    data[34] = 1; data[35] = 1; data[36] = -1; data[37] = 1; data[38] = 1;
    data[42] = -1; data[43] = 1; data[44] = 1; data[45] = -1; data[46] = -1;
    data[53] = -1; data[54] = -1; data[55] = -1; data[62] = -1; data[63] = -1;
    data[64] = -1; data[66] = 1; data[73] = 1; }




      if (boardnum == 623){
    player = 1;
    isLastPass = false;
    data[13] = -1; data[24] = -1; data[25] = 1; data[26] = 1; data[33] = -1;
    data[34] = 1; data[35] = 1; data[36] = 1; data[37] = 1; data[43] = -1;
    data[44] = -1; data[45] = -1; data[46] = -1; data[47] = 1; data[53] = -1;
    data[54] = -1; data[55] = -1; data[56] = -1; data[57] = -1; data[64] = -1;
    data[65] = -1; data[66] = -1; data[67] = -1; data[74] = 1; data[75] = -1;
    data[76] = -1; }




      if (boardnum == 624){
    player = 1;
    isLastPass = false;
    data[24] = -1; data[31] = -1; data[32] = -1; data[33] = -1; data[34] = -1;
    data[35] = -1; data[36] = 1; data[41] = 1; data[42] = 1; data[43] = -1;
    data[44] = 1; data[45] = 1; data[46] = 1; data[52] = 1; data[53] = -1;
    data[54] = -1; data[55] = 1; data[56] = 1; data[62] = 1; data[63] = 1;
    data[64] = -1; data[65] = -1; data[66] = 1; data[73] = 1; data[74] = -1;
    data[75] = -1; }




      if (boardnum == 625){
    player = 1;
    isLastPass = false;
    data[13] = 1; data[14] = 1; data[15] = 1; data[16] = 1; data[17] = 1;
    data[18] = 1; data[23] = 1; data[24] = 1; data[25] = 1; data[26] = 1;
    data[27] = 1; data[28] = 1; data[33] = -1; data[34] = 1; data[35] = 1;
    data[36] = 1; data[37] = 1; data[38] = 1; data[43] = -1; data[44] = 1;
    data[45] = 1; data[46] = 1; data[47] = 1; data[48] = 1; data[52] = -1;
    data[54] = -1; data[55] = 1; data[56] = -1; data[57] = 1; data[58] = 1;
    data[64] = -1; data[65] = -1; data[66] = 1; data[67] = -1; data[68] = 1;
    data[74] = -1; data[75] = -1; data[76] = -1; data[77] = 1; data[78] = 1;
    data[85] = -1; data[86] = 1; data[87] = 1; data[88] = 1; }




      if (boardnum == 626){
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




      if (boardnum == 627){
    player = 1;
    isLastPass = false;
    data[13] = -1; data[23] = -1; data[24] = -1; data[25] = -1; data[32] = -1;
    data[33] = -1; data[34] = 1; data[35] = -1; data[36] = 1; data[37] = -1;
    data[43] = -1; data[44] = 1; data[45] = -1; data[46] = -1; data[47] = 1;
    data[48] = 1; data[53] = -1; data[54] = -1; data[55] = -1; data[57] = -1;
    }




      if (boardnum == 628){
    player = 1;
    isLastPass = false;
    data[11] = 1; data[12] = 1; data[13] = 1; data[14] = 1; data[15] = 1;
    data[22] = 1; data[23] = 1; data[24] = 1; data[25] = 1; data[26] = 1;
    data[33] = 1; data[34] = 1; data[35] = -1; data[36] = 1; data[37] = 1;
    data[42] = -1; data[43] = -1; data[44] = -1; data[45] = 1; data[46] = 1;
    data[47] = -1; data[51] = -1; data[52] = -1; data[54] = -1; data[55] = -1;
    data[56] = -1; data[57] = -1; data[58] = -1; data[63] = -1; data[64] = 1;
    data[65] = -1; data[66] = -1; data[67] = -1; data[68] = -1; data[76] = 1;
    data[77] = 1; data[86] = 1; data[88] = 1; }




      if (boardnum == 629){
    player = -1;
    isLastPass = false;
    data[33] = 1; data[34] = -1; data[35] = -1; data[37] = 1; data[44] = -1;
    data[45] = -1; data[46] = 1; data[54] = -1; data[55] = 1; data[56] = 1;
    data[57] = 1; data[63] = -1; data[64] = -1; data[65] = -1; data[66] = 1;
    data[67] = 1; data[73] = 1; data[74] = 1; data[75] = 1; data[76] = 1;
    data[77] = 1; }




      if (boardnum == 630){
    player = -1;
    isLastPass = false;
    data[42] = -1; data[43] = 1; data[44] = -1; data[45] = -1; data[46] = -1;
    data[52] = -1; data[53] = 1; data[54] = 1; data[55] = 1; data[56] = -1;
    data[62] = -1; data[63] = 1; data[64] = 1; data[65] = 1; data[67] = -1;
    data[73] = 1; data[74] = -1; }




      if (boardnum == 631){
    player = -1;
    isLastPass = false;
    data[31] = 1; data[33] = 1; data[35] = -1; data[42] = 1; data[44] = -1;
    data[45] = -1; data[46] = 1; data[53] = -1; data[54] = 1; data[55] = 1;
    data[62] = -1; data[64] = 1; data[65] = -1; data[66] = -1; data[73] = 1;
    }




      if (boardnum == 632){
    player = -1;
    isLastPass = false;
    data[12] = -1; data[13] = -1; data[14] = -1; data[15] = -1; data[23] = -1;
    data[24] = 1; data[25] = -1; data[26] = -1; data[33] = 1; data[34] = -1;
    data[35] = -1; data[36] = -1; data[37] = -1; data[38] = 1; data[41] = 1;
    data[42] = 1; data[43] = 1; data[44] = 1; data[45] = 1; data[46] = 1;
    data[47] = -1; data[48] = 1; data[52] = 1; data[53] = 1; data[54] = 1;
    data[55] = -1; data[56] = -1; data[57] = -1; data[58] = 1; data[62] = 1;
    data[63] = 1; data[64] = 1; data[65] = 1; data[66] = -1; data[67] = -1;
    data[68] = 1; data[77] = -1; }




      if (boardnum == 633){
    player = 1;
    isLastPass = false;
    data[23] = -1; data[26] = 1; data[32] = 1; data[33] = 1; data[34] = 1;
    data[35] = 1; data[36] = 1; data[44] = -1; data[45] = -1; data[46] = -1;
    data[47] = -1; data[48] = -1; data[53] = 1; data[54] = 1; data[55] = 1;
    data[56] = 1; data[58] = 1; data[62] = 1; }




      if (boardnum == 634){
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




      if (boardnum == 635){
    player = -1;
    isLastPass = false;
    data[23] = -1; data[24] = 1; data[25] = -1; data[32] = -1; data[33] = -1;
    data[34] = 1; data[35] = 1; data[36] = 1; data[37] = -1; data[43] = -1;
    data[44] = 1; data[45] = -1; data[46] = 1; data[47] = 1; data[48] = 1;
    data[53] = -1; data[54] = -1; data[55] = -1; data[57] = -1; }




      if (boardnum == 636){
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




      if (boardnum == 637){
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




      if (boardnum == 638){
    player = 1;
    isLastPass = false;
    data[16] = 1; data[25] = 1; data[26] = 1; data[33] = -1; data[34] = -1;
    data[35] = -1; data[36] = -1; data[37] = -1; data[43] = -1; data[44] = -1;
    data[45] = 1; data[46] = -1; data[54] = -1; data[55] = -1; data[56] = 1;
    data[65] = -1; }




      if (boardnum == 639){
    player = -1;
    isLastPass = false;
    data[16] = -1; data[23] = 1; data[24] = 1; data[25] = -1; data[33] = -1;
    data[34] = 1; data[35] = 1; data[36] = 1; data[43] = -1; data[44] = 1;
    data[45] = 1; data[46] = 1; data[52] = -1; data[54] = -1; data[55] = -1;
    data[56] = -1; data[65] = -1; }




      if (boardnum == 640){
    player = -1;
    isLastPass = false;
    data[15] = 1; data[16] = 1; data[17] = 1; data[24] = -1; data[25] = -1;
    data[26] = 1; data[33] = -1; data[34] = -1; data[35] = 1; data[36] = -1;
    data[43] = -1; data[44] = 1; data[45] = 1; data[46] = -1; data[47] = 1;
    data[53] = -1; data[54] = -1; data[55] = 1; data[56] = -1; data[57] = 1;
    data[58] = 1; data[64] = -1; data[65] = 1; data[66] = -1; data[67] = 1;
    data[68] = 1; data[73] = -1; data[74] = 1; data[75] = 1; data[76] = 1;
    data[83] = 1; data[84] = 1; data[85] = 1; data[86] = 1; data[87] = 1;
    }




      if (boardnum == 641){
    player = -1;
    isLastPass = false;
    data[32] = -1; data[42] = 1; data[43] = 1; data[44] = 1; data[45] = 1;
    data[46] = -1; data[53] = 1; data[54] = -1; data[55] = -1; data[56] = -1;
    data[57] = -1; data[62] = 1; data[64] = -1; data[65] = -1; data[66] = -1;
    data[67] = 1; data[76] = -1; }




      if (boardnum == 642){
    player = -1;
    isLastPass = false;
    data[11] = 1; data[13] = 1; data[14] = 1; data[15] = 1; data[16] = -1;
    data[22] = 1; data[23] = 1; data[24] = 1; data[25] = -1; data[26] = -1;
    data[27] = -1; data[31] = 1; data[32] = 1; data[33] = 1; data[34] = -1;
    data[35] = 1; data[36] = -1; data[37] = 1; data[38] = 1; data[42] = -1;
    data[44] = -1; data[45] = -1; data[46] = 1; data[53] = -1; data[54] = -1;
    data[55] = 1; data[56] = -1; data[57] = 1; data[63] = -1; data[64] = -1;
    data[65] = -1; data[66] = -1; data[73] = 1; data[75] = -1; data[76] = -1;
    data[82] = 1; data[86] = -1; }




      if (boardnum == 643){
    player = -1;
    isLastPass = false;
    data[12] = -1; data[13] = 1; data[23] = -1; data[24] = 1; data[25] = 1;
    data[26] = 1; data[34] = -1; data[35] = 1; data[36] = 1; data[44] = 1;
    data[45] = -1; data[46] = 1; data[53] = 1; data[54] = 1; data[55] = 1;
    data[56] = 1; data[62] = 1; }




      if (boardnum == 644){
    player = -1;
    isLastPass = false;
    data[16] = 1; data[24] = 1; data[25] = 1; data[33] = 1; data[34] = 1;
    data[37] = 1; data[42] = -1; data[43] = 1; data[44] = -1; data[45] = -1;
    data[46] = -1; data[47] = -1; data[52] = 1; data[53] = 1; data[54] = -1;
    data[55] = -1; data[56] = -1; data[63] = 1; data[64] = -1; data[65] = -1;
    data[66] = -1; }




      if (boardnum == 645){
    player = 1;
    isLastPass = false;
    data[11] = 1; data[12] = -1; data[13] = -1; data[14] = -1; data[15] = -1;
    data[16] = -1; data[17] = -1; data[18] = -1; data[21] = 1; data[22] = 1;
    data[23] = -1; data[24] = 1; data[25] = 1; data[26] = 1; data[27] = 1;
    data[28] = -1; data[32] = -1; data[33] = 1; data[34] = 1; data[35] = 1;
    data[36] = 1; data[37] = 1; data[41] = -1; data[43] = -1; data[44] = 1;
    data[45] = -1; data[46] = -1; data[47] = 1; data[52] = -1; data[53] = -1;
    data[54] = -1; data[55] = -1; data[56] = -1; data[58] = 1; data[62] = -1;
    data[63] = -1; data[64] = -1; data[65] = -1; data[66] = -1; data[67] = -1;
    data[75] = -1; data[76] = -1; data[77] = -1; data[84] = -1; }




      if (boardnum == 646){
    player = 1;
    isLastPass = false;
    data[32] = -1; data[34] = 1; data[35] = -1; data[36] = -1; data[38] = 1;
    data[42] = 1; data[43] = 1; data[44] = 1; data[45] = -1; data[46] = -1;
    data[47] = -1; data[48] = -1; data[53] = 1; data[54] = -1; data[55] = -1;
    data[56] = 1; data[57] = 1; data[58] = 1; data[62] = 1; data[63] = -1;
    data[64] = -1; data[65] = -1; data[66] = 1; data[67] = 1; data[74] = -1;
    data[75] = 1; data[76] = 1; data[86] = 1; }




      if (boardnum == 647){
    player = 1;
    isLastPass = false;
    data[14] = 1; data[22] = 1; data[23] = 1; data[24] = 1; data[25] = -1;
    data[32] = 1; data[33] = 1; data[34] = -1; data[35] = -1; data[36] = 1;
    data[38] = 1; data[42] = -1; data[43] = -1; data[44] = 1; data[45] = -1;
    data[46] = -1; data[47] = 1; data[52] = -1; data[53] = -1; data[54] = 1;
    data[55] = -1; data[56] = 1; data[61] = -1; data[63] = 1; data[64] = -1;
    data[65] = -1; data[75] = -1; data[76] = 1; }




      if (boardnum == 648){
    player = 1;
    isLastPass = false;
    data[13] = -1; data[14] = -1; data[15] = -1; data[16] = -1; data[23] = -1;
    data[24] = -1; data[25] = -1; data[26] = -1; data[32] = -1; data[33] = -1;
    data[34] = -1; data[35] = -1; data[36] = -1; data[37] = -1; data[38] = 1;
    data[42] = 1; data[43] = 1; data[44] = 1; data[45] = 1; data[46] = -1;
    data[47] = 1; data[54] = 1; data[55] = -1; data[56] = 1; data[58] = -1;
    data[65] = -1; data[67] = 1; data[75] = -1; }




      if (boardnum == 649){
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




      if (boardnum == 650){
    player = 1;
    isLastPass = false;
    data[13] = 1; data[15] = 1; data[16] = 1; data[17] = -1; data[18] = -1;
    data[23] = 1; data[24] = 1; data[25] = 1; data[26] = 1; data[27] = -1;
    data[33] = 1; data[34] = 1; data[35] = -1; data[36] = -1; data[37] = 1;
    data[43] = 1; data[44] = -1; data[45] = 1; data[46] = -1; data[47] = -1;
    data[48] = -1; data[53] = 1; data[54] = -1; data[55] = -1; data[56] = -1;
    data[57] = -1; data[58] = -1; data[63] = 1; data[64] = 1; data[65] = 1;
    data[66] = 1; data[67] = 1; data[73] = 1; data[74] = 1; data[75] = 1;
    data[76] = 1; data[82] = 1; data[83] = 1; }




      if (boardnum == 651){
    player = 1;
    isLastPass = false;
    data[11] = 1; data[13] = 1; data[14] = 1; data[15] = 1; data[22] = 1;
    data[23] = 1; data[24] = -1; data[32] = -1; data[33] = 1; data[34] = -1;
    data[35] = -1; data[43] = 1; data[44] = 1; data[45] = -1; data[46] = -1;
    data[47] = -1; data[53] = 1; data[54] = 1; data[55] = -1; data[56] = -1;
    data[62] = -1; data[63] = -1; data[64] = -1; data[65] = -1; data[66] = -1;
    data[67] = -1; data[75] = -1; data[76] = -1; data[77] = -1; data[84] = -1;
    }




      if (boardnum == 652){
    player = -1;
    isLastPass = false;
    data[13] = -1; data[14] = -1; data[15] = -1; data[16] = -1; data[17] = -1;
    data[23] = 1; data[24] = 1; data[25] = 1; data[26] = -1; data[27] = 1;
    data[32] = 1; data[33] = 1; data[34] = 1; data[35] = -1; data[36] = 1;
    data[37] = 1; data[38] = -1; data[43] = 1; data[44] = -1; data[45] = 1;
    data[46] = -1; data[47] = -1; data[48] = -1; data[53] = 1; data[54] = 1;
    data[55] = -1; data[56] = -1; data[57] = 1; data[58] = -1; data[63] = 1;
    data[64] = 1; data[65] = 1; data[66] = 1; data[67] = 1; data[68] = -1;
    data[74] = -1; data[75] = 1; data[76] = 1; data[78] = -1; data[88] = -1;
    }




      if (boardnum == 653){
    player = -1;
    isLastPass = false;
    data[22] = 1; data[23] = 1; data[26] = 1; data[32] = -1; data[33] = -1;
    data[34] = -1; data[35] = 1; data[36] = -1; data[44] = 1; data[45] = -1;
    data[52] = -1; data[54] = -1; data[55] = 1; data[56] = 1; data[63] = -1;
    data[64] = -1; data[73] = 1; data[74] = 1; data[75] = 1; }




      if (boardnum == 654){
    player = 1;
    isLastPass = false;
    data[16] = 1; data[23] = -1; data[24] = 1; data[25] = 1; data[33] = -1;
    data[34] = -1; data[37] = 1; data[41] = 1; data[42] = 1; data[43] = -1;
    data[44] = -1; data[45] = -1; data[46] = -1; data[47] = -1; data[51] = 1;
    data[52] = 1; data[53] = 1; data[54] = -1; data[55] = -1; data[56] = -1;
    data[61] = 1; data[63] = -1; data[64] = -1; data[65] = -1; data[66] = -1;
    data[73] = -1; data[74] = -1; data[75] = 1; }




      if (boardnum == 655){
    player = 1;
    isLastPass = false;
    data[13] = -1; data[15] = 1; data[16] = 1; data[17] = 1; data[21] = 1;
    data[23] = -1; data[24] = -1; data[25] = 1; data[26] = 1; data[31] = 1;
    data[32] = 1; data[33] = 1; data[34] = 1; data[35] = 1; data[36] = -1;
    data[37] = -1; data[38] = -1; data[41] = 1; data[42] = -1; data[43] = 1;
    data[44] = 1; data[45] = -1; data[46] = -1; data[47] = 1; data[51] = 1;
    data[52] = 1; data[53] = -1; data[54] = -1; data[55] = -1; data[56] = -1;
    data[57] = -1; data[61] = 1; data[63] = 1; data[64] = 1; data[65] = 1;
    data[66] = 1; data[67] = 1; data[68] = -1; data[73] = 1; data[74] = 1;
    data[75] = 1; data[76] = 1; data[83] = 1; data[85] = 1; }




      if (boardnum == 656){
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




      if (boardnum == 657){
    player = -1;
    isLastPass = false;
    data[15] = 1; data[24] = 1; data[25] = 1; data[26] = 1; data[31] = -1;
    data[32] = -1; data[33] = 1; data[34] = 1; data[35] = 1; data[36] = 1;
    data[37] = 1; data[42] = 1; data[43] = -1; data[44] = 1; data[45] = -1;
    data[46] = 1; data[47] = 1; data[51] = 1; data[53] = 1; data[54] = 1;
    data[55] = 1; data[56] = 1; data[63] = 1; data[64] = 1; data[66] = -1;
    data[73] = 1; data[83] = 1; }




      if (boardnum == 658){
    player = -1;
    isLastPass = false;
    data[14] = -1; data[22] = -1; data[23] = 1; data[24] = -1; data[26] = -1;
    data[31] = 1; data[32] = 1; data[33] = 1; data[34] = 1; data[35] = -1;
    data[36] = 1; data[37] = 1; data[38] = 1; data[42] = -1; data[43] = -1;
    data[44] = -1; data[45] = 1; data[53] = -1; data[54] = 1; data[55] = -1;
    data[62] = -1; }




      if (boardnum == 659){
    player = -1;
    isLastPass = false;
    data[16] = 1; data[24] = -1; data[25] = 1; data[26] = 1; data[27] = 1;
    data[33] = 1; data[34] = -1; data[35] = -1; data[36] = 1; data[37] = 1;
    data[43] = 1; data[44] = -1; data[45] = 1; data[46] = 1; data[47] = 1;
    data[53] = 1; data[54] = -1; data[55] = 1; data[56] = 1; data[57] = 1;
    data[63] = 1; data[64] = 1; data[65] = 1; data[66] = 1; data[67] = 1;
    data[73] = 1; data[74] = 1; data[75] = 1; data[76] = 1; data[82] = 1;
    data[83] = 1; }




      if (boardnum == 660){
    player = -1;
    isLastPass = false;
    data[13] = 1; data[14] = 1; data[15] = 1; data[16] = 1; data[17] = 1;
    data[18] = 1; data[22] = -1; data[23] = 1; data[24] = 1; data[25] = 1;
    data[26] = 1; data[27] = 1; data[28] = 1; data[32] = -1; data[33] = -1;
    data[34] = -1; data[35] = 1; data[36] = -1; data[37] = 1; data[38] = -1;
    data[42] = 1; data[43] = 1; data[44] = -1; data[45] = 1; data[46] = 1;
    data[47] = -1; data[54] = 1; data[55] = -1; data[56] = -1; data[57] = 1;
    data[68] = 1; }




      if (boardnum == 661){
    player = -1;
    isLastPass = false;
    data[14] = 1; data[22] = 1; data[23] = 1; data[24] = 1; data[32] = 1;
    data[33] = 1; data[34] = 1; data[35] = -1; data[36] = 1; data[38] = 1;
    data[42] = -1; data[43] = -1; data[44] = 1; data[45] = -1; data[46] = -1;
    data[47] = 1; data[52] = -1; data[53] = -1; data[54] = 1; data[55] = -1;
    data[56] = 1; data[61] = -1; data[63] = 1; data[64] = -1; data[65] = -1;
    data[75] = -1; data[76] = 1; }




      if (boardnum == 662){
    player = 1;
    isLastPass = false;
    data[33] = -1; data[34] = -1; data[35] = -1; data[36] = -1; data[37] = -1;
    data[38] = -1; data[42] = 1; data[43] = 1; data[44] = 1; data[45] = 1;
    data[46] = -1; data[47] = -1; data[53] = 1; data[54] = -1; data[55] = -1;
    data[56] = -1; data[57] = -1; data[62] = 1; }




      if (boardnum == 663){
    player = 1;
    isLastPass = false;
    data[23] = -1; data[24] = 1; data[25] = 1; data[34] = 1; data[35] = 1;
    data[43] = -1; data[44] = -1; data[45] = -1; data[46] = 1; data[52] = 1;
    data[53] = 1; data[54] = 1; data[55] = -1; data[56] = 1; data[57] = 1;
    data[64] = 1; data[65] = 1; data[66] = -1; data[73] = 1; data[75] = 1;
    data[76] = 1; data[82] = 1; }




      if (boardnum == 664){
    player = 1;
    isLastPass = false;
    data[11] = -1; data[13] = -1; data[14] = -1; data[15] = -1; data[16] = -1;
    data[17] = -1; data[22] = -1; data[24] = -1; data[25] = 1; data[26] = -1;
    data[32] = -1; data[33] = -1; data[34] = -1; data[35] = -1; data[36] = 1;
    data[42] = -1; data[43] = -1; data[44] = 1; data[45] = 1; data[46] = 1;
    data[47] = 1; data[53] = -1; data[54] = 1; data[55] = 1; data[56] = 1;
    data[62] = 1; data[63] = -1; data[64] = 1; data[65] = 1; data[74] = 1;
    data[75] = 1; data[76] = -1; }




      if (boardnum == 665){
    player = 1;
    isLastPass = false;
    data[25] = 1; data[31] = -1; data[32] = -1; data[33] = -1; data[34] = 1;
    data[35] = 1; data[36] = 1; data[38] = 1; data[41] = 1; data[42] = 1;
    data[43] = -1; data[44] = -1; data[45] = 1; data[46] = -1; data[47] = 1;
    data[48] = -1; data[52] = 1; data[53] = -1; data[54] = 1; data[55] = -1;
    data[56] = 1; data[57] = 1; data[58] = 1; data[61] = -1; data[62] = -1;
    data[63] = 1; data[64] = -1; data[65] = 1; data[66] = 1; data[67] = 1;
    data[73] = -1; data[74] = 1; data[75] = 1; data[76] = 1; data[83] = 1;
    data[84] = 1; data[85] = 1; data[86] = 1; }




      if (boardnum == 666){
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




      if (boardnum == 667){
    player = -1;
    isLastPass = false;
    data[36] = -1; data[37] = -1; data[38] = -1; data[43] = 1; data[44] = 1;
    data[45] = 1; data[46] = 1; data[47] = -1; data[48] = -1; data[53] = -1;
    data[54] = -1; data[55] = -1; data[56] = -1; data[57] = 1; data[58] = -1;
    data[63] = -1; data[64] = 1; data[65] = 1; data[66] = 1; data[67] = 1;
    data[68] = 1; data[73] = 1; data[74] = 1; data[75] = 1; data[76] = -1;
    data[84] = 1; data[85] = 1; data[86] = 1; data[87] = 1; }




      if (boardnum == 668){
    player = -1;
    isLastPass = false;
    data[16] = 1; data[25] = 1; data[26] = 1; data[34] = 1; data[35] = 1;
    data[36] = 1; data[37] = -1; data[42] = -1; data[43] = -1; data[44] = -1;
    data[45] = -1; data[46] = -1; data[53] = -1; data[54] = 1; data[55] = -1;
    data[64] = -1; data[73] = -1; }




      if (boardnum == 669){
    player = -1;
    isLastPass = false;
    data[13] = 1; data[16] = 1; data[23] = 1; data[24] = -1; data[25] = 1;
    data[26] = 1; data[32] = 1; data[33] = 1; data[34] = -1; data[35] = -1;
    data[36] = 1; data[37] = -1; data[42] = -1; data[43] = 1; data[44] = -1;
    data[45] = -1; data[46] = -1; data[53] = -1; data[54] = -1; data[55] = -1;
    data[63] = -1; data[64] = -1; data[73] = -1; data[74] = -1; data[75] = -1;
    }




      if (boardnum == 670){
    player = 1;
    isLastPass = false;
    data[13] = -1; data[14] = -1; data[23] = -1; data[24] = -1; data[25] = -1;
    data[26] = -1; data[34] = -1; data[35] = -1; data[36] = -1; data[44] = -1;
    data[45] = 1; data[46] = -1; data[47] = -1; data[48] = -1; data[53] = -1;
    data[54] = 1; data[55] = 1; data[56] = 1; data[57] = -1; data[58] = -1;
    data[63] = 1; data[65] = 1; data[66] = -1; data[67] = 1; }




      if (boardnum == 671){
    player = -1;
    isLastPass = false;
    data[32] = -1; data[33] = -1; data[34] = 1; data[43] = -1; data[44] = 1;
    data[45] = 1; data[46] = 1; data[53] = 1; data[54] = 1; data[55] = -1;
    data[56] = 1; data[63] = 1; data[64] = 1; data[65] = -1; data[66] = -1;
    data[75] = -1; data[76] = -1; data[77] = -1; data[84] = -1; }




      if (boardnum == 672){
    player = 1;
    isLastPass = false;
    data[13] = 1; data[14] = -1; data[16] = 1; data[23] = -1; data[24] = -1;
    data[25] = -1; data[26] = -1; data[27] = -1; data[33] = -1; data[34] = -1;
    data[35] = 1; data[36] = -1; data[37] = -1; data[43] = -1; data[44] = -1;
    data[45] = -1; data[46] = 1; data[47] = 1; data[54] = 1; data[55] = -1;
    }




      if (boardnum == 673){
    player = 1;
    isLastPass = false;
    data[43] = 1; data[44] = 1; data[45] = 1; data[46] = -1; data[53] = -1;
    data[54] = 1; data[55] = -1; data[56] = -1; data[57] = -1; data[63] = -1;
    data[64] = -1; data[65] = -1; data[66] = -1; data[67] = -1; data[73] = 1;
    data[74] = 1; data[75] = -1; data[76] = -1; data[84] = 1; data[85] = 1;
    data[86] = 1; data[87] = 1; }




      if (boardnum == 674){
    player = -1;
    isLastPass = false;
    data[12] = -1; data[13] = -1; data[14] = -1; data[15] = -1; data[16] = -1;
    data[17] = -1; data[18] = -1; data[22] = 1; data[23] = 1; data[24] = -1;
    data[25] = 1; data[26] = 1; data[27] = 1; data[28] = 1; data[32] = -1;
    data[33] = -1; data[34] = -1; data[35] = -1; data[36] = -1; data[37] = 1;
    data[38] = 1; data[42] = -1; data[43] = -1; data[44] = 1; data[45] = -1;
    data[46] = 1; data[47] = 1; data[48] = 1; data[53] = -1; data[54] = -1;
    data[55] = 1; data[56] = 1; data[62] = 1; data[63] = -1; data[64] = 1;
    data[66] = 1; data[67] = 1; data[68] = 1; data[73] = -1; }




      if (boardnum == 675){
    player = -1;
    isLastPass = false;
    data[13] = -1; data[15] = 1; data[23] = -1; data[24] = -1; data[25] = 1;
    data[26] = 1; data[32] = -1; data[33] = -1; data[34] = 1; data[35] = 1;
    data[36] = 1; data[37] = 1; data[42] = -1; data[43] = -1; data[44] = -1;
    data[45] = -1; data[46] = -1; data[47] = 1; data[52] = 1; data[53] = 1;
    data[54] = -1; data[55] = 1; data[56] = -1; data[57] = -1; data[63] = 1;
    data[64] = 1; data[65] = -1; data[66] = 1; data[73] = -1; data[74] = 1;
    data[76] = -1; }




      if (boardnum == 676){
    player = 1;
    isLastPass = false;
    data[13] = -1; data[16] = 1; data[23] = -1; data[24] = -1; data[25] = 1;
    data[26] = 1; data[32] = 1; data[33] = -1; data[34] = -1; data[35] = 1;
    data[36] = 1; data[37] = -1; data[38] = -1; data[42] = -1; data[43] = -1;
    data[44] = 1; data[45] = -1; data[46] = -1; data[47] = -1; data[48] = -1;
    data[53] = -1; data[54] = -1; data[55] = -1; data[56] = -1; data[57] = -1;
    data[58] = -1; data[63] = -1; data[65] = 1; data[66] = 1; data[67] = -1;
    data[68] = -1; data[74] = 1; }




      if (boardnum == 677){
    player = -1;
    isLastPass = false;
    data[32] = -1; data[34] = -1; data[36] = 1; data[37] = 1; data[41] = 1;
    data[42] = -1; data[43] = -1; data[44] = -1; data[45] = -1; data[46] = 1;
    data[52] = -1; data[54] = 1; data[55] = 1; data[56] = -1; data[57] = -1;
    data[63] = 1; data[64] = 1; data[65] = 1; data[66] = -1; data[74] = 1;
    data[76] = 1; }




      if (boardnum == 678){
    player = 1;
    isLastPass = false;
    data[33] = 1; data[34] = -1; data[42] = 1; data[43] = 1; data[44] = 1;
    data[45] = 1; data[46] = 1; data[53] = 1; data[54] = -1; data[55] = 1;
    data[56] = -1; data[63] = 1; data[64] = 1; data[65] = -1; data[66] = -1;
    data[73] = 1; data[75] = 1; data[76] = -1; data[77] = -1; data[78] = -1;
    }




      if (boardnum == 679){
    player = -1;
    isLastPass = false;
    data[21] = -1; data[32] = -1; data[33] = -1; data[34] = -1; data[35] = -1;
    data[36] = -1; data[37] = -1; data[43] = -1; data[44] = -1; data[45] = -1;
    data[46] = -1; data[47] = -1; data[48] = -1; data[51] = -1; data[52] = -1;
    data[53] = -1; data[54] = -1; data[55] = 1; data[56] = 1; data[57] = -1;
    data[62] = -1; data[63] = -1; data[64] = -1; data[65] = 1; data[66] = 1;
    data[67] = -1; data[74] = 1; data[75] = -1; data[78] = -1; }




      if (boardnum == 680){
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




      if (boardnum == 681){
    player = 1;
    isLastPass = false;
    data[11] = -1; data[12] = 1; data[13] = -1; data[14] = -1; data[15] = -1;
    data[16] = -1; data[17] = -1; data[22] = -1; data[23] = 1; data[24] = -1;
    data[25] = -1; data[26] = 1; data[31] = -1; data[32] = -1; data[33] = -1;
    data[34] = 1; data[35] = -1; data[36] = 1; data[43] = -1; data[44] = -1;
    data[45] = 1; data[46] = 1; data[53] = -1; data[54] = -1; data[55] = -1;
    data[56] = 1; data[65] = 1; data[66] = -1; data[74] = 1; data[76] = -1;
    }




      if (boardnum == 682){
    player = -1;
    isLastPass = false;
    data[33] = -1; data[34] = -1; data[35] = -1; data[44] = 1; data[45] = 1;
    data[46] = 1; data[53] = -1; data[54] = 1; data[55] = 1; data[56] = 1;
    data[64] = 1; data[65] = 1; data[66] = 1; data[74] = -1; data[75] = 1;
    }




      if (boardnum == 683){
    player = 1;
    isLastPass = false;
    data[32] = -1; data[42] = 1; data[43] = 1; data[44] = 1; data[45] = 1;
    data[46] = -1; data[53] = -1; data[54] = -1; data[55] = -1; data[56] = -1;
    data[57] = -1; data[64] = -1; data[65] = -1; data[66] = -1; data[67] = 1;
    data[76] = -1; }




      if (boardnum == 684){
    player = 1;
    isLastPass = false;
    data[12] = 1; data[22] = 1; data[23] = 1; data[25] = 1; data[32] = -1;
    data[33] = -1; data[34] = -1; data[35] = 1; data[36] = 1; data[44] = 1;
    data[45] = 1; data[46] = 1; data[47] = 1; data[54] = -1; data[55] = 1;
    data[56] = -1; data[63] = -1; data[65] = 1; data[66] = 1; data[67] = -1;
    }




      if (boardnum == 685){
    player = 1;
    isLastPass = false;
    data[14] = -1; data[22] = -1; data[23] = -1; data[32] = -1; data[33] = -1;
    data[34] = 1; data[35] = 1; data[43] = 1; data[44] = 1; data[45] = 1;
    data[46] = 1; data[53] = 1; data[54] = 1; data[55] = -1; data[56] = 1;
    data[62] = -1; data[63] = -1; data[64] = -1; data[65] = -1; data[66] = -1;
    data[75] = -1; data[76] = -1; data[77] = -1; data[84] = -1; }




      if (boardnum == 686){
    player = 1;
    isLastPass = false;
    data[36] = -1; data[37] = -1; data[38] = -1; data[43] = 1; data[44] = 1;
    data[45] = 1; data[46] = 1; data[47] = -1; data[48] = -1; data[53] = -1;
    data[54] = -1; data[55] = -1; data[56] = -1; data[57] = -1; data[58] = -1;
    data[63] = -1; data[64] = 1; data[65] = 1; data[66] = 1; data[67] = -1;
    data[73] = 1; data[74] = 1; data[75] = 1; data[76] = -1; data[84] = 1;
    data[85] = 1; data[86] = 1; data[87] = 1; }




      if (boardnum == 687){
    player = -1;
    isLastPass = false;
    data[33] = 1; data[37] = 1; data[44] = 1; data[45] = 1; data[46] = 1;
    data[54] = -1; data[55] = 1; data[56] = -1; data[64] = -1; data[65] = -1;
    data[66] = -1; data[67] = -1; data[74] = -1; data[75] = 1; data[77] = 1;
    }




      if (boardnum == 688){
    player = -1;
    isLastPass = false;
    data[11] = -1; data[13] = -1; data[14] = -1; data[15] = -1; data[16] = -1;
    data[17] = -1; data[22] = -1; data[24] = -1; data[25] = 1; data[26] = -1;
    data[31] = -1; data[32] = -1; data[33] = -1; data[34] = -1; data[35] = -1;
    data[36] = 1; data[41] = 1; data[42] = -1; data[43] = 1; data[44] = 1;
    data[45] = 1; data[46] = 1; data[47] = 1; data[53] = 1; data[54] = 1;
    data[55] = 1; data[56] = 1; data[62] = 1; data[63] = 1; data[64] = 1;
    data[65] = 1; data[73] = 1; data[74] = 1; data[75] = 1; data[76] = -1;
    }




      if (boardnum == 689){
    player = -1;
    isLastPass = false;
    data[11] = 1; data[13] = -1; data[14] = -1; data[16] = -1; data[21] = 1;
    data[22] = 1; data[23] = 1; data[24] = -1; data[25] = -1; data[26] = -1;
    data[31] = 1; data[32] = 1; data[33] = 1; data[34] = 1; data[35] = -1;
    data[36] = 1; data[37] = -1; data[41] = 1; data[42] = 1; data[43] = 1;
    data[44] = 1; data[45] = 1; data[46] = -1; data[47] = -1; data[48] = -1;
    data[51] = 1; data[52] = 1; data[53] = 1; data[54] = 1; data[55] = -1;
    data[56] = -1; data[57] = -1; data[58] = -1; data[61] = -1; data[62] = 1;
    data[63] = 1; data[64] = 1; data[65] = -1; data[72] = 1; data[73] = -1;
    data[74] = -1; data[76] = -1; data[83] = -1; }




      if (boardnum == 690){
    player = -1;
    isLastPass = false;
    data[34] = 1; data[35] = 1; data[42] = 1; data[43] = 1; data[44] = 1;
    data[45] = 1; data[46] = 1; data[54] = -1; data[55] = 1; data[56] = -1;
    data[57] = 1; data[64] = -1; data[65] = -1; data[66] = 1; data[77] = 1;
    }




      if (boardnum == 691){
    player = 1;
    isLastPass = false;
    data[11] = -1; data[12] = 1; data[13] = -1; data[14] = -1; data[15] = -1;
    data[16] = -1; data[17] = -1; data[21] = 1; data[22] = 1; data[23] = 1;
    data[24] = -1; data[25] = -1; data[26] = 1; data[31] = -1; data[32] = 1;
    data[33] = -1; data[34] = 1; data[35] = -1; data[36] = 1; data[43] = 1;
    data[44] = -1; data[45] = 1; data[46] = 1; data[53] = -1; data[54] = -1;
    data[55] = -1; data[56] = 1; data[64] = -1; data[65] = -1; data[66] = -1;
    data[74] = 1; data[76] = -1; }




      if (boardnum == 692){
    player = -1;
    isLastPass = false;
    data[11] = 1; data[13] = 1; data[14] = 1; data[15] = 1; data[16] = -1;
    data[22] = 1; data[23] = 1; data[24] = 1; data[25] = 1; data[26] = 1;
    data[27] = 1; data[28] = 1; data[31] = 1; data[32] = 1; data[33] = 1;
    data[34] = -1; data[35] = -1; data[36] = -1; data[37] = 1; data[38] = 1;
    data[42] = -1; data[44] = -1; data[45] = -1; data[46] = 1; data[53] = -1;
    data[54] = -1; data[55] = 1; data[56] = -1; data[57] = -1; data[58] = -1;
    data[62] = -1; data[63] = -1; data[64] = -1; data[65] = 1; data[66] = -1;
    data[71] = -1; data[73] = -1; data[75] = 1; data[76] = -1; data[82] = 1;
    data[83] = -1; data[85] = 1; data[86] = -1; }




      if (boardnum == 693){
    player = -1;
    isLastPass = false;
    data[12] = -1; data[13] = -1; data[14] = -1; data[15] = -1; data[23] = -1;
    data[24] = 1; data[25] = -1; data[26] = -1; data[33] = -1; data[34] = -1;
    data[35] = 1; data[36] = -1; data[37] = 1; data[38] = 1; data[44] = 1;
    data[45] = 1; data[46] = 1; data[47] = 1; data[54] = 1; data[55] = 1;
    data[56] = 1; data[57] = -1; data[58] = -1; data[63] = -1; data[64] = 1;
    data[65] = 1; data[66] = 1; }




      if (boardnum == 694){
    player = -1;
    isLastPass = false;
    data[11] = -1; data[12] = -1; data[13] = -1; data[14] = -1; data[16] = 1;
    data[21] = 1; data[22] = 1; data[23] = 1; data[24] = -1; data[25] = 1;
    data[28] = 1; data[32] = 1; data[33] = 1; data[34] = 1; data[35] = -1;
    data[36] = -1; data[37] = 1; data[43] = 1; data[44] = 1; data[45] = 1;
    data[46] = 1; data[47] = 1; data[54] = 1; data[55] = 1; data[56] = -1;
    data[63] = -1; data[65] = 1; data[66] = 1; data[67] = -1; }




      if (boardnum == 695){
    player = -1;
    isLastPass = false;
    data[21] = 1; data[24] = -1; data[25] = 1; data[26] = 1; data[31] = 1;
    data[32] = 1; data[33] = -1; data[34] = -1; data[35] = 1; data[36] = -1;
    data[41] = 1; data[42] = -1; data[43] = 1; data[44] = -1; data[45] = 1;
    data[51] = 1; data[52] = 1; data[53] = 1; data[54] = 1; data[55] = -1;
    data[56] = 1; data[57] = 1; data[61] = 1; data[62] = 1; data[63] = 1;
    data[64] = -1; data[65] = 1; data[66] = 1; data[67] = 1; data[71] = 1;
    data[73] = -1; data[74] = -1; data[75] = -1; data[76] = 1; data[77] = -1;
    data[81] = 1; data[82] = 1; data[83] = 1; data[84] = 1; data[85] = 1;
    data[86] = -1; }




      if (boardnum == 696){
    player = 1;
    isLastPass = false;
    data[15] = -1; data[25] = -1; data[32] = -1; data[33] = -1; data[34] = -1;
    data[35] = -1; data[36] = 1; data[37] = -1; data[42] = -1; data[43] = -1;
    data[44] = -1; data[45] = -1; data[46] = 1; data[47] = 1; data[48] = 1;
    data[51] = -1; data[52] = -1; data[53] = -1; data[54] = -1; data[55] = -1;
    data[56] = 1; data[57] = 1; data[58] = 1; data[62] = -1; data[64] = -1;
    data[67] = -1; data[68] = 1; data[73] = -1; }




      if (boardnum == 697){
    player = 1;
    isLastPass = false;
    data[14] = 1; data[23] = 1; data[24] = 1; data[25] = -1; data[26] = 1;
    data[32] = 1; data[33] = 1; data[34] = -1; data[35] = -1; data[36] = 1;
    data[42] = 1; data[43] = -1; data[44] = -1; data[45] = 1; data[46] = 1;
    data[51] = 1; data[52] = 1; data[53] = -1; data[54] = -1; data[55] = -1;
    data[56] = 1; data[57] = 1; data[62] = 1; data[63] = 1; data[64] = -1;
    data[65] = -1; data[66] = 1; data[72] = 1; data[73] = 1; data[75] = -1;
    data[84] = 1; data[86] = -1; }




      if (boardnum == 698){
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




      if (boardnum == 699){
    player = -1;
    isLastPass = false;
    data[12] = -1; data[23] = -1; data[24] = -1; data[33] = -1; data[34] = -1;
    data[35] = -1; data[36] = -1; data[37] = -1; data[43] = -1; data[44] = -1;
    data[45] = -1; data[46] = -1; data[52] = 1; data[53] = 1; data[54] = 1;
    data[55] = 1; data[63] = -1; data[65] = 1; data[72] = -1; }




      if (boardnum == 700){
    player = 1;
    isLastPass = false;
    data[11] = 1; data[13] = -1; data[14] = -1; data[16] = -1; data[21] = 1;
    data[22] = 1; data[23] = 1; data[24] = -1; data[25] = -1; data[26] = -1;
    data[31] = 1; data[32] = 1; data[33] = 1; data[34] = 1; data[35] = -1;
    data[36] = 1; data[37] = -1; data[41] = 1; data[42] = 1; data[43] = 1;
    data[44] = 1; data[45] = 1; data[46] = -1; data[47] = -1; data[48] = -1;
    data[51] = 1; data[52] = -1; data[53] = 1; data[54] = -1; data[55] = -1;
    data[56] = -1; data[57] = -1; data[58] = -1; data[61] = -1; data[62] = -1;
    data[63] = -1; data[64] = 1; data[65] = -1; data[73] = -1; data[74] = -1;
    data[76] = -1; data[83] = -1; }




      if (boardnum == 701){
    player = -1;
    isLastPass = false;
    data[25] = 1; data[34] = 1; data[35] = 1; data[36] = 1; data[43] = 1;
    data[44] = -1; data[45] = 1; data[46] = -1; data[47] = -1; data[53] = 1;
    data[54] = 1; data[55] = -1; data[56] = -1; data[57] = -1; data[63] = 1;
    data[64] = -1; data[65] = 1; data[67] = 1; data[76] = 1; }




      if (boardnum == 702){
    player = 1;
    isLastPass = false;
    data[13] = -1; data[14] = -1; data[15] = -1; data[16] = -1; data[17] = -1;
    data[22] = 1; data[24] = -1; data[25] = 1; data[26] = -1; data[32] = -1;
    data[33] = -1; data[34] = -1; data[35] = -1; data[36] = 1; data[42] = -1;
    data[43] = -1; data[44] = 1; data[45] = 1; data[46] = 1; data[47] = 1;
    data[53] = -1; data[54] = -1; data[55] = 1; data[56] = 1; data[62] = 1;
    data[63] = -1; data[64] = -1; data[65] = -1; data[75] = 1; data[76] = -1;
    }




      if (boardnum == 703){
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




      if (boardnum == 704){
    player = 1;
    isLastPass = false;
    data[11] = 1; data[12] = 1; data[13] = 1; data[14] = 1; data[15] = 1;
    data[16] = 1; data[21] = -1; data[22] = 1; data[24] = -1; data[25] = -1;
    data[26] = -1; data[27] = -1; data[32] = -1; data[33] = 1; data[34] = 1;
    data[35] = -1; data[36] = -1; data[37] = -1; data[43] = -1; data[44] = -1;
    data[45] = -1; data[46] = -1; data[47] = -1; data[48] = -1; data[52] = -1;
    data[53] = -1; data[54] = -1; data[55] = -1; data[56] = -1; data[66] = -1;
    }




      if (boardnum == 705){
    player = 1;
    isLastPass = false;
    data[13] = 1; data[15] = 1; data[16] = -1; data[23] = 1; data[24] = 1;
    data[25] = 1; data[26] = -1; data[32] = 1; data[33] = 1; data[34] = 1;
    data[35] = -1; data[36] = -1; data[37] = 1; data[38] = 1; data[42] = 1;
    data[43] = 1; data[44] = 1; data[45] = 1; data[46] = -1; data[47] = -1;
    data[48] = -1; data[52] = 1; data[53] = 1; data[54] = 1; data[55] = -1;
    data[56] = -1; data[57] = -1; data[64] = 1; data[65] = 1; data[66] = 1;
    data[74] = 1; data[76] = 1; }




      if (boardnum == 706){
    player = -1;
    isLastPass = false;
    data[13] = 1; data[14] = -1; data[15] = -1; data[16] = -1; data[17] = -1;
    data[18] = -1; data[24] = 1; data[25] = -1; data[26] = 1; data[32] = 1;
    data[33] = 1; data[34] = 1; data[35] = 1; data[36] = -1; data[42] = -1;
    data[43] = 1; data[44] = -1; data[45] = -1; data[54] = 1; data[55] = 1;
    data[56] = 1; data[63] = -1; data[65] = 1; data[66] = 1; data[67] = 1;
    }




      if (boardnum == 707){
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




      if (boardnum == 708){
    player = -1;
    isLastPass = false;
    data[25] = 1; data[31] = -1; data[32] = -1; data[33] = -1; data[34] = -1;
    data[35] = 1; data[36] = -1; data[37] = -1; data[41] = -1; data[42] = -1;
    data[43] = -1; data[44] = -1; data[45] = 1; data[46] = 1; data[52] = -1;
    data[53] = -1; data[54] = 1; data[55] = 1; data[56] = 1; data[62] = -1;
    data[63] = -1; data[64] = 1; data[65] = 1; data[66] = 1; data[71] = -1;
    data[73] = 1; data[74] = 1; data[83] = 1; data[84] = 1; }




      if (boardnum == 709){
    player = 1;
    isLastPass = false;
    data[12] = -1; data[23] = -1; data[24] = -1; data[33] = -1; data[34] = -1;
    data[35] = -1; data[36] = -1; data[37] = -1; data[43] = -1; data[44] = -1;
    data[45] = -1; data[46] = -1; data[51] = -1; data[52] = -1; data[53] = -1;
    data[54] = -1; data[55] = -1; data[62] = -1; data[63] = 1; data[64] = -1;
    data[65] = 1; data[72] = -1; data[73] = 1; data[74] = 1; }




      if (boardnum == 710){
    player = 1;
    isLastPass = false;
    data[11] = 1; data[12] = 1; data[13] = 1; data[14] = 1; data[15] = 1;
    data[16] = -1; data[22] = 1; data[23] = 1; data[24] = 1; data[25] = -1;
    data[26] = -1; data[28] = -1; data[32] = 1; data[33] = 1; data[34] = -1;
    data[35] = -1; data[36] = -1; data[37] = 1; data[38] = 1; data[41] = 1;
    data[42] = 1; data[43] = -1; data[44] = -1; data[45] = 1; data[46] = -1;
    data[47] = 1; data[51] = -1; data[52] = -1; data[54] = 1; data[55] = -1;
    data[56] = 1; data[57] = -1; data[58] = -1; data[63] = -1; data[64] = -1;
    data[65] = 1; data[66] = -1; data[67] = -1; data[68] = -1; data[73] = -1;
    data[76] = 1; data[77] = 1; data[86] = 1; data[88] = 1; }




      if (boardnum == 711){
    player = 1;
    isLastPass = false;
    data[32] = -1; data[43] = -1; data[44] = 1; data[45] = 1; data[53] = 1;
    data[54] = -1; data[55] = -1; data[56] = 1; data[63] = 1; data[64] = 1;
    data[65] = -1; data[66] = -1; data[75] = -1; data[76] = -1; data[77] = -1;
    data[84] = -1; }




      if (boardnum == 712){
    player = 1;
    isLastPass = false;
    data[11] = -1; data[15] = 1; data[21] = -1; data[22] = -1; data[23] = 1;
    data[24] = 1; data[31] = -1; data[32] = -1; data[33] = -1; data[34] = 1;
    data[35] = 1; data[37] = 1; data[41] = -1; data[42] = -1; data[43] = 1;
    data[44] = -1; data[45] = 1; data[46] = 1; data[51] = -1; data[52] = -1;
    data[53] = 1; data[54] = -1; data[55] = 1; data[56] = 1; data[61] = -1;
    data[62] = 1; data[63] = -1; data[64] = 1; data[65] = 1; data[67] = 1;
    data[71] = -1; data[72] = -1; data[73] = 1; data[74] = 1; data[75] = 1;
    data[81] = -1; }




      if (boardnum == 713){
    player = 1;
    isLastPass = false;
    data[33] = 1; data[34] = -1; data[37] = 1; data[44] = 1; data[45] = -1;
    data[46] = 1; data[53] = 1; data[54] = 1; data[55] = 1; data[56] = -1;
    data[61] = 1; data[62] = 1; data[63] = 1; data[64] = 1; data[65] = 1;
    data[66] = 1; data[73] = 1; data[74] = 1; data[75] = 1; data[76] = -1;
    data[77] = -1; data[78] = -1; data[82] = 1; data[87] = -1; }




      if (boardnum == 714){
    player = 1;
    isLastPass = false;
    data[16] = 1; data[23] = -1; data[24] = 1; data[25] = 1; data[33] = -1;
    data[34] = -1; data[35] = -1; data[36] = -1; data[37] = 1; data[41] = 1;
    data[42] = 1; data[43] = -1; data[44] = 1; data[45] = -1; data[46] = -1;
    data[47] = -1; data[51] = 1; data[52] = 1; data[53] = 1; data[54] = -1;
    data[55] = -1; data[56] = -1; data[61] = 1; data[62] = 1; data[63] = 1;
    data[64] = 1; data[65] = -1; data[66] = -1; data[73] = -1; data[74] = -1;
    data[75] = -1; data[84] = -1; data[85] = -1; data[86] = 1; }




      if (boardnum == 715){
    player = -1;
    isLastPass = false;
    data[33] = 1; data[34] = -1; data[37] = 1; data[44] = 1; data[45] = -1;
    data[46] = 1; data[54] = 1; data[55] = 1; data[56] = -1; data[64] = 1;
    data[65] = -1; data[66] = -1; data[73] = 1; data[74] = -1; data[75] = -1;
    data[76] = -1; data[82] = 1; }




      if (boardnum == 716){
    player = -1;
    isLastPass = false;
    data[11] = -1; data[14] = -1; data[16] = -1; data[21] = -1; data[22] = 1;
    data[23] = 1; data[24] = 1; data[26] = -1; data[31] = -1; data[32] = -1;
    data[33] = -1; data[34] = 1; data[35] = 1; data[36] = 1; data[37] = 1;
    data[38] = 1; data[41] = 1; data[43] = -1; data[44] = -1; data[45] = -1;
    data[47] = 1; data[52] = 1; data[53] = -1; data[54] = -1; data[55] = -1;
    data[56] = 1; data[61] = 1; data[62] = 1; data[63] = -1; data[64] = 1;
    data[65] = 1; data[66] = -1; data[71] = 1; data[72] = 1; data[73] = 1;
    data[74] = 1; data[75] = 1; data[76] = -1; data[77] = -1; data[81] = -1;
    data[83] = -1; data[87] = -1; data[88] = -1; }




      if (boardnum == 717){
    player = 1;
    isLastPass = false;
    data[11] = -1; data[14] = -1; data[16] = -1; data[21] = -1; data[22] = 1;
    data[23] = -1; data[26] = -1; data[31] = -1; data[32] = -1; data[33] = -1;
    data[34] = -1; data[35] = 1; data[36] = -1; data[41] = 1; data[43] = 1;
    data[44] = 1; data[45] = -1; data[52] = 1; data[53] = 1; data[54] = 1;
    data[55] = 1; data[56] = 1; data[63] = 1; data[64] = 1; data[65] = -1;
    data[73] = 1; data[74] = 1; data[75] = 1; }




      if (boardnum == 718){
    player = 1;
    isLastPass = false;
    data[11] = -1; data[13] = -1; data[21] = -1; data[23] = -1; data[24] = 1;
    data[26] = 1; data[31] = -1; data[32] = 1; data[33] = -1; data[34] = 1;
    data[35] = 1; data[36] = 1; data[41] = -1; data[42] = -1; data[43] = 1;
    data[44] = 1; data[45] = -1; data[46] = 1; data[51] = -1; data[52] = -1;
    data[53] = -1; data[54] = 1; data[55] = 1; data[56] = 1; data[62] = -1;
    data[63] = -1; data[64] = 1; data[65] = 1; data[73] = -1; data[74] = 1;
    data[82] = -1; data[83] = -1; data[84] = -1; data[85] = -1; }




      if (boardnum == 719){
    player = 1;
    isLastPass = false;
    data[32] = 1; data[33] = -1; data[34] = -1; data[35] = -1; data[42] = -1;
    data[43] = -1; data[44] = -1; data[45] = -1; data[52] = 1; data[53] = -1;
    data[54] = 1; data[55] = -1; data[56] = 1; data[62] = 1; data[63] = -1;
    data[64] = -1; data[65] = 1; data[66] = 1; data[73] = -1; data[74] = -1;
    }




      if (boardnum == 720){
    player = -1;
    isLastPass = false;
    data[14] = 1; data[23] = 1; data[24] = 1; data[25] = -1; data[26] = 1;
    data[32] = 1; data[33] = 1; data[34] = -1; data[35] = -1; data[36] = 1;
    data[42] = 1; data[43] = -1; data[44] = -1; data[45] = 1; data[46] = 1;
    data[51] = 1; data[52] = 1; data[53] = -1; data[54] = 1; data[55] = -1;
    data[56] = 1; data[57] = 1; data[62] = 1; data[63] = 1; data[64] = -1;
    data[66] = 1; data[72] = 1; data[73] = 1; data[75] = -1; data[84] = 1;
    data[86] = -1; }




      if (boardnum == 721){
    player = -1;
    isLastPass = false;
    data[11] = -1; data[14] = 1; data[15] = 1; data[16] = 1; data[17] = 1;
    data[18] = 1; data[21] = 1; data[22] = 1; data[23] = 1; data[24] = 1;
    data[25] = 1; data[26] = 1; data[27] = 1; data[28] = 1; data[33] = -1;
    data[34] = 1; data[35] = 1; data[36] = -1; data[37] = 1; data[38] = 1;
    data[42] = 1; data[43] = 1; data[44] = -1; data[45] = -1; data[46] = -1;
    data[47] = -1; data[52] = -1; data[53] = -1; data[54] = -1; data[55] = -1;
    data[56] = -1; data[57] = -1; data[64] = -1; data[65] = -1; data[66] = -1;
    data[67] = -1; data[68] = -1; data[73] = -1; data[74] = -1; data[75] = -1;
    data[76] = -1; data[83] = -1; data[86] = -1; }




      if (boardnum == 722){
    player = 1;
    isLastPass = false;
    data[13] = -1; data[24] = -1; data[33] = -1; data[34] = 1; data[35] = -1;
    data[36] = 1; data[37] = 1; data[44] = 1; data[45] = 1; data[46] = 1;
    data[53] = -1; data[54] = -1; data[55] = -1; data[56] = -1; data[64] = 1;
    data[65] = 1; }




      if (boardnum == 723){
    player = 1;
    isLastPass = false;
    data[14] = 1; data[25] = 1; data[33] = 1; data[34] = 1; data[35] = -1;
    data[36] = 1; data[37] = 1; data[43] = 1; data[44] = -1; data[45] = 1;
    data[46] = 1; data[53] = -1; data[54] = -1; data[55] = -1; data[56] = 1;
    data[57] = 1; data[63] = 1; data[64] = -1; data[65] = -1; data[66] = -1;
    data[67] = 1; data[72] = 1; data[73] = 1; data[74] = 1; data[75] = -1;
    data[76] = 1; data[77] = 1; data[78] = 1; data[85] = -1; data[86] = -1;
    data[87] = -1; data[88] = -1; }




      if (boardnum == 724){
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




      if (boardnum == 725){
    player = 1;
    isLastPass = false;
    data[11] = 1; data[12] = 1; data[13] = 1; data[14] = 1; data[15] = 1;
    data[16] = 1; data[17] = 1; data[21] = 1; data[22] = 1; data[23] = -1;
    data[24] = -1; data[25] = -1; data[31] = 1; data[32] = 1; data[33] = -1;
    data[34] = 1; data[35] = 1; data[36] = -1; data[37] = -1; data[42] = -1;
    data[43] = -1; data[44] = 1; data[45] = 1; data[46] = -1; data[52] = -1;
    data[54] = -1; data[55] = -1; data[56] = -1; data[65] = -1; }




      if (boardnum == 726){
    player = -1;
    isLastPass = false;
    data[33] = 1; data[34] = -1; data[42] = 1; data[43] = 1; data[44] = 1;
    data[45] = 1; data[46] = 1; data[53] = 1; data[54] = -1; data[55] = 1;
    data[56] = -1; data[63] = 1; data[64] = 1; data[65] = -1; data[66] = -1;
    data[73] = 1; data[75] = 1; data[76] = -1; data[77] = 1; }




      if (boardnum == 727){
    player = -1;
    isLastPass = false;
    data[11] = 1; data[12] = 1; data[13] = 1; data[14] = 1; data[15] = 1;
    data[16] = -1; data[22] = 1; data[23] = 1; data[24] = -1; data[25] = -1;
    data[26] = -1; data[27] = -1; data[31] = 1; data[32] = 1; data[33] = 1;
    data[34] = 1; data[35] = 1; data[36] = -1; data[43] = -1; data[44] = -1;
    data[45] = -1; data[46] = -1; data[47] = -1; data[53] = -1; data[54] = -1;
    data[55] = 1; data[56] = -1; data[63] = -1; data[64] = -1; data[65] = -1;
    data[66] = -1; data[73] = -1; data[74] = -1; data[75] = -1; data[76] = -1;
    }




      if (boardnum == 728){
    player = -1;
    isLastPass = false;
    data[25] = 1; data[32] = -1; data[33] = -1; data[34] = -1; data[35] = 1;
    data[36] = 1; data[37] = -1; data[42] = -1; data[43] = -1; data[44] = -1;
    data[45] = 1; data[46] = 1; data[47] = 1; data[48] = 1; data[51] = -1;
    data[52] = -1; data[53] = -1; data[54] = -1; data[55] = -1; data[56] = 1;
    data[57] = 1; data[58] = 1; data[62] = -1; data[64] = -1; data[67] = -1;
    data[68] = 1; data[73] = -1; }




      if (boardnum == 729){
    player = -1;
    isLastPass = false;
    data[13] = 1; data[14] = 1; data[15] = 1; data[16] = 1; data[17] = 1;
    data[18] = -1; data[23] = 1; data[24] = 1; data[25] = 1; data[26] = 1;
    data[27] = -1; data[28] = -1; data[31] = 1; data[32] = 1; data[33] = 1;
    data[34] = 1; data[35] = -1; data[36] = -1; data[37] = 1; data[38] = -1;
    data[41] = 1; data[42] = 1; data[43] = -1; data[44] = -1; data[45] = -1;
    data[46] = -1; data[47] = 1; data[48] = -1; data[51] = 1; data[52] = 1;
    data[53] = 1; data[54] = 1; data[55] = -1; data[56] = 1; data[57] = 1;
    data[64] = 1; data[65] = 1; data[66] = 1; data[67] = 1; data[74] = 1;
    data[76] = 1; }




      if (boardnum == 730){
    player = -1;
    isLastPass = false;
    data[13] = -1; data[14] = 1; data[15] = 1; data[24] = 1; data[25] = 1;
    data[26] = 1; data[32] = 1; data[33] = 1; data[34] = 1; data[35] = 1;
    data[36] = 1; data[37] = 1; data[38] = 1; data[43] = 1; data[44] = -1;
    data[45] = 1; data[46] = -1; data[53] = 1; data[54] = 1; data[55] = -1;
    data[56] = 1; data[62] = 1; data[63] = 1; data[64] = 1; data[66] = -1;
    data[73] = 1; data[74] = 1; }




      if (boardnum == 731){
    player = -1;
    isLastPass = false;
    data[13] = -1; data[23] = -1; data[24] = -1; data[26] = 1; data[32] = -1;
    data[33] = -1; data[34] = -1; data[35] = -1; data[36] = 1; data[44] = -1;
    data[45] = 1; data[46] = 1; data[53] = -1; data[54] = 1; data[55] = 1;
    data[63] = 1; data[65] = 1; data[75] = 1; data[76] = -1; }




      if (boardnum == 732){
    player = 1;
    isLastPass = false;
    data[17] = 1; data[18] = 1; data[24] = -1; data[26] = 1; data[27] = 1;
    data[33] = -1; data[34] = -1; data[35] = -1; data[36] = 1; data[43] = -1;
    data[44] = 1; data[45] = 1; data[46] = -1; data[53] = 1; data[54] = 1;
    data[55] = -1; data[56] = -1; data[57] = -1; data[64] = 1; data[65] = -1;
    data[66] = -1; data[67] = -1; data[68] = -1; data[74] = -1; data[75] = -1;
    data[76] = -1; data[83] = -1; data[86] = -1; }




      if (boardnum == 733){
    player = 1;
    isLastPass = false;
    data[14] = 1; data[23] = -1; data[24] = 1; data[25] = -1; data[26] = -1;
    data[34] = 1; data[35] = -1; data[36] = -1; data[44] = 1; data[45] = 1;
    data[46] = -1; data[47] = -1; data[54] = -1; data[55] = 1; data[56] = 1;
    data[57] = -1; data[58] = -1; data[63] = -1; data[65] = 1; data[66] = 1;
    }




      if (boardnum == 734){
    player = -1;
    isLastPass = false;
    data[14] = 1; data[25] = 1; data[33] = 1; data[34] = 1; data[35] = -1;
    data[36] = 1; data[37] = 1; data[43] = 1; data[44] = 1; data[45] = 1;
    data[46] = 1; data[54] = 1; data[55] = -1; data[56] = 1; data[57] = 1;
    data[63] = 1; data[64] = -1; data[65] = -1; data[66] = -1; data[67] = 1;
    data[72] = 1; data[73] = 1; data[74] = 1; data[75] = -1; data[76] = -1;
    data[77] = -1; data[86] = -1; data[87] = -1; data[88] = -1; }




      if (boardnum == 735){
    player = 1;
    isLastPass = false;
    data[13] = -1; data[14] = -1; data[15] = -1; data[16] = -1; data[17] = -1;
    data[22] = 1; data[24] = -1; data[25] = 1; data[26] = -1; data[32] = -1;
    data[33] = -1; data[34] = -1; data[35] = -1; data[36] = 1; data[42] = -1;
    data[43] = -1; data[44] = 1; data[45] = 1; data[46] = 1; data[47] = 1;
    data[53] = -1; data[54] = -1; data[55] = 1; data[56] = 1; data[62] = 1;
    data[63] = -1; data[64] = -1; data[65] = -1; data[75] = 1; data[76] = -1;
    }




      if (boardnum == 736){
    player = -1;
    isLastPass = false;
    data[13] = -1; data[17] = -1; data[23] = -1; data[26] = -1; data[31] = -1;
    data[32] = -1; data[33] = -1; data[34] = -1; data[35] = -1; data[43] = 1;
    data[44] = 1; data[45] = 1; data[54] = 1; data[55] = 1; data[56] = 1;
    data[65] = 1; data[66] = -1; }




      if (boardnum == 737){
    player = -1;
    isLastPass = false;
    data[11] = 1; data[12] = 1; data[13] = 1; data[14] = 1; data[15] = 1;
    data[22] = 1; data[23] = 1; data[24] = 1; data[25] = 1; data[26] = 1;
    data[33] = 1; data[34] = 1; data[35] = -1; data[36] = 1; data[37] = 1;
    data[42] = -1; data[43] = -1; data[44] = -1; data[45] = 1; data[46] = 1;
    data[47] = -1; data[51] = -1; data[52] = -1; data[54] = -1; data[55] = -1;
    data[56] = -1; data[57] = -1; data[58] = -1; data[63] = -1; data[64] = 1;
    data[65] = -1; data[66] = 1; data[67] = 1; data[76] = 1; data[77] = 1;
    data[86] = 1; data[88] = 1; }




      if (boardnum == 738){
    player = 1;
    isLastPass = false;
    data[25] = 1; data[32] = -1; data[33] = -1; data[34] = -1; data[35] = -1;
    data[36] = -1; data[43] = -1; data[44] = 1; data[45] = 1; data[46] = 1;
    data[53] = -1; data[54] = -1; data[55] = 1; data[56] = 1; data[63] = -1;
    data[64] = 1; }




      if (boardnum == 739){
    player = -1;
    isLastPass = false;
    data[14] = -1; data[24] = -1; data[32] = 1; data[33] = 1; data[34] = -1;
    data[35] = -1; data[36] = -1; data[37] = -1; data[43] = 1; data[44] = 1;
    data[45] = 1; data[53] = -1; data[54] = 1; data[55] = -1; data[62] = -1;
    }




      if (boardnum == 740){
    player = -1;
    isLastPass = false;
    data[14] = 1; data[23] = 1; data[24] = 1; data[26] = 1; data[32] = 1;
    data[33] = 1; data[34] = 1; data[35] = 1; data[36] = 1; data[42] = 1;
    data[43] = -1; data[44] = -1; data[45] = 1; data[46] = 1; data[51] = 1;
    data[52] = 1; data[53] = -1; data[54] = -1; data[55] = -1; data[56] = 1;
    data[57] = 1; data[62] = 1; data[63] = -1; data[64] = -1; data[66] = 1;
    data[73] = -1; data[75] = 1; }




      if (boardnum == 741){
    player = 1;
    isLastPass = false;
    data[12] = -1; data[21] = -1; data[23] = -1; data[24] = -1; data[32] = -1;
    data[33] = -1; data[34] = -1; data[35] = -1; data[36] = -1; data[37] = -1;
    data[41] = 1; data[42] = 1; data[43] = -1; data[44] = -1; data[45] = -1;
    data[46] = -1; data[47] = -1; data[51] = 1; data[52] = 1; data[53] = 1;
    data[54] = -1; data[55] = -1; data[56] = -1; data[61] = 1; data[62] = -1;
    data[63] = -1; data[64] = -1; data[65] = -1; data[66] = -1; data[71] = -1;
    data[72] = -1; data[73] = -1; data[74] = -1; data[75] = -1; data[82] = -1;
    data[84] = -1; }




      if (boardnum == 742){
    player = -1;
    isLastPass = false;
    data[24] = -1; data[25] = -1; data[26] = 1; data[33] = 1; data[34] = 1;
    data[35] = 1; data[36] = 1; data[37] = -1; data[43] = -1; data[44] = -1;
    data[45] = 1; data[46] = 1; data[47] = -1; data[48] = -1; data[52] = -1;
    data[53] = -1; data[54] = -1; data[55] = -1; data[56] = 1; }




      if (boardnum == 743){
    player = -1;
    isLastPass = false;
    data[23] = 1; data[24] = 1; data[25] = 1; data[26] = 1; data[33] = 1;
    data[34] = -1; data[36] = 1; data[43] = -1; data[44] = -1; data[45] = -1;
    data[46] = 1; data[53] = 1; data[54] = -1; data[55] = 1; data[56] = 1;
    data[63] = 1; data[64] = 1; data[65] = 1; data[66] = -1; data[75] = 1;
    data[85] = 1; }




      if (boardnum == 744){
    player = -1;
    isLastPass = false;
    data[11] = 1; data[12] = 1; data[13] = 1; data[14] = 1; data[15] = 1;
    data[23] = -1; data[24] = 1; data[25] = 1; data[31] = -1; data[32] = -1;
    data[33] = 1; data[34] = -1; data[35] = 1; data[36] = 1; data[41] = -1;
    data[42] = -1; data[43] = -1; data[44] = -1; data[45] = -1; data[46] = 1;
    data[47] = 1; data[51] = 1; data[52] = 1; data[53] = 1; data[54] = -1;
    data[55] = 1; data[56] = 1; data[62] = 1; data[63] = 1; data[64] = 1;
    data[65] = 1; data[67] = 1; data[73] = 1; data[74] = 1; data[75] = 1;
    data[78] = 1; data[82] = 1; }




      if (boardnum == 745){
    player = 1;
    isLastPass = false;
    data[13] = -1; data[15] = 1; data[16] = -1; data[24] = -1; data[25] = 1;
    data[26] = 1; data[33] = -1; data[34] = -1; data[35] = -1; data[36] = 1;
    data[37] = 1; data[43] = -1; data[44] = -1; data[45] = 1; data[46] = -1;
    data[53] = 1; data[54] = 1; data[55] = 1; data[56] = 1; data[57] = -1;
    }




      if (boardnum == 746){
    player = -1;
    isLastPass = false;
    data[15] = -1; data[17] = 1; data[18] = 1; data[23] = -1; data[24] = 1;
    data[25] = 1; data[26] = 1; data[27] = 1; data[33] = -1; data[34] = 1;
    data[35] = 1; data[36] = 1; data[37] = -1; data[38] = -1; data[43] = -1;
    data[44] = 1; data[45] = -1; data[46] = 1; data[47] = -1; data[52] = -1;
    data[53] = -1; data[54] = -1; data[55] = -1; data[56] = -1; data[65] = -1;
    }




      if (boardnum == 747){
    player = 1;
    isLastPass = false;
    data[13] = 1; data[14] = 1; data[15] = -1; data[16] = -1; data[17] = -1;
    data[18] = -1; data[24] = 1; data[25] = 1; data[26] = -1; data[27] = -1;
    data[28] = -1; data[31] = 1; data[32] = 1; data[33] = 1; data[34] = 1;
    data[35] = -1; data[36] = 1; data[37] = 1; data[38] = -1; data[42] = 1;
    data[43] = 1; data[44] = 1; data[45] = -1; data[46] = 1; data[47] = 1;
    data[48] = -1; data[53] = 1; data[54] = -1; data[55] = 1; data[56] = 1;
    data[62] = 1; data[63] = -1; data[64] = 1; data[65] = 1; data[66] = 1;
    }




      if (boardnum == 748){
    player = 1;
    isLastPass = false;
    data[16] = 1; data[25] = 1; data[26] = 1; data[33] = -1; data[34] = -1;
    data[35] = -1; data[36] = 1; data[37] = -1; data[43] = -1; data[44] = -1;
    data[45] = -1; data[46] = -1; data[47] = -1; data[48] = -1; data[54] = -1;
    data[55] = -1; data[56] = 1; data[65] = -1; }




      if (boardnum == 749){
    player = 1;
    isLastPass = false;
    data[13] = -1; data[14] = -1; data[15] = -1; data[16] = -1; data[23] = -1;
    data[24] = -1; data[25] = -1; data[26] = -1; data[32] = -1; data[33] = -1;
    data[34] = -1; data[35] = -1; data[36] = -1; data[37] = -1; data[38] = 1;
    data[42] = 1; data[43] = -1; data[44] = -1; data[45] = 1; data[46] = -1;
    data[47] = 1; data[53] = -1; data[54] = 1; data[55] = 1; data[56] = 1;
    data[58] = -1; data[65] = -1; data[66] = 1; data[67] = 1; data[75] = -1;
    }




      if (boardnum == 750){
    player = -1;
    isLastPass = false;
    data[16] = 1; data[23] = -1; data[25] = 1; data[26] = 1; data[33] = 1;
    data[34] = 1; data[35] = 1; data[36] = 1; data[37] = -1; data[42] = -1;
    data[43] = -1; data[44] = 1; data[45] = -1; data[46] = -1; data[53] = -1;
    data[54] = 1; data[55] = -1; data[63] = -1; data[64] = 1; data[73] = -1;
    data[74] = 1; }




      if (boardnum == 751){
    player = 1;
    isLastPass = false;
    data[25] = 1; data[34] = 1; data[35] = 1; data[36] = 1; data[43] = 1;
    data[44] = -1; data[45] = 1; data[46] = -1; data[47] = -1; data[53] = 1;
    data[54] = 1; data[55] = -1; data[56] = -1; data[57] = -1; data[63] = 1;
    data[64] = -1; data[65] = -1; data[67] = 1; data[74] = -1; data[76] = 1;
    }




      if (boardnum == 752){
    player = -1;
    isLastPass = false;
    data[32] = -1; data[33] = -1; data[34] = -1; data[35] = -1; data[36] = -1;
    data[37] = -1; data[42] = -1; data[43] = 1; data[44] = -1; data[45] = 1;
    data[46] = -1; data[47] = -1; data[51] = -1; data[53] = -1; data[54] = -1;
    data[55] = -1; data[56] = 1; data[57] = 1; data[58] = 1; data[62] = 1;
    data[64] = -1; data[67] = -1; data[68] = 1; }




      if (boardnum == 753){
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




      if (boardnum == 754){
    player = 1;
    isLastPass = false;
    data[12] = 1; data[13] = 1; data[14] = 1; data[15] = 1; data[23] = 1;
    data[24] = 1; data[25] = 1; data[26] = 1; data[28] = -1; data[32] = 1;
    data[33] = 1; data[34] = 1; data[35] = 1; data[36] = 1; data[37] = 1;
    data[38] = -1; data[43] = 1; data[44] = 1; data[45] = -1; data[46] = -1;
    data[47] = -1; data[48] = -1; data[52] = 1; data[53] = 1; data[54] = -1;
    data[55] = 1; data[56] = -1; data[57] = -1; data[58] = -1; data[62] = 1;
    data[63] = 1; data[64] = 1; data[65] = -1; data[66] = -1; data[67] = -1;
    data[73] = 1; data[74] = -1; data[75] = -1; data[76] = -1; data[83] = -1;
    data[84] = -1; data[85] = -1; }




      if (boardnum == 755){
    player = 1;
    isLastPass = false;
    data[35] = 1; data[36] = -1; data[42] = -1; data[44] = -1; data[45] = 1;
    data[52] = -1; data[53] = -1; data[54] = -1; data[55] = 1; data[56] = 1;
    data[62] = -1; data[63] = -1; data[64] = 1; data[65] = -1; data[66] = 1;
    data[74] = -1; data[75] = -1; data[76] = -1; data[85] = -1; data[87] = -1;
    }




      if (boardnum == 756){
    player = 1;
    isLastPass = false;
    data[15] = 1; data[16] = 1; data[17] = 1; data[18] = 1; data[21] = 1;
    data[22] = -1; data[23] = 1; data[25] = 1; data[26] = -1; data[27] = 1;
    data[32] = -1; data[33] = -1; data[34] = -1; data[35] = -1; data[36] = 1;
    data[37] = -1; data[41] = 1; data[42] = -1; data[43] = -1; data[44] = -1;
    data[45] = 1; data[46] = -1; data[47] = -1; data[48] = -1; data[52] = -1;
    data[54] = 1; data[55] = -1; data[56] = 1; data[57] = 1; data[58] = -1;
    data[62] = 1; data[63] = 1; data[64] = 1; data[65] = 1; data[66] = 1;
    data[67] = 1; data[68] = -1; data[73] = 1; data[74] = 1; data[75] = 1;
    data[76] = 1; data[85] = -1; }




      if (boardnum == 757){
    player = 1;
    isLastPass = false;
    data[14] = -1; data[16] = 1; data[17] = 1; data[18] = 1; data[24] = -1;
    data[25] = -1; data[26] = -1; data[28] = 1; data[33] = -1; data[34] = -1;
    data[35] = -1; data[36] = -1; data[37] = -1; data[38] = 1; data[43] = 1;
    data[44] = 1; data[45] = 1; data[46] = -1; data[47] = -1; data[48] = 1;
    data[54] = 1; data[55] = -1; data[56] = -1; data[57] = 1; data[58] = 1;
    data[66] = -1; data[67] = 1; data[68] = 1; }




      if (boardnum == 758){
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




      if (boardnum == 759){
    player = -1;
    isLastPass = false;
    data[26] = 1; data[27] = -1; data[33] = -1; data[34] = -1; data[35] = 1;
    data[36] = 1; data[37] = -1; data[43] = 1; data[44] = 1; data[45] = -1;
    data[46] = 1; data[47] = 1; data[53] = -1; data[54] = -1; data[55] = -1;
    data[56] = 1; data[65] = -1; }




      if (boardnum == 760){
    player = 1;
    isLastPass = false;
    data[11] = -1; data[12] = 1; data[13] = -1; data[21] = -1; data[22] = -1;
    data[23] = -1; data[24] = -1; data[26] = -1; data[31] = -1; data[32] = -1;
    data[33] = -1; data[34] = -1; data[35] = -1; data[36] = -1; data[37] = -1;
    data[38] = 1; data[41] = -1; data[42] = -1; data[43] = 1; data[44] = -1;
    data[45] = -1; data[46] = -1; data[47] = -1; data[48] = 1; data[51] = -1;
    data[52] = 1; data[53] = -1; data[54] = -1; data[55] = -1; data[56] = -1;
    data[57] = -1; data[58] = 1; data[62] = 1; data[63] = 1; data[64] = -1;
    data[65] = 1; data[66] = -1; data[67] = -1; data[72] = 1; data[73] = 1;
    data[74] = 1; data[75] = 1; data[81] = 1; data[85] = 1; }




      if (boardnum == 761){
    player = -1;
    isLastPass = false;
    data[16] = 1; data[23] = 1; data[24] = -1; data[25] = 1; data[26] = 1;
    data[32] = 1; data[33] = -1; data[34] = 1; data[35] = 1; data[36] = 1;
    data[37] = -1; data[42] = -1; data[43] = -1; data[44] = -1; data[45] = 1;
    data[46] = 1; data[47] = -1; data[48] = -1; data[54] = -1; data[55] = -1;
    data[56] = 1; data[57] = 1; data[65] = -1; }




      if (boardnum == 762){
    player = -1;
    isLastPass = false;
    data[14] = -1; data[22] = -1; data[23] = 1; data[24] = -1; data[32] = 1;
    data[33] = 1; data[34] = 1; data[35] = -1; data[36] = -1; data[37] = -1;
    data[43] = 1; data[44] = -1; data[45] = 1; data[53] = -1; data[54] = 1;
    data[55] = -1; data[62] = -1; }




      if (boardnum == 763){
    player = -1;
    isLastPass = false;
    data[11] = -1; data[12] = -1; data[13] = -1; data[14] = -1; data[15] = -1;
    data[16] = -1; data[17] = -1; data[22] = -1; data[23] = 1; data[24] = 1;
    data[25] = 1; data[26] = 1; data[27] = 1; data[31] = -1; data[32] = -1;
    data[33] = 1; data[34] = -1; data[35] = -1; data[36] = 1; data[41] = -1;
    data[42] = -1; data[43] = -1; data[44] = -1; data[45] = 1; data[46] = 1;
    data[47] = 1; data[51] = 1; data[52] = 1; data[53] = 1; data[54] = 1;
    data[55] = 1; data[56] = 1; data[65] = 1; data[66] = 1; data[74] = 1;
    data[75] = 1; data[76] = 1; }




      if (boardnum == 764){
    player = -1;
    isLastPass = false;
    data[31] = -1; data[32] = -1; data[33] = -1; data[34] = -1; data[35] = -1;
    data[42] = -1; data[43] = -1; data[44] = -1; data[45] = -1; data[52] = 1;
    data[53] = -1; data[54] = 1; data[55] = -1; data[56] = 1; data[62] = 1;
    data[63] = -1; data[64] = -1; data[65] = 1; data[66] = 1; data[73] = 1;
    data[74] = 1; data[83] = 1; data[84] = 1; }




      if (boardnum == 765){
    player = -1;
    isLastPass = false;
    data[14] = 1; data[24] = -1; data[25] = 1; data[27] = 1; data[34] = -1;
    data[35] = -1; data[36] = 1; data[37] = -1; data[44] = -1; data[45] = 1;
    data[46] = -1; data[53] = -1; data[54] = 1; data[55] = -1; data[63] = 1;
    }




      if (boardnum == 766){
    player = -1;
    isLastPass = false;
    data[36] = -1; data[37] = -1; data[38] = -1; data[43] = 1; data[44] = 1;
    data[45] = 1; data[46] = 1; data[47] = -1; data[48] = -1; data[53] = -1;
    data[54] = -1; data[55] = -1; data[56] = -1; data[57] = 1; data[58] = -1;
    data[63] = -1; data[64] = 1; data[65] = 1; data[66] = 1; data[67] = 1;
    data[68] = 1; data[73] = 1; data[74] = 1; data[75] = 1; data[76] = -1;
    data[84] = 1; data[85] = 1; data[86] = 1; data[87] = 1; }




      if (boardnum == 767){
    player = 1;
    isLastPass = false;
    data[23] = -1; data[24] = 1; data[26] = 1; data[33] = -1; data[34] = -1;
    data[35] = 1; data[36] = -1; data[42] = -1; data[43] = 1; data[44] = 1;
    data[45] = -1; data[46] = 1; data[47] = 1; data[48] = 1; data[51] = -1;
    data[52] = -1; data[53] = -1; data[54] = -1; data[55] = -1; data[56] = 1;
    data[57] = 1; data[61] = -1; data[62] = -1; data[63] = 1; data[64] = -1;
    data[65] = -1; data[66] = 1; data[73] = -1; data[74] = -1; data[75] = -1;
    data[76] = 1; data[83] = 1; data[84] = -1; data[85] = 1; }




      if (boardnum == 768){
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




      if (boardnum == 769){
    player = -1;
    isLastPass = false;
    data[36] = -1; data[37] = 1; data[43] = 1; data[44] = 1; data[45] = 1;
    data[46] = 1; data[47] = 1; data[53] = -1; data[54] = -1; data[55] = 1;
    data[56] = 1; data[57] = -1; data[63] = -1; data[64] = 1; data[65] = 1;
    data[66] = -1; data[67] = -1; data[73] = 1; data[74] = 1; data[75] = -1;
    data[76] = -1; data[84] = 1; data[85] = 1; data[86] = 1; data[87] = 1;
    }




      if (boardnum == 770){
    player = 1;
    isLastPass = false;
    data[23] = -1; data[33] = -1; data[34] = -1; data[43] = -1; data[44] = -1;
    data[45] = -1; data[52] = -1; data[54] = 1; data[55] = -1; data[56] = -1;
    data[57] = -1; data[63] = -1; data[64] = -1; data[65] = 1; data[74] = -1;
    data[76] = 1; }




      if (boardnum == 771){
    player = -1;
    isLastPass = false;
    data[13] = 1; data[23] = 1; data[24] = 1; data[25] = 1; data[31] = -1;
    data[32] = -1; data[33] = 1; data[34] = -1; data[35] = 1; data[36] = 1;
    data[43] = 1; data[44] = 1; data[45] = 1; data[46] = 1; data[52] = 1;
    data[53] = 1; data[54] = -1; data[55] = 1; data[56] = 1; data[62] = 1;
    data[63] = 1; data[64] = 1; data[65] = -1; data[73] = 1; data[82] = 1;
    }




      if (boardnum == 772){
    player = 1;
    isLastPass = false;
    data[13] = 1; data[14] = 1; data[15] = 1; data[16] = 1; data[18] = 1;
    data[22] = -1; data[23] = -1; data[24] = 1; data[25] = 1; data[26] = -1;
    data[27] = 1; data[31] = -1; data[32] = -1; data[33] = -1; data[34] = 1;
    data[35] = 1; data[36] = 1; data[37] = -1; data[42] = -1; data[43] = 1;
    data[44] = -1; data[45] = 1; data[46] = 1; data[47] = 1; data[52] = 1;
    data[53] = -1; data[54] = -1; data[55] = -1; }




      if (boardnum == 773){
    player = -1;
    isLastPass = false;
    data[12] = 1; data[13] = 1; data[14] = 1; data[22] = 1; data[23] = 1;
    data[24] = 1; data[25] = 1; data[26] = 1; data[32] = 1; data[33] = 1;
    data[34] = 1; data[35] = -1; data[36] = 1; data[37] = 1; data[43] = -1;
    data[44] = 1; data[45] = 1; data[46] = 1; data[47] = 1; data[48] = -1;
    data[52] = -1; data[53] = -1; data[54] = 1; data[55] = 1; data[56] = 1;
    data[57] = 1; data[58] = 1; data[62] = 1; data[63] = -1; }




      if (boardnum == 774){
    player = 1;
    isLastPass = false;
    data[24] = -1; data[34] = -1; data[35] = -1; data[36] = 1; data[42] = -1;
    data[43] = -1; data[44] = -1; data[45] = 1; data[46] = 1; data[52] = 1;
    data[53] = -1; data[54] = -1; data[55] = 1; data[56] = 1; data[62] = 1;
    data[63] = 1; data[64] = -1; data[65] = -1; data[66] = 1; data[73] = 1;
    data[74] = -1; data[75] = -1; }




      if (boardnum == 775){
    player = -1;
    isLastPass = false;
    data[13] = -1; data[14] = 1; data[15] = 1; data[24] = 1; data[25] = 1;
    data[26] = 1; data[32] = 1; data[33] = 1; data[34] = 1; data[35] = 1;
    data[36] = 1; data[43] = 1; data[44] = -1; data[45] = 1; data[46] = 1;
    data[53] = 1; data[54] = 1; data[55] = -1; data[56] = 1; data[62] = 1;
    data[63] = 1; data[64] = 1; data[66] = -1; data[73] = 1; data[74] = 1;
    }




      if (boardnum == 776){
    player = -1;
    isLastPass = false;
    data[12] = 1; data[13] = 1; data[14] = 1; data[22] = 1; data[23] = 1;
    data[24] = 1; data[25] = 1; data[26] = 1; data[27] = 1; data[28] = 1;
    data[31] = -1; data[32] = 1; data[33] = 1; data[34] = -1; data[35] = -1;
    data[36] = 1; data[37] = 1; data[38] = 1; data[41] = 1; data[42] = 1;
    data[43] = -1; data[44] = -1; data[45] = 1; data[46] = 1; data[47] = 1;
    data[48] = 1; data[51] = 1; data[52] = 1; data[53] = -1; data[54] = 1;
    data[55] = 1; data[56] = -1; data[57] = -1; data[58] = 1; data[61] = -1;
    data[62] = 1; data[63] = 1; data[64] = -1; data[66] = -1; data[72] = 1;
    data[73] = 1; }




      if (boardnum == 777){
    player = 1;
    isLastPass = false;
    data[14] = -1; data[16] = 1; data[17] = 1; data[18] = 1; data[24] = -1;
    data[25] = -1; data[26] = -1; data[28] = 1; data[33] = -1; data[34] = -1;
    data[35] = -1; data[36] = -1; data[37] = -1; data[38] = 1; data[43] = 1;
    data[44] = 1; data[45] = 1; data[46] = -1; data[47] = -1; data[48] = 1;
    data[54] = 1; data[55] = -1; data[56] = -1; data[57] = 1; data[58] = 1;
    data[66] = -1; data[67] = 1; data[68] = 1; }




      if (boardnum == 778){
    player = -1;
    isLastPass = false;
    data[13] = -1; data[23] = -1; data[24] = -1; data[25] = 1; data[26] = -1;
    data[33] = -1; data[34] = 1; data[35] = 1; data[36] = 1; data[37] = 1;
    data[42] = -1; data[43] = 1; data[44] = -1; data[45] = -1; data[46] = -1;
    data[47] = 1; data[52] = 1; data[53] = 1; data[54] = 1; data[55] = 1;
    data[56] = -1; data[57] = -1; data[63] = 1; data[64] = 1; data[65] = 1;
    data[66] = 1; data[73] = -1; data[74] = 1; data[76] = -1; }




      if (boardnum == 779){
    player = -1;
    isLastPass = false;
    data[11] = -1; data[14] = -1; data[16] = -1; data[21] = -1; data[22] = 1;
    data[23] = 1; data[24] = 1; data[26] = -1; data[31] = -1; data[32] = -1;
    data[33] = -1; data[34] = 1; data[35] = -1; data[36] = -1; data[41] = 1;
    data[43] = 1; data[44] = -1; data[45] = -1; data[47] = -1; data[52] = 1;
    data[53] = -1; data[54] = 1; data[55] = 1; data[56] = -1; data[61] = 1;
    data[62] = 1; data[63] = 1; data[64] = 1; data[65] = 1; data[66] = 1;
    data[73] = 1; data[74] = 1; data[75] = 1; }




      if (boardnum == 780){
    player = 1;
    isLastPass = false;
    data[24] = -1; data[31] = -1; data[32] = 1; data[34] = -1; data[35] = -1;
    data[36] = 1; data[42] = -1; data[43] = -1; data[44] = -1; data[45] = 1;
    data[46] = 1; data[52] = 1; data[53] = -1; data[54] = -1; data[55] = 1;
    data[56] = 1; data[62] = 1; data[63] = 1; data[64] = -1; data[65] = -1;
    data[66] = 1; data[73] = 1; data[74] = -1; data[75] = -1; }




      if (boardnum == 781){
    player = -1;
    isLastPass = false;
    data[11] = -1; data[12] = -1; data[13] = -1; data[14] = -1; data[15] = -1;
    data[16] = -1; data[17] = -1; data[18] = -1; data[22] = -1; data[23] = 1;
    data[24] = -1; data[25] = 1; data[26] = 1; data[27] = 1; data[28] = 1;
    data[32] = -1; data[33] = -1; data[34] = 1; data[35] = -1; data[36] = -1;
    data[37] = 1; data[38] = 1; data[42] = -1; data[43] = 1; data[44] = 1;
    data[45] = -1; data[46] = 1; data[47] = 1; data[48] = 1; data[52] = 1;
    data[53] = 1; data[54] = 1; data[55] = 1; data[56] = 1; data[62] = 1;
    data[63] = -1; data[64] = 1; data[66] = 1; data[67] = 1; data[68] = 1;
    data[73] = -1; }




      if (boardnum == 782){
    player = 1;
    isLastPass = false;
    data[14] = 1; data[16] = 1; data[23] = 1; data[24] = 1; data[25] = 1;
    data[26] = 1; data[32] = 1; data[33] = 1; data[34] = 1; data[35] = -1;
    data[36] = 1; data[42] = 1; data[43] = 1; data[44] = -1; data[45] = 1;
    data[46] = 1; data[51] = 1; data[52] = 1; data[53] = -1; data[54] = -1;
    data[55] = -1; data[56] = 1; data[57] = 1; data[62] = 1; data[63] = -1;
    data[64] = -1; data[65] = -1; data[66] = 1; data[72] = -1; data[73] = 1;
    data[75] = -1; data[81] = -1; data[84] = 1; data[86] = -1; }




      if (boardnum == 783){
    player = -1;
    isLastPass = false;
    data[32] = -1; data[34] = 1; data[36] = -1; data[42] = 1; data[43] = 1;
    data[44] = 1; data[45] = 1; data[46] = -1; data[47] = -1; data[53] = 1;
    data[54] = 1; data[55] = 1; data[56] = 1; data[57] = 1; data[58] = 1;
    data[62] = 1; data[64] = -1; data[65] = -1; data[66] = -1; data[67] = 1;
    data[76] = -1; }




      if (boardnum == 784){
    player = -1;
    isLastPass = false;
    data[15] = 1; data[16] = -1; data[25] = 1; data[26] = -1; data[32] = -1;
    data[33] = 1; data[34] = -1; data[35] = 1; data[42] = -1; data[43] = -1;
    data[44] = 1; data[45] = -1; data[46] = -1; data[52] = -1; data[53] = -1;
    data[54] = -1; data[55] = 1; data[56] = -1; data[57] = -1; data[58] = -1;
    data[63] = 1; data[64] = -1; data[65] = 1; data[66] = 1; data[67] = -1;
    data[68] = 1; data[74] = 1; data[75] = -1; data[76] = -1; data[77] = 1;
    data[84] = 1; data[86] = -1; data[88] = 1; }




      if (boardnum == 785){
    player = 1;
    isLastPass = false;
    data[11] = 1; data[13] = -1; data[14] = 1; data[15] = 1; data[16] = -1;
    data[22] = 1; data[23] = -1; data[24] = -1; data[25] = -1; data[26] = -1;
    data[27] = -1; data[31] = 1; data[32] = 1; data[33] = 1; data[34] = 1;
    data[35] = 1; data[36] = -1; data[43] = -1; data[44] = -1; data[45] = -1;
    data[46] = -1; data[47] = -1; data[53] = -1; data[54] = -1; data[55] = 1;
    data[56] = -1; data[63] = -1; data[64] = -1; data[65] = -1; data[66] = -1;
    data[73] = -1; data[74] = -1; data[75] = -1; data[76] = -1; }




      if (boardnum == 786){
    player = -1;
    isLastPass = false;
    data[11] = -1; data[12] = 1; data[13] = 1; data[14] = 1; data[15] = 1;
    data[16] = 1; data[17] = 1; data[18] = 1; data[21] = 1; data[22] = 1;
    data[23] = 1; data[24] = -1; data[25] = -1; data[26] = 1; data[27] = 1;
    data[31] = -1; data[32] = 1; data[33] = -1; data[34] = -1; data[35] = 1;
    data[36] = -1; data[37] = 1; data[43] = -1; data[44] = 1; data[45] = 1;
    data[46] = 1; data[47] = 1; data[48] = 1; data[52] = -1; data[53] = -1;
    data[54] = -1; data[55] = 1; data[56] = -1; data[62] = 1; data[64] = 1;
    data[65] = 1; data[66] = 1; data[67] = 1; data[68] = 1; data[73] = -1;
    data[74] = -1; data[75] = -1; data[76] = -1; }




      if (boardnum == 787){
    player = -1;
    isLastPass = false;
    data[13] = 1; data[14] = 1; data[15] = 1; data[16] = 1; data[17] = 1;
    data[18] = 1; data[22] = -1; data[23] = 1; data[24] = 1; data[25] = 1;
    data[26] = 1; data[27] = 1; data[28] = 1; data[32] = -1; data[33] = -1;
    data[34] = -1; data[35] = 1; data[36] = -1; data[37] = 1; data[38] = 1;
    data[42] = 1; data[43] = 1; data[44] = 1; data[45] = 1; data[46] = 1;
    data[47] = 1; data[48] = 1; data[53] = 1; data[54] = 1; data[55] = -1;
    data[56] = -1; data[57] = -1; data[58] = -1; data[68] = -1; data[78] = -1;
    }




      if (boardnum == 788){
    player = 1;
    isLastPass = false;
    data[32] = 1; data[33] = 1; data[34] = 1; data[35] = 1; data[36] = -1;
    data[41] = 1; data[42] = 1; data[43] = 1; data[44] = 1; data[45] = 1;
    data[46] = -1; data[51] = 1; data[52] = 1; data[53] = -1; data[54] = -1;
    data[55] = 1; data[56] = -1; data[61] = 1; data[62] = 1; data[63] = 1;
    data[64] = 1; data[65] = 1; data[66] = -1; data[75] = -1; data[76] = -1;
    data[84] = -1; }




      if (boardnum == 789){
    player = 1;
    isLastPass = false;
    data[32] = -1; data[34] = -1; data[36] = 1; data[41] = 1; data[42] = -1;
    data[43] = -1; data[44] = 1; data[45] = 1; data[52] = -1; data[54] = 1;
    data[55] = -1; data[56] = -1; data[57] = -1; data[63] = 1; data[64] = 1;
    data[65] = -1; data[66] = -1; data[74] = 1; }




      if (boardnum == 790){
    player = 1;
    isLastPass = false;
    data[15] = 1; data[16] = -1; data[17] = -1; data[21] = 1; data[22] = -1;
    data[23] = 1; data[25] = 1; data[26] = -1; data[27] = -1; data[32] = -1;
    data[33] = -1; data[34] = -1; data[35] = -1; data[36] = -1; data[37] = -1;
    data[41] = 1; data[42] = -1; data[43] = -1; data[44] = -1; data[45] = -1;
    data[46] = -1; data[47] = 1; data[52] = -1; data[54] = -1; data[55] = -1;
    data[56] = 1; data[57] = 1; data[58] = 1; data[62] = 1; data[63] = 1;
    data[64] = 1; data[65] = 1; data[66] = 1; data[67] = 1; data[68] = -1;
    data[73] = 1; data[74] = 1; data[75] = 1; data[76] = 1; data[85] = -1;
    }




      if (boardnum == 791){
    player = -1;
    isLastPass = false;
    data[12] = -1; data[14] = 1; data[15] = 1; data[16] = 1; data[17] = -1;
    data[23] = -1; data[24] = 1; data[25] = 1; data[26] = 1; data[28] = -1;
    data[32] = -1; data[33] = -1; data[34] = -1; data[35] = 1; data[36] = 1;
    data[37] = -1; data[38] = -1; data[42] = -1; data[43] = -1; data[44] = -1;
    data[45] = 1; data[46] = -1; data[47] = -1; data[48] = 1; data[52] = -1;
    data[53] = -1; data[54] = -1; data[55] = 1; data[56] = -1; data[62] = -1;
    data[63] = -1; data[64] = -1; data[65] = 1; data[67] = -1; data[72] = -1;
    data[73] = -1; data[74] = -1; }




      if (boardnum == 792){
    player = -1;
    isLastPass = false;
    data[11] = -1; data[16] = -1; data[21] = -1; data[22] = 1; data[23] = 1;
    data[26] = -1; data[31] = -1; data[32] = -1; data[33] = -1; data[34] = -1;
    data[35] = 1; data[36] = -1; data[41] = 1; data[43] = 1; data[44] = 1;
    data[45] = -1; data[52] = 1; data[53] = 1; data[54] = 1; data[55] = 1;
    data[56] = 1; data[63] = 1; data[64] = 1; data[65] = -1; data[73] = 1;
    data[74] = 1; data[75] = 1; }




      if (boardnum == 793){
    player = 1;
    isLastPass = false;
    data[13] = 1; data[15] = 1; data[16] = 1; data[17] = -1; data[18] = -1;
    data[23] = 1; data[24] = 1; data[25] = 1; data[26] = 1; data[27] = -1;
    data[33] = 1; data[34] = 1; data[35] = -1; data[36] = -1; data[37] = 1;
    data[43] = 1; data[44] = -1; data[45] = 1; data[46] = -1; data[47] = -1;
    data[48] = -1; data[53] = 1; data[54] = -1; data[55] = -1; data[56] = -1;
    data[57] = -1; data[58] = -1; data[63] = 1; data[64] = 1; data[65] = 1;
    data[66] = 1; data[67] = 1; data[73] = 1; data[74] = 1; data[75] = 1;
    data[76] = 1; data[82] = 1; data[83] = 1; }




      if (boardnum == 794){
    player = -1;
    isLastPass = false;
    data[33] = 1; data[34] = -1; data[37] = 1; data[42] = 1; data[43] = 1;
    data[44] = -1; data[45] = 1; data[46] = 1; data[54] = -1; data[55] = -1;
    data[56] = 1; data[64] = 1; data[65] = 1; data[66] = -1; data[74] = 1;
    }




      if (boardnum == 795){
    player = -1;
    isLastPass = false;
    data[24] = 1; data[25] = -1; data[26] = -1; data[33] = 1; data[34] = 1;
    data[35] = 1; data[36] = -1; data[37] = -1; data[43] = -1; data[44] = -1;
    data[45] = -1; data[46] = 1; data[47] = 1; data[54] = 1; data[55] = -1;
    }




      if (boardnum == 796){
    player = 1;
    isLastPass = false;
    data[11] = -1; data[12] = 1; data[13] = -1; data[21] = -1; data[22] = -1;
    data[23] = 1; data[24] = 1; data[26] = 1; data[31] = -1; data[32] = -1;
    data[33] = -1; data[34] = 1; data[35] = 1; data[36] = 1; data[41] = -1;
    data[42] = -1; data[43] = 1; data[44] = 1; data[45] = -1; data[46] = 1;
    data[51] = -1; data[52] = -1; data[53] = -1; data[54] = 1; data[55] = 1;
    data[56] = 1; data[62] = -1; data[63] = -1; data[64] = 1; data[65] = 1;
    data[73] = -1; data[74] = 1; data[82] = -1; data[83] = -1; data[84] = -1;
    data[85] = -1; }




      if (boardnum == 797){
    player = -1;
    isLastPass = false;
    data[25] = 1; data[34] = 1; data[35] = 1; data[36] = 1; data[43] = 1;
    data[44] = -1; data[45] = 1; data[46] = -1; data[47] = -1; data[53] = 1;
    data[54] = 1; data[55] = -1; data[56] = -1; data[57] = -1; data[63] = 1;
    data[64] = 1; data[65] = 1; data[66] = -1; data[67] = 1; data[74] = 1;
    data[75] = 1; data[76] = 1; data[83] = 1; }




      if (boardnum == 798){
    player = -1;
    isLastPass = false;
    data[24] = 1; data[25] = -1; data[33] = 1; data[34] = 1; data[37] = 1;
    data[43] = -1; data[44] = 1; data[45] = 1; data[46] = 1; data[54] = 1;
    data[55] = 1; data[56] = -1; data[64] = -1; data[65] = -1; data[66] = -1;
    }




      if (boardnum == 799){
    player = -1;
    isLastPass = false;
    data[15] = 1; data[16] = 1; data[17] = 1; data[24] = -1; data[25] = -1;
    data[26] = 1; data[28] = -1; data[33] = -1; data[34] = -1; data[35] = 1;
    data[36] = 1; data[37] = 1; data[43] = -1; data[44] = 1; data[45] = 1;
    data[46] = -1; data[47] = 1; data[48] = 1; data[53] = -1; data[54] = -1;
    data[55] = -1; data[56] = -1; data[57] = 1; data[58] = 1; data[64] = -1;
    data[65] = 1; data[66] = -1; data[67] = 1; data[68] = 1; data[73] = -1;
    data[74] = -1; data[75] = -1; data[76] = -1; data[77] = -1; data[83] = 1;
    data[84] = 1; data[85] = 1; data[86] = 1; data[87] = 1; }




      if (boardnum == 800){
    player = 1;
    isLastPass = false;
    data[33] = -1; data[34] = -1; data[35] = -1; data[36] = -1; data[37] = -1;
    data[38] = -1; data[42] = -1; data[43] = 1; data[44] = 1; data[45] = 1;
    data[46] = -1; data[47] = -1; data[51] = -1; data[53] = 1; data[54] = 1;
    data[55] = -1; data[56] = -1; data[57] = -1; data[62] = 1; data[63] = 1;
    }

  }
}
