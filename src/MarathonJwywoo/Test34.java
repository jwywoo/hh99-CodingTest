package MarathonJwywoo;

import java.util.*;

public class Test34 {
    public static int solution(int[][] sizes) {
        int finalMax = 0;
        int finalMin = 0;
        for (int i = 0; i < sizes.length; i++) {
            int maxVal = 0;
            int minVal = 0;
            if (sizes[i][0] > sizes[i][1]) {
                maxVal = sizes[i][0];
                minVal = sizes[i][1];
            } else {
                maxVal = sizes[i][1];
                minVal = sizes[i][0];
            }

            finalMax = Math.max(maxVal,finalMax);
            finalMin = Math.max(minVal,finalMin);
        }
        return finalMax*finalMin;
    }

    public static void main(String[] args) {
        int[][] temp = {{60,50}, {30,70}, {60,30}, {80,40}};
        solution(temp);
    }
}
