//アルファベータプレイヤ用のZebra評価関数

class PatternEvaluation_AB {
    
    final static int BLACKSQ = 0; //黒
    final static int EMPTY = 1; //空
    final static int WHITESQ = 2; //白
    final static int OUTSIDE = 3; //枠外
    final static int MIDGAME_WIN = 29000;

    static int side_to_move;
    static int disks_played;
    static int stage_count = 12;
    static int[] stage = new int[]{8, 14, 20, 26, 32, 36, 40, 44, 48, 52, 56, 60};
    static int[] eval_map = new int[61];
    static CoeffSet[] set = new CoeffSet[61];
    static int[] board = new int[100];

    PatternEvaluation_AB() throws Exception {
	init_coeffs();
    }


    /*
      eval_map[]への値の格納
      set[]へのパラメータの格納
    */
    public static void init_coeffs() throws Exception {
	
	//eval_mapへの値の格納
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

	//setへのパラメータの格納
	set[0] = CoeffSet.readFromFile(0);
	for(i = 1; i <= 60; i += 2) {
	    set[i] = CoeffSet.readFromFile(eval_map[i]);
	    if (i < 60) set[i+1] = CoeffSet.readFromFile(eval_map[i]);
	}
	
    }

    /*
      評価値計算に必要なデータをセットする
      -現在の手番 side_to_move
      -局面の駒配置 board[]
      -現在の手数 disks_played
     */
    static void set_data(GameState s) {
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
    
    /*
      白の手番の時，局面上の全ての駒を反転する
      黒駒 -> 白駒
      白駒 -> 黒駒
     */
    static void reverse_all_disks() {

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


    //盤面の評価を行うメソッド
    //MCTGameState型が渡されたらGameState型に変換する
    public static int Pattern_Evaluation(MCTGameState gamestate) {
	GameState s = new GameState();
	s.set(gamestate.data, gamestate.turn, gamestate.player);
	return Pattern_Evaluation(s);
    }

    //盤面の評価を行うメソッド
    public static int Pattern_Evaluation(GameState s) {

	int eval_phase;
	int score;

	//局面や手番などの状態をセット
	set_data(s);
	//手を打つ前の手番のプレイヤにとっての評価なので
	//手番を入れ替える
	side_to_move = (0 + 2) - side_to_move;
	
	/*
	  黒一色または白一色の時
	 */
	s.countDisc();
	if ( s.black == 0 ) { //白一色
	    if( side_to_move == BLACKSQ ) { //黒の手番の場合
		return -(MIDGAME_WIN + 64);
	    } else { //白の手番の場合
		return +(MIDGAME_WIN + 64);
	    }
	} else if( s.white == 0 ) { //黒一色
	    if( side_to_move == BLACKSQ ) { //黒の手番の場合
		return +(MIDGAME_WIN + 64);
	    } else { //白の手番の場合
		return -(MIDGAME_WIN + 64);
	    }
	}
	
	eval_phase = eval_map[disks_played];
	score = set[eval_phase].parity_constant[disks_played & 1];

	if (side_to_move == WHITESQ) reverse_all_disks();
	
	//評価値scoreの計算
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
	    
	score += set[eval_phase].afile2x[pattern0];

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
	    
	score += set[eval_phase].afile2x[pattern0];

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
	    
	score += set[eval_phase].afile2x[pattern0];

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
	    
	score += set[eval_phase].afile2x[pattern0];

	pattern0 = board[82];
	pattern0 = 3 * pattern0 + board[72];
	pattern0 = 3 * pattern0 + board[62];
	pattern0 = 3 * pattern0 + board[52];
	pattern0 = 3 * pattern0 + board[42];
	pattern0 = 3 * pattern0 + board[32];
	pattern0 = 3 * pattern0 + board[22];
	pattern0 = 3 * pattern0 + board[12];
	    
	score += set[eval_phase].bfile[pattern0];
	    
	pattern0 = board[87];
	pattern0 = 3 * pattern0 + board[77];
	pattern0 = 3 * pattern0 + board[67];
	pattern0 = 3 * pattern0 + board[57];
	pattern0 = 3 * pattern0 + board[47];
	pattern0 = 3 * pattern0 + board[37];
	pattern0 = 3 * pattern0 + board[27];
	pattern0 = 3 * pattern0 + board[17];
	    
	score += set[eval_phase].bfile[pattern0];
	    
	pattern0 = board[28];
	pattern0 = 3 * pattern0 + board[27];
	pattern0 = 3 * pattern0 + board[26];
	pattern0 = 3 * pattern0 + board[25];
	pattern0 = 3 * pattern0 + board[24];
	pattern0 = 3 * pattern0 + board[23];
	pattern0 = 3 * pattern0 + board[22];
	pattern0 = 3 * pattern0 + board[21];
	    
	score += set[eval_phase].bfile[pattern0];

	pattern0 = board[78];
	pattern0 = 3 * pattern0 + board[77];
	pattern0 = 3 * pattern0 + board[76];
	pattern0 = 3 * pattern0 + board[75];
	pattern0 = 3 * pattern0 + board[74];
	pattern0 = 3 * pattern0 + board[73];
	pattern0 = 3 * pattern0 + board[72];
	pattern0 = 3 * pattern0 + board[71];

	score += set[eval_phase].bfile[pattern0];

	pattern0 = board[83];
	pattern0 = 3 * pattern0 + board[73];
	pattern0 = 3 * pattern0 + board[63];
	pattern0 = 3 * pattern0 + board[53];
	pattern0 = 3 * pattern0 + board[43];
	pattern0 = 3 * pattern0 + board[33];
	pattern0 = 3 * pattern0 + board[23];
	pattern0 = 3 * pattern0 + board[13];
	    
	score += set[eval_phase].cfile[pattern0];

	pattern0 = board[86];
	pattern0 = 3 * pattern0 + board[76];
	pattern0 = 3 * pattern0 + board[66];
	pattern0 = 3 * pattern0 + board[56];
	pattern0 = 3 * pattern0 + board[46];
	pattern0 = 3 * pattern0 + board[36];
	pattern0 = 3 * pattern0 + board[26];
	pattern0 = 3 * pattern0 + board[16];
	  
	score += set[eval_phase].cfile[pattern0];
	    
	pattern0 = board[38];
	pattern0 = 3 * pattern0 + board[37];
	pattern0 = 3 * pattern0 + board[36];
	pattern0 = 3 * pattern0 + board[35];
	pattern0 = 3 * pattern0 + board[34];
	pattern0 = 3 * pattern0 + board[33];
	pattern0 = 3 * pattern0 + board[32];
	pattern0 = 3 * pattern0 + board[31];
	    
	score += set[eval_phase].cfile[pattern0];

	pattern0 = board[68];
	pattern0 = 3 * pattern0 + board[67];
	pattern0 = 3 * pattern0 + board[66];
	pattern0 = 3 * pattern0 + board[65];
	pattern0 = 3 * pattern0 + board[64];
	pattern0 = 3 * pattern0 + board[63];
	pattern0 = 3 * pattern0 + board[62];
	pattern0 = 3 * pattern0 + board[61];
	    
	score += set[eval_phase].cfile[pattern0];

	pattern0 = board[84];
	pattern0 = 3 * pattern0 + board[74];
	pattern0 = 3 * pattern0 + board[64];
	pattern0 = 3 * pattern0 + board[54];
	pattern0 = 3 * pattern0 + board[44];
	pattern0 = 3 * pattern0 + board[34];
	pattern0 = 3 * pattern0 + board[24];
	pattern0 = 3 * pattern0 + board[14];
	    
	score += set[eval_phase].dfile[pattern0];

	pattern0 = board[85];
	pattern0 = 3 * pattern0 + board[75];
	pattern0 = 3 * pattern0 + board[65];
	pattern0 = 3 * pattern0 + board[55];
	pattern0 = 3 * pattern0 + board[45];
	pattern0 = 3 * pattern0 + board[35];
	pattern0 = 3 * pattern0 + board[25];
	pattern0 = 3 * pattern0 + board[15];

	score += set[eval_phase].dfile[pattern0];

	pattern0 = board[48];
	pattern0 = 3 * pattern0 + board[47];
	pattern0 = 3 * pattern0 + board[46];
	pattern0 = 3 * pattern0 + board[45];
	pattern0 = 3 * pattern0 + board[44];
	pattern0 = 3 * pattern0 + board[43];
	pattern0 = 3 * pattern0 + board[42];
	pattern0 = 3 * pattern0 + board[41];
	 
	score += set[eval_phase].dfile[pattern0];
  
	pattern0 = board[58];
	pattern0 = 3 * pattern0 + board[57];
	pattern0 = 3 * pattern0 + board[56];
	pattern0 = 3 * pattern0 + board[55];
	pattern0 = 3 * pattern0 + board[54];
	pattern0 = 3 * pattern0 + board[53];
	pattern0 = 3 * pattern0 + board[52];
	pattern0 = 3 * pattern0 + board[51];

	score += set[eval_phase].dfile[pattern0];
	    
	pattern0 = board[88];
	pattern0 = 3 * pattern0 + board[77];
	pattern0 = 3 * pattern0 + board[66];
	pattern0 = 3 * pattern0 + board[55];
	pattern0 = 3 * pattern0 + board[44];
	pattern0 = 3 * pattern0 + board[33];
	pattern0 = 3 * pattern0 + board[22];
	pattern0 = 3 * pattern0 + board[11];

	score += set[eval_phase].diag8[pattern0];
	    
	pattern0 = board[81];
	pattern0 = 3 * pattern0 + board[72];
	pattern0 = 3 * pattern0 + board[63];
	pattern0 = 3 * pattern0 + board[54];
	pattern0 = 3 * pattern0 + board[45];
	pattern0 = 3 * pattern0 + board[36];
	pattern0 = 3 * pattern0 + board[27];
	pattern0 = 3 * pattern0 + board[18];
	 
	score += set[eval_phase].diag8[pattern0];

	pattern0 = board[78];
	pattern0 = 3 * pattern0 + board[67];
	pattern0 = 3 * pattern0 + board[56];
	pattern0 = 3 * pattern0 + board[45];
	pattern0 = 3 * pattern0 + board[34];
	pattern0 = 3 * pattern0 + board[23];
	pattern0 = 3 * pattern0 + board[12];
	  
	score += set[eval_phase].diag7[pattern0];
	    
	pattern0 = board[87];
	pattern0 = 3 * pattern0 + board[76];
	pattern0 = 3 * pattern0 + board[65];
	pattern0 = 3 * pattern0 + board[54];
	pattern0 = 3 * pattern0 + board[43];
	pattern0 = 3 * pattern0 + board[32];
	pattern0 = 3 * pattern0 + board[21];

	score += set[eval_phase].diag7[pattern0];
	    
	pattern0 = board[71];
	pattern0 = 3 * pattern0 + board[62];
	pattern0 = 3 * pattern0 + board[53];
	pattern0 = 3 * pattern0 + board[44];
	pattern0 = 3 * pattern0 + board[35];
	pattern0 = 3 * pattern0 + board[26];
	pattern0 = 3 * pattern0 + board[17];
	    
	score += set[eval_phase].diag7[pattern0];
	    
	pattern0 = board[82];
	pattern0 = 3 * pattern0 + board[73];
	pattern0 = 3 * pattern0 + board[64];
	pattern0 = 3 * pattern0 + board[55];
	pattern0 = 3 * pattern0 + board[46];
	pattern0 = 3 * pattern0 + board[37];
	pattern0 = 3 * pattern0 + board[28];

	score += set[eval_phase].diag7[pattern0];
	    
	pattern0 = board[68];
	pattern0 = 3 * pattern0 + board[57];
	pattern0 = 3 * pattern0 + board[46];
	pattern0 = 3 * pattern0 + board[35];
	pattern0 = 3 * pattern0 + board[24];
	pattern0 = 3 * pattern0 + board[13];

	score += set[eval_phase].diag6[pattern0];
	    
	pattern0 = board[86];
	pattern0 = 3 * pattern0 + board[75];
	pattern0 = 3 * pattern0 + board[64];
	pattern0 = 3 * pattern0 + board[53];
	pattern0 = 3 * pattern0 + board[42];
	pattern0 = 3 * pattern0 + board[31];

	score += set[eval_phase].diag6[pattern0];
	    
	pattern0 = board[61];
	pattern0 = 3 * pattern0 + board[52];
	pattern0 = 3 * pattern0 + board[43];
	pattern0 = 3 * pattern0 + board[34];
	pattern0 = 3 * pattern0 + board[25];
	pattern0 = 3 * pattern0 + board[16];

	score += set[eval_phase].diag6[pattern0];
	    
	pattern0 = board[83];
	pattern0 = 3 * pattern0 + board[74];
	pattern0 = 3 * pattern0 + board[65];
	pattern0 = 3 * pattern0 + board[56];
	pattern0 = 3 * pattern0 + board[47];
	pattern0 = 3 * pattern0 + board[38];
	    
	score += set[eval_phase].diag6[pattern0];
	pattern0 = board[58];
	pattern0 = 3 * pattern0 + board[47];
	pattern0 = 3 * pattern0 + board[36];
	pattern0 = 3 * pattern0 + board[25];
	pattern0 = 3 * pattern0 + board[14];

	score += set[eval_phase].diag5[pattern0];
	    
	pattern0 = board[85];
	pattern0 = 3 * pattern0 + board[74];
	pattern0 = 3 * pattern0 + board[63];
	pattern0 = 3 * pattern0 + board[52];
	pattern0 = 3 * pattern0 + board[41];
	    
	score += set[eval_phase].diag5[pattern0];
	    
	pattern0 = board[51];
	pattern0 = 3 * pattern0 + board[42];
	pattern0 = 3 * pattern0 + board[33];
	pattern0 = 3 * pattern0 + board[24];
	pattern0 = 3 * pattern0 + board[15];
	    
	score += set[eval_phase].diag5[pattern0];
	    
	pattern0 = board[84];
	pattern0 = 3 * pattern0 + board[75];
	pattern0 = 3 * pattern0 + board[66];
	pattern0 = 3 * pattern0 + board[57];
	pattern0 = 3 * pattern0 + board[48];
	    
	score += set[eval_phase].diag5[pattern0];
	    
	pattern0 = board[48];
	pattern0 = 3 * pattern0 + board[37];
	pattern0 = 3 * pattern0 + board[26];
	pattern0 = 3 * pattern0 + board[15];

	score += set[eval_phase].diag4[pattern0];
	    
	pattern0 = board[84];
	pattern0 = 3 * pattern0 + board[73];
	pattern0 = 3 * pattern0 + board[62];
	pattern0 = 3 * pattern0 + board[51];

	score += set[eval_phase].diag4[pattern0];
	
	pattern0 = board[41];
	pattern0 = 3 * pattern0 + board[32];
	pattern0 = 3 * pattern0 + board[23];
	pattern0 = 3 * pattern0 + board[14];
	    
	score += set[eval_phase].diag4[pattern0];
	    
	pattern0 = board[85];
	pattern0 = 3 * pattern0 + board[76];
	pattern0 = 3 * pattern0 + board[67];
	pattern0 = 3 * pattern0 + board[58];
	    
	score += set[eval_phase].diag4[pattern0];
	    
	pattern0 = board[33];
	pattern0 = 3 * pattern0 + board[32];
	pattern0 = 3 * pattern0 + board[31];
	pattern0 = 3 * pattern0 + board[23];
	pattern0 = 3 * pattern0 + board[22];
	pattern0 = 3 * pattern0 + board[21];
	pattern0 = 3 * pattern0 + board[13];
	pattern0 = 3 * pattern0 + board[12];
	pattern0 = 3 * pattern0 + board[11];
	    
	score += set[eval_phase].corner33[pattern0];
	    
	pattern0 = board[63];
	pattern0 = 3 * pattern0 + board[62];
	pattern0 = 3 * pattern0 + board[61];
	pattern0 = 3 * pattern0 + board[73];
	pattern0 = 3 * pattern0 + board[72];
	pattern0 = 3 * pattern0 + board[71];
	pattern0 = 3 * pattern0 + board[83];
	pattern0 = 3 * pattern0 + board[82];
	pattern0 = 3 * pattern0 + board[81];
	    
	score += set[eval_phase].corner33[pattern0];
	
	pattern0 = board[36];
	pattern0 = 3 * pattern0 + board[37];
	pattern0 = 3 * pattern0 + board[38];
	pattern0 = 3 * pattern0 + board[26];
	pattern0 = 3 * pattern0 + board[27];
	pattern0 = 3 * pattern0 + board[28];
	pattern0 = 3 * pattern0 + board[16];
	pattern0 = 3 * pattern0 + board[17];
	pattern0 = 3 * pattern0 + board[18];
	    
	score += set[eval_phase].corner33[pattern0];

	pattern0 = board[66];
	pattern0 = 3 * pattern0 + board[67];
	pattern0 = 3 * pattern0 + board[68];
	pattern0 = 3 * pattern0 + board[76];
	pattern0 = 3 * pattern0 + board[77];
	pattern0 = 3 * pattern0 + board[78];
	pattern0 = 3 * pattern0 + board[86];
	pattern0 = 3 * pattern0 + board[87];
	pattern0 = 3 * pattern0 + board[88];
	    
	score += set[eval_phase].corner33[pattern0];
	    
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
	    
	score += set[eval_phase].corner52[pattern0];
	    
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
	  
	score += set[eval_phase].corner52[pattern0];
	    
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

	score += set[eval_phase].corner52[pattern0];
	    
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

	score += set[eval_phase].corner52[pattern0];
	    
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
	    
	score += set[eval_phase].corner52[pattern0];
	    
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

	score += set[eval_phase].corner52[pattern0];
	    
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

	score += set[eval_phase].corner52[pattern0];
	    
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

	score += set[eval_phase].corner52[pattern0];
	
	return score;
    }
    
    
}
