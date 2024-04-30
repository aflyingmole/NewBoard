import java.util.Scanner;

public class Gugudan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("단수를 입력하세요");
        int n = scanner.nextInt();

        System.out.println(n + "단을 입력하셨습니다");
        for (int i = 1; i<=9; i++){
            System.out.println(n + "*" + i + "=" + n * i);
        }
    }
}
