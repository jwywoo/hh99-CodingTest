package OddNums;

public class Test37 {
    public static String[] solution(String[] strings, int n) {
        String[] answer = {};

        // answer 배열 문자열 배열의 크기로 초기화
        // LinkedHashMap을 이용해서 key값으로 문자열, value값으로 문자로 하여 나중에 value값으로 정렬을 하기위해 선언한다.
        // 먼저 사전순으로 정렬하기 위해 문자열배열을 오름차순 정렬해준다.
        // for-each문을 이용해 문자열배열의 값을 key값으로 넣어주고 value는 해당 문자열의 n인덱스 위치의 문자를 넣어준다.
        // list를 이용해 map을 list에 넣어 Collections.sort()를 이용해서 정렬 해준다.
        // 기존 map과 동일한 형태의 map을 선언하고 for-each를 이용해 정렬한 key-value값을 넣는다.
        // 정렬이 끝난 LinkedHashMap의 value값을 for-each를 이용해 answer에 넣어준다.

        // 시작

        return answer;
    }
    public static void main(String[] args) {
        String[] strings = {"sun", "bed", "car"}; int n = 1; // ["car", "bed", "sun"]
//        String[] numbers = {"abce", "abcd", "cdx"}; int n = 2; // ["abcd", "abce", "cdx"]

        System.out.println(solution(strings, n));
    }
}
