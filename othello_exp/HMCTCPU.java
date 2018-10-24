//プレイアウトに評価関数を併用したモンテカルロ木探索のクラス
//UCB1値にも評価関数を併用している
//(MCTCPUを継承しているため)

import java.util.*;

public class HMCTCPU extends MCTCPU {
    //1手読む毎の総プレイアウト数
    int count;

    //1手読む毎の時間
    long time = 300;

    //時間とプレイアウト数どちらを使用するか(trueでプレイアウト数，falseで時間)
    boolean switch_threshold = true;

    //探索を深くする時の閾値
    int threshold; //最適値は35?

    //UCB1アルゴリズムの定数C
    double C = 0.1;

    //fpuの値
    double fpu = 100; //100.0

    //プレイアウト時に使用する評価関数のCPUを指定
    HyoukaCPU CPU;

    //クラスを作成する際に，どちらのプレイヤーか選択
    public HMCTCPU(int c, int count, int thres, int select, int seed) throws Exception {
        super(c, count, thres, select, seed);
        super.time = time;
        super.switch_threshold = switch_threshold;
        super.fpu = fpu;
        super.C = C;
        CPU = new HyoukaCPU(1, select, seed);
    }

    //評価値を用いてプレイアウトを行う
    @Override
    int playout(MCTGameState state) {
        while(true) {
            // kmatsu: ここで必要なものは pass かどうかの判定なので，
            // それ専用のコードとすると高速化できる
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
                int[] selected = CPU.playoutDecide(state, array);
                state.put(selected[0], selected[1]);
            }
        }
    }
}
