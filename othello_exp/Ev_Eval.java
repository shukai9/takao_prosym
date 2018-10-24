class Ev_Eval {
    static OthelloEvaluator[] evs;

    public static void main(String[] args) throws Exception {
	Params.parse(args);
	evs = new OthelloEvaluator[11];
	for (int i = 0; i < 10; i++) {
	    evs[i] = ZebraEv.evaluatorFactory(i);
	}
	evs[10] = new WeakEv();
		
	for(int i = 0; i < Params.gamecount; i++) {
	    game(i);
	}
    }
	
    public static void game(int gameID) {
	GameState state = new GameState();
	boolean isLastPass = false;
	for(;;) {
	    //置く場所がなければパス
	    if(state.checkPass() == true) {
		if (isLastPass) break;
		state.player *= -1;
		isLastPass = true;
		continue;
	    }
	    isLastPass = false;

	    //置く場所があるとき
	    // ターン数4以上のとき，評価値を出力
	    if (state.turn > 4) {
		state.textDisplay();
		for (int i = 0; i < evs.length; i++) {
		    System.out.printf("Evs[%02d] = %d\n", i, evs[i].eval(state));
		}
	    }

	    //置く場所はCPU内のdecideメソッドで決定
	    int action[] = (state.player == Params.b_cpu.color) ? Params.b_cpu.decide(state)
		: Params.w_cpu.decide(state);
	    if(action[0] == -1 || action[1] == -1) {
		throw new RuntimeException(String.format("Illegal Move by %d : (-1, -1)",
							 state.player));
	    }

	    //置ける場所がある場合のみ駒を置く処理を実行
	    state.put(action[0], action[1]);
	}

	endGame(gameID, state);
	Params.b_cpu.reset();
	Params.w_cpu.reset();
    }
    
    //ゲーム終了時に勝ち負けの数を追加
    public static void endGame(int gameID, GameState state) {
	int End = state.Win();
	if (End == 1)       System.out.printf("end,%d,blackwin\n", gameID);
	else if (End == -1) System.out.printf("end,%d,whitewin\n", gameID);
	else                System.out.printf("end,%d,draw\n",     gameID);
    }

}
