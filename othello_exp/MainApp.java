import java.util.Scanner;

public class MainApp {
    public MainApp() {}

    public static void main(String[] args) throws Exception {
      for (String s : args) System.out.println("args: " + s);

      Params.parse(args);
      MainPanel panel = new MainPanel();
    }
}
