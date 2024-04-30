public class ArrayEx03 {
    public static void main(String[] args) {
        // 문자열 배열
        String[] arr1;
        arr1 = new String[3];

        arr1[0] = "1 번";
        arr1[1] = "2 번";
        arr1[2] = "3 번";

        System.out.println(arr1[0]);

        for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i]);
        }

        for (String data : arr1) {
            System.out.println(data);
        }
    }
}
