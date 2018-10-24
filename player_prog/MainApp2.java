


import javax.swing.*;
import java.awt.Container;


public class MainApp2 extends JFrame {

    public MainApp2() {
	//フレームのタイトル
	setTitle("Othello");
	
	//×で処理を終了
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	//パネルを作成
	MainPanel2 panel = new MainPanel2();
	
	Container contentPane = getContentPane();

	contentPane.add(panel);
	
	pack();
    }
}
