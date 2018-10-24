//コンピュータプレイヤーのスーパークラス
import java.util.*;

public class CPU {
    int color;
    int cnum;

    //盤の大きさ(壁含む)
    int size = 10;

    //初期レート
    double rate = 1500;

    public CPU(int c) {
	color = c;
    }
    public CPU(int c, int h) {
	color = c;
  cnum = h;
    }

    //mctGameStateが渡された場合，GameStateに変換
    int [] decide(mctGameState state) {
	GameState s = new GameState();
	s.set(state.data, state.turn, state.player);

	return decide(s);
    }

    int [] decide(GameState state) {
	int[] pos = {-1, -1};
	return pos;
    }

    public void setThreshold(int j) {}

    public void setC(double c) {}

    public void setFPU(double f) {}

    public void reset() {}

    public long avePlayout() {
	return -1;
    }

    public double aveCount() {
	return -1;
    }

    public double rate(double rate){
      return rate;
    }

}
