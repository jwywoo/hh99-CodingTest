package EvenNumSol;

import java.lang.reflect.Array;
import java.util.*;

public class Test46 {
    public static int solution(int k, int m, int[] score) {
        int answer = 0;
//        Map<Integer, Integer> appleMap = new HashMap<>();
//        for (int i = 0; i <score.length; i++) {
//            if (appleMap.containsKey(score[i])) appleMap.put(score[i],appleMap.get(score[i])+1);
//            else appleMap.put(score[i],1);
//        }
//        System.out.println("");
        Arrays.sort(score);
        for (int i = 0; i < (score.length/2); i++) {
            int temp = score[i];
            score[i] = score[score.length-i-1];
            score[score.length-i-1] = temp;
        }

        int index = 0;
        while (m <= score.length - index) {
            int minPrice = k;
            for (int i = 0; i < m; i++) {
                if (score[index] < minPrice) minPrice = score[index];
                index++;
            }
            answer += minPrice*m;
        }

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(3,4,new int[]{1, 2, 3, 1, 2, 3, 1}));
        System.out.println(solution(4,3, new int[]{4, 1, 2, 2, 4, 4, 4, 4, 1, 2, 4, 2}));
    }
}
