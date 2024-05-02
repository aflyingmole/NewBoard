class Constructor {
    String name;

    Constructor() {
        this.name = "박문수";
        System.out.println("default 생성자 호출");
    }

    Constructor(String name) {
        this();
        this.name = name;
    }
}

public class ConstructorEx03 {
    public static void main(String[] args) {
        Constructor c = new Constructor("홍길동");

    }
}
