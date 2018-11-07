import java.util.*;
import java.util.Scanner;

public class GameController {
  //CPU class
  CPU[] cpus; // 0 -> black, 1 -> white

  //勝敗結果の格納
  int winCount[] = new int[3];

  //進捗状況の表示間隔
  int bnum = 0;


  public GameController(int count, CPU b_cpu, CPU w_cpu) {
    cpus = new CPU[2];
    cpus[0] = b_cpu;
    cpus[1] = w_cpu;

    normalGame(count);
  }

  //通常のゲーム
  public void normalGame(int count) {
    System.out.println("Loop Start !");
    for(int i = 0; i < count; i++) {
      System.out.printf("starting game: %d\n", i+1);
      game();
    }

    System.out.println();
    System.out.println("---Loop END---");
    System.out.println("Black win : " + winCount[0]);
    System.out.println("White win : " + winCount[1]);
    System.out.println("Draw      : " + winCount[2]);
  }

  void addMove(StringBuffer movesequence, int[] action) {
    movesequence.append((char)('a' + action[0] - 1));
    movesequence.append(action[1]);
  }


  public void game() {
    //Game status
    GameState state = new GameState();
    state.reset(bnum);
    cpus[0].reset();
    cpus[1].reset();

    StringBuffer movesequence = new StringBuffer();
    // ゲームのループ
    for(;;) {
      //置く場所がなければパス
      if(state.checkPass()) {
        if (state.isLastPass) break;
        state.pass();
        continue;
      }

      //置く場所がある
      int playerIndex = (state.player == cpus[0].color) ? 0 : 1;
      int action[] = cpus[playerIndex].decide(state);
      if(action[0] == -1 || action[1] == -1) {
        throw new RuntimeException(String.format("Illegal Move by %s: no position", playerIndex == 0 ? "Black" : "White"));
      }
      //置ける場所がある場合のみ駒を置く処理を実行
      state.put(action[0], action[1]);
      addMove(movesequence, action);
    }

    //ゲーム終了時
    System.out.println("moves: " + movesequence);
    switch (state.Win()) {
    case 1:
      winCount[0] ++;
      System.out.println("endgame: black win");
      break;
    case -1:
      winCount[1] ++;
      System.out.println("endgame: white win");
      break;
    case 0:
      winCount[2] ++;
      System.out.println("endgame: draw");
      break;
    }

  }

}
