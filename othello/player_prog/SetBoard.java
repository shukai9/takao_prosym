import java.util.*;
import java.util.Scanner;

public class SetBoard {
  final static int SIZE = 100;

  // int data[] = new int[SIZE];
  // int player;
   int black;
   int white;
  // boolean isLastPass;


  public SetBoard(){}

  public void set(int boardnum, GameState state){
    BoardData1 board1 = new BoardData1(boardnum);
    BoardData2 board2 = new BoardData2(boardnum);
    BoardData3 board3 = new BoardData3(boardnum);
    BoardData4 board4 = new BoardData4(boardnum);
    BoardData5 board5 = new BoardData5(boardnum);
    if (boardnum <= 200) {
      state.player = board1.player;
      state.isLastPass = board1.isLastPass;
      for (int i = 11; i < SIZE; i++){
        state.data[i] = board1.data[i];
        if (board1.data[i] == 1) black++;
        else if (board1.data[i] == -1) white++;
      }
    }
    else if (boardnum > 200 && boardnum <= 400) {
      state.player = board2.player;
      state.isLastPass = board2.isLastPass;
      for (int i = 11; i < SIZE; i++){
        state.data[i] = board2.data[i];
        if (board2.data[i] == 1) black++;
        else if (board2.data[i] == -1) white++;
      }
    }
    else if (boardnum > 400 && boardnum <= 600) {
      state.player = board3.player;
      state.isLastPass = board3.isLastPass;
      for (int i = 11; i < SIZE; i++){
        state.data[i] = board3.data[i];
        if (board3.data[i] == 1) black++;
        else if (board3.data[i] == -1) white++;
      }
    }
    else if (boardnum > 600 && boardnum <= 800) {
      state.player = board4.player;
      state.isLastPass = board4.isLastPass;
      for (int i = 11; i < SIZE; i++){
        state.data[i] = board4.data[i];
        if (board4.data[i] == 1) black++;
        else if (board4.data[i] == -1) white++;
      }
    }
    else if (boardnum > 800) {
      state.player = board5.player;
      state.isLastPass = board5.isLastPass;
      for (int i = 11; i < SIZE; i++){
        state.data[i] = board5.data[i];
        if (board5.data[i] == 1) black++;
        else if (board5.data[i] == -1) white++;
      }
    }

  }

}
