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

public class ComputeRating2 {
	final static int RANDOMSEED = 1;
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
		PlayerInfo[] players = new PlayerInfo[8];
		players[0] = new PlayerInfo(0, "Random");
		players[1] = new PlayerInfo(1, "Hyoka");
		players[2] = new PlayerInfo(2, "Hyoka2");
		players[3] = new PlayerInfo(3, "MonteCarlo");
		players[4] = new PlayerInfo(4, "MonteCalroTree");
		players[5] = new PlayerInfo(5, "MCT2");
		players[6] = new PlayerInfo(6, "MCT+CostFunction");
		players[7] = new PlayerInfo(7, "MCT+CF2");
		// players[8] = new PlayerInfo(8, "MCT+CostFunction");
		// players[9] = new PlayerInfo(9, "MCT+CF2");

		// Initialize PlayLongs
		ArrayList<PlayLog> logs = new ArrayList<PlayLog>();
		int[][] results = {
			{ -1,  12,  14,   3,   0,   0,   0,   1},
			{ 90,  -1,  48,  49,  26,  31,  12,  12},
			{ 84,  53,  -1,  43,  22,  24,  15,  10},
			{ 99,  49,  54,  -1,  14,  16,  10,  15},
			{ 100, 76,  76,  89,  -1,  48,  25,  33},
			{ 99,  74,  64,  82,  53,  -1,  37,  47},
			{ 99,  74,  74,  75,  60,  68,  -1,  62},
			{ 99,  75,  66,  73,  65,  55,  41,  -1},
		};

		for (int p1 = 0; p1 < 8; p1++) { //10
			for (int p2 = 0; p2 < 8; p2++) {
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
		for (int i = winCount; i < 100; i++) { //プレイ回数
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
