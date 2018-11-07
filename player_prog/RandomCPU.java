import java.util.*;

public class RandomCPU extends CPU {
  Random rnd;

  public RandomCPU(int c, int seed) {
    super(c);
    rnd = new Random(seed);
  }

  int[] decide(GameState state) {

    //置ける場所を記憶するリスト
    ArrayList<int[]> array = state.putPoint(false);

    //置ける場所がない場合は，座標が{-1, -1}として返す
    if(array.size() <= 0) {
      int pos[] = {-1, -1};
      return pos;
    }

    //乱数で選ばれた置ける場所を返す
    return array.get(rnd.nextInt(array.size()));
  }
}
