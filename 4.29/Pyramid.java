import java.util.Scanner;

public class Pyramid {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("몇 층의 피라미드");
    int num = scanner.nextInt();
    for (int i = 0; i < num; i++) {
      for (int j = 1; j < num - i; j++) {
        System.out.print(" ");
      }
      for (int k = 0; k < (i * 2) + 1; k++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }
}
