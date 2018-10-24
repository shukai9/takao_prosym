//評価関数を用いたモンテカルロ木探索のクラス
import java.util.*;

public class hmctCPU extends mctCPU {
    //1手読む毎の総プレイアウト数
    int count = 100;

    //1手読む毎の時間
    long time = 100;

    //時間とプレイアウト数どちらを使用するか(trueでプレイアウト数，falseで時間)
    boolean switch_threshold = false;

    //探索を深くする時の閾値
    int threshold = 30;

    //UCB1アルゴリズムの定数C
    double C = 0.18;

    //fpuの値
    double fpu = 1.69; //100.0


    //プレイアウト時に使用する評価関数のCPUを指定
    hyoukaCPU CPU = new hyoukaCPU(1);

    //クラスを作成する際に，どちらのプレイヤーか選択
    public hmctCPU(int c) {
	super(c);
	super.count = count;
	super.time = time;
	super.switch_threshold = switch_threshold;
	super.threshold = threshold;
	super.fpu = fpu;
	super.C = C;
    }

    //評価値を用いてプレイアウトを行う
    @Override
    int playout(mctGameState state) {
	while(true) {
	    ArrayList<int[]> array = putPoint(state);
	    if(array.size() == 0) {
		//置けなければパス
		if(state.isLastPass) {
		    //プレイアウト回数の加算
		    playoutCount++;
		    //相手もパスしていればここで結果を返す
		    if(state.black > state.white) return 1;
		    if(state.white > state.black) return -1;
		    return 0;
		}
		//パスをして1手進めたところでプレイアウト
		state.pass();
	    } else {
		int[] selected = CPU.playoutDecide(state);
		state.put(selected[0], selected[1]);
	    }
	}
    }
}
