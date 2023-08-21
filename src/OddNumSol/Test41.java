package OddNumSol;

import java.util.*;

public class Test41 {
    public static String solution(int[] food) {
        String answer = "";

        //
        // ArrayDeque을 이용 해서 음식을 추가 해준다.
        // 중간 지점인 물을 기준점으로 먼저 넣어준다.
        // food배열에서 큰 칼로리 부터 짝수 개수인 부분 까지만 양쪽에서 추가를 해준다.
        // ArrayDeque의 값들을 answer에 추가해준다.

        // ArrayDeque선언
        Deque<String> deque = new ArrayDeque<>();
        // 중간 지점인 물을 기준점으로 먼저 넣어준다.
        deque.add("0");

        // 큰 칼로리 부터 작은 칼로리 까지 반복하는 for-loop 생성
        for (int i = food.length-1; i > 0; i--) {
            if (food[i] / 2 > 0) { // 해당 칼로리가 짝수 개수가 되는지 확인
                // 짝수 개수만큼 양쪽에 넣어준다.
                deque.addFirst(String.valueOf(i).repeat(food[i] / 2));
                deque.addLast(String.valueOf(i).repeat(food[i] / 2));
            }
        }

        // ArrayDeque의 값들을 answer에 추가해준다.
        while (deque.iterator().hasNext()) {
            answer += deque.pop();
        }

        return answer;
    }
    public static void main(String[] args) {
        int[] food = {1, 3, 4, 6}; // "1223330333221"
//        int[] food = {1, 7, 1, 2}; // "111303111"

        System.out.println(solution(food));
    }
}
