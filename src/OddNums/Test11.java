package OddNums;

public class Test11 {
    /*양의 정수 x가 하샤드 수이려면 x의 자릿수의 합으로 x가 나누어져야 합니다.
     예를 들어 18의 자릿수 합은 1+8=9이고, 18은 9로 나누어 떨어지므로 18은 하샤드 수입니다.
    자연수 x를 입력받아 x가 하샤드 수인지 아닌지 검사하는 함수, solution을 완성해주세요.*/

    // x를 복사한 변수 temp 로 , temp % 10 으로 일의 자릴수를 구하고 , temp * 0.1 곱해
    // temp가 1 보다 작으면 반복문을 깨고
    // x % temp 가 나머지가 있는지 확인해주세요.
    static boolean solution(int x) {
        int temp = 0;
        String strX = String.valueOf(x);
        for (int i = 0; i < strX.length(); i++) {
            temp += strX.charAt(i) - '0';
        }
        if (x%temp == 0) return true;
        else return false;
    }

    public static void main(String[] args) {
        System.out.println(solution(13));
    }
}
