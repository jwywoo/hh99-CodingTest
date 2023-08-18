package OddNumSol;

// 정수 num이 짝수일 경우 "Even"을 반환하고 홀수인 경우 "Odd"를 반환하는 함수, solution을 완성해주세요.
public class TestOne {
    // 1. if statement에서 Condition으로 num을 %2 나눈다
    // 2. 나머지가 1일 경우 홀수 0일 경우에는 짝수
    static String solution(int num) {
        if (num % 2 == 0)
        {
            return "Even";
        }else
        {
            return  "Odd";
        }
    }

    public static void main(String[] args) {
        System.out.println(solution(2));
    }
}
