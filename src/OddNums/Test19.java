package OddNums;

import java.util.*;


public class Test19 {
    /*제일 작은 수 제거하기
    정수를 저장한 배열, arr 에서 가장 작은 수를 제거한 배열을 리턴하는 함수,
    solution을 완성해주세요. 단, 리턴하려는 배열이 빈 배열인 경우엔 배열에 -1을 채워 리턴하세요.
     예를들어 arr이 [4,3,2,1]인 경우는 [4,3,2]를 리턴 하고, [10]면 [-1]을 리턴 합니다.*/

    //arr가 크기가 1이면 -1로 바꿔 리턴합니다.
    //찾는동안 임시변수(temp) 를 초기화
    //찾은 값의 인덱스를 저장할 변수(tempIndex)를 -1 로 초기화
    //arr 각각의 요소 비교해서
    //tempIndex가 -1 이면 비교하는값을 넣고 , 인덱스르 저장합니다.
    //작은수일때 임시변수에 넣고 , 인덱스를 저장하고
    //반복문 나왔을때 찾은 인덱스를 빼고 리턴합니다.
    public static int[] solution(int[] arr) {
        int[] answer = {-1};
        if (arr.length == 1) {
            return answer;
        } else {
            int smallest = 2147483647;
            List<Integer> list = new ArrayList<>();
            for (int i = 0; i < arr.length ; i++) {
                if (arr[i] < smallest) smallest = arr[i];
            }

            for (int i = 0; i < arr.length;i++) {
                if (smallest !=arr[i]) list.add(arr[i]);
            }

            return list.stream().mapToInt(i->i).toArray();
        }
    }

    public static void main(String[] args) {
        int[] temp = {4,1,3,2};
        System.out.println(solution(temp));
    }
}
