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
	System.out.println("AlphaBetaPlayer : 9");

	int val = scan.nextInt();
  if(val == 1)b_cpu = new RandomCPU(1);
  else if(val == 2)b_cpu = new hyoukaCPU(1);
  else if(val == 3)b_cpu = new hyouka2CPU(1);
  else if(val == 4)b_cpu = new mcCPU(1);
  else if(val == 5)b_cpu = new mctCPU(1);
  else if(val == 6)b_cpu = new mct2CPU(1);
  else if(val == 7)b_cpu = new hmctCPU(1);
  else if(val == 8)b_cpu = new hmct2CPU(1);
  else if(val == 9)b_cpu = new AlphaBetaPlayer(1, 3, 0); // (先攻後攻, 探索の深さ, パターン(デフォルトが0))
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
	System.out.println("AlphaBetaPlayer : 9");

	val = scan.nextInt();
  if(val == 1)w_cpu = new RandomCPU(-1);
  else if(val == 2)w_cpu = new hyoukaCPU(-1);
  else if(val == 3)w_cpu = new hyouka2CPU(-1);
  else if(val == 4)w_cpu = new mcCPU(-1);
  else if(val == 5)w_cpu = new mctCPU(-1);
  else if(val == 6)w_cpu = new mct2CPU(-1);
  else if(val == 7)w_cpu = new hmctCPU(-1);
  else if(val == 8)w_cpu = new hmct2CPU(-1);
  else if(val == 9)w_cpu = new AlphaBetaPlayer(-1, 3, 0); // (先攻後攻, 探索の深さ, パターン(デフォルトが0))
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

	//ゲームの種類を選択
	System.out.println("Please select to do");
	System.out.println("Normal Game : 1");
	System.out.println("Normal Game + Survey Playout & Time : 2");
	System.out.println("Decide Threshold : 3");
	System.out.println("Decide UCB1's C : 4");
	System.out.println("Decide FPU : 5");
  System.out.println("Calculate Rate : 6");
  System.out.println("Calculate Rate2 : 7 rateB rateW");

	val = scan.nextInt();
  if(val == 7) {
    rateB = scan.nextInt();
    rateW = scan.nextInt();
  }

	if(val == 1) normalGame(count); //通常
	else if(val == 2) timeGame(count); //時間測定とプレイアウト回数あり
	else if(val == 3) decideThreshold(count); //閾値あり
	else if(val == 4) decideC(count); //UCB1値のCを最適化
	else if(val == 5) decideFPU(count); //FPUの最適値を求める
  else if(val == 6) decideRate(count, 1500, 1500); //rateの初期値が1500の時
  else if(val == 7) decideRate(count, rateB, rateW); // CPUのrateを求める
  else {
	    System.out.println("Unspecified character was entered");
	    return;
	}
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

    //時間測定とプレイアウト回数ありのゲーム
    public void timeGame(int count) {
	System.out.println();
	System.out.println("Loop Start !");
	long time = 0;
	double playout_count = 0;
	for(int i = 0; i < count; i++) {
	    if(i % lookGame == 0) {
		System.out.println("Now Game is " + i);
	    }
	    game();
	    state.reset(bnum);
	    time += b_cpu.avePlayout();
	    playout_count += b_cpu.aveCount();
	    b_cpu.reset();
	    w_cpu.reset();
	}

	System.out.println();
	System.out.println("---Loop END---");
	System.out.println("Black win : " + winCount[0]);
	System.out.println("White win : " + winCount[1]);
	System.out.println("Draw      : " + winCount[2]);

	time /= count;

	//プレイアウト毎の思考平均時間
	System.out.println();
	System.out.println("Playout's average time(100 every time): " +  time + " ms");
	//プレイアウト毎のプレイアウト回数
	System.out.println();
	System.out.println("Playout's  Count: " + ((double)playout_count / count));
    }

    //描写を行うメソッド
    public void textDisplay() {
	System.out.println();

	//左上からマスと駒を表示
	for(int y = 1; y <= 8; y++) {
	    for(int x = 1; x <= 8; x++) {
		System.out.println("|");
		switch(state.data[x + y * 10]) {
		case 1:
		    System.out.println("●"); //黒の駒
		    break;
		case -1:
		    System.out.println("○"); //白の駒
		    break;
		default:
		    System.out.println(" ");
		}
	    }
	    System.out.println("|");
	}
	System.out.println("TURN = " + state.turn);
	System.out.println("PLAYER = " + state.player);
	System.out.println("DISC = " + state.black + " : " + state.white);
	System.out.println("\n \n");
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


    //木を展開する閾値の最適化
    public void decideThreshold(int count) {
	//探索した値の勝敗数を記憶するMAP
	//これを用いて探索回数を減らす
	Map<Integer, int[]> map = new HashMap<>();
	int j = 50;
	//Cの比較
	for(int add = 10; add >= 1; add = add / 2) {
	    //前の手順での勝数を保存する変数
	    int backWin = -1;
	    while(j>=0) {
		//比較中の閾値毎の勝敗を保存
		int[] thresholdCount = new int[3];

		//勝敗数を初期化
		winCount = new int[3];

		//MAP上の計算済みの勝敗数を取得
		if(map.containsKey(j)) {
		    winCount = map.get(j);
		    System.out.println();
		    System.out.println(" Game skip ! : " + j);
		}

		//未計算の場合
		else {
		    //閾値を変更
		    b_cpu.setThreshold(j);
		    System.out.println("Black's Threshold is " + j);
		    for(int i = 0; i < count; i++) {
			if(i % lookGame == 0) {
			    System.out.println("Now Game is " + i);
			}
			game();
			//textDisplay();
			//System.out.println("Now Game is " + i);
			state.reset(bnum);
			b_cpu.reset();
			w_cpu.reset();
		    }
		    map.put(j, winCount);
		}
		System.out.println();
		System.out.println("---Loop END---");
		System.out.println("Black win : " + winCount[0]);
		System.out.println("White win : " + winCount[1]);
		System.out.println("Draw      : " + winCount[2]);
		System.out.println();

		//勝数が逆転したら終了
		if(backWin > winCount[0]) {
		    System.out.println();
		    j -= add;
		    System.out.println();
		    System.out.println("Last Threshold is " + j);
		    System.out.println();
		    break;
		} else {
		    backWin = winCount[0];
		    j += add;
		}
	    }
	    j -= add;
	}
    }

    //枝刈りを行う手法の値FPUを決定するメソッド
    public void decideFPU(int count) {
	//探索した値の勝敗数を記憶するMAP
	//これを用いて探索回数を減らす
	Map<Double, int[]> map = new HashMap<>();

	double j = 3;
	//Cの比較
	for(double add = -1; add <=- 0.001; add = (double)add / 2) {

	    //前の手順での勝数を保存する変数
	    int backWin = -1;
	    while(j >= 0) {
		//比較中の閾値毎の勝敗を保存
		int[] FPUCount = new int[3];

		//勝敗数を初期化
		winCount = new int[3];

		//Map上の計算済みの勝敗数を取得
		if(map.containsKey(j)) {
		    winCount = map.get(j);
		    System.out.println();
		    System.out.println(" Game skip ! :" + j);
		}
		//未計算の場合
		else {
		    //閾値を変更
		    b_cpu.setFPU(j);
		    System.out.println("Blacl's FPU is " + j);
		    for(int i = 0; i < count; i++) {
			if(i % lookGame == 0) {
			    System.out.println("Now Game is " + i);
			}
			game();
			state.reset(bnum);
			b_cpu.reset();
			w_cpu.reset();
		    }
		    map.put(j, winCount);
		}
		System.out.println();
		System.out.println("---Loop END---");
		System.out.println("Black win : " + winCount[0]);
		System.out.println("White win : " + winCount[1]);
		System.out.println("Draw      : " + winCount[2]);
		System.out.println();

		//勝数が逆転したら終了
		if(backWin > winCount[0]) {
		    System.out.println();
		    j -= add;
		    System.out.println();
		    System.out.println("Last FPU is " + j);
		    System.out.println();
		    break;
		} else {
		    backWin = winCount[0];
		    j += add;
		}
	    }
	    j -= add;
	}
    }

    //UCB1値のCの最適化
    public void decideC(int count) {
	//探索した値の勝敗数を記憶するMAP
	//これを用いて探索回数を減らす
	Map<Double, int[]> map = new HashMap<>();
	double j = 1.0;
	//Cの比較
	for(double add = 0.3; add > 0.01; add = (double)add / 2) {
	    //前の手順での勝数を保存する変数
	    int backWin = -1;
	    while(j > 0) {
		//比較中の閾値毎の勝敗を保存
		int[] cutCount = new int[3];

		//勝敗数を初期化
		winCount = new int[3];

		//Map上の計算済みの勝敗数を取得
		if(map.containsKey(j)) {
		    winCount = map.get(j);
		    System.out.println();
		    System.out.println(" Game skip ! : " + j);
		}

		//未計算の場合
		else {
		    //閾値を変更
		    b_cpu.setC(j);
		    System.out.println("Black's C is " + j);
		    for(int i = 0; i < count; i++) {
			if(i % lookGame == 0) {
			    System.out.println("Now Game is " + i);
			}
			game();
			b_cpu.reset();
			w_cpu.reset();
			state.reset(bnum);
		    }
		    map.put(j, winCount);
		}

		System.out.println();
		System.out.println("---Loop END---");
		System.out.println("Black win : " + winCount[0]);
		System.out.println("White win : " + winCount[1]);
		System.out.println("Draw      : " + winCount[2]);
		System.out.println();

		//勝数が逆転したら終了
		if((backWin > winCount[0]) || (add == 0)) {
		    System.out.println();
		    j += add;
		    System.out.println("Last C is " + j);
		    break;
		} else {
		    backWin = winCount[0];
		    j -= add;
		}
	    }
	    j += add;
	}
    }


    // レート
    public void decideRate(int count, double rateB, double rateW){
    		Scanner scan = new Scanner(System.in);
    		//基準のレートとして
    //		double rateB = 1500; //黒番のレート
    //		double rateW = 1500;//白番のレート

    		double K = 16; // レート計算のK値

    		//各CPUのレート
    		// double rateB = b_cpu.rate();
    		// double rateW = w_cpu.rate();

    		//前の勝利結果
    		int pastWinCount[] = new int[3];


    		//初期レートの表示
    		System.out.println("---Initial CPU Rate---");
    		System.out.println("Black rate : " + rateB);
    		System.out.println("White rate : " + rateW);
    		System.out.println();

    		double boardRate = 0.5;
    		//System.out.println("Please input correction value.");
    		//boardRate = scan.nextDouble();

    		//計算した値を入れる
    	//	double boardRate =0.5;

    		System.out.println("Loop Start !");
    		for(int i = 0; i < count; i++){
    			if(i%lookGame == 0){
    				System.out.println("Now Game is " + i);
    			}
    			//初期盤面勝率
    			// if(i%4 == 0){
    		//	System.out.println("Please input correction value.");
    		//	boardRate = scan.nextDouble();
    			// System.out.println("Board :" + bnum);
    			// System.out.println("Black win : " + winCount[0]);
    			// System.out.println("White win : " + winCount[1]);
    			// System.out.println("Draw      : " + winCount[2]);
    			// System.out.println();

    			// winCount[0] = 0;
    			// winCount[1] = 0;
    			// winCount[2] = 0;
          //
    			// }
    			for(int j = 0; j < winCount.length; j++){
    				pastWinCount[j] = winCount[j]; //winCount[] の内容をコピー
    			}

    			game();
    			state.reset(bnum);
    			b_cpu.reset();
    			w_cpu.reset();


    			//レートから予想される勝率を求める
    			double blackWinRate = 1 / (1 + Math.pow(10, (rateW - rateB) / 400));
    			double whiteWinRate = 1 / (1 + Math.pow(10, (rateB - rateW) / 400));
    		//森田さんのアルゴリズム	double blackWinRate = 1 / (1 + Math.pow(10.0,  -((rateB - rateW)/400) + Math.log(boardRate/(1 - boardRate))));
    			//Math.pow(A, B) = (AのB乗)          Math.log() = logの計算
    			//double whiteWinRate = 1 / (1 + Math.pow(10.0, -((rateW - rateB)/400)));

    			//勝利点数を1とする
    			if(winCount[0] > pastWinCount[0]){//b_CPU が勝利する場合 勝利でカウントが増える
    				rateB = rateB + K * (1 - blackWinRate);
    				rateW = rateW + K * (0 - whiteWinRate);
    			}else if(winCount[1] > pastWinCount[1]){//w_CPU が勝利する場合
    				rateB = rateB + K * (0 - blackWinRate);
    				rateW = rateW + K * (1 - whiteWinRate);
    			}
    			//現在　引き分けあり
    			else{
    				rateB = rateB + K * (0.5 - blackWinRate);
    				rateW = rateW + K * (0.5 - whiteWinRate);
    				}

    			//0以下にならないように調整
    			if(rateB <= 0) rateB = 1;
    			if(rateW <= 0) rateW = 1;

           System.out.println("rateB : " + rateB);
           System.out.println("rateW : " + rateW);

    		}

    		//勝敗の表示
    		System.out.println();
    		System.out.println("---Loop END---");
        System.out.println("Board : " + bnum);
    		System.out.println("Black win : " + winCount[0]);
    		System.out.println("White win : " + winCount[1]);
    		System.out.println("Draw      : " + winCount[2]);
    		System.out.println();

    		//レーティング結果
    		System.out.println("---Final CPU Rate---");
    		System.out.println("Black rate : " + rateB);
    		System.out.println("White rate : " + rateW);
    		System.out.println();


    	}

}
