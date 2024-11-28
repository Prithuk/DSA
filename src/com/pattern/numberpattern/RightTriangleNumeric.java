package com.pattern.numberpattern;

public class RightTriangleNumeric {


    public static void main(String[] args) {
        int rows = 5;
        for (int i = 2; i <= rows + 1; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print(i-j + " ");
            }
            System.out.println();
        }




    }
}
