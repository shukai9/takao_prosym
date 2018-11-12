//評価関数を用いたモンテカルロ木探索のクラス
import java.util.*;

public class MctEPTCPU extends mctCPU {
	private OthelloEvaluator ev;
	int depth;

  //クラスを作成する際に，どちらのプレイヤーか選択
  public MctEPTCPU(int c, int evSelect, int seed, int depth) {
		super(c, seed, new MctParams(10000, 100, true, 10, 1.0, 2.47));
	//	ev = ShiotaEv.evaluatorFactor(evSelect, seed);
		 ev = ZebraEv.evaluatorFactory(0);
		this.depth = depth;
  }

  //評価値を用いてプレイアウトを行う
  @Override
  public int playout(GameState state) {
		for (int d = 0; d < depth; d++) {
      ArrayList<int[]> array = state.putPoint(false);
      if(array.size() == 0) {
				// ゲーム終了
        if(state.isLastPass) return state.Win();
				//パス
        state.pass();
      } else {
				int selected = rnd.nextInt(array.size());
        state.put(array.get(selected)[0], array.get(selected)[1]);
      }
    }
		// 途中の評価結果をもとに勝敗とする
		int value = ev.eval(state);
		if (value > 0) {
			return -state.player;
		} else if (value < 0) {
			return state.player;
		} else {
			return 0;
		}
  }
}
