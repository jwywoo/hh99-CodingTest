package MarathonJwywoo;

public class Test33 {
    public static int solution(String t, String p) {
        int answer = 0;
        for (int i = 0; i <= t.length() - p.length(); i++) {
            int pLength = p.length();
            long pNum = Long.parseLong(p);
            long tNum = Long.parseLong(t.substring(i, i+pLength));
            if (tNum <= pNum) answer++;
        }
        return answer;
    }

    public static void main(String[] args) {
        String temp = "02";
        System.out.println(Integer.parseInt(temp));
        System.out.println(solution("500220839878","7"));
    }
}
