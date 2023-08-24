package EvenNumSol;
import java.util.*;
public class Test48 {
    public static int checker(int given) {
        for (int i = 2; i < given; i++) {
            if (given%i == 0) return 0;
        }
        return 1;
    }
    public static int solution(int[] nums) {
        int answer = 0;
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                for (int k = j+1; k < nums.length; k++) {
                    int temp  = nums[i] + nums[j] + nums[k];
                    answer += checker(temp);
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {

    }
}
