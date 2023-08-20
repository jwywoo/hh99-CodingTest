package MarathonJwywoo;

public class Test25 {
    public long solution(int price, int money, int count) {
        long answer = money;
        long newP = (long) price;
        long newC = count;
        long total = 0;
        for (int i = 1; i <= newC; i++) {
            total += newP * i;
        }
        answer -= total;
        answer = (answer>0)?0:-answer;
        return answer;
    }
}
