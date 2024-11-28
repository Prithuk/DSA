package com.pattern.numberpattern;

public class SameNumber {

    public static void main(String[] args) {
        int rows = 4;
        int column = 4;

        for (int i = 1; i <= rows; i++) {

            for (int j = 1; j <= column; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
