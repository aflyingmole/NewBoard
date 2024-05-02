class Method {
    void doFunc() {
        System.out.println("doFunc() 호출");
    }

    void doFunc(int a) {
        System.out.println("doFunc(int a) 호출");
    }

    void doFunc(String s) {
        System.out.println("doFunc(String s) 호출");
    }

    void doFunc(String s, int a) {
        System.out.println("doFunc(String s, int a) 호출");
    }

    void doFunc(int a, String s) {
        System.out.println("doFunc(int a, String s) 호출");
    }
}

public class MethodMainEx02 {
    public static void main(String[] args) {
        Method m = new Method();
        m.doFunc();
        m.doFunc(1);
        m.doFunc("1");
        m.doFunc("1", 1);
        m.doFunc(1, "1");
    }
}
