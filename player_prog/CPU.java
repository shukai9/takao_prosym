//コンピュータプレイヤーのスーパークラス
import java.util.*;

public class CPU {
  int color;

  public CPU(int c) {
    color = c;
  }

  int [] decide(GameState state) {
    return new int[] {-1, -1};
  }

  void reset() {
  }
}
