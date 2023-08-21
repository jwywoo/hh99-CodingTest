package MarathonJwywoo;

public class Test25 {
    public long solution(int price, int money, int count) {
        long answer = money;
        long newP = price;
        long total = 0;
        for (int i = 1; i <= count; i++) {
            total += newP * i;
        }
        answer -= total;
        answer = (answer>0)?0:-answer;
        return answer;
    }
}
