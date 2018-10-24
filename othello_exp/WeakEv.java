//塩田が考案した評価関数のクラス

class WeakEv implements OthelloEvaluator {
    private final static int[] valueMap = {
	45, -11,  4, -1, -1,  4, -11,  45,
	-11, -16, -1, -3, -3, -1, -16, -11,
	4,   -1,  2, -1, -1,  2,  -1,   4,
	-1,  -3, -1,  0,  0, -1,  -3,  -1,
	-1,  -3, -1,  0,  0, -1,  -3,  -1,
	4,   -1,  2, -1, -1,  2,  -1,   4,
	-11, -16, -1, -3, -3, -1, -16, -11,
	45, -11,  4,  -1, -1,  4, -11,  45
    };

    public WeakEv() {
    }

    @Override
    public int eval(GameState s) {
	int bp = banPoint(s);
	int fs = fixStone(s);
	int cn = canNumber(s);
	return bp * 2 + fs * 5 + cn * 1;
    }
	
    //評価した点数を返すメソッド
    @Override
    public int evalMove(GameState state, int[] pos) {
	int player = state.player;
	GameState s = new GameState(true);
	s.set(state.data, state.turn, state.player);
	s.put(pos[0], pos[1]);

	return eval(s);
    }

    //位置による評価を行うメソッド
    public int banPoint(GameState state) {
	int player = state.player * -1;
	int sum = 0;

	int[] data = state.data;
	//位置ごとに計算を行い加算していく
	for(int i = 1; i <= 8; i++) {
	    for(int j = 1; j <= 8; j++) {
		if(data[i + j * 10] != 0) {
		    sum += (data[i + j * 10] * valueMap[(i-1) + (j-1) * 8]) + (int) Math.floor(Math.random() * 3);
		}
	    }
	}
	
	return sum * player;
    }

    //確定石の数を返すメソッド
    //全部探すのは難しいので辺のみ
    public int fixStone(GameState state) {
	//それぞれの色の確定石の数を保存する配列
	//{黒, 白}
	int[] fs = new int[2];
	int[] data = state.data;
	int[] corner = {data[1+1*10], data[8+1*10], data[1+8*10], data[8+8*10]};

	for(int i = 0; i < corner.length; i++) {
	    if(data[i] == 1) {
		fs[0]++;
	    } else if(data[i] == -1) {
		fs[1]++;
	    }
	}

	//横の確定石を返すメソッドと縦の確定石を返すメソッドを利用して辺の確定石を求める
	//上の横線の確定石
	int[] line = {corner[0], corner[1]};
	int[] add_fs = fsHolLine(line, 1, state);
	fs[0] += add_fs[0];
	fs[1] += add_fs[1];
	//下の横線の確定石
	line[0] = corner[2];
	line[1] = corner[3];
	add_fs = fsHolLine(line, 8, state);
	fs[0] += add_fs[0];
	fs[1] += add_fs[1];
	//左の縦線の確定石
	line[0] = corner[0];
	line[1] = corner[2];
	add_fs = fsVerLine(line, 1, state);
	fs[0] += add_fs[0];
	fs[1] += add_fs[1];
	//右の縦線の確定石
	line[0] = corner[1];
	line[1] = corner[3];
	add_fs = fsVerLine(line, 8, state);
	fs[0] += add_fs[0];
	fs[1] += add_fs[1];

	if(state.player == 1) {
	    return (fs[1] - fs[0] + (int) Math.floor(Math.random() * 3)) * 11;
	} else {
	    return (fs[0] - fs[1] + (int) Math.floor(Math.random() * 3)) * 11;
	}
    }

    //横並びの辺の確定石を求めるメソッド
    public int[] fsHolLine(int[] corner, int y, GameState state) {
	//それぞれの色の確定石の数を保存する配列
	//{黒の確定石数，白の確定石数}
	int[] fs = new int[2];
	int[] data = state.data;

	CheckTop: {
	    if(corner[0] != 0 && corner[1] != 0) {
		int b_fs = 0;
		int w_fs = 0;
		for(int i = 2; i <= 7; i++) {
		    if(data[i + 10 * y] == 0) {
			b_fs = 0;
			w_fs = 0;
			break;
		    } else if(data[i + 10 * y] == 1) {
			b_fs++;
		    } else {
			w_fs++;
		    }
		    if(i == 7) {
			fs[0] += b_fs;
			fs[1] += w_fs;
			break CheckTop;
		    }
		}
	    }

	    //両端があり且つ全部埋まっていないまたは，右端だけある場合
	    /*
	      右端から順に探索，プレイヤーと同じ石が連続していれば確定石と判断．
	      そうでない場合そこで探索を終了
	    */
	    if(corner[0] != 0) {
		for(int i = 2; i <= 7; i++) {
		    if(corner[0] != data[i + 10 * y]) {
			break;
		    }
		    if(corner[0] == 1) {
			fs[0]++;
		    } else {
			fs[1]++;
		    }
		}
	    }

	    //両端があり且つ全部埋まっていないまたは，左端だけある場合
	    /*
	      上と逆の順で左端から探索
	    */
	    if(corner[1] != 0) {
		for(int i = 7; i <= 2; i++) {
		    if(corner[1] != data[i + 10 * y]) {
			break;
		    }
		    if(corner[1] == 1) {
			fs[0]++;
		    } else {
			fs[1]++;
		    }
		}
	    }
	}
	return fs;
    }

    //縦並びの辺の確定石を求めるメソッド
    public int[] fsVerLine(int[] corner, int x, GameState state) {
	//それぞれの色の確定石の数を保存する配列
	//{黒の確定石数, 白の確定石数}
	int[] fs = new int[2];

	int[] data = state.data;

	Check: {
	    if(corner[0] != 0 && corner[1] != 0) {
		int b_fs = 0;
		int w_fs = 0;

		for(int i = 2; i <= 7; i++) {
		    if(data[x + 10 * i] == 0) {
			b_fs = 0;
			w_fs = 0;
			break;
		    } else if(data[x + 10 * i] == 1) {
			b_fs++;
		    } else {
			w_fs++;
		    }

		    if(i == 7) {
			fs[0] += b_fs;
			fs[1] += w_fs;
			break Check;
		    }
		}
	    }

	    //両端に駒がある且つ全部埋まっていないまたは，上だけある場合
	    /*
	      上から順に探索
	      プレイヤーと同じ石が連続していれば確定石と判断
	      そうでなければそこで探索を終了
	    */
	    if(corner[0] != 0) {
		for(int i = 2; i <= 7; i++) {
		    if(corner[0] != data[x + 10 * i]) {
			break;
		    }
		    if(corner[0] == 1) {
			fs[0]++;
		    } else {
			fs[1]++;
		    }
		}
	    }

	    //両端に駒がある且つ全部埋まっていないまたは，下だけある場合
	    /*
	      下から順に探索
	      上と逆の順で同様の処理
	    */
	    if(corner[1] != 0) {
		for(int i = 7; i <= 2; i++) {
		    if(corner[1] != data[x + 10 * i]) {
			break;
		    }
		    if(corner[1] == 1) {
			fs[0]++;
		    } else {
			fs[1]++;
		    }
		}
	    }
	}
	return fs;
    }

    //横並びの辺の確定石を求めるメソッド
    public int canNumber(GameState state) {
	int cn = 0;
	for(int y = 1; y <= 8; y++) {
	    for(int x = 1; x <= 8; x++) {

		if(state.data[x + y * 10] != 0) continue;

		if(state.canReverse(x, y) == true) {
		    cn++;
		}
	    }
	}

	return -(cn + (int) Math.floor(Math.random() * 2) * 10);
    }

}
