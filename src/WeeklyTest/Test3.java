package WeeklyTest;

import java.util.*;

public class Test3 {
    public static String[] solution(String[] arr, int n) {
        Map<String, Integer> map = new HashMap<>();
        List<String> list = new ArrayList<>();
        for (String word: arr) {
            if (map.containsKey(word)) map.put(word, map.get(word)+1);
            else map.put(word, 1);
        }

        for (String word: map.keySet()) {
            if (map.get(word) == 1) list.add(word);
        }

        String[] answer = list.toArray(new String[0]);
        Arrays.sort(answer, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if (o1.charAt(n) == o2.charAt(n)) {
                    return o1.compareTo(o2);
                }
                return o1.charAt(n) - o2.charAt(n);
            }
        });
        return answer;
    }

    public static void main(String[] args) {
        solution(new String[]{"brush", "sun", "brush", "bed", "car"}, 1);
        solution(new String[]{"banana", "cat", "car", "apple", "banana", "banana"}, 0);
        solution(new String[]{"coke", "water", "glass", "dog", "dog", "yogurt", "vitamin"}, 2);
    }
}
