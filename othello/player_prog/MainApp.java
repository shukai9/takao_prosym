import java.util.Scanner;

public class MainApp {
  public MainApp() {}

  private static void normalGame(int gamecount, int boardnum ,CPU b_cpu, CPU w_cpu, String bcpu, String wcpu) {
    GameController panel = new GameController(gamecount, boardnum ,b_cpu, w_cpu, bcpu, wcpu);
  }

  private static void middleBoardGame(int gamecount) throws Exception{
    for (int i = 1; i <= gamecount; i++) {
      System.out.println();
      System.out.println("//------");
      System.out.println("//gamecount : " + i);
      // System.out.println("//b_cpu : " + gstate.b_cpu);
      // System.out.println("//w_cpu : " + gstate.w_cpu);
      // System.out.println("//turn : " + gstate.turn);
      GetState gstate = new GetState(gamecount);
      System.out.println("//------");
      GameController3 panel = new GameController3(i, gstate.b_cpu, gstate.w_cpu, gstate.turn);
    }
  }

  static void usage() {
    System.err.println("java MainApp gamestyle gamecount b_player w_player");
    System.err.println("  gamestyle: 1 for normal games and 2 for making middle boards");
    System.err.println("  b_player, w_player: see PlayerSelector.java");
  }

  public static void main(String[] args) throws Exception {
    if (args[0]=="1" && args.length != 5) {
      usage();
      System.exit(1);
    }

    int gamestyle = Integer.parseInt(args[0]);
    int gamecount = Integer.parseInt(args[1]);
    int boardnum =  Integer.parseInt(args[2]);
    CPU b_cpu = PlayerSelector.getPlayer(1, args[3]);
    CPU w_cpu = PlayerSelector.getPlayer(-1, args[4]);
    if(gamestyle == 1) {
      normalGame(gamecount, boardnum ,b_cpu, w_cpu, args[3], args[4]);
    } else if (gamestyle == 2) {
      middleBoardGame(gamecount);
    } else {
      System.out.println("Wrong gamestyle: " + gamestyle);
    }
  }
}
