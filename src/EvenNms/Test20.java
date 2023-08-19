package EvenNms;
// 문제 설명
//단어 s의 가운데 글자를 반환하는 함수, solution을 만들어 보세요. 단어의 길이가 짝수라면 가운데 두글자를 반환하면 됩니다.
//
//재한사항
//s는 길이가 1 이상, 100이하인 스트링입니다.
// 1. 짝수 홀수를 구분하는 if statement 를 만들고 홀짝에 맞춰 answer에 추가한다
//      짝수일 경우 substring의 endIndex를 길이의 절반 더하기 1 beginIndex 길이의 절반 빼기 1
//      홀수의 경욱 beginIndex는 길이의 절반 endIndex 길이의 절반 더하기 1
public class Test20 {
    static String solution(String s) {

        int Bindex = -1;
        int Eindex = -1;

        if (s.length() % 2 == 0)
        {
            Bindex = (s.length() / 2) - 1;
            Eindex = (s.length() / 2) + 1;
        }else
        {
            Bindex = (s.length() / 2);
            Eindex = (s.length() / 2) + 1;//

        }

        return  s.substring(Bindex, Eindex);
    }

    public static void main(String[] args) {
        ;
        System.out.println(solution("qwera"));
    }
}
