//コマンドライン引数からプレイヤとパラメータを決定するクラス

import java.util.*;

class Params {
	static int gamecount;

	static CPU b_cpu;
	static CPU w_cpu;
	
	static void parse(String[] args) throws Exception {
		gamecount = Integer.parseInt(args[0]);
		b_cpu = parsePlayer(args[1], 1);
		w_cpu = parsePlayer(args[2], -1);
	}

	static CPU parsePlayer(String arg, int color) throws Exception {
		if (arg.charAt(0) == 'R') { // Random
			return new RandomCPU(color);
		}

		if (arg.charAt(0) == 'H') { // Hyouka "H,select,seed"
			String[] args = arg.split(",");
			int select = Integer.parseInt(args[1]);
			int seed = Integer.parseInt(args[2]);
			return new HyoukaCPU(color, select, seed);
		}

		if (arg.charAt(0) == 'M') { // Monte Carlo "M,count,seed"
			String[] args = arg.split(",");
			int count = Integer.parseInt(args[1]);
			int seed = Integer.parseInt(args[2]);
			return new MCCPU(color, count, seed);
		}

		if (arg.charAt(0) == 'T') { // Monte Calro Tree Search(ucb1) "T,count,th,select,seed
			String[] args = arg.split(",");
			int count = Integer.parseInt(args[1]);
			int th = Integer.parseInt(args[2]);
			int select = Integer.parseInt(args[3]);
			int seed = Integer.parseInt(args[4]);
			return new MCTCPU(color, count, th, select, seed);
		}

		if (arg.charAt(0) == 'E') { // Monte Carlo Tree Search(ucb1 & playout)  "E,count,th,select,seed"
			String[] args = arg.split(",");
			int count = Integer.parseInt(args[1]);
			int th = Integer.parseInt(args[2]);
			int select = Integer.parseInt(args[3]);
			int seed = Integer.parseInt(args[4]);
			return new HMCTCPU(color, count, th, select, seed);
		}

		if (arg.charAt(0) == 'P') { // Monte Carlo Tree Search(playout)  "P,count,th,select,seed"
		     	String[] args = arg.split(",");
			int count = Integer.parseInt(args[1]);
			int th = Integer.parseInt(args[2]);
			int select = Integer.parseInt(args[3]);
			int seed = Integer.parseInt(args[4]);
			return new PlayerP(color, count, th, select, seed);
		}

		if (arg.charAt(0) == 'A') { // "A,depth"
			String[] args = arg.split(",");
			int depth = Integer.parseInt(args[1]);
			int pattern = (args.length > 2) ? Integer.parseInt(args[2]) : 0;
			return new AlphaBetaPlayer(color, depth, pattern);
		}

		throw new RuntimeException("No player returned");
	}
}
