package OddNumSol;

import java.util.*;

public class Test47 {
    public static int[] solution(int[] answers) {
        int[] answer = new int[3];
        int[] one = new int[]{1, 2, 3, 4, 5};
        int[] two = new int[]{2, 1, 2, 3, 2, 4, 2, 5};
        int[] three = new int[]{3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        Map<Integer, Integer> board = new HashMap<>();
        board.put(1, 0);
        board.put(2, 0);
        board.put(3, 0);
        for (int i = 0; i < answer.length; i++) {
            if (one[i % one.length] == answers[i]) board.put(1, board.get(1) + 1);
            if (two[i % two.length] == answers[i]) board.put(2, board.get(2) + 1);
            if (three[i % three.length] == answers[i]) board.put(3, board.get(3) + 1);
        }

        int max = -1;
        if (max < board.get(1)) max = board.get(1);
        if (max < board.get(2)) max = board.get(2);
        if (max < board.get(3)) max = board.get(3);

        List<Integer> temp = new ArrayList<>();
        if (max == board.get(1)) temp.add(1);
        if (max == board.get(2)) temp.add(2);
        if (max == board.get(3)) temp.add(3);

        answer = new int[temp.size()];
        for (int i = 0; i < temp.size();i++) answer[i] = temp.get(i);
        return answer;
    }

    public static void main(String[] args) {
        solution(new int[]{1, 2, 3, 4, 5});
        solution(new int[]{1, 2, 3, 4, 5});
        solution(new int[]{5, 5, 5, 5, 5, 5, 5, 5});

    }
}
