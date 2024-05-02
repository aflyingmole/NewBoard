class Constructor {
    String name;

    // 생성자 오버로딩 - 생성자 간의 호출
    Constructor() {
        this.name = "박문수";
    }

    Constructor(String name) {
        this.name = name;
    }
}

public class ConstructorEx02 {
    public static void main(String[] args) {
        // 데이터를 가지고 초기화 하고 싶은 경우
        Constructor c1 = new Constructor("홍길동");
        Constructor c2 = new Constructor("박문수");

        System.out.println(c1.name);
        System.out.println(c2.name);

    }
}
