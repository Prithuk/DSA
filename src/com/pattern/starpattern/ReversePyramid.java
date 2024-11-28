package com.pattern.starpattern;

public class ReversePyramid {

    public static void main(String[] args) {
        int rows = 5;
        for (int i = 1; i <= rows; i++) {

            for (int k = 1; k < i; k++) {
                System.out.print(" ");
            }
            for (int j = rows; j >= i; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
