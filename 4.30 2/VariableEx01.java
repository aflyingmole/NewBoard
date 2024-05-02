class Variable {
    // 인스턴스 멤버변수(필드)
    // 자동 초기화
    // String - 객체 - 초기값 null
    String data1;
    // int - 0
    int data2;
    // char - ''
    char data3;

    void printVariable() {
        System.out.println(data1);
        System.out.println(data2);
        System.out.println(data3);

        // 지역변수 => 초기화해야 사용가능
        int data4;
        // System.out.println(data4);
    }
}

public class VariableEx01 {
    public static void main(String[] args) {
        Variable v = new Variable();
        v.printVariable();
    }
}