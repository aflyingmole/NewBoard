class Variable {
    // 인스턴스 멤버필드
    String data1 = "data1";

    void printVariable() {
        // 지역변수
        String data2 = "data2";
        {
            // 지역변수
            String data3 = "data3";

            System.out.println(data1);
            System.out.println(data2);
            System.out.println(data3);

            String data1 = "data11";
            // String data2 = "data21";

            System.out.println(data1);
            // this - 자기 참조
            System.out.println(this.data1);
        }
    }
}

public class VariableEx02 {
    public static void main(String[] args) {
        Variable v = new Variable();
        v.printVariable();
    }
}