package OddNums;
// 자연수 n이 매개변수로 주어집니다. n을 x로 나눈 나머지가 1이 되도록 하는 가장 작은 자연수 x를 return 하도록 solution 함수를 완성해주세요.
// 답이 항상 존재함은 증명될 수 있습니다.
// 1. x를 담을 변수와 가장 나머지를 담을 변수를 만든다.
// 2. x가 0이 될 때까지 -1을 빼주는 while을 만든다.
// 3. 각 순회에서 n을 x로 나눈 나머지를 비교하며 가장 작거나 가장 작는 나머지와 같은지 비교한다.
//      가장 작은 경우 0이 아니라면 answer에 x를 담고 가장작은 나머지를 담은 변수를 최신화해준다.
//      만약 아니라면 x만 1을 빼준다.
public class TestFive {
    static int solution(int n) {
        int x = n;
        int anser = -1;

        while (x > 0)
        {
            if (anser > 0)
            {
                anser = (n % x == 1)? x : anser;
            }else
            {
                anser = x;
            }

            x--;
        }

        return  anser;
    }

    //전 for으로 짧게 했어요

    public static void main(String[] args) {

    }
}
