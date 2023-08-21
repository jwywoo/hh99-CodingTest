package MarathonJwywoo;

public class Test21 {
    public static String solution(int n) {
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= n; i++) {
            sb.append((i%2==0)?"박":"수");
        }
        return sb.toString();
    }
}
