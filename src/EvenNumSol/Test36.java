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
public class Test36 {

    public static String[] valueReturn(Map<String, String[]> map, String s, String letter, int index) {
        String[] result = {"", ""};
        String[] numStr = map.get(letter);
        for (int i = 0; i < numStr.length; i++) {
            String curWord = numStr[i];
            if (s.substring(index, curWord.length() + index).equals(curWord)) {
                result[0] = curWord;
                // length
                result[1] = "" + (curWord.length() + index);
                break;
            }
        }
        return result;
    }

    public static int solution(String s) {
        int answer = 0;
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
        String result = "";
        for (int i = 0; i < s.length(); i++) {
            int curValue;
            String curLetter = s.substring(index, index + 1);
            try {
                // When it's curLetternumber
                curValue = Integer.parseInt(curLetter);
                result += curLetter;
                index++;
            } catch (Exception e) {
                // When it's not a number
                String[] tempResult = valueReturn(mapAlpha, s, curLetter, index);
                index = Integer.parseInt(tempResult[1]);
                result += mapValue.get(tempResult[0]);
            }
            if (index == s.length()) break;
        }
        System.out.println(result);
        return answer;
    }

    public static void main(String[] args) {
        solution("23four5six7");
        solution("2three45sixseven");
        solution("123");
    }
}
