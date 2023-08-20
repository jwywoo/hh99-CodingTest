package MarathonJwywoo;

public class Test32 {
    public static int solution(int[] number) {
        int answer = 0;
        for (int i = 0; i < number.length-3; i++) {
            for (int j = i+1; j < number.length-1; j++) {
                for (int k = j+1;k < number.length; k++) {
                    if (number[i]+number[j]+number[k] == 0) answer ++;
                }
            }
        }

        int temp = number[number.length- 3]+number[number.length-2]+number[number.length-1];
        if (temp == 0) answer++;
        return answer;
    }

    public static void main(String[] args) {
        int[] temp = {-2, 3, 0, 2, -5};
        solution(temp);
        int[] temp1 = {-3, -2, -1, 0, 1, 2, 3};
        solution(temp1);
        int[] temp2 = {-1, 1, -1, 1};
        solution(temp2);
    }
}
