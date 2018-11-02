import java.util.Random;

public class Get_random {
  public static void main(String args[]) {

    Random rnd = new Random();

    int b_cpu = rnd.nextInt(11) + 1;
    int w_cpu = rnd.nextInt(11) + 1;
    int turn = rnd.nextInt(59) + 1;
    System.out.println("b_cpu : " + b_cpu);
    System.out.println("w_cpu : " + w_cpu);
    System.out.println("turn : " + turn);
  }
}
