package EvenNumSol;

import java.util.*;

public class Test44 {
    public static String solution(int a, int b) {
        HashMap<Integer, String> weekMap = new HashMap<>();
        String[] days = new String[]{"SUN","MON","TUE","WED","THU","FRI","SAT"};
        for (int i = 1; i <= days.length; i++) {
            weekMap.put(i, days[i-1]);
        }
        return weekMap.get(new GregorianCalendar(2016,a-1,b).get(Calendar.DAY_OF_WEEK));
    }

    public static void main(String[] args) {
        System.out.println(solution(5,24));
    }
}
