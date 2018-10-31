import java.util.*;
import java.util.Scanner;

public class MainPanel3 {
    //Game status
    GameState state = new GameState();

    double rateB = 1500, rateW = 1500;
    //CPU class
    CPU b_cpu = new CPU(1);
    CPU w_cpu = new CPU(-1);

    //勝敗結果の格納
    int winCount[] = new int[3];

    int bnum = 0; //盤面
    int plong = 0; //ゲームを進める手数


    public MainPanel3() {
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

  bnum = 0; //通常盤面

  //盤面を何手進めるのか
  System.out.println("Please input how many moves game");
  plong = scan.nextInt();

  normalGame(plong);
}



    //通常のゲーム
    public void normalGame(int plong) {
	System.out.println();
		game(plong);
		state.reset(bnum);
		b_cpu.reset();
		w_cpu.reset();

	System.out.println();
    }

    //描写を行うメソッド
    public void textDisplay() {
	System.out.println();

	//左上からマスと駒を表示
	for(int y = 1; y <= 8; y++) {
	    for(int x = 1; x <= 8; x++) {
		System.out.print("|");
		switch(state.data[x + y * 10]) {
		case 1:
		    System.out.print("●"); //黒の駒
		    break;
		case -1:
		    System.out.print("○"); //白の駒
		    break;
		default:
		    System.out.print(" ");
		}
	    }
	    System.out.println("|");
	}
	System.out.println("TURN = " + state.turn);
	System.out.println("PLAYER = " + state.player);
	System.out.println("DISC = " + state.black + " : " + state.white);
	System.out.println("\n \n");
    }

    public void game(int plong) {
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
		state.put(action[0], action[1]); // (x, y)
    //Zebraの棋譜入力用
    int firstIndex = (int)'A'; // アルファベットの最初の文字
    String s = String.valueOf((char)(firstIndex + action[0] - 1));
    System.out.print(s + action[1]);
	    }
	    else { //white
		//置く場所はCPU内のdecideメソッドで決定
		int action[] = w_cpu.decide(state);
		if(action[0] == -1 || action[1] == -1) { throw
			new RuntimeException("Illegal Move by White : (-1, -1)" );
		}
		//置ける場所がある場合のみ駒を置く処理を実行
		state.put(action[0], action[1]);
    //Zebraの棋譜入力用
    int firstIndex = (int)'A'; // アルファベットの最初の文字
    String s = String.valueOf((char)(firstIndex + action[0] - 1));
    System.out.print(s + action[1]);
	    }
      // 指定のターンに実行
      int flag = 1;
      if (state.turn==plong){
        System.out.println();
        textDisplay();
         for (int y = 1; y < 9; y++){
           for (int x = 1; x < 9; x++){
             if (state.data[x+y*10]==1 || state.data[x+y*10]==-1){
               System.out.print("data[" + (x+y*10) + "] = " + state.data[x+y*10] + " ");
               flag++;
               if (flag == 6){ System.out.println(); flag = 1;}
             }
           }
         }
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
