package OddNums;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test15 {
    /*나누어 떨어지는 숫자 배열
    array의 각 element 중 divisor로 나누어 떨어지는 값을 오름차순으로 정렬한 배열을 반환하는 함수, solution을 작성해주세요.
    divisor로 나누어 떨어지는 element가 하나도 없다면 배열에 -1을 담아 반환하세요.
*/

    //array 요소 전부 대상으로 반복문 돌리고
    // 나머지 있는지 확인한 다음 ,
    // 임시 저장 리스트 (temps)에 추가 하기전에
    // temps 요소가 없으면 추가 , 있으면 각각 비교해서 자기보다 큰 값이면 그 인덱스에 삽입해주세요.
    // 귀찮다면 stream으로 정렬을
    public static int[] solution(int[] arr, int divisor) {
        int[] answer = {-1};
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]%divisor == 0) list.add(arr[i]);
        }
        Collections.sort(list);
        if (list.size() != 0) answer = list.stream().mapToInt(i->i).toArray();
        return answer;
    }

    public static void main(String[] args) {
        int[] temp = {3,2,6};
        System.out.println(solution(temp, 10));
    }
}
