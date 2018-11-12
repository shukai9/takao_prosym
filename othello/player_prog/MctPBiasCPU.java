//評価関数を用いたモンテカルロ木探索のクラス
import java.util.*;

public class MctPBiasCPU extends mctCPU {
	private OthelloEvaluator ev;
	double softmaxBase;

  //クラスを作成する際に，どちらのプレイヤーか選択
  public MctPBiasCPU(int c, int evSelect, int seed, double softmaxBase) {
		super(c, seed, new MctParams(1000, 100, true, 10, 1.0, 2.47));
		ev = ZebraEv.evaluatorFactory(0);
		this.softmaxBase = softmaxBase;
  }

  //評価値を用いてプレイアウトを行う
  @Override
  public int playout(GameState state) {
    while(true) {
      ArrayList<int[]> array = state.putPoint(false);
      if(array.size() == 0) {
				// ゲーム終了
        if(state.isLastPass) return state.Win();
				//パス
        state.pass();
      } else if (array.size() == 1) {
				//置ける場所が1つの場合はその手を選択
				state.put(array.get(0)[0], array.get(0)[1]);
			} else {
        int selected = playoutDecide(state, array);
        state.put(array.get(selected)[0], array.get(selected)[1]);
      }
    }
  }

  int playoutDecide(GameState state, ArrayList<int[]> array) {
		double[] xs = new double[array.size()];
		double total = 0;
		for (int i = 0; i < array.size(); i++) {
			xs[i] = Math.pow(softmaxBase, ev.evalMove(state, array.get(i)));
			total += xs[i];
		}

		// 乱数を振る
		double r = rnd.nextDouble() * total;
		for (int i = 0; i < array.size(); i++) {
			r -= xs[i];
			if (r < 0) return i;
		}
		// 誤差が生じた？
		return array.size()-1;
  }
}
