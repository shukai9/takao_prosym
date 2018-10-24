// Zebra の評価関数を用いて alpha-beta 探索を行うプレイヤ
//評価関数はコマンドライン引数で変更可能

import java.util.*;
import java.util.*;

public class AlphaBetaPlayer extends CPU {
	// 読む深さ
	int SEARCH_DEPTH;
	OthelloEvaluator evaluator;
	
	public AlphaBetaPlayer(int c, int depth, int pattern) throws Exception {
		super(c);
		SEARCH_DEPTH = depth;
		if (pattern < 10) { evaluator = ZebraEv.evaluatorFactory(pattern); }
		else { evaluator = new WeakEv(); }
	}

	int getEV(GameState state, int curPlayer) {
	    return evaluator.eval(state) * curPlayer * this.color * -1;
	}

	static class PosEV {
		int x;
		int y;
		int value;

		PosEV(int x, int y, int value) {
			this.x = x;
			this.y = y;
			this.value = value;
		}

		static class ByValueDecr implements Comparator<PosEV> {
			public int compare(PosEV o1, PosEV o2) {
				return sign(o1.value - o2.value) * -1;
			}
		}
		static class ByValueIncr implements Comparator<PosEV> {
			public int compare(PosEV o1, PosEV o2) {
				return sign(o1.value - o2.value) * 1;
			}
		}
	}

	// 手の (x, y) 座標を返す
	@Override
	int[] decide(GameState state) {
		PosEV best = searchAlphaBeta(state, SEARCH_DEPTH, -10000000, +10000000, true);
		int[] ret = new int[2];
		ret[0] = best.x; ret[1] = best.y;
		return ret;
	}

	static int sign(int x) {
		if (x > 0) return 1;
		if (x < 0) return -1;
		return 0;
	}

	PosEV searchAlphaBeta(GameState state, int depth, int alpha, int beta, boolean isMaximizePlayer) {
		// System.out.printf("starting depth %d\n", depth);
		// System.out.printf("Ev = %d\n", getEV(state, this.color * (isMaximizePlayer ? 1 : -1)));
		// state.textDisplay();
		if (depth == 0) {
			// 自分側の評価値を求める
			int value = getEV(state, this.color * (isMaximizePlayer ? 1 : -1));
			// System.out.printf("ending depth %d with (%d, %d, %d)\n", depth, -1, -1, value);
			return new PosEV(-1, -1, value);
		}

		if (state.checkPass()) {
			// 終了状態
			if (state.isLastPass) {
				state.countDisc();
				int value = 1024 * (state.black - state.white) * this.color;
				// System.out.printf("end of game depth %d with (%d, %d, %d)\n", depth, -1, -1, value);
				return new PosEV(-1, -1, value);
			}

			// パスの場合は深さを減らさずに次へ
			state.Pass();
			PosEV next = searchAlphaBeta(state, depth, alpha, beta, !isMaximizePlayer);
			// System.out.printf("pass depth %d with (%d, %d, %d)\n", depth, -1, -1, next.value);
			return new PosEV(-1, -1, next.value);
		}

		// 置ける手の列挙
		ArrayList<PosEV> possibleMoves = new ArrayList<PosEV>();
		for (int y = 0; y < size-1; y++) {
			for (int x = 0; x < size-1; x++) {
				if (!state.canReverse(x, y)) continue;

				GameState nextState = state.clone();
				nextState.put(x, y);

				// FIXME: 相手の側の評価値を求める
				int value = getEV(nextState, this.color * (isMaximizePlayer ? -1 : 1));
				possibleMoves.add(new PosEV(x, y, value));
			}
		}

		// 評価値順にソートする．
		if (isMaximizePlayer) {
			Collections.sort(possibleMoves, new PosEV.ByValueDecr());
		} else {
			Collections.sort(possibleMoves, new PosEV.ByValueIncr());
		}

		if (depth == 1) {
			PosEV best = possibleMoves.get(0);
			// System.out.printf("ending depth %d with (%d, %d, %d)\n", depth, best.x, best.y, best.value);
			return best;
		}
		PosEV best = new PosEV(-1, -1, isMaximizePlayer ? alpha : beta);
		// 評価値順に探索を進める
		for (PosEV move : possibleMoves) {
			GameState nextState = state.clone();
			nextState.put(move.x, move.y);
			// System.out.printf("Putting at (%d, %d)\n", move.x, move.y);

			PosEV next = searchAlphaBeta(nextState, depth-1, alpha, beta, !isMaximizePlayer);
			// if (depth == SEARCH_DEPTH) {
			// 	System.out.printf("Select (%d,%d): %d\n", move.x, move.y, next.value);
			// }
			if (isMaximizePlayer) {
				if (best.value < next.value) best = new PosEV(move.x, move.y, next.value);
				if (best.value >= beta && depth != SEARCH_DEPTH) {
					// System.out.println("beta-cut");
					return new PosEV(-1, -1, beta);
				}
				alpha = best.value;
			} else {
				if (best.value > next.value) best = new PosEV(move.x, move.y, next.value);
				if (best.value <= alpha) {
					// System.out.println("alpha-cut");
					return new PosEV(-1, -1, alpha);
				}
				beta = best.value;
			}
			// System.out.printf("At depth %d best = (%d, %d, %d)\n", depth, best.x, best.y, best.value);
		}

		// System.out.printf("ending depth %d with (%d, %d, %d)\n", depth, best.x, best.y, best.value);
		return best;
	}


	// test code
	public static void main(String[] args) throws Exception {
		GameState state = new GameState();
		
		state.textDisplay();
		
		AlphaBetaPlayer player = new AlphaBetaPlayer(1, 2, 0);
		while (true) {
			int[] selectedMove = player.decide(state);
			System.out.printf("selected move: (%d, %d)\n", selectedMove[0], selectedMove[1]);
			state.put(selectedMove[0], selectedMove[1]);

			System.out.println("White: ");
			Scanner sc = new Scanner(System.in); int x = sc.nextInt(); int y = sc.nextInt();
			if (x == -1) {
				state.Pass();
			} else {
				state.put(x, y);
			}
		}

	}
	
}
