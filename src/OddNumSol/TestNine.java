package OddNumSol;
import java.util.*;
// 임의의 양의 정수 n에 대해, n이 어떤 양의 정수 x의 제곱인지 아닌지 판단하려 합니다.
// n이 양의 정수 x의 제곱이라면 x+1의 제곱을 리턴하고, n이 양의 정수 x의 제곱이 아니라면 -1을 리턴하는 함수를 완성하세요.
// 1. Math를 이용해 주어진 n의 제곱근을 구한다
// 2. 제곱근을 int로 변환해 변수에 담는다.
// 3. 해당 변수와 제곱근을 빼주는데 여기서 0이 아닐경우 answer는 -1
//      0일경우에는 answer는 제곱근+1의 제곱
public class TestNine {
    static long solution(long n) {
        long answer = 0;
        int beforeFlat = (int) Math.sqrt(n);
        double sRooted = Math.sqrt(n);
        if (sRooted - beforeFlat == 0) {
            answer = (long) Math.pow(sRooted+1,2);
        } else {
            answer = -1;
        }

        return answer;
    }

    public static void main(String[] args) {
    }
}
