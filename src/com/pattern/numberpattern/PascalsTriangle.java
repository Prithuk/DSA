package com.pattern.numberpattern;

import java.util.Scanner;

public class PascalsTriangle {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows for pascal triangle");
        int rows = sc.nextInt();
        int spaces = rows;
        int number;

        for (int i = 0; i < rows; i++) {
            for (int s = 1; s <= spaces; s++) {
                System.out.print(" ");
            }
            number = 1;
            for (int j = 0; j <= i; j++) {
                System.out.print(number + " ");
                number = number * (i - j) / (j + 1);
            }
            spaces--;
            System.out.println();
        }
    }
}
