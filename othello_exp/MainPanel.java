//プレイヤを決定し，ゲームを行うクラス

import java.util.*;
import java.util.Scanner;
import java.io.*;

public class MainPanel {
    //Game status
    GameState state = new GameState();

    //CPU class
    CPU b_cpu;
    CPU w_cpu;

    public MainPanel() {
	b_cpu = Params.b_cpu;
	w_cpu = Params.w_cpu;

	normalGame(Params.gamecount); //通常
    }

    //通常のゲーム
    public void normalGame(int count) {
	for(int i = 0; i < count; i++) {
	    game(i);
	    state.reset();
	    b_cpu.reset();
	    w_cpu.reset();
	}

	System.out.println("END");
    }

    //ゲームを行うメソッド
    public void game(int gameID) {
	boolean isLastPass = false;

	for(;;) {
	    if(state.checkPass() == true) {
		if (isLastPass) break;
		state.player *= -1;
		isLastPass = true;
		continue;
	    }
	    isLastPass = false;

	    long t1 = System.nanoTime();
	    int action[] = (state.player == b_cpu.color) ? b_cpu.decide(state)
		: w_cpu.decide(state);
	    long t2 = System.nanoTime();
	    
	    if(action[0] == -1 || action[1] == -1) {
		throw new RuntimeException(String.format("Illegal Move by %d : (-1, -1)",
							 state.player));
	    }
	    System.out.printf("turn,%d,player,%c,pos,%d,%d,time,%d\n",
			      state.turn + 1, (state.player == b_cpu.color) ? 'B' : 'W',
			      action[0], action[1], (t2 - t1) / 1000);

	    state.put(action[0], action[1]);
	}

	endGame(gameID);
    }

    //ゲーム終了時に勝ち負けの数を追加
    public void endGame(int gameID) {
	int End = state.Win();
	if (End == 1)       System.out.printf("end,%d,blackwin\n", gameID);
	else if (End == -1) System.out.printf("end,%d,whitewin\n", gameID);
	else                System.out.printf("end,%d,draw\n",     gameID);
    }
}
