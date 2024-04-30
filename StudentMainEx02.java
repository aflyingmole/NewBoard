class Student {
    String hakbun;
    String name;
    int age;
    double height;
    double weight;
}


public class StudentMainEx02 {
    public static void main(String[] args) {
        int i1 = 10;
        int i2 = i1;
        System.out.println(i1);
        System.out.println(i2);
        
        i2 = 20;
        System.out.println(i1);
        System.out.println(i2);
        
        Student stu1 = new Student();

        stu1.hakbun = "1001";
        stu1.name = "홍길동";
        stu1.age = 20;
        stu1.height = 180.5; 
        stu1.weight = 80.0;

        Student stu2 = stu1;
        System.out.println(stu1.name);
        System.out.println(stu2.name);

        System.out.println(stu1);
        System.out.println(stu2);

        stu2.name = "박문수";
        System.out.println(stu1.name);
        System.out.println(stu2.name);

       
        }
    }


    
    