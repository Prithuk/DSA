package com.array;
public class TwoMatrixEqual {
    public static void main(String[] args) {
        int[][] matrx1 = {{1, 2}, {2, 4}};
        int[][] matrx2 = {{1, 1}, {2, 4}};
        boolean result = checkTwoMatrix(matrx1, matrx2);
        if (result) {
            System.out.println("Matrix are equal");
        } else {
            System.out.println("Matrix are not equal.");
        }

    }

    public static boolean checkTwoMatrix(int[][] a, int[][] b) {
        if (a.length != b.length) {
            return false;
        }
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                if (a[i][j] != b[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }
}


