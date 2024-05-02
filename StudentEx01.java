class Student {
    String hakbun;
    String name;

    // 생성자 오버로딩
    // 다양한 멤버필드 초기화
    Student() {
        this.hakbun = "0000";
        this.name = "아무개";
    }

    Student(String name) {
        this.hakbun = "0000";
        this.name = name;
    }

    Student(String hakbun, String name) {
        this.hakbun = hakbun;
        this.name = name;
    }

    void showStudent() {
        System.out.printf("%s\t%s\n", this.hakbun, this.name);
    }
}

public class StudentEx01 {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.showStudent();

        Student s2 = new Student("홍길동");
        s2.showStudent();

        Student s3 = new Student("0001", "홍길동");
        s3.showStudent();

    }

}