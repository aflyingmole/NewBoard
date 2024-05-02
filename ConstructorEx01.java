class Constructor {
    String name;

    // 기본 생성자
    // Constructor() {}
    Constructor() {
        System.out.println("생성자 호출");
        this.name = "박문수";
    }
}

public class ConstructorEx01 {
    public static void main(String[] args) {
        Constructor c = new Constructor();
        System.out.println(c);

        // 초기화
        // c.name = "홍길동";
        System.out.println(c.name);
    }
}
