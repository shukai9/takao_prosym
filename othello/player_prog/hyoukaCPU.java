//評価関数プレイヤーのクラス
import java.util.*;

public class hyoukaCPU extends CPU {
  //ランダムクラスのインスタンス化
	private OthelloEvaluator ev;
  private Random rnd;

  public hyoukaCPU(int c, int valueMapID, int seed) {
    super(c);
		ev = ShiotaEv.evaluatorFactor(valueMapID, seed);
    rnd = new Random(seed);
  }

  int[] decide(GameState state) {

    int[] selected = null;
    int maxPoint = Integer.MIN_VALUE;

    for(int y = 1; y < GameState.SIZE; y++) {
      for(int x = 1; x < GameState.SIZE; x++) {
        if(state.canReverse(x, y)) {
          int pos[] = {x, y};

          int point = ev.evalMove(state, pos);
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

}
