package MarathonJwywoo;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;

public class Test24 {
    public static String solution(String s) {
        String answer = "";
        String[] sArray = s.split("");
        Arrays.sort(sArray, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.compareTo(o1);
            }
        });
        for (int i = 0; i < sArray.length;i++) {
            answer += sArray[i];
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution("Zbcdefg"));
    }
}
