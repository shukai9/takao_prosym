//モンテカルロ木探索で用いる
//ゲーム情報を管理するクラス

import java.util.*;
import java.util.Arrays;

//mctで探索中の状態を保存するクラス
public class MCTGameState extends GameState {
    /*
      状態として保持するデータ
      他のデータは継承元のGameStateにある
      zobhash : 現在の盤面のゾブリストハッシュの値
      isLastPass : 前の手番でパスを行なったかどうかの値 (これがtrueのときにパスするとゲーム終了)
    */
    int zobhash;
    boolean isLastPass;

    //最初の状態を作るメソッド
    public MCTGameState() {
	reset();
    }

    private MCTGameState(boolean noReset) {
	super(noReset);
    }

    public static MCTGameState copyFrom(GameState state) {
	MCTGameState mctState = new MCTGameState(true); // no reset
	mctState.set(state.data, state.turn, state.player);
	mctState.isLastPass = false;
	return mctState;
    }
	
    //現状のコピーのMCTGameStateを作るメソッド
    public MCTGameState clone() {
	MCTGameState other = new MCTGameState(true);
	other.data = Arrays.copyOf(data, data.length);
	other.turn = turn;
	other.player = player;
	other.black = black;
	other.white = white;
	other.zobhash = zobhash;
	other.isLastPass = isLastPass;
	return other;
    }


    //駒を置く処理を行うメソッド
    //x,yで置く位置を取得，置けるかどうかをboolean型で返す
    public boolean put(int x, int y) {
	if(data[at(x, y)] != 0) return false;
	if(!canPut(x, y)) return false;

	reverse(x, y);
	data[x + y * 10] = player;
	if(player == BLACK) black++;
	else white++;
	zobhash = Zobrist.put(zobhash, at(x, y), player);

	player *= -1;
	zobhash = Zobrist.color(zobhash);
	turn++;
	isLastPass = false;
	return true;
    }

    //パスの時の処理を行うメソッド
    public void pass() {
	player *= -1;
	zobhash = Zobrist.color(zobhash);
	isLastPass = true;
    }

    //その位置に置けるかどうかを判定するメソッド
    public boolean canPut(int x, int y) {
	if(data[at(x, y)] != 0) return false;
	for(int i = 0; i < 8; i++) {
	    int next = data[atDir(x, y, i, 1)];
	    if(next == player || next == 0 || next == 2) {
		continue;
	    }

	    for(int len = 2; ; len++) {
		int over = data[atDir(x, y, i, len)];
		if(over == 2 || over == 0) {
		    break; //空白または壁に到達したら終了
		}
		if(over == -player) {
		    continue; //スキップ
		}

		return true;
	    }
	}
	return false;
    }

    //駒を反転するメソッド
    public void reverse(int x, int y) {
	int reverseCount = 0;

	for(int i = 0; i < 8; i++) {	 
	    int next = data[atDir(x, y, i, 1)];
	    if(next == player || next == 0 || next == 2) {
		continue;
	    }

	    for(int len = 2; ; len++) {
		int over = data[atDir(x, y, i, len)];
		if(over == 2 || over == 0) {
		    break; //空白または壁に到達したら終了
		}
		if(over == -player) {
		    continue; //スキップ
		}

		for(int k = 1; k < len; k++) {
		    int betweenPos = atDir(x, y, i, k);
		    data[betweenPos] *= -1; //反転
		    reverseCount++;
		    zobhash = Zobrist.reverse(zobhash, betweenPos, player);
		}
		break;
	    }
	}

	if(player == BLACK) {
	    black += reverseCount;
	    white -= reverseCount;
	} else {
	    black -= reverseCount;
	    white += reverseCount;
	}
    }

    //データをセットする
    //ゾブリストハッシュが追加されているので
    public void set(int[] d, int t, int p) {
	data = Arrays.copyOf(d, d.length);

	turn = t;
	player = p;
	countDisc();
	zobhash = Zobrist.makeZob(data, player);
    }

    //パスかどうかを判定するメソッド
    //置く場所がなければtrueを返す
    public boolean checkPass() {
	for(int x = 1; x < SIZE-1; x++) {
	    for(int y = 1; y < SIZE-1; y++) {
		if(data[at(x, y)] != 0) continue;

		if(canPut(x, y)) {
		    return false;
		}
	    }
	}
	return true;
    }

    //初期状態に戻すメソッド
    public void reset() {
	data = new int[SIZE * SIZE];
	black = 0;
	white = 0;

	for(int i = 0; i < SIZE; i++) {
	    data[at(0, i)] = WALL;
	    data[at(SIZE-1, i)] = WALL;
	    data[at(i, 0)] = WALL;
	    data[at(i, SIZE-1)] = WALL;
	}
	data[at(SIZE/2, SIZE/2)] = BLACK;
	black++;
	data[at(SIZE/2, SIZE/2-1)] = WHITE;
	white++;
	data[at(SIZE/2-1, SIZE/2)] = WHITE;
	white++;
	data[at(SIZE/2-1, SIZE/2-1)] = BLACK;
	black++;

	turn = 0;
	player = BLACK;
	isLastPass = false;

	zobhash = Zobrist.makeZob(data, player);
    }

    //これまで打たれた駒の枚数を返す変数
    public int putNumber() {
	return black + white - 4;
    }
}
