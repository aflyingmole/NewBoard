class Variable {
    String instanceVariable;
    static String classVariable;

    void printVariable1() {
        System.out.println("printVariable1() 호출");
    }

    static void printVariable2() {
        System.out.println("printVariable2() 호출");
    }
}

public class VariableEx04 {
    public static void main(String[] args) {
        Variable v1 = new Variable();
        Variable v2 = new Variable();

        v1.instanceVariable = "10";
        System.out.println(v1.instanceVariable);
        v2.instanceVariable = "20";
        System.out.println(v2.instanceVariable);

        v1.classVariable = "10";
        // System.out.println(v1.classVariable);
        // System.out.println(v2.classVariable);

        // 클래스간의 데이터 공유
        System.out.println(Variable.classVariable);

        v1.printVariable1();
        Variable.printVariable2();

    }

}
