class Variable {
    // 인스턴스 멤버필드 / 클래스 멤버필드
    String instanceVariable;
    static String classVariable;
}

public class VariableEx01 {
    public static void main(String[] args) {
        Variable v1 = new Variable();
        Variable v2 = new Variable();

        v1.instanceVariable = "10";
        v2.instanceVariable = "20";

        System.out.println(v1.instanceVariable);
        System.out.println(v2.instanceVariable);

        // v1, v2 간의 데이터 공유
        v1.classVariable = "10";
        System.out.println(v1.classVariable);
        System.out.println(v2.classVariable);

        v2.classVariable = "20";
        System.out.println(v1.classVariable);
        System.out.println(v2.classVariable);

        System.out.println(Variable.classVariable);

    }
}
