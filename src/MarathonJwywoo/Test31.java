package MarathonJwywoo;

public class Test31 {
    public static char converter(int index, char given) {
        if (index % 2 == 1) {
            // Nope
            // cap > small
            if ((int) given <= 90) {
                return (char) (given + 32);
            } else {
                return given;
            }
        } else {
            // Capital
            // cap
            if ((int) given > 90) {
                return (char) (given - 32);
            } else {
                return given;
            }
        }
    }

    public static String solution(String s) {
        StringBuilder sb = new StringBuilder();
        int index = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                index = 0;
                sb.append(" ");
                continue;
            }
            sb.append(converter(index, s.charAt(i)));
            index++;
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println((int) 'a');
        System.out.println(0 % 2);
        System.out.println(solution("ZZZ "));
    }
}
