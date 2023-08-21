package OddNums;

public class Test41 {
    public static String solution(int[] food) {
        String answer = "";

        // ArrayDeque을 이용 해서 음식을 추가 해준다.
        // 중간 지점인 물을 기준점으로 먼저 넣어준다.
        // food배열에서 큰 칼로리 부터 짝수 개수인 부분 까지만 양쪽에서 추가를 해준다.
        // ArrayDeque의 값들을 answer에 추가해준다.
        
        // 시작
        
        return answer;
    }
    public static void main(String[] args) {
        int[] food = {1, 3, 4, 6}; // "1223330333221"
//        int[] food = {1, 7, 1, 2}; // "111303111"

        System.out.println(solution(food));
    }
}
