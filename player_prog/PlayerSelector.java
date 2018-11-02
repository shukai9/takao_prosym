class PlayerSelector {
  static CPU getPlayer(int playerID, String playername) throws Exception {
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
    if (playername.substring(0, 3).equals("MC-")) {
      int seed = Integer.parseInt(playername.substring(3));
      return new mcCPU(playerID, seed);
    }
    if (playername.equals("MCT")) {
      return new mctCPU(playerID);
    }
    if (playername.equals("MCT2")) {
      return new mct2CPU(playerID);
    }
    if (playername.equals("MCT+CF")) {
      return new hmctCPU(playerID);
    }
    if (playername.equals("MCT+CF2")) {
      return new hmct2CPU(playerID);
    }
    if (playername.equals("AlphaBeta1")) {
      return new AlphaBetaPlayer(playerID, 1, 0); // (先攻後攻, 探索の深さ, パターン(デフォルトが0))
    }
    if (playername.equals("AlphaBeta2")) {
      return new AlphaBetaPlayer(playerID, 2, 0); // (先攻後攻, 探索の深さ, パターン(デフォルトが0))
    }
    if (playername.equals("AlphaBeta3")) {
      return new AlphaBetaPlayer(playerID, 3, 0); // (先攻後攻, 探索の深さ, パターン(デフォルトが0))
    }
    throw new Exception("Unmatching player: " + playername);
  }
}
