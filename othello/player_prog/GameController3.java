import java.util.*;
import java.util.Scanner;

public class GameController3 {
  //CPU class
  CPU[] cpus; // 0 -> black, 1 -> white

  //勝敗結果の格納
  int winCount[] = new int[3];

  //進捗状況の表示間隔
  int bnum = 0;
  int lastturn;

  public GameController3(int count, CPU b_cpu, CPU w_cpu, int turn) {
    cpus = new CPU[2];
    cpus[0] = b_cpu;
    cpus[1] = w_cpu;
    lastturn = turn;

    normalGame(count);
  }


  //通常のゲーム
  public void normalGame(int count) {
    System.out.println("//Loop Start !");
      game(count);
  }

  void addMove(StringBuffer movesequence, int[] action) {
    movesequence.append((char)('a' + action[0] - 1));
    movesequence.append(action[1]);
  }


  public void game(int count) {
    //Game status
    GameState state = new GameState();
    state.reset(bnum, state);
    cpus[0].reset();
    cpus[1].reset();

    StringBuffer movesequence = new StringBuffer();
    // ゲームのループ
    for(int i = 1;;i++) {
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

      //指定のターンに実行
      if(lastturn==i){
        state.textDisplay();
        System.out.println("  if (boardnum == " + count + "){");
        System.out.println("player = " + state.player + ";");
        System.out.println("isLastPass = " + state.isLastPass + ";");
        int flag = 1; // 出力の体裁を整える
        for (int y = 1; y < 9; y++) {
          for (int x = 1; x < 9; x++) {
            if (state.data[x+y*10]==1 || state.data[x+y*10]==-1) {
              System.out.print("data[" + (x+y*10) + "] = " + state.data[x+y*10] + ";" + " ");
              flag++;
              if (flag == 6) { System.out.println(); flag = 1; }
            }
          }
        }
        System.out.println("}");
        System.out.println();
        //ゲーム終了時
        System.out.println("//moves: " + movesequence);
        switch (state.Win()) {
        case 1:
          winCount[0] ++;
          // System.out.println("//endgame: black win");
          break;
        case -1:
          winCount[1] ++;
          //System.out.println("//endgame: white win");
          break;
        case 0:
          winCount[2] ++;
          //System.out.println("//endgame: draw");
          break;
        }
        System.out.println();
        break;
      }
    }
  }

}
