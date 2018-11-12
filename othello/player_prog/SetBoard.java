import java.util.*;
import java.util.Scanner;

public class SetBoard {
  final static int SIZE = 100;

  int data[] = new int[SIZE];
  int player;
  int black;
  int white;
  boolean isLastPass;

  public SetBoard(){}

  public void set(int boardnum, GameState state){
    boarddata(boardnum);
    state.player = this.player;
    state.isLastPass = this.isLastPass;
    for (int i = 11; i < SIZE; i++){
      state.data[i] = this.data[i];
      if (this.data[i] == 1) black++;
      else if (this.data[i] == -1) white++;
    }
  }

  public void boarddata(int boardnum){

    //------
    //gamecount : 1
    //b_cpu : hyoukaCPU@50cbc42f
    //w_cpu : mcCPU@75412c2f
    //turn : 45
    //------
    //Loop Start !
    //|●|●|●|●|○|○|○|●|
    //|●|○|○|○|○|○|○|○|
    //| |●|○|●|○|●|●|●|
    //| |○|●|○|●|●|●|●|
    //| |●|○|●|○|●|●|○|
    //|●| |●|○|●|●|●| |
    //| | |●|○| |●|●| |
    //| | |●| | | | |●|
    //TURN = 45
    //PLAYER = -1
    //DISC = 30 : 19

      if (boardnum == 1){
    player = -1;
    isLastPass = false;
    data[11] = 1; data[12] = 1; data[13] = 1; data[14] = 1; data[15] = -1;
    data[16] = -1; data[17] = -1; data[18] = 1; data[21] = 1; data[22] = -1;
    data[23] = -1; data[24] = -1; data[25] = -1; data[26] = -1; data[27] = -1;
    data[28] = -1; data[32] = 1; data[33] = -1; data[34] = 1; data[35] = -1;
    data[36] = 1; data[37] = 1; data[38] = 1; data[42] = -1; data[43] = 1;
    data[44] = -1; data[45] = 1; data[46] = 1; data[47] = 1; data[48] = 1;
    data[52] = 1; data[53] = -1; data[54] = 1; data[55] = -1; data[56] = 1;
    data[57] = 1; data[58] = -1; data[61] = 1; data[63] = 1; data[64] = -1;
    data[65] = 1; data[66] = 1; data[67] = 1; data[73] = 1; data[74] = -1;
    data[76] = 1; data[77] = 1; data[83] = 1; data[88] = 1; }


    //------
    //gamecount : 2
    //b_cpu : AlphaBetaPlayer@61dc03ce
    //w_cpu : MctEPTCPU@50f8360d
    //turn : 26
    //------
    //Loop Start !
    //|●| |○|○|●| | | |
    //|●|●|○|○|○| | | |
    //| |○|●|○|○|○| | |
    //|○|○|●|●|●|●| | |
    //| | |○|●|○|●| | |
    //| |○|○|●|●|○| | |
    //| | | |●| | | | |
    //| | | | | | | | |
    //TURN = 26
    //PLAYER = 1
    //DISC = 14 : 16

      if (boardnum == 2){
    player = 1;
    isLastPass = false;
    data[11] = 1; data[13] = -1; data[14] = -1; data[15] = 1; data[21] = 1;
    data[22] = 1; data[23] = -1; data[24] = -1; data[25] = -1; data[32] = -1;
    data[33] = 1; data[34] = -1; data[35] = -1; data[36] = -1; data[41] = -1;
    data[42] = -1; data[43] = 1; data[44] = 1; data[45] = 1; data[46] = 1;
    data[53] = -1; data[54] = 1; data[55] = -1; data[56] = 1; data[62] = -1;
    data[63] = -1; data[64] = 1; data[65] = 1; data[66] = -1; data[74] = 1;
    }


    //------
    //gamecount : 3
    //b_cpu : AlphaBetaPlayer@153f5a29
    //w_cpu : mctCPU@7f560810
    //turn : 39
    //------
    //Loop Start !
    //| |○|○|○|○|○| | |
    //| | |○|●|●|○| | |
    //| | |○|○|●|○|○| |
    //|○|○|○|●|●|●|○|○|
    //|○|○|○|○|○|●|○|○|
    //|○|○|○|○|○|○|●| |
    //| | |○|○|○|○| | |
    //| | |○| | |○| | |
    //TURN = 39
    //PLAYER = -1
    //DISC = 8 : 35

      if (boardnum == 3){
    player = -1;
    isLastPass = false;
    data[12] = -1; data[13] = -1; data[14] = -1; data[15] = -1; data[16] = -1;
    data[23] = -1; data[24] = 1; data[25] = 1; data[26] = -1; data[33] = -1;
    data[34] = -1; data[35] = 1; data[36] = -1; data[37] = -1; data[41] = -1;
    data[42] = -1; data[43] = -1; data[44] = 1; data[45] = 1; data[46] = 1;
    data[47] = -1; data[48] = -1; data[51] = -1; data[52] = -1; data[53] = -1;
    data[54] = -1; data[55] = -1; data[56] = 1; data[57] = -1; data[58] = -1;
    data[61] = -1; data[62] = -1; data[63] = -1; data[64] = -1; data[65] = -1;
    data[66] = -1; data[67] = 1; data[73] = -1; data[74] = -1; data[75] = -1;
    data[76] = -1; data[83] = -1; data[86] = -1; }


    //------
    //gamecount : 4
    //b_cpu : mctCPU@69d9c55
    //w_cpu : hyoukaCPU@13a57a3b
    //turn : 40
    //------
    //Loop Start !
    //| | |●|●|●|●| | |
    //|○| |●|●|○|●| | |
    //|●|○|●|○|●|○| |○|
    //| | |○|○|○|●|○| |
    //|●| |●|○|○|○|●| |
    //|●|●|○|○|○|○|●| |
    //|●|●|●| |●|●| | |
    //|●|●|●|●|●| | | |
    //TURN = 40
    //PLAYER = 1
    //DISC = 27 : 17

      if (boardnum == 4){
    player = 1;
    isLastPass = false;
    data[13] = 1; data[14] = 1; data[15] = 1; data[16] = 1; data[21] = -1;
    data[23] = 1; data[24] = 1; data[25] = -1; data[26] = 1; data[31] = 1;
    data[32] = -1; data[33] = 1; data[34] = -1; data[35] = 1; data[36] = -1;
    data[38] = -1; data[43] = -1; data[44] = -1; data[45] = -1; data[46] = 1;
    data[47] = -1; data[51] = 1; data[53] = 1; data[54] = -1; data[55] = -1;
    data[56] = -1; data[57] = 1; data[61] = 1; data[62] = 1; data[63] = -1;
    data[64] = -1; data[65] = -1; data[66] = -1; data[67] = 1; data[71] = 1;
    data[72] = 1; data[73] = 1; data[75] = 1; data[76] = 1; data[81] = 1;
    data[82] = 1; data[83] = 1; data[84] = 1; data[85] = 1; }


    //------
    //gamecount : 5
    //b_cpu : mcCPU@7ca48474
    //w_cpu : mcCPU@337d0578
    //turn : 8
    //------
    //Loop Start !
    //| | | | | | | | |
    //| | | | |○|●| | |
    //| | |●| | |●| | |
    //| | |○|○|○|●|○| |
    //| | | |●|●|●| | |
    //| | | | | | | | |
    //| | | | | | | | |
    //| | | | | | | | |
    //TURN = 8
    //PLAYER = 1
    //DISC = 7 : 5

      if (boardnum == 5){
    player = 1;
    isLastPass = false;
    data[25] = -1; data[26] = 1; data[33] = 1; data[36] = 1; data[43] = -1;
    data[44] = -1; data[45] = -1; data[46] = 1; data[47] = -1; data[54] = 1;
    data[55] = 1; data[56] = 1; }


    //------
    //gamecount : 6
    //b_cpu : AlphaBetaPlayer@59e84876
    //w_cpu : AlphaBetaPlayer@61a485d2
    //turn : 38
    //------
    //Loop Start !
    //| |○|○|○|○| | | |
    //| | |○|●|●|●| | |
    //| |○|●|●|●|●| | |
    //| |○|○|●|●|●|●| |
    //| |○|●|○|●|●|○|○|
    //| |○|●|○|●|○|○| |
    //| |○|●|●|●|●| | |
    //| | |●|●|●|●|●| |
    //TURN = 38
    //PLAYER = 1
    //DISC = 25 : 17

      if (boardnum == 6){
    player = 1;
    isLastPass = false;
    data[12] = -1; data[13] = -1; data[14] = -1; data[15] = -1; data[23] = -1;
    data[24] = 1; data[25] = 1; data[26] = 1; data[32] = -1; data[33] = 1;
    data[34] = 1; data[35] = 1; data[36] = 1; data[42] = -1; data[43] = -1;
    data[44] = 1; data[45] = 1; data[46] = 1; data[47] = 1; data[52] = -1;
    data[53] = 1; data[54] = -1; data[55] = 1; data[56] = 1; data[57] = -1;
    data[58] = -1; data[62] = -1; data[63] = 1; data[64] = -1; data[65] = 1;
    data[66] = -1; data[67] = -1; data[72] = -1; data[73] = 1; data[74] = 1;
    data[75] = 1; data[76] = 1; data[83] = 1; data[84] = 1; data[85] = 1;
    data[86] = 1; data[87] = 1; }


    //------
    //gamecount : 7
    //b_cpu : mcCPU@39fb3ab6
    //w_cpu : MctEPTCPU@6276ae34
    //turn : 49
    //------
    //Loop Start !
    //|●|●| |●| | | | |
    //|●|●|●|●|●| | | |
    //|●|○|●|●|●|●| | |
    //|●|●|○|○|●|●| |○|
    //|●|●|●|●|●|●|●|○|
    //|●|●|○|●|○|○|●|○|
    //|●|●|●|●|○|●|●|○|
    //|○|○|○|○|●|●|●|○|
    //TURN = 49
    //PLAYER = -1
    //DISC = 37 : 16

      if (boardnum == 7){
    player = -1;
    isLastPass = false;
    data[11] = 1; data[12] = 1; data[14] = 1; data[21] = 1; data[22] = 1;
    data[23] = 1; data[24] = 1; data[25] = 1; data[31] = 1; data[32] = -1;
    data[33] = 1; data[34] = 1; data[35] = 1; data[36] = 1; data[41] = 1;
    data[42] = 1; data[43] = -1; data[44] = -1; data[45] = 1; data[46] = 1;
    data[48] = -1; data[51] = 1; data[52] = 1; data[53] = 1; data[54] = 1;
    data[55] = 1; data[56] = 1; data[57] = 1; data[58] = -1; data[61] = 1;
    data[62] = 1; data[63] = -1; data[64] = 1; data[65] = -1; data[66] = -1;
    data[67] = 1; data[68] = -1; data[71] = 1; data[72] = 1; data[73] = 1;
    data[74] = 1; data[75] = -1; data[76] = 1; data[77] = 1; data[78] = -1;
    data[81] = -1; data[82] = -1; data[83] = -1; data[84] = -1; data[85] = 1;
    data[86] = 1; data[87] = 1; data[88] = -1; }


    //------
    //gamecount : 8
    //b_cpu : mctCPU@7946e1f4
    //w_cpu : AlphaBetaPlayer@3c09711b
    //turn : 34
    //------
    //Loop Start !
    //|○| | | |○|○|○| |
    //| |○|●|●|●|○|●| |
    //| |●|●|●|○|●| | |
    //| | |●|●|○|●|●|●|
    //| | |●|●|○|○|○| |
    //| |●|●|●|●| |○| |
    //| | |●|●|●|●| | |
    //| | | |●|●|●| | |
    //TURN = 34
    //PLAYER = 1
    //DISC = 26 : 12

      if (boardnum == 8){
    player = 1;
    isLastPass = false;
    data[11] = -1; data[15] = -1; data[16] = -1; data[17] = -1; data[22] = -1;
    data[23] = 1; data[24] = 1; data[25] = 1; data[26] = -1; data[27] = 1;
    data[32] = 1; data[33] = 1; data[34] = 1; data[35] = -1; data[36] = 1;
    data[43] = 1; data[44] = 1; data[45] = -1; data[46] = 1; data[47] = 1;
    data[48] = 1; data[53] = 1; data[54] = 1; data[55] = -1; data[56] = -1;
    data[57] = -1; data[62] = 1; data[63] = 1; data[64] = 1; data[65] = 1;
    data[67] = -1; data[73] = 1; data[74] = 1; data[75] = 1; data[76] = 1;
    data[84] = 1; data[85] = 1; data[86] = 1; }


    //------
    //gamecount : 9
    //b_cpu : hyoukaCPU@5cc7c2a6
    //w_cpu : hyoukaCPU@b97c004
    //turn : 54
    //------
    //Loop Start !
    //|●|●|●|●|●|●|○| |
    //|●| |●|●|●|○| | |
    //|●|●|○|●|○|●|●|●|
    //|●|●|●|●|●|○|●| |
    //|●|●|●|●|○|●|●|●|
    //|●|●|●|○|○|●|●|●|
    //|●|●|○|○|○|○| |●|
    //|●|●|●|●|●|●|●|●|
    //TURN = 54
    //PLAYER = 1
    //DISC = 46 : 12

      if (boardnum == 9){
    player = 1;
    isLastPass = false;
    data[11] = 1; data[12] = 1; data[13] = 1; data[14] = 1; data[15] = 1;
    data[16] = 1; data[17] = -1; data[21] = 1; data[23] = 1; data[24] = 1;
    data[25] = 1; data[26] = -1; data[31] = 1; data[32] = 1; data[33] = -1;
    data[34] = 1; data[35] = -1; data[36] = 1; data[37] = 1; data[38] = 1;
    data[41] = 1; data[42] = 1; data[43] = 1; data[44] = 1; data[45] = 1;
    data[46] = -1; data[47] = 1; data[51] = 1; data[52] = 1; data[53] = 1;
    data[54] = 1; data[55] = -1; data[56] = 1; data[57] = 1; data[58] = 1;
    data[61] = 1; data[62] = 1; data[63] = 1; data[64] = -1; data[65] = -1;
    data[66] = 1; data[67] = 1; data[68] = 1; data[71] = 1; data[72] = 1;
    data[73] = -1; data[74] = -1; data[75] = -1; data[76] = -1; data[78] = 1;
    data[81] = 1; data[82] = 1; data[83] = 1; data[84] = 1; data[85] = 1;
    data[86] = 1; data[87] = 1; data[88] = 1; }


    //------
    //gamecount : 10
    //b_cpu : mcCPU@4590c9c3
    //w_cpu : MctEPTCPU@32e6e9c3
    //turn : 41
    //------
    //Loop Start !
    //|○|○|○|○|○|○|○|○|
    //|○|○|●|●|●|○|○|○|
    //|○|○|●|●|●|○|○|○|
    //|○|●|○|○|●|●|○| |
    //|○|○|○|○|○|●|○|○|
    //|○|●|●|●| | |●| |
    //| |●| | | | | | |
    //| | | | | | | | |
    //TURN = 41
    //PLAYER = -1
    //DISC = 15 : 30

      if (boardnum == 10){
    player = -1;
    isLastPass = false;
    data[11] = -1; data[12] = -1; data[13] = -1; data[14] = -1; data[15] = -1;
    data[16] = -1; data[17] = -1; data[18] = -1; data[21] = -1; data[22] = -1;
    data[23] = 1; data[24] = 1; data[25] = 1; data[26] = -1; data[27] = -1;
    data[28] = -1; data[31] = -1; data[32] = -1; data[33] = 1; data[34] = 1;
    data[35] = 1; data[36] = -1; data[37] = -1; data[38] = -1; data[41] = -1;
    data[42] = 1; data[43] = -1; data[44] = -1; data[45] = 1; data[46] = 1;
    data[47] = -1; data[51] = -1; data[52] = -1; data[53] = -1; data[54] = -1;
    data[55] = -1; data[56] = 1; data[57] = -1; data[58] = -1; data[61] = -1;
    data[62] = 1; data[63] = 1; data[64] = 1; data[67] = 1; data[72] = 1;
    }


    //------
    //gamecount : 11
    //b_cpu : AlphaBetaPlayer@5056dfcb
    //w_cpu : AlphaBetaPlayer@6574b225
    //turn : 37
    //------
    //Loop Start !
    //| |●|●|●|●|●|●| |
    //| | |●|●|●|●| | |
    //| | |○|●|●|●|○|○|
    //| |○|○|●|●|○|○| |
    //| |○|○|●|●|○|○| |
    //|○|○|○|●|○|○|○| |
    //| | |○|●|●|○| | |
    //| | |○|●| | | | |
    //TURN = 37
    //PLAYER = -1
    //DISC = 21 : 20

      if (boardnum == 11){
    player = -1;
    isLastPass = false;
    data[12] = 1; data[13] = 1; data[14] = 1; data[15] = 1; data[16] = 1;
    data[17] = 1; data[23] = 1; data[24] = 1; data[25] = 1; data[26] = 1;
    data[33] = -1; data[34] = 1; data[35] = 1; data[36] = 1; data[37] = -1;
    data[38] = -1; data[42] = -1; data[43] = -1; data[44] = 1; data[45] = 1;
    data[46] = -1; data[47] = -1; data[52] = -1; data[53] = -1; data[54] = 1;
    data[55] = 1; data[56] = -1; data[57] = -1; data[61] = -1; data[62] = -1;
    data[63] = -1; data[64] = 1; data[65] = -1; data[66] = -1; data[67] = -1;
    data[73] = -1; data[74] = 1; data[75] = 1; data[76] = -1; data[83] = -1;
    data[84] = 1; }


    //------
    //gamecount : 12
    //b_cpu : MctPBiasCPU@2344fc66
    //w_cpu : mctCPU@458ad742
    //turn : 6
    //------
    //Loop Start !
    //| | | | | | | | |
    //| | | | | | | | |
    //| | |●|○| | | | |
    //| | | |○|●| | | |
    //| | | |○|●| | | |
    //| | | |○|●|●|●| |
    //| | | | | | | | |
    //| | | | | | | | |
    //TURN = 6
    //PLAYER = 1
    //DISC = 6 : 4

      if (boardnum == 12){
    player = 1;
    isLastPass = false;
    data[33] = 1; data[34] = -1; data[44] = -1; data[45] = 1; data[54] = -1;
    data[55] = 1; data[64] = -1; data[65] = 1; data[66] = 1; data[67] = 1;
    }


    //------
    //gamecount : 13
    //b_cpu : AlphaBetaPlayer@5afa04c
    //w_cpu : MctEPTCPU@6ea12c19
    //turn : 34
    //------
    //Loop Start !
    //| | |○| |○|●| | |
    //|○| |○|○|○|○|○| |
    //|○|○|○|○|○|○|○| |
    //|○|○|○|○|○|●|○| |
    //|○|○|○|○|○|●| | |
    //| |○|○|○| | | | |
    //| | |○|○|○| | | |
    //| | |○|○| |○| | |
    //TURN = 34
    //PLAYER = 1
    //DISC = 3 : 35

      if (boardnum == 13){
    player = 1;
    isLastPass = false;
    data[13] = -1; data[15] = -1; data[16] = 1; data[21] = -1; data[23] = -1;
    data[24] = -1; data[25] = -1; data[26] = -1; data[27] = -1; data[31] = -1;
    data[32] = -1; data[33] = -1; data[34] = -1; data[35] = -1; data[36] = -1;
    data[37] = -1; data[41] = -1; data[42] = -1; data[43] = -1; data[44] = -1;
    data[45] = -1; data[46] = 1; data[47] = -1; data[51] = -1; data[52] = -1;
    data[53] = -1; data[54] = -1; data[55] = -1; data[56] = 1; data[62] = -1;
    data[63] = -1; data[64] = -1; data[73] = -1; data[74] = -1; data[75] = -1;
    data[83] = -1; data[84] = -1; data[86] = -1; }


    //------
    //gamecount : 14
    //b_cpu : mctCPU@6a024a67
    //w_cpu : hyoukaCPU@7921b0a2
    //turn : 13
    //------
    //Loop Start !
    //| |○|○|○| | | | |
    //| | |●| | | | | |
    //|○|○|●| | | | | |
    //| | |●|○|●| | | |
    //| |●|●|●|○| | | |
    //| | | | |●|●|●| |
    //| | | | | | | | |
    //| | | | | | | | |
    //TURN = 13
    //PLAYER = -1
    //DISC = 10 : 7

      if (boardnum == 14){
    player = -1;
    isLastPass = false;
    data[12] = -1; data[13] = -1; data[14] = -1; data[23] = 1; data[31] = -1;
    data[32] = -1; data[33] = 1; data[43] = 1; data[44] = -1; data[45] = 1;
    data[52] = 1; data[53] = 1; data[54] = 1; data[55] = -1; data[65] = 1;
    data[66] = 1; data[67] = 1; }


    //------
    //gamecount : 15
    //b_cpu : MctEPTCPU@174d20a
    //w_cpu : hyoukaCPU@66d2e7d9
    //turn : 1
    //------
    //Loop Start !
    //| | | | | | | | |
    //| | | | | | | | |
    //| | | | | | | | |
    //| | | |○|●| | | |
    //| | | |●|●|●| | |
    //| | | | | | | | |
    //| | | | | | | | |
    //| | | | | | | | |
    //TURN = 1
    //PLAYER = -1
    //DISC = 4 : 1

      if (boardnum == 15){
    player = -1;
    isLastPass = false;
    data[44] = -1; data[45] = 1; data[54] = 1; data[55] = 1; data[56] = 1;
    }


    //------
    //gamecount : 16
    //b_cpu : RandomCPU@6a2bcfcb
    //w_cpu : mctCPU@4de8b406
    //turn : 45
    //------
    //Loop Start !
    //| | | | |○| |●| |
    //| | |●|○|○| |●|●|
    //|○|○|○|○|○| |●| |
    //|○|○|○|○|○|●|○|○|
    //|○|○|●|○|●|○|○|○|
    //|○|○|○|○|○|●|○|○|
    //| | |●|●|○|○|○|○|
    //| | |●|○|○|○|○|○|
    //TURN = 45
    //PLAYER = -1
    //DISC = 12 : 37

      if (boardnum == 16){
    player = -1;
    isLastPass = false;
    data[15] = -1; data[17] = 1; data[23] = 1; data[24] = -1; data[25] = -1;
    data[27] = 1; data[28] = 1; data[31] = -1; data[32] = -1; data[33] = -1;
    data[34] = -1; data[35] = -1; data[37] = 1; data[41] = -1; data[42] = -1;
    data[43] = -1; data[44] = -1; data[45] = -1; data[46] = 1; data[47] = -1;
    data[48] = -1; data[51] = -1; data[52] = -1; data[53] = 1; data[54] = -1;
    data[55] = 1; data[56] = -1; data[57] = -1; data[58] = -1; data[61] = -1;
    data[62] = -1; data[63] = -1; data[64] = -1; data[65] = -1; data[66] = 1;
    data[67] = -1; data[68] = -1; data[73] = 1; data[74] = 1; data[75] = -1;
    data[76] = -1; data[77] = -1; data[78] = -1; data[83] = 1; data[84] = -1;
    data[85] = -1; data[86] = -1; data[87] = -1; data[88] = -1; }


    //------
    //gamecount : 17
    //b_cpu : hyoukaCPU@3c756e4d
    //w_cpu : mcCPU@7c0e2abd
    //turn : 23
    //------
    //Loop Start !
    //| | | |○| | | | |
    //| | | | |○|○| |○|
    //| |●|●|●|○|○|○| |
    //| | | |●|●|○| |●|
    //| |○|○|●|○|●|●| |
    //| | |○|○|●|●| | |
    //| | |○|●| |●| | |
    //| | | | | | | | |
    //TURN = 23
    //PLAYER = -1
    //DISC = 13 : 14

      if (boardnum == 17){
    player = -1;
    isLastPass = false;
    data[14] = -1; data[25] = -1; data[26] = -1; data[28] = -1; data[32] = 1;
    data[33] = 1; data[34] = 1; data[35] = -1; data[36] = -1; data[37] = -1;
    data[44] = 1; data[45] = 1; data[46] = -1; data[48] = 1; data[52] = -1;
    data[53] = -1; data[54] = 1; data[55] = -1; data[56] = 1; data[57] = 1;
    data[63] = -1; data[64] = -1; data[65] = 1; data[66] = 1; data[73] = -1;
    data[74] = 1; data[76] = 1; }


    //------
    //gamecount : 18
    //b_cpu : hyoukaCPU@48eff760
    //w_cpu : mcCPU@402f32ff
    //turn : 55
    //------
    //Loop Start !
    //|●|●|●|●|●|●|●| |
    //|●|●|●|●|●|●| |●|
    //|●|●|○|○|●|○|●|●|
    //|●|○|○|○|○|●|○|●|
    //|●|○|●|○|○|○|●|●|
    //|●|○|○|●|○|○|●|●|
    //|●|○|○|○|●|○|○| |
    //|●| |●|●|●|●| |○|
    //TURN = 55
    //PLAYER = -1
    //DISC = 37 : 22

      if (boardnum == 18){
    player = -1;
    isLastPass = false;
    data[11] = 1; data[12] = 1; data[13] = 1; data[14] = 1; data[15] = 1;
    data[16] = 1; data[17] = 1; data[21] = 1; data[22] = 1; data[23] = 1;
    data[24] = 1; data[25] = 1; data[26] = 1; data[28] = 1; data[31] = 1;
    data[32] = 1; data[33] = -1; data[34] = -1; data[35] = 1; data[36] = -1;
    data[37] = 1; data[38] = 1; data[41] = 1; data[42] = -1; data[43] = -1;
    data[44] = -1; data[45] = -1; data[46] = 1; data[47] = -1; data[48] = 1;
    data[51] = 1; data[52] = -1; data[53] = 1; data[54] = -1; data[55] = -1;
    data[56] = -1; data[57] = 1; data[58] = 1; data[61] = 1; data[62] = -1;
    data[63] = -1; data[64] = 1; data[65] = -1; data[66] = -1; data[67] = 1;
    data[68] = 1; data[71] = 1; data[72] = -1; data[73] = -1; data[74] = -1;
    data[75] = 1; data[76] = -1; data[77] = -1; data[81] = 1; data[83] = 1;
    data[84] = 1; data[85] = 1; data[86] = 1; data[88] = -1; }


    //------
    //gamecount : 19
    //b_cpu : AlphaBetaPlayer@573f2bb1
    //w_cpu : AlphaBetaPlayer@5ae9a829
    //turn : 7
    //------
    //Loop Start !
    //| | | | | | | | |
    //| | | | | | | | |
    //| | | |●|○| | | |
    //| | | |○|●|●| | |
    //| | |○|○|●|●| | |
    //| | |○|●| | | | |
    //| | | | | | | | |
    //| | | | | | | | |
    //TURN = 7
    //PLAYER = -1
    //DISC = 6 : 5

      if (boardnum == 19){
    player = -1;
    isLastPass = false;
    data[34] = 1; data[35] = -1; data[44] = -1; data[45] = 1; data[46] = 1;
    data[53] = -1; data[54] = -1; data[55] = 1; data[56] = 1; data[63] = -1;
    data[64] = 1; }


    //------
    //gamecount : 20
    //b_cpu : RandomCPU@6d8a00e3
    //w_cpu : mctCPU@548b7f67
    //turn : 34
    //------
    //Loop Start !
    //|○| | |○|○|●| | |
    //| |○|○| |○|○|●|●|
    //| | |○|●|○|●|○|○|
    //| | |○|○|●|●| |○|
    //| | |●|○|○|●| | |
    //| |●|○| |○|○|●|○|
    //| | | | | |○| |○|
    //| | | |○|○|○|○|○|
    //TURN = 34
    //PLAYER = 1
    //DISC = 11 : 27

      if (boardnum == 20){
    player = 1;
    isLastPass = false;
    data[11] = -1; data[14] = -1; data[15] = -1; data[16] = 1; data[22] = -1;
    data[23] = -1; data[25] = -1; data[26] = -1; data[27] = 1; data[28] = 1;
    data[33] = -1; data[34] = 1; data[35] = -1; data[36] = 1; data[37] = -1;
    data[38] = -1; data[43] = -1; data[44] = -1; data[45] = 1; data[46] = 1;
    data[48] = -1; data[53] = 1; data[54] = -1; data[55] = -1; data[56] = 1;
    data[62] = 1; data[63] = -1; data[65] = -1; data[66] = -1; data[67] = 1;
    data[68] = -1; data[76] = -1; data[78] = -1; data[84] = -1; data[85] = -1;
    data[86] = -1; data[87] = -1; data[88] = -1; }


    //------
    //gamecount : 21
    //b_cpu : AlphaBetaPlayer@7ac7a4e4
    //w_cpu : mcCPU@6d78f375
    //turn : 35
    //------
    //Loop Start !
    //|●|●|●|●|●| | | |
    //|●|●|●|●|○|○|○| |
    //|●|●|●|●|●|○|○|●|
    //| |○|●|○|○|●|○| |
    //|○|○|●|○|○|○|○| |
    //|●| |●| | | |○|●|
    //| | | | | | | | |
    //| | | | | | | | |
    //TURN = 33
    //PLAYER = -1
    //DISC = 21 : 16

      if (boardnum == 21){
    player = -1;
    isLastPass = false;
    data[11] = 1; data[12] = 1; data[13] = 1; data[14] = 1; data[15] = 1;
    data[21] = 1; data[22] = 1; data[23] = 1; data[24] = 1; data[25] = -1;
    data[26] = -1; data[27] = -1; data[31] = 1; data[32] = 1; data[33] = 1;
    data[34] = 1; data[35] = 1; data[36] = -1; data[37] = -1; data[38] = 1;
    data[42] = -1; data[43] = 1; data[44] = -1; data[45] = -1; data[46] = 1;
    data[47] = -1; data[51] = -1; data[52] = -1; data[53] = 1; data[54] = -1;
    data[55] = -1; data[56] = -1; data[57] = -1; data[61] = 1; data[63] = 1;
    data[67] = -1; data[68] = 1; }


    //------
    //gamecount : 22
    //b_cpu : mctCPU@50c87b21
    //w_cpu : MctPBiasCPU@5f375618
    //turn : 47
    //------
    //Loop Start !
    //|○| |○| | | | | |
    //| |○|○| |○|●| |●|
    //| |○|○|○|○|●|●|●|
    //|●|○|○|●|●|●|●|●|
    //|●|●|●|●|●|●|●|●|
    //|●|●|●|●|○|○|●|●|
    //| |●|○|○|○|○|○|●|
    //|●| |○| |●|●|○|●|
    //TURN = 47
    //PLAYER = -1
    //DISC = 31 : 20

      if (boardnum == 22){
    player = -1;
    isLastPass = false;
    data[11] = -1; data[13] = -1; data[22] = -1; data[23] = -1; data[25] = -1;
    data[26] = 1; data[28] = 1; data[32] = -1; data[33] = -1; data[34] = -1;
    data[35] = -1; data[36] = 1; data[37] = 1; data[38] = 1; data[41] = 1;
    data[42] = -1; data[43] = -1; data[44] = 1; data[45] = 1; data[46] = 1;
    data[47] = 1; data[48] = 1; data[51] = 1; data[52] = 1; data[53] = 1;
    data[54] = 1; data[55] = 1; data[56] = 1; data[57] = 1; data[58] = 1;
    data[61] = 1; data[62] = 1; data[63] = 1; data[64] = 1; data[65] = -1;
    data[66] = -1; data[67] = 1; data[68] = 1; data[72] = 1; data[73] = -1;
    data[74] = -1; data[75] = -1; data[76] = -1; data[77] = -1; data[78] = 1;
    data[81] = 1; data[83] = -1; data[85] = 1; data[86] = 1; data[87] = -1;
    data[88] = 1; }


    //------
    //gamecount : 23
    //b_cpu : MctPBiasCPU@1810399e
    //w_cpu : MctPBiasCPU@32d992b2
    //turn : 35
    //------
    //Loop Start !
    //|●| | |●|○| | | |
    //|●|●|●|●| |○| | |
    //|●|●|●|●|○|○| | |
    //| |●|○|●|○|○| |●|
    //| |○|○|●|○|○|○| |
    //| |○|○|●|○|○|○|○|
    //| | |○| |●|●|●| |
    //| | | |○|●| | | |
    //TURN = 35
    //PLAYER = -1
    //DISC = 19 : 20

      if (boardnum == 23){
    player = -1;
    isLastPass = false;
    data[11] = 1; data[14] = 1; data[15] = -1; data[21] = 1; data[22] = 1;
    data[23] = 1; data[24] = 1; data[26] = -1; data[31] = 1; data[32] = 1;
    data[33] = 1; data[34] = 1; data[35] = -1; data[36] = -1; data[42] = 1;
    data[43] = -1; data[44] = 1; data[45] = -1; data[46] = -1; data[48] = 1;
    data[52] = -1; data[53] = -1; data[54] = 1; data[55] = -1; data[56] = -1;
    data[57] = -1; data[62] = -1; data[63] = -1; data[64] = 1; data[65] = -1;
    data[66] = -1; data[67] = -1; data[68] = -1; data[73] = -1; data[75] = 1;
    data[76] = 1; data[77] = 1; data[84] = -1; data[85] = 1; }


    //------
    //gamecount : 24
    //b_cpu : MctPBiasCPU@215be6bb
    //w_cpu : mctCPU@4439f31e
    //turn : 41
    //------
    //Loop Start !
    //| | | | | |○| | |
    //| | | |○|○|○| | |
    //| | |○|○|●|○|○|●|
    //| |○|●|●|○|○|●|○|
    //|●|●|●|●|●|○|○| |
    //| |●|○|○|○|○|○|○|
    //|●| |○|○|○|○|○|○|
    //| |○|○|○|○|○|○|○|
    //TURN = 41
    //PLAYER = -1
    //DISC = 12 : 33

      if (boardnum == 24){
    player = -1;
    isLastPass = false;
    data[16] = -1; data[24] = -1; data[25] = -1; data[26] = -1; data[33] = -1;
    data[34] = -1; data[35] = 1; data[36] = -1; data[37] = -1; data[38] = 1;
    data[42] = -1; data[43] = 1; data[44] = 1; data[45] = -1; data[46] = -1;
    data[47] = 1; data[48] = -1; data[51] = 1; data[52] = 1; data[53] = 1;
    data[54] = 1; data[55] = 1; data[56] = -1; data[57] = -1; data[62] = 1;
    data[63] = -1; data[64] = -1; data[65] = -1; data[66] = -1; data[67] = -1;
    data[68] = -1; data[71] = 1; data[73] = -1; data[74] = -1; data[75] = -1;
    data[76] = -1; data[77] = -1; data[78] = -1; data[82] = -1; data[83] = -1;
    data[84] = -1; data[85] = -1; data[86] = -1; data[87] = -1; data[88] = -1;
    }


    //------
    //gamecount : 25
    //b_cpu : AlphaBetaPlayer@5dfcfece
    //w_cpu : AlphaBetaPlayer@23ceabc1
    //turn : 38
    //------
    //Loop Start !
    //| | |○| | |●| | |
    //| | |○|○|●|●| | |
    //|○|○|○|●|●|●|○|○|
    //|●|○|●|●|○|○|○|○|
    //| |●|○|●|○|○|○|○|
    //|●| |○|○|○|●|○|○|
    //| | |○|○|●| | | |
    //| | |○| |●|○| | |
    //TURN = 38
    //PLAYER = 1
    //DISC = 15 : 27

      if (boardnum == 25){
    player = 1;
    isLastPass = false;
    data[13] = -1; data[16] = 1; data[23] = -1; data[24] = -1; data[25] = 1;
    data[26] = 1; data[31] = -1; data[32] = -1; data[33] = -1; data[34] = 1;
    data[35] = 1; data[36] = 1; data[37] = -1; data[38] = -1; data[41] = 1;
    data[42] = -1; data[43] = 1; data[44] = 1; data[45] = -1; data[46] = -1;
    data[47] = -1; data[48] = -1; data[52] = 1; data[53] = -1; data[54] = 1;
    data[55] = -1; data[56] = -1; data[57] = -1; data[58] = -1; data[61] = 1;
    data[63] = -1; data[64] = -1; data[65] = -1; data[66] = 1; data[67] = -1;
    data[68] = -1; data[73] = -1; data[74] = -1; data[75] = 1; data[83] = -1;
    data[85] = 1; data[86] = -1; }


    //------
    //gamecount : 26
    //b_cpu : mcCPU@5d5eef3d
    //w_cpu : hyoukaCPU@56f4468b
    //turn : 32
    //------
    //Loop Start !
    //| | |○|○|○|○| | |
    //|●| |○| |●|○|●| |
    //| |●|○|○|○|○|○| |
    //| | |●|○|●|○|●|●|
    //| |●|●|○|●|●| | |
    //| |○|●|○|●|○| | |
    //| | |●|○| |○| | |
    //| | |●| | |○| | |
    //TURN = 32
    //PLAYER = 1
    //DISC = 16 : 20

      if (boardnum == 26){
    player = 1;
    isLastPass = false;
    data[13] = -1; data[14] = -1; data[15] = -1; data[16] = -1; data[21] = 1;
    data[23] = -1; data[25] = 1; data[26] = -1; data[27] = 1; data[32] = 1;
    data[33] = -1; data[34] = -1; data[35] = -1; data[36] = -1; data[37] = -1;
    data[43] = 1; data[44] = -1; data[45] = 1; data[46] = -1; data[47] = 1;
    data[48] = 1; data[52] = 1; data[53] = 1; data[54] = -1; data[55] = 1;
    data[56] = 1; data[62] = -1; data[63] = 1; data[64] = -1; data[65] = 1;
    data[66] = -1; data[73] = 1; data[74] = -1; data[76] = -1; data[83] = 1;
    data[86] = -1; }


    //------
    //gamecount : 27
    //b_cpu : hyoukaCPU@6cc4c815
    //w_cpu : RandomCPU@3a82f6ef
    //turn : 25
    //------
    //Loop Start !
    //| | |○| |○|●| | |
    //|●| |○|○|○|●| |●|
    //| |●| |○|○|○|●|○|
    //|○|○|●|○|●|●|○| |
    //| | | |●|○|●| | |
    //| |●|●|●|●| | | |
    //| | | | | | | | |
    //| | | | | | | | |
    //TURN = 25
    //PLAYER = -1
    //DISC = 15 : 14

      if (boardnum == 27){
    player = -1;
    isLastPass = false;
    data[13] = -1; data[15] = -1; data[16] = 1; data[21] = 1; data[23] = -1;
    data[24] = -1; data[25] = -1; data[26] = 1; data[28] = 1; data[32] = 1;
    data[34] = -1; data[35] = -1; data[36] = -1; data[37] = 1; data[38] = -1;
    data[41] = -1; data[42] = -1; data[43] = 1; data[44] = -1; data[45] = 1;
    data[46] = 1; data[47] = -1; data[54] = 1; data[55] = -1; data[56] = 1;
    data[62] = 1; data[63] = 1; data[64] = 1; data[65] = 1; }


    //------
    //gamecount : 28
    //b_cpu : AlphaBetaPlayer@100fc185
    //w_cpu : MctPBiasCPU@643b1d11
    //turn : 34
    //------
    //Loop Start !
    //| |○|○|○|○|○|○|○|
    //| | |○|●|●|○|●|●|
    //| | |○|○|●|○|●|●|
    //| | |○|○|○|●|○|○|
    //| | |○|○|●|○|●| |
    //| | |○|○|○|○| |●|
    //| | |●|○|○| | | |
    //| | | | | | | | |
    //TURN = 34
    //PLAYER = 1
    //DISC = 12 : 26

      if (boardnum == 28){
    player = 1;
    isLastPass = false;
    data[12] = -1; data[13] = -1; data[14] = -1; data[15] = -1; data[16] = -1;
    data[17] = -1; data[18] = -1; data[23] = -1; data[24] = 1; data[25] = 1;
    data[26] = -1; data[27] = 1; data[28] = 1; data[33] = -1; data[34] = -1;
    data[35] = 1; data[36] = -1; data[37] = 1; data[38] = 1; data[43] = -1;
    data[44] = -1; data[45] = -1; data[46] = 1; data[47] = -1; data[48] = -1;
    data[53] = -1; data[54] = -1; data[55] = 1; data[56] = -1; data[57] = 1;
    data[63] = -1; data[64] = -1; data[65] = -1; data[66] = -1; data[68] = 1;
    data[73] = 1; data[74] = -1; data[75] = -1; }


    //------
    //gamecount : 29
    //b_cpu : mcCPU@2ef5e5e3
    //w_cpu : AlphaBetaPlayer@36d4b5c
    //turn : 39
    //------
    //Loop Start !

    //------
    //gamecount : 30
    //b_cpu : mcCPU@6d00a15d
    //w_cpu : MctEPTCPU@51efea79
    //turn : 11
    //------
    //Loop Start !
    //|●| | | | | | | |
    //| |●|●| | | | | |
    //| | |●| | | | | |
    //| | |●|●|●| | | |
    //| | |●|○|●| | | |
    //| | |●|○|●| | | |
    //| | | |○|●| | | |
    //| | | | | | | | |
    //TURN = 11
    //PLAYER = -1
    //DISC = 12 : 3

      if (boardnum == 30){
    player = -1;
    isLastPass = false;
    data[11] = 1; data[22] = 1; data[23] = 1; data[33] = 1; data[43] = 1;
    data[44] = 1; data[45] = 1; data[53] = 1; data[54] = -1; data[55] = 1;
    data[63] = 1; data[64] = -1; data[65] = 1; data[74] = -1; data[75] = 1;
    }


    //------
    //gamecount : 31
    //b_cpu : MctEPTCPU@5034c75a
    //w_cpu : MctEPTCPU@396a51ab
    //turn : 51
    //------
    //Loop Start !
    //|●|●|●|●|●|●|●|●|
    //|●|●|●|●|○|●|○|●|
    //|●|●|○|●|●|○|○|●|
    //|●|●|○|●|●|●|●|●|
    //|●|●|●|●|○|●|○|○|
    //|●|●|●|●|●|○|○|○|
    //|●| |○|●| |○| | |
    //| | |●|○| |○| | |
    //TURN = 51
    //PLAYER = -1
    //DISC = 39 : 16

      if (boardnum == 31){
    player = -1;
    isLastPass = false;
    data[11] = 1; data[12] = 1; data[13] = 1; data[14] = 1; data[15] = 1;
    data[16] = 1; data[17] = 1; data[18] = 1; data[21] = 1; data[22] = 1;
    data[23] = 1; data[24] = 1; data[25] = -1; data[26] = 1; data[27] = -1;
    data[28] = 1; data[31] = 1; data[32] = 1; data[33] = -1; data[34] = 1;
    data[35] = 1; data[36] = -1; data[37] = -1; data[38] = 1; data[41] = 1;
    data[42] = 1; data[43] = -1; data[44] = 1; data[45] = 1; data[46] = 1;
    data[47] = 1; data[48] = 1; data[51] = 1; data[52] = 1; data[53] = 1;
    data[54] = 1; data[55] = -1; data[56] = 1; data[57] = -1; data[58] = -1;
    data[61] = 1; data[62] = 1; data[63] = 1; data[64] = 1; data[65] = 1;
    data[66] = -1; data[67] = -1; data[68] = -1; data[71] = 1; data[73] = -1;
    data[74] = 1; data[76] = -1; data[83] = 1; data[84] = -1; data[86] = -1;
    }


    //------
    //gamecount : 32
    //b_cpu : mcCPU@51081592
    //w_cpu : AlphaBetaPlayer@7f9a81e8
    //turn : 19
    //------
    //Loop Start !
    //| | | | | | | | |
    //| | | | | |●| | |
    //| |●|●|●|●| | | |
    //| |●|●|●|●|●| | |
    //| | |●|○|○| | | |
    //| |●|●|●|●|●| | |
    //| |●|○|○| | | | |
    //| |○|○| | | | | |
    //TURN = 19
    //PLAYER = -1
    //DISC = 17 : 6

      if (boardnum == 32){
    player = -1;
    isLastPass = false;
    data[26] = 1; data[32] = 1; data[33] = 1; data[34] = 1; data[35] = 1;
    data[42] = 1; data[43] = 1; data[44] = 1; data[45] = 1; data[46] = 1;
    data[53] = 1; data[54] = -1; data[55] = -1; data[62] = 1; data[63] = 1;
    data[64] = 1; data[65] = 1; data[66] = 1; data[72] = 1; data[73] = -1;
    data[74] = -1; data[82] = -1; data[83] = -1; }


    //------
    //gamecount : 33
    //b_cpu : AlphaBetaPlayer@9629756
    //w_cpu : AlphaBetaPlayer@62ee68d8
    //turn : 58
    //------
    //Loop Start !
    //|●|○|●|●|●|●|●|●|
    //| |○|●|●|●|●|●|●|
    //|●|○|●|●|●|●|●|●|
    //|●|○|●|●|●|●|●|●|
    //|●|○|●|●|●|●|●|●|
    //|●|○|●|●|●|●|●|●|
    //| |○|●|●|●|●|●|●|
    //|○|○|○|○|○|●|●|●|
    //TURN = 58
    //PLAYER = 1
    //DISC = 50 : 12

      if (boardnum == 33){
    player = 1;
    isLastPass = false;
    data[11] = 1; data[12] = -1; data[13] = 1; data[14] = 1; data[15] = 1;
    data[16] = 1; data[17] = 1; data[18] = 1; data[22] = -1; data[23] = 1;
    data[24] = 1; data[25] = 1; data[26] = 1; data[27] = 1; data[28] = 1;
    data[31] = 1; data[32] = -1; data[33] = 1; data[34] = 1; data[35] = 1;
    data[36] = 1; data[37] = 1; data[38] = 1; data[41] = 1; data[42] = -1;
    data[43] = 1; data[44] = 1; data[45] = 1; data[46] = 1; data[47] = 1;
    data[48] = 1; data[51] = 1; data[52] = -1; data[53] = 1; data[54] = 1;
    data[55] = 1; data[56] = 1; data[57] = 1; data[58] = 1; data[61] = 1;
    data[62] = -1; data[63] = 1; data[64] = 1; data[65] = 1; data[66] = 1;
    data[67] = 1; data[68] = 1; data[72] = -1; data[73] = 1; data[74] = 1;
    data[75] = 1; data[76] = 1; data[77] = 1; data[78] = 1; data[81] = -1;
    data[82] = -1; data[83] = -1; data[84] = -1; data[85] = -1; data[86] = 1;
    data[87] = 1; data[88] = 1; }


    //------
    //gamecount : 34
    //b_cpu : AlphaBetaPlayer@735b5592
    //w_cpu : MctPBiasCPU@58651fd0
    //turn : 5
    //------
    //Loop Start !
    //| | | | | | | | |
    //| | | | | | | | |
    //| | | |●|○| | | |
    //| | |●|●|●|●| | |
    //| | |○|○|○| | | |
    //| | | | | | | | |
    //| | | | | | | | |
    //| | | | | | | | |
    //TURN = 5
    //PLAYER = -1
    //DISC = 5 : 4

      if (boardnum == 34){
    player = -1;
    isLastPass = false;
    data[34] = 1; data[35] = -1; data[43] = 1; data[44] = 1; data[45] = 1;
    data[46] = 1; data[53] = -1; data[54] = -1; data[55] = -1; }


    //------
    //gamecount : 35
    //b_cpu : mctCPU@4520ebad
    //w_cpu : MctPBiasCPU@5419f379
    //turn : 49
    //------
    //Loop Start !
    //|○|●|●|●|○| | |○|
    //|○|●|●|●|●|●|●|●|
    //|○|●|○|●|●|●|●|●|
    //|○|●|○|●|●|○|●|●|
    //|○|○|●|●|●|●|●|●|
    //|○|○|○|●|●|○|●|○|
    //|○|○|○|●| |○| | |
    //|○| | | | |○| | |
    //TURN = 49
    //PLAYER = -1
    //DISC = 31 : 22

      if (boardnum == 35){
    player = -1;
    isLastPass = false;
    data[11] = -1; data[12] = 1; data[13] = 1; data[14] = 1; data[15] = -1;
    data[18] = -1; data[21] = -1; data[22] = 1; data[23] = 1; data[24] = 1;
    data[25] = 1; data[26] = 1; data[27] = 1; data[28] = 1; data[31] = -1;
    data[32] = 1; data[33] = -1; data[34] = 1; data[35] = 1; data[36] = 1;
    data[37] = 1; data[38] = 1; data[41] = -1; data[42] = 1; data[43] = -1;
    data[44] = 1; data[45] = 1; data[46] = -1; data[47] = 1; data[48] = 1;
    data[51] = -1; data[52] = -1; data[53] = 1; data[54] = 1; data[55] = 1;
    data[56] = 1; data[57] = 1; data[58] = 1; data[61] = -1; data[62] = -1;
    data[63] = -1; data[64] = 1; data[65] = 1; data[66] = -1; data[67] = 1;
    data[68] = -1; data[71] = -1; data[72] = -1; data[73] = -1; data[74] = 1;
    data[76] = -1; data[81] = -1; data[86] = -1; }


    //------
    //gamecount : 36
    //b_cpu : AlphaBetaPlayer@7dc7cbad
    //w_cpu : AlphaBetaPlayer@d2cc05a
    //turn : 25
    //------
    //Loop Start !
    //| | | | | | | | |
    //| | | |○| | | | |
    //|○|○|○|○|○|●| | |
    //|●|●|○|●|●|●| | |
    //| |●|●|○|●|●| | |
    //| |●|●|●|○|●| | |
    //| | |●|●|●| | | |
    //| | | |●|●|●| | |
    //TURN = 25
    //PLAYER = -1
    //DISC = 20 : 9

      if (boardnum == 36){
    player = -1;
    isLastPass = false;
    data[24] = -1; data[31] = -1; data[32] = -1; data[33] = -1; data[34] = -1;
    data[35] = -1; data[36] = 1; data[41] = 1; data[42] = 1; data[43] = -1;
    data[44] = 1; data[45] = 1; data[46] = 1; data[52] = 1; data[53] = 1;
    data[54] = -1; data[55] = 1; data[56] = 1; data[62] = 1; data[63] = 1;
    data[64] = 1; data[65] = -1; data[66] = 1; data[73] = 1; data[74] = 1;
    data[75] = 1; data[84] = 1; data[85] = 1; data[86] = 1; }


    //------
    //gamecount : 37
    //b_cpu : hyoukaCPU@4f933fd1
    //w_cpu : AlphaBetaPlayer@548a9f61
    //turn : 52
    //------
    //Loop Start !
    //|○|○|○|○|○|○|○|○|
    //|●|○|●|○|●|○|○|○|
    //| |●|○|○|○|○|○|○|
    //|●|●|○|○|○|○|○|○|
    //|●|●|●|●|○|○|○|○|
    //|●|●|●|●|●|○|○|○|
    //|●| | |●|●|●|○|○|
    //| | | | | |○| |○|
    //TURN = 51
    //PLAYER = 1
    //DISC = 19 : 36

      if (boardnum == 37){
    player = 1;
    isLastPass = false;
    data[11] = -1; data[12] = -1; data[13] = -1; data[14] = -1; data[15] = -1;
    data[16] = -1; data[17] = -1; data[18] = -1; data[21] = 1; data[22] = -1;
    data[23] = 1; data[24] = -1; data[25] = 1; data[26] = -1; data[27] = -1;
    data[28] = -1; data[32] = 1; data[33] = -1; data[34] = -1; data[35] = -1;
    data[36] = -1; data[37] = -1; data[38] = -1; data[41] = 1; data[42] = 1;
    data[43] = -1; data[44] = -1; data[45] = -1; data[46] = -1; data[47] = -1;
    data[48] = -1; data[51] = 1; data[52] = 1; data[53] = 1; data[54] = 1;
    data[55] = -1; data[56] = -1; data[57] = -1; data[58] = -1; data[61] = 1;
    data[62] = 1; data[63] = 1; data[64] = 1; data[65] = 1; data[66] = -1;
    data[67] = -1; data[68] = -1; data[71] = 1; data[74] = 1; data[75] = 1;
    data[76] = 1; data[77] = -1; data[78] = -1; data[86] = -1; data[88] = -1;
    }


    //------
    //gamecount : 38
    //b_cpu : MctPBiasCPU@1753acfe
    //w_cpu : hyoukaCPU@7c16905e
    //turn : 49
    //------
    //Loop Start !
    //|●|●|●|●|●|●|●|●|
    //|●|●|○| | |●|●|●|
    //|●|○|●|○|●|○|●|●|
    //|○|○|○|○|○|●|○| |
    //| |○|○|○|○|○|○|○|
    //|○|○|○|●|○|○|○| |
    //| | |○|●|●|○| | |
    //| | |○|●|●|●|●|●|
    //TURN = 49
    //PLAYER = -1
    //DISC = 27 : 26

      if (boardnum == 38){
    player = -1;
    isLastPass = false;
    data[11] = 1; data[12] = 1; data[13] = 1; data[14] = 1; data[15] = 1;
    data[16] = 1; data[17] = 1; data[18] = 1; data[21] = 1; data[22] = 1;
    data[23] = -1; data[26] = 1; data[27] = 1; data[28] = 1; data[31] = 1;
    data[32] = -1; data[33] = 1; data[34] = -1; data[35] = 1; data[36] = -1;
    data[37] = 1; data[38] = 1; data[41] = -1; data[42] = -1; data[43] = -1;
    data[44] = -1; data[45] = -1; data[46] = 1; data[47] = -1; data[52] = -1;
    data[53] = -1; data[54] = -1; data[55] = -1; data[56] = -1; data[57] = -1;
    data[58] = -1; data[61] = -1; data[62] = -1; data[63] = -1; data[64] = 1;
    data[65] = -1; data[66] = -1; data[67] = -1; data[73] = -1; data[74] = 1;
    data[75] = 1; data[76] = -1; data[83] = -1; data[84] = 1; data[85] = 1;
    data[86] = 1; data[87] = 1; data[88] = 1; }


    //------
    //gamecount : 39
    //b_cpu : mctCPU@2a2d45ba
    //w_cpu : AlphaBetaPlayer@2a5ca609
    //turn : 25
    //------
    //Loop Start !
    //| | |●| | | | | |
    //| | |●|●|○|●| | |
    //|●|●|●|○|○|●| | |
    //| |●|○|○|○|●| | |
    //| |●|●|○|●|●| | |
    //| |●|●|●|○| |●| |
    //| |○|●| | | | | |
    //|○| | | | | | | |
    //TURN = 25
    //PLAYER = -1
    //DISC = 19 : 10

      if (boardnum == 39){
    player = -1;
    isLastPass = false;
    data[13] = 1; data[23] = 1; data[24] = 1; data[25] = -1; data[26] = 1;
    data[31] = 1; data[32] = 1; data[33] = 1; data[34] = -1; data[35] = -1;
    data[36] = 1; data[42] = 1; data[43] = -1; data[44] = -1; data[45] = -1;
    data[46] = 1; data[52] = 1; data[53] = 1; data[54] = -1; data[55] = 1;
    data[56] = 1; data[62] = 1; data[63] = 1; data[64] = 1; data[65] = -1;
    data[67] = 1; data[72] = -1; data[73] = 1; data[81] = -1; }


    //------
    //gamecount : 40
    //b_cpu : MctEPTCPU@20e2cbe0
    //w_cpu : mctCPU@68be2bc2
    //turn : 7
    //------
    //Loop Start !
    //| | | | | | | | |
    //| | | | | | | | |
    //| | | | | | | | |
    //| | | |○|●| | | |
    //| | | |●|●|●| | |
    //| | | | |●|●| | |
    //| | | | |○|○|●| |
    //| | | | | | | |●|
    //TURN = 7
    //PLAYER = -1
    //DISC = 8 : 3

      if (boardnum == 40){
    player = -1;
    isLastPass = false;
    data[44] = -1; data[45] = 1; data[54] = 1; data[55] = 1; data[56] = 1;
    data[65] = 1; data[66] = 1; data[75] = -1; data[76] = -1; data[77] = 1;
    data[88] = 1; }


    //------
    //gamecount : 41
    //b_cpu : mctCPU@28feb3fa
    //w_cpu : AlphaBetaPlayer@675d3402
    //turn : 50
    //------
    //Loop Start !
    //| |○|○|○|○|○|○|○|
    //| |●|●|●|○|●|○|○|
    //| | |●|○|●|○|○|○|
    //| | |●|○|○|○|●|○|
    //|●|●|●|○|○|●|●|○|
    //| |●|○|○|●|●|●|○|
    //|●|●|●|●|●| | |○|
    //|○|●|●|●|●| | |○|
    //TURN = 49
    //PLAYER = 1
    //DISC = 26 : 27

      if (boardnum == 41){
    player = 1;
    isLastPass = false;
    data[12] = -1; data[13] = -1; data[14] = -1; data[15] = -1; data[16] = -1;
    data[17] = -1; data[18] = -1; data[22] = 1; data[23] = 1; data[24] = 1;
    data[25] = -1; data[26] = 1; data[27] = -1; data[28] = -1; data[33] = 1;
    data[34] = -1; data[35] = 1; data[36] = -1; data[37] = -1; data[38] = -1;
    data[43] = 1; data[44] = -1; data[45] = -1; data[46] = -1; data[47] = 1;
    data[48] = -1; data[51] = 1; data[52] = 1; data[53] = 1; data[54] = -1;
    data[55] = -1; data[56] = 1; data[57] = 1; data[58] = -1; data[62] = 1;
    data[63] = -1; data[64] = -1; data[65] = 1; data[66] = 1; data[67] = 1;
    data[68] = -1; data[71] = 1; data[72] = 1; data[73] = 1; data[74] = 1;
    data[75] = 1; data[78] = -1; data[81] = -1; data[82] = 1; data[83] = 1;
    data[84] = 1; data[85] = 1; data[88] = -1; }


    //------
    //gamecount : 42
    //b_cpu : MctEPTCPU@51565ec2
    //w_cpu : mctCPU@482f8f11
    //turn : 42
    //------
    //Loop Start !
    //|○| |○| | |●| |●|
    //|○|○|●|●| |●|●| |
    //|○|○|○|●|●|●|●| |
    //| |●|○|○|●|●|●|○|
    //| |○| |○|○|●|●| |
    //| | |●|○|○|○|○|●|
    //| |●|○| |●|○|○|○|
    //|●| | |●| |●|○|●|
    //TURN = 42
    //PLAYER = 1
    //DISC = 24 : 22

      if (boardnum == 42){
    player = 1;
    isLastPass = false;
    data[11] = -1; data[13] = -1; data[16] = 1; data[18] = 1; data[21] = -1;
    data[22] = -1; data[23] = 1; data[24] = 1; data[26] = 1; data[27] = 1;
    data[31] = -1; data[32] = -1; data[33] = -1; data[34] = 1; data[35] = 1;
    data[36] = 1; data[37] = 1; data[42] = 1; data[43] = -1; data[44] = -1;
    data[45] = 1; data[46] = 1; data[47] = 1; data[48] = -1; data[52] = -1;
    data[54] = -1; data[55] = -1; data[56] = 1; data[57] = 1; data[63] = 1;
    data[64] = -1; data[65] = -1; data[66] = -1; data[67] = -1; data[68] = 1;
    data[72] = 1; data[73] = -1; data[75] = 1; data[76] = -1; data[77] = -1;
    data[78] = -1; data[81] = 1; data[84] = 1; data[86] = 1; data[87] = -1;
    data[88] = 1; }


    //------
    //gamecount : 43
    //b_cpu : hyoukaCPU@1593948d
    //w_cpu : hyoukaCPU@1b604f19
    //turn : 42
    //------
    //Loop Start !
    //|○|○|○|○|●|○| | |
    //|○| |○|○|○|●| |○|
    //|○|○|○|○|○|●|○|●|
    //| |○|○|●|●|○|●|●|
    //| |○| |●|○|●| |●|
    //|●|●|○|○|●|●|●| |
    //| | |○|●| |○| | |
    //| | |●| | |○|○|○|
    //TURN = 42
    //PLAYER = 1
    //DISC = 18 : 28

      if (boardnum == 43){
    player = 1;
    isLastPass = false;
    data[11] = -1; data[12] = -1; data[13] = -1; data[14] = -1; data[15] = 1;
    data[16] = -1; data[21] = -1; data[23] = -1; data[24] = -1; data[25] = -1;
    data[26] = 1; data[28] = -1; data[31] = -1; data[32] = -1; data[33] = -1;
    data[34] = -1; data[35] = -1; data[36] = 1; data[37] = -1; data[38] = 1;
    data[42] = -1; data[43] = -1; data[44] = 1; data[45] = 1; data[46] = -1;
    data[47] = 1; data[48] = 1; data[52] = -1; data[54] = 1; data[55] = -1;
    data[56] = 1; data[58] = 1; data[61] = 1; data[62] = 1; data[63] = -1;
    data[64] = -1; data[65] = 1; data[66] = 1; data[67] = 1; data[73] = -1;
    data[74] = 1; data[76] = -1; data[83] = 1; data[86] = -1; data[87] = -1;
    data[88] = -1; }


    //------
    //gamecount : 44
    //b_cpu : hyoukaCPU@7823a2f9
    //w_cpu : RandomCPU@4cc0edeb
    //turn : 8
    //------
    //Loop Start !
    //| | | | | | | | |
    //| | | |○|●| | | |
    //| | | | |●| | | |
    //| | | |○|●|○| | |
    //| | | |○|○|○| | |
    //| | | |○|○|○| | |
    //| | | | | | | | |
    //| | | | | | | | |
    //TURN = 8
    //PLAYER = 1
    //DISC = 3 : 9

      if (boardnum == 44){
    player = 1;
    isLastPass = false;
    data[24] = -1; data[25] = 1; data[35] = 1; data[44] = -1; data[45] = 1;
    data[46] = -1; data[54] = -1; data[55] = -1; data[56] = -1; data[64] = -1;
    data[65] = -1; data[66] = -1; }


    //------
    //gamecount : 45
    //b_cpu : mctCPU@457e2f02
    //w_cpu : mcCPU@5c7fa833
    //turn : 4
    //------
    //Loop Start !
    //| | | | | | | | |
    //| | |●| | | | | |
    //| | |●| | | | | |
    //| | |●|○|●| | | |
    //| | | |○|○| | | |
    //| | | |○| | | | |
    //| | | | | | | | |
    //| | | | | | | | |
    //TURN = 4
    //PLAYER = 1
    //DISC = 4 : 4

      if (boardnum == 45){
    player = 1;
    isLastPass = false;
    data[23] = 1; data[33] = 1; data[43] = 1; data[44] = -1; data[45] = 1;
    data[54] = -1; data[55] = -1; data[64] = -1; }


    //------
    //gamecount : 46
    //b_cpu : AlphaBetaPlayer@39aeed2f
    //w_cpu : MctPBiasCPU@724af044
    //turn : 24
    //------
    //Loop Start !
    //| | | |○|○|○| | |
    //| | |○|○|○|○| | |
    //|○|○|○|○|○|○| | |
    //|○|○|●|○|●|○|○|○|
    //|○|○|○|○|○|○|○| |
    //| | | | | | | | |
    //| | | | | | | | |
    //| | | | | | | | |
    //TURN = 24
    //PLAYER = 1
    //DISC = 2 : 26

      if (boardnum == 46){
    player = 1;
    isLastPass = false;
    data[14] = -1; data[15] = -1; data[16] = -1; data[23] = -1; data[24] = -1;
    data[25] = -1; data[26] = -1; data[31] = -1; data[32] = -1; data[33] = -1;
    data[34] = -1; data[35] = -1; data[36] = -1; data[41] = -1; data[42] = -1;
    data[43] = 1; data[44] = -1; data[45] = 1; data[46] = -1; data[47] = -1;
    data[48] = -1; data[51] = -1; data[52] = -1; data[53] = -1; data[54] = -1;
    data[55] = -1; data[56] = -1; data[57] = -1; }


    //------
    //gamecount : 47
    //b_cpu : mcCPU@4678c730
    //w_cpu : AlphaBetaPlayer@6767c1fc
    //turn : 46
    //------
    //Loop Start !
    //|○|○|○|○|○|○|○|●|
    //|○|○|○|○|○|○|●| |
    //|○|○|○|○|●|○|●|●|
    //|○|○|○|●|●|○|○|●|
    //|○|○|○|●|○|○|○|○|
    //| |●|●|●|●|●|●|●|
    //| | | |●|●| | | |
    //| | | | | | | | |
    //TURN = 44
    //PLAYER = 1
    //DISC = 18 : 30

      if (boardnum == 47){
    player = 1;
    isLastPass = false;
    data[11] = -1; data[12] = -1; data[13] = -1; data[14] = -1; data[15] = -1;
    data[16] = -1; data[17] = -1; data[18] = 1; data[21] = -1; data[22] = -1;
    data[23] = -1; data[24] = -1; data[25] = -1; data[26] = -1; data[27] = 1;
    data[31] = -1; data[32] = -1; data[33] = -1; data[34] = -1; data[35] = 1;
    data[36] = -1; data[37] = 1; data[38] = 1; data[41] = -1; data[42] = -1;
    data[43] = -1; data[44] = 1; data[45] = 1; data[46] = -1; data[47] = -1;
    data[48] = 1; data[51] = -1; data[52] = -1; data[53] = -1; data[54] = 1;
    data[55] = -1; data[56] = -1; data[57] = -1; data[58] = -1; data[62] = 1;
    data[63] = 1; data[64] = 1; data[65] = 1; data[66] = 1; data[67] = 1;
    data[68] = 1; data[74] = 1; data[75] = 1; }


    //------
    //gamecount : 48
    //b_cpu : MctEPTCPU@29ee9faa
    //w_cpu : RandomCPU@c038203
    //turn : 32
    //------
    //Loop Start !
    //|●| |●| | |●| | |
    //| |●| |●| |●| | |
    //|○| |●| |●|●| |●|
    //| |○|○|○|●|●|●| |
    //|●| |○|○|○|●|○|○|
    //| |○| | |●|○|○|○|
    //| | | |●| |○|○|○|
    //| | | | |○|○|○| |
    //TURN = 32
    //PLAYER = 1
    //DISC = 17 : 19

      if (boardnum == 48){
    player = 1;
    isLastPass = false;
    data[11] = 1; data[13] = 1; data[16] = 1; data[22] = 1; data[24] = 1;
    data[26] = 1; data[31] = -1; data[33] = 1; data[35] = 1; data[36] = 1;
    data[38] = 1; data[42] = -1; data[43] = -1; data[44] = -1; data[45] = 1;
    data[46] = 1; data[47] = 1; data[51] = 1; data[53] = -1; data[54] = -1;
    data[55] = -1; data[56] = 1; data[57] = -1; data[58] = -1; data[62] = -1;
    data[65] = 1; data[66] = -1; data[67] = -1; data[68] = -1; data[74] = 1;
    data[76] = -1; data[77] = -1; data[78] = -1; data[85] = -1; data[86] = -1;
    data[87] = -1; }


    //------
    //gamecount : 49
    //b_cpu : mctCPU@cc285f4
    //w_cpu : hyoukaCPU@55f3ddb1
    //turn : 39
    //------
    //Loop Start !
    //|●| |●| | | | |○|
    //|●| |●| | | |○|●|
    //|●|●|●| |○|○|●|○|
    //|●|●|○|●|●|●|○| |
    //|●|●|○|○|●|○|○|○|
    //|●|●|○|●| |○| | |
    //| | |●|○|○|○|○| |
    //| |●|●|●| | | |○|
    //TURN = 39
    //PLAYER = -1
    //DISC = 24 : 19

      if (boardnum == 49){
    player = -1;
    isLastPass = false;
    data[11] = 1; data[13] = 1; data[18] = -1; data[21] = 1; data[23] = 1;
    data[27] = -1; data[28] = 1; data[31] = 1; data[32] = 1; data[33] = 1;
    data[35] = -1; data[36] = -1; data[37] = 1; data[38] = -1; data[41] = 1;
    data[42] = 1; data[43] = -1; data[44] = 1; data[45] = 1; data[46] = 1;
    data[47] = -1; data[51] = 1; data[52] = 1; data[53] = -1; data[54] = -1;
    data[55] = 1; data[56] = -1; data[57] = -1; data[58] = -1; data[61] = 1;
    data[62] = 1; data[63] = -1; data[64] = 1; data[66] = -1; data[73] = 1;
    data[74] = -1; data[75] = -1; data[76] = -1; data[77] = -1; data[82] = 1;
    data[83] = 1; data[84] = 1; data[88] = -1; }


    //------
    //gamecount : 50
    //b_cpu : AlphaBetaPlayer@8bd1b6a
    //w_cpu : hyoukaCPU@18be83e4
    //turn : 55
    //------
    //Loop Start !
    //|○|●|●|●|●|●|●|●|
    //|○|○|●|●|●|●|●|●|
    //|○| |○|●|●|○|○|●|
    //| |○|○|●|●|○|○|●|
    //| |○|○|●|○|●|○|●|
    //| |○|●|○|●|●|○|●|
    //| |●|●|●|●|●|●|●|
    //|●|●|●|●|●|●|●|●|
    //TURN = 55
    //PLAYER = -1
    //DISC = 41 : 18

      if (boardnum == 50){
    player = -1;
    isLastPass = false;
    data[11] = -1; data[12] = 1; data[13] = 1; data[14] = 1; data[15] = 1;
    data[16] = 1; data[17] = 1; data[18] = 1; data[21] = -1; data[22] = -1;
    data[23] = 1; data[24] = 1; data[25] = 1; data[26] = 1; data[27] = 1;
    data[28] = 1; data[31] = -1; data[33] = -1; data[34] = 1; data[35] = 1;
    data[36] = -1; data[37] = -1; data[38] = 1; data[42] = -1; data[43] = -1;
    data[44] = 1; data[45] = 1; data[46] = -1; data[47] = -1; data[48] = 1;
    data[52] = -1; data[53] = -1; data[54] = 1; data[55] = -1; data[56] = 1;
    data[57] = -1; data[58] = 1; data[62] = -1; data[63] = 1; data[64] = -1;
    data[65] = 1; data[66] = 1; data[67] = -1; data[68] = 1; data[72] = 1;
    data[73] = 1; data[74] = 1; data[75] = 1; data[76] = 1; data[77] = 1;
    data[78] = 1; data[81] = 1; data[82] = 1; data[83] = 1; data[84] = 1;
    data[85] = 1; data[86] = 1; data[87] = 1; data[88] = 1; }


    //------
    //gamecount : 51
    //b_cpu : MctPBiasCPU@cb5822
    //w_cpu : AlphaBetaPlayer@4b9e13df
    //turn : 47
    //------
    //Loop Start !
    //| |○|○|○|○|○|○|○|
    //|●|●|○|○|○|●|●|●|
    //|●|●|○|○|○|●|●| |
    //|●|○|●|●|○|●|●| |
    //|○|●|●|●|●|●| | |
    //|●|●|○|●|●|●| | |
    //| |●|●|●|●| | | |
    //|○|●|●|●|●|●| | |
    //TURN = 47
    //PLAYER = -1
    //DISC = 33 : 18

      if (boardnum == 51){
    player = -1;
    isLastPass = false;
    data[12] = -1; data[13] = -1; data[14] = -1; data[15] = -1; data[16] = -1;
    data[17] = -1; data[18] = -1; data[21] = 1; data[22] = 1; data[23] = -1;
    data[24] = -1; data[25] = -1; data[26] = 1; data[27] = 1; data[28] = 1;
    data[31] = 1; data[32] = 1; data[33] = -1; data[34] = -1; data[35] = -1;
    data[36] = 1; data[37] = 1; data[41] = 1; data[42] = -1; data[43] = 1;
    data[44] = 1; data[45] = -1; data[46] = 1; data[47] = 1; data[51] = -1;
    data[52] = 1; data[53] = 1; data[54] = 1; data[55] = 1; data[56] = 1;
    data[61] = 1; data[62] = 1; data[63] = -1; data[64] = 1; data[65] = 1;
    data[66] = 1; data[72] = 1; data[73] = 1; data[74] = 1; data[75] = 1;
    data[81] = -1; data[82] = 1; data[83] = 1; data[84] = 1; data[85] = 1;
    data[86] = 1; }


    //------
    //gamecount : 52
    //b_cpu : hyoukaCPU@2b98378d
    //w_cpu : hyoukaCPU@475530b9
    //turn : 49
    //------
    //Loop Start !
    //|●| |●|○| |○| |○|
    //|●| |●|○|○|○|○| |
    //|●|●|●|○|○|○|○|○|
    //|●|●|○|○|○|○|○| |
    //|●|●|●|○|●|●|●|●|
    //|●|●|○|●|●|○|●|○|
    //|●|○|○|●|●|●| | |
    //|●|●|●|●|●| | | |
    //TURN = 49
    //PLAYER = -1
    //DISC = 30 : 23

      if (boardnum == 52){
    player = -1;
    isLastPass = false;
    data[11] = 1; data[13] = 1; data[14] = -1; data[16] = -1; data[18] = -1;
    data[21] = 1; data[23] = 1; data[24] = -1; data[25] = -1; data[26] = -1;
    data[27] = -1; data[31] = 1; data[32] = 1; data[33] = 1; data[34] = -1;
    data[35] = -1; data[36] = -1; data[37] = -1; data[38] = -1; data[41] = 1;
    data[42] = 1; data[43] = -1; data[44] = -1; data[45] = -1; data[46] = -1;
    data[47] = -1; data[51] = 1; data[52] = 1; data[53] = 1; data[54] = -1;
    data[55] = 1; data[56] = 1; data[57] = 1; data[58] = 1; data[61] = 1;
    data[62] = 1; data[63] = -1; data[64] = 1; data[65] = 1; data[66] = -1;
    data[67] = 1; data[68] = -1; data[71] = 1; data[72] = -1; data[73] = -1;
    data[74] = 1; data[75] = 1; data[76] = 1; data[81] = 1; data[82] = 1;
    data[83] = 1; data[84] = 1; data[85] = 1; }


    //------
    //gamecount : 53
    //b_cpu : AlphaBetaPlayer@1d057a39
    //w_cpu : AlphaBetaPlayer@26be92ad
    //turn : 32
    //------
    //Loop Start !
    //| | |○| | |●| | |
    //| | |○|○|●|●| | |
    //| |●|○|○|●|●|○|○|
    //|●|●|○|●|○|○|○|○|
    //| |○|○|●|○|○|○|○|
    //| | |○|○|●|●|○|○|
    //| | |○|●| | | | |
    //| | | | | | | | |
    //TURN = 32
    //PLAYER = 1
    //DISC = 13 : 23

      if (boardnum == 53){
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


    //------
    //gamecount : 54
    //b_cpu : AlphaBetaPlayer@4c70fda8
    //w_cpu : AlphaBetaPlayer@224edc67
    //turn : 15
    //------
    //Loop Start !
    //| | | | | | | | |
    //| | | | | | | | |
    //| | |○|○|○|○| | |
    //| |●|●|○|○|●| | |
    //| |○|●|○|●|●| | |
    //| |○|●|●|●| | | |
    //| | |●| | | | | |
    //| | | | | | | | |
    //TURN = 15
    //PLAYER = -1
    //DISC = 10 : 9

      if (boardnum == 54){
    player = -1;
    isLastPass = false;
    data[33] = -1; data[34] = -1; data[35] = -1; data[36] = -1; data[42] = 1;
    data[43] = 1; data[44] = -1; data[45] = -1; data[46] = 1; data[52] = -1;
    data[53] = 1; data[54] = -1; data[55] = 1; data[56] = 1; data[62] = -1;
    data[63] = 1; data[64] = 1; data[65] = 1; data[73] = 1; }


    //------
    //gamecount : 55
    //b_cpu : AlphaBetaPlayer@14acaea5
    //w_cpu : RandomCPU@46d56d67
    //turn : 21
    //------
    //Loop Start !
    //| |○| |●|●|●| | |
    //| | |○|○|●| | | |
    //| | |○|●|●| |○| |
    //| |○|○|●|○|○|○|●|
    //| | |●|○|○| |○| |
    //| | | |○| | |○|●|
    //| | | | | | | | |
    //| | | | | | | | |
    //TURN = 21
    //PLAYER = -1
    //DISC = 10 : 15

      if (boardnum == 55){
    player = -1;
    isLastPass = false;
    data[12] = -1; data[14] = 1; data[15] = 1; data[16] = 1; data[23] = -1;
    data[24] = -1; data[25] = 1; data[33] = -1; data[34] = 1; data[35] = 1;
    data[37] = -1; data[42] = -1; data[43] = -1; data[44] = 1; data[45] = -1;
    data[46] = -1; data[47] = -1; data[48] = 1; data[53] = 1; data[54] = -1;
    data[55] = -1; data[57] = -1; data[64] = -1; data[67] = -1; data[68] = 1;
    }


    //------
    //gamecount : 56
    //b_cpu : hyoukaCPU@d8355a8
    //w_cpu : MctEPTCPU@59fa1d9b
    //turn : 22
    //------
    //Loop Start !
    //|●| |○|●| | | | |
    //| |●|○| | | | | |
    //| |●|●|○|○|○| | |
    //| | |○|●|○|○| | |
    //| | |○|○|○|●| | |
    //| | |○|○|●|●|●| |
    //| | |○| | | |●| |
    //| | | | | | | |●|
    //TURN = 22
    //PLAYER = 1
    //DISC = 12 : 14

      if (boardnum == 56){
    player = 1;
    isLastPass = false;
    data[11] = 1; data[13] = -1; data[14] = 1; data[22] = 1; data[23] = -1;
    data[32] = 1; data[33] = 1; data[34] = -1; data[35] = -1; data[36] = -1;
    data[43] = -1; data[44] = 1; data[45] = -1; data[46] = -1; data[53] = -1;
    data[54] = -1; data[55] = -1; data[56] = 1; data[63] = -1; data[64] = -1;
    data[65] = 1; data[66] = 1; data[67] = 1; data[73] = -1; data[77] = 1;
    data[88] = 1; }


    //------
    //gamecount : 57
    //b_cpu : MctEPTCPU@28d25987
    //w_cpu : mctCPU@4501b7af
    //turn : 18
    //------
    //Loop Start !
    //| | | | | | | | |
    //| | | | | | | | |
    //| | | | | | | | |
    //| | |○|○|○|○|○| |
    //| | | |○|○|○|○| |
    //| | | |●|○|●|○| |
    //| | | |●|●|○|○| |
    //| | |●| |●|●|○|●|
    //TURN = 18
    //PLAYER = 1
    //DISC = 8 : 14

      if (boardnum == 57){
    player = 1;
    isLastPass = false;
    data[43] = -1; data[44] = -1; data[45] = -1; data[46] = -1; data[47] = -1;
    data[54] = -1; data[55] = -1; data[56] = -1; data[57] = -1; data[64] = 1;
    data[65] = -1; data[66] = 1; data[67] = -1; data[74] = 1; data[75] = 1;
    data[76] = -1; data[77] = -1; data[83] = 1; data[85] = 1; data[86] = 1;
    data[87] = -1; data[88] = 1; }


    //------
    //gamecount : 58
    //b_cpu : MctEPTCPU@523884b2
    //w_cpu : hyoukaCPU@5b275dab
    //turn : 46
    //------
    //Loop Start !
    //|○|○| |●|●|●| |●|
    //| |○|●|●|●|●|●|●|
    //| | |○|●| |●|●|●|
    //| | |○|○|○|●|○|●|
    //|○|○|○|○|○|○|○|●|
    //|○|○|●|●|○|○|○| |
    //|○| |○|○|○|○| |○|
    //|●|●|●|●| |●| | |
    //TURN = 46
    //PLAYER = 1
    //DISC = 24 : 26

      if (boardnum == 58){
    player = 1;
    isLastPass = false;
    data[11] = -1; data[12] = -1; data[14] = 1; data[15] = 1; data[16] = 1;
    data[18] = 1; data[22] = -1; data[23] = 1; data[24] = 1; data[25] = 1;
    data[26] = 1; data[27] = 1; data[28] = 1; data[33] = -1; data[34] = 1;
    data[36] = 1; data[37] = 1; data[38] = 1; data[43] = -1; data[44] = -1;
    data[45] = -1; data[46] = 1; data[47] = -1; data[48] = 1; data[51] = -1;
    data[52] = -1; data[53] = -1; data[54] = -1; data[55] = -1; data[56] = -1;
    data[57] = -1; data[58] = 1; data[61] = -1; data[62] = -1; data[63] = 1;
    data[64] = 1; data[65] = -1; data[66] = -1; data[67] = -1; data[71] = -1;
    data[73] = -1; data[74] = -1; data[75] = -1; data[76] = -1; data[78] = -1;
    data[81] = 1; data[82] = 1; data[83] = 1; data[84] = 1; data[86] = 1;
    }


    //------
    //gamecount : 59
    //b_cpu : mctCPU@61832929
    //w_cpu : MctEPTCPU@29774679
    //turn : 25
    //------
    //Loop Start !
    //| | |○|●|●|●|●|●|
    //| | |●|●|●| | | |
    //| |●|●|●|●|●| | |
    //|●| |●|○|●| | | |
    //| |●|●|●|○|○| | |
    //| |●|●|○|○|○|○| |
    //| | | | | | | | |
    //| | | | | | | | |
    //TURN = 25
    //PLAYER = -1
    //DISC = 21 : 8

      if (boardnum == 59){
    player = -1;
    isLastPass = false;
    data[13] = -1; data[14] = 1; data[15] = 1; data[16] = 1; data[17] = 1;
    data[18] = 1; data[23] = 1; data[24] = 1; data[25] = 1; data[32] = 1;
    data[33] = 1; data[34] = 1; data[35] = 1; data[36] = 1; data[41] = 1;
    data[43] = 1; data[44] = -1; data[45] = 1; data[52] = 1; data[53] = 1;
    data[54] = 1; data[55] = -1; data[56] = -1; data[62] = 1; data[63] = 1;
    data[64] = -1; data[65] = -1; data[66] = -1; data[67] = -1; }


    //------
    //gamecount : 60
    //b_cpu : mctCPU@3ffc5af1
    //w_cpu : MctPBiasCPU@5e5792a0
    //turn : 14
    //------
    //Loop Start !
    //| | |○| | | | | |
    //| | | |○| | | | |
    //| | |●| |○| | | |
    //|○|○|○|○|○| | |●|
    //| | |●|●|○|○|●| |
    //| | |●| | |●| | |
    //| | | | | |●| | |
    //| | | | | | | | |
    //TURN = 14
    //PLAYER = 1
    //DISC = 8 : 10

      if (boardnum == 60){
    player = 1;
    isLastPass = false;
    data[13] = -1; data[24] = -1; data[33] = 1; data[35] = -1; data[41] = -1;
    data[42] = -1; data[43] = -1; data[44] = -1; data[45] = -1; data[48] = 1;
    data[53] = 1; data[54] = 1; data[55] = -1; data[56] = -1; data[57] = 1;
    data[63] = 1; data[66] = 1; data[76] = 1; }


    //------
    //gamecount : 61
    //b_cpu : hyoukaCPU@26653222
    //w_cpu : hyoukaCPU@3532ec19
    //turn : 28
    //------
    //Loop Start !
    //|●| | | | |●| | |
    //| |●|●| | |●| |●|
    //| | |●|●|○|○|○|●|
    //| | |●|○|○|●| |●|
    //| | |○|○|●|●| |●|
    //| | |○|○|○|○|○| |
    //| |○|●|○| |●| | |
    //|○| | | | | | | |
    //TURN = 28
    //PLAYER = 1
    //DISC = 17 : 15

      if (boardnum == 61){
    player = 1;
    isLastPass = false;
    data[11] = 1; data[16] = 1; data[22] = 1; data[23] = 1; data[26] = 1;
    data[28] = 1; data[33] = 1; data[34] = 1; data[35] = -1; data[36] = -1;
    data[37] = -1; data[38] = 1; data[43] = 1; data[44] = -1; data[45] = -1;
    data[46] = 1; data[48] = 1; data[53] = -1; data[54] = -1; data[55] = 1;
    data[56] = 1; data[58] = 1; data[63] = -1; data[64] = -1; data[65] = -1;
    data[66] = -1; data[67] = -1; data[72] = -1; data[73] = 1; data[74] = -1;
    data[76] = 1; data[81] = -1; }


    //------
    //gamecount : 62
    //b_cpu : mctCPU@68c4039c
    //w_cpu : MctPBiasCPU@ae45eb6
    //turn : 56
    //------
    //Loop Start !
    //|○|○|○|○|○|○|○|○|
    //|○|○|○|○|○|○|○|●|
    //|○|●|○|○|○|○|●|●|
    //|○|●|○|○|○|●|●|●|
    //|○|●|○|○|○|●|●| |
    //|○|●|○|○|○|●|●| |
    //|○|○|●|●|●|●|●| |
    //|○|○|○|○|○| | | |
    //TURN = 54
    //PLAYER = 1
    //DISC = 19 : 39

      if (boardnum == 62){
    player = 1;
    isLastPass = false;
    data[11] = -1; data[12] = -1; data[13] = -1; data[14] = -1; data[15] = -1;
    data[16] = -1; data[17] = -1; data[18] = -1; data[21] = -1; data[22] = -1;
    data[23] = -1; data[24] = -1; data[25] = -1; data[26] = -1; data[27] = -1;
    data[28] = 1; data[31] = -1; data[32] = 1; data[33] = -1; data[34] = -1;
    data[35] = -1; data[36] = -1; data[37] = 1; data[38] = 1; data[41] = -1;
    data[42] = 1; data[43] = -1; data[44] = -1; data[45] = -1; data[46] = 1;
    data[47] = 1; data[48] = 1; data[51] = -1; data[52] = 1; data[53] = -1;
    data[54] = -1; data[55] = -1; data[56] = 1; data[57] = 1; data[61] = -1;
    data[62] = 1; data[63] = -1; data[64] = -1; data[65] = -1; data[66] = 1;
    data[67] = 1; data[71] = -1; data[72] = -1; data[73] = 1; data[74] = 1;
    data[75] = 1; data[76] = 1; data[77] = 1; data[81] = -1; data[82] = -1;
    data[83] = -1; data[84] = -1; data[85] = -1; }


    //------
    //gamecount : 63
    //b_cpu : hyoukaCPU@59f99ea
    //w_cpu : AlphaBetaPlayer@27efef64
    //turn : 10
    //------
    //Loop Start !
    //| | | | | | | | |
    //| | | | | | | | |
    //| |●|●|●|●|●| | |
    //| | | |○|○| | | |
    //| | | |○|○| | | |
    //| | |○|○|●|●| | |
    //| | | |○| | | | |
    //| | | | | | | | |
    //TURN = 10
    //PLAYER = 1
    //DISC = 7 : 7

      if (boardnum == 63){
    player = 1;
    isLastPass = false;
    data[32] = 1; data[33] = 1; data[34] = 1; data[35] = 1; data[36] = 1;
    data[44] = -1; data[45] = -1; data[54] = -1; data[55] = -1; data[63] = -1;
    data[64] = -1; data[65] = 1; data[66] = 1; data[74] = -1; }


    //------
    //gamecount : 64
    //b_cpu : mctCPU@6f7fd0e6
    //w_cpu : mcCPU@47c62251
    //turn : 4
    //------
    //Loop Start !
    //| | | | | | | | |
    //| | | | | | | | |
    //| | |○| |○| | | |
    //| | |●|○|●|●| | |
    //| | | |●|○| | | |
    //| | | | | | | | |
    //| | | | | | | | |
    //| | | | | | | | |
    //TURN = 4
    //PLAYER = 1
    //DISC = 4 : 4

      if (boardnum == 64){
    player = 1;
    isLastPass = false;
    data[33] = -1; data[35] = -1; data[43] = 1; data[44] = -1; data[45] = 1;
    data[46] = 1; data[54] = 1; data[55] = -1; }


    //------
    //gamecount : 65
    //b_cpu : MctPBiasCPU@3e6fa38a
    //w_cpu : MctEPTCPU@66a3ffec
    //turn : 37
    //------
    //Loop Start !
    //|○|○|○|○| | | |○|
    //|○|○|○|○|○|●|○| |
    //|○|●|●|●|○|○| | |
    //| |●|●|●|○|●|●| |
    //| |●|●|●|●|●| | |
    //| |●|●|●|●|●|●| |
    //| | |○|●| |●|●| |
    //| | |●| | | | |●|
    //TURN = 37
    //PLAYER = -1
    //DISC = 25 : 16

      if (boardnum == 65){
    player = -1;
    isLastPass = false;
    data[11] = -1; data[12] = -1; data[13] = -1; data[14] = -1; data[18] = -1;
    data[21] = -1; data[22] = -1; data[23] = -1; data[24] = -1; data[25] = -1;
    data[26] = 1; data[27] = -1; data[31] = -1; data[32] = 1; data[33] = 1;
    data[34] = 1; data[35] = -1; data[36] = -1; data[42] = 1; data[43] = 1;
    data[44] = 1; data[45] = -1; data[46] = 1; data[47] = 1; data[52] = 1;
    data[53] = 1; data[54] = 1; data[55] = 1; data[56] = 1; data[62] = 1;
    data[63] = 1; data[64] = 1; data[65] = 1; data[66] = 1; data[67] = 1;
    data[73] = -1; data[74] = 1; data[76] = 1; data[77] = 1; data[83] = 1;
    data[88] = 1; }


    //------
    //gamecount : 66
    //b_cpu : MctPBiasCPU@77caeb3e
    //w_cpu : AlphaBetaPlayer@1e88b3c
    //turn : 7
    //------
    //Loop Start !
    //| | | | | | | | |
    //| | | | | | | | |
    //| | |●|●| | |●| |
    //| | |○|●|○|●| | |
    //| | | |○|●| | | |
    //| | | |○|●| | | |
    //| | | | | | | | |
    //| | | | | | | | |
    //TURN = 7
    //PLAYER = -1
    //DISC = 7 : 4

      if (boardnum == 66){
    player = -1;
    isLastPass = false;
    data[33] = 1; data[34] = 1; data[37] = 1; data[43] = -1; data[44] = 1;
    data[45] = -1; data[46] = 1; data[54] = -1; data[55] = 1; data[64] = -1;
    data[65] = 1; }


    //------
    //gamecount : 67
    //b_cpu : hyoukaCPU@42d80b78
    //w_cpu : AlphaBetaPlayer@3bfdc050
    //turn : 18
    //------
    //Loop Start !
    //| | | |●| | | | |
    //| | |●|●|●| | | |
    //| |●|○|○|●| | | |
    //| |○|○|○|●| | | |
    //| | |○|○|●|●| | |
    //| | |●|●|○|●| | |
    //| | | | | |○|●| |
    //| | | | | | | | |
    //TURN = 18
    //PLAYER = 1
    //DISC = 13 : 9

      if (boardnum == 67){
    player = 1;
    isLastPass = false;
    data[14] = 1; data[23] = 1; data[24] = 1; data[25] = 1; data[32] = 1;
    data[33] = -1; data[34] = -1; data[35] = 1; data[42] = -1; data[43] = -1;
    data[44] = -1; data[45] = 1; data[53] = -1; data[54] = -1; data[55] = 1;
    data[56] = 1; data[63] = 1; data[64] = 1; data[65] = -1; data[66] = 1;
    data[76] = -1; data[77] = 1; }


    //------
    //gamecount : 68
    //b_cpu : RandomCPU@1bce4f0a
    //w_cpu : hyoukaCPU@5e3a8624
    //turn : 8
    //------
    //Loop Start !
    //| | | | | | | | |
    //| | | | | | | | |
    //| |●| | |○|●| | |
    //| |○|●|○|●| | | |
    //| | | |●|○|○|○| |
    //| | | | | |○| | |
    //| | | | | | | | |
    //| | | | | | | | |
    //TURN = 8
    //PLAYER = 1
    //DISC = 5 : 7

      if (boardnum == 68){
    player = 1;
    isLastPass = false;
    data[32] = 1; data[35] = -1; data[36] = 1; data[42] = -1; data[43] = 1;
    data[44] = -1; data[45] = 1; data[54] = 1; data[55] = -1; data[56] = -1;
    data[57] = -1; data[66] = -1; }


    //------
    //gamecount : 69
    //b_cpu : hyoukaCPU@5c3bd550
    //w_cpu : MctPBiasCPU@91161c7
    //turn : 37
    //------
    //Loop Start !
    //| | |○|○|○|○| | |
    //| | |○|○|○|○| | |
    //|●|●|●|●|●|●|○| |
    //| | | |●|●|●|●|●|
    //|●|●|●|●|●|●|●|○|
    //|○|○|○|●| |●|●|○|
    //| |○|○| |●|●| | |
    //|○| | | | |●| | |
    //TURN = 37
    //PLAYER = -1
    //DISC = 24 : 17

      if (boardnum == 69){
    player = -1;
    isLastPass = false;
    data[13] = -1; data[14] = -1; data[15] = -1; data[16] = -1; data[23] = -1;
    data[24] = -1; data[25] = -1; data[26] = -1; data[31] = 1; data[32] = 1;
    data[33] = 1; data[34] = 1; data[35] = 1; data[36] = 1; data[37] = -1;
    data[44] = 1; data[45] = 1; data[46] = 1; data[47] = 1; data[48] = 1;
    data[51] = 1; data[52] = 1; data[53] = 1; data[54] = 1; data[55] = 1;
    data[56] = 1; data[57] = 1; data[58] = -1; data[61] = -1; data[62] = -1;
    data[63] = -1; data[64] = 1; data[66] = 1; data[67] = 1; data[68] = -1;
    data[72] = -1; data[73] = -1; data[75] = 1; data[76] = 1; data[81] = -1;
    data[86] = 1; }


    //------
    //gamecount : 70
    //b_cpu : MctPBiasCPU@604ed9f0
    //w_cpu : AlphaBetaPlayer@6a4f787b
    //turn : 52
    //------
    //Loop Start !
    //| | |●|○| | | | |
    //| | |●|○| | | |○|
    //| |●|●|○|●|●|○|○|
    //|●|○|●|○|○|○|○|○|
    //|●|○|●|○|●|○|○|○|
    //|●|○|○|○|○|○|○|○|
    //|●|○|○|○|○|○|○|○|
    //|○|○|○|○|○|○|○|○|
    //TURN = 48
    //PLAYER = 1
    //DISC = 13 : 39

      if (boardnum == 70){
    player = 1;
    isLastPass = false;
    data[13] = 1; data[14] = -1; data[23] = 1; data[24] = -1; data[28] = -1;
    data[32] = 1; data[33] = 1; data[34] = -1; data[35] = 1; data[36] = 1;
    data[37] = -1; data[38] = -1; data[41] = 1; data[42] = -1; data[43] = 1;
    data[44] = -1; data[45] = -1; data[46] = -1; data[47] = -1; data[48] = -1;
    data[51] = 1; data[52] = -1; data[53] = 1; data[54] = -1; data[55] = 1;
    data[56] = -1; data[57] = -1; data[58] = -1; data[61] = 1; data[62] = -1;
    data[63] = -1; data[64] = -1; data[65] = -1; data[66] = -1; data[67] = -1;
    data[68] = -1; data[71] = 1; data[72] = -1; data[73] = -1; data[74] = -1;
    data[75] = -1; data[76] = -1; data[77] = -1; data[78] = -1; data[81] = -1;
    data[82] = -1; data[83] = -1; data[84] = -1; data[85] = -1; data[86] = -1;
    data[87] = -1; data[88] = -1; }


    //------
    //gamecount : 71
    //b_cpu : AlphaBetaPlayer@685cb137
    //w_cpu : AlphaBetaPlayer@6a41eaa2
    //turn : 45
    //------
    //Loop Start !
    //| |○|○|○| |●| | |
    //| | |●|●|●|●|●| |
    //| |○|●|○|○|●|○| |
    //|○|○|●|○|●|○|○| |
    //|○|○|●|●|○|○|○|●|
    //|○|○|●|○|○|●|○| |
    //|○| |●|○|●|●|○| |
    //| | |●|●|●|●|○|●|
    //TURN = 45
    //PLAYER = -1
    //DISC = 23 : 26

      if (boardnum == 71){
    player = -1;
    isLastPass = false;
    data[12] = -1; data[13] = -1; data[14] = -1; data[16] = 1; data[23] = 1;
    data[24] = 1; data[25] = 1; data[26] = 1; data[27] = 1; data[32] = -1;
    data[33] = 1; data[34] = -1; data[35] = -1; data[36] = 1; data[37] = -1;
    data[41] = -1; data[42] = -1; data[43] = 1; data[44] = -1; data[45] = 1;
    data[46] = -1; data[47] = -1; data[51] = -1; data[52] = -1; data[53] = 1;
    data[54] = 1; data[55] = -1; data[56] = -1; data[57] = -1; data[58] = 1;
    data[61] = -1; data[62] = -1; data[63] = 1; data[64] = -1; data[65] = -1;
    data[66] = 1; data[67] = -1; data[71] = -1; data[73] = 1; data[74] = -1;
    data[75] = 1; data[76] = 1; data[77] = -1; data[83] = 1; data[84] = 1;
    data[85] = 1; data[86] = 1; data[87] = -1; data[88] = 1; }


    //------
    //gamecount : 72
    //b_cpu : mcCPU@7cd62f43
    //w_cpu : mcCPU@6d4b1c02
    //turn : 28
    //------
    //Loop Start !
    //|●|●|●|●|●|●|●|○|
    //|●|●|●| | |●|○| |
    //|●|●|●| |○|○|●| |
    //|●|○|●|○|○|●| | |
    //|●|○|○|○|○| | | |
    //| | | | |○| | | |
    //| | | | |○| | | |
    //| | | | | | | | |
    //TURN = 28
    //PLAYER = 1
    //DISC = 19 : 13

      if (boardnum == 72){
    player = 1;
    isLastPass = false;
    data[11] = 1; data[12] = 1; data[13] = 1; data[14] = 1; data[15] = 1;
    data[16] = 1; data[17] = 1; data[18] = -1; data[21] = 1; data[22] = 1;
    data[23] = 1; data[26] = 1; data[27] = -1; data[31] = 1; data[32] = 1;
    data[33] = 1; data[35] = -1; data[36] = -1; data[37] = 1; data[41] = 1;
    data[42] = -1; data[43] = 1; data[44] = -1; data[45] = -1; data[46] = 1;
    data[51] = 1; data[52] = -1; data[53] = -1; data[54] = -1; data[55] = -1;
    data[65] = -1; data[75] = -1; }


    //------
    //gamecount : 73
    //b_cpu : mctCPU@6093dd95
    //w_cpu : hyoukaCPU@5622fdf
    //turn : 8
    //------
    //Loop Start !
    //| | | | |○| | | |
    //| | |●| |○| | | |
    //| | |●|●|○| | | |
    //| | |●|●|○| | | |
    //| | | |○|○| | | |
    //| | |○| | | | | |
    //| | | | | | | | |
    //| | | | | | | | |
    //TURN = 8
    //PLAYER = 1
    //DISC = 5 : 7

      if (boardnum == 73){
    player = 1;
    isLastPass = false;
    data[15] = -1; data[23] = 1; data[25] = -1; data[33] = 1; data[34] = 1;
    data[35] = -1; data[43] = 1; data[44] = 1; data[45] = -1; data[54] = -1;
    data[55] = -1; data[63] = -1; }


    //------
    //gamecount : 74
    //b_cpu : hyoukaCPU@4883b407
    //w_cpu : mctCPU@7d9d1a19
    //turn : 38
    //------
    //Loop Start !
    //|○| |○| | |●| | |
    //|○| |○|●|●|●| | |
    //|○|○|○|○|○|○|○| |
    //|○|●|●|●|●|○| |○|
    //| |○|●|○|○|●| |○|
    //| |●|●|○|○|○|○|○|
    //|●|○|○| | |●| | |
    //|○|○|●| | | | | |
    //TURN = 38
    //PLAYER = 1
    //DISC = 15 : 27

      if (boardnum == 74){
    player = 1;
    isLastPass = false;
    data[11] = -1; data[13] = -1; data[16] = 1; data[21] = -1; data[23] = -1;
    data[24] = 1; data[25] = 1; data[26] = 1; data[31] = -1; data[32] = -1;
    data[33] = -1; data[34] = -1; data[35] = -1; data[36] = -1; data[37] = -1;
    data[41] = -1; data[42] = 1; data[43] = 1; data[44] = 1; data[45] = 1;
    data[46] = -1; data[48] = -1; data[52] = -1; data[53] = 1; data[54] = -1;
    data[55] = -1; data[56] = 1; data[58] = -1; data[62] = 1; data[63] = 1;
    data[64] = -1; data[65] = -1; data[66] = -1; data[67] = -1; data[68] = -1;
    data[71] = 1; data[72] = -1; data[73] = -1; data[76] = 1; data[81] = -1;
    data[82] = -1; data[83] = 1; }


    //------
    //gamecount : 75
    //b_cpu : MctEPTCPU@39c0f4a
    //w_cpu : mctCPU@1794d431
    //turn : 59
    //------
    //Loop Start !
    //|●|●|●|●|●|○|○|●|
    //|●|●|●|●|●|○|○| |
    //|●|○|●|○|●|○|○|●|
    //|●|○|○|●|●|○|○|○|
    //|●|○|○|●|○|○|○|○|
    //|●|○|●|○|○|○|○|○|
    //|●|○|○|●|○|○|○|○|
    //|●|○|○|○|○|○|○|●|
    //TURN = 59
    //PLAYER = -1
    //DISC = 26 : 37

      if (boardnum == 75){
    player = -1;
    isLastPass = false;
    data[11] = 1; data[12] = 1; data[13] = 1; data[14] = 1; data[15] = 1;
    data[16] = -1; data[17] = -1; data[18] = 1; data[21] = 1; data[22] = 1;
    data[23] = 1; data[24] = 1; data[25] = 1; data[26] = -1; data[27] = -1;
    data[31] = 1; data[32] = -1; data[33] = 1; data[34] = -1; data[35] = 1;
    data[36] = -1; data[37] = -1; data[38] = 1; data[41] = 1; data[42] = -1;
    data[43] = -1; data[44] = 1; data[45] = 1; data[46] = -1; data[47] = -1;
    data[48] = -1; data[51] = 1; data[52] = -1; data[53] = -1; data[54] = 1;
    data[55] = -1; data[56] = -1; data[57] = -1; data[58] = -1; data[61] = 1;
    data[62] = -1; data[63] = 1; data[64] = -1; data[65] = -1; data[66] = -1;
    data[67] = -1; data[68] = -1; data[71] = 1; data[72] = -1; data[73] = -1;
    data[74] = 1; data[75] = -1; data[76] = -1; data[77] = -1; data[78] = -1;
    data[81] = 1; data[82] = -1; data[83] = -1; data[84] = -1; data[85] = -1;
    data[86] = -1; data[87] = -1; data[88] = 1; }


    //------
    //gamecount : 76
    //b_cpu : AlphaBetaPlayer@42e26948
    //w_cpu : hyoukaCPU@57baeedf
    //turn : 28
    //------
    //Loop Start !
    //| | |○| | | | | |
    //| | |○|○| | | | |
    //|○|○|○|●|○|○| | |
    //|○|○|●|●|○|○| | |
    //|○|○|●|●|○|○| | |
    //|○|●|○|○|○|○| | |
    //|○| |○|○|○|○| | |
    //| | | | | | | | |
    //TURN = 28
    //PLAYER = 1
    //DISC = 6 : 26

      if (boardnum == 76){
    player = 1;
    isLastPass = false;
    data[13] = -1; data[23] = -1; data[24] = -1; data[31] = -1; data[32] = -1;
    data[33] = -1; data[34] = 1; data[35] = -1; data[36] = -1; data[41] = -1;
    data[42] = -1; data[43] = 1; data[44] = 1; data[45] = -1; data[46] = -1;
    data[51] = -1; data[52] = -1; data[53] = 1; data[54] = 1; data[55] = -1;
    data[56] = -1; data[61] = -1; data[62] = 1; data[63] = -1; data[64] = -1;
    data[65] = -1; data[66] = -1; data[71] = -1; data[73] = -1; data[74] = -1;
    data[75] = -1; data[76] = -1; }


    //------
    //gamecount : 77
    //b_cpu : AlphaBetaPlayer@343f4d3d
    //w_cpu : mctCPU@53b32d7
    //turn : 43
    //------
    //Loop Start !
    //|●|○|○|○|○|○|○| |
    //|●|○|○|○|●|○| | |
    //|●|○|●|●|○|○| | |
    //|●|○|●|●|○|○| |○|
    //|●|○|●|●|●| |○| |
    //|●|●|●|●|●|●| | |
    //|●|○|○|○|○|○|●| |
    //| | | | | |●| |●|
    //TURN = 43
    //PLAYER = -1
    //DISC = 23 : 24

      if (boardnum == 77){
    player = -1;
    isLastPass = false;
    data[11] = 1; data[12] = -1; data[13] = -1; data[14] = -1; data[15] = -1;
    data[16] = -1; data[17] = -1; data[21] = 1; data[22] = -1; data[23] = -1;
    data[24] = -1; data[25] = 1; data[26] = -1; data[31] = 1; data[32] = -1;
    data[33] = 1; data[34] = 1; data[35] = -1; data[36] = -1; data[41] = 1;
    data[42] = -1; data[43] = 1; data[44] = 1; data[45] = -1; data[46] = -1;
    data[48] = -1; data[51] = 1; data[52] = -1; data[53] = 1; data[54] = 1;
    data[55] = 1; data[57] = -1; data[61] = 1; data[62] = 1; data[63] = 1;
    data[64] = 1; data[65] = 1; data[66] = 1; data[71] = 1; data[72] = -1;
    data[73] = -1; data[74] = -1; data[75] = -1; data[76] = -1; data[77] = 1;
    data[86] = 1; data[88] = 1; }


    //------
    //gamecount : 78
    //b_cpu : hyoukaCPU@5442a311
    //w_cpu : AlphaBetaPlayer@548e7350
    //turn : 7
    //------
    //Loop Start !
    //| | | | | | | | |
    //| | | | | | | | |
    //| | | |●| | | | |
    //| | | |●|●| | | |
    //| | |●|●|○| | | |
    //| | | |○|○|○| | |
    //| | | | |○|●| | |
    //| | | | | | | | |
    //TURN = 7
    //PLAYER = -1
    //DISC = 6 : 5

      if (boardnum == 78){
    player = -1;
    isLastPass = false;
    data[34] = 1; data[44] = 1; data[45] = 1; data[53] = 1; data[54] = 1;
    data[55] = -1; data[64] = -1; data[65] = -1; data[66] = -1; data[75] = -1;
    data[76] = 1; }


    //------
    //gamecount : 79
    //b_cpu : MctPBiasCPU@1a968a59
    //w_cpu : MctEPTCPU@4667ae56
    //turn : 2
    //------
    //Loop Start !
    //| | | | | | | | |
    //| | | | | | | | |
    //| | | | | | | | |
    //| | | |○|●| | | |
    //| | | |●|○| | | |
    //| | | | |●|○| | |
    //| | | | | | | | |
    //| | | | | | | | |
    //TURN = 2
    //PLAYER = 1
    //DISC = 3 : 3

      if (boardnum == 79){
    player = 1;
    isLastPass = false;
    data[44] = -1; data[45] = 1; data[54] = 1; data[55] = -1; data[65] = 1;
    data[66] = -1; }


    //------
    //gamecount : 80
    //b_cpu : mcCPU@77cd7a0
    //w_cpu : mctCPU@204f30ec
    //turn : 14
    //------
    //Loop Start !
    //|○| | | | | | | |
    //| |○|○| | | | | |
    //| | |○|○| | | | |
    //| | |○|○|○|○| | |
    //| | |●|●|●|○| | |
    //| | | |●|○|●| | |
    //| | |●| | | |●| |
    //| | | | | | | | |
    //TURN = 14
    //PLAYER = 1
    //DISC = 7 : 11

      if (boardnum == 80){
    player = 1;
    isLastPass = false;
    data[11] = -1; data[22] = -1; data[23] = -1; data[33] = -1; data[34] = -1;
    data[43] = -1; data[44] = -1; data[45] = -1; data[46] = -1; data[53] = 1;
    data[54] = 1; data[55] = 1; data[56] = -1; data[64] = 1; data[65] = -1;
    data[66] = 1; data[73] = 1; data[77] = 1; }


    //------
    //gamecount : 81
    //b_cpu : MctPBiasCPU@e25b2fe
    //w_cpu : AlphaBetaPlayer@754ba872
    //turn : 40
    //------
    //Loop Start !
    //| | | | | | | | |
    //| | | | |●| |●| |
    //| | |●|●|●|●| | |
    //|●|●|●|●|●|●|●| |
    //|●|●|●|○|○|●|●| |
    //|●|●|○|○|○|○|○|○|
    //|●|○|●|●|●|○|○|○|
    //|○|○|○|○|○|○|○|○|
    //TURN = 40
    //PLAYER = 1
    //DISC = 24 : 20

      if (boardnum == 81){
    player = 1;
    isLastPass = false;
    data[25] = 1; data[27] = 1; data[33] = 1; data[34] = 1; data[35] = 1;
    data[36] = 1; data[41] = 1; data[42] = 1; data[43] = 1; data[44] = 1;
    data[45] = 1; data[46] = 1; data[47] = 1; data[51] = 1; data[52] = 1;
    data[53] = 1; data[54] = -1; data[55] = -1; data[56] = 1; data[57] = 1;
    data[61] = 1; data[62] = 1; data[63] = -1; data[64] = -1; data[65] = -1;
    data[66] = -1; data[67] = -1; data[68] = -1; data[71] = 1; data[72] = -1;
    data[73] = 1; data[74] = 1; data[75] = 1; data[76] = -1; data[77] = -1;
    data[78] = -1; data[81] = -1; data[82] = -1; data[83] = -1; data[84] = -1;
    data[85] = -1; data[86] = -1; data[87] = -1; data[88] = -1; }


    //------
    //gamecount : 82
    //b_cpu : MctPBiasCPU@146ba0ac
    //w_cpu : mctCPU@4dfa3a9d
    //turn : 31
    //------
    //Loop Start !
    //| | | | |○| | | |
    //| | |●|●|○|○| | |
    //| | |●|○|●|●|○| |
    //|●| |○|●|●|●| |○|
    //| |●|○|○|○|●| | |
    //| | |●|●|●|●|○|○|
    //| | |○|●|●|○|○| |
    //| | |○|●| | | |○|
    //TURN = 31
    //PLAYER = -1
    //DISC = 18 : 17

      if (boardnum == 82){
    player = -1;
    isLastPass = false;
    data[15] = -1; data[23] = 1; data[24] = 1; data[25] = -1; data[26] = -1;
    data[33] = 1; data[34] = -1; data[35] = 1; data[36] = 1; data[37] = -1;
    data[41] = 1; data[43] = -1; data[44] = 1; data[45] = 1; data[46] = 1;
    data[48] = -1; data[52] = 1; data[53] = -1; data[54] = -1; data[55] = -1;
    data[56] = 1; data[63] = 1; data[64] = 1; data[65] = 1; data[66] = 1;
    data[67] = -1; data[68] = -1; data[73] = -1; data[74] = 1; data[75] = 1;
    data[76] = -1; data[77] = -1; data[83] = -1; data[84] = 1; data[88] = -1;
    }


    //------
    //gamecount : 83
    //b_cpu : AlphaBetaPlayer@6eebc39e
    //w_cpu : mctCPU@464bee09
    //turn : 28
    //------
    //Loop Start !
    //| | | | | | | | |
    //| | | | | | | | |
    //| | |○|○|○|○| | |
    //| |○|○|○|○|○|○| |
    //|○|○|○|●|●|○| | |
    //|○|○|○|○|●|●|○| |
    //| | |○|○|○|○|○| |
    //| | |○|○|○|○| | |
    //TURN = 28
    //PLAYER = 1
    //DISC = 4 : 28

      if (boardnum == 83){
    player = 1;
    isLastPass = false;
    data[33] = -1; data[34] = -1; data[35] = -1; data[36] = -1; data[42] = -1;
    data[43] = -1; data[44] = -1; data[45] = -1; data[46] = -1; data[47] = -1;
    data[51] = -1; data[52] = -1; data[53] = -1; data[54] = 1; data[55] = 1;
    data[56] = -1; data[61] = -1; data[62] = -1; data[63] = -1; data[64] = -1;
    data[65] = 1; data[66] = 1; data[67] = -1; data[73] = -1; data[74] = -1;
    data[75] = -1; data[76] = -1; data[77] = -1; data[83] = -1; data[84] = -1;
    data[85] = -1; data[86] = -1; }


    //------
    //gamecount : 84
    //b_cpu : MctEPTCPU@f6c48ac
    //w_cpu : AlphaBetaPlayer@13deb50e
    //turn : 53
    //------
    //Loop Start !

    //------
    //gamecount : 85
    //b_cpu : AlphaBetaPlayer@239963d8
    //w_cpu : RandomCPU@3abbfa04
    //turn : 56
    //------
    //Loop Start !

    //------
    //gamecount : 86
    //b_cpu : AlphaBetaPlayer@57fffcd7
    //w_cpu : AlphaBetaPlayer@31ef45e3
    //turn : 57
    //------
    //Loop Start !
    //|○|●|●|●|●|●|●|●|
    //| |○|○|●|○|○|○|●|
    //|○|○|○|○|●|●|○|●|
    //| |○|●|●|●|●|●|●|
    //| |○|●|●|●|●|●|●|
    //|○|●|○|●|●|○|●|●|
    //|●| |●|●|●|●|●|●|
    //| |●|●|●|●|●|●|●|
    //TURN = 55
    //PLAYER = -1
    //DISC = 43 : 16

      if (boardnum == 86){
    player = -1;
    isLastPass = false;
    data[11] = -1; data[12] = 1; data[13] = 1; data[14] = 1; data[15] = 1;
    data[16] = 1; data[17] = 1; data[18] = 1; data[22] = -1; data[23] = -1;
    data[24] = 1; data[25] = -1; data[26] = -1; data[27] = -1; data[28] = 1;
    data[31] = -1; data[32] = -1; data[33] = -1; data[34] = -1; data[35] = 1;
    data[36] = 1; data[37] = -1; data[38] = 1; data[42] = -1; data[43] = 1;
    data[44] = 1; data[45] = 1; data[46] = 1; data[47] = 1; data[48] = 1;
    data[52] = -1; data[53] = 1; data[54] = 1; data[55] = 1; data[56] = 1;
    data[57] = 1; data[58] = 1; data[61] = -1; data[62] = 1; data[63] = -1;
    data[64] = 1; data[65] = 1; data[66] = -1; data[67] = 1; data[68] = 1;
    data[71] = 1; data[73] = 1; data[74] = 1; data[75] = 1; data[76] = 1;
    data[77] = 1; data[78] = 1; data[82] = 1; data[83] = 1; data[84] = 1;
    data[85] = 1; data[86] = 1; data[87] = 1; data[88] = 1; }


    //------
    //gamecount : 87
    //b_cpu : mcCPU@598067a5
    //w_cpu : mctCPU@3c0ecd4b
    //turn : 51
    //------
    //Loop Start !
    //|○|○|○|○|○|○|●|○|
    //|○|○|○|○|○|○|○|○|
    //|○|○|○|○|○|○|○|○|
    //|○|○|○|○|○|○|○|○|
    //|○|○|○|●|●|●|○|○|
    //|○|○| |●|●|●|●|○|
    //|○| |●|●|●|●|●|●|
    //|○| | | | | | | |
    //TURN = 51
    //PLAYER = -1
    //DISC = 14 : 41

      if (boardnum == 87){
    player = -1;
    isLastPass = false;
    data[11] = -1; data[12] = -1; data[13] = -1; data[14] = -1; data[15] = -1;
    data[16] = -1; data[17] = 1; data[18] = -1; data[21] = -1; data[22] = -1;
    data[23] = -1; data[24] = -1; data[25] = -1; data[26] = -1; data[27] = -1;
    data[28] = -1; data[31] = -1; data[32] = -1; data[33] = -1; data[34] = -1;
    data[35] = -1; data[36] = -1; data[37] = -1; data[38] = -1; data[41] = -1;
    data[42] = -1; data[43] = -1; data[44] = -1; data[45] = -1; data[46] = -1;
    data[47] = -1; data[48] = -1; data[51] = -1; data[52] = -1; data[53] = -1;
    data[54] = 1; data[55] = 1; data[56] = 1; data[57] = -1; data[58] = -1;
    data[61] = -1; data[62] = -1; data[64] = 1; data[65] = 1; data[66] = 1;
    data[67] = 1; data[68] = -1; data[71] = -1; data[73] = 1; data[74] = 1;
    data[75] = 1; data[76] = 1; data[77] = 1; data[78] = 1; data[81] = -1;
    }


    //------
    //gamecount : 88
    //b_cpu : RandomCPU@14bf9759
    //w_cpu : MctEPTCPU@5f341870
    //turn : 43
    //------
    //Loop Start !
    //|○|○|○| |●|○| | |
    //|●|○|●|●|●|●| |○|
    //|●|○|○|○|●|○|●|○|
    //| |●|○|○|●|○|●|○|
    //| |●|○|○|●|○|●|○|
    //| | |○|●|●|●|○|○|
    //| | |●|○|○| | |○|
    //| |●|○| |●| | | |
    //TURN = 43
    //PLAYER = -1
    //DISC = 21 : 26

      if (boardnum == 88){
    player = -1;
    isLastPass = false;
    data[11] = -1; data[12] = -1; data[13] = -1; data[15] = 1; data[16] = -1;
    data[21] = 1; data[22] = -1; data[23] = 1; data[24] = 1; data[25] = 1;
    data[26] = 1; data[28] = -1; data[31] = 1; data[32] = -1; data[33] = -1;
    data[34] = -1; data[35] = 1; data[36] = -1; data[37] = 1; data[38] = -1;
    data[42] = 1; data[43] = -1; data[44] = -1; data[45] = 1; data[46] = -1;
    data[47] = 1; data[48] = -1; data[52] = 1; data[53] = -1; data[54] = -1;
    data[55] = 1; data[56] = -1; data[57] = 1; data[58] = -1; data[63] = -1;
    data[64] = 1; data[65] = 1; data[66] = 1; data[67] = -1; data[68] = -1;
    data[73] = 1; data[74] = -1; data[75] = -1; data[78] = -1; data[82] = 1;
    data[83] = -1; data[85] = 1; }


    //------
    //gamecount : 89
    //b_cpu : MctPBiasCPU@553f17c
    //w_cpu : hyoukaCPU@4f7d0008
    //turn : 13
    //------
    //Loop Start !
    //| | | | | | | | |
    //| | | | | | | | |
    //| | |●| |○|●|○| |
    //| | | |●|●|●| | |
    //| | | |●|○|●| | |
    //| | | |●|●|●|●| |
    //| | | |●| |●| | |
    //| | | | |●| | | |
    //TURN = 13
    //PLAYER = -1
    //DISC = 14 : 3

      if (boardnum == 89){
    player = -1;
    isLastPass = false;
    data[33] = 1; data[35] = -1; data[36] = 1; data[37] = -1; data[44] = 1;
    data[45] = 1; data[46] = 1; data[54] = 1; data[55] = -1; data[56] = 1;
    data[64] = 1; data[65] = 1; data[66] = 1; data[67] = 1; data[74] = 1;
    data[76] = 1; data[85] = 1; }


    //------
    //gamecount : 90
    //b_cpu : mctCPU@271053e1
    //w_cpu : mctCPU@589838eb
    //turn : 36
    //------
    //Loop Start !
    //| | |○|○| |○| |●|
    //| | |○|○|○|●|●|○|
    //|●|●|●|○|●|●|●|●|
    //| |●|●|●|○|●|●|●|
    //|○|○|○|●|○|○|○| |
    //|○|○|○|○| | |○|○|
    //| | |○|○| | | | |
    //| | | | | | | | |
    //TURN = 36
    //PLAYER = 1
    //DISC = 17 : 23

      if (boardnum == 90){
    player = 1;
    isLastPass = false;
    data[13] = -1; data[14] = -1; data[16] = -1; data[18] = 1; data[23] = -1;
    data[24] = -1; data[25] = -1; data[26] = 1; data[27] = 1; data[28] = -1;
    data[31] = 1; data[32] = 1; data[33] = 1; data[34] = -1; data[35] = 1;
    data[36] = 1; data[37] = 1; data[38] = 1; data[42] = 1; data[43] = 1;
    data[44] = 1; data[45] = -1; data[46] = 1; data[47] = 1; data[48] = 1;
    data[51] = -1; data[52] = -1; data[53] = -1; data[54] = 1; data[55] = -1;
    data[56] = -1; data[57] = -1; data[61] = -1; data[62] = -1; data[63] = -1;
    data[64] = -1; data[67] = -1; data[68] = -1; data[73] = -1; data[74] = -1;
    }


    //------
    //gamecount : 91
    //b_cpu : MctEPTCPU@42dafa95
    //w_cpu : hyoukaCPU@6500df86
    //turn : 32
    //------
    //Loop Start !
    //|●| |●| | | | | |
    //|●| |●|○| |○| | |
    //|●|○|●|○|○| | | |
    //| |●|○|○|●|○| | |
    //| |●|○|○|○|○|○| |
    //|●|○|●|●|○|○|○|○|
    //|●| | |●|○| | | |
    //|●| | | |○|●| | |
    //TURN = 32
    //PLAYER = 1
    //DISC = 16 : 20

      if (boardnum == 91){
    player = 1;
    isLastPass = false;
    data[11] = 1; data[13] = 1; data[21] = 1; data[23] = 1; data[24] = -1;
    data[26] = -1; data[31] = 1; data[32] = -1; data[33] = 1; data[34] = -1;
    data[35] = -1; data[42] = 1; data[43] = -1; data[44] = -1; data[45] = 1;
    data[46] = -1; data[52] = 1; data[53] = -1; data[54] = -1; data[55] = -1;
    data[56] = -1; data[57] = -1; data[61] = 1; data[62] = -1; data[63] = 1;
    data[64] = 1; data[65] = -1; data[66] = -1; data[67] = -1; data[68] = -1;
    data[71] = 1; data[74] = 1; data[75] = -1; data[81] = 1; data[85] = -1;
    data[86] = 1; }


    //------
    //gamecount : 92
    //b_cpu : AlphaBetaPlayer@402a079c
    //w_cpu : mcCPU@59ec2012
    //turn : 43
    //------
    //Loop Start !
    //| | |○|○|○| | | |
    //| | |○|○|○| | |●|
    //|○|○|○|●|○|○|●| |
    //|○|○|●|●|●|●|○|○|
    //| |○|●|●|●|●|○|●|
    //| |○|○|●|●|○|●|●|
    //| | |○|○|○|●|○|●|
    //| | | |○|●|●|○|●|
    //TURN = 43
    //PLAYER = -1
    //DISC = 21 : 26

      if (boardnum == 92){
    player = -1;
    isLastPass = false;
    data[13] = -1; data[14] = -1; data[15] = -1; data[23] = -1; data[24] = -1;
    data[25] = -1; data[28] = 1; data[31] = -1; data[32] = -1; data[33] = -1;
    data[34] = 1; data[35] = -1; data[36] = -1; data[37] = 1; data[41] = -1;
    data[42] = -1; data[43] = 1; data[44] = 1; data[45] = 1; data[46] = 1;
    data[47] = -1; data[48] = -1; data[52] = -1; data[53] = 1; data[54] = 1;
    data[55] = 1; data[56] = 1; data[57] = -1; data[58] = 1; data[62] = -1;
    data[63] = -1; data[64] = 1; data[65] = 1; data[66] = -1; data[67] = 1;
    data[68] = 1; data[73] = -1; data[74] = -1; data[75] = -1; data[76] = 1;
    data[77] = -1; data[78] = 1; data[84] = -1; data[85] = 1; data[86] = 1;
    data[87] = -1; data[88] = 1; }


    //------
    //gamecount : 93
    //b_cpu : AlphaBetaPlayer@4cf777e8
    //w_cpu : mcCPU@2f686d1f
    //turn : 8
    //------
    //Loop Start !
    //| | | | | | | | |
    //| | | | | | | | |
    //| | |○|○|○| | | |
    //| |○|○|○|○|○| | |
    //| | | |●|●|●|○| |
    //| | | | | | | | |
    //| | | | | | | | |
    //| | | | | | | | |
    //TURN = 8
    //PLAYER = 1
    //DISC = 3 : 9

      if (boardnum == 93){
    player = 1;
    isLastPass = false;
    data[33] = -1; data[34] = -1; data[35] = -1; data[42] = -1; data[43] = -1;
    data[44] = -1; data[45] = -1; data[46] = -1; data[54] = 1; data[55] = 1;
    data[56] = 1; data[57] = -1; }


    //------
    //gamecount : 94
    //b_cpu : MctEPTCPU@3fee9989
    //w_cpu : RandomCPU@73ad2d6
    //turn : 39
    //------
    //Loop Start !
    //| |●|●|●|●|●|●|●|
    //| |●|●|●|●|●|●|●|
    //|●|●|●|○|○|●|●|●|
    //| | | |○|○|○| | |
    //| | |○|○|●|○|○| |
    //| | | |○|○|●|○|○|
    //| | | |○|○|○|○|○|
    //| | | | | |○| |●|
    //TURN = 38
    //PLAYER = -1
    //DISC = 23 : 19

      if (boardnum == 94){
    player = -1;
    isLastPass = false;
    data[12] = 1; data[13] = 1; data[14] = 1; data[15] = 1; data[16] = 1;
    data[17] = 1; data[18] = 1; data[22] = 1; data[23] = 1; data[24] = 1;
    data[25] = 1; data[26] = 1; data[27] = 1; data[28] = 1; data[31] = 1;
    data[32] = 1; data[33] = 1; data[34] = -1; data[35] = -1; data[36] = 1;
    data[37] = 1; data[38] = 1; data[44] = -1; data[45] = -1; data[46] = -1;
    data[53] = -1; data[54] = -1; data[55] = 1; data[56] = -1; data[57] = -1;
    data[64] = -1; data[65] = -1; data[66] = 1; data[67] = -1; data[68] = -1;
    data[74] = -1; data[75] = -1; data[76] = -1; data[77] = -1; data[78] = -1;
    data[86] = -1; data[88] = 1; }


    //------
    //gamecount : 95
    //b_cpu : MctPBiasCPU@7085bdee
    //w_cpu : mctCPU@1ce92674
    //turn : 15
    //------
    //Loop Start !
    //| | |●| |●| | | |
    //| | | |●|●| | | |
    //| | | | |●| | | |
    //| | |○|○|●|●|●| |
    //| | | |○|●|●| | |
    //| | | |●|○|●|●| |
    //| | | | |○|○| | |
    //| | | | | | | | |
    //TURN = 15
    //PLAYER = -1
    //DISC = 13 : 6

      if (boardnum == 95){
    player = -1;
    isLastPass = false;
    data[13] = 1; data[15] = 1; data[24] = 1; data[25] = 1; data[35] = 1;
    data[43] = -1; data[44] = -1; data[45] = 1; data[46] = 1; data[47] = 1;
    data[54] = -1; data[55] = 1; data[56] = 1; data[64] = 1; data[65] = -1;
    data[66] = 1; data[67] = 1; data[75] = -1; data[76] = -1; }


    //------
    //gamecount : 96
    //b_cpu : mctCPU@5700d6b1
    //w_cpu : mctCPU@6fd02e5
    //turn : 14
    //------
    //Loop Start !
    //| | | | | | | | |
    //| | | | | |●| | |
    //| | |○| |●| | | |
    //| | |○|○|○| | | |
    //|○| |○|●|○| | | |
    //|●|○|○|●| | | | |
    //| | |○| |●| | | |
    //| | |●|○| | | | |
    //TURN = 14
    //PLAYER = 1
    //DISC = 7 : 11

      if (boardnum == 96){
    player = 1;
    isLastPass = false;
    data[26] = 1; data[33] = -1; data[35] = 1; data[43] = -1; data[44] = -1;
    data[45] = -1; data[51] = -1; data[53] = -1; data[54] = 1; data[55] = -1;
    data[61] = 1; data[62] = -1; data[63] = -1; data[64] = 1; data[73] = -1;
    data[75] = 1; data[83] = 1; data[84] = -1; }


    //------
    //gamecount : 97
    //b_cpu : MctPBiasCPU@5bcab519
    //w_cpu : MctPBiasCPU@e45f292
    //turn : 43
    //------
    //Loop Start !
    //| | | | | | | | |
    //| |○|○|○|○|●|○|○|
    //|●|○|○|○|●|●|○|○|
    //|○|○|○|○|○|●|○|○|
    //|●|●|○|●|○|○|●|●|
    //|●|●|●|●|●|●|●|●|
    //| | |○|●| |●|●| |
    //| | |●|●|●| | |●|
    //TURN = 43
    //PLAYER = -1
    //DISC = 25 : 22

      if (boardnum == 97){
    player = -1;
    isLastPass = false;
    data[22] = -1; data[23] = -1; data[24] = -1; data[25] = -1; data[26] = 1;
    data[27] = -1; data[28] = -1; data[31] = 1; data[32] = -1; data[33] = -1;
    data[34] = -1; data[35] = 1; data[36] = 1; data[37] = -1; data[38] = -1;
    data[41] = -1; data[42] = -1; data[43] = -1; data[44] = -1; data[45] = -1;
    data[46] = 1; data[47] = -1; data[48] = -1; data[51] = 1; data[52] = 1;
    data[53] = -1; data[54] = 1; data[55] = -1; data[56] = -1; data[57] = 1;
    data[58] = 1; data[61] = 1; data[62] = 1; data[63] = 1; data[64] = 1;
    data[65] = 1; data[66] = 1; data[67] = 1; data[68] = 1; data[73] = -1;
    data[74] = 1; data[76] = 1; data[77] = 1; data[83] = 1; data[84] = 1;
    data[85] = 1; data[88] = 1; }


    //------
    //gamecount : 98
    //b_cpu : MctPBiasCPU@5f2108b5
    //w_cpu : MctEPTCPU@31a5c39e
    //turn : 14
    //------
    //Loop Start !
    //| | | | | | | | |
    //| | | |○|●| | | |
    //| | |○|○|○|○|○| |
    //| | | |○|●| |●| |
    //| | | |●|●|●| | |
    //| | | | |●|●| | |
    //| | | | |●|●| | |
    //| | | |●| | | | |
    //TURN = 14
    //PLAYER = 1
    //DISC = 11 : 7

      if (boardnum == 98){
    player = 1;
    isLastPass = false;
    data[24] = -1; data[25] = 1; data[33] = -1; data[34] = -1; data[35] = -1;
    data[36] = -1; data[37] = -1; data[44] = -1; data[45] = 1; data[47] = 1;
    data[54] = 1; data[55] = 1; data[56] = 1; data[65] = 1; data[66] = 1;
    data[75] = 1; data[76] = 1; data[84] = 1; }


    //------
    //gamecount : 99
    //b_cpu : MctPBiasCPU@3f49dace
    //w_cpu : hyoukaCPU@1e397ed7
    //turn : 31
    //------
    //Loop Start !
    //|●|●| | | | | | |
    //|●|●|●| | | | | |
    //|●|●|○|●|○|○| | |
    //|●|●|●|○|●| |○| |
    //|●|●|●|○|●|●| | |
    //|●|●|●|●|●|●|●| |
    //|●| |○| | | | | |
    //| |○|○|○| | | | |
    //TURN = 31
    //PLAYER = -1
    //DISC = 25 : 10

      if (boardnum == 99){
    player = -1;
    isLastPass = false;
    data[11] = 1; data[12] = 1; data[21] = 1; data[22] = 1; data[23] = 1;
    data[31] = 1; data[32] = 1; data[33] = -1; data[34] = 1; data[35] = -1;
    data[36] = -1; data[41] = 1; data[42] = 1; data[43] = 1; data[44] = -1;
    data[45] = 1; data[47] = -1; data[51] = 1; data[52] = 1; data[53] = 1;
    data[54] = -1; data[55] = 1; data[56] = 1; data[61] = 1; data[62] = 1;
    data[63] = 1; data[64] = 1; data[65] = 1; data[66] = 1; data[67] = 1;
    data[71] = 1; data[73] = -1; data[82] = -1; data[83] = -1; data[84] = -1;
    }


    //------
    //gamecount : 100
    //b_cpu : RandomCPU@490ab905
    //w_cpu : MctEPTCPU@56ac3a89
    //turn : 57
    //------
    //Loop Start !
    //|○|○|○|○|○|○|○|○|
    //|○|●|●|●|●|●|●|○|
    //|○|●|○|○|●|○|○|○|
    //|○|●|●|○|○|●|○|○|
    //|○|●|○|●|●|○|○|○|
    //|○|●|●|●|●|○|○|○|
    //|○|●|●|○|○|○|○|○|
    //|○|●|●| |●| | |○|
    //TURN = 57
    //PLAYER = -1
    //DISC = 23 : 38

      if (boardnum == 100){
    player = -1;
    isLastPass = false;
    data[11] = -1; data[12] = -1; data[13] = -1; data[14] = -1; data[15] = -1;
    data[16] = -1; data[17] = -1; data[18] = -1; data[21] = -1; data[22] = 1;
    data[23] = 1; data[24] = 1; data[25] = 1; data[26] = 1; data[27] = 1;
    data[28] = -1; data[31] = -1; data[32] = 1; data[33] = -1; data[34] = -1;
    data[35] = 1; data[36] = -1; data[37] = -1; data[38] = -1; data[41] = -1;
    data[42] = 1; data[43] = 1; data[44] = -1; data[45] = -1; data[46] = 1;
    data[47] = -1; data[48] = -1; data[51] = -1; data[52] = 1; data[53] = -1;
    data[54] = 1; data[55] = 1; data[56] = -1; data[57] = -1; data[58] = -1;
    data[61] = -1; data[62] = 1; data[63] = 1; data[64] = 1; data[65] = 1;
    data[66] = -1; data[67] = -1; data[68] = -1; data[71] = -1; data[72] = 1;
    data[73] = 1; data[74] = -1; data[75] = -1; data[76] = -1; data[77] = -1;
    data[78] = -1; data[81] = -1; data[82] = 1; data[83] = 1; data[85] = 1;
    data[88] = -1; }


  }
}
