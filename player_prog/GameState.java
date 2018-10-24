import java.util.*;
import java.util.Arrays;

public class GameState extends Observable {
    final static int SIZE = 10;
    final static int BLACK = 1;
    final static int WHITE = -1;
    final static int WALL = 2;

    // (e, 5) == (x, y), (a, 1) == (x-4, y-4), (h, 8) == (x + 3, y + 3)
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


    int data []; //現在の駒が置かれている場所を保持する多次元配列 0 : 置かれていない, 1 : 黒, -1 : 白
    int turn; //何ターン目か示す変数(全ターン数は60)
    int player; //どちらのターンか示す(1で黒, -1で白)
    int black; //黒の個数
    int white; //白の個数
    boolean isLastPass;

    //最初の状態を作るメソッド
    public GameState() {
	reset(0);
    }

    public GameState clone() {
	GameState other = new GameState();
	other.data = Arrays.copyOf(data, data.length);
	other.turn = turn;
	other.player = player;
	other.black = black;
	other.white = white;
	other.isLastPass = isLastPass;
	return other;
    }

    //駒を置く処理
    public boolean put(int x, int y) {
	//既に駒があれば置けない
	if(data[at(x,y)] != 0) return false;

	//リバースできない場所には置けない
	//reverseメソッドを利用して判定
	if(reverse(x,y,true) == false) {
	    return false;
	}

	//駒を置く
	data[at(x,y)] = player;
	player *= -1;
	turn++;
	countDisc();

	setChanged();
	notifyObservers();
	isLastPass = false;

	return true;
    }

    //置けるかどうか確かめる
    public boolean reverse(int x, int y, boolean doReverse) {
	//既に駒があれば置けない
	if(data[at(x,y)] != 0) return false;

	//置けるか確かめた結果を格納する変数
	boolean reversed = false;

	//for文で場所を変えていく
	for(int i = 0; i < 8; i++) {
	    //隣のマスの値を取得
	    int nextState = data[atDir(x, y, i, 1)];

	    //隣マスの駒がプレイヤー駒の場合，走査を終了し次の方向へ移る
	    if(nextState == player) {
		continue;
	    }
	    //隣マスが空きor壁の場合，走査を終了し次の方向へ移る
	    else if(nextState == 0 || nextState == 2) {
		continue;
	    }

	    //隣の隣から端まで操作して，自分の色があればリバースする
	    //確かめる駒と駒を置く位置との距離を入れる変数
	    int j = 2;
	    while(true) {
		//自分の駒がある場合
		if(data[atDir(x, y, i, j)] == player) {
		    //変数が正(置き換える処理)の場合，置き換える
		    if(doReverse) {
			for(int k = 1; k < j; k++) {
			    data[atDir(x, y, i, k)] *= -1;
			}
		    }

		    //置けるマスがあったと判断
		    reversed = true;
		    break;
		}

		//空白または壁に到達すれば終了
		if(data[atDir(x, y, i, j)] == 2 || data[atDir(x, y, i, j)] == 0) {
		    break;
		}
		j++;
	    }
	}

	return reversed;
    }

    //その位置に置けるか判定する(reserveメソッドで判定．置き換え処理はしない?)
    public boolean canReverse(int x, int y) {
	return reverse(x, y, false);
    }

    //パスかどうか判定(返り値trueでパス)
    public boolean checkPass() {
	//コピーデータの全マス目に対しリバースのチェック
	for(int y = 1; y < SIZE; y++) {
	    for(int x = 1; x < SIZE; x++) {
		//駒がある場所はチェックせずスキップ
		if(data[at(x, y)] != 0) {
		    continue;
		}

		//リバースできる(orした)とき，元に戻してfalse(パスしない)を返す
		//canReverseメソッドで確かめる
		if(canReverse(x, y) == true) {
		    return false;
		}
	    }
	}

	//置ける場所がないのでtrue(パスする)を返す
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
    public void reset(int num) {
	int x = SIZE / 2;
	int y = SIZE / 2;
	//初期値を作成(中央4マスに交互にある状態)
	data = new int[SIZE * SIZE];

  //(盤面1)

	if(num == 1){
	    data [at(x - 2, y - 3)] = 1;
	    data[at(x - 2, y - 1)] = -1;
	    data[at(x - 2, y)] = 1;
	    data[at(x - 1, y - 2)] = 1;
	    data[at(x - 1, y - 1)] = -1;
	    data[at(x - 1, y)] = -1;
	    data[at(x, y - 2)] = 1;
	    data[at(x, y - 1)] = 1;
	    data[at(x, y)] = 1;
	    data[at(x, y + 1)] = -1;
	    data[at(x + 1, y - 2)] = -1;
	    data[at(x + 1, y - 1)] = -1;
	    data[at(x + 1, y)] = -1;
	    data[at(x + 2, y - 1)] = -1;
	}

	//(盤面2)
	else if(num == 2){

	    data [at(x - 2, y - 3)] = 1;
	    data[at(x - 2, y - 1)] = -1;
	    data[at(x - 2, y)] = 1;
	    data[at(x - 1, y - 2)] = 1;
	    data[at(x - 1, y - 1)] = -1;
	    data[at(x - 1, y)] = -1;
	    data[at(x, y - 2)] = 1;
	    data[at(x, y - 1)] = 1;
	    data[at(x, y)] = -1;
	    data[at(x, y + 1)] = -1;
	    data[at(x + 1, y - 2)] = 1;
	    data[at(x + 1, y - 1)] = 1;
	    data[at(x + 1, y)] = -1;
	    data[at(x + 1,y + 1)] = -1;
	    data[at(x + 2, y - 2)] = 1;
	    data[at(x + 2, y - 1)] = -1;
	}

	//盤面3
	else if(num == 3){
	    data [at(x - 2, y - 3)] = 1;
	    data[at(x - 2, y - 1)] = -1;
	    data[at(x - 2, y)] = 1;
	    data[at(x - 2, y + 1)] = 1;
	    data[at(x - 1, y - 2)] = 1;
	    data[at(x - 1, y - 1)] = -1;
	    data[at(x - 1, y)] = -1;
	    data[at(x - 1, y + 1)] = -1;
	    data[at(x, y - 2)] = 1;
	    data[at(x, y - 1)] = 1;
	    data[at(x, y)] = -1;
	    data[at(x, y + 1)] = -1;
	    data[at(x + 1, y - 2)] = 1;
	    data[at(x + 1, y - 1)] = 1;
	    data[at(x + 1, y)] = -1;
	    data[at(x + 1,y + 1)] = -1;
	    data[at(x + 2, y - 2)] = 1;
	    data[at(x + 2, y - 1)] = -1;
	}
	    //盤面４
	else if(num == 4){

	    data[at(x - 3, y  + 2)] = -1;
	    data[at(x - 2, y - 3)] = 1;
	    data[at(x - 2, y - 2)] = 1;
	    data[at(x - 2, y - 1)] = 1;
	    data[at(x - 2, y)] = 1;
	    data[at(x - 2, y + 1)] = -1;
	    data[at(x - 1, y - 2)] = 1;
	    data[at(x - 1, y - 1)] = -1;
	    data[at(x - 1, y)] = -1;
	    data[at(x - 1, y + 1)] = -1;
	    data[at(x, y - 2)] = 1;
	    data[at(x, y - 1)] = 1;
	    data[at(x, y)] = -1;
	    data[at(x, y + 1)] = -1;
	    data[at(x + 1, y - 2)] = 1;
	    data[at(x + 1, y - 1)] = 1;
	    data[at(x + 1, y)] = -1;
	    data[at(x + 1,y + 1)] = -1;
	    data[at(x + 2, y - 2)] = 1;
	    data[at(x + 2, y - 1)] = -1;

	}

	//(盤面5)
	else if(num == 5){

	    data[at(x - 3, y + 1)] = -1;
	    data[at(x - 2, y - 3)] = 1;
	    data[at(x - 2, y - 2)] = 1;
	    data[at(x - 2, y - 1)] = 1;
	    data[at(x - 2, y)] = 1;
	    data[at(x - 2, y + 1)] = -1;
	    data[at(x - 1, y - 2)] = 1;
	    data[at(x - 1, y - 1)] = 1;
	    data[at(x - 1, y)] = -1;
	    data[at(x - 1, y + 1)] = -1;
	    data[at(x, y - 1)] = 1;
	    data[at(x, y)] = -1;
	    data[at(x, y + 1)] = -1;
	    data[at(x + 1, y - 2)] = 1;
	}

	//盤面6
	else if(num == 6){

	    data[at(x - 3, y + 1)] = -1;
	    data[at(x - 2, y - 3)] = 1;
	    data[at(x - 2, y - 2)] = 1;
	    data[at(x - 2, y - 1)] = 1;
	    data[at(x - 2, y)] = 1;
	    data[at(x - 2, y + 1)] = -1;
	    data[at(x - 1, y - 2)] = 1;
	    data[at(x - 1, y - 1)] = 1;
	    data[at(x - 1, y)] = -1;
	    data[at(x - 1, y + 1)] = 1;
	    data[at(x, y - 1)] = 1;
	    data[at(x, y)] = 1;
	    data[at(x, y + 1)] = -1;
	    data[at(x, y + 2)] = 1;
	    data[at(x + 1, y - 2)] = 1;
	    data[at(x + 1, y + 2)] = -1;
	}


	//盤面7

	else if(num == 7){
	    data[at(x - 3, y - 2)] = -1;
	    data[at(x - 3, y + 1)] = -1;
	    data[at(x - 2, y - 3)] = 1;
	    data[at(x - 2, y - 2)] = 1;
	    data[at(x - 2, y - 1)] = -1;
	    data[at(x - 2, y)] = 1;
	    data[at(x - 2, y + 1)] = -1;
	    data[at(x - 1, y - 2)] = 1;
	    data[at(x - 1, y - 1)] = 1;
	    data[at(x - 1, y)] = -1;
	    data[at(x - 1, y + 1)] = 1;
	    data[at(x, y - 1)] = 1;
	    data[at(x, y)] = 1;
	    data[at(x, y + 1)] = 1;
	    data[at(x, y + 2)] = 1;
	    data[at(x + 1, y - 2)] = 1;
	    data[at (x + 1, y + 1)] = 1;
	    data[at(x + 1, y + 2)] = -1;
	}


	//盤面8
	else if(num == 8){
	    data[at(x - 4, y + 2)] = 1;
	    data[at(x - 3, y - 2)] = -1;
	    data[at(x - 3, y + 1)] = 1;
	    data[at(x - 2, y - 3)] = 1;
	    data[at(x - 2, y - 2)] = 1;
	    data[at(x - 2, y - 1)] = -1;
	    data[at(x - 2, y)] = 1;
	    data[at(x - 2, y + 1)] = -1;
	    data[at(x - 1, y - 2)] = 1;
	    data[at(x - 1, y - 1)] = -1;
	    data[at(x - 1, y)] = -1;
	    data[at(x - 1, y + 1)] = 1;
	    data[at(x, y - 1)] = -1;
	    data[at(x, y)] = 1;
	    data[at(x, y + 1)] = 1;
	    data[at(x, y + 2)] = 1;
	    data[at(x + 1, y - 2)] = 1;
	    data[at(x + 1, y - 1)] = -1;
	    data[at (x + 1, y + 1)] = 1;
	    data[at(x + 1, y + 2)] = -1;
	}


	//盤面9

	else if(num == 9){
	    data[at(x - 3, y - 2)] = -1;
	    data[at(x - 3, y - 1)] = 1;
	    data[at(x - 2, y - 3)] = 1;
	    data[at(x - 2, y - 1)] = -1;
	    data[at(x - 2, y)] = -1;
	    data[at(x - 2, y + 1)] = -1;
	    data[at(x - 1, y - 2)] = 1;
	    data[at(x - 1, y - 1)] = -1;
	    data[at(x - 1, y)] = -1;
	    data[at(x, y - 2)] = -1;
	    data[at(x, y - 1)] = 1;
	    data[at(x, y)] = 1;
	    data[at(x + 1, y - 3)] = -1;
	    data[at(x + 1, y - 1)] = 1;
	}

	//盤面10
	else if(num == 10){

	    data[at(x - 3, y - 2)] = -1;
	    data[at(x - 3, y - 1)] = 1;
	    data[at(x - 2, y - 3)] = -1;
	    data[at(x - 2, y - 1)] = -1;
	    data[at(x - 2, y)] = -1;
	    data[at(x - 2, y + 1)] = -1;
	    data[at(x - 1, y - 4)] = -1;
	    data[at(x - 1, y - 2)] = 1;
	    data[at(x - 1, y - 1)] = -1;
	    data[at(x - 1, y)] = -1;
	    data[at(x, y - 2)] = 1;
	    data[at(x, y - 1)] = 1;
	    data[at(x, y)] = 1;
	    data[at(x + 1, y - 3)] = -1;
	    data[at(x + 1, y - 2)] = 1;
	    data[at(x + 1, y - 1)] = 1;
	    }


	//盤面11

	else if(num == 11){
	    data[at(x - 3, y - 2)] = -1;
	    data[at(x - 3, y - 1)] = -1;
	    data[at(x - 3, y )] = -1;
	    data[at(x - 2, y - 3)] = -1;
	    data[at(x - 2, y - 1)] = -1;
	    data[at(x - 2, y)] = -1;
	    data[at(x - 2, y + 1)] = -1;
	    data[at(x - 1, y - 4)] = -1;
	    data[at(x - 1, y - 2)] = 1;
	    data[at(x - 1, y - 1)] = -1;
	    data[at(x - 1, y)] = -1;
	    data[at(x, y - 2)] = 1;
	    data[at(x, y - 1)] = 1;
	    data[at(x, y)] = 1;
	    data[at(x + 1, y - 4)] = 1;
	    data[at(x + 1, y - 3)] = 1;
	    data[at(x + 1, y - 2)] = 1;
	    data[at(x + 1, y - 1)] = 1;
	}

	//盤面12
	else if(num == 12){
	    data[at(x - 3, y - 2)] = -1;
	    data[at(x - 3, y - 1)] = -1;
	    data[at(x - 3, y )] = -1;
	    data[at(x - 3, y + 1)] = 1;
	    data[at(x - 2, y - 3)] = -1;
	    data[at(x - 2, y - 1)] = -1;
	    data[at(x - 2, y)] = 1;
	    data[at(x - 2, y + 1)] = -1;
	    data[at(x - 1, y - 4)] = -1;
	    data[at(x - 1, y - 3)] = -1;
	    data[at(x - 1, y - 2)] = -1;
	    data[at(x - 1, y - 1)] = -1;
	    data[at(x - 1, y)] = -1;
	    data[at(x, y - 2)] = 1;
	    data[at(x, y - 1)] = 1;
	    data[at(x, y)] = 1;
	    data[at(x + 1, y - 4)] = 1;
	    data[at(x + 1, y - 3)] = 1;
	    data[at(x + 1, y - 2)] = 1;
	    data[at(x + 1, y - 1)] = 1;
	}


	//(初期盤面)
	else{
	   data[at(x, y)] = 1;
	   data[at(x, y-1)] = -1;
	   data[at(x-1, y)] = -1;
	   data[at(x-1, y-1)] = 1;
      }

	//壁を作成
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

    public void Pass() {
	player *= -1;
	isLastPass = true;
    }

    public void set(int[] d, int t, int p) {
	data = Arrays.copyOf(d, d.length);

	turn = t;
	player = p;
	countDisc();
    }

    //描画を行うメソッド
    public void textDisplay() {
	//左上から順にマスと駒を表示
	for(int y = 1; y <= 8; y++) {
	    for(int x = 1; x <= 8; x++) {
		System.out.print("|");
		switch(data[x + y * 10]) {
		case 1:
		    System.out.println("●");
		    break;
		case -1:
		    System.out.println("○");
		    break;
		default:
		    System.out.println(" ");
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
