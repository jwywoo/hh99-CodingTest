package EvenNumSol;
//0부터 9까지의 숫자 중 일부가 들어있는 정수 배열 numbers가 매개변수로 주어집니다. numbers에서 찾을 수 없는 0부터 9까지의 숫자를 모두 찾아 더한 수를 return 하도록 solution 함수를 완성해주세요.
//
//제한사항
//1 ≤ numbers의 길이 ≤ 9
//0 ≤ numbers의 모든 원소 ≤ 9
//numbers의 모든 원소는 서로 다릅니다.

import java.util.*;

public class Test18 {
    static int solution(int[] numbers) {
        int answer = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < 10; i++) {
            map.put(i,0);
        }

        for (int i = 0; i < numbers.length; i++) {
            map.put(numbers[i], 1);
        }

        for (Integer key : map.keySet()) {
            if (map.get(key) == 0) answer+=key;
        }
        return answer;
    }

    public static void main(String[] args) {
        int[] temp = {5,8,4,0,6,7,9};
        System.out.println(solution(temp));
    }
}
