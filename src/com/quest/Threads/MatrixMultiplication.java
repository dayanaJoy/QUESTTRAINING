package com.quest.Threads;
public class MatrixMultiplication {

    public static void main(String[] args) {

        int[][] A = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int[][] B = {
                {1, 2},
                {3, 4},
                {5, 6}
        };

        int m = 3;
        int n = 3;
        int p = 2;

        int[][] C = new int[m][p];


        class Multiplication implements Runnable {
            int row;

            public Multiplication(int row) {
                this.row = row;
            }

            @Override
            public void run() {
                for (int j = 0; j < p; j++) {
                    for (int k = 0; k < n; k++) {
                        C[row][j] += A[row][k] * B[k][j];
                    }
                }
            }
        }

        Thread[] threads = new Thread[m];
        for (int i = 0; i < m; i++) {
            try {
                Multiplication multiplication = new Multiplication(i);
                threads[i] = new Thread(multiplication);
                threads[i].start();

            } catch (Exception e) {
                System.out.println("Exception");
            }
        }

        System.out.println("C :");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < p; j++) {
                System.out.print(C[i][j] + " ");
            }
            System.out.println();
        }
    }
}