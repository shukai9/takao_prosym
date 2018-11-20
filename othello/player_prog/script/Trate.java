import java.util.Scanner;
import java.io.*;
import java.util.*;

public class Trate {
	// final static int RANDOMSEED = 10;
	final static double K = 16;
	static Random rand;

	static class PlayerInfo {
		int id;
		String name;
		double rate;

		PlayerInfo(int id, String name) {
			this.id = id;
			this.name = name;
			this.rate = 1500;
		}

		public String toString() {
			return String.format("%s[%8.3f]", this.name, this.rate);
		}
	}

	static class PlayLog {
		int player1;
		int player2;
		boolean isPlayer1Win;

		PlayLog(int player1, int player2, boolean isPlayer1Win) {
			this.player1 = player1;
			this.player2 = player2;
			this.isPlayer1Win = isPlayer1Win;
		}
	}

	public static void main(String[] args) throws Exception{
    int seed = Integer.parseInt(args[0]);
		int num = Integer.parseInt(args[1]);
    int boardnum = Integer.parseInt(args[2]);
		double pa = Integer.parseInt(args[3]);
		pa = pa * 0.01;
		double pb = 1 - pa;
		rand = new Random(seed);

		// Initialize Players
		PlayerInfo[] players = new PlayerInfo[9];
		players[0] = new PlayerInfo(0, "Random");
		players[1] = new PlayerInfo(1, "Hyouka");
		players[2] = new PlayerInfo(2, "MC");
		players[3] = new PlayerInfo(3, "MCT");
		players[4] = new PlayerInfo(4, "EPT+MCT1750");
		players[5] = new PlayerInfo(5, "EPT+MCT8500");
		players[6] = new PlayerInfo(6, "AlphaBeta1");
		players[7] = new PlayerInfo(7, "AlphaBeta2");
		players[8] = new PlayerInfo(8, "AlphaBeta4");

		// Initialize PlayLongs
		ArrayList<PlayLog> logs = new ArrayList<PlayLog>();

    int[][] results;
    results = new int[9][9];
    String filename = String.format("../result/board%dcopy/board%d.txt", num, boardnum);
    File file = new File(filename);
    BufferedReader br = new BufferedReader(new FileReader(file));
    String data;
    data = br.readLine();
    for (int i=0; i < 9; i++){
      for (int j=0; j < 9; j++){
        String[] sdata = data.split(": ", 0);
        String str = sdata[1];
        String[] x = str.split(", ", 0);
        int datanum = Integer.parseInt(x[0]);
        results[i][j] = datanum;
        if(i==j) results[j][i] = -1;
        data = br.readLine();
      }
    }

		for (int p1 = 0; p1 < 9; p1++) {
			for (int p2 = 0; p2 < 9; p2++) {
				if (p1 == p2) continue;
				addResults(logs, p1, p2, results[p1][p2]);
			}
		}

		int[] randomIndexes = generateRandomArray(logs.size());
		for (int index : randomIndexes) {
			PlayLog log = logs.get(index);
			PlayerInfo player1 = players[log.player1];
			PlayerInfo player2 = players[log.player2];
	
			System.out.println("isPlayer1Win : " + log.isPlayer1Win);
			double Ea = 1 / (1 + Math.pow(10, (player2.rate - player1.rate) / 400 - Math.log10(pa/(1-pa))));
			double Eb = 1 / (1 + Math.pow(10, (player1.rate - player2.rate) / 400 - Math.log10(pb/(1-pb))));
			double new_player1rate, new_player2rate;
			if (log.isPlayer1Win) {
				new_player1rate = player1.rate + K * (1 - Ea);
				new_player2rate = player2.rate + K * (0 - Eb);
			} else {
				new_player1rate = player1.rate + K * (0 - Ea);
				new_player2rate = player2.rate + K * (1 - Eb);
			}

			// System.out.printf("%s vs %s / win=%s / %s => %8.3f, %s => %8.3f¥n",
			// 									player1, player2, log.isPlayer1Win ? "p1" : "p2",
			// 									player1, new_player1rate,
			// 									player2, new_player2rate);
			player1.rate = new_player1rate;
			player2.rate = new_player2rate;
		}

		// output final results
		System.out.println("--------------------");
		// System.out.println("Board : " + boardnum);
		for (PlayerInfo player : players) {
			System.out.println(player.name + ": " + player.rate);
		}
	}

	static void addResults(ArrayList<PlayLog> logs, int p1, int p2, int winCount) {
		for (int i = 0; i < winCount; i++) {
			logs.add(new PlayLog(p1, p2, true));
		}
		for (int i = winCount; i < 100; i++) {
			logs.add(new PlayLog(p1, p2, false));
		}
	}

	static int[] generateRandomArray(int size) {
		int[] ret = new int[size];
		for (int i = 0; i < size; i++) {
			int j = rand.nextInt(i + 1);
			ret[i] = ret[j]; ret[j] = i;
		}
		return ret;
	}

}
