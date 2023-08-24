package WeeklyTest;

//설명)행렬이 두개 있습니다.
//두 행렬의 절댓값을 차례대로 담은 정수 배열 arr1, arr2와 행렬의 부호를 차례대로 담은 불리언 배열 signs가 매개변수로 주어집니다.
// 두 행렬의 부호는 같습니다.
//실제 행렬 덧셈의 결과를 반환하는 함수, solution을 완성해주세요.
// [[1,2],[2,3]] [[3,4],[5,6]] [[true,true],[true,false]]  -> [[4,6],[7,-9]]
public class Test1 {
    public static int[][] solution(int[][] arr1, int[][] arr2, boolean[][] signs) {
        int[][] answer = new int[signs.length][signs[0].length];
        for (int i = 0; i < answer.length; i++) {
            for (int j = 0; j < answer[i].length; j++) {
                if (signs[i][j]) {
                    answer[i][j] = arr1[i][j] + arr2[i][j];
                } else {
                    answer[i][j] = (-1 * arr1[i][j]) + (-1 * arr2[i][j]);
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        solution(new int[][]{{1, 2}, {2, 3}}, new int[][]{{3, 4}, {5, 6}}, new boolean[][]{{true, true}, {true, false}});
        solution(new int[][]{{1}, {2}}, new int[][]{{3}, {4}}, new boolean[][]{{false}, {false}});
        solution(new int[][]{{5, 7, 1}, {2, 3, 5}}, new int[][]{{5, 1, 6}, {7, 5, 6}}, new boolean[][]{{true, true, false}, {false, true, false}});
    }
}
