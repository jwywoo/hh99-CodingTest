package EvenNumSol;

import java.util.Map;
import java.util.TreeMap;

//네오와 프로도가 숫자놀이를 하고 있습니다. 네오가 프로도에게 숫자를 건넬 때 일부 자릿수를 영단어로 바꾼 카드를 건네주면 프로도는 원래 숫자를 찾는 게임입니다.
//
//다음은 숫자의 일부 자릿수를 영단어로 바꾸는 예시입니다.
//1478 → "one4seveneight"
//10203 → "1zerotwozero3"
//이렇게 숫자의 일부 자릿수가 영단어로 바뀌어졌거나, 혹은 바뀌지 않고 그대로인 문자열 s가 매개변수로 주어집니다. s가 의미하는 원래 숫자를 return 하도록 solution 함수를 완성해주세요.
//
//참고로 각 숫자에 대응되는 영단어는 다음 표와 같습니다.
public class Test36 {

    public static String[] valueReturn(Map<String, String[]> map, String s, String letter, int index) {
        String[] result = {"", ""};
        String[] numStr = map.get(letter);
        for (String curWord : numStr) {
            if (s.startsWith(curWord, index)) {
                result[0] = curWord;
                // length
                result[1] = String.valueOf(curWord.length() + index);
                break;
            }
        }
        return result;
    }

    public static int solution(String s) {
        // TreeMap
        Map<String, String> mapValue = new TreeMap<>();
        mapValue.put("zero", "0");
        mapValue.put("one", "1");
        mapValue.put("two", "2");
        mapValue.put("three", "3");
        mapValue.put("four", "4");
        mapValue.put("five", "5");
        mapValue.put("six", "6");
        mapValue.put("seven", "7");
        mapValue.put("eight", "8");
        mapValue.put("nine", "9");

        // HashMap or TreeMap
        Map<String, String[]> mapAlpha = new TreeMap<>();
        // z
        String[] temp0 = {"zero"};
        mapAlpha.put("z", temp0);
        // o
        String[] temp = {"one"};
        mapAlpha.put("o", temp);
        // t
        String[] temp1 = {"two", "three"};
        mapAlpha.put("t", temp1);
        // f
        String[] temp2 = {"four", "five"};
        mapAlpha.put("f", temp2);
        // s
        String[] temp3 = {"six", "seven"};
        mapAlpha.put("s", temp3);
        // e
        String[] temp4 = {"eight"};
        mapAlpha.put("e", temp4);
        // n
        String[] temp5 = {"nine"};
        mapAlpha.put("n", temp5);

        int index = 0;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {

            String curLetter = s.substring(index, index + 1);
            try {
                // When it's curLetternumber
                Integer.parseInt(curLetter);
                sb.append(curLetter);
                index++;
            } catch (Exception e) {
                // When it's not a number
                String[] tempResult = valueReturn(mapAlpha, s, curLetter, index);
                index = Integer.parseInt(tempResult[1]);
                sb.append(mapValue.get(tempResult[0]));
            }
            if (index == s.length()) break;
        }
        return Integer.parseInt(sb.toString());
    }

    public static void main(String[] args) {
        System.out.println(solution("23four5six7"));
        solution("2three45sixseven");
        solution("123");
    }
}
