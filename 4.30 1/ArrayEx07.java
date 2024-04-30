public class ArrayEx07 {
    public static void main(String[] args) {
        // 가변 배열
        // int[][] arr1 = { { 10, 20, 30 }, { 40, 50 }, { 60 } };

        int[][] arr1 = new int[3][];
        arr1[0] = new int[] {10, 20, 30};
        arr1[1] = new int[] {40, 50};
        arr1[2] = new int[] {60};

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                System.out.println(arr1[i][j]);
            }
        }
    }
}
