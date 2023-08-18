package EvenNms;
import java.util.*;

public class tes10 {
    //함수 solution은 정수 n을 매개변수로 입력받습니다. n의 각 자릿수를 큰것부터 작은 순으로 정렬한 새로운 정수를 리턴해주세요.
    // 예를들어 n이 118372면 873211을 리턴하면 됩니다.
    //  n은 1이상 8000000000 이하인 자연수입니다.

    // 먼저 스트링으로 바꾸고 char배열로 바꾼다음
    // 반복문으로 역순으로 실행하는데 , 변수를 내림차순용 (i) 이랑 오름차순용 (j) 으로 초기화시키고
    // i 로 char배열에서 값을 가져오고 , 가져온값에 10 ^ j를 곱한 값을 더해주세요.
    static long solution(long n) {
        String strN = String.valueOf(n);
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < strN.length(); i++) {
            Integer num = strN.charAt(i) -'0';
            if (hashMap.containsKey(num)) hashMap.put(num,hashMap.get(num) + 1);
            else hashMap.put(num,1);
        }

        SortedSet<Integer> order = new TreeSet<>(Collections.reverseOrder());
        order.addAll(hashMap.keySet());
        String result = "";
        for (Integer num:order) {
            for (int i = 0; i < hashMap.get(num); i++) {
                result += num;
            }
        }

        return Long.parseLong(result);
    }

    public static void main(String[] args) {
        solution(118372);
    }
}
