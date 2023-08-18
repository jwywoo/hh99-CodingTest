package OddNums;
// 자연수 N이 주어지면, N의 각 자릿수의 합을 구해서 return 하는 solution 함수를 만들어 주세요.
// 예를들어 N = 123이면 1 + 2 + 3 = 6을 return 하면 됩니다.
// 123 6
// 987 24

// 1. 주어진 숫자 n을 String으로 만든다
// 2. 그리고 변환된 값을 순회를 하면서 자리수를 answer에 더한다.
public class TestThree {
    static int solution(int n) {
        var temp = String.valueOf(n).toCharArray();
        int anser = 0;
        for (var v : temp)
        {
            anser += Integer.parseInt(String.valueOf(v));
        }
        return anser;
    }
    // n % 10 으로 일자리수를 구하는게 더 빠르네요.
    public static void main(String[] args) {

    }
}
