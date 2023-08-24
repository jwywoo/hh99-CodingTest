package OddNumSol;

import java.util.*;

public class Test43 {
    public static int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        List<Integer> board = new ArrayList<>();
        for (int i = 0; i < score.length; i++) {
            board.add(score[i]);
            Collections.sort(board);
            if (board.size() < k) {
                answer[i] = board.get(0);
            } else {
                answer[i] = board.get(board.size()-k);
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        solution(3, new int[]{10, 100, 20, 150, 1, 100, 200});
        solution(4, new int[]{0, 300, 40, 300, 20, 70, 150, 50, 500, 1000});
    }
}
