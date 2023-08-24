package WeeklyTest;

public class Test2 {
    public static String solution(int num){
        StringBuilder sb = new StringBuilder();
        int index = 1;
        int starCount = 1;
        int maxStar = 1;
        int spaceCount = 0;
        while (num > index) {
            maxStar+= 2;
            starCount+=2;
            index++;
        }

        while (starCount != 1) {
            sb.append(" ".repeat(spaceCount));
            sb.append("*".repeat(starCount));
            sb.append("\n");
            starCount-=2;
            spaceCount++;
        }
        while (starCount <= maxStar) {
            sb.append(" ".repeat(spaceCount));
            sb.append("*".repeat(starCount));
            sb.append("\n");
            starCount+=2;
            spaceCount--;
        }
        System.out.println(sb.toString());
        return sb.toString();
    }

    public static void main(String[] args) {
        solution(0);
        solution(5);
        solution(7);
    }
}
