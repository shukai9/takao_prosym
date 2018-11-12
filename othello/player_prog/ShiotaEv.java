import java.util.*;

class ShiotaEv implements OthelloEvaluator {
  private int[] valueMap;
  private Random rnd;

	private ShiotaEv() {}

	static ShiotaEv evaluatorFactor(int select, int seed) {
		ShiotaEv ret = new ShiotaEv();
		if (select == 0) {
      ret.valueMap = new int[] {
        45, -11,  4, -1, -1,  4, -11,  45,
        11, -16, -1, -3, -3, -1, -16, -11,
        4,  -1,  2, -1, -1,  2,  -1,   4,
        -1,  -3, -1,  0,  0, -1,  -3,  -1,
        -1,  -3, -1,  0,  0, -1,  -3,  -1,
        4,  -1,  2, -1, -1,  2,  -1,   4,
        -11, -16, -1, -3, -3, -1, -16, -11,
        45, -11,  4, -1, -1,  4, -11,  45
      };
    } else {
      ret.valueMap = new int[] { 	 // http://uguisu.skr.jp/othello/5-1.html 1/18
        30, -12,   0,  -1,  -1,   0, -12,  30,
        -12, -15,  -3,  -3,  -3,  -3, -15, -12,
        0,  -3,   0,  -1,  -1,   0,  -3,   0,
        -1,  -3,  -1,   -1,   -1,  -1,  -3,  -1,
        -1,  -3,  -1,   -1,   -1,  -1,  -3,  -1,
        0,  -1,   0,  -1,  -1,   0,  -1,   0,
        -12, -15,  -3,  -3,  -3,  -3, -15, -12,
        30, -12,   0,  -1,  -1,   0, -12,  30
      };
    }
    ret.rnd = new Random(seed);
		return ret;
	}
	
  // state の時点の評価値を返す
	@Override
  public int eval(GameState state) {
    int bp = banPoint(state);
    int fs = fixStone(state);
    int cn = canNumber(state);
    return -(bp * 2 + fs * 5 + cn * 1);
	}

  // state から move を指した時点の評価値を返す
	@Override
  public int evalMove(GameState state, int[] move) {
		GameState s = state.clone();
    s.put(move[0], move[1]);
    return eval(s);
	}

  //位置による評価を行うメソッド
	private int banPoint(GameState state) {
    int sum = 0;
    //位置ごとに計算を行い加算していく
    for(int i = 1; i <= 8; i++) {
      for(int j = 1; j <= 8; j++) {
        if(state.data[i + j * 10] != 0) { //石が打たれている
          sum += state.data[i + j * 10] * valueMap[(i-1) + (j-1) * 8] + rnd.nextInt(3);
        }
      }
    }
    //白がプレイヤーのとき数値を反転させる
    return sum * state.player;
  }
	
  //確定石の数を返すメソッド
  //全部探すのは難しいので辺のみ
  private int fixStone(GameState state) {
    //それぞれの色の確定石の数を保存する配列
    //{黒, 白}
    int[] fs = new int[2];

    int[] data = state.data;
    //角の石の配列を作成
    int[] corner = {data[1+1*10], data[8+1*10], data[1+8*10], data[8+8*10]};

    //角がある場合は確定石なので加算
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
    add_fs = fsVerLine(line, 8, state);
    fs[0] += add_fs[0];
    fs[1] += add_fs[1];
    //右の縦線の確定石
    line[0] = corner[1];
    line[1] = corner[3];
    add_fs = fsVerLine(line, 8, state);
    fs[0] += add_fs[0];
    fs[1] += add_fs[1];

    // プレイヤーの確定石数で返す
		return ((fs[0] - fs[1]) * state.player + rnd.nextInt(3)) * 11;
  }

  //横並びの辺の確定石を求めるメソッド
  private int[] fsHolLine(int[] corner, int y, GameState state) {
    //それぞれの色の確定石の数を保存する配列
    //{黒の確定石数，白の確定石数}
    int[] fs = new int[2];

    int[] data = state.data;

    //上の辺
    CheckTop: {
      //両端に駒がある場合
      if(corner[0] != 0 && corner[1] != 0) {
        int b_fs = 0;
        int w_fs = 0;
        //全部埋まっている場合全て確定石
        for(int i = 2; i <= 7; i++) {
          //空きがあれば確定石と判断せず次のforへ移る
          if(data[i + 10 * y] == 0) {
            b_fs = 0;
            w_fs = 0;
            break;
          } else if(data[i + 10 * y] == 1) {
            b_fs++;
          } else {
            w_fs++;
          }
          //最後まで探索し終わった(i == 7)とき
          if(i == 7) {
            //空きがないので確定石として加算し上の辺の探索を終わる
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
          //空きまたは別の石がある場合はそこで処理を終了
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
          //空きまたは別の石がある場合はそこで処理を終了
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
  private int[] fsVerLine(int[] corner, int x, GameState state) {
    //それぞれの色の確定石の数を保存する配列
    //{黒の確定石数, 白の確定石数}
    int[] fs = new int[2];

    int[] data = state.data;

    //上の辺
    Check: {
      //両端に駒がある場合
      if(corner[0] != 0 && corner[1] != 0) {
        int b_fs = 0;
        int w_fs = 0;
        //全部埋まっている場合すべて確定石
        for(int i = 2; i <= 7; i++) {
          //空きがあれば確定石と判断せず次のforへ移る
          if(data[x + 10 * i] == 0) {
            b_fs = 0;
            w_fs = 0;
            break;
          } else if(data[x + 10 * i] == 1) {
            b_fs++;
          } else {
            w_fs++;
          }
          //最後まで探索し終わった(i == 7)とき
          if(i == 7) {
            //空きがないので確定石として加算し上の辺の探索を終わる
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
          //空きまたは別の石がある場合そこで処理を終了
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
          //空きまたは別の石があればそこで処理を終了
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
  private int canNumber(GameState state) {
    int cn = state.putPoint(false).size();
    return (cn + rnd.nextInt(2) * 10);
  }
}
