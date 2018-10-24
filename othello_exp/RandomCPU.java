//ランダムで手を決めるプレイヤのクラス

import java.util.*;

public class RandomCPU extends CPU {
    
    //自分が置くターンを判別する関数
    int color;
    int size = 10;

    //ランダムクラスのインスタンス化
    Random rnd = new Random();

    public RandomCPU(int c) {
	super(c);
    }

    int[] decide(GameState state) {
	
	//置ける場所を記憶するリスト
	ArrayList<int[]> array = new ArrayList<int[]>();

	//盤面の空マスを置けるかチェック
	for(int y = 1; y < size; y++) {
	    for(int x = 1; x < size; x++) {

		//既に駒があればパス
		if(state.data[x + y * 10] != 0) continue;

		//置けるマスの時，候補として記憶
		if(state.canReverse(x, y) == true) {
		    int pos[] = {x, y};

		    array.add(pos);
		}
	    }
	}

	//ランダム選択

	//置ける場所がない場合は，座標が{-1, -1}として返す
	if(array.size() <= 0) {
	    int pos[] = {-1, -1};
	    return pos;
	}

	//乱数を生成してランダムで置く場所を決定
	int index = rnd.nextInt(array.size());

	//乱数で選ばれた置ける場所を返す
	return array.get(index);
    }
}
