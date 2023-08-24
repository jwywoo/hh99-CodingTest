package EvenNumSol;

public class Test42 {
    public static int solution(int a, int b, int n) {
        int answer = 0;

        while (n >= a) {
            int leftOver = n%a;
            int received = n/a*b;
            answer += received;
            n = leftOver + received;
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(2, 1, 20));
        System.out.println(solution(3, 1, 20));
    }
}
