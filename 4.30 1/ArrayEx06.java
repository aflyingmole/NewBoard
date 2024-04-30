public class ArrayEx06 {
    public static void main(String[] args) {
        int[][] arr1 = new int[][] { { 10, 20 }, { 30, 40 }, { 50, 60 } };
        int[][] arr2 = { { 10, 20 }, { 30, 40 }, { 50, 60 } };

        System.out.println(arr1[0][0]);
        System.out.println(arr2[2][1]);

        System.out.println(arr1);
        System.out.println(arr1[0]);
        System.out.println(arr1[0][0]);

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                System.out.println(arr1[i][j]);
            }

            for (int[] cols : arr1) {
                for (int col : cols) {
                    System.out.println(col);
                }
                
            }
        }

    }
}
