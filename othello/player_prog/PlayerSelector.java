class PlayerSelector {
  static CPU getPlayer(int playerID, String playername) throws Exception {
    if (playername.substring(0, 3).equals("MC-")) {
      int seed = Integer.parseInt(playername.substring(3));
      return new mcCPU(playerID, seed);
    }
    if (playername.equals("MCT")) {
      return new mctCPU(playerID, 100, new mctCPU.MctParams(100, 320, true, 10, 1.0, 2.47));
    }
    // EPT_MCT???
    if (playername.substring(0, 7).equals("EPT_MCT")) {
      // return new MctPBiasCPU(playerID, 0, 100, 1.4);
      int count = Integer.parseInt(playername.substring(7));
			return new MctEPTCPU(playerID, 1, 100, 1, count, 100, true, 10, 1.0, 2.47);
    }
    if (playername.equals("AlphaBeta1")) {
      return new AlphaBetaPlayer(playerID, 1, 0); // (先攻後攻, 探索の深さ, パターン(デフォルトが0))
    }
    if (playername.equals("AlphaBeta2")) {
      return new AlphaBetaPlayer(playerID, 2, 0); // (先攻後攻, 探索の深さ, パターン(デフォルトが0))
    }
    if (playername.equals("AlphaBeta4")) {
      return new AlphaBetaPlayer(playerID, 4, 0); // (先攻後攻, 探索の深さ, パターン(デフォルトが0))
    }
    // random????  ???? = seed
    if (playername.substring(0, 6).equals("random")) {
      int seed = Integer.parseInt(playername.substring(6));
      return new RandomCPU(playerID, seed);
    }
    // hyouka-{n}-{seed}
    //  n = 0: hyouka, n = 1: hyouka2
    if (playername.substring(0, 6).equals("hyouka")) {
      int mapID = Integer.parseInt(playername.substring(7,8));
      int seed = Integer.parseInt(playername.substring(9));
      return new hyoukaCPU(playerID, 0, seed);
    }
    throw new Exception("Unmatching player: " + playername);
  }
}
