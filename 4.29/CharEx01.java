public class CharEx01 {
    public static void main(String[] args) {
        char c1 = 'A';
        System.out.println(c1);

        char c2 = '한';
        System.out.println(c2);

        // 문자(영문자, 숫자, 특수기호) -> 코드(ASCII)
        char c3 = 97;
        System.out.println(c3);
        
        // 문자(다국어) - > 코드(유니코드)
        char c4 = '\uC790';
        System.out.println(c4);
    }
    
}
