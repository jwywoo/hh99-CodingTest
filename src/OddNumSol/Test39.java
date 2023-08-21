package OddNumSol;

import java.util.*;

public class Test39 {
    public static int[] solution(int[] numbers) {
        // 중복 숫자를 자동으로 정리하기 위해 set을 사용.
        // 이중for문을 이용하여 두 개의 수의 합을 set에 넣어준다.
        // set의 크기와 같은 int[] answer 선언
        // set의 값을 answer에 넣어준다.

        // 중복 숫자를 자동으로 정리하기 위해 set을 사용.
        Set<Integer> set = new TreeSet<>();
        // 이중for문을 이용하여 두 개의 수의 합을 set에 넣어준다.
        for (int i = 0; i < numbers.length-1; i++) {
            for (int j = i+1; j < numbers.length; j++) {
                set.add(numbers[i] + numbers[j]);
            }
        }

        // set의 크기와 같은 int[] answer 선언
        int[] answer = new int[set.size()];
        int cnt = 0;
        // set의 값을 answer에 넣어준다.
        for (int num : set) {
            answer[cnt++] = num;
        }
//        System.out.println(set.toString());

        return answer;
    }
    public static void main(String[] args) {
        int[] numbers = {2,1,3,4,1}; // [2,3,4,5,6,7]
//        int[] numbers = {5,0,2,7}; // [2,5,7,9,12]
//        int[] numbers = {5, 0, 1, 99, 100}; // [1, 5, 6, 99, 100, 101, 104, 105, 199]

        System.out.println(solution(numbers));
    }
}
