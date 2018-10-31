import java.util.*;
import java.util.Scanner;

public class MainPanel {
    //Game status
    GameState state = new GameState();

    double rateB = 1500, rateW = 1500;
    //CPU class
    CPU b_cpu = new CPU(1);
    CPU w_cpu = new CPU(-1);

    //勝敗結果の格納
    int winCount[] = new int[3];

    //進捗状況の表示間隔
    int lookGame = 100;
    int bnum = 0;


    public MainPanel(int count) {
	Scanner scan = new Scanner(System.in);

	//Black Player
  System.out.println("RandomCPU : 1");
	System.out.println("hyoukaCPU : 2");
	System.out.println("hyouka2CPU : 3");
	System.out.println("Monte Carlo : 4");
	System.out.println("Monte Carlo Tree: 5");
	System.out.println("Monte Carlo Tree2 : 6");
	System.out.println("Monte Carlo Tree + Cost function : 7");
	System.out.println("Monte Carlo Tree + Cost Function2 : 8");
	System.out.println("AlphaBetaPlayer1 : 9");
	System.out.println("AlphaBetaPlayer2 : 10");
	System.out.println("AlphaBetaPlayer3 : 11");

	int val = scan.nextInt();
  if(val == 1)b_cpu = new RandomCPU(1);
  else if(val == 2)b_cpu = new hyoukaCPU(1);
  else if(val == 3)b_cpu = new hyouka2CPU(1);
  else if(val == 4)b_cpu = new mcCPU(1);
  else if(val == 5)b_cpu = new mctCPU(1);
  else if(val == 6)b_cpu = new mct2CPU(1);
  else if(val == 7)b_cpu = new hmctCPU(1);
  else if(val == 8)b_cpu = new hmct2CPU(1);
  else if(val == 9)b_cpu = new AlphaBetaPlayer(1, 1, 0); // (先攻後攻, 探索の深さ, パターン(デフォルトが0))
  else if(val == 10)b_cpu = new AlphaBetaPlayer(1, 2, 0); // (先攻後攻, 探索の深さ, パターン(デフォルトが0))
  else if(val == 11)b_cpu = new AlphaBetaPlayer(1, 3, 0); // (先攻後攻, 探索の深さ, パターン(デフォルトが0))
	else {
	    System.out.println("Unspecified character was entered");
	    return;
	}

	//White Player
  System.out.println("Please select White Player");
	System.out.println("RandomCPU : 1");
	System.out.println("hyoukaCPU : 2");
	System.out.println("hyouka2CPU : 3");
	System.out.println("Monte Carlo : 4");
	System.out.println("Monte Carlo Tree: 5");
	System.out.println("Monte Carlo Tree2 : 6");
	System.out.println("Monte Carlo Tree + Cost function : 7");
	System.out.println("Monte Carlo Tree + Cost Function2 : 8");
	System.out.println("AlphaBetaPlayer1 : 9");
	System.out.println("AlphaBetaPlayer2 : 10");
	System.out.println("AlphaBetaPlayer3 : 11");

	val = scan.nextInt();
  if(val == 1)w_cpu = new RandomCPU(-1);
  else if(val == 2)w_cpu = new hyoukaCPU(-1);
  else if(val == 3)w_cpu = new hyouka2CPU(-1);
  else if(val == 4)w_cpu = new mcCPU(-1);
  else if(val == 5)w_cpu = new mctCPU(-1);
  else if(val == 6)w_cpu = new mct2CPU(-1);
  else if(val == 7)w_cpu = new hmctCPU(-1);
  else if(val == 8)w_cpu = new hmct2CPU(-1);
  else if(val == 9)w_cpu = new AlphaBetaPlayer(-1, 1, 0); // (先攻後攻, 探索の深さ, パターン(デフォルトが0))
  else if(val == 10)w_cpu = new AlphaBetaPlayer(-1, 2, 0); // (先攻後攻, 探索の深さ, パターン(デフォルトが0))
  else if(val == 11)w_cpu = new AlphaBetaPlayer(-1, 3, 0); // (先攻後攻, 探索の深さ, パターン(デフォルトが0))
	else {
	    System.out.println("Unspecified character was entered");
	    return;
	}

  System.out.println("Please select board number");
  System.out.println("Noamal board : 0");
  System.out.println("Board number : 1");
  System.out.println("Board number : 2");
  System.out.println("Board number : 3");
  System.out.println("Board number : 4");
  System.out.println("Board number : 5");
  System.out.println("Board number : 6");
  System.out.println("Board number : 7");
  System.out.println("Board number : 8");
  System.out.println("Board number : 9");
  System.out.println("Board number : 10");
  System.out.println("Board number : 11");
  System.out.println("Board number : 12");

  val = scan.nextInt();
  if (val == 0) bnum = 0;
  else if (val == 1) bnum = 1;
  else if (val == 2) bnum = 2;
  else if (val == 3) bnum = 3;
  else if (val == 4) bnum = 4;
  else if (val == 5) bnum = 5;
  else if (val == 6) bnum = 6;
  else if (val == 7) bnum = 7;
  else if (val == 8) bnum = 8;
  else if (val == 9) bnum = 9;
  else if (val == 10) bnum = 10;
  else if (val == 11) bnum = 11;
  else if (val == 12) bnum = 12;
  else {
    System.out.println("Unspecified character was entered");
    return;
  }

	normalGame(count);
}



    //通常のゲーム
    public void normalGame(int count) {
	System.out.println();
	System.out.println("Loop Start !");
	for(int i = 0; i < count; i++) {
	    if(i % lookGame == 0) {
		System.out.println("Now Game is " + i);
	    }
		game();
		state.reset(bnum);
		b_cpu.reset();
		w_cpu.reset();
	}

	System.out.println();
	System.out.println("---Loop END---");
	System.out.println("Black win : " + winCount[0]);
	System.out.println("White win : " + winCount[1]);
	System.out.println("Draw      : " + winCount[2]);
    }


    public void game() {
	boolean isLastPass = false;

	for(;;) {
	    //置く場所がなければパス
	    if(state.checkPass() == true) {
		if(isLastPass) {
		    endGame();
		    break;
		}
		state.player *= -1;
		isLastPass = true;
		continue;
	    }
	    isLastPass = false;

	    //置く場所がある
	    if(state.player == b_cpu.color) { //Black

		//置く場所はCPU内のdecideメソッドで決定
		int action[] = b_cpu.decide(state);
		if(action[0] == -1 || action[1] == -1) { throw
			new RuntimeException("Illegal Move by Black : (-1, -1)" );
		}
		//置ける場所がある場合のみ駒を置く処理を実行
		state.put(action[0], action[1]);
	    }
	    else { //white
		//置く場所はCPU内のdecideメソッドで決定
		int action[] = w_cpu.decide(state);
		if(action[0] == -1 || action[1] == -1) { throw
			new RuntimeException("Illegal Move by White : (-1, -1)" );
		}
		//置ける場所がある場合のみ駒を置く処理を実行
		state.put(action[0], action[1]);
	    }
	}
    }

    //ゲーム終了時に勝ち負けの数を追加
    public void endGame() {
	int End = state.Win();
	if(End == 1) {
	    winCount[0] ++;
	} else if(End == -1) {
	    winCount[1] ++;
	} else {
	    winCount[2] ++;
	}
    }

}
