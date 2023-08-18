package EvenNms;

public class tes8 {
    //문자열 s를 숫자로 변환한 결과를 반환하는 함수, solution을 완성하세요.
    /*
    s의 길이는 1 이상 5이하입니다.
    s의 맨앞에는 부호(+, -)가 올 수 있습니다.
    s는 부호와 숫자로만 이루어져있습니다.
    s는 "0"으로 시작하지 않습니다.
    */

    // parseInt으로 변환 하거나

    //값을 char배열로 만들어 맨앞요소로 분기문으로 나누고
    //아스키 코드를 이용해 숫자로 변환해주세요.
    public int solution(String s) {
        int answer = Integer.parseInt(s);
        return answer;
    }
}
