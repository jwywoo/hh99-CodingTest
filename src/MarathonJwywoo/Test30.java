package MarathonJwywoo;

public class Test30 {
    public static int solution(int n) {
        StringBuilder sb = new StringBuilder();
        while (n != 0) {
            sb.append(n % 3);
            n /= 3;
        }
//        for (int i = 0; i < sb.length(); i++) {
//            double power = Math.pow(3, sb.length() - i - 1);
//            answer += power * (sb.charAt(i) - '0');
//        }
//        String reversed = new StringBuilder(sb.toString()).reverse().toString();
        return Integer.parseInt(sb.toString(), 3);
    }

    public static void main(String[] args) {
        System.out.println(solution(125));
    }
}
