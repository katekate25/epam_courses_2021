package by.training.simplestapp.main.task01;

public class Task10 {
    public static void main(String[] args) {
        int[][] matrixA;
        int n = 8;
        matrixA = new int[n * 2][n * 2];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i % 2 == 0) {
                    matrixA[i][j] = j + 1;
                }
                if (i % 2 == 1) {
                    matrixA[i][j] = n - j;
                }

                System.out.print(matrixA[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println();
    }
}
