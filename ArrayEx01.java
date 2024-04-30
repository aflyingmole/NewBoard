public class ArrayEx01 {
    public static void main(String[] args) {
        // 배열
        // 선언 . 생성 / 초기화, 사용

        // 선언
        int[] arr1 = null;
        int arr2[];
        System.out.println(arr1);

        // 메모리 생성
        arr1 = new int[5];
        System.out.println(arr1);

        // 선언 + 생성
        int[] arr3 = new int[5];
        arr1[0] = 10;
        arr1[1] = 20;
        arr1[2] = 30;
        arr1[3] = 40;
        System.out.println(arr1[0]);

    }
}
