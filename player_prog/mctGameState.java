//モンテカルロ木探索で用いる状態を表すクラス
import java.util.*;
import java.util.Arrays;

//mctで探索中の状態を保存するクラス
public class mctGameState extends GameState {
  /*
    状態として保持するデータ
    他のデータは継承元のGameStateにある
    zobhash : 現在の盤面のゾブリストハッシュの値
  */
  int zobhash;

  //最初の状態を作るメソッド
  public mctGameState() {
    reset();
  }

  //現状のコピーのmctGameStateを作るメソッド
  public mctGameState clone() {
    mctGameState other = new mctGameState();
    other.data = Arrays.copyOf(data, data.length);
    other.turn = turn;
    other.player = player;
    other.black = black;
    other.white = white;
    other.isLastPass = isLastPass;
    other.zobhash = zobhash;
    return other;
  }

  /*
    石を置く処理を作成
    (x,y)で置く位置を取得，置けるかどうかをboolean型で返す
  */
  public boolean put(int x, int y) {
    //既に石があるところには置けない
    if(data[at(x, y)] != 0) return false;

    //リバースできないところには置けない
    if(!canPut(x, y)) return false;

    //石を置く
    reverse(x, y);
    data[x + y * 10] = player;
    if(player == BLACK) black++;
    else white++;
    zobhash = Zobrist.put(zobhash, at(x, y), player);

    //手を進める
    player *= -1;
    zobhash = Zobrist.color(zobhash);
    turn++;
    isLastPass = false;
    return true;
  }

  //パスの時の処理
  public void pass() {
    player *= -1;
    zobhash = Zobrist.color(zobhash);
    isLastPass = true;
  }

  //その位置に置けるかどうかを判定するメソッド
  public boolean canPut(int x, int y) {
    //for文で配列dirを切り替えることで確かめる方向を変更していく
    if(data[at(x, y)] != 0) return false;
    for(int i = 0; i < 8; i++) {
      //隣のマスが空白，壁，現在のプレイヤーの石の場合，その方向の走査を終了して次の方向へ移る
      int next = data[atDir(x, y, i, 1)];
      if(next == player || next == 0 || next == 2) {
        continue;
      }

      //隣の隣から端まで走査
      for(int len = 2; ; len++) {
        int over = data[atDir(x, y, i, len)];
        if(over == 2 || over == 0) {
          break; //空白または壁に到達したら終了
        }
        if(over == -player) {
          continue; //スキップ
        }

        //自分の色があればよい
        return true;
      }
    }
    return false;
  }

  /*
    石を置く
    x, y : 置く位置
  */
  public void reverse(int x, int y) {
    int reverseCount = 0;

    //for文で配列dirを切り替えることで確かめる方向を変更していく
    for(int i = 0; i < 8; i++) {
      //確かめる方向にある隣のマスを指定
      //隣のマスが空白，壁，現在のプレイヤーの石の場合，その方向の走査を終了し次の方向へ移る
      int next = data[atDir(x, y, i, 1)];
      if(next == player || next == 0 || next == 2) {
        continue;
      }

      //隣の隣から端まで走査
      for(int len = 2; ; len++) {
        int over = data[atDir(x, y, i, len)];
        if(over == 2 || over == 0) {
          break; //空白または壁に到達したら終了
        }
        if(over == -player) {
          continue; //スキップ
        }

        //自分の色があれば間の石を入れ替える
        for(int k = 1; k < len; k++) {
          int betweenPos = atDir(x, y, i, k);
          data[betweenPos] *= -1; //反転
          reverseCount++;
          //ゾブリストのputメソッドで石を変更する
          zobhash = Zobrist.reverse(zobhash, betweenPos, player);
        }
        break;
      }
    }

    //反転した数だけ石の数を調整
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
  public boolean checkPass() {
    //コピーデータの全マス目に対して，リバースできるかチェック
    for(int x = 1; x < SIZE-1; x++) {
      for(int y = 1; y < SIZE-1; y++) {
        if(data[at(x, y)] != 0) continue; //既に石があるまたは壁であればスキップ

        //リバースできる時falseを返す
        if(canPut(x, y)) {
          return false;
        }
      }
    }
    //置ける場所がなければtrueを返す
    return true;
  }

  //初期状態に戻すメソッド
  public void reset() {
    //初期値を作成
    //dataは1列の配列内に保存
    //位置は[x+y*10]として入れる
    data = new int[SIZE * SIZE];
    black = 0;
    white = 0;
    //壁を作成
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

    //現状態でのゾブリストハッシュの値を作る
    zobhash = Zobrist.makeZob(data, player);
  }

  //これまで打たれた駒の枚数を返す変数
  public int putNumber() {
    return black + white - 4;
  }

}
