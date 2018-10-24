


import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import java.util.Scanner;


public class MainPanel2 extends JPanel implements MouseListener, Observer {

    //マス1ごとの大きさ
    static final int SIZE = 50;

    //置けるマス目の数(縦横同じ，偶数)
    static final int Squares = 8;

    //マス目全体の横の大きさ
    static final int W = SIZE * Squares;
    //マス目全体の縦の大きさ
    static final int H = SIZE * Squares;

    //状態を表すクラス
    GameState state = new GameState();

    //CPU class(blackはプレイヤー)
    //white
    CPU w_cpu = new CPU(-1);


    public MainPanel2() {
	Scanner scan = new Scanner(System.in);
	//白のCPU
	System.out.println("Please select White Player");
	System.out.println("RandomCPU : 1");
	System.out.println("hyoukaCPU : 2");
	System.out.println("Monte Carlo : 3");
	System.out.println("Monte Carlo Tree : 4");
	System.out.println("Monte Carlo Tree + Cost function : 5");

	int val = scan.nextInt();
	if(val == 1) w_cpu = new RandomCPU(-1);
	else if(val == 2) w_cpu = new hyoukaCPU(-1);
	else if(val == 3) w_cpu = new mcCPU(-1);
	else if(val == 4) w_cpu = new mctCPU(-1);
	else if(val == 5) w_cpu = new hmctCPU(-1);
	else {
	    System.out.println("Unspecified character was entered");
	    return;
	}

	//パネルのサイズを設定
	setPreferredSize(new Dimension(W, H));

	//マウスイベントの処理を追加
	addMouseListener(this);

	//監視されるオブジェクトを指定
	state.addObserver(this);
    }
    
    //描画を行うメソッド
    public void paintComponent(Graphics g) {

	//背景
	g.setColor(Color.LIGHT_GRAY);

	//塗りつぶし
	g.fillRect(0, 0, W, H);

	//線
	g.setColor(Color.BLACK);

	//マス目を示す線を描画
	for(int i = 0; i < Squares; i++) {
	    g.drawLine(0, i * SIZE, W, i * SIZE);
	    g.drawLine(i * SIZE, 0, i * SIZE, H);
	}

	//駒
	for(int y = 1; y < Squares + 2; y++) {
	    for(int x = 1; x < Squares + 2; x++) {
		if(state.data[x + y * 10] == 1) {
		    //黒の駒を表示
		    g.setColor(Color.BLACK);
		    //円を塗りつぶし
		    g.fillOval((x-1)*SIZE, (y-1)*SIZE, SIZE, SIZE);
		} else if(state.data[x + y * 10] == -1) {
		    //白の駒を表示
		    g.setColor(Color.WHITE);
		    //円を塗りつぶし
		    g.fillOval((x-1)*SIZE, (y-1)*SIZE, SIZE, SIZE);
		}
	    }
	}

	//データ表示
	g.setColor(Color.RED);
	g.drawString("TURN = " + state.turn, 10, 30);
	g.drawString("PLAYER = " + state.player, 10, 50);
	g.drawString("DISC = " + state.black + " : " + state.white, 10, 70);
    }

    //Observerの更新を通知するクラス
    public void update(Observable o, Object arg) {
	repaint();
    }

    //コンポーネント上でマウスボタンが押されたときに呼ばれるクラス
    public void mousePressed(MouseEvent e) {
	//パスチェック
	if(state.checkPass() == true) {
	    state.player *= -1;
	    if(state.checkPass() == true) {
		int End = state.Win();
		String Winner;
		if(End == 1) {
		    Winner = "black";
		} else if(End == -1) {
		    Winner = "white";
		} else {
		    Winner = "Draw";
		}

		JOptionPane.showMessageDialog(this, "End!" + Winner + "Win !");
		return;
	    }
	    JOptionPane.showMessageDialog(this, "Pass! Next turn is " + state.turn);
	}

	//イベントが発生した時のx座標を取得
	int x = e.getX();
	//イベントが発生した時のY座標を取得
	int y = e.getY();

	//置いた位置を検知して通知
	x /= SIZE;
	x++;
	y /= SIZE;
	y++;
	//標準出力
	System.out.println("(x,y)=(" + x + "," + y + ")");
	//駒を置けない場所だった場合
	if(state.put(x,y) == false) {
	    JOptionPane.showMessageDialog(this, "Can't put this area!");
	    repaint();
	}

	if(state.checkPass() == true) {
	    state.player *= -1;

	    if(state.checkPass() == true) {
		JOptionPane.showMessageDialog(this, "End!");
	    }
	    JOptionPane.showMessageDialog(this, "Pass! Next turn is " + state.player);
	}

	if(state.player == -1) {
	    //cpu内のdecideメソッドで置く場所を決定
	    int w_action[] = w_cpu.decide(state);

	    //置ける場所がある場合のみ駒を置く
	    if(w_action[0] != -1) state.put(w_action[0], w_action[1]);
	}
    }

    public void mouseClicked(MouseEvent e){

    }
    
    public void mouseReleased(MouseEvent e){

    }

    public void mouseEntered(MouseEvent e){

    }

    public void mouseExited(MouseEvent e){

    }
}
