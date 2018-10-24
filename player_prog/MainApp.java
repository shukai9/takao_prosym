


import javax.swing.*;
import java.util.Scanner;


import java.awt.Container;

public class MainApp {
    public MainApp() {}

    private void mainWithGUI() {
	MainApp2 panel = new MainApp2();
	panel.setVisible(true);
    }

    private void mainWithoutGUI() {
	Scanner scan = new Scanner(System.in);
	System.out.println("Please input roop count");
	int count = scan.nextInt();

	MainPanel panel = new MainPanel(count);
    }


    public static void main(String[] args) {
	System.out.println("Please select use GUI");
	System.out.println("Not need GUI : 1");
	System.out.println("Need GUI : 2");

	Scanner scan = new Scanner(System.in);
	int val = scan.nextInt();

	if(val == 1) {
	    new MainApp().mainWithoutGUI();
	} else if(val == 2) {
	    new MainApp().mainWithGUI();
	} else {
	    System.out.println("Unspecified character was entered");
	}
    }
}
