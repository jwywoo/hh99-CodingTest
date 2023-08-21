package EvenNms;

import java.util.Map;
import java.util.TreeMap;

//네오와 프로도가 숫자놀이를 하고 있습니다. 네오가 프로도에게 숫자를 건넬 때 일부 자릿수를 영단어로 바꾼 카드를 건네주면 프로도는 원래 숫자를 찾는 게임입니다.
//
//다음은 숫자의 일부 자릿수를 영단어로 바꾸는 예시입니다.
//
//1478 → "one4seveneight"
//234567 → "23four5six7"
//10203 → "1zerotwozero3"
//이렇게 숫자의 일부 자릿수가 영단어로 바뀌어졌거나, 혹은 바뀌지 않고 그대로인 문자열 s가 매개변수로 주어집니다. s가 의미하는 원래 숫자를 return 하도록 solution 함수를 완성해주세요.
//
//참고로 각 숫자에 대응되는 영단어는 다음 표와 같습니다.
// 1. 영문 숫자를 키 숫자를 값으로한 Map 을반든다
// 2. 영문 숫자의 첫글자를 키로 하고 첫글자에 해당하는 숫자들을 배열로 만들어 키의 값으로 만든다.
// 3. 주어진 s를 순회하면서 try catch를 활용해 숫자로 표현할 수 있음 넘어가고 없으면 처리해준다.
//      만약 try에서 표현이 가능하면 index는 1만 증가한다.
// 4. (서택사항) 처리하는 함수를 만들고 map, s, letter, index를 Parameters로 설정한다.
//    먼저 letter로 해당하는 배열을 가져오고 그다음 s.substring을 활용해 순회하는 단어와 일치하는지 확인한다.
//    index는 현재의 위치다 (i를 사용하지 않는 이유 아시죠?)
//    일치할 경우 새로운 index(일치하는 단어의 길이와 이전 index의 합)과 단어를 반환한다.
// 5. 반환된 값을 이용해 해당하는 string형 숫자를 answer에 추가하고 index를 최신화한다.
// 6. 순회를 하면서 index가 s.length와 일치하면 try catch문 밖에서 break를 시전한다.
// 이문제는 너무 복잡하게 제가 했으니 만약 조금이라도 더 좋은 방법이 생각나시면 그 방법이 옳다고 생각합니다.
// 코드 리뷰 때 알려주세요!!
public class Test36 {
    public static int solution(String s) {
        StringBuilder answer = new StringBuilder();

        // 문자열 s를 순회
        for (int i = 0; i < s.length(); i++) {
            // 문자 하나를 확인하여 정규식을 통해 숫자인지 체크
            if (s.substring(i, i+1).matches("\\d")) {
                answer.append(s, i, i+1); // 숫자일시 answer에 추가
            } else { // 문자일 경우
                // 문자열 2자리 까지 확인하여 switch-case사용하여 answer추가
                // 해당 문자의 남은 글자 수 만큼 인덱스 추가
                switch (s.substring(i, i+2)) {
                    case "ze" : answer.append("0"); i = i + 3; break;
                    case "on" : answer.append("1"); i = i + 2; break;
                    case "tw" : answer.append("2"); i = i + 2; break;
                    case "th" : answer.append("3"); i = i + 4; break;
                    case "fo" : answer.append("4"); i = i + 3; break;
                    case "fi" : answer.append("5"); i = i + 3; break;
                    case "si" : answer.append("6"); i = i + 2; break;
                    case "se" : answer.append("7"); i = i + 4; break;
                    case "ei" : answer.append("8"); i = i + 4; break;
                    case "ni" : answer.append("9"); i = i + 3; break;
                }
            }
        }

        return Integer.parseInt(answer.toString());
    }

    public static void main(String[] args) {
        String s = "one4seveneight"; // 1478
//        String s = "23four5six7"; // 234567
//        String s = "2three45sixseven"; // 234567
//        String s = "123"; // 123

        System.out.println(solution(s));
    }
}