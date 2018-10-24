//モンテカルロ法プレイヤのクラス

import java.util.*;

public class MCCPU extends CPU {
    //自分が置くターンを判別する関数
    int color;

    //プレイアウト数
    int count;

    //盤の大きさ(壁含む)
    int size = 10;

    Random rnd;

    //プレイヤー作成時に駒の色も指定する
    public MCCPU(int c, int count, int seed) {
	super(c);
	this.count = count;
	rnd = new Random(seed);
    }

    //石を打つときにどこに打つか決めるメソッド
    //現在の状態(GameStateクラス)を引数として取る
    @Override
    int[] decide(GameState state) {
	ArrayList<int[]> array = putPoint(state);

	if(array.size() <= 0) {
	    int pos[] = {-1, -1};
	    return pos;
	}

	int[] point = new int[array.size()];
	int select = 0;

	for(int i = 0; i < count; i++) {
	    GameState clone = state.clone();

	    if(select >= array.size()) {
		select = 0;
	    }

	    int a[] = array.get(select);
	    clone.put(a[0], a[1]);
	    playout(clone);
	    if(clone.Win() == state.player) {
		point[select]++;
	    }
	    select++;
	}

	int j = 0;
	for(int i = 1; i < array.size(); i++) {
	    if(point[i] > point[j]) {
		j = i;
	    }
	}
	return array.get(j);
    }

    //駒を置ける場所をArrayListで返す関数
    public ArrayList<int[]> putPoint(GameState state) {
	ArrayList<int[]> array = new ArrayList<int[]>();
	for(int y = 1; y < size-1; y++) {
	    for(int x = 1; x < size-1; x++) {
		if(!state.canReverse(x, y)) continue;

		GameState after = state.clone();
		after.put(x, y);

		int pos[] = {x, y};
		array.add(pos);
	    }
	}
	return array;
    }

    //プレイアウトを行うメソッド
    int playout(GameState state) {
	while(true) {
	    ArrayList<int[]> array = putPoint(state);

	    if(array.size() == 0) {
		if(state.isLastPass) {
		    if(state.black > state.white) return 1;
		    if(state.white > state.black) return -1;
		    return 0;
		}
		state.Pass();
	    } else {
		int selected = rnd.nextInt(array.size());
		state.put(array.get(selected)[0], array.get(selected)[1]);
	    }
	}
    }
}
