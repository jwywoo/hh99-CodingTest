package MarathonJwywoo;

public class Test30 {
    public static int solution(int n) {
        int answer = 0;
        String temp = "";
        while (n != 0) {
            temp += (n%3);
            n /= 3;
        }
        for (int i = 0; i < temp.length(); i++) {
            double power = Math.pow(3, temp.length() - i - 1);
            answer += power*(temp.charAt(i)-'0');
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(125));
    }
}
