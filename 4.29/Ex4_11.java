public class Ex4_11 {
    public static void main(String[] args) {

        for (int i = 1; i <= 10; i++) {
            char a = 65;
            for (int j = 1; j <= i; j++) {
                System.out.print(a);
                a++;
            }
            System.out.println();
         }
    }
}
