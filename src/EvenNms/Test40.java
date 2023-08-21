package EvenNms;
//문제 설명
//문자열 s가 주어졌을 때, s의 각 위치마다 자신보다 앞에 나왔으면서, 자신과 가장 가까운 곳에 있는 같은 글자가 어디 있는지 알고 싶습니다.
//예를 들어, s="banana"라고 할 때,  각 글자들을 왼쪽부터 오른쪽으로 읽어 나가면서 다음과 같이 진행할 수 있습니다.
//
//b는 처음 나왔기 때문에 자신의 앞에 같은 글자가 없습니다. 이는 -1로 표현합니다.
//a는 처음 나왔기 때문에 자신의 앞에 같은 글자가 없습니다. 이는 -1로 표현합니다.
//n은 처음 나왔기 때문에 자신의 앞에 같은 글자가 없습니다. 이는 -1로 표현합니다.
//a는 자신보다 두 칸 앞에 a가 있습니다. 이는 2로 표현합니다.
//n도 자신보다 두 칸 앞에 n이 있습니다. 이는 2로 표현합니다.
//a는 자신보다 두 칸, 네 칸 앞에 a가 있습니다. 이 중 가까운 것은 두 칸 앞이고, 이는 2로 표현합니다.
//따라서 최종 결과물은 [-1, -1, -1, 2, 2, 2]가 됩니다.
//
//문자열 s이 주어질 때, 위와 같이 정의된 연산을 수행하는 함수 solution을 완성해주세요.
//
//제한사항
//1 ≤ s의 길이 ≤ 10,000
//s은 영어 소문자로만 이루어져 있습니다.

import java.util.HashMap;
import java.util.Map;

// 1. s를 배열로 만든다.(순회가능하면 s 그냥 써도 됩니다)
// 2. s의 글자를 key로 하고 index를 value로 갖는 Map을 만든다.
// 3. s를 순회하면서 만약 s의 글자가 이미 Map에 포함 되어있으면 현재의 index로 최신화 해준다.
//    그리고 해당 index와 현재 Map에 저장 되어 있는 값의 차이를 answer에 대입한다.
//    만약 포함하지 않고 처음으로 나올시 해당 index를 Map에 글자를 key로 해당 index를 value로 Map 삽입한다.
//    answer의 경우 처음 나온 글자니 -1을 대입한다.
    public class Test40 {
    public static int[] solution(String s) {
        int[] answer = new int[s.length()];

        // s를 배열로 만든다.
        char[] temp = s.toCharArray();
        // 2. key value로 갖는 map만들기
        Map<Character, Integer> map = new HashMap<>();
        // s를 순회하면서
        for (int i = 0; i < s.length(); i++) {
            if (map.containsKey(temp[i])) { // s의 글자가 이미 Map에 포함 되어있으면
                answer[i] = i - map.get(temp[i]); // 그리고 해당 index와 현재 Map에 저장 되어 있는 값의 차이를 answer에 대입한다.
                map.put(temp[i], i); // index로 최신화 해준다.
            } else { // 만약 포함하지 않고 처음으로 나올시
                map.put(temp[i], i); // index를 Map에 글자를 key로 해당 index를 value로 Map 삽입한다
                answer[i] = -1; // answer의 경우 처음 나온 글자니 -1을 대입한다.
            }
//            System.out.println(answer[i]);
        }

        return answer;
    }

    public static void main(String[] args) {
        String s = "banana"; // [-1, -1, -1, 2, 2, 2]
//        String s = "foobar"; // [-1, -1, 1, -1, -1, -1]

        System.out.println(solution(s));
    }
}
