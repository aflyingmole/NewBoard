public class IntegerEx01 {
    /**
     * @param args
     */
    public static void main(String[] args) {
        // byte short int long 
        int i = 1;
        System.out.println(i);

        byte b = 1;
        short s = 1;
        // long l = 1;
        long l = 1L;

        // overflow
        // byte b1 = 256;
        // System.out.println(b1);

        // 진수
        int i2 = 0b1010;
        int i8 = 030;
        int i16 = 0xA4;

        System.out.println(i2);
        System.out.println(i8);
        System.out.println(i16);
        

        int i10 = 10;
        System.out.printf("8진수 : %o%n", i10);
        System.out.printf("16진수 : %x%n", i10);

        int i31 = 10000000;
        int i32 = 10_000_000;
        System.out.println(i31);
        System.out.println(i32);
    }
    
}
