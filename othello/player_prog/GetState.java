import java.util.*;
import java.util.Scanner;

public class GetState {
  static CPU b_cpu;
  static CPU w_cpu;
  static int turn;

  public GetState(int gamecount) throws Exception {
    Random rnd = new Random();
      int seed = rnd.nextInt();
      int bnum = rnd.nextInt(9) + 1;
      int wnum = rnd.nextInt(9) + 1;
      turn = rnd.nextInt(30) + 1 + 10; //10〜40
      String bname = "";
      String wname = "";
      switch (bnum) {
        case 1 :
          bname = "random";
          b_cpu = PlayerSelector.getPlayer(1, bname + 100); break;
        case 2 :
          bname = "hyouka-0-100";
          b_cpu = PlayerSelector.getPlayer(1, bname); break;
        case 3 :
          bname = "MC-";
          b_cpu = PlayerSelector.getPlayer(1, bname + 100); break;
        case 4 :
          bname = "MCT";
          b_cpu = PlayerSelector.getPlayer(1, bname); break;
        case 5 :
          bname = "EPT_MCT1730";
          b_cpu = PlayerSelector.getPlayer(1, bname); break;
        case 6 :
          bname = "EPT_MCT8500";
          b_cpu = PlayerSelector.getPlayer(1, bname); break;
        case 7 :
          bname = "AlphaBeta1";
          b_cpu = PlayerSelector.getPlayer(1, bname); break;
        case 8 :
          bname = "AlphaBeta2";
          b_cpu = PlayerSelector.getPlayer(1, bname); break;
        case 9 :
          bname = "AlphaBeta4";
          b_cpu = PlayerSelector.getPlayer(1, bname); break;
      }
      switch (wnum) {
        case 1 :
          wname = "random";
          w_cpu = PlayerSelector.getPlayer(-1, wname + 100); break;
        case 2 :
          wname = "hyouka-0-100";
          w_cpu = PlayerSelector.getPlayer(-1, wname); break;
        case 3 :
          wname = "MC-";
          w_cpu = PlayerSelector.getPlayer(-1, wname + 100); break;
        case 4 :
          wname = "MCT";
          w_cpu = PlayerSelector.getPlayer(-1, wname); break;
        case 5 :
          wname = "EPT_MCT1730";
          w_cpu = PlayerSelector.getPlayer(-1, wname); break;
        case 6 :
          wname = "EPT_MCT8500";
          w_cpu = PlayerSelector.getPlayer(-1, wname); break;
        case 7 :
          wname = "AlphaBeta1";
          w_cpu = PlayerSelector.getPlayer(-1, wname); break;
        case 8 :
          wname = "AlphaBeta2";
          w_cpu = PlayerSelector.getPlayer(-1, wname); break;
        case 9 :
          wname = "AlphaBeta4";
          w_cpu = PlayerSelector.getPlayer(-1, wname); break;
    }
    System.out.println("//PLAYDATA " + bname + ", " + wname + ", " + turn);
  }
}
