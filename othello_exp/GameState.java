//ゲーム情報を管理するクラス
//手番，盤面情報，駒の配置処理など

import java.util.*;
import java.util.Arrays;

public class GameState extends Observable {
    final static int SIZE = 10;
    final static int BLACK = 1;
    final static int WHITE = -1;
    final static int WALL = 2;

    //x,yの座標をx+y*SIZEの値に変換する関数
    static int at(int x, int y) {
	return x + y * SIZE;
    }

    //atDir(x座標, 石を置いたy座標, 現在どの角度の探索を行なっているかを示す変数, 元位置からの距離);
    static int atDir(int x, int y, int dirID, int len) {
	return at(x + dir[dirID][0] * len, y + dir[dirID][1] * len);
    }

    //確かめる方向を指定する配列
    final static int dir[][] = {
	{-1, -1}, {0, -1}, {1, -1},
	{-1,  0},          {1,  0},
	{-1,  1}, {0,  1}, {1,  1}
    };

    
    int data []; //駒の配置情報を保持する多次元配列 0 : 置かれていない, 1 : 黒, -1 : 白
    int turn; //何ターン目か示す変数(全ターン数は60)
    int player; //どちらのターンか示す(1で黒, -1で白)
    int black; //黒の個数
    int white; //白の個数
    boolean isLastPass;

    //最初の状態を作るメソッド
    public GameState() {
	reset();
    }

    protected GameState(Boolean noReset) {
    }	

    //GameStateのクローンを作るメソッド
    public GameState clone() {
	GameState other = new GameState(true);
	other.data = Arrays.copyOf(data, data.length);
	other.turn = turn;
	other.player = player;
	other.black = black;
	other.white = white;
	other.isLastPass = isLastPass;
	return other;
    }

    //駒を置く処理を行うメソッド
    public boolean put(int x, int y) {
	if(data[at(x,y)] != 0) return false;

	if(reverse(x,y,true) == false) {
	    return false;
	}

	data[at(x,y)] = player;
	player *= -1;
	turn++;
	countDisc();

	setChanged();
	notifyObservers();
	isLastPass = false;

	return true;
    }

    //指定された位置が置ける場所か確かめるメソッド
    //引数doReverseがtrueなら駒を反転する処理を行う
    //引数doReverseがfalseなら確かめるだけで駒の反転処理は行わない
    public boolean reverse(int x, int y, boolean doReverse) {
	if(data[at(x,y)] != 0) return false;

	boolean reversed = false;

	for(int i = 0; i < 8; i++) {
	    int nextState = data[atDir(x, y, i, 1)];

	    if(nextState == player) {
		continue;
	    }
	    else if(nextState == 0 || nextState == 2) {
		continue;
	    }

	    int j = 2;
	    while(true) {
		if(data[atDir(x, y, i, j)] == player) {
		    if(doReverse) {
			for(int k = 1; k < j; k++) {
			    data[atDir(x, y, i, k)] *= -1;
			}
		    }
		    
		    reversed = true;
		    break;
		}
		
		if(data[atDir(x, y, i, j)] == 2 || data[atDir(x, y, i, j)] == 0) {
		    break;
		}
		j++;
	    }
	}

	return reversed;
    }

    //指定された位置に駒を置くことが出来るか判定するメソッド
    //判定のみで，駒の反転処理は行わない
    public boolean canReverse(int x, int y) {
	return reverse(x, y, false);
    }

    //パスかどうか判定(返り値trueでパス)するメソッド
    public boolean checkPass() {
	for(int y = 1; y < SIZE; y++) {
	    for(int x = 1; x < SIZE; x++) {
		if(data[at(x, y)] != 0) {
		    continue;
		}

		if(canReverse(x, y) == true) {
		    return false;
		}
	    }
	}

	return true;
    }

    //双方の駒の数をカウントするメソッド
    public void countDisc() {
	black = 0;
	white = 0;
	for(int y = 1; y < SIZE-1; y++) {
	    for(int x = 1; x < SIZE-1; x++) {
		if(data[at(x, y)] == 1){
		    black++;
		} else if(data[at(x, y)] == -1) {
		    white++;
		}
	    }
	}
    }

    //勝者を返すメソッド
    public int Win(){
	countDisc();
	if(black > white) {
	    return 1;
	} else if(black < white) {
	    return -1;
	} else {
	    return 0;
	}
    }

    //初期状態に戻すメソッド
    public void reset() {
	int x = SIZE / 2;
	int y = SIZE / 2;

	data = new int[SIZE * SIZE];
	data[at(x, y)] = 1;
	data[at(x, y-1)] = -1;
	data[at(x-1, y)] = -1;
	data[at(x-1, y-1)] = 1;

	for(int i = 0; i < SIZE - 1; i++) {
	    data[at(0, i)] = WALL;
	    data[at(SIZE -1, i + 1)] = WALL;
	    data[at(i + 1, 0)] = WALL;
	    data[at(i, SIZE - 1)] = WALL;
	}
	turn = 0;
	player = 1;
	black = 2;
	white = 2;
	isLastPass = false;
    }

    //パスの処理を行うメソッド
    public void Pass() {
	player *= -1;
	isLastPass = true;
    }

    //盤面情報，ターン数，プレイヤの情報をセットするメソッド
    public void set(int[] d, int t, int p) {
	data = Arrays.copyOf(d, d.length);

	turn = t;
	player = p;
	countDisc();
    }
    
    //描画を行うメソッド
    public void textDisplay() {
	for(int y = 1; y <= 8; y++) {
	    for(int x = 1; x <= 8; x++) {
		System.out.print("|");
		switch(data[x + y * 10]) {
		case 1:
		    System.out.print("●");
		    break;
		case -1:
		    System.out.print("○");
		    break;
		default:
		    System.out.print(" ");
		}
	    }
	    System.out.println("|");
	}
	System.out.println("TURN = " + turn);
	System.out.println("PLAYER = " + player);
	System.out.println("DISC = " + black + " : " + white);
	System.out.println("");
    }
}
