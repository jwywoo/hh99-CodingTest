package OddNums;

public class Test13 {
    /*콜라츠 추측
    1-1. 입력된 수가 짝수라면 2로 나눕니다.
    1-2. 입력된 수가 홀수라면 3을 곱하고 1을 더합니다.
    2. 결과로 나온 수에 같은 작업을 1이 될 때까지 반복합니다.

    예를 들어, 주어진 수가 6이라면 6 → 3 → 10 → 5 → 16 → 8 → 4 → 2 → 1 이 되어 총 8번 만에 1이 됩니다.
     위 작업을 몇 번이나 반복해야 하는지 반환하는 함수, solution을 완성해 주세요.
     단, 주어진 수가 1인 경우에는 0을, 작업을 500번 반복할 때까지 1이 되지 않는다면 –1을 반환해 주세요.
    */

    // 먼저 위 분류해 계산을 할 메서드를 만들고
    // 나머지로 홀짝을 구분하고 ...(다른 더 빠른 방법 없을까요?)
    // 1 인지 확인후
    // 계산값 혹은 0 을 보내고
    //
    //메인에선 리턴시킬 변수 -1로 초기화 하고
    // 반복문에 500회 돌려서
    // 메서드의 결과값에따라 리턴 시켜주세요.

    public static long calculator(long num) {
        if (num%2 == 0) return num/2;
        else return num*3+1;
        // return (num%2 == 0)?num/2:(num*3)+1;
    }
    public static int solution(int num) {
        int answer = 0;
        long temp = (long) num;
        int result = 0;
        while (temp != 1) {
            if (result == 500) break;
            temp = calculator(temp);
            result++;
        }
        answer = (result < 500)?result:-1;
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(6));
    }
}
