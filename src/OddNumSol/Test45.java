package OddNumSol;

import java.util.*;

public class Test45 {
    public static int checker(String word, List<String> list) {
        if (list.get(0).equals(word)) {
            list.remove(0);
            return 1;
        } else {
            return -1;
        }
    }
    public static String solution(String[] cards1, String[] cards2, String[] goal) {
        String answer = "Yes";
        List<String> cardOneList = new ArrayList<>(Arrays.asList(cards1));
        List<String> cardTwoList = new ArrayList<>(Arrays.asList(cards2));
        for (String curWord: goal) {
            int temp = 0;
            temp +=(cardOneList.size() != 0)?checker(curWord, cardOneList): -1;
            temp +=(cardTwoList.size() != 0)?checker(curWord, cardTwoList): -1;
            if (cardOneList.size() == 0 && cardTwoList.size() == 0) break;
            if (temp < -1) {
                answer = "No";
                break;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        solution(new String[]{"i", "drink", "water"}, new String[]{"want", "to"}, new String[]{"i", "want", "to", "drink", "water"});
        solution(new String[]{"i", "water", "drink"}, new String[]{"want", "to"}, new String[]{"i", "want", "to", "drink", "water"});
    }
}
