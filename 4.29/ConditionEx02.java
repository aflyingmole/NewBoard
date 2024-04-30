import java.util.Scanner;

public class ConditionEx02 {
    public static void main(String[] args) {
        // switch ~ case
        int score = 0;
        char grade = ' ';

        System.out.print("점수를 입력하세요.>");
        Scanner scanner = new Scanner(System.in);
        score = scanner.nextInt();

        switch (score / 10) {
            case 9:
                System.out.println("A");
                break;

            case 8:
                System.out.println("B");
                break;

            case 7:
                System.out.println("C");
                break;

            case 6:
                System.out.println("D");
                break;

            default:
                System.out.println("F");
        }
    }
}
