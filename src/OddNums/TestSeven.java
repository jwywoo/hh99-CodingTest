package OddNums;

import java.util.Stack;

// 자연수 n을 뒤집어 각 자리 숫자를 원소로 가지는 배열 형태로 리턴해주세요.
// 예를들어 n이 12345이면 [5,4,3,2,1]을 리턴합니다.
// 1. n을 String으로 변환한다
// 2. Stack을 만든다.
// 3. 순회를 이용해 만들어논 Stack에 string이된 N값을 넣는다.
// 4. answer의 길이른 string으로 바꾼 n의 길이와 일치 시킨다
// 4. 순회를 한번더 해서 Stack에 있는 값을 answer에 담는다.
public class TestSeven {
    static int[] solution(long n) {
        int[] answer;

         String[] vaules = String.valueOf(n).split("");

        Stack<String> input = new Stack<>();
        for (var s : vaules)
        {
            input.push(s);
        }

        answer = new int[input.size()];

        for (int i = 0; i < answer.length; i++)
        {
            answer[i] = Integer.parseInt(input.pop());
        }

        return answer;
    }
    //저는 0.n 으로 만든다음 10씩 곱한다음 구했는데
    //그냥 % 10 하고 0.1 곱해버리면 되겠네요.

    public static void main(String[] args) {

    }
}
