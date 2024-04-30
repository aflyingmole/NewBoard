public class StringEx01 {
    public static void main(String[] args) {
        String str1 = "Hello World";
        System.out.println(str1);

        // 연산자 : +
        String str2 = "Hello" + " World";
        System.out.println(str2);

        // 다양한 출력 결과
        // 구형
        System.out.println("결과는 " + str2);
        // 신형
        System.out.printf("결과는 %s%n", str2);
        
    }
    
}
