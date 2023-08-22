package MarathonJwywoo;

public class Test35 {
    public static char converter(char c, int n) {
        if (c == ' ') {
            return ' ';
        } else {
            int index = c;
            if (index >= 65 && index <= 90) {
                int newIndex = index + n;
                return (newIndex>90)?(char) (newIndex-26):(char) newIndex;
            } else {
                int newIndex = index + n;
                return (newIndex>122)?(char) (newIndex-26):(char) newIndex;
            }
        }
    }
    public static String solution(String s, int n) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            sb.append(converter(s.charAt(i), n));
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println((int) 'a');
        solution("AB", 1);
        solution("z", 1);
        solution("a B z", 4);
    }

}
