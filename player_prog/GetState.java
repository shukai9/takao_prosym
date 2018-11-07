import java.util.*;
import java.util.Scanner;

public class GetState {
  static CPU b_cpu;
  static CPU w_cpu;
  static int turn;

  public GetState(int gamecount) throws Exception {
    Random rnd = new Random();
      int seed = rnd.nextInt();
      int bnum = rnd.nextInt(11) + 1;
      int wnum = rnd.nextInt(11) + 1;
      turn = rnd.nextInt(59) + 1;
      switch (bnum) {
        case 1 : b_cpu = PlayerSelector.getPlayer(1, "random" + seed); break;
        case 2 : b_cpu = PlayerSelector.getPlayer(1, "hyouka-" + 0 + "-" + seed); break;
        case 3 : b_cpu = PlayerSelector.getPlayer(1, "hyouka-" + 1 + "-" + seed); break;
        case 4 : b_cpu = PlayerSelector.getPlayer(1, "MC-" + seed); break;
        case 5 : b_cpu = PlayerSelector.getPlayer(1, "MCT"); break;
        case 6 : b_cpu = PlayerSelector.getPlayer(1, "MCT2"); break;
        case 7 : b_cpu = PlayerSelector.getPlayer(1, "MCT+CF"); break;
        case 8 : b_cpu = PlayerSelector.getPlayer(1, "MCT+CF2"); break;
        case 9 : b_cpu = PlayerSelector.getPlayer(1, "AlphaBeta1"); break;
        case 10 : b_cpu = PlayerSelector.getPlayer(1, "AlphaBeta2"); break;
        case 11 : b_cpu = PlayerSelector.getPlayer(1, "AlphaBeta3"); break;
      }
      switch (wnum) {
        case 1 : w_cpu = PlayerSelector.getPlayer(-1, "random" + seed); break;
        case 2 : w_cpu = PlayerSelector.getPlayer(-1, "hyouka-" + 0 + "-" + seed); break;
        case 3 : w_cpu = PlayerSelector.getPlayer(-1, "hyouka-" + 1 + "-" + seed); break;
        case 4 : w_cpu = PlayerSelector.getPlayer(-1, "MC-" + seed); break;
        case 5 : w_cpu = PlayerSelector.getPlayer(-1, "MCT"); break;
        case 6 : w_cpu = PlayerSelector.getPlayer(-1, "MCT2"); break;
        case 7 : w_cpu = PlayerSelector.getPlayer(-1, "MCT+CF"); break;
        case 8 : w_cpu = PlayerSelector.getPlayer(-1, "MCT+CF2"); break;
        case 9 : w_cpu = PlayerSelector.getPlayer(-1, "AlphaBeta1"); break;
        case 10 : w_cpu = PlayerSelector.getPlayer(-1, "AlphaBeta2"); break;
        case 11 : w_cpu = PlayerSelector.getPlayer(-1, "AlphaBeta3"); break;
    }
  }
}
