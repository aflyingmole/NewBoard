// 사용자 정의 class
class Student {
    String hakbun;
    String name;
    int age;
    double height;
    double weight;
}


public class StudentMainEx01 {
    public static void main(String[] args) {
        // 객체 변수
        Student stu1;

        // Student 형 메모리(객체) 생성
        stu1 = new Student();

        // 초기화
        stu1.hakbun = "1001";
        stu1.name = "홍길동";
        stu1.age = 20;
        stu1.height = 180.5; 
        stu1.weight = 80.0;


        System.out.println(stu1.hakbun);
        System.out.println(stu1.name);
        System.out.println(stu1);

        // Student@2f92e0f4 // 자료형@참조주소;
        
        // 참조 변수의 선언 / 생성
        Student stu2 = new Student();
        stu2.hakbun = "1002";
        stu2.name = "박문수";
        stu2.age = 22;
        stu2.height = 170; 
        stu2.weight = 75;
        System.out.println(stu2);
        System.out.println(stu1.hakbun);
        System.out.println(stu2.hakbun);



        }
    }


    
    