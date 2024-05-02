public class Ex6_2 {
    public static void main(String[] args) {
        Student s = new Student("홍길동", 1, 1, 100, 60, 76);

        String str = s.info();
        System.out.println(str);
    }
}

class Student {
    String name;
    int ban;
    int no;
    int kor;
    int eng;
    int math;

    Student(String na, int b, int n, int k, int e, int m) {
        name = na;
        ban = b;
        no = n;
        kor = k;
        eng = e;
        math = m;
    }

    String info() {
        int sum = kor + eng + math;
        int avg = sum / 3;
        return name + "," + ban + "," + no + "," + kor + "," + eng + "," + math + "," + sum + "," + avg;
    }

}
