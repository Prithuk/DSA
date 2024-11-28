package com.array;

import java.util.Scanner;

public class TDArray {
    public static void main(String[] args) {
        //print two 2d array
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of rows");
        int rows = sc.nextInt();
        System.out.println("Enter no of columns");
        int column = sc.nextInt();

        int[][] matrix1 = new int[rows][column];
        int[][] matrix2 = new int[rows][column];

        System.out.println("Enter matrix1 values");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < column; j++) {
                System.out.println("Enter" + "[" + i + "]" + "[" + j + "] value:");
                matrix1[i][j] = sc.nextInt();
            }
        }


        System.out.println("Enter matrix2 values");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < column; j++) {
                System.out.println("Enter" + "[" + i + "]" + "[" + j + "] value:");
                matrix2[i][j] = sc.nextInt();
            }
        }

        System.out.println("Addition of two matrix: ");
        int[][] additon = new int[rows][column];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < column; j++) {
                additon[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }

        //print addition of matrix:
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print(additon[i][j] + " ");
            }
            System.out.println();
        }

    }
}
