package EvenNms;
//문제 설명
//배열 array의 i번째 숫자부터 j번째 숫자까지 자르고 정렬했을 때, k번째에 있는 수를 구하려 합니다.
//
//예를 들어 array가 [1, 5, 2, 6, 3, 7, 4], i = 2, j = 5, k = 3이라면
//
//array의 2번째부터 5번째까지 자르면 [5, 2, 6, 3]입니다.
//1에서 나온 배열을 정렬하면 [2, 3, 5, 6]입니다.
//2에서 나온 배열의 3번째 숫자는 5입니다.
//배열 array, [i, j, k]를 원소로 가진 2차원 배열 commands가 매개변수로 주어질 때, commands의 모든 원소에 대해 앞서 설명한 연산을 적용했을 때 나온 결과를 배열에 담아 return 하도록 solution 함수를 작성해주세요.
//
//제한사항
//array의 길이는 1 이상 100 이하입니다.
//array의 각 원소는 1 이상 100 이하입니다.
//commands의 길이는 1 이상 50 이하입니다.
//commands의 각 원소는 길이가 3입니다.

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.IntStream;

// 1. commands.length 에 맞춰 순회를 시작한다.
// 2. 문제에서 언급한 i, j, k의 변수를 만들어 값을 저장한다.(조건 조심!)
// 3. List를 만들어 i에서 j까지의 값을 넣고 (순회를 사용해도 좋고 stream을 사용해도 좋습니다!)
// 4. Collections.sort를 이용해 정렬한뒤(정렬도 stream으로 미리 할 수 있을거 같은데 저는 안했습니다.)
// 5. k에 해당하는 값을 answer에 대입한다.
public class Test38 {
    public static int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];

        int cnt = 0;
        for(int[] num : commands) {
            int i = num[0];
            int j = num[1];
            int k = num[2];

            List<Integer> list = new ArrayList<>();
            IntStream.rangeClosed(i-1, j-1).forEach(x -> {list.add(array[x]);});
            Collections.sort(list);
            answer[cnt++] = list.get(k-1);
        }

        return answer;
    }

    public static void main(String[] args) {
        int[] array = {1, 5, 2, 6, 3, 7, 4};
        int[][] commands = {{2, 5, 3 }, {4, 4, 1}, {1, 7, 3}};// [5, 6, 3]

        System.out.println(solution(array, commands));
    }
}
