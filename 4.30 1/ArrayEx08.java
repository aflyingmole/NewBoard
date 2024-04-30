public class ArrayEx08 {
    public static void main(String[] args) {
        // 3차원 배열
        int[][][] arr = {
                {
                        { 1, 2, 3 },
                        { 10, 20, 30 }
                },
                {
                        { 4, 5, 6 },
                        { 40, 50, 60 }
                },
                {
                        { 7, 8, 9 },
                        { 70, 80, 90 }
                }
        };

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                for (int k = 0; k < arr[i][j].length; k++) {
                    System.out.println(arr[i][j][k]);
                }
            }
        }
    }
}
