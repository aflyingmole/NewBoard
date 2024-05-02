public class VariableEx03 {
    String instanceVariable = "홍길동";
    static String classVariable = "박문수";

    // void
    public static void main(String[] args) {
        // return 없음

        System.out.println(VariableEx03.classVariable);

        VariableEx03 v = new VariableEx03();
        System.out.println(v.instanceVariable);
    }
}
