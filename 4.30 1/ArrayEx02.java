public class ArrayEx02 {
    public static void main(String[] args) {
        // 선언, 생성, 초기화
        int[] arr1 = new int[] { 10, 20, 30, 40, 50 };
        int[] arr2 = { 10, 20, 30, 40, 50 };

        // System.out.println(arr1[0]);
        // System.out.println(arr2[0]);

        // 일반적인 for문
        for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i]);
        }

        // 향상된 for문
        for (int data : arr1) {
            System.out.println(data);
        }
    }
}