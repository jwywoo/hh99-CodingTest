package MarathonJwywoo;
// 두 정수 left와 right가 매개변수로 주어집니다. left부터 right까지의 모든 수들 중에서, 약수의 개수가 짝수인 수는 더하고, 약수의 개수가 홀수인 수는 뺀 수를 return 하도록 solution 함수를 완성해주세요.
public class Test23 {

    public int divisor(int num) {
        int result = 0;
        for (int i = 1; i <= num; i++) {
            result += (num%i == 0)?1:0;
        }
        return result;
    }
    public int solution(int left, int right) {
        int answer = 0;
        for (int i = left; i <= right;i++){
            answer += (divisor(i)%2==0)?i:-i;
        }
        return answer;
    }
}
