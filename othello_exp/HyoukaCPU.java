//評価関数で手を決定するプレイヤのクラス

import java.util.*;

public class HyoukaCPU extends CPU {

    //使用する評価関数の種類
    OthelloEvaluator Eval;

    //自分が置くターンを判別する関数
    int color;
    int size = 10;

    //ランダムクラスのインスタンス化
    Random rnd;

    public HyoukaCPU(int c, int Select, int seed) throws Exception {
        super(c);
        rnd = new Random(seed);
        Eval = ZebraEv.evaluatorFactory(Select);
    }

    //手を決定するメソッド
    int[] decide(GameState state) {
        ArrayList<int[]>  array = new ArrayList<int[]>();

        for(int y = 1; y < size; y++) {
            for(int x = 1; x < size; x++) {
                if(state.data[x + y * 10] != 0) continue;
                if(state.canReverse(x, y) == true) {
                    int pos[] = {x, y};
                    array.add(pos);
                }
            }
        }

        if(array.size() <= 0) {
            int pos[] = {-1, -1};
            return pos;
        }

        else if(array.size() == 1) {
            int pos[] = array.get(0);
            int data[] = {pos[0], pos[1]};
            return data;
        }

        int select = 0;
        int MaxPoint = Integer.MIN_VALUE;

        for(int i = 0; i < array.size(); i++) {
            int[] pos = array.get(i);
            int point = new WeakEv().evalMove(state, pos);
	    
            if(MaxPoint < point) {
                select = i;
                MaxPoint = point;
            }
        }

        return array.get(select);
    }

    //プレイアウトで置く場所を決定するメソッド
    //HMCTCPU用．MCTGameState型が渡されたらGameState型に変換する
    int[] playoutDecide(MCTGameState state, ArrayList<int[]> array) {
        GameState s = new GameState(true);
        s.set(state.data, state.turn, state.player);

        return playoutDecide(s, array);
    }

    static class PosAndScore {
        int[] pos;
        int score;
        PosAndScore(int[] pos, int score) {
            this.pos = new int[2];
            this.pos[0] = pos[0];
            this.pos[1] = pos[1];
            this.score = score;
        }
        static class DecrByScroe implements Comparator<PosAndScore> {
            public int compare(PosAndScore p1, PosAndScore p2) {
                if (p1.score < p2.score) return 1;
                if (p1.score > p2.score) return -1;
                return 0;
            }
        }
    }

    //プレイアウト中に置く場所を決定するメソッド
    //HMCTCPU用
    int[] playoutDecide(GameState state, ArrayList<int[]> array) {

        if(array.size() <= 0) {
            int pos[] = {-1, -1};
            return pos;
        }
        else if(array.size() == 1) {
            int pos[] = array.get(0);
            int data[] = {pos[0], pos[1]};
            return data;
        }

        PosAndScore[] evarray = new PosAndScore[array.size()];
        for (int i = 0; i < array.size(); i++) {
	    int point = Eval.evalMove(state, array.get(i));
            evarray[i] = new PosAndScore(array.get(i), point);
        }

        Arrays.sort(evarray, new PosAndScore.DecrByScroe());

        int ranPoint = (int)Math.pow(2, array.size()) - 1;
        int ranSelect = rnd.nextInt(ranPoint);

        int i = 1;
        for(int j = array.size() -1; j >= 0; j--) {
            ranSelect -= i;
            if(ranSelect <= 0) {
                return evarray[j].pos;
            }
            i *= 2;
        }
        return new int[] {-1, -1};
    }
}
