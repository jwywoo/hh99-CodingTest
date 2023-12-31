package EvenNms;
//문제 설명
//두 정수 a, b가 주어졌을 때 a와 b 사이에 속한 모든 정수의 합을 리턴하는 함수, solution을 완성하세요.
//예를 들어 a = 3, b = 5인 경우, 3 + 4 + 5 = 12이므로 12를 리턴합니다.
//
//제한 조건
//a와 b가 같은 경우는 둘 중 아무 수나 리턴하세요.
//a와 b는 -10,000,000 이상 10,000,000 이하인 정수입니다.
//a와 b의 대소관계는 정해져있지 않습니다.

// 1. a와 b의 대소 관계를 if 문을 할용해 먼저 확인한다.
// 2. 그다음 for문을 이용해 a 부터 b(포함)까지 answer에 추가한다.
public class Test12 {
    static long solution(int a, int b) {
        long res = 0;

        if (a < b)
        {
            for (; a <= b; a++)
                res += a;
        }else
        {
            for (; b <= a; b++)
                res += b;
        }

        return res;
    }
    // 다른분은  비교후 (b - a + 1) * (a + b) / 2; 해버리네요.
    public static void main(String[] args) {

    }
}
