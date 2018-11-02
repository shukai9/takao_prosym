import java.util.*;
import java.util.Scanner;

public class GetState {
  static int bnum; //盤面を生成する数
  static int b_cpu[];
  static int w_cpu[];
  static int turn[];

  public GetState(int gamecount){
    bnum = gamecount;
    b_cpu = new int[bnum];
    w_cpu = new int[bnum];
    turn = new int[bnum];
    Random rnd = new Random();
    for (int i = 0; i < bnum; i++){
      b_cpu[i] = rnd.nextInt(11) + 1;
      w_cpu[i] = rnd.nextInt(11) + 1;
      turn[i] = rnd.nextInt(59) + 1;
      // System.out.println("b_cpu : " + b_cpu);
      // System.out.println("w_cpu : " + w_cpu);
      // System.out.println("turn : " + turn);
    }
  }
}
