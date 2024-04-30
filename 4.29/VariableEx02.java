public class VariableEx02 {
    public static void main(String[] args) {
        // 두 변수의 값 바꾸기
        int x = 10;
        int y = 5;
        System.out.println("x="+x);
        System.out.println("y="+y);

        int tmp = x;
        x = y;
        y = tmp;
        System.out.println("x="+x);
        System.out.println("y="+y);
        
        int vNum = 10;

        System.out.println(vNum);
        vNum = 20;
        System.out.println(vNum);

        // 선언과 초기화 분리 가능
        final int C_NUM;
        C_NUM = 10;
        System.out.println(C_NUM);

        // C_NUM = 20;
        // System.out.println(C_NUM);
    }
    
}
