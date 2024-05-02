class Variable {
    String instanceVariable;
    static String classVariable;

    void doFunc1() {
        System.out.println("doFunc1() 호출" + this);
        System.out.println(this.instanceVariable);
    }

    static void doFunc2() {
        System.out.println("doFunc2() 호출");
        System.out.println(Variable.classVariable);
    }
}

public class VariableEx02 {
    public static void main(String[] args) {
        Variable v1 = new Variable();
        Variable v2 = new Variable();

        v1.doFunc1();
        v2.doFunc1();

        v1.doFunc2();
        v2.doFunc2();
        Variable.doFunc2();

    }
}
