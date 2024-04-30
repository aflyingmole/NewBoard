public class TypeEx01 {
    public static void main(String[] args) {
        // 형변환
        // 값이 아닌 자료형
       
        
        // 작은 자료형 -> 큰 자료형(자동 형변환)
        short s1 = 10;
        int i1 = s1;
        System.out.println(i1);

        // 큰 자료형 -> 작은 자료형(강제 형변환)
        int i2 = 10;
        short s2 = (short)i2;
        System.out.println(s2);

        // 문자 - 정수 <=코드
        char c1 = 'A';
        int i3 = c1;
        System.out.println(c1);
        System.out.println(i3);
        System.out.println((char)i3);
    }
}
