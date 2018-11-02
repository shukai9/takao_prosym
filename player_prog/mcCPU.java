//モンテカルロ法のクラス
import java.util.*;

public class mcCPU extends CPU {
  //プレイアウト数
  protected int count = 50;
  Random rnd;

  //プレイヤー作成時に駒の色も指定する
  public mcCPU(int c, int seed) {
    super(c);
    rnd = new Random(seed);
  }

  //石を打つときにどこに打つか決めるメソッド
  //現在の状態(GameStateクラス)を引数として取る
  @Override
  int[] decide(GameState state) {
    //置ける場所を記憶するリスト
    ArrayList<int[]> array = state.putPoint();

    //置ける場所がない場合は座標が{-1, -1}として返す
    if(array.size() <= 0) {
      return new int[] {-1, -1};
    }

    //それぞれの手の点数を保存する配列
    int[] point = new int[array.size()];
    //手をずらしながらプレイアウトを繰り返す
    for(int i = 0; i < count; i++) {
      GameState clone = state.clone();
      int select = i % array.size();
      //探索する手を打った後プレイアウトする
      int a[] = array.get(select);
      clone.put(a[0], a[1]);
      playout(clone);
      if(clone.Win() == state.player) {
        point[select]++;
      }
    }

    //ポイントが最大の手を求める
    int maxi = 0;
    for(int i = 1; i < array.size(); i++) {
      if(point[i] > point[maxi]) {
        maxi = i;
      }
    }
    return array.get(maxi);
  }

  //完全にランダムプレイ
  void playout(GameState state) {
    while(true) {
      ArrayList<int[]> array = state.putPoint();

      if(array.size() == 0) {
        //置けなければパス
        if(state.isLastPass) return;
        state.Pass();
      } else {
        int selected = rnd.nextInt(array.size());
        int[] a = array.get(selected);
        state.put(a[0], a[1]);
      }
    }
  }
}
