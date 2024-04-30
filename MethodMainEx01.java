class Method {
    // 메서드 선언
    // 반환형식 메서드명() {}

    void doFunc1() {
        // 지역 변수
        // 제어문
        System.out.println("doFunc1() 호출");

        // 반드시 초기화해야 사용가능
        int data = 0;
        System.out.println("doFunc1() 호출 : " + data);
    }

    void doFunc2(int data1, int data2) {
        System.out.println("doFunc2() 호출 : " + data1);
        System.out.println("doFunc2() 호출 : " + data2);
    }

    // void - 리턴이 없음
    int doFunc3(int data1, int data2) {
        int sum = data1 + data2;
        return sum;
    }
}

public class MethodMainEx01 {
    public static void main(String[] args) {
        Method m = new Method();
        m.doFunc1();
        m.doFunc2(10, 20);
    }
}
