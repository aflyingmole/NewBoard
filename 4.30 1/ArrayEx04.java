public class ArrayEx04 {
    // args == program의 실행 옵션
    public static void main(String[] args) {
        System.out.println(args.length);

        for (int i = 0; i < args.length; i++) {
            System.out.println(args[i]);
        }
    }
}
