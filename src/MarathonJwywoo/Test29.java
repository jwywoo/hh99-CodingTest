package MarathonJwywoo;

public class Test29 {
    public int gcd(int n, int m) {
        return (m==0)?n:gcd(m, n%m);
    }
    public int[] solution(int n, int m) {
        int greatestCommonDivisor = gcd(n,m);
        int leastCommonMultiple = m*n/greatestCommonDivisor;
        int[] answer = {greatestCommonDivisor, leastCommonMultiple};
        return answer;
    }
}
