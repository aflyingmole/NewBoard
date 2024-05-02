class Student {
    String hakbun;
    String name;

    Student() {
        // this.hakbun = "0000";
        // this.name = "아무개";
        this("0000", "아무개");
    }

    Student(String name) {
        // this.hakbun = "0000";
        // this.name = name;
        this("0000", name);
    }

    Student(String hakbun, String name) {
        this.hakbun = hakbun;
        this.name = name;
    }

    void showStudent() {
        System.out.printf("%s\t%s\n", this.hakbun, this.name);
    }
}

public class StudentEx02 {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.showStudent();

        Student s2 = new Student("홍길동");
        s2.showStudent();

        Student s3 = new Student("0001", "홍길동");
        s3.showStudent();
    }
}