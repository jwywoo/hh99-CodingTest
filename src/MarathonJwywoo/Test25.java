package MarathonJwywoo;

public class Test25 {
    public long solution(int price, int money, int count) {
        long answer = money;
        long total = 0;
        for (int i = 1; i <= count; i++) {
            total += (long) price * i;
        }
        answer -= total;
        return (answer>0)?0:-answer;
    }
}
