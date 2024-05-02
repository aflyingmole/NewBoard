class Method {
    void doFunc(String... args) {
        // args - 배열
        System.out.println(args.length);
        for (int i = 0; i < args.length; i++) {
            System.out.println(args[i]);
        }
    }
}

public class MethodMainEx03 {
    public static void main(String[] args) {
        Method m = new Method();
        m.doFunc("1");
        m.doFunc("1", "2");
        m.doFunc("1", "2", "3");
    }
}
