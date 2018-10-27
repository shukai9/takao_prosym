/**
 * 今村君の対戦記録からEloレーティングによりレートを計算するプログラム．
 * 各対戦の組合せについて勝数のみが記録されているので，その勝数のもとで
 * 乱数により勝敗を振り分ける．また対戦の順番についても乱数で決めたとする．
 * 乱数のシードによって結果が異なるので注意．(RANDOMSEED で設定)
 *
 * RANDOMSEED=1 のときの結果 (最終結果のみ)
 * Random[1087.638]
 * Hyoka[1549.122]
 * Hyoka2[1500.091]
 * MonteCarlo[1544.916]
 * MonteCalroTree[1417.322]
 * MCT2[1517.021]
 * MCT3[1358.165]
 * MCT4[1410.521]
 * MCT+CostFunction[1830.351]
 * MCT+CF2[1784.854]
 */

import java.io.*;
import java.util.*;

public class ComputeRating {
	final static int RANDOMSEED = 10;
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

	public static void main(String[] args) {
		rand = new Random(RANDOMSEED);

		// Initialize Players
		PlayerInfo[] players = new PlayerInfo[10];
		players[0] = new PlayerInfo(0, "Random");
		players[1] = new PlayerInfo(1, "Hyoka");
		players[2] = new PlayerInfo(2, "Hyoka2");
		players[3] = new PlayerInfo(3, "MonteCarlo");
		players[4] = new PlayerInfo(4, "MonteCalroTree");
		players[5] = new PlayerInfo(5, "MCT2");
		players[6] = new PlayerInfo(6, "MCT3");
		players[7] = new PlayerInfo(7, "MCT4");
		players[8] = new PlayerInfo(8, "MCT+CostFunction");
		players[9] = new PlayerInfo(9, "MCT+CF2");

		// Initialize PlayLongs
		ArrayList<PlayLog> logs = new ArrayList<PlayLog>();
		int[][] results = {
			{ -1,  93, 114,  46, 143,  58, 165, 159,  15,  14},
			{920,  -1, 549, 491, 710, 666, 740, 718, 243, 253},
			{875, 493,  -1, 480, 704, 603, 693, 676, 231, 232},
			{960, 530, 563,  -1, 745, 562, 776, 735, 206, 240},
			{828, 290, 345, 252,  -1, 308, 504, 471,  50,  64},
			{946, 372, 430, 440, 742,  -1, 743, 744, 158, 164},
			{839, 277, 326, 240, 497, 284,  -1, 481,  65,  49},
			{846, 313, 328, 269, 542, 298, 517,  -1,  72,  74},
			{989, 789, 794, 802, 967, 856, 944, 946,  -1, 539},
			{987, 770, 798, 760, 941, 830, 942, 936, 480,  -1},
		};
		
		for (int p1 = 0; p1 < 10; p1++) {
			for (int p2 = 0; p2 < 10; p2++) {
				if (p1 == p2) continue;
				addResults(logs, p1, p2, results[p1][p2]);
			}
		}

		int[] randomIndexes = generateRandomArray(logs.size());
		for (int index : randomIndexes) {
			PlayLog log = logs.get(index);
			PlayerInfo player1 = players[log.player1];
			PlayerInfo player2 = players[log.player2];
			double Ea = 1 / (1 + Math.pow(10, (player2.rate - player1.rate) / 400));
			double Eb = 1 / (1 + Math.pow(10, (player1.rate - player2.rate) / 400));
			double new_player1rate, new_player2rate;
			if (log.isPlayer1Win) {
				new_player1rate = player1.rate + K * (1 - Ea);
				new_player2rate = player2.rate + K * (0 - Eb);
			} else {
				new_player1rate = player1.rate + K * (0 - Ea);
				new_player2rate = player2.rate + K * (1 - Eb);
			}
			System.out.printf("%s vs %s / win=%s / %s => %8.3f, %s => %8.3f¥n",
												player1, player2, log.isPlayer1Win ? "p1" : "p2",
												player1, new_player1rate,
												player2, new_player2rate);
			player1.rate = new_player1rate;
			player2.rate = new_player2rate;
		}

		// output final results
		System.out.println("--------------------");
		for (PlayerInfo player : players) {
			System.out.println(player);
		}
	}

	static void addResults(ArrayList<PlayLog> logs, int p1, int p2, int winCount) {
		for (int i = 0; i < winCount; i++) {
			logs.add(new PlayLog(p1, p2, true));
		}
		for (int i = winCount; i < 1000; i++) {
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

