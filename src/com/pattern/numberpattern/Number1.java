package com.pattern.numberpattern;

public class Number1 {

    public static void main(String[] args) {

        int rows = 10;
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
