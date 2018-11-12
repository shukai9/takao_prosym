// オセロの評価関数を実現するインターフェイス定義
interface OthelloEvaluator {

  // state の時点の評価値を返す
  int eval(GameState state);

  // state から move を指した時点の評価値を返す
  int evalMove(GameState state, int[] move);
}
