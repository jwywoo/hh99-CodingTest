package MarathonJwywoo;

import java.lang.reflect.Array;
import java.util.HashSet;
import java.util.Set;

// 문자열 s의 길이가 4 혹은 6이고, 숫자로만 구성돼있는지 확인해주는 함수, solution을 완성하세요. 예를 들어 s가 "a234"이면 False를 리턴하고 "1234"라면 True를 리턴하면 됩니다.
public class Test26 {
    public static boolean solution(String s) {
        boolean answer = false;
        String[] sList = s.split("");
        if (s.length() == 4 || s.length() == 6) {
            for (int i = 0; i < sList.length; i++) {
                try {
                    Integer.parseInt(sList[i]);
                    answer = true;
                } catch (Exception e) {
                    answer = false;
                    break;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution("a123"));
    }
}
