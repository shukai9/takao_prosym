//評価関数プレイヤーのクラス
import java.util.*;

public class hyoukaCPU extends CPU {
  //ランダムクラスのインスタンス化
  private int[] valueMap;
  private Random rnd;

  public hyoukaCPU(int c, int valueMapID, int seed) {
    super(c);
    if (valueMapID == 0) {
      valueMap = new int[] {
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
      valueMap = new int[] { 	 // http://uguisu.skr.jp/othello/5-1.html 1/18
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
    rnd = new Random(seed);
  }

  int[] decide(GameState state) {

    int[] selected = null;
    int maxPoint = Integer.MIN_VALUE;

    for(int y = 1; y < GameState.SIZE; y++) {
      for(int x = 1; x < GameState.SIZE; x++) {
        if(state.canReverse(x, y)) {
          int pos[] = {x, y};

          int point = hyoukaPoint(pos, state);
          if (maxPoint < point) {
            maxPoint = point;
            selected = pos;
          }
        }
      }
    }

    //置ける場所がない場合は座標が{-1, -1}として返す
    if (selected == null) {
      return new int[] {-1, -1};
    }

    return selected;
  }

  int[] playoutDecide(mctGameState state) {
    GameState s = GameState.makeStateFrom(state.data, state.turn, state.player);
    return playoutDecide(s);
  }

  int[] playoutDecide(GameState state) {
    //置ける場所を記憶するリスト
    ArrayList<int[]> array = new ArrayList<int[]>();

    //盤面の空マスを置けるかチェック
    for(int y = 1; y < GameState.SIZE; y++) {
      for(int x = 1; x < GameState.SIZE; x++) {
        //既に駒がある時はパス
        if(state.data[x + y * 10] != 0) continue;

        //置けるマスのとき，候補として記憶
        if(state.canReverse(x, y) == true) {
          int pos[] = {x, y};
          array.add(pos);
        }
      }
    }

    int arraysize = array.size();
    //置ける場所がない場合は座標が{-1, -1}として返す
    if(arraysize <= 0) {
      int pos[] = {-1, -1};
      return pos;
    }
    //置ける場所が1つの場合はその手を返す
    else if(arraysize == 1) {
      int pos[] = array.get(0);
      int data[] = {pos[0], pos[1]};
      return data;
    }

    //並び替えた手を入れる配列
    int[][] sortArray = new int[arraysize][3];
    //探索の必要がある場合は評価を行い点数をつける
    for(int i = 0; i < arraysize; i++) {
      int[] pos = array.get(i);
      int point = hyoukaPoint(pos, state);
      sortArray[i][0] = pos[0];
      sortArray[i][1] = pos[1];
      sortArray[i][2] = point;

      //並び替え
      for(int j = i-1; j >= 0; j--) {
        if(sortArray[j+1][2] > sortArray[j][2]) {
          int[] sortPos = {sortArray[j][0], sortArray[j][1], sortArray[j][2]}; //sortArrayのコピー

          sortArray[j][0] = sortArray[j+1][0];
          sortArray[j][1] = sortArray[j+1][1];
          sortArray[j][2] = sortArray[j+1][2];

          sortArray[j+1][0] = sortPos[0];
          sortArray[j+1][1] = sortPos[1];
          sortArray[j+1][2] = sortPos[2];
        } else {
          break;
        }
      }
    }

    int ranPoint = (int)Math.pow(2, arraysize) - 1;
    int ranSelect = rnd.nextInt(ranPoint);

    int ret[] = new int[2];

    int i = 1;
    for(int j = arraysize -1; j >= 0; j--) {
      ranSelect -= i;
      if(ranSelect <= 0) {
        ret[0] = sortArray[j][0];
        ret[1] = sortArray[j][1];
        break;
      }
      i *= 2;
    }
    return ret;

  }

  //評価した点数を返すメソッド
  public int hyoukaPoint(int[] pos, GameState state) {
    int player = state.player;
    //stateを新しく作り，その点数を返す
    GameState s = state.clone();
    //手を打った状態へ遷移
    s.put(pos[0], pos[1]);
    //位置による評価
    int bp = banPoint(s);
    int fs = fixStone(s);
    int cn = canNumber(s);
    return bp * 2 + fs * 5 + cn * 1;
  }

  //位置による評価を行うメソッド
  public int banPoint(GameState state) {
    //手を打つ前のプレイヤーのための評価なので-1してプレイヤーを打つ前に戻す
    int player = state.player * -1;
    int sum = 0;

    int[] data = state.data;
    //位置ごとに計算を行い加算していく
    for(int i = 1; i <= 8; i++) {
      for(int j = 1; j <= 8; j++) {
        if(data[i + j * 10] != 0) { //石が打たれてない
          sum += (data[i + j * 10] * valueMap[(i-1) + (j-1) * 8]) + (int) Math.floor(rnd.nextDouble() * 3);
        }
      }
    }
    //白がプレイヤーのとき数値を反転させる
    return sum * player;
  }

  //確定石の数を返すメソッド
  //全部探すのは難しいので辺のみ
  public int fixStone(GameState state) {
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

    //打った後なので逆のプレイヤーの確定石数で返す
    if(state.player == 1) {
      return (fs[1] - fs[0] + (int) Math.floor(rnd.nextDouble() * 3)) * 11;
    } else {
      return (fs[0] - fs[1] + (int) Math.floor(rnd.nextDouble() * 3)) * 11;
    }
  }

  //横並びの辺の確定石を求めるメソッド
  public int[] fsHolLine(int[] corner, int y, GameState state) {
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
  public int[] fsVerLine(int[] corner, int x, GameState state) {
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
  public int canNumber(GameState state) {
    int cn = 0;
    for(int y = 1; y <= 8; y++) {
      for(int x = 1; x <= 8; x++) {
        //置けるマスのとき，候補数を加算
        if(state.canReverse(x, y)) {
          cn++;
        }
      }
    }

    return -(cn + (int) Math.floor(rnd.nextDouble() * 2) * 10);
  }
}
