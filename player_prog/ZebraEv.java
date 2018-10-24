//Zebraの評価関数のクラス

class ZebraEv implements OthelloEvaluator {
    
    final static int BLACKSQ = 0; //黒
    final static int EMPTY = 1; //空
    final static int WHITESQ = 2; //白
    final static int OUTSIDE = 3; //枠外
    final static int MIDGAME_WIN = 29000;

    final static int stage_count = 12;
    int[] stage = new int[]{8, 14, 20, 26, 32, 36, 40, 44, 48, 52, 56, 60};
    int[] eval_map = new int[61];
    CoeffSet[] set = new CoeffSet[61];
    int[] board = new int[100];
    int side_to_move;
    int disks_played;

    //使用する評価関数を指定するメソッド
    static ZebraEv evaluatorFactory(int select) {
	switch (select) {
	case 0: return new ZebraEv();
	case 1: return new PE_W1();
	case 2: return new PE_W2();
	case 3: return new PE_W3();
	case 4: return new PE_W4();
	case 5: return new PE_W5();
	case 6: return new PE_W6();
	case 7: return new PE_W7();
	case 8: return new PE_W8();
	case 9: return new PE_W9();
	default:
	    new RuntimeException("Illegal Number : Command Line argument");
	}
	return null; // error
    }
	
    public ZebraEv() {
	init_coeffs();
    }


    //eval_map[]への値の格納
    //set[]へのパラメータの格納
    public void init_coeffs() {
	int subsequent_stage;
	int i;
	for ( i = 0; i < stage[0]; i++ ) {//i = 0~7
	    eval_map[i] = stage[0];
	}
	for ( i = 0; i < stage_count; i++ ) {//i = 0~11
	    eval_map[stage[i]] = stage[i]; //stage[i] = 8~60
	}
	for ( i = subsequent_stage = 60; i >= stage[0]; i-- ) { //i = 60~8
	    if ( eval_map[i] == i )
		subsequent_stage = i;
	    else if ( i == subsequent_stage - 2 ) {
		eval_map[i] = i;
		subsequent_stage = i;
	    }
	    else
		eval_map[i] = subsequent_stage;
	}

	try {
	    set[0] = CoeffSet.readFromFile(0);
	    for(i = 1; i <= 60; i += 2) {
		set[i] = CoeffSet.readFromFile(eval_map[i]);
		if (i < 60) set[i+1] = CoeffSet.readFromFile(eval_map[i]);
	    }
	} catch (Exception e) {
	    e.printStackTrace();
	    System.exit(1);
	}
    }

    //評価値計算に必要なデータをセットする
    // -現在の手番 side_to_move
    // -局面の駒配置 board[]
    // -現在の手数 disks_played
    void set_data(GameState s) {
	if (s.player == 1) {
	    side_to_move = BLACKSQ;
	} else if(s.player == -1) {
	    side_to_move = WHITESQ;
	}
	disks_played = s.turn;
	
	for (int i = 0; i < 10; i++) {
	    for (int j = 0; j < 10; j++) {
		int pos = 10 * i + j;
		if ( s.data[s.at(i,j)] == 1 ) board[pos] = BLACKSQ; //黒駒
		else if ( s.data[s.at(i,j)] == -1 ) board[pos] = WHITESQ; //白駒
		else if ( s.data[s.at(i,j)] == 0 ) board[pos] = EMPTY; //無
		else if ( s.data[s.at(i,j)] == 2 ) board[pos] = OUTSIDE; //枠外
	    }
	}
	
    }
    
    //白の手番の時，局面上の全ての駒を反転するメソッド
    //黒駒 -> 白駒
    //白駒 -> 黒駒
    void reverse_all_disks() {

	for (int i = 1; i <= 8; i++) {
	    for(int j = 1; j <= 8; j++) {
		int pos = 10 * i + j;
		if( board[pos] == BLACKSQ) {
		    board[pos] = WHITESQ;
		} else if( board[pos] == WHITESQ ) {
		    board[pos] = BLACKSQ;
		}
	    }
	}	
    }

    //評価する盤面を複製するメソッド
    public int evalMove(GameState state, int[] pos) {
	GameState s = new GameState(true);
	s.set(state.data, state.turn, state.player);
	s.put(pos[0], pos[1]);
	return eval(s);
    }
    
    //局面評価を行うメソッド(第1段階)
    //ゲームの進行状況に応じたスコアテーブルを用意する
    public int eval(GameState s) {

	int eval_phase;
	int score;
	
	set_data(s);

	side_to_move = (0 + 2) - side_to_move;
	
	s.countDisc();
	if ( s.black == 0 ) {
	    if( side_to_move == BLACKSQ ) {
		return -(MIDGAME_WIN + 64);
	    } else {
		return +(MIDGAME_WIN + 64);
	    }
	} else if( s.white == 0 ) {
	    if( side_to_move == BLACKSQ ) {
		return +(MIDGAME_WIN + 64);
	    } else {
		return -(MIDGAME_WIN + 64);
	    }
	}
	
	eval_phase = eval_map[disks_played];
	score = set[eval_phase].parity_constant[disks_played & 1];

	if (side_to_move == WHITESQ) reverse_all_disks();

	score += evalSub(set[eval_phase]); // ここの部分は差しかわる

	return score;
    }

    //局面評価を行うメソッド(第2段階)
    //各マスの状態より，各パターンのスコアをテーブルから引く
    protected int evalSub(CoeffSet evtable) {
	int score = 0;
		
	int pattern0;
	pattern0 = board[72];
	pattern0 = 3 * pattern0 + board[22];
	pattern0 = 3 * pattern0 + board[81];
	pattern0 = 3 * pattern0 + board[71];
	pattern0 = 3 * pattern0 + board[61];
	pattern0 = 3 * pattern0 + board[51];
	pattern0 = 3 * pattern0 + board[41];
	pattern0 = 3 * pattern0 + board[31];
	pattern0 = 3 * pattern0 + board[21];
	pattern0 = 3 * pattern0 + board[11];
	    
	score += evtable.afile2x[pattern0];

	pattern0 = board[77];
	pattern0 = 3 * pattern0 + board[27];
	pattern0 = 3 * pattern0 + board[88];
	pattern0 = 3 * pattern0 + board[78];
	pattern0 = 3 * pattern0 + board[68];
	pattern0 = 3 * pattern0 + board[58];
	pattern0 = 3 * pattern0 + board[48];
	pattern0 = 3 * pattern0 + board[38];
	pattern0 = 3 * pattern0 + board[28];
	pattern0 = 3 * pattern0 + board[18];
	    
	score += evtable.afile2x[pattern0];

	pattern0 = board[27];
	pattern0 = 3 * pattern0 + board[22];
	pattern0 = 3 * pattern0 + board[18];
	pattern0 = 3 * pattern0 + board[17];
	pattern0 = 3 * pattern0 + board[16];
	pattern0 = 3 * pattern0 + board[15];
	pattern0 = 3 * pattern0 + board[14];
	pattern0 = 3 * pattern0 + board[13];
	pattern0 = 3 * pattern0 + board[12];
	pattern0 = 3 * pattern0 + board[11];
	    
	score += evtable.afile2x[pattern0];

	pattern0 = board[77];
	pattern0 = 3 * pattern0 + board[72];
	pattern0 = 3 * pattern0 + board[88];
	pattern0 = 3 * pattern0 + board[87];
	pattern0 = 3 * pattern0 + board[86];
	pattern0 = 3 * pattern0 + board[85];
	pattern0 = 3 * pattern0 + board[84];
	pattern0 = 3 * pattern0 + board[83];
	pattern0 = 3 * pattern0 + board[82];
	pattern0 = 3 * pattern0 + board[81];
	    
	score += evtable.afile2x[pattern0];

	pattern0 = board[82];
	pattern0 = 3 * pattern0 + board[72];
	pattern0 = 3 * pattern0 + board[62];
	pattern0 = 3 * pattern0 + board[52];
	pattern0 = 3 * pattern0 + board[42];
	pattern0 = 3 * pattern0 + board[32];
	pattern0 = 3 * pattern0 + board[22];
	pattern0 = 3 * pattern0 + board[12];
	    
	score += evtable.bfile[pattern0];
	    
	pattern0 = board[87];
	pattern0 = 3 * pattern0 + board[77];
	pattern0 = 3 * pattern0 + board[67];
	pattern0 = 3 * pattern0 + board[57];
	pattern0 = 3 * pattern0 + board[47];
	pattern0 = 3 * pattern0 + board[37];
	pattern0 = 3 * pattern0 + board[27];
	pattern0 = 3 * pattern0 + board[17];
	    
	score += evtable.bfile[pattern0];
	    
	pattern0 = board[28];
	pattern0 = 3 * pattern0 + board[27];
	pattern0 = 3 * pattern0 + board[26];
	pattern0 = 3 * pattern0 + board[25];
	pattern0 = 3 * pattern0 + board[24];
	pattern0 = 3 * pattern0 + board[23];
	pattern0 = 3 * pattern0 + board[22];
	pattern0 = 3 * pattern0 + board[21];
	    
	score += evtable.bfile[pattern0];

	pattern0 = board[78];
	pattern0 = 3 * pattern0 + board[77];
	pattern0 = 3 * pattern0 + board[76];
	pattern0 = 3 * pattern0 + board[75];
	pattern0 = 3 * pattern0 + board[74];
	pattern0 = 3 * pattern0 + board[73];
	pattern0 = 3 * pattern0 + board[72];
	pattern0 = 3 * pattern0 + board[71];

	score += evtable.bfile[pattern0];

	pattern0 = board[83];
	pattern0 = 3 * pattern0 + board[73];
	pattern0 = 3 * pattern0 + board[63];
	pattern0 = 3 * pattern0 + board[53];
	pattern0 = 3 * pattern0 + board[43];
	pattern0 = 3 * pattern0 + board[33];
	pattern0 = 3 * pattern0 + board[23];
	pattern0 = 3 * pattern0 + board[13];
	    
	score += evtable.cfile[pattern0];

	pattern0 = board[86];
	pattern0 = 3 * pattern0 + board[76];
	pattern0 = 3 * pattern0 + board[66];
	pattern0 = 3 * pattern0 + board[56];
	pattern0 = 3 * pattern0 + board[46];
	pattern0 = 3 * pattern0 + board[36];
	pattern0 = 3 * pattern0 + board[26];
	pattern0 = 3 * pattern0 + board[16];
	  
	score += evtable.cfile[pattern0];
	    
	pattern0 = board[38];
	pattern0 = 3 * pattern0 + board[37];
	pattern0 = 3 * pattern0 + board[36];
	pattern0 = 3 * pattern0 + board[35];
	pattern0 = 3 * pattern0 + board[34];
	pattern0 = 3 * pattern0 + board[33];
	pattern0 = 3 * pattern0 + board[32];
	pattern0 = 3 * pattern0 + board[31];
	    
	score += evtable.cfile[pattern0];

	pattern0 = board[68];
	pattern0 = 3 * pattern0 + board[67];
	pattern0 = 3 * pattern0 + board[66];
	pattern0 = 3 * pattern0 + board[65];
	pattern0 = 3 * pattern0 + board[64];
	pattern0 = 3 * pattern0 + board[63];
	pattern0 = 3 * pattern0 + board[62];
	pattern0 = 3 * pattern0 + board[61];
	    
	score += evtable.cfile[pattern0];

	pattern0 = board[84];
	pattern0 = 3 * pattern0 + board[74];
	pattern0 = 3 * pattern0 + board[64];
	pattern0 = 3 * pattern0 + board[54];
	pattern0 = 3 * pattern0 + board[44];
	pattern0 = 3 * pattern0 + board[34];
	pattern0 = 3 * pattern0 + board[24];
	pattern0 = 3 * pattern0 + board[14];
	    
	score += evtable.dfile[pattern0];

	pattern0 = board[85];
	pattern0 = 3 * pattern0 + board[75];
	pattern0 = 3 * pattern0 + board[65];
	pattern0 = 3 * pattern0 + board[55];
	pattern0 = 3 * pattern0 + board[45];
	pattern0 = 3 * pattern0 + board[35];
	pattern0 = 3 * pattern0 + board[25];
	pattern0 = 3 * pattern0 + board[15];

	score += evtable.dfile[pattern0];

	pattern0 = board[48];
	pattern0 = 3 * pattern0 + board[47];
	pattern0 = 3 * pattern0 + board[46];
	pattern0 = 3 * pattern0 + board[45];
	pattern0 = 3 * pattern0 + board[44];
	pattern0 = 3 * pattern0 + board[43];
	pattern0 = 3 * pattern0 + board[42];
	pattern0 = 3 * pattern0 + board[41];
	 
	score += evtable.dfile[pattern0];
  
	pattern0 = board[58];
	pattern0 = 3 * pattern0 + board[57];
	pattern0 = 3 * pattern0 + board[56];
	pattern0 = 3 * pattern0 + board[55];
	pattern0 = 3 * pattern0 + board[54];
	pattern0 = 3 * pattern0 + board[53];
	pattern0 = 3 * pattern0 + board[52];
	pattern0 = 3 * pattern0 + board[51];

	score += evtable.dfile[pattern0];
	    
	pattern0 = board[88];
	pattern0 = 3 * pattern0 + board[77];
	pattern0 = 3 * pattern0 + board[66];
	pattern0 = 3 * pattern0 + board[55];
	pattern0 = 3 * pattern0 + board[44];
	pattern0 = 3 * pattern0 + board[33];
	pattern0 = 3 * pattern0 + board[22];
	pattern0 = 3 * pattern0 + board[11];

	score += evtable.diag8[pattern0];
	    
	pattern0 = board[81];
	pattern0 = 3 * pattern0 + board[72];
	pattern0 = 3 * pattern0 + board[63];
	pattern0 = 3 * pattern0 + board[54];
	pattern0 = 3 * pattern0 + board[45];
	pattern0 = 3 * pattern0 + board[36];
	pattern0 = 3 * pattern0 + board[27];
	pattern0 = 3 * pattern0 + board[18];
	 
	score += evtable.diag8[pattern0];

	pattern0 = board[78];
	pattern0 = 3 * pattern0 + board[67];
	pattern0 = 3 * pattern0 + board[56];
	pattern0 = 3 * pattern0 + board[45];
	pattern0 = 3 * pattern0 + board[34];
	pattern0 = 3 * pattern0 + board[23];
	pattern0 = 3 * pattern0 + board[12];
	  
	score += evtable.diag7[pattern0];
	    
	pattern0 = board[87];
	pattern0 = 3 * pattern0 + board[76];
	pattern0 = 3 * pattern0 + board[65];
	pattern0 = 3 * pattern0 + board[54];
	pattern0 = 3 * pattern0 + board[43];
	pattern0 = 3 * pattern0 + board[32];
	pattern0 = 3 * pattern0 + board[21];

	score += evtable.diag7[pattern0];
	    
	pattern0 = board[71];
	pattern0 = 3 * pattern0 + board[62];
	pattern0 = 3 * pattern0 + board[53];
	pattern0 = 3 * pattern0 + board[44];
	pattern0 = 3 * pattern0 + board[35];
	pattern0 = 3 * pattern0 + board[26];
	pattern0 = 3 * pattern0 + board[17];
	    
	score += evtable.diag7[pattern0];
	    
	pattern0 = board[82];
	pattern0 = 3 * pattern0 + board[73];
	pattern0 = 3 * pattern0 + board[64];
	pattern0 = 3 * pattern0 + board[55];
	pattern0 = 3 * pattern0 + board[46];
	pattern0 = 3 * pattern0 + board[37];
	pattern0 = 3 * pattern0 + board[28];

	score += evtable.diag7[pattern0];
	    
	pattern0 = board[68];
	pattern0 = 3 * pattern0 + board[57];
	pattern0 = 3 * pattern0 + board[46];
	pattern0 = 3 * pattern0 + board[35];
	pattern0 = 3 * pattern0 + board[24];
	pattern0 = 3 * pattern0 + board[13];

	score += evtable.diag6[pattern0];
	    
	pattern0 = board[86];
	pattern0 = 3 * pattern0 + board[75];
	pattern0 = 3 * pattern0 + board[64];
	pattern0 = 3 * pattern0 + board[53];
	pattern0 = 3 * pattern0 + board[42];
	pattern0 = 3 * pattern0 + board[31];

	score += evtable.diag6[pattern0];
	    
	pattern0 = board[61];
	pattern0 = 3 * pattern0 + board[52];
	pattern0 = 3 * pattern0 + board[43];
	pattern0 = 3 * pattern0 + board[34];
	pattern0 = 3 * pattern0 + board[25];
	pattern0 = 3 * pattern0 + board[16];

	score += evtable.diag6[pattern0];
	    
	pattern0 = board[83];
	pattern0 = 3 * pattern0 + board[74];
	pattern0 = 3 * pattern0 + board[65];
	pattern0 = 3 * pattern0 + board[56];
	pattern0 = 3 * pattern0 + board[47];
	pattern0 = 3 * pattern0 + board[38];
	    
	score += evtable.diag6[pattern0];
	pattern0 = board[58];
	pattern0 = 3 * pattern0 + board[47];
	pattern0 = 3 * pattern0 + board[36];
	pattern0 = 3 * pattern0 + board[25];
	pattern0 = 3 * pattern0 + board[14];

	score += evtable.diag5[pattern0];
	    
	pattern0 = board[85];
	pattern0 = 3 * pattern0 + board[74];
	pattern0 = 3 * pattern0 + board[63];
	pattern0 = 3 * pattern0 + board[52];
	pattern0 = 3 * pattern0 + board[41];
	    
	score += evtable.diag5[pattern0];
	    
	pattern0 = board[51];
	pattern0 = 3 * pattern0 + board[42];
	pattern0 = 3 * pattern0 + board[33];
	pattern0 = 3 * pattern0 + board[24];
	pattern0 = 3 * pattern0 + board[15];
	    
	score += evtable.diag5[pattern0];
	    
	pattern0 = board[84];
	pattern0 = 3 * pattern0 + board[75];
	pattern0 = 3 * pattern0 + board[66];
	pattern0 = 3 * pattern0 + board[57];
	pattern0 = 3 * pattern0 + board[48];
	    
	score += evtable.diag5[pattern0];
	    
	pattern0 = board[48];
	pattern0 = 3 * pattern0 + board[37];
	pattern0 = 3 * pattern0 + board[26];
	pattern0 = 3 * pattern0 + board[15];

	score += evtable.diag4[pattern0];
	    
	pattern0 = board[84];
	pattern0 = 3 * pattern0 + board[73];
	pattern0 = 3 * pattern0 + board[62];
	pattern0 = 3 * pattern0 + board[51];

	score += evtable.diag4[pattern0];
	
	pattern0 = board[41];
	pattern0 = 3 * pattern0 + board[32];
	pattern0 = 3 * pattern0 + board[23];
	pattern0 = 3 * pattern0 + board[14];
	    
	score += evtable.diag4[pattern0];
	    
	pattern0 = board[85];
	pattern0 = 3 * pattern0 + board[76];
	pattern0 = 3 * pattern0 + board[67];
	pattern0 = 3 * pattern0 + board[58];
	    
	score += evtable.diag4[pattern0];
	    
	pattern0 = board[33];
	pattern0 = 3 * pattern0 + board[32];
	pattern0 = 3 * pattern0 + board[31];
	pattern0 = 3 * pattern0 + board[23];
	pattern0 = 3 * pattern0 + board[22];
	pattern0 = 3 * pattern0 + board[21];
	pattern0 = 3 * pattern0 + board[13];
	pattern0 = 3 * pattern0 + board[12];
	pattern0 = 3 * pattern0 + board[11];
	    
	score += evtable.corner33[pattern0];
	    
	pattern0 = board[63];
	pattern0 = 3 * pattern0 + board[62];
	pattern0 = 3 * pattern0 + board[61];
	pattern0 = 3 * pattern0 + board[73];
	pattern0 = 3 * pattern0 + board[72];
	pattern0 = 3 * pattern0 + board[71];
	pattern0 = 3 * pattern0 + board[83];
	pattern0 = 3 * pattern0 + board[82];
	pattern0 = 3 * pattern0 + board[81];
	    
	score += evtable.corner33[pattern0];
	
	pattern0 = board[36];
	pattern0 = 3 * pattern0 + board[37];
	pattern0 = 3 * pattern0 + board[38];
	pattern0 = 3 * pattern0 + board[26];
	pattern0 = 3 * pattern0 + board[27];
	pattern0 = 3 * pattern0 + board[28];
	pattern0 = 3 * pattern0 + board[16];
	pattern0 = 3 * pattern0 + board[17];
	pattern0 = 3 * pattern0 + board[18];
	    
	score += evtable.corner33[pattern0];

	pattern0 = board[66];
	pattern0 = 3 * pattern0 + board[67];
	pattern0 = 3 * pattern0 + board[68];
	pattern0 = 3 * pattern0 + board[76];
	pattern0 = 3 * pattern0 + board[77];
	pattern0 = 3 * pattern0 + board[78];
	pattern0 = 3 * pattern0 + board[86];
	pattern0 = 3 * pattern0 + board[87];
	pattern0 = 3 * pattern0 + board[88];
	    
	score += evtable.corner33[pattern0];
	    
	pattern0 = board[25];
	pattern0 = 3 * pattern0 + board[24];
	pattern0 = 3 * pattern0 + board[23];
	pattern0 = 3 * pattern0 + board[22];
	pattern0 = 3 * pattern0 + board[21];
	pattern0 = 3 * pattern0 + board[15];
	pattern0 = 3 * pattern0 + board[14];
	pattern0 = 3 * pattern0 + board[13];
	pattern0 = 3 * pattern0 + board[12];
	pattern0 = 3 * pattern0 + board[11];
	    
	score += evtable.corner52[pattern0];
	    
	pattern0 = board[75];
	pattern0 = 3 * pattern0 + board[74];
	pattern0 = 3 * pattern0 + board[73];
	pattern0 = 3 * pattern0 + board[72];
	pattern0 = 3 * pattern0 + board[71];
	pattern0 = 3 * pattern0 + board[85];
	pattern0 = 3 * pattern0 + board[84];
	pattern0 = 3 * pattern0 + board[83];
	pattern0 = 3 * pattern0 + board[82];
	pattern0 = 3 * pattern0 + board[81];
	  
	score += evtable.corner52[pattern0];
	    
	pattern0 = board[24];
	pattern0 = 3 * pattern0 + board[25];
	pattern0 = 3 * pattern0 + board[26];
	pattern0 = 3 * pattern0 + board[27];
	pattern0 = 3 * pattern0 + board[28];
	pattern0 = 3 * pattern0 + board[14];
	pattern0 = 3 * pattern0 + board[15];
	pattern0 = 3 * pattern0 + board[16];
	pattern0 = 3 * pattern0 + board[17];
	pattern0 = 3 * pattern0 + board[18];

	score += evtable.corner52[pattern0];
	    
	pattern0 = board[74];
	pattern0 = 3 * pattern0 + board[75];
	pattern0 = 3 * pattern0 + board[76];
	pattern0 = 3 * pattern0 + board[77];
	pattern0 = 3 * pattern0 + board[78];
	pattern0 = 3 * pattern0 + board[84];
	pattern0 = 3 * pattern0 + board[85];
	pattern0 = 3 * pattern0 + board[86];
	pattern0 = 3 * pattern0 + board[87];
	pattern0 = 3 * pattern0 + board[88];

	score += evtable.corner52[pattern0];
	    
	pattern0 = board[52];
	pattern0 = 3 * pattern0 + board[42];
	pattern0 = 3 * pattern0 + board[32];
	pattern0 = 3 * pattern0 + board[22];
	pattern0 = 3 * pattern0 + board[12];
	pattern0 = 3 * pattern0 + board[51];
	pattern0 = 3 * pattern0 + board[41];
	pattern0 = 3 * pattern0 + board[31];
	pattern0 = 3 * pattern0 + board[21];
	pattern0 = 3 * pattern0 + board[11];
	    
	score += evtable.corner52[pattern0];
	    
	pattern0 = board[57];
	pattern0 = 3 * pattern0 + board[47];
	pattern0 = 3 * pattern0 + board[37];
	pattern0 = 3 * pattern0 + board[27];
	pattern0 = 3 * pattern0 + board[17];
	pattern0 = 3 * pattern0 + board[58];
	pattern0 = 3 * pattern0 + board[48];
	pattern0 = 3 * pattern0 + board[38];
	pattern0 = 3 * pattern0 + board[28];
	pattern0 = 3 * pattern0 + board[18];

	score += evtable.corner52[pattern0];
	    
	pattern0 = board[42];
	pattern0 = 3 * pattern0 + board[52];
	pattern0 = 3 * pattern0 + board[62];
	pattern0 = 3 * pattern0 + board[72];
	pattern0 = 3 * pattern0 + board[82];
	pattern0 = 3 * pattern0 + board[41];
	pattern0 = 3 * pattern0 + board[51];
	pattern0 = 3 * pattern0 + board[61];
	pattern0 = 3 * pattern0 + board[71];
	pattern0 = 3 * pattern0 + board[81];

	score += evtable.corner52[pattern0];
	    
	pattern0 = board[47];
	pattern0 = 3 * pattern0 + board[57];
	pattern0 = 3 * pattern0 + board[67];
	pattern0 = 3 * pattern0 + board[77];
	pattern0 = 3 * pattern0 + board[87];
	pattern0 = 3 * pattern0 + board[48];
	pattern0 = 3 * pattern0 + board[58];
	pattern0 = 3 * pattern0 + board[68];
	pattern0 = 3 * pattern0 + board[78];
	pattern0 = 3 * pattern0 + board[88];

	score += evtable.corner52[pattern0];
	return score;
    }
	
}
