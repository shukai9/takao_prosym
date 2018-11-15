import java.util.*;
import java.util.Scanner;

public class BoardData1 {
  final static int SIZE = 100;
  int data[] = new int[SIZE];
  int player;
  boolean isLastPass;

  public BoardData1(int boardnum){

    if (boardnum == 1){
    player = 1;
    isLastPass = false;
    data[11] = -1; data[14] = 1; data[15] = 1; data[16] = 1; data[17] = 1;
    data[18] = 1; data[22] = -1; data[23] = 1; data[24] = 1; data[25] = 1;
    data[26] = 1; data[27] = 1; data[28] = 1; data[33] = -1; data[34] = 1;
    data[35] = 1; data[36] = -1; data[37] = 1; data[38] = 1; data[42] = 1;
    data[43] = 1; data[44] = -1; data[45] = -1; data[46] = -1; data[47] = -1;
    data[52] = -1; data[53] = -1; data[54] = -1; data[55] = -1; data[56] = -1;
    data[57] = -1; data[64] = -1; data[65] = -1; data[66] = -1; data[67] = -1;
    data[68] = -1; data[73] = -1; data[74] = -1; data[75] = -1; data[76] = -1;
    data[83] = -1; data[86] = -1; }




    if (boardnum == 2){
    player = -1;
    isLastPass = false;
    data[25] = 1; data[34] = 1; data[35] = 1; data[36] = 1; data[43] = 1;
    data[44] = -1; data[45] = 1; data[46] = -1; data[47] = -1; data[53] = 1;
    data[54] = 1; data[55] = -1; data[56] = -1; data[57] = -1; data[63] = 1;
    data[64] = -1; data[65] = 1; data[67] = 1; data[76] = 1; }




    if (boardnum == 3){
    player = -1;
    isLastPass = false;
    data[13] = -1; data[21] = -1; data[22] = -1; data[23] = 1; data[24] = 1;
    data[25] = 1; data[26] = 1; data[32] = -1; data[33] = -1; data[34] = 1;
    data[35] = -1; data[36] = -1; data[42] = 1; data[43] = 1; data[44] = -1;
    data[45] = -1; data[46] = -1; data[51] = 1; data[52] = 1; data[53] = 1;
    data[54] = -1; data[55] = -1; data[56] = -1; data[62] = -1; data[63] = -1;
    data[64] = 1; data[65] = -1; data[73] = -1; data[74] = -1; data[76] = -1;
    data[83] = -1; }




    if (boardnum == 4){
    player = -1;
    isLastPass = false;
    data[25] = 1; data[33] = -1; data[34] = -1; data[35] = 1; data[36] = -1;
    data[43] = -1; data[44] = 1; data[45] = 1; data[46] = 1; data[53] = -1;
    data[54] = -1; data[55] = 1; data[56] = 1; data[63] = -1; data[64] = 1;
    }




    if (boardnum == 5){
    player = 1;
    isLastPass = false;
    data[15] = 1; data[16] = -1; data[24] = 1; data[25] = -1; data[33] = -1;
    data[34] = -1; data[35] = 1; data[36] = 1; data[37] = 1; data[43] = -1;
    data[44] = -1; data[45] = 1; data[46] = -1; data[53] = 1; data[54] = 1;
    data[55] = 1; data[56] = 1; data[57] = -1; }




    if (boardnum == 6){
    player = -1;
    isLastPass = false;
    data[25] = 1; data[34] = 1; data[35] = 1; data[36] = 1; data[43] = 1;
    data[44] = 1; data[45] = 1; data[46] = 1; data[47] = -1; data[48] = -1;
    data[53] = -1; data[54] = 1; data[55] = -1; data[57] = 1; data[64] = -1;
    data[65] = 1; data[66] = -1; data[67] = -1; data[68] = 1; data[75] = -1;
    data[76] = 1; }




    if (boardnum == 7){
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




    if (boardnum == 8){
    player = -1;
    isLastPass = false;
    data[12] = 1; data[13] = -1; data[14] = -1; data[15] = -1; data[16] = -1;
    data[17] = -1; data[18] = -1; data[23] = 1; data[24] = -1; data[25] = -1;
    data[26] = -1; data[27] = -1; data[28] = -1; data[33] = 1; data[34] = 1;
    data[35] = -1; data[36] = -1; data[37] = -1; data[38] = -1; data[44] = 1;
    data[45] = 1; data[46] = 1; data[47] = 1; data[48] = 1; data[53] = 1;
    data[54] = 1; data[55] = 1; data[56] = 1; data[57] = 1; data[58] = 1;
    data[62] = 1; data[63] = 1; data[64] = 1; data[65] = 1; data[66] = 1;
    data[67] = 1; data[68] = 1; }




    if (boardnum == 9){
    player = 1;
    isLastPass = false;
    data[14] = 1; data[15] = 1; data[16] = 1; data[22] = -1; data[25] = -1;
    data[32] = 1; data[33] = -1; data[34] = 1; data[35] = -1; data[36] = -1;
    data[41] = 1; data[42] = 1; data[43] = 1; data[44] = -1; data[45] = -1;
    data[46] = -1; data[51] = 1; data[52] = 1; data[53] = -1; data[54] = -1;
    data[55] = -1; data[56] = -1; data[61] = 1; data[62] = 1; data[63] = -1;
    data[64] = -1; data[65] = -1; data[66] = -1; data[71] = 1; data[72] = 1;
    data[74] = -1; data[75] = -1; data[76] = -1; data[81] = 1; data[82] = 1;
    data[83] = 1; data[84] = 1; data[85] = 1; }




    if (boardnum == 10){
    player = -1;
    isLastPass = false;
    data[11] = 1; data[13] = -1; data[14] = 1; data[15] = 1; data[16] = -1;
    data[22] = 1; data[23] = -1; data[24] = 1; data[25] = 1; data[26] = 1;
    data[31] = 1; data[32] = 1; data[33] = 1; data[34] = 1; data[35] = 1;
    data[36] = 1; data[43] = -1; data[44] = 1; data[45] = 1; data[46] = 1;
    data[53] = -1; data[54] = -1; data[55] = 1; data[63] = -1; data[64] = -1;
    data[65] = -1; data[66] = -1; data[73] = -1; data[74] = -1; data[75] = -1;
    data[76] = -1; }




    if (boardnum == 11){
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




    if (boardnum == 12){
    player = 1;
    isLastPass = false;
    data[14] = 1; data[15] = 1; data[16] = 1; data[21] = -1; data[22] = 1;
    data[23] = 1; data[24] = 1; data[25] = 1; data[26] = 1; data[27] = 1;
    data[31] = -1; data[32] = 1; data[33] = 1; data[34] = 1; data[35] = -1;
    data[36] = 1; data[37] = 1; data[41] = -1; data[42] = -1; data[43] = -1;
    data[44] = -1; data[45] = -1; data[46] = -1; data[47] = -1; data[48] = 1;
    data[51] = -1; data[52] = 1; data[53] = 1; data[54] = 1; data[55] = 1;
    data[56] = 1; data[61] = -1; data[62] = 1; data[63] = 1; data[64] = 1;
    data[65] = 1; data[66] = 1; data[71] = -1; data[74] = 1; data[75] = 1;
    data[76] = 1; data[81] = -1; data[83] = 1; data[85] = 1; }




    if (boardnum == 13){
    player = 1;
    isLastPass = false;
    data[24] = -1; data[25] = 1; data[31] = 1; data[32] = 1; data[33] = 1;
    data[34] = 1; data[35] = 1; data[36] = 1; data[37] = 1; data[38] = 1;
    data[41] = 1; data[42] = 1; data[43] = 1; data[44] = -1; data[45] = 1;
    data[46] = 1; data[47] = 1; data[48] = -1; data[51] = -1; data[52] = -1;
    data[53] = -1; data[54] = -1; data[55] = 1; data[56] = 1; data[57] = 1;
    data[58] = 1; data[61] = -1; data[62] = -1; data[63] = 1; data[64] = 1;
    data[65] = 1; data[66] = -1; data[67] = 1; data[73] = 1; data[74] = 1;
    data[75] = 1; data[76] = 1; data[77] = -1; data[83] = 1; data[86] = 1;
    }




    if (boardnum == 14){
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




    if (boardnum == 15){
    player = -1;
    isLastPass = false;
    data[32] = 1; data[33] = 1; data[34] = 1; data[35] = 1; data[36] = -1;
    data[41] = 1; data[42] = 1; data[43] = 1; data[44] = 1; data[45] = 1;
    data[46] = -1; data[51] = 1; data[52] = 1; data[53] = -1; data[54] = -1;
    data[55] = 1; data[56] = -1; data[61] = 1; data[62] = -1; data[63] = 1;
    data[64] = -1; data[65] = -1; data[66] = -1; data[71] = 1; data[74] = -1;
    data[75] = -1; data[76] = -1; data[81] = 1; data[83] = 1; data[84] = 1;
    data[85] = 1; }




    if (boardnum == 16){
    player = -1;
    isLastPass = false;
    data[24] = -1; data[34] = -1; data[35] = -1; data[36] = 1; data[43] = -1;
    data[44] = -1; data[45] = 1; data[46] = 1; data[52] = 1; data[53] = 1;
    data[54] = -1; data[55] = 1; data[56] = 1; data[62] = 1; data[63] = 1;
    data[64] = 1; data[65] = -1; data[66] = 1; data[73] = 1; data[74] = -1;
    data[75] = -1; }




    if (boardnum == 17){
    player = 1;
    isLastPass = false;
    data[16] = 1; data[25] = 1; data[26] = 1; data[33] = 1; data[34] = 1;
    data[35] = -1; data[36] = -1; data[37] = -1; data[43] = 1; data[44] = 1;
    data[45] = 1; data[46] = -1; data[47] = -1; data[53] = 1; data[54] = 1;
    data[55] = -1; data[56] = 1; data[57] = -1; data[63] = 1; data[64] = -1;
    data[65] = 1; data[66] = 1; data[67] = 1; data[73] = -1; data[74] = 1;
    data[75] = 1; data[76] = 1; data[83] = 1; }




    if (boardnum == 18){
    player = 1;
    isLastPass = false;
    data[24] = -1; data[25] = 1; data[31] = -1; data[32] = -1; data[33] = -1;
    data[34] = 1; data[35] = 1; data[36] = -1; data[37] = -1; data[41] = 1;
    data[42] = 1; data[43] = 1; data[44] = 1; data[45] = 1; data[46] = 1;
    data[47] = -1; data[52] = 1; data[53] = 1; data[54] = -1; data[55] = 1;
    data[56] = -1; data[62] = 1; data[63] = 1; data[64] = 1; data[65] = -1;
    data[66] = 1; data[73] = 1; data[74] = 1; data[75] = 1; data[84] = 1;
    data[85] = 1; data[86] = 1; }




    if (boardnum == 19){
    player = 1;
    isLastPass = false;
    data[12] = -1; data[13] = -1; data[14] = -1; data[15] = -1; data[16] = -1;
    data[17] = -1; data[18] = -1; data[22] = 1; data[23] = 1; data[24] = 1;
    data[25] = -1; data[26] = 1; data[33] = 1; data[34] = -1; data[35] = 1;
    data[36] = -1; data[37] = 1; data[42] = 1; data[43] = 1; data[44] = -1;
    data[45] = -1; data[46] = -1; data[47] = -1; data[52] = 1; data[53] = -1;
    data[54] = -1; data[55] = 1; data[56] = 1; data[61] = 1; data[63] = -1;
    data[64] = 1; data[65] = 1; data[66] = 1; data[72] = -1; data[74] = 1;
    data[75] = 1; data[76] = 1; data[81] = -1; data[82] = 1; data[83] = 1;
    data[84] = 1; data[86] = 1; }




    if (boardnum == 20){
    player = 1;
    isLastPass = false;
    data[32] = 1; data[33] = 1; data[34] = 1; data[35] = 1; data[36] = -1;
    data[41] = 1; data[42] = 1; data[43] = 1; data[44] = 1; data[45] = -1;
    data[46] = -1; data[51] = 1; data[52] = 1; data[53] = -1; data[54] = -1;
    data[55] = -1; data[56] = -1; data[61] = 1; data[62] = 1; data[63] = 1;
    data[64] = 1; data[65] = -1; data[66] = -1; data[76] = -1; }




    if (boardnum == 21){
    player = -1;
    isLastPass = false;
    data[14] = 1; data[16] = 1; data[23] = 1; data[24] = 1; data[25] = 1;
    data[26] = 1; data[31] = 1; data[32] = 1; data[33] = 1; data[34] = 1;
    data[35] = -1; data[36] = 1; data[41] = -1; data[42] = 1; data[43] = -1;
    data[44] = -1; data[45] = 1; data[46] = 1; data[51] = -1; data[52] = -1;
    data[53] = 1; data[54] = -1; data[55] = 1; data[56] = 1; data[57] = 1;
    data[61] = -1; data[62] = -1; data[63] = -1; data[64] = -1; data[65] = 1;
    data[66] = 1; data[71] = -1; data[72] = -1; data[73] = 1; data[74] = 1;
    data[75] = 1; data[81] = -1; data[82] = -1; data[83] = -1; data[84] = -1;
    data[85] = -1; data[86] = -1; }




    if (boardnum == 22){
    player = 1;
    isLastPass = false;
    data[11] = -1; data[13] = -1; data[14] = -1; data[16] = 1; data[17] = -1;
    data[22] = -1; data[23] = -1; data[24] = -1; data[25] = -1; data[26] = 1;
    data[31] = -1; data[32] = -1; data[33] = -1; data[34] = -1; data[35] = -1;
    data[36] = 1; data[43] = -1; data[44] = -1; data[45] = -1; data[46] = 1;
    data[53] = -1; data[54] = -1; data[55] = -1; data[56] = 1; data[65] = 1;
    data[66] = -1; data[74] = 1; data[76] = -1; }




    if (boardnum == 23){
    player = 1;
    isLastPass = false;
    data[12] = 1; data[23] = 1; data[24] = 1; data[25] = 1; data[32] = 1;
    data[34] = 1; data[35] = 1; data[43] = 1; data[44] = -1; data[45] = -1;
    data[46] = 1; data[52] = 1; data[53] = 1; data[54] = -1; data[55] = -1;
    data[56] = 1; data[57] = 1; data[63] = -1; data[64] = -1; data[65] = 1;
    data[66] = -1; data[73] = 1; data[74] = -1; data[75] = 1; data[76] = 1;
    data[82] = 1; }




    if (boardnum == 24){
    player = 1;
    isLastPass = false;
    data[26] = 1; data[33] = -1; data[34] = -1; data[35] = 1; data[43] = -1;
    data[44] = 1; data[45] = 1; data[46] = 1; data[53] = -1; data[54] = -1;
    data[55] = -1; data[56] = -1; data[57] = -1; data[64] = 1; data[65] = 1;
    data[66] = 1; data[73] = -1; data[74] = -1; data[75] = 1; data[76] = -1;
    data[83] = 1; data[85] = 1; }




    if (boardnum == 25){
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




    if (boardnum == 26){
    player = 1;
    isLastPass = false;
    data[13] = -1; data[14] = -1; data[23] = -1; data[24] = -1; data[25] = -1;
    data[26] = -1; data[34] = -1; data[35] = -1; data[36] = -1; data[44] = -1;
    data[45] = 1; data[46] = -1; data[47] = -1; data[53] = -1; data[54] = 1;
    data[55] = -1; data[56] = -1; data[58] = -1; data[63] = 1; data[65] = 1;
    }




    if (boardnum == 27){
    player = 1;
    isLastPass = false;
    data[11] = 1; data[13] = -1; data[14] = -1; data[15] = -1; data[16] = -1;
    data[21] = -1; data[22] = -1; data[23] = -1; data[24] = -1; data[25] = 1;
    data[26] = -1; data[31] = 1; data[32] = -1; data[33] = 1; data[34] = 1;
    data[35] = 1; data[36] = -1; data[37] = 1; data[38] = 1; data[42] = -1;
    data[43] = 1; data[44] = 1; data[45] = -1; data[46] = -1; data[53] = -1;
    data[54] = -1; data[55] = -1; data[62] = -1; data[63] = -1; data[64] = -1;
    data[66] = 1; data[73] = 1; }




    if (boardnum == 28){
    player = -1;
    isLastPass = false;
    data[12] = 1; data[23] = 1; data[32] = 1; data[33] = 1; data[34] = 1;
    data[35] = 1; data[37] = -1; data[43] = -1; data[44] = 1; data[45] = 1;
    data[46] = -1; data[52] = -1; data[53] = -1; data[54] = -1; data[55] = -1;
    data[56] = -1; data[57] = -1; data[62] = 1; data[63] = -1; data[64] = -1;
    data[65] = -1; data[73] = -1; data[74] = -1; data[75] = -1; data[76] = -1;
    data[84] = 1; data[87] = -1; }




    if (boardnum == 29){
    player = 1;
    isLastPass = false;
    data[13] = 1; data[14] = 1; data[15] = 1; data[16] = 1; data[17] = 1;
    data[18] = 1; data[22] = -1; data[23] = 1; data[24] = 1; data[25] = 1;
    data[26] = 1; data[27] = 1; data[28] = 1; data[32] = -1; data[33] = -1;
    data[34] = -1; data[35] = 1; data[36] = -1; data[37] = 1; data[38] = -1;
    data[42] = 1; data[43] = 1; data[44] = -1; data[45] = 1; data[46] = 1;
    data[47] = -1; data[54] = 1; data[55] = -1; data[56] = -1; data[57] = -1;
    data[58] = -1; data[68] = 1; }




    if (boardnum == 30){
    player = 1;
    isLastPass = false;
    data[13] = 1; data[14] = 1; data[15] = 1; data[16] = 1; data[17] = 1;
    data[18] = 1; data[22] = -1; data[23] = -1; data[24] = 1; data[25] = 1;
    data[26] = 1; data[27] = 1; data[28] = 1; data[31] = -1; data[32] = -1;
    data[33] = -1; data[34] = -1; data[35] = 1; data[36] = 1; data[37] = 1;
    data[42] = -1; data[43] = 1; data[44] = 1; data[45] = -1; data[46] = -1;
    data[47] = -1; data[48] = -1; data[51] = -1; data[52] = -1; data[53] = 1;
    data[54] = -1; data[55] = -1; data[56] = -1; data[57] = -1; data[62] = 1;
    data[66] = 1; data[67] = -1; data[68] = 1; }




    if (boardnum == 31){
    player = -1;
    isLastPass = false;
    data[23] = -1; data[24] = -1; data[25] = 1; data[32] = 1; data[33] = 1;
    data[34] = -1; data[35] = 1; data[36] = 1; data[43] = -1; data[44] = 1;
    data[45] = 1; data[46] = 1; data[52] = 1; data[53] = 1; data[54] = -1;
    data[55] = 1; data[56] = 1; data[62] = 1; data[63] = 1; data[64] = 1;
    data[65] = -1; data[73] = 1; data[82] = 1; }




    if (boardnum == 32){
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




    if (boardnum == 33){
    player = -1;
    isLastPass = false;
    data[25] = -1; data[26] = 1; data[33] = -1; data[34] = -1; data[35] = -1;
    data[43] = -1; data[44] = 1; data[45] = -1; data[46] = 1; data[47] = 1;
    data[53] = -1; data[54] = -1; data[55] = -1; data[56] = 1; data[57] = -1;
    data[64] = -1; data[65] = 1; data[66] = 1; data[73] = -1; data[74] = 1;
    data[75] = -1; data[76] = 1; data[83] = 1; data[84] = 1; data[85] = 1;
    data[86] = 1; data[87] = 1; }




    if (boardnum == 34){
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




    if (boardnum == 35){
    player = 1;
    isLastPass = false;
    data[11] = 1; data[12] = 1; data[13] = 1; data[14] = 1; data[15] = 1;
    data[16] = 1; data[21] = 1; data[22] = 1; data[23] = 1; data[24] = 1;
    data[25] = 1; data[26] = -1; data[27] = -1; data[31] = 1; data[32] = 1;
    data[33] = 1; data[34] = 1; data[35] = 1; data[36] = -1; data[37] = -1;
    data[43] = -1; data[44] = -1; data[45] = 1; data[46] = -1; data[47] = -1;
    data[48] = -1; data[52] = -1; data[53] = -1; data[54] = -1; data[55] = 1;
    data[56] = -1; data[64] = -1; data[65] = -1; data[66] = -1; data[75] = 1;
    data[76] = -1; }




    if (boardnum == 36){
    player = -1;
    isLastPass = false;
    data[13] = 1; data[14] = -1; data[15] = -1; data[16] = -1; data[17] = -1;
    data[18] = -1; data[24] = 1; data[25] = -1; data[26] = 1; data[27] = 1;
    data[31] = -1; data[32] = -1; data[33] = -1; data[34] = -1; data[35] = -1;
    data[36] = -1; data[37] = 1; data[42] = -1; data[43] = 1; data[44] = -1;
    data[45] = 1; data[47] = -1; data[48] = 1; data[51] = -1; data[52] = -1;
    data[53] = -1; data[54] = -1; data[55] = -1; data[56] = -1; data[63] = 1;
    data[64] = -1; data[65] = 1; data[66] = -1; data[67] = -1; data[68] = -1;
    data[74] = 1; data[76] = 1; }




    if (boardnum == 37){
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




    if (boardnum == 38){
    player = 1;
    isLastPass = false;
    data[15] = 1; data[16] = 1; data[17] = 1; data[24] = -1; data[25] = -1;
    data[26] = 1; data[28] = -1; data[33] = -1; data[34] = -1; data[35] = -1;
    data[36] = -1; data[37] = -1; data[38] = -1; data[43] = -1; data[44] = 1;
    data[45] = 1; data[46] = -1; data[47] = -1; data[48] = 1; data[53] = -1;
    data[54] = -1; data[55] = 1; data[56] = -1; data[57] = 1; data[58] = 1;
    data[64] = -1; data[65] = 1; data[66] = 1; data[67] = -1; data[68] = 1;
    data[73] = -1; data[74] = -1; data[75] = -1; data[76] = -1; data[77] = 1;
    data[78] = 1; data[83] = 1; data[84] = 1; data[85] = 1; data[86] = 1;
    data[87] = 1; data[88] = 1; }




    if (boardnum == 39){
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




    if (boardnum == 40){
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




    if (boardnum == 41){
    player = 1;
    isLastPass = false;
    data[11] = -1; data[16] = 1; data[21] = -1; data[22] = -1; data[23] = -1;
    data[24] = -1; data[25] = -1; data[26] = -1; data[27] = -1; data[31] = -1;
    data[32] = -1; data[33] = 1; data[34] = -1; data[35] = 1; data[36] = -1;
    data[42] = -1; data[43] = 1; data[44] = -1; data[45] = -1; data[46] = 1;
    data[53] = 1; data[54] = -1; data[55] = -1; data[56] = -1; data[57] = -1;
    data[58] = -1; data[62] = 1; data[63] = 1; data[64] = -1; data[65] = -1;
    data[66] = -1; data[68] = -1; data[71] = 1; data[73] = -1; data[75] = -1;
    data[76] = 1; data[77] = 1; data[78] = -1; data[82] = -1; data[83] = -1;
    data[84] = -1; data[86] = 1; }




    if (boardnum == 42){
    player = 1;
    isLastPass = false;
    data[13] = -1; data[14] = 1; data[15] = 1; data[16] = -1; data[23] = -1;
    data[24] = 1; data[25] = 1; data[26] = 1; data[32] = -1; data[33] = -1;
    data[34] = -1; data[35] = 1; data[36] = 1; data[43] = -1; data[44] = -1;
    data[45] = 1; data[46] = 1; data[53] = -1; data[54] = -1; data[55] = 1;
    data[63] = -1; data[64] = -1; data[65] = -1; data[66] = -1; data[73] = -1;
    data[74] = -1; data[75] = -1; data[76] = -1; }




    if (boardnum == 43){
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




    if (boardnum == 44){
    player = 1;
    isLastPass = false;
    data[14] = 1; data[15] = 1; data[16] = 1; data[23] = -1; data[24] = 1;
    data[25] = 1; data[33] = -1; data[34] = 1; data[35] = -1; data[36] = -1;
    data[37] = -1; data[38] = -1; data[42] = -1; data[43] = 1; data[44] = -1;
    data[45] = -1; data[46] = -1; data[47] = -1; data[51] = -1; data[53] = -1;
    data[54] = -1; data[55] = -1; data[56] = -1; data[57] = -1; data[62] = -1;
    data[63] = -1; data[64] = -1; data[73] = -1; }




    if (boardnum == 45){
    player = -1;
    isLastPass = false;
    data[32] = -1; data[34] = 1; data[35] = -1; data[36] = -1; data[38] = 1;
    data[42] = 1; data[43] = 1; data[44] = 1; data[45] = -1; data[46] = -1;
    data[47] = 1; data[53] = 1; data[54] = 1; data[55] = -1; data[56] = 1;
    data[57] = 1; data[58] = 1; data[62] = 1; data[64] = -1; data[65] = -1;
    data[66] = -1; data[67] = 1; data[76] = -1; }




    if (boardnum == 46){
    player = -1;
    isLastPass = false;
    data[32] = -1; data[42] = 1; data[43] = 1; data[44] = 1; data[45] = 1;
    data[46] = -1; data[53] = 1; data[54] = -1; data[55] = -1; data[56] = -1;
    data[57] = -1; data[62] = 1; data[64] = -1; data[65] = -1; data[66] = -1;
    data[67] = 1; data[76] = -1; }




    if (boardnum == 47){
    player = 1;
    isLastPass = false;
    data[11] = -1; data[12] = -1; data[13] = -1; data[14] = 1; data[15] = 1;
    data[21] = -1; data[22] = -1; data[23] = 1; data[24] = 1; data[31] = -1;
    data[32] = 1; data[33] = -1; data[34] = 1; data[35] = 1; data[37] = 1;
    data[41] = -1; data[42] = 1; data[43] = 1; data[44] = -1; data[45] = 1;
    data[46] = 1; data[51] = -1; data[52] = 1; data[53] = 1; data[54] = -1;
    data[55] = 1; data[56] = 1; data[61] = -1; data[62] = 1; data[63] = -1;
    data[64] = -1; data[65] = 1; data[67] = 1; data[71] = -1; data[72] = -1;
    data[73] = -1; data[74] = -1; data[75] = 1; data[81] = -1; data[82] = -1;
    data[83] = -1; data[84] = -1; }




    if (boardnum == 48){
    player = 1;
    isLastPass = false;
    data[34] = -1; data[36] = 1; data[41] = 1; data[42] = 1; data[43] = -1;
    data[44] = 1; data[45] = 1; data[52] = -1; data[54] = 1; data[55] = -1;
    data[56] = -1; data[57] = -1; data[63] = 1; data[64] = -1; data[65] = -1;
    data[66] = -1; }




    if (boardnum == 49){
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




    if (boardnum == 50){
    player = 1;
    isLastPass = false;
    data[11] = 1; data[13] = 1; data[14] = 1; data[15] = 1; data[16] = -1;
    data[22] = 1; data[23] = 1; data[24] = 1; data[25] = 1; data[26] = 1;
    data[27] = 1; data[28] = 1; data[31] = 1; data[32] = 1; data[33] = 1;
    data[34] = -1; data[35] = -1; data[36] = -1; data[37] = 1; data[38] = 1;
    data[42] = -1; data[44] = -1; data[45] = -1; data[46] = 1; data[53] = -1;
    data[54] = -1; data[55] = 1; data[56] = -1; data[57] = -1; data[58] = -1;
    data[62] = -1; data[63] = -1; data[64] = -1; data[65] = 1; data[66] = -1;
    data[71] = -1; data[73] = -1; data[75] = 1; data[76] = -1; data[81] = -1;
    data[82] = -1; data[83] = -1; data[85] = 1; data[86] = -1; }




    if (boardnum == 51){
    player = -1;
    isLastPass = false;
    data[25] = 1; data[32] = -1; data[34] = 1; data[35] = 1; data[36] = 1;
    data[38] = 1; data[42] = 1; data[43] = 1; data[44] = 1; data[45] = 1;
    data[46] = -1; data[47] = 1; data[48] = -1; data[53] = 1; data[54] = -1;
    data[55] = 1; data[56] = 1; data[57] = 1; data[58] = 1; data[61] = -1;
    data[62] = -1; data[63] = -1; data[64] = -1; data[65] = 1; data[66] = 1;
    data[67] = 1; data[74] = 1; data[75] = 1; data[76] = 1; data[83] = 1;
    data[86] = 1; }




    if (boardnum == 52){
    player = 1;
    isLastPass = false;
    data[14] = -1; data[15] = -1; data[23] = 1; data[24] = -1; data[25] = -1;
    data[33] = 1; data[34] = 1; data[35] = 1; data[36] = -1; data[37] = 1;
    data[38] = 1; data[43] = 1; data[44] = 1; data[45] = -1; data[46] = 1;
    data[47] = -1; data[48] = 1; data[52] = 1; data[53] = 1; data[54] = 1;
    data[55] = -1; data[56] = -1; data[57] = 1; data[58] = 1; data[62] = -1;
    data[63] = -1; data[64] = -1; data[65] = -1; data[66] = -1; data[67] = 1;
    data[68] = 1; data[73] = -1; data[74] = 1; data[75] = -1; data[76] = -1;
    data[86] = -1; }




    if (boardnum == 53){
    player = -1;
    isLastPass = false;
    data[11] = 1; data[13] = 1; data[14] = 1; data[15] = 1; data[16] = 1;
    data[17] = 1; data[21] = 1; data[22] = 1; data[23] = 1; data[24] = 1;
    data[25] = -1; data[32] = 1; data[33] = 1; data[34] = -1; data[35] = -1;
    data[43] = -1; data[44] = 1; data[45] = -1; data[46] = -1; data[47] = -1;
    data[52] = -1; data[53] = -1; data[54] = -1; data[55] = -1; data[56] = -1;
    data[62] = -1; data[63] = -1; data[64] = -1; data[65] = -1; data[66] = -1;
    data[67] = -1; data[75] = -1; data[76] = -1; data[77] = -1; data[84] = -1;
    }




    if (boardnum == 54){
    player = -1;
    isLastPass = false;
    data[24] = 1; data[25] = -1; data[33] = 1; data[34] = 1; data[37] = 1;
    data[43] = -1; data[44] = 1; data[45] = 1; data[46] = 1; data[54] = 1;
    data[55] = 1; data[56] = -1; data[64] = -1; data[65] = -1; data[66] = -1;
    }




    if (boardnum == 55){
    player = -1;
    isLastPass = false;
    data[11] = -1; data[14] = -1; data[16] = -1; data[21] = -1; data[22] = 1;
    data[23] = 1; data[24] = 1; data[26] = -1; data[31] = -1; data[32] = -1;
    data[33] = -1; data[34] = 1; data[35] = -1; data[36] = -1; data[41] = 1;
    data[43] = 1; data[44] = -1; data[45] = -1; data[47] = -1; data[52] = 1;
    data[53] = -1; data[54] = 1; data[55] = 1; data[56] = -1; data[61] = 1;
    data[62] = 1; data[63] = 1; data[64] = 1; data[65] = 1; data[66] = 1;
    data[73] = 1; data[74] = 1; data[75] = 1; }




    if (boardnum == 56){
    player = 1;
    isLastPass = false;
    data[13] = -1; data[16] = 1; data[23] = -1; data[24] = -1; data[25] = 1;
    data[26] = 1; data[32] = 1; data[33] = -1; data[34] = -1; data[35] = -1;
    data[36] = 1; data[37] = -1; data[38] = -1; data[42] = -1; data[43] = -1;
    data[44] = -1; data[45] = -1; data[46] = -1; data[47] = -1; data[48] = -1;
    data[54] = -1; data[55] = -1; data[56] = -1; data[57] = -1; data[58] = -1;
    data[65] = 1; data[66] = 1; data[67] = -1; data[68] = -1; data[74] = 1;
    }




    if (boardnum == 57){
    player = -1;
    isLastPass = false;
    data[24] = 1; data[33] = 1; data[34] = 1; data[36] = -1; data[43] = 1;
    data[44] = -1; data[45] = -1; data[46] = -1; data[53] = 1; data[54] = 1;
    data[55] = 1; data[56] = 1; data[64] = 1; data[65] = 1; data[73] = 1;
    }




    if (boardnum == 58){
    player = -1;
    isLastPass = false;
    data[13] = 1; data[15] = -1; data[23] = 1; data[24] = -1; data[25] = -1;
    data[27] = 1; data[32] = 1; data[33] = -1; data[34] = -1; data[35] = 1;
    data[36] = -1; data[37] = -1; data[38] = -1; data[42] = 1; data[43] = -1;
    data[44] = -1; data[45] = 1; data[46] = -1; data[47] = -1; data[52] = -1;
    data[53] = -1; data[54] = 1; data[55] = 1; data[57] = 1; data[64] = 1;
    data[65] = 1; data[66] = -1; data[68] = 1; data[73] = 1; data[74] = 1;
    data[75] = -1; data[77] = -1; data[88] = -1; }




    if (boardnum == 59){
    player = 1;
    isLastPass = false;
    data[15] = 1; data[25] = 1; data[31] = 1; data[32] = -1; data[35] = 1;
    data[36] = -1; data[42] = -1; data[44] = -1; data[45] = 1; data[46] = -1;
    data[48] = -1; data[52] = -1; data[53] = 1; data[54] = -1; data[55] = 1;
    data[56] = 1; data[57] = -1; data[58] = 1; data[61] = 1; data[62] = 1;
    data[63] = 1; data[64] = 1; data[65] = 1; data[66] = -1; data[67] = -1;
    data[74] = -1; data[75] = -1; data[76] = -1; data[77] = -1; data[84] = -1;
    data[85] = -1; data[86] = 1; data[87] = 1; data[88] = 1; }




    if (boardnum == 60){
    player = -1;
    isLastPass = false;
    data[13] = 1; data[14] = 1; data[15] = 1; data[16] = 1; data[17] = 1;
    data[18] = -1; data[23] = 1; data[24] = 1; data[25] = 1; data[26] = 1;
    data[27] = -1; data[28] = -1; data[31] = 1; data[32] = 1; data[33] = 1;
    data[34] = 1; data[35] = 1; data[36] = -1; data[37] = 1; data[38] = -1;
    data[41] = 1; data[42] = 1; data[43] = -1; data[44] = -1; data[45] = -1;
    data[46] = 1; data[47] = -1; data[48] = -1; data[51] = 1; data[52] = 1;
    data[53] = 1; data[54] = 1; data[55] = -1; data[56] = -1; data[57] = 1;
    data[58] = -1; data[64] = 1; data[65] = 1; data[66] = 1; data[67] = 1;
    data[68] = 1; data[74] = 1; data[76] = 1; }




    if (boardnum == 61){
    player = -1;
    isLastPass = false;
    data[33] = -1; data[34] = -1; data[35] = -1; data[36] = 1; data[38] = 1;
    data[44] = -1; data[45] = -1; data[46] = -1; data[47] = 1; data[52] = 1;
    data[53] = 1; data[54] = 1; data[55] = 1; data[56] = 1; data[63] = 1;
    }




    if (boardnum == 62){
    player = 1;
    isLastPass = false;
    data[15] = 1; data[25] = 1; data[31] = 1; data[32] = -1; data[35] = 1;
    data[36] = -1; data[42] = -1; data[44] = -1; data[45] = 1; data[46] = -1;
    data[48] = -1; data[52] = -1; data[53] = 1; data[54] = -1; data[55] = 1;
    data[56] = 1; data[57] = -1; data[58] = 1; data[61] = 1; data[62] = 1;
    data[63] = 1; data[64] = 1; data[65] = 1; data[66] = -1; data[67] = -1;
    data[74] = -1; data[75] = -1; data[76] = -1; data[77] = -1; data[84] = -1;
    data[85] = -1; data[86] = 1; data[87] = 1; data[88] = 1; }




    if (boardnum == 63){
    player = 1;
    isLastPass = false;
    data[12] = -1; data[14] = -1; data[17] = -1; data[18] = 1; data[21] = -1;
    data[23] = -1; data[24] = -1; data[25] = -1; data[26] = -1; data[27] = -1;
    data[31] = -1; data[32] = -1; data[33] = -1; data[34] = 1; data[35] = 1;
    data[36] = 1; data[37] = -1; data[41] = 1; data[42] = -1; data[43] = 1;
    data[44] = 1; data[45] = 1; data[46] = -1; data[47] = -1; data[51] = 1;
    data[52] = 1; data[53] = 1; data[54] = 1; data[55] = -1; data[56] = -1;
    data[61] = 1; data[62] = 1; data[63] = 1; data[64] = -1; data[65] = -1;
    data[66] = -1; data[71] = 1; data[72] = 1; data[73] = -1; data[74] = -1;
    data[75] = -1; data[81] = 1; data[82] = -1; data[84] = -1; }




    if (boardnum == 64){
    player = 1;
    isLastPass = false;
    data[15] = 1; data[16] = -1; data[24] = -1; data[25] = -1; data[26] = -1;
    data[33] = -1; data[34] = -1; data[35] = -1; data[36] = -1; data[43] = -1;
    data[44] = 1; data[45] = 1; data[46] = -1; data[47] = 1; data[53] = -1;
    data[54] = -1; data[55] = 1; data[56] = -1; data[57] = 1; data[58] = 1;
    data[64] = -1; data[65] = 1; data[66] = -1; data[67] = 1; data[68] = 1;
    data[73] = -1; data[74] = 1; data[75] = 1; data[76] = 1; data[83] = 1;
    data[84] = 1; data[85] = 1; data[86] = 1; data[87] = 1; }




    if (boardnum == 65){
    player = -1;
    isLastPass = false;
    data[24] = 1; data[31] = 1; data[33] = 1; data[35] = 1; data[42] = 1;
    data[44] = 1; data[45] = -1; data[46] = 1; data[53] = -1; data[54] = -1;
    data[55] = 1; data[56] = -1; data[62] = -1; data[63] = -1; data[64] = -1;
    data[65] = -1; data[66] = 1; data[73] = 1; data[77] = 1; }




    if (boardnum == 66){
    player = -1;
    isLastPass = false;
    data[22] = 1; data[32] = 1; data[34] = 1; data[35] = 1; data[42] = 1;
    data[43] = -1; data[44] = 1; data[45] = 1; data[46] = 1; data[47] = 1;
    data[48] = -1; data[52] = 1; data[53] = 1; data[54] = -1; data[55] = -1;
    data[56] = 1; data[57] = -1; data[58] = -1; data[61] = 1; data[62] = 1;
    data[63] = 1; data[64] = 1; data[65] = -1; data[66] = 1; data[67] = -1;
    data[68] = -1; data[72] = 1; data[73] = 1; data[74] = 1; data[75] = 1;
    data[76] = -1; data[77] = -1; data[78] = -1; data[84] = 1; data[85] = 1;
    data[86] = 1; data[87] = -1; data[88] = -1; }




    if (boardnum == 67){
    player = 1;
    isLastPass = false;
    data[13] = -1; data[14] = -1; data[15] = -1; data[16] = -1; data[23] = -1;
    data[24] = -1; data[25] = -1; data[26] = -1; data[33] = -1; data[34] = -1;
    data[35] = 1; data[36] = -1; data[42] = -1; data[43] = 1; data[44] = 1;
    data[45] = 1; data[46] = -1; data[47] = -1; data[48] = -1; data[53] = 1;
    data[54] = 1; data[55] = 1; data[56] = -1; data[57] = -1; data[58] = -1;
    data[63] = 1; data[64] = -1; data[65] = 1; data[66] = -1; data[67] = -1;
    data[74] = -1; data[75] = 1; data[76] = 1; data[78] = -1; }




    if (boardnum == 68){
    player = 1;
    isLastPass = false;
    data[13] = 1; data[15] = -1; data[18] = -1; data[23] = 1; data[24] = -1;
    data[25] = -1; data[27] = -1; data[32] = 1; data[33] = 1; data[34] = 1;
    data[35] = 1; data[36] = -1; data[37] = -1; data[38] = -1; data[42] = 1;
    data[43] = 1; data[44] = -1; data[45] = 1; data[46] = -1; data[47] = -1;
    data[52] = -1; data[53] = -1; data[54] = -1; data[55] = -1; data[56] = -1;
    data[57] = 1; data[63] = 1; data[64] = 1; data[65] = -1; data[66] = -1;
    data[67] = 1; data[68] = 1; data[73] = 1; data[74] = 1; data[75] = -1;
    data[76] = -1; data[77] = -1; data[88] = -1; }




    if (boardnum == 69){
    player = 1;
    isLastPass = false;
    data[43] = 1; data[44] = 1; data[45] = 1; data[46] = -1; data[54] = 1;
    data[55] = 1; data[56] = -1; data[57] = -1; data[64] = -1; data[65] = -1;
    data[66] = -1; data[67] = -1; data[74] = -1; data[75] = -1; data[76] = -1;
    data[85] = 1; data[86] = 1; data[87] = 1; }




    if (boardnum == 70){
    player = 1;
    isLastPass = false;
    data[33] = -1; data[34] = -1; data[35] = -1; data[36] = -1; data[42] = 1;
    data[43] = 1; data[44] = -1; data[45] = -1; data[46] = 1; data[52] = -1;
    data[53] = -1; data[54] = -1; data[55] = 1; data[56] = 1; data[62] = -1;
    data[63] = -1; data[64] = 1; data[65] = 1; }




    if (boardnum == 71){
    player = -1;
    isLastPass = false;
    data[13] = -1; data[15] = 1; data[16] = -1; data[24] = -1; data[25] = 1;
    data[26] = 1; data[33] = -1; data[34] = -1; data[35] = -1; data[36] = 1;
    data[37] = 1; data[43] = -1; data[44] = -1; data[45] = 1; data[46] = 1;
    data[47] = 1; data[53] = 1; data[54] = 1; data[55] = 1; data[56] = 1;
    data[57] = -1; }




    if (boardnum == 72){
    player = -1;
    isLastPass = false;
    data[32] = 1; data[33] = 1; data[36] = -1; data[37] = 1; data[43] = 1;
    data[44] = -1; data[45] = -1; data[46] = 1; data[54] = -1; data[55] = 1;
    data[56] = -1; data[62] = 1; data[63] = 1; data[64] = 1; data[65] = 1;
    data[66] = -1; data[73] = 1; }




    if (boardnum == 73){
    player = -1;
    isLastPass = false;
    data[13] = -1; data[21] = -1; data[23] = 1; data[24] = 1; data[25] = 1;
    data[26] = 1; data[32] = -1; data[33] = 1; data[34] = 1; data[35] = -1;
    data[36] = -1; data[42] = 1; data[43] = 1; data[44] = 1; data[45] = -1;
    data[46] = -1; data[52] = -1; data[53] = 1; data[54] = -1; data[55] = -1;
    data[56] = -1; data[62] = -1; data[63] = -1; data[64] = 1; data[65] = -1;
    data[73] = -1; data[74] = -1; data[76] = -1; data[83] = -1; }




    if (boardnum == 74){
    player = 1;
    isLastPass = false;
    data[13] = -1; data[16] = 1; data[23] = -1; data[24] = -1; data[25] = 1;
    data[26] = 1; data[32] = 1; data[33] = -1; data[34] = -1; data[35] = 1;
    data[36] = 1; data[37] = -1; data[38] = -1; data[42] = -1; data[43] = -1;
    data[44] = 1; data[45] = -1; data[46] = -1; data[47] = -1; data[48] = -1;
    data[53] = -1; data[54] = -1; data[55] = -1; data[56] = -1; data[57] = -1;
    data[58] = -1; data[63] = -1; data[65] = 1; data[66] = 1; data[67] = -1;
    data[68] = -1; data[74] = 1; }




    if (boardnum == 75){
    player = -1;
    isLastPass = false;
    data[34] = 1; data[35] = 1; data[42] = 1; data[43] = 1; data[44] = 1;
    data[45] = 1; data[46] = 1; data[47] = 1; data[48] = -1; data[52] = 1;
    data[53] = -1; data[54] = -1; data[55] = -1; data[56] = -1; data[57] = -1;
    data[58] = -1; data[61] = 1; data[62] = 1; data[63] = -1; data[64] = -1;
    data[65] = 1; data[66] = 1; data[67] = -1; data[68] = -1; data[73] = 1;
    data[74] = -1; data[76] = 1; data[77] = 1; data[78] = -1; }




    if (boardnum == 76){
    player = -1;
    isLastPass = false;
    data[14] = 1; data[24] = 1; data[25] = 1; data[33] = 1; data[34] = 1;
    data[35] = 1; data[36] = 1; data[37] = 1; data[43] = 1; data[44] = -1;
    data[45] = 1; data[46] = 1; data[52] = 1; data[53] = 1; data[54] = 1;
    data[55] = 1; data[56] = 1; data[57] = 1; data[63] = 1; data[64] = -1;
    data[65] = -1; data[66] = -1; data[67] = 1; data[72] = 1; data[73] = 1;
    data[74] = -1; data[75] = -1; data[76] = 1; data[77] = 1; data[78] = 1;
    data[84] = -1; data[85] = -1; data[86] = -1; data[87] = -1; data[88] = -1;
    }




    if (boardnum == 77){
    player = -1;
    isLastPass = false;
    data[22] = 1; data[23] = 1; data[24] = 1; data[33] = 1; data[34] = 1;
    data[43] = 1; data[44] = 1; data[45] = 1; data[46] = 1; data[47] = 1;
    data[53] = -1; data[54] = -1; data[55] = -1; data[56] = 1; data[65] = -1;
    data[66] = 1; data[75] = -1; }




    if (boardnum == 78){
    player = -1;
    isLastPass = false;
    data[13] = -1; data[16] = 1; data[17] = -1; data[18] = -1; data[24] = -1;
    data[25] = 1; data[26] = 1; data[27] = 1; data[33] = 1; data[34] = 1;
    data[35] = 1; data[36] = 1; data[37] = 1; data[38] = 1; data[42] = -1;
    data[43] = -1; data[44] = -1; data[45] = 1; data[46] = 1; data[47] = 1;
    data[52] = -1; data[53] = 1; data[54] = 1; data[55] = 1; data[56] = 1;
    data[57] = 1; data[62] = 1; data[63] = 1; data[64] = 1; data[65] = 1;
    data[73] = 1; }




    if (boardnum == 79){
    player = -1;
    isLastPass = false;
    data[12] = 1; data[13] = -1; data[15] = 1; data[23] = 1; data[24] = 1;
    data[25] = 1; data[26] = 1; data[33] = 1; data[34] = 1; data[35] = -1;
    data[36] = 1; data[42] = 1; data[43] = -1; data[44] = -1; data[45] = 1;
    data[46] = -1; data[51] = -1; data[52] = -1; data[53] = -1; data[54] = -1;
    data[55] = -1; data[56] = 1; data[62] = -1; data[64] = 1; data[65] = 1;
    data[66] = 1; data[67] = 1; data[73] = -1; data[74] = -1; data[75] = -1;
    data[76] = -1; }




    if (boardnum == 80){
    player = -1;
    isLastPass = false;
    data[24] = -1; data[34] = -1; data[35] = -1; data[36] = 1; data[43] = -1;
    data[44] = -1; data[45] = 1; data[46] = 1; data[52] = 1; data[53] = 1;
    data[54] = 1; data[55] = 1; data[56] = 1; data[62] = 1; data[63] = 1;
    data[64] = 1; data[65] = -1; data[66] = 1; data[75] = -1; }




    if (boardnum == 81){
    player = 1;
    isLastPass = false;
    data[11] = -1; data[12] = -1; data[13] = -1; data[14] = -1; data[15] = -1;
    data[16] = -1; data[17] = -1; data[18] = -1; data[21] = 1; data[22] = -1;
    data[23] = -1; data[24] = -1; data[25] = 1; data[26] = 1; data[27] = -1;
    data[28] = -1; data[31] = 1; data[32] = -1; data[33] = -1; data[34] = -1;
    data[35] = 1; data[36] = -1; data[37] = -1; data[38] = -1; data[41] = -1;
    data[42] = -1; data[43] = -1; data[44] = -1; data[45] = -1; data[46] = -1;
    data[47] = 1; data[54] = -1; data[55] = -1; data[56] = 1; data[57] = 1;
    data[62] = 1; data[63] = 1; data[64] = 1; data[65] = 1; data[66] = -1;
    data[67] = 1; data[74] = 1; data[76] = -1; data[78] = 1; }




    if (boardnum == 82){
    player = 1;
    isLastPass = false;
    data[21] = -1; data[32] = -1; data[33] = -1; data[34] = -1; data[35] = -1;
    data[36] = -1; data[37] = -1; data[43] = -1; data[44] = -1; data[45] = -1;
    data[46] = -1; data[47] = -1; data[48] = -1; data[51] = -1; data[52] = -1;
    data[53] = -1; data[54] = -1; data[55] = 1; data[56] = -1; data[57] = -1;
    data[62] = -1; data[63] = -1; data[64] = -1; data[65] = -1; data[66] = -1;
    data[67] = -1; data[73] = -1; data[74] = -1; data[75] = -1; data[76] = -1;
    data[78] = -1; data[84] = -1; }




    if (boardnum == 83){
    player = -1;
    isLastPass = false;
    data[25] = 1; data[34] = 1; data[35] = 1; data[43] = -1; data[44] = -1;
    data[45] = 1; data[46] = 1; data[47] = 1; data[53] = -1; data[54] = -1;
    data[55] = 1; data[56] = 1; data[65] = 1; data[66] = 1; data[76] = 1;
    }




    if (boardnum == 84){
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




    if (boardnum == 85){
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




    if (boardnum == 86){
    player = 1;
    isLastPass = false;
    data[24] = 1; data[25] = -1; data[33] = -1; data[34] = 1; data[35] = -1;
    data[36] = 1; data[37] = 1; data[43] = -1; data[44] = -1; data[45] = -1;
    data[46] = -1; data[53] = 1; data[54] = 1; data[55] = 1; data[56] = 1;
    data[57] = -1; }




    if (boardnum == 87){
    player = -1;
    isLastPass = false;
    data[14] = 1; data[15] = 1; data[24] = -1; data[25] = 1; data[26] = -1;
    data[31] = 1; data[32] = -1; data[35] = -1; data[36] = 1; data[38] = 1;
    data[42] = -1; data[44] = -1; data[45] = 1; data[46] = -1; data[47] = 1;
    data[48] = 1; data[52] = -1; data[53] = 1; data[54] = -1; data[55] = 1;
    data[56] = -1; data[57] = -1; data[58] = 1; data[61] = 1; data[62] = 1;
    data[63] = 1; data[64] = 1; data[65] = -1; data[66] = -1; data[67] = 1;
    data[68] = 1; data[74] = -1; data[75] = -1; data[76] = -1; data[77] = 1;
    data[78] = 1; data[84] = -1; data[85] = -1; data[86] = 1; data[87] = 1;
    data[88] = 1; }




    if (boardnum == 88){
    player = -1;
    isLastPass = false;
    data[13] = -1; data[14] = -1; data[15] = -1; data[23] = 1; data[24] = -1;
    data[25] = -1; data[26] = -1; data[31] = -1; data[32] = -1; data[33] = 1;
    data[34] = 1; data[35] = -1; data[36] = 1; data[37] = -1; data[41] = -1;
    data[42] = -1; data[43] = 1; data[44] = 1; data[45] = -1; data[46] = -1;
    data[47] = -1; data[48] = -1; data[52] = -1; data[53] = 1; data[54] = 1;
    data[55] = 1; data[56] = 1; data[62] = -1; data[63] = 1; data[64] = 1;
    data[65] = 1; data[66] = 1; data[71] = -1; data[73] = 1; data[74] = 1;
    data[83] = 1; data[84] = 1; }




    if (boardnum == 89){
    player = -1;
    isLastPass = false;
    data[13] = -1; data[21] = -1; data[23] = -1; data[24] = -1; data[25] = 1;
    data[31] = -1; data[32] = -1; data[33] = 1; data[34] = -1; data[35] = 1;
    data[36] = -1; data[37] = -1; data[41] = -1; data[42] = -1; data[43] = -1;
    data[44] = -1; data[45] = 1; data[46] = -1; data[47] = -1; data[48] = -1;
    data[51] = -1; data[52] = -1; data[53] = 1; data[54] = 1; data[55] = 1;
    data[56] = -1; data[57] = -1; data[62] = -1; data[63] = -1; data[64] = 1;
    data[65] = 1; data[66] = -1; data[67] = -1; data[73] = -1; data[74] = 1;
    data[75] = -1; data[76] = -1; data[78] = -1; data[82] = -1; data[83] = -1;
    data[84] = -1; data[85] = -1; data[86] = -1; }




    if (boardnum == 90){
    player = 1;
    isLastPass = false;
    data[13] = -1; data[14] = -1; data[23] = -1; data[24] = -1; data[25] = -1;
    data[26] = -1; data[34] = -1; data[35] = -1; data[36] = -1; data[44] = -1;
    data[45] = 1; data[46] = -1; data[47] = -1; data[53] = -1; data[54] = 1;
    data[55] = -1; data[56] = -1; data[58] = -1; data[63] = 1; data[65] = 1;
    data[66] = -1; data[67] = 1; }




    if (boardnum == 91){
    player = -1;
    isLastPass = false;
    data[11] = 1; data[13] = 1; data[15] = -1; data[16] = -1; data[17] = -1;
    data[21] = 1; data[22] = 1; data[23] = -1; data[24] = -1; data[25] = -1;
    data[26] = -1; data[31] = 1; data[32] = 1; data[33] = 1; data[34] = -1;
    data[35] = -1; data[36] = 1; data[37] = -1; data[41] = -1; data[42] = -1;
    data[43] = 1; data[44] = -1; data[45] = -1; data[46] = -1; data[51] = -1;
    data[53] = -1; data[54] = 1; data[55] = -1; data[62] = -1; data[63] = -1;
    data[64] = -1; data[65] = 1; data[73] = -1; data[74] = -1; data[75] = -1;
    }




    if (boardnum == 92){
    player = -1;
    isLastPass = false;
    data[32] = -1; data[33] = -1; data[34] = 1; data[43] = -1; data[44] = 1;
    data[45] = 1; data[46] = 1; data[53] = 1; data[54] = 1; data[55] = -1;
    data[56] = 1; data[63] = 1; data[64] = 1; data[65] = -1; data[66] = -1;
    data[75] = -1; data[76] = -1; data[77] = -1; data[84] = -1; }




    if (boardnum == 93){
    player = 1;
    isLastPass = false;
    data[32] = -1; data[43] = -1; data[44] = 1; data[45] = 1; data[53] = 1;
    data[54] = -1; data[55] = -1; data[56] = 1; data[63] = 1; data[64] = 1;
    data[65] = -1; data[66] = -1; data[75] = -1; data[76] = -1; data[77] = -1;
    data[84] = -1; }




    if (boardnum == 94){
    player = -1;
    isLastPass = false;
    data[33] = -1; data[34] = -1; data[35] = -1; data[36] = -1; data[37] = -1;
    data[43] = -1; data[44] = -1; data[45] = 1; data[46] = -1; data[53] = -1;
    data[54] = -1; data[55] = -1; data[56] = 1; data[57] = -1; data[62] = -1;
    data[63] = -1; data[64] = -1; data[65] = 1; data[67] = 1; }




    if (boardnum == 95){
    player = -1;
    isLastPass = false;
    data[11] = -1; data[12] = -1; data[13] = -1; data[21] = 1; data[22] = 1;
    data[23] = 1; data[24] = -1; data[25] = 1; data[28] = 1; data[32] = 1;
    data[33] = 1; data[34] = 1; data[35] = -1; data[36] = -1; data[37] = 1;
    data[43] = 1; data[44] = 1; data[45] = 1; data[46] = 1; data[47] = 1;
    data[54] = 1; data[55] = 1; data[56] = -1; data[63] = -1; data[65] = 1;
    data[66] = 1; data[67] = -1; }




    if (boardnum == 96){
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




    if (boardnum == 97){
    player = 1;
    isLastPass = false;
    data[24] = -1; data[25] = 1; data[33] = -1; data[34] = -1; data[35] = -1;
    data[36] = -1; data[44] = -1; data[45] = 1; data[46] = -1; data[52] = 1;
    data[53] = 1; data[54] = -1; data[55] = 1; data[56] = -1; data[57] = 1;
    data[62] = 1; data[63] = 1; data[64] = 1; data[66] = -1; data[67] = -1;
    data[75] = 1; data[76] = -1; }




    if (boardnum == 98){
    player = 1;
    isLastPass = false;
    data[13] = -1; data[14] = -1; data[15] = 1; data[22] = -1; data[24] = 1;
    data[25] = -1; data[33] = 1; data[35] = -1; data[36] = -1; data[37] = 1;
    data[42] = 1; data[44] = -1; data[45] = -1; data[46] = 1; data[54] = -1;
    data[55] = 1; data[56] = -1; data[57] = -1; data[63] = -1; data[64] = 1;
    data[65] = -1; data[66] = 1; data[67] = -1; data[76] = -1; data[77] = 1;
    data[88] = 1; }




    if (boardnum == 99){
    player = 1;
    isLastPass = false;
    data[34] = 1; data[35] = 1; data[42] = 1; data[43] = 1; data[44] = 1;
    data[45] = 1; data[46] = 1; data[54] = -1; data[55] = 1; data[56] = -1;
    data[57] = 1; data[64] = -1; data[65] = -1; data[66] = -1; data[67] = -1;
    data[77] = 1; }




    if (boardnum == 100){
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




    if (boardnum == 101){
    player = -1;
    isLastPass = false;
    data[11] = 1; data[13] = -1; data[14] = 1; data[15] = 1; data[16] = 1;
    data[21] = -1; data[22] = 1; data[23] = -1; data[24] = 1; data[25] = -1;
    data[32] = -1; data[33] = 1; data[34] = 1; data[35] = -1; data[36] = -1;
    data[41] = 1; data[42] = 1; data[43] = -1; data[44] = -1; data[45] = -1;
    data[46] = -1; data[51] = 1; data[52] = 1; data[53] = -1; data[54] = -1;
    data[55] = -1; data[56] = -1; data[61] = 1; data[62] = 1; data[63] = -1;
    data[64] = -1; data[65] = -1; data[66] = -1; data[71] = 1; data[72] = 1;
    data[74] = -1; data[75] = -1; data[76] = -1; data[81] = 1; data[82] = 1;
    data[83] = 1; data[84] = 1; data[85] = 1; }




    if (boardnum == 102){
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




    if (boardnum == 103){
    player = 1;
    isLastPass = false;
    data[12] = -1; data[13] = -1; data[14] = -1; data[15] = -1; data[23] = -1;
    data[24] = 1; data[25] = -1; data[26] = -1; data[33] = -1; data[34] = -1;
    data[35] = -1; data[36] = -1; data[37] = -1; data[38] = 1; data[43] = -1;
    data[44] = 1; data[45] = 1; data[46] = 1; data[47] = 1; data[48] = 1;
    data[52] = -1; data[53] = -1; data[54] = 1; data[55] = 1; data[56] = 1;
    data[57] = 1; data[58] = 1; data[63] = -1; data[64] = 1; data[65] = 1;
    data[66] = 1; data[68] = 1; }




    if (boardnum == 104){
    player = 1;
    isLastPass = false;
    data[15] = -1; data[23] = -1; data[25] = 1; data[26] = -1; data[27] = -1;
    data[33] = -1; data[34] = -1; data[35] = 1; data[36] = 1; data[37] = -1;
    data[43] = 1; data[44] = 1; data[45] = -1; data[46] = 1; data[47] = 1;
    data[53] = -1; data[54] = -1; data[55] = -1; data[56] = 1; data[65] = -1;
    }




    if (boardnum == 105){
    player = -1;
    isLastPass = false;
    data[13] = -1; data[14] = -1; data[23] = -1; data[24] = -1; data[25] = -1;
    data[26] = -1; data[33] = -1; data[34] = -1; data[35] = -1; data[36] = -1;
    data[42] = -1; data[43] = 1; data[44] = 1; data[45] = 1; data[46] = -1;
    data[47] = -1; data[48] = -1; data[53] = 1; data[54] = 1; data[55] = 1;
    data[56] = 1; data[57] = -1; data[58] = -1; data[63] = 1; data[64] = -1;
    data[65] = 1; data[66] = -1; data[67] = 1; data[75] = 1; }




    if (boardnum == 106){
    player = -1;
    isLastPass = false;
    data[11] = 1; data[13] = 1; data[14] = 1; data[15] = 1; data[16] = -1;
    data[22] = 1; data[23] = 1; data[24] = 1; data[25] = -1; data[26] = -1;
    data[27] = -1; data[31] = 1; data[32] = 1; data[33] = 1; data[34] = -1;
    data[35] = -1; data[36] = -1; data[37] = 1; data[38] = 1; data[42] = -1;
    data[44] = -1; data[45] = -1; data[46] = 1; data[53] = -1; data[54] = -1;
    data[55] = 1; data[56] = -1; data[57] = -1; data[58] = -1; data[62] = -1;
    data[63] = -1; data[64] = -1; data[65] = 1; data[66] = -1; data[71] = -1;
    data[73] = 1; data[75] = 1; data[76] = -1; data[82] = 1; data[85] = 1;
    data[86] = -1; }




    if (boardnum == 107){
    player = 1;
    isLastPass = false;
    data[14] = 1; data[24] = 1; data[26] = 1; data[33] = -1; data[34] = 1;
    data[35] = 1; data[36] = 1; data[44] = -1; data[45] = 1; data[46] = 1;
    data[53] = 1; data[54] = 1; data[55] = -1; data[56] = 1; data[62] = 1;
    data[66] = -1; }




    if (boardnum == 108){
    player = 1;
    isLastPass = false;
    data[13] = 1; data[14] = 1; data[15] = 1; data[16] = 1; data[17] = 1;
    data[18] = -1; data[23] = 1; data[24] = 1; data[25] = 1; data[26] = 1;
    data[27] = -1; data[28] = -1; data[31] = 1; data[32] = 1; data[33] = 1;
    data[34] = 1; data[35] = 1; data[36] = -1; data[37] = 1; data[38] = -1;
    data[41] = 1; data[42] = 1; data[43] = -1; data[44] = -1; data[45] = -1;
    data[46] = 1; data[47] = -1; data[48] = -1; data[51] = 1; data[52] = 1;
    data[53] = 1; data[54] = 1; data[55] = -1; data[56] = -1; data[57] = 1;
    data[58] = -1; data[64] = 1; data[65] = 1; data[66] = 1; data[67] = -1;
    data[68] = -1; data[74] = 1; data[76] = 1; data[78] = -1; }




    if (boardnum == 109){
    player = -1;
    isLastPass = false;
    data[24] = -1; data[25] = 1; data[32] = 1; data[33] = 1; data[34] = 1;
    data[35] = -1; data[36] = -1; data[43] = 1; data[44] = 1; data[45] = -1;
    data[46] = -1; data[52] = 1; data[53] = 1; data[54] = -1; data[55] = -1;
    data[56] = -1; data[57] = 1; data[62] = 1; data[63] = 1; data[64] = 1;
    data[65] = -1; data[66] = -1; data[67] = -1; data[75] = 1; data[76] = -1;
    }




    if (boardnum == 110){
    player = -1;
    isLastPass = false;
    data[13] = -1; data[15] = 1; data[16] = 1; data[17] = 1; data[21] = 1;
    data[23] = -1; data[24] = -1; data[25] = 1; data[26] = 1; data[31] = 1;
    data[32] = 1; data[33] = 1; data[34] = -1; data[35] = 1; data[36] = -1;
    data[37] = -1; data[38] = -1; data[41] = 1; data[42] = -1; data[43] = 1;
    data[44] = 1; data[45] = -1; data[46] = -1; data[47] = 1; data[51] = 1;
    data[53] = 1; data[54] = 1; data[55] = 1; data[56] = -1; data[57] = 1;
    data[63] = 1; data[64] = 1; data[65] = 1; data[66] = 1; data[67] = 1;
    data[73] = 1; data[74] = 1; data[75] = 1; data[76] = 1; data[83] = 1;
    data[85] = 1; }




    if (boardnum == 111){
    player = -1;
    isLastPass = false;
    data[25] = 1; data[32] = -1; data[34] = 1; data[35] = 1; data[36] = 1;
    data[38] = 1; data[42] = 1; data[43] = 1; data[44] = 1; data[45] = 1;
    data[46] = -1; data[47] = 1; data[48] = -1; data[52] = 1; data[53] = 1;
    data[54] = 1; data[55] = -1; data[56] = 1; data[57] = 1; data[58] = 1;
    data[61] = -1; data[62] = -1; data[63] = 1; data[64] = -1; data[65] = 1;
    data[66] = 1; data[67] = 1; data[73] = -1; data[74] = 1; data[75] = 1;
    data[76] = 1; data[83] = 1; data[84] = 1; data[85] = 1; data[86] = 1;
    }




    if (boardnum == 112){
    player = -1;
    isLastPass = false;
    data[32] = -1; data[34] = -1; data[36] = 1; data[37] = 1; data[41] = 1;
    data[42] = -1; data[43] = -1; data[44] = -1; data[45] = -1; data[46] = 1;
    data[52] = -1; data[54] = 1; data[55] = 1; data[56] = -1; data[57] = -1;
    data[63] = 1; data[64] = 1; data[65] = 1; data[66] = -1; data[74] = 1;
    data[76] = 1; }




    if (boardnum == 113){
    player = 1;
    isLastPass = false;
    data[23] = 1; data[24] = -1; data[32] = -1; data[33] = -1; data[34] = -1;
    data[35] = -1; data[43] = -1; data[44] = -1; data[45] = 1; data[46] = 1;
    data[53] = -1; data[54] = -1; data[55] = 1; data[56] = 1; data[63] = -1;
    data[64] = 1; }




    if (boardnum == 114){
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




    if (boardnum == 115){
    player = -1;
    isLastPass = false;
    data[26] = -1; data[32] = -1; data[34] = -1; data[35] = -1; data[42] = -1;
    data[43] = -1; data[44] = -1; data[45] = -1; data[52] = -1; data[54] = -1;
    data[55] = -1; data[56] = 1; data[57] = -1; data[64] = -1; data[65] = 1;
    data[66] = 1; data[67] = 1; data[68] = 1; data[74] = 1; data[75] = 1;
    data[76] = 1; data[77] = -1; data[84] = 1; }




    if (boardnum == 116){
    player = -1;
    isLastPass = false;
    data[13] = -1; data[14] = -1; data[15] = -1; data[16] = -1; data[22] = 1;
    data[23] = -1; data[24] = -1; data[25] = -1; data[26] = -1; data[32] = -1;
    data[33] = 1; data[34] = -1; data[35] = -1; data[36] = -1; data[37] = -1;
    data[38] = 1; data[41] = -1; data[42] = -1; data[43] = -1; data[44] = 1;
    data[45] = 1; data[46] = -1; data[47] = 1; data[53] = 1; data[54] = 1;
    data[55] = 1; data[56] = 1; data[58] = -1; data[64] = 1; data[65] = 1;
    data[66] = 1; data[67] = 1; data[75] = -1; }




    if (boardnum == 117){
    player = -1;
    isLastPass = false;
    data[11] = 1; data[13] = -1; data[14] = -1; data[15] = -1; data[16] = -1;
    data[22] = 1; data[23] = -1; data[24] = -1; data[25] = 1; data[26] = -1;
    data[31] = 1; data[32] = 1; data[33] = 1; data[34] = 1; data[35] = 1;
    data[36] = -1; data[37] = 1; data[38] = 1; data[42] = -1; data[43] = -1;
    data[44] = 1; data[45] = -1; data[46] = -1; data[53] = -1; data[54] = -1;
    data[55] = 1; data[62] = -1; data[63] = -1; data[66] = 1; }




    if (boardnum == 118){
    player = 1;
    isLastPass = false;
    data[13] = -1; data[23] = -1; data[24] = -1; data[25] = -1; data[27] = -1;
    data[31] = -1; data[32] = -1; data[33] = -1; data[34] = -1; data[35] = -1;
    data[36] = -1; data[37] = -1; data[42] = -1; data[43] = -1; data[44] = 1;
    data[45] = -1; data[46] = 1; data[47] = -1; data[48] = 1; data[52] = -1;
    data[53] = -1; data[54] = -1; data[55] = -1; data[56] = -1; data[57] = 1;
    data[58] = 1; data[67] = -1; data[68] = 1; }




    if (boardnum == 119){
    player = -1;
    isLastPass = false;
    data[15] = 1; data[24] = 1; data[33] = 1; data[35] = -1; data[37] = 1;
    data[44] = 1; data[45] = 1; data[46] = -1; data[54] = -1; data[55] = 1;
    data[56] = -1; data[57] = -1; data[63] = -1; data[65] = 1; data[66] = 1;
    data[67] = -1; data[77] = -1; }




    if (boardnum == 120){
    player = -1;
    isLastPass = false;
    data[12] = 1; data[23] = 1; data[24] = 1; data[25] = 1; data[32] = 1;
    data[34] = 1; data[35] = 1; data[43] = 1; data[44] = -1; data[45] = -1;
    data[46] = 1; data[52] = 1; data[53] = 1; data[54] = -1; data[55] = -1;
    data[56] = 1; data[57] = 1; data[62] = 1; data[63] = 1; data[64] = 1;
    data[65] = 1; data[66] = -1; data[73] = 1; data[74] = -1; data[75] = 1;
    data[76] = 1; data[82] = 1; }




    if (boardnum == 121){
    player = 1;
    isLastPass = false;
    data[21] = 1; data[24] = -1; data[25] = 1; data[31] = 1; data[32] = 1;
    data[33] = -1; data[34] = 1; data[35] = 1; data[41] = 1; data[42] = -1;
    data[43] = 1; data[44] = -1; data[45] = 1; data[51] = 1; data[52] = 1;
    data[53] = -1; data[54] = 1; data[55] = 1; data[56] = 1; data[57] = 1;
    data[61] = 1; data[62] = 1; data[63] = 1; data[64] = -1; data[65] = 1;
    data[66] = 1; data[71] = 1; data[73] = -1; data[74] = -1; data[75] = -1;
    data[76] = -1; data[82] = -1; data[83] = -1; data[84] = -1; data[85] = 1;
    data[86] = -1; }




    if (boardnum == 122){
    player = 1;
    isLastPass = false;
    data[32] = -1; data[34] = 1; data[35] = -1; data[36] = -1; data[38] = 1;
    data[42] = 1; data[43] = 1; data[44] = 1; data[45] = -1; data[46] = -1;
    data[47] = 1; data[53] = 1; data[54] = -1; data[55] = -1; data[56] = 1;
    data[57] = 1; data[58] = 1; data[62] = 1; data[63] = -1; data[64] = -1;
    data[65] = -1; data[66] = -1; data[67] = 1; data[76] = -1; }




    if (boardnum == 123){
    player = -1;
    isLastPass = false;
    data[31] = 1; data[32] = 1; data[33] = 1; data[34] = 1; data[35] = 1;
    data[36] = 1; data[41] = 1; data[42] = 1; data[43] = 1; data[44] = 1;
    data[45] = 1; data[46] = 1; data[52] = 1; data[53] = 1; data[54] = -1;
    data[55] = -1; data[56] = -1; data[57] = -1; data[62] = 1; data[63] = -1;
    data[64] = -1; data[65] = -1; data[66] = -1; data[67] = -1; data[68] = -1;
    }




    if (boardnum == 124){
    player = 1;
    isLastPass = false;
    data[15] = 1; data[22] = -1; data[24] = 1; data[33] = -1; data[35] = -1;
    data[37] = 1; data[44] = -1; data[45] = 1; data[46] = -1; data[54] = -1;
    data[55] = -1; data[56] = -1; data[57] = -1; data[63] = -1; data[65] = 1;
    data[66] = -1; data[67] = -1; data[77] = -1; }




    if (boardnum == 125){
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




    if (boardnum == 126){
    player = -1;
    isLastPass = false;
    data[32] = 1; data[33] = 1; data[34] = 1; data[35] = 1; data[43] = 1;
    data[44] = -1; data[45] = 1; data[46] = -1; data[53] = -1; data[54] = 1;
    data[55] = -1; data[56] = -1; data[64] = 1; data[65] = 1; data[66] = -1;
    }




    if (boardnum == 127){
    player = -1;
    isLastPass = false;
    data[24] = 1; data[31] = 1; data[33] = 1; data[35] = 1; data[36] = 1;
    data[42] = 1; data[43] = -1; data[44] = -1; data[45] = 1; data[46] = 1;
    data[47] = -1; data[53] = -1; data[54] = 1; data[55] = 1; data[56] = 1;
    data[61] = 1; data[62] = 1; data[63] = 1; data[64] = 1; data[65] = 1;
    data[66] = 1; data[73] = 1; data[77] = 1; }




    if (boardnum == 128){
    player = -1;
    isLastPass = false;
    data[12] = 1; data[13] = 1; data[14] = 1; data[15] = 1; data[23] = 1;
    data[24] = 1; data[25] = 1; data[26] = 1; data[32] = 1; data[33] = 1;
    data[34] = 1; data[35] = 1; data[36] = 1; data[37] = 1; data[43] = 1;
    data[44] = 1; data[45] = -1; data[46] = -1; data[47] = -1; data[52] = 1;
    data[53] = 1; data[54] = -1; data[55] = 1; data[56] = -1; data[57] = -1;
    data[58] = -1; data[62] = 1; data[63] = 1; data[64] = 1; data[65] = -1;
    data[66] = -1; data[67] = -1; data[75] = -1; data[76] = -1; data[85] = -1;
    }




    if (boardnum == 129){
    player = -1;
    isLastPass = false;
    data[33] = 1; data[34] = 1; data[35] = 1; data[36] = 1; data[37] = 1;
    data[44] = -1; data[45] = -1; data[46] = 1; data[54] = -1; data[55] = -1;
    data[56] = 1; data[57] = 1; data[63] = -1; data[64] = -1; data[65] = -1;
    data[66] = -1; data[67] = 1; data[73] = 1; data[74] = 1; data[75] = 1;
    data[76] = 1; data[77] = -1; data[88] = -1; }




    if (boardnum == 130){
    player = -1;
    isLastPass = false;
    data[33] = -1; data[34] = -1; data[35] = -1; data[43] = 1; data[44] = -1;
    data[45] = -1; data[52] = 1; data[53] = 1; data[54] = 1; data[55] = -1;
    data[56] = 1; data[63] = -1; data[64] = 1; data[65] = 1; data[66] = 1;
    }




    if (boardnum == 131){
    player = 1;
    isLastPass = false;
    data[11] = -1; data[12] = -1; data[13] = -1; data[22] = -1; data[23] = 1;
    data[24] = -1; data[25] = 1; data[28] = 1; data[32] = -1; data[33] = 1;
    data[34] = 1; data[35] = -1; data[36] = -1; data[37] = 1; data[43] = 1;
    data[44] = 1; data[45] = 1; data[46] = 1; data[47] = 1; data[54] = 1;
    data[55] = 1; data[56] = -1; data[63] = -1; data[65] = 1; data[66] = 1;
    data[67] = -1; }




    if (boardnum == 132){
    player = 1;
    isLastPass = false;
    data[11] = -1; data[12] = 1; data[13] = 1; data[14] = 1; data[15] = 1;
    data[16] = 1; data[17] = 1; data[18] = 1; data[21] = 1; data[22] = 1;
    data[23] = 1; data[24] = -1; data[25] = -1; data[26] = 1; data[27] = -1;
    data[31] = -1; data[32] = 1; data[33] = -1; data[34] = 1; data[35] = 1;
    data[36] = -1; data[43] = 1; data[44] = 1; data[45] = -1; data[46] = 1;
    data[53] = 1; data[54] = -1; data[55] = -1; data[56] = -1; data[62] = 1;
    data[64] = -1; data[65] = -1; data[66] = -1; data[67] = -1; data[74] = 1;
    data[76] = -1; }




    if (boardnum == 133){
    player = 1;
    isLastPass = false;
    data[32] = 1; data[33] = -1; data[34] = -1; data[35] = -1; data[42] = -1;
    data[43] = -1; data[44] = -1; data[45] = -1; data[52] = 1; data[53] = -1;
    data[54] = 1; data[55] = -1; data[56] = 1; data[62] = 1; data[63] = -1;
    data[64] = -1; data[65] = 1; data[66] = 1; data[73] = -1; data[74] = -1;
    }




    if (boardnum == 134){
    player = 1;
    isLastPass = false;
    data[21] = -1; data[32] = -1; data[33] = -1; data[34] = -1; data[35] = -1;
    data[36] = -1; data[37] = -1; data[43] = -1; data[44] = 1; data[45] = 1;
    data[46] = 1; data[47] = 1; data[51] = -1; data[52] = -1; data[53] = -1;
    data[54] = -1; data[55] = -1; data[56] = -1; data[57] = -1; data[62] = -1;
    data[63] = -1; data[64] = -1; data[65] = -1; data[67] = -1; data[75] = -1;
    data[78] = -1; }




    if (boardnum == 135){
    player = 1;
    isLastPass = false;
    data[16] = 1; data[24] = 1; data[25] = 1; data[33] = 1; data[34] = 1;
    data[37] = 1; data[43] = -1; data[44] = -1; data[45] = -1; data[46] = -1;
    data[47] = -1; data[53] = -1; data[54] = -1; data[55] = -1; data[56] = -1;
    data[64] = -1; data[65] = -1; data[66] = -1; }




    if (boardnum == 136){
    player = -1;
    isLastPass = false;
    data[13] = -1; data[24] = -1; data[25] = 1; data[33] = -1; data[34] = 1;
    data[35] = 1; data[36] = 1; data[37] = 1; data[44] = 1; data[45] = 1;
    data[46] = 1; data[47] = 1; data[53] = -1; data[54] = -1; data[55] = 1;
    data[56] = 1; data[64] = -1; data[65] = -1; data[66] = -1; data[67] = -1;
    data[74] = 1; data[75] = -1; data[76] = -1; }




    if (boardnum == 137){
    player = 1;
    isLastPass = false;
    data[24] = 1; data[33] = 1; data[34] = 1; data[36] = -1; data[43] = 1;
    data[44] = -1; data[45] = -1; data[46] = -1; data[53] = 1; data[54] = -1;
    data[55] = 1; data[56] = 1; data[63] = -1; data[64] = 1; data[65] = 1;
    data[73] = 1; }




    if (boardnum == 138){
    player = -1;
    isLastPass = false;
    data[12] = 1; data[13] = -1; data[15] = 1; data[23] = 1; data[24] = 1;
    data[25] = 1; data[26] = 1; data[27] = -1; data[33] = 1; data[34] = 1;
    data[35] = 1; data[36] = 1; data[37] = 1; data[41] = -1; data[42] = -1;
    data[43] = -1; data[44] = -1; data[45] = -1; data[46] = 1; data[51] = -1;
    data[52] = -1; data[53] = -1; data[54] = -1; data[55] = 1; data[56] = 1;
    data[62] = -1; data[64] = 1; data[65] = 1; data[66] = 1; data[67] = 1;
    data[73] = -1; data[74] = 1; data[75] = 1; data[76] = -1; data[84] = 1;
    }




    if (boardnum == 139){
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




    if (boardnum == 140){
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




    if (boardnum == 141){
    player = -1;
    isLastPass = false;
    data[11] = -1; data[12] = -1; data[13] = -1; data[14] = -1; data[15] = -1;
    data[16] = -1; data[17] = -1; data[18] = -1; data[21] = 1; data[22] = 1;
    data[23] = -1; data[24] = -1; data[25] = 1; data[26] = 1; data[27] = -1;
    data[28] = -1; data[31] = 1; data[32] = 1; data[33] = 1; data[34] = -1;
    data[35] = 1; data[36] = -1; data[37] = -1; data[38] = -1; data[41] = -1;
    data[43] = 1; data[44] = -1; data[45] = -1; data[46] = -1; data[47] = 1;
    data[54] = -1; data[55] = -1; data[56] = 1; data[57] = 1; data[62] = 1;
    data[63] = 1; data[64] = 1; data[65] = 1; data[66] = -1; data[67] = 1;
    data[74] = 1; data[76] = -1; data[78] = 1; }




    if (boardnum == 142){
    player = -1;
    isLastPass = false;
    data[15] = 1; data[16] = -1; data[21] = 1; data[22] = -1; data[23] = 1;
    data[25] = 1; data[26] = 1; data[27] = -1; data[32] = -1; data[33] = -1;
    data[34] = -1; data[35] = -1; data[36] = -1; data[37] = -1; data[41] = 1;
    data[42] = -1; data[43] = -1; data[44] = -1; data[45] = -1; data[46] = -1;
    data[47] = 1; data[52] = -1; data[54] = -1; data[55] = -1; data[56] = 1;
    data[57] = 1; data[58] = 1; data[62] = 1; data[63] = 1; data[64] = 1;
    data[65] = 1; data[66] = 1; data[67] = 1; data[68] = -1; data[73] = 1;
    data[74] = 1; data[75] = 1; data[76] = 1; data[85] = -1; }




    if (boardnum == 143){
    player = -1;
    isLastPass = false;
    data[15] = -1; data[25] = -1; data[32] = -1; data[33] = -1; data[34] = -1;
    data[35] = -1; data[36] = 1; data[37] = 1; data[38] = 1; data[42] = -1;
    data[43] = -1; data[44] = -1; data[45] = -1; data[46] = 1; data[47] = 1;
    data[48] = 1; data[51] = -1; data[52] = -1; data[53] = -1; data[54] = -1;
    data[55] = -1; data[56] = 1; data[57] = 1; data[58] = 1; data[62] = -1;
    data[64] = -1; data[67] = -1; data[68] = 1; data[73] = -1; }




    if (boardnum == 144){
    player = 1;
    isLastPass = false;
    data[25] = -1; data[33] = 1; data[34] = 1; data[35] = -1; data[36] = 1;
    data[37] = 1; data[42] = 1; data[43] = 1; data[44] = -1; data[45] = -1;
    data[46] = 1; data[52] = 1; data[53] = -1; data[54] = -1; data[55] = -1;
    data[56] = 1; data[61] = 1; data[63] = 1; data[64] = 1; data[65] = -1;
    data[66] = 1; data[72] = 1; data[74] = 1; data[75] = 1; data[76] = 1;
    data[83] = -1; data[84] = 1; data[86] = 1; }




    if (boardnum == 145){
    player = 1;
    isLastPass = false;
    data[15] = 1; data[16] = -1; data[18] = 1; data[25] = 1; data[26] = -1;
    data[27] = 1; data[32] = -1; data[34] = -1; data[35] = -1; data[36] = -1;
    data[37] = -1; data[43] = -1; data[44] = -1; data[45] = 1; data[46] = -1;
    data[54] = -1; data[55] = 1; data[56] = -1; data[57] = -1; data[64] = -1;
    data[65] = 1; data[66] = 1; }




    if (boardnum == 146){
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




    if (boardnum == 147){
    player = 1;
    isLastPass = false;
    data[25] = 1; data[32] = -1; data[34] = 1; data[35] = 1; data[36] = 1;
    data[38] = 1; data[42] = 1; data[43] = 1; data[44] = 1; data[45] = 1;
    data[46] = -1; data[47] = 1; data[48] = -1; data[53] = 1; data[54] = -1;
    data[55] = 1; data[56] = 1; data[57] = 1; data[58] = 1; data[61] = -1;
    data[62] = -1; data[63] = -1; data[64] = -1; data[65] = 1; data[66] = 1;
    data[67] = 1; data[74] = -1; data[75] = 1; data[76] = 1; data[83] = 1;
    data[85] = -1; data[86] = 1; }




    if (boardnum == 148){
    player = -1;
    isLastPass = false;
    data[13] = -1; data[14] = -1; data[15] = -1; data[16] = -1; data[17] = -1;
    data[22] = 1; data[24] = -1; data[25] = 1; data[26] = -1; data[32] = -1;
    data[33] = -1; data[34] = -1; data[35] = -1; data[36] = 1; data[42] = -1;
    data[43] = -1; data[44] = 1; data[45] = 1; data[46] = 1; data[47] = 1;
    data[53] = -1; data[54] = -1; data[55] = 1; data[56] = 1; data[62] = 1;
    data[63] = -1; data[64] = -1; data[65] = 1; data[75] = 1; }




    if (boardnum == 149){
    player = 1;
    isLastPass = false;
    data[14] = -1; data[16] = 1; data[23] = -1; data[24] = -1; data[25] = -1;
    data[26] = -1; data[27] = -1; data[33] = -1; data[34] = 1; data[35] = 1;
    data[36] = -1; data[37] = -1; data[38] = -1; data[42] = -1; data[43] = -1;
    data[44] = 1; data[45] = 1; data[46] = 1; data[47] = -1; data[51] = -1;
    data[53] = -1; data[54] = -1; data[55] = 1; data[56] = -1; data[57] = -1;
    data[58] = -1; data[64] = -1; data[65] = -1; data[66] = 1; data[67] = -1;
    data[74] = -1; data[75] = -1; data[76] = -1; data[77] = -1; data[87] = -1;
    data[88] = 1; }




    if (boardnum == 150){
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




    if (boardnum == 151){
    player = -1;
    isLastPass = false;
    data[14] = 1; data[23] = -1; data[24] = 1; data[25] = -1; data[26] = -1;
    data[34] = 1; data[36] = -1; data[44] = 1; data[45] = 1; data[46] = 1;
    data[47] = -1; data[54] = -1; data[55] = 1; data[56] = 1; data[58] = -1;
    data[63] = -1; data[65] = 1; }




    if (boardnum == 152){
    player = -1;
    isLastPass = false;
    data[11] = 1; data[12] = -1; data[13] = 1; data[14] = 1; data[15] = 1;
    data[16] = 1; data[17] = 1; data[21] = 1; data[22] = 1; data[23] = -1;
    data[24] = 1; data[25] = 1; data[26] = 1; data[32] = 1; data[33] = 1;
    data[34] = 1; data[35] = 1; data[36] = 1; data[37] = 1; data[43] = -1;
    data[44] = 1; data[45] = -1; data[46] = -1; data[47] = -1; data[52] = -1;
    data[53] = -1; data[54] = -1; data[55] = -1; data[56] = -1; data[62] = -1;
    data[63] = -1; data[64] = -1; data[65] = -1; data[66] = -1; data[67] = -1;
    data[75] = -1; data[76] = -1; data[77] = -1; data[84] = -1; }




    if (boardnum == 153){
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




    if (boardnum == 154){
    player = -1;
    isLastPass = false;
    data[13] = -1; data[14] = 1; data[15] = 1; data[24] = 1; data[25] = 1;
    data[26] = 1; data[32] = 1; data[33] = 1; data[34] = 1; data[35] = 1;
    data[36] = 1; data[37] = 1; data[38] = 1; data[42] = 1; data[43] = 1;
    data[44] = -1; data[45] = -1; data[46] = 1; data[47] = -1; data[48] = -1;
    data[52] = 1; data[53] = 1; data[54] = 1; data[55] = -1; data[56] = 1;
    data[57] = -1; data[62] = 1; data[63] = 1; data[64] = 1; data[66] = 1;
    data[73] = 1; data[74] = 1; data[76] = 1; }




    if (boardnum == 155){
    player = 1;
    isLastPass = false;
    data[13] = -1; data[16] = 1; data[23] = -1; data[24] = -1; data[25] = 1;
    data[26] = 1; data[32] = 1; data[33] = -1; data[34] = -1; data[35] = 1;
    data[36] = 1; data[37] = -1; data[38] = -1; data[41] = 1; data[42] = 1;
    data[43] = -1; data[44] = 1; data[45] = -1; data[46] = -1; data[47] = -1;
    data[48] = -1; data[52] = -1; data[53] = -1; data[54] = 1; data[55] = -1;
    data[56] = -1; data[57] = -1; data[58] = -1; data[63] = -1; data[64] = -1;
    data[65] = 1; data[66] = 1; data[67] = -1; data[68] = -1; data[73] = -1;
    data[74] = 1; }




    if (boardnum == 156){
    player = 1;
    isLastPass = false;
    data[23] = 1; data[24] = -1; data[32] = -1; data[33] = -1; data[34] = -1;
    data[35] = -1; data[36] = -1; data[44] = -1; data[45] = 1; data[46] = 1;
    data[53] = -1; data[54] = -1; data[55] = 1; data[65] = 1; data[75] = 1;
    data[76] = -1; }




    if (boardnum == 157){
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




    if (boardnum == 158){
    player = 1;
    isLastPass = false;
    data[42] = -1; data[44] = -1; data[45] = 1; data[52] = -1; data[53] = -1;
    data[54] = 1; data[55] = 1; data[56] = 1; data[62] = -1; data[63] = -1;
    data[64] = 1; data[65] = 1; data[66] = -1; data[74] = -1; data[75] = -1;
    data[85] = -1; }




    if (boardnum == 159){
    player = -1;
    isLastPass = false;
    data[12] = 1; data[13] = -1; data[16] = 1; data[17] = -1; data[18] = -1;
    data[23] = 1; data[24] = -1; data[25] = -1; data[26] = -1; data[27] = -1;
    data[28] = -1; data[31] = 1; data[33] = -1; data[34] = 1; data[35] = 1;
    data[36] = 1; data[37] = 1; data[38] = 1; data[42] = 1; data[43] = -1;
    data[44] = -1; data[45] = 1; data[46] = 1; data[47] = 1; data[52] = -1;
    data[53] = 1; data[54] = 1; data[55] = 1; data[56] = 1; data[57] = 1;
    data[62] = 1; data[63] = 1; data[64] = 1; data[65] = 1; data[73] = 1;
    }




    if (boardnum == 160){
    player = -1;
    isLastPass = false;
    data[15] = 1; data[26] = 1; data[32] = -1; data[33] = 1; data[35] = -1;
    data[36] = -1; data[37] = 1; data[42] = -1; data[43] = -1; data[44] = -1;
    data[45] = 1; data[46] = -1; data[47] = 1; data[48] = 1; data[52] = -1;
    data[53] = -1; data[54] = -1; data[55] = 1; data[56] = -1; data[62] = -1;
    data[63] = -1; data[64] = 1; data[65] = 1; data[67] = -1; data[72] = -1;
    data[73] = -1; data[74] = -1; }




    if (boardnum == 161){
    player = 1;
    isLastPass = false;
    data[13] = -1; data[16] = 1; data[17] = -1; data[18] = -1; data[23] = -1;
    data[24] = -1; data[25] = 1; data[26] = 1; data[27] = 1; data[33] = -1;
    data[34] = 1; data[35] = 1; data[36] = 1; data[37] = 1; data[38] = 1;
    data[42] = -1; data[43] = -1; data[44] = -1; data[45] = 1; data[46] = 1;
    data[47] = 1; data[52] = -1; data[53] = 1; data[54] = 1; data[55] = 1;
    data[56] = 1; data[57] = 1; data[62] = 1; data[63] = 1; data[64] = 1;
    data[65] = 1; data[73] = 1; }




    if (boardnum == 162){
    player = 1;
    isLastPass = false;
    data[16] = 1; data[23] = -1; data[24] = 1; data[25] = 1; data[33] = -1;
    data[34] = -1; data[37] = 1; data[41] = 1; data[42] = 1; data[43] = -1;
    data[44] = -1; data[45] = -1; data[46] = -1; data[47] = -1; data[51] = 1;
    data[52] = 1; data[53] = -1; data[54] = -1; data[55] = -1; data[56] = -1;
    data[61] = 1; data[63] = -1; data[64] = -1; data[65] = -1; data[66] = -1;
    data[73] = -1; }




    if (boardnum == 163){
    player = 1;
    isLastPass = false;
    data[11] = 1; data[13] = 1; data[14] = 1; data[15] = 1; data[16] = -1;
    data[22] = 1; data[23] = 1; data[24] = 1; data[25] = -1; data[26] = -1;
    data[27] = -1; data[31] = 1; data[32] = 1; data[33] = 1; data[34] = -1;
    data[35] = -1; data[36] = -1; data[37] = 1; data[38] = 1; data[42] = -1;
    data[44] = -1; data[45] = -1; data[46] = 1; data[53] = -1; data[54] = -1;
    data[55] = 1; data[56] = -1; data[57] = -1; data[58] = -1; data[62] = -1;
    data[63] = -1; data[64] = -1; data[65] = -1; data[66] = -1; data[71] = -1;
    data[73] = 1; data[75] = -1; data[76] = -1; data[82] = 1; data[86] = -1;
    }




    if (boardnum == 164){
    player = 1;
    isLastPass = false;
    data[13] = 1; data[14] = 1; data[15] = 1; data[16] = 1; data[17] = 1;
    data[18] = 1; data[22] = -1; data[23] = -1; data[24] = 1; data[25] = 1;
    data[26] = 1; data[27] = 1; data[28] = 1; data[31] = -1; data[32] = -1;
    data[33] = -1; data[34] = -1; data[35] = 1; data[36] = 1; data[37] = 1;
    data[42] = -1; data[43] = -1; data[44] = 1; data[45] = 1; data[46] = -1;
    data[47] = -1; data[48] = -1; data[51] = -1; data[52] = -1; data[53] = -1;
    data[54] = 1; data[55] = -1; data[56] = -1; data[57] = -1; data[62] = -1;
    data[63] = -1; data[66] = 1; data[67] = -1; data[68] = 1; data[73] = -1;
    }




    if (boardnum == 165){
    player = -1;
    isLastPass = false;
    data[33] = -1; data[34] = -1; data[35] = -1; data[36] = -1; data[44] = -1;
    data[45] = -1; data[46] = -1; data[52] = 1; data[53] = 1; data[54] = -1;
    data[55] = 1; data[56] = -1; data[57] = 1; data[62] = 1; data[63] = 1;
    data[64] = 1; data[66] = 1; data[67] = -1; data[75] = 1; }




    if (boardnum == 166){
    player = 1;
    isLastPass = false;
    data[14] = 1; data[24] = 1; data[25] = 1; data[32] = -1; data[33] = 1;
    data[34] = 1; data[35] = 1; data[36] = 1; data[37] = 1; data[43] = -1;
    data[44] = -1; data[45] = 1; data[46] = 1; data[52] = 1; data[53] = 1;
    data[54] = -1; data[55] = 1; data[56] = 1; data[57] = 1; data[63] = 1;
    data[64] = -1; data[65] = -1; data[66] = -1; data[67] = -1; data[68] = -1;
    data[72] = 1; data[73] = 1; data[74] = 1; data[75] = -1; data[76] = -1;
    data[77] = -1; data[78] = -1; data[83] = 1; data[84] = -1; data[85] = -1;
    data[86] = -1; data[87] = -1; data[88] = -1; }




    if (boardnum == 167){
    player = 1;
    isLastPass = false;
    data[24] = 1; data[31] = 1; data[33] = 1; data[35] = 1; data[36] = 1;
    data[42] = 1; data[43] = -1; data[44] = -1; data[45] = 1; data[46] = 1;
    data[47] = -1; data[53] = -1; data[54] = 1; data[55] = -1; data[56] = 1;
    data[61] = 1; data[62] = 1; data[63] = 1; data[64] = 1; data[65] = 1;
    data[66] = -1; data[73] = 1; data[77] = -1; data[88] = -1; }




    if (boardnum == 168){
    player = 1;
    isLastPass = false;
    data[14] = 1; data[15] = 1; data[16] = 1; data[23] = -1; data[24] = 1;
    data[33] = -1; data[34] = -1; data[35] = -1; data[36] = -1; data[37] = -1;
    data[38] = -1; data[42] = -1; data[43] = 1; data[44] = -1; data[45] = -1;
    data[46] = -1; data[47] = -1; data[51] = -1; data[53] = -1; data[54] = -1;
    data[55] = -1; data[56] = -1; data[57] = -1; data[62] = 1; data[63] = 1;
    data[64] = -1; }




    if (boardnum == 169){
    player = 1;
    isLastPass = false;
    data[25] = 1; data[33] = -1; data[34] = -1; data[35] = 1; data[36] = -1;
    data[43] = -1; data[44] = 1; data[45] = 1; data[46] = 1; data[53] = -1;
    data[54] = -1; data[55] = 1; data[56] = 1; data[63] = -1; data[64] = -1;
    data[65] = -1; }




    if (boardnum == 170){
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




    if (boardnum == 171){
    player = 1;
    isLastPass = false;
    data[42] = -1; data[44] = -1; data[45] = 1; data[52] = -1; data[53] = -1;
    data[54] = 1; data[55] = 1; data[56] = 1; data[62] = -1; data[63] = -1;
    data[64] = 1; data[65] = 1; data[66] = -1; data[74] = -1; data[75] = -1;
    data[85] = -1; }




    if (boardnum == 172){
    player = 1;
    isLastPass = false;
    data[23] = 1; data[24] = -1; data[32] = -1; data[33] = -1; data[34] = -1;
    data[35] = -1; data[42] = 1; data[43] = 1; data[44] = -1; data[45] = 1;
    data[46] = 1; data[53] = -1; data[54] = -1; data[55] = 1; data[56] = 1;
    data[62] = -1; data[63] = -1; data[64] = 1; }




    if (boardnum == 173){
    player = 1;
    isLastPass = false;
    data[11] = -1; data[15] = 1; data[21] = -1; data[23] = 1; data[24] = 1;
    data[31] = -1; data[32] = 1; data[33] = 1; data[34] = 1; data[35] = 1;
    data[37] = 1; data[41] = -1; data[42] = -1; data[43] = -1; data[44] = -1;
    data[45] = 1; data[46] = 1; data[51] = -1; data[52] = -1; data[53] = -1;
    data[54] = -1; data[55] = 1; data[56] = 1; data[61] = -1; data[62] = 1;
    data[63] = -1; data[64] = -1; data[65] = 1; data[67] = 1; data[71] = -1;
    data[72] = 1; data[74] = -1; }




    if (boardnum == 174){
    player = 1;
    isLastPass = false;
    data[32] = -1; data[33] = 1; data[34] = 1; data[35] = 1; data[42] = -1;
    data[43] = 1; data[44] = 1; data[45] = 1; data[46] = -1; data[52] = -1;
    data[53] = 1; data[54] = 1; data[55] = 1; data[56] = -1; data[64] = -1;
    data[66] = -1; }




    if (boardnum == 175){
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




    if (boardnum == 176){
    player = -1;
    isLastPass = false;
    data[11] = -1; data[12] = 1; data[13] = -1; data[14] = -1; data[15] = -1;
    data[16] = -1; data[17] = -1; data[21] = 1; data[22] = 1; data[23] = 1;
    data[24] = -1; data[25] = -1; data[26] = 1; data[31] = -1; data[32] = 1;
    data[33] = -1; data[34] = 1; data[35] = -1; data[36] = 1; data[43] = 1;
    data[44] = -1; data[45] = 1; data[46] = 1; data[53] = -1; data[54] = 1;
    data[55] = -1; data[56] = 1; data[65] = 1; data[66] = -1; data[74] = 1;
    data[76] = -1; }




    if (boardnum == 177){
    player = 1;
    isLastPass = false;
    data[13] = 1; data[14] = -1; data[15] = -1; data[16] = -1; data[17] = -1;
    data[18] = -1; data[24] = 1; data[25] = -1; data[26] = 1; data[27] = 1;
    data[31] = -1; data[32] = -1; data[33] = -1; data[34] = -1; data[35] = -1;
    data[36] = -1; data[37] = -1; data[42] = -1; data[43] = 1; data[44] = -1;
    data[45] = 1; data[47] = -1; data[51] = -1; data[52] = -1; data[53] = -1;
    data[54] = -1; data[55] = -1; data[56] = -1; data[63] = 1; data[64] = -1;
    data[65] = 1; data[66] = -1; data[67] = -1; data[68] = -1; data[74] = 1;
    data[76] = 1; }




    if (boardnum == 178){
    player = 1;
    isLastPass = false;
    data[11] = -1; data[12] = 1; data[13] = 1; data[14] = 1; data[16] = 1;
    data[21] = -1; data[22] = -1; data[23] = 1; data[24] = 1; data[25] = 1;
    data[32] = -1; data[33] = -1; data[34] = 1; data[35] = -1; data[37] = -1;
    data[43] = -1; data[44] = -1; data[45] = -1; data[46] = -1; data[52] = -1;
    data[53] = -1; data[54] = -1; data[55] = -1; data[56] = -1; data[57] = -1;
    data[61] = -1; data[62] = -1; data[63] = -1; data[64] = -1; data[65] = -1;
    data[73] = -1; data[74] = -1; data[75] = -1; data[76] = -1; data[84] = 1;
    data[87] = -1; }




    if (boardnum == 179){
    player = 1;
    isLastPass = false;
    data[11] = -1; data[12] = -1; data[13] = -1; data[14] = -1; data[15] = -1;
    data[16] = 1; data[21] = -1; data[22] = 1; data[23] = 1; data[24] = 1;
    data[25] = -1; data[31] = 1; data[32] = 1; data[33] = 1; data[34] = 1;
    data[35] = -1; data[37] = -1; data[43] = -1; data[44] = -1; data[45] = -1;
    data[46] = -1; data[52] = -1; data[53] = -1; data[54] = -1; data[55] = -1;
    data[56] = -1; data[57] = -1; data[61] = -1; data[62] = -1; data[63] = -1;
    data[64] = -1; data[65] = -1; data[73] = -1; data[74] = -1; data[75] = -1;
    data[76] = -1; data[84] = 1; data[87] = -1; }




    if (boardnum == 180){
    player = -1;
    isLastPass = false;
    data[33] = 1; data[35] = 1; data[37] = 1; data[44] = 1; data[45] = 1;
    data[46] = 1; data[54] = -1; data[55] = 1; data[56] = -1; data[57] = -1;
    data[63] = -1; data[65] = 1; data[66] = 1; data[67] = -1; data[77] = -1;
    }




    if (boardnum == 181){
    player = -1;
    isLastPass = false;
    data[15] = 1; data[21] = 1; data[23] = 1; data[24] = 1; data[31] = 1;
    data[32] = 1; data[33] = 1; data[34] = 1; data[35] = 1; data[41] = 1;
    data[42] = -1; data[43] = -1; data[44] = -1; data[45] = 1; data[46] = -1;
    data[51] = 1; data[52] = 1; data[53] = 1; data[54] = 1; data[55] = -1;
    data[56] = 1; data[61] = 1; data[62] = 1; data[63] = 1; data[64] = 1;
    data[65] = 1; data[67] = 1; }




    if (boardnum == 182){
    player = 1;
    isLastPass = false;
    data[13] = 1; data[14] = 1; data[15] = 1; data[16] = 1; data[17] = 1;
    data[18] = 1; data[22] = -1; data[23] = -1; data[24] = 1; data[25] = 1;
    data[26] = 1; data[27] = 1; data[28] = 1; data[31] = -1; data[32] = -1;
    data[33] = -1; data[34] = -1; data[35] = 1; data[36] = 1; data[37] = 1;
    data[42] = -1; data[43] = 1; data[44] = -1; data[45] = -1; data[46] = 1;
    data[47] = 1; data[51] = -1; data[52] = -1; data[53] = -1; data[54] = -1;
    data[55] = -1; data[56] = -1; }




    if (boardnum == 183){
    player = 1;
    isLastPass = false;
    data[14] = -1; data[16] = 1; data[23] = -1; data[24] = -1; data[25] = -1;
    data[26] = -1; data[27] = -1; data[33] = -1; data[34] = 1; data[35] = 1;
    data[36] = -1; data[37] = -1; data[38] = -1; data[42] = -1; data[43] = -1;
    data[44] = 1; data[45] = -1; data[46] = 1; data[47] = -1; data[51] = -1;
    data[53] = -1; data[54] = -1; data[55] = -1; data[56] = -1; data[57] = -1;
    data[58] = -1; data[64] = -1; data[65] = -1; data[66] = 1; data[67] = -1;
    data[76] = 1; data[77] = -1; }




    if (boardnum == 184){
    player = -1;
    isLastPass = false;
    data[15] = 1; data[23] = -1; data[24] = 1; data[25] = 1; data[26] = 1;
    data[32] = 1; data[33] = 1; data[34] = -1; data[35] = 1; data[36] = -1;
    data[43] = 1; data[44] = 1; data[45] = -1; data[46] = -1; data[52] = 1;
    data[53] = 1; data[54] = -1; data[55] = -1; data[56] = -1; data[57] = 1;
    data[62] = 1; data[63] = 1; data[64] = 1; data[65] = -1; data[66] = -1;
    data[67] = -1; data[75] = -1; data[76] = -1; data[85] = -1; }




    if (boardnum == 185){
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




    if (boardnum == 186){
    player = 1;
    isLastPass = false;
    data[13] = -1; data[15] = 1; data[23] = -1; data[24] = -1; data[25] = 1;
    data[26] = 1; data[32] = -1; data[33] = -1; data[34] = 1; data[35] = 1;
    data[36] = 1; data[37] = 1; data[42] = -1; data[43] = -1; data[44] = -1;
    data[45] = -1; data[46] = -1; data[47] = 1; data[52] = 1; data[53] = 1;
    data[54] = -1; data[55] = 1; data[56] = -1; data[57] = -1; data[63] = 1;
    data[64] = 1; data[65] = -1; data[66] = -1; data[67] = -1; data[73] = -1;
    data[74] = 1; data[76] = -1; }




    if (boardnum == 187){
    player = 1;
    isLastPass = false;
    data[13] = 1; data[15] = -1; data[18] = -1; data[23] = 1; data[24] = -1;
    data[25] = -1; data[27] = -1; data[32] = 1; data[33] = 1; data[34] = -1;
    data[35] = 1; data[36] = -1; data[37] = -1; data[38] = -1; data[42] = 1;
    data[43] = 1; data[44] = -1; data[45] = -1; data[46] = -1; data[47] = -1;
    data[52] = -1; data[53] = -1; data[54] = -1; data[55] = -1; data[56] = -1;
    data[57] = 1; data[63] = 1; data[64] = 1; data[65] = 1; data[66] = -1;
    data[68] = 1; data[73] = 1; data[74] = 1; data[75] = -1; data[77] = -1;
    data[88] = -1; }




    if (boardnum == 188){
    player = -1;
    isLastPass = false;
    data[11] = -1; data[12] = -1; data[13] = -1; data[14] = -1; data[15] = -1;
    data[16] = -1; data[17] = -1; data[18] = -1; data[22] = -1; data[23] = 1;
    data[24] = -1; data[25] = 1; data[26] = 1; data[27] = 1; data[28] = 1;
    data[31] = 1; data[32] = 1; data[33] = 1; data[34] = 1; data[35] = -1;
    data[36] = -1; data[37] = 1; data[38] = 1; data[41] = -1; data[42] = 1;
    data[43] = 1; data[44] = 1; data[45] = -1; data[46] = 1; data[47] = 1;
    data[48] = 1; data[52] = -1; data[53] = 1; data[54] = 1; data[55] = 1;
    data[56] = 1; data[62] = 1; data[63] = -1; data[64] = 1; data[66] = 1;
    data[67] = 1; data[68] = 1; data[73] = -1; }




    if (boardnum == 189){
    player = -1;
    isLastPass = false;
    data[13] = -1; data[21] = -1; data[23] = -1; data[24] = -1; data[25] = 1;
    data[31] = -1; data[32] = -1; data[33] = 1; data[34] = -1; data[35] = 1;
    data[36] = -1; data[37] = -1; data[41] = -1; data[42] = -1; data[43] = -1;
    data[44] = -1; data[45] = 1; data[46] = -1; data[47] = -1; data[48] = -1;
    data[51] = -1; data[52] = -1; data[53] = 1; data[54] = 1; data[55] = 1;
    data[56] = -1; data[57] = -1; data[62] = -1; data[63] = -1; data[64] = 1;
    data[65] = 1; data[66] = -1; data[67] = -1; data[73] = -1; data[74] = 1;
    data[75] = -1; data[76] = -1; data[78] = -1; data[82] = -1; data[83] = -1;
    data[84] = -1; data[85] = -1; data[86] = -1; }




    if (boardnum == 190){
    player = 1;
    isLastPass = false;
    data[24] = -1; data[25] = 1; data[31] = -1; data[32] = -1; data[33] = -1;
    data[34] = 1; data[35] = 1; data[36] = -1; data[37] = -1; data[41] = 1;
    data[42] = 1; data[43] = 1; data[44] = 1; data[45] = 1; data[46] = 1;
    data[47] = -1; data[52] = 1; data[53] = 1; data[54] = -1; data[55] = 1;
    data[56] = -1; data[62] = 1; data[63] = 1; data[64] = 1; data[65] = -1;
    data[66] = 1; data[73] = 1; data[74] = 1; data[75] = 1; data[84] = 1;
    data[85] = 1; data[86] = 1; }




    if (boardnum == 191){
    player = 1;
    isLastPass = false;
    data[13] = 1; data[14] = 1; data[15] = 1; data[16] = 1; data[23] = -1;
    data[24] = 1; data[25] = 1; data[26] = -1; data[27] = -1; data[31] = -1;
    data[32] = -1; data[33] = 1; data[34] = 1; data[35] = 1; data[36] = -1;
    data[37] = -1; data[42] = -1; data[43] = 1; data[44] = 1; data[45] = 1;
    data[46] = 1; data[47] = 1; data[52] = 1; data[53] = -1; data[54] = -1;
    data[55] = -1; }




    if (boardnum == 192){
    player = -1;
    isLastPass = false;
    data[34] = 1; data[35] = 1; data[42] = 1; data[43] = 1; data[44] = 1;
    data[45] = 1; data[46] = 1; data[47] = 1; data[48] = -1; data[52] = 1;
    data[53] = -1; data[54] = 1; data[55] = -1; data[56] = -1; data[57] = -1;
    data[58] = -1; data[61] = 1; data[62] = 1; data[63] = 1; data[64] = -1;
    data[65] = 1; data[66] = -1; data[67] = -1; data[68] = -1; data[72] = 1;
    data[73] = 1; data[74] = -1; data[76] = 1; data[77] = -1; data[78] = -1;
    data[88] = -1; }




    if (boardnum == 193){
    player = 1;
    isLastPass = false;
    data[12] = -1; data[14] = -1; data[15] = 1; data[16] = 1; data[17] = 1;
    data[18] = 1; data[23] = -1; data[25] = -1; data[26] = -1; data[27] = 1;
    data[28] = 1; data[32] = -1; data[33] = 1; data[34] = 1; data[35] = 1;
    data[36] = -1; data[37] = 1; data[43] = -1; data[44] = 1; data[45] = -1;
    data[46] = -1; data[47] = -1; data[54] = -1; data[55] = 1; data[56] = -1;
    data[57] = -1; data[64] = -1; data[65] = -1; data[66] = 1; data[74] = -1;
    }




    if (boardnum == 194){
    player = -1;
    isLastPass = false;
    data[13] = -1; data[14] = 1; data[15] = 1; data[23] = -1; data[24] = 1;
    data[25] = 1; data[26] = 1; data[27] = 1; data[32] = -1; data[33] = -1;
    data[34] = -1; data[35] = -1; data[36] = 1; data[37] = -1; data[38] = -1;
    data[42] = -1; data[43] = -1; data[44] = -1; data[45] = 1; data[46] = -1;
    data[47] = -1; data[48] = -1; data[52] = 1; data[53] = 1; data[54] = 1;
    data[55] = 1; data[56] = -1; data[57] = -1; data[63] = 1; data[64] = 1;
    data[65] = 1; data[66] = -1; data[67] = -1; data[73] = -1; data[74] = 1;
    data[75] = 1; data[76] = -1; }




    if (boardnum == 195){
    player = -1;
    isLastPass = false;
    data[24] = -1; data[25] = 1; data[26] = 1; data[33] = -1; data[34] = -1;
    data[35] = -1; data[36] = -1; data[37] = -1; data[38] = -1; data[43] = 1;
    data[44] = 1; data[45] = 1; data[46] = -1; data[47] = -1; data[54] = 1;
    data[55] = -1; data[56] = 1; data[57] = -1; data[67] = 1; }




    if (boardnum == 196){
    player = 1;
    isLastPass = false;
    data[11] = 1; data[12] = 1; data[13] = 1; data[14] = 1; data[15] = 1;
    data[16] = 1; data[17] = 1; data[18] = 1; data[21] = -1; data[22] = -1;
    data[23] = 1; data[24] = -1; data[25] = -1; data[26] = 1; data[27] = -1;
    data[28] = 1; data[31] = 1; data[32] = -1; data[33] = 1; data[34] = -1;
    data[35] = 1; data[36] = -1; data[37] = -1; data[38] = 1; data[42] = -1;
    data[43] = -1; data[44] = 1; data[45] = -1; data[46] = -1; data[52] = -1;
    data[53] = -1; data[54] = -1; data[55] = -1; data[62] = -1; data[63] = -1;
    data[64] = -1; data[65] = -1; data[66] = 1; data[73] = -1; data[77] = 1;
    data[82] = -1; data[88] = 1; }




    if (boardnum == 197){
    player = 1;
    isLastPass = false;
    data[23] = -1; data[24] = -1; data[25] = 1; data[26] = 1; data[32] = 1;
    data[33] = 1; data[34] = -1; data[35] = 1; data[36] = -1; data[43] = 1;
    data[44] = 1; data[45] = -1; data[46] = -1; data[52] = 1; data[53] = 1;
    data[54] = -1; data[55] = -1; data[56] = -1; data[57] = 1; data[62] = 1;
    data[63] = 1; data[64] = 1; data[65] = -1; data[66] = -1; data[67] = -1;
    data[75] = -1; data[76] = -1; data[85] = -1; }




    if (boardnum == 198){
    player = 1;
    isLastPass = false;
    data[13] = -1; data[16] = 1; data[23] = -1; data[24] = -1; data[25] = 1;
    data[26] = 1; data[32] = 1; data[33] = -1; data[34] = 1; data[35] = 1;
    data[36] = 1; data[37] = -1; data[38] = -1; data[42] = -1; data[43] = -1;
    data[44] = -1; data[45] = 1; data[46] = 1; data[47] = -1; data[48] = -1;
    data[54] = -1; data[55] = -1; data[56] = -1; data[57] = 1; data[58] = 1;
    data[65] = -1; }




    if (boardnum == 199){
    player = -1;
    isLastPass = false;
    data[13] = -1; data[22] = 1; data[23] = -1; data[24] = -1; data[32] = -1;
    data[33] = 1; data[34] = -1; data[36] = -1; data[43] = 1; data[44] = 1;
    data[45] = -1; data[46] = -1; data[47] = -1; data[48] = -1; data[52] = -1;
    data[53] = 1; data[54] = 1; data[55] = 1; data[56] = 1; data[63] = 1;
    data[64] = 1; data[66] = 1; data[72] = -1; data[73] = 1; data[74] = 1;
    }




    if (boardnum == 200){
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


  }
}
