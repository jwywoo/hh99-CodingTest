package MarathonJwywoo;

public class Test21 {
    public static String solution(int n) {
        String answer = "";
        for (int i = 1; i <= n; i++) {
            answer += (i%2==0)?"박":"수";
        }
        return answer;
    }
}
