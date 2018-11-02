


import javax.swing.*;
import java.util.Scanner;


import java.awt.Container;

public class MainApp {
    public MainApp() {}

  /*  private void mainWithGUI() {
	MainApp2 panel = new MainApp2();
	panel.setVisible(true);
} */
  private void NormalGame() {
	   Scanner scan = new Scanner(System.in);
	   System.out.println("Please input roop count");
	   int count = scan.nextInt();

	   MainPanel panel = new MainPanel(count);
    }

  private void MiddleBoard(int gamecount) {
	   MainPanel3 panel = new MainPanel3(gamecount);
    }


    public static void main(String[] args) {
  System.out.println("Normal Game : 1");
	System.out.println("Make the middle board : 2");

	Scanner scan = new Scanner(System.in);
	int val = scan.nextInt();

	if(val == 1) {
	    new MainApp().NormalGame();
	} else if(val == 2) {
    System.out.println("Please input game count :");
    val = scan.nextInt();
    GetState gstate = new GetState(val);
    for (int i = 0; i < GetState.bnum; i++){
      System.out.println();
      System.out.println("------");
      System.out.println("gamecount : " + i);
      System.out.println("b_cpu : " + GetState.b_cpu[i]);
      System.out.println("w_cpu : " + GetState.w_cpu[i]);
      System.out.println("turn : " + GetState.turn[i]);
      System.out.println("------");
	    new MainApp().MiddleBoard(i);
    }
	} else {
	    System.out.println("Unspecified character was entered");
	}
    }
}
