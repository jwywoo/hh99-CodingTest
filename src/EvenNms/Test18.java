package EvenNms;
//0부터 9까지의 숫자 중 일부가 들어있는 정수 배열 numbers가 매개변수로 주어집니다. numbers에서 찾을 수 없는 0부터 9까지의 숫자를 모두 찾아 더한 수를 return 하도록 solution 함수를 완성해주세요.
//
//제한사항
//1 ≤ numbers의 길이 ≤ 9
//0 ≤ numbers의 모든 원소 ≤ 9
//numbers의 모든 원소는 서로 다릅니다.
// 1. HashMap을 활용해서 <Integer, Integer>를 이용해 0에서 9까지의 Map을 만든 다음
// 2. HashMap에 numbers의 숫자를 key로 사용하여 사용여부를 파악한다.
// 3. 마지막으로 keySet을 이용하여 순회하면서 사용되지 않은 숫자들을 answer에 더한다
public class Test18 {
    static int solution(int[] numbers) {
        int answer = -1;
        return answer;
    }

    public static void main(String[] args) {

    }
}
