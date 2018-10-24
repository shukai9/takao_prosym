//モンテカルロ木探索プレイヤのクラス
//UCB1値に評価関数を併用している
//(グローバル変数 useEvalUCB で変更可)

import java.util.*;

public class MCTCPU extends CPU {
    //1手読む毎の総プレイアウト数
    int count;

    //1手読むごとの時間(msミリ秒なので， 1sec = 1000ms)
    long time = 300;

    //時間とプレイアウト数どちらを使用するか(trueでプレイアウト数，falseで時間)
    boolean switch_threshold = true;

    //探索を深くする時の閾値
    int threshold;

    //UCB1アルゴリズムの定数C
    double C = 0.1; // 1;

    //評価関数組み込み型UCB1値の定数W
    double W = 5.0; //5.0

    //fpuの値
    double fpu = 100; //100;

    //深さ毎のプレイアウト数を保存する配列
    int[] total_count = new int[61];

    //mapに入れるデータの配列
    //{プレイアウト数, 勝数}
    int[] data = new int[3];

    //データを入れるmap
    //プレイアウト数，ポイント(その局面のプレイヤーの勝数)，UCB1値
    Map<Integer, int[]> map = new HashMap<Integer, int[]>();

    //1手選ぶ毎のプレイアウトの平均時間を入れるリスト
    ArrayList<Long> avePlayout = new ArrayList<Long>();

    //プレイアウトの回数を数える変数
    ArrayList<Integer> aveCount = new ArrayList<Integer>();

    //プレイアウトの回数の変数
    int playoutCount = 0;

    //Zebra評価関数
    OthelloEvaluator Eval;

    //評価関数組み込み型のUCB1値を使用するか
    boolean useEvalUCB = true;
    double area = 5000;

    //使用する評価関数の種類
    int SelectEvalFunc;

    Random rnd;
  
    public MCTCPU(int c, int count, int thres, int select, int seed) throws Exception {
	super(c);
	this.count = count;
	this.threshold = thres;
	this.SelectEvalFunc = select;
	this.rnd = new Random(seed);
	Eval = ZebraEv.evaluatorFactory(select);
    }

    //手を選ぶメソッド
    //これを実行することで手を選択
    @Override
    int[] decide(GameState state) {
	MCTGameState mctState = MCTGameState.copyFrom(state);

	ArrayList<int[]> array = putPoint(mctState);

	for(int i = 0; i < count; i++) {
	    int x = select(mctState.clone(), array);
	}

	int i = selectExp(array, state.black + state.white - 4, mctState);

	return Arrays.copyOf(array.get(i), 2);
    }

    //UCB1値を元にプレイアウトを割り当てる手を決定するメソッド
    public int select(MCTGameState state, ArrayList<int[]> array) {
	if(array.size() == 0) {
	    if(state.isLastPass) {
		if(state.black > state.white) return 1;
		if(state.white > state.black) return -1;
		return 0;
	    }
	    state.pass();
	    return select(state, putPoint(state));
	}
	int orgplayer = state.player;

	int select = selectUCB(array, state.putNumber(), state);
	int[] select_point = array.get(select);
	int[] data = map.get(select_point[2]);

	state.put(select_point[0], select_point[1]);
	int t = state.putNumber();
	int winner = (data[0] >= threshold) ? select(state, putPoint(state)) : playout(state);
	
	total_count[t]++;
	data[0]++;
	if(winner == orgplayer) data[1]++;
	return winner;
    }

    //プレイアウトを行うメソッド
    int playout(MCTGameState state) {
	while(true) {
	    ArrayList<int[]> array = putPoint(state);

	    if(array.size() == 0) {
		if(state.isLastPass) {
		    playoutCount++;
		    if(state.black > state.white) return 1;
		    if(state.white > state.black) return -1;
		    return 0;
		}
		state.pass();
	    } else {
		int selected = rnd.nextInt(array.size());
		state.put(array.get(selected)[0], array.get(selected)[1]);
	    }
	}
    }

    //UCB1値の計算をするメソッド
    //勝数が0の場所は無限になるので計算しない
    public double ucb1(int count, int win, int total) {
	//UCB1を計算
	if(count != 0) {
	    return (double)win / (double)count + C * Math.sqrt(2 * Math.log(total_count[total] + 1) / count);
	} else {
	    return fpu;
	}
    }

    //評価関数組み込み型UCB1値の計算メソッド
    public double ucb1_eval(int count, int win, int total, MCTGameState state) {
	if (count != 0) {
	    return ( (double)win + EvalValue(state) * W ) / ( (double)count + W ) + C * Math.sqrt(2 * Math.log(total_count[total] + 1 + W) / count + W);
	} else {
	    return fpu;
	}
	
    }

    
    public double exp(int count, int win) {
	return (double)win/(double)count;
    }

    public double exp_eval(int count, int win, MCTGameState state) {
	return ((double)win + EvalValue(state) * W) / ((double)count + W);
    }

    //UCB1値用の評価値算出と勝率への変換メソッド
    public double EvalValue (MCTGameState state) {
	GameState StateClone = new GameState();
	StateClone.set(state.data, state.turn, state.player);
	int point = Eval.eval(StateClone);

	double ret = 0.5 + point / area / 2.0;
	return Math.max(0.0, Math.min(1.0, ret));
    }

    //着手可能な手から最もUCB1値が高い手を返すメソッド
    public int selectUCB(ArrayList<int[]> array, int total, MCTGameState state) {
	for(int[] pos : array) {
	    if(!map.containsKey(pos[2])) {
		map.put(pos[2], new int[2]);
	    }
	}

	int select = 0;
	int[] select_point = array.get(0);
	int[] select_data = map.get(array.get(0)[2]);

	for(int i = 1; i < array.size(); i++) {
	    int[] search_point = array.get(i);
	    int[] search_data = map.get(search_point[2]);

	    if (useEvalUCB == true) {
		MCTGameState selectState = state.clone();
		selectState.put(select_point[0], select_point[1]);
		
		MCTGameState searchState = state.clone();
		searchState.put(search_point[0], search_point[1]);
		
		if(ucb1_eval(select_data[0], select_data[1], total, selectState) < ucb1_eval(search_data[0], search_data[1], total, searchState)) {
		    select = i;
		    select_point = search_point;
		    select_data = search_data;
		}
	    } else {
		if(ucb1(select_data[0], select_data[1], total) < ucb1(search_data[0], search_data[1], total)) {
		    select = i;
		    select_data = search_data;
		}		
	    }
	}
	return select;
    }

    // 平均の最大を返す
    public int selectExp(ArrayList<int[]> array, int total, MCTGameState state) {
	if (useEvalUCB == true) {
	    int select = 0;
	    int[] select_point = array.get(0);
	    int[] select_data = map.get(array.get(0)[2]);
	    MCTGameState select_state = state.clone();
	    select_state.put(select_point[0], select_point[1]);
	    double select_value = exp_eval(select_data[0], select_data[1], select_state);

	    for (int i = 1; i < array.size(); i++) {
		int[] search_point = array.get(i);
		int[] search_data = map.get(search_point[2]);
		MCTGameState search_state = state.clone();
		search_state.put(search_point[0], search_point[1]);
		double search_value = exp_eval(search_data[0], search_data[1], search_state);
		if (select_value < search_value) {
		    select = i;
		    select_value = search_value;
		}
	    }
	    return select;
	} else {
	    int select = 0;
	    int[] select_data = map.get(array.get(0)[2]);
	    double select_value = exp(select_data[0], select_data[1]);

	    for (int i = 1; i < array.size(); i++) {
		int[] search_data = map.get(array.get(i)[2]);
		double search_value = exp(search_data[0], search_data[1]);
		if (select_value < search_value) {
		    select = i;
		    select_value = search_value;
		}
	    }
	    return select;
	}
    }

    //パスの時のゾブリストの値をmapに追加する関数
    public void pass(int passZob) {

	if(map.containsKey(passZob) == false) {
	    map.put(passZob, new int[2]);
	}
    }

    //置ける場所をArrayListで返す関数
    public ArrayList<int[]> putPoint(MCTGameState state) {
	ArrayList<int[]> array = new ArrayList<int[]>();
	for(int y = 1; y < size-1; y++) {
	    for(int x = 1; x < size-1; x++) {
		if(!state.canPut(x, y)) continue;
		
		MCTGameState after = state.clone();
		after.put(x, y);
		
		int pos[] = {x, y, after.zobhash};
		array.add(pos);
	    }
	}
	return array;
    }

    @Override
    public void reset() {
	map = new HashMap<Integer, int[]>();
	total_count = new int[61];
	avePlayout = new ArrayList<Long>();
	aveCount = new ArrayList<Integer>();
    }

    //閾値の最適値を求める時の閾値を設定するためのメソッド
    @Override
    public void setThreshold(int t) {
	threshold = t;
	reset();
    }

    //fpuの最適値を求める時の閾値を設定するためのメソッド
    @Override
    public void setFPU(double f) {
	fpu = f;
	reset();
    }

    //定数Cの最適値を求める時の閾値を設定するためのメソッド
    @Override
    public void setC(double teisu) {
	C = teisu;
	reset();
    }

    //プレイアウトの平均時間を返すメソッド
    @Override
    public long avePlayout() {
	int x = avePlayout.size();
	long sum = 0;
	for(int i = 0; i < x; i++) {
	    long add = avePlayout.get(i);
	    sum += add;
	}
	return (long)sum/x;
    }

    //プレイアウトの平均回数を返すメソッド
    @Override
    public double aveCount() {
	int x = aveCount.size();
	int sum = 0;
	for(int i = 0; i < x; i++) {
	    int add = aveCount.get(i);
	    sum += add;
	}
	return (double)sum/x;
    }
}
