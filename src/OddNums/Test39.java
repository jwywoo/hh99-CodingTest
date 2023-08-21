package OddNums;

import java.util.Arrays;
import java.util.SortedSet;
import java.util.TreeSet;

public class Test39 {
    public static int[] solution(int[] numbers) {
        // 중복 숫자를 자동으로 정리하기 위해 set을 사용.
        // 이중for문을 이용하여 두 개의 수의 합을 set에 넣어준다.
        // set의 크기와 같은 int[] answer 선언
        // set의 값을 answer에 넣어준다.

        // 시작
        SortedSet<Integer> sortedSet = new TreeSet<>();
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i+1; j < numbers.length; j++) {
                sortedSet.add(numbers[i] + numbers[j]);
            }
        }

        return Arrays.stream(sortedSet.toArray()).mapToInt(o -> (int)o).toArray();
    }
    public static void main(String[] args) {
//        int[] numbers = {2,1,3,4,1}; // [2,3,4,5,6,7]
        int[] numbers = {5,0,2,7}; // [2,5,7,9,12]

        System.out.println(solution(numbers));
    }
}
