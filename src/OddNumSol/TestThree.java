package OddNumSol;
import java.util.*;
// 자연수 N이 주어지면, N의 각 자릿수의 합을 구해서 return 하는 solution 함수를 만들어 주세요.
// 예를들어 N = 123이면 1 + 2 + 3 = 6을 return 하면 됩니다.
// 123 6
// 987 24

// 1. 주어진 숫자 n을 String으로 만든다
// 2. 그리고 변환된 값을 순회를 하면서 자리수를 answer에 더한다.
public class TestThree {
    static int solution(int n) {
        int answer = 0;
        String stringN = String.valueOf(n);
        for (int i = 0; i < stringN.length() ; i++) {
            answer += stringN.charAt(i) - '0';
        }
        return answer;
    }

    public static void main(String[] args) {

    }
}
