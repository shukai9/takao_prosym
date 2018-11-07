//モンテカルロ木探索及びFPUによる改良のクラス
import java.util.*;

public class mctCPU extends CPU {
	static class MctParams {
		//1手読むごとの総プレイアウト数
		public int count; // = 1000; //100
		//1手読むごとの時間(msミリ秒なので， 1sec = 1000ms)
		public long time; // = 300;
		//時間とプレイアウト数どちらを使用するか(trueでプレイアウト数，falseで時間)
		public boolean switch_threshold; // = true;
		//探索を深くする時の閾値
		public int threshold; // = 39; //1;
		//UCB1アルゴリズムの定数C
		public double param_c; // = 0.39; // 1;
		//fpuの値
		public double param_fpu; // = 2.47; //100;
		public MctParams(int count, long time, boolean switch_threshold,
										 int threshold, double param_c, double param_fpu) {
			this.count = count;
			this.time = time;
			this.switch_threshold = switch_threshold;
			this.threshold = threshold;
			this.param_c = param_c;
			this.param_fpu = param_fpu;
		}
	}

	MctParams parameter;

  //データを入れるmap
  //プレイアウト数，ポイント(その局面のプレイヤーの勝数)，UCB1値
  Map<Integer, int[]> map;

	Random rnd;

  //クラスを作成する際に，どちらのプレイヤーか選択
  public mctCPU(int c, int seed, MctParams param) {
    super(c);
		rnd = new Random(seed);
		parameter = param;
		reset();
  }

  @Override
  public void reset() {
    map = new HashMap<Integer, int[]>();
  }

  //手を選ぶメソッド
  //これを実行することで手を選択
  @Override
  int[] decide(GameState state) {
    long start = System.currentTimeMillis();
		int playoutCount = 0;
    for (; ; playoutCount++) {
      if (parameter.switch_threshold) { //プレイアウトが閾値
        if (playoutCount >= parameter.count) break;
      } else { //時間が閾値
        if (System.currentTimeMillis() - start >= parameter.time) break;
      }
      select(state, true);
    }

    //置ける場所をリストに取得
    ArrayList<int[]> array = state.putPoint(true);

    //プレイアウト回数の最大の手を求める
		int selected = -1, max = -1;
		for (int i = 0; i < array.size(); i++) {
			int zob = array.get(i)[2];
			int pcount = safeMapGet(zob)[0];
			if (max < pcount) {
				selected = i; max = pcount;
			}
		}
    return Arrays.copyOf(array.get(selected), 2);
  }

  //手を選びながら探索していく
  protected int select(GameState state, boolean isRoot) {
		int[] data = safeMapGet(state.zobhash);

		int winner;
		if (!isRoot && data[0] < parameter.threshold) {
			winner = playout(state.clone());
		} else {
			ArrayList<int[]> array = state.putPoint(true);
			if(array.size() == 0) {
				if(state.isLastPass) {
					winner = state.Win();
				} else {
					//パスをして1手進めたところでプレイアウト
					GameState newstate = state.clone();
					newstate.pass();
					winner = select(newstate, false);
				}
			} else {
				//UCB1値が高いものを探すメソッドを行う
				int playouts = safeMapGet(state.zobhash)[0];
				int[] select_point = array.get(selectUCB(array, playouts));

				GameState newstate = state.clone();
				//1手進めた後で
				newstate.put(select_point[0], select_point[1]);
				winner = select(newstate, false);
			}
		}
    data[0]++;
    if(winner == -state.player) data[1]++;
    return winner;
  }

  //完全にランダムプレイ
  protected int playout(GameState state) {
    while(true) {
      ArrayList<int[]> array = state.putPoint(false);

      if(array.size() == 0) {
				// ゲーム終了
        if(state.isLastPass) return state.Win();

        //パスをして1手進めたところでプレイアウト
        state.pass();
      } else {
        int selected = rnd.nextInt(array.size());
        state.put(array.get(selected)[0], array.get(selected)[1]);
      }
    }
  }

  //UCB1値の計算をするメソッド
  //勝数が0の場所は無限になるので計算しない
  protected double ucb1(int count, int win, int parent_count) {
		if (count == 0) return parameter.param_fpu;
		return (double)win / (double)count
			+ parameter.param_c * Math.sqrt(2 * Math.log(parent_count + 1) / count);
  }

	//選んだ手の配列上の番号を返す
  protected int selectUCB(ArrayList<int[]> array, int parent_count) {
		int maxi = -1; double maxucb1 = 0;
		for (int i = 0; i < array.size(); i++) {
			int zob = array.get(i)[2];
			int[] count_win = safeMapGet(zob);

			double ucb = ucb1(count_win[0], count_win[1], parent_count);
			if (maxucb1 < ucb) {
				maxi = i; maxucb1 = ucb;
			}
    }
		if (maxi == -1) { System.out.println("something wrong"); return 0; }
    return maxi;
  }

	private int[] safeMapGet(int key) {
		if (!map.containsKey(key)) map.put(key, new int[2]);
		return map.get(key);
	}
}
