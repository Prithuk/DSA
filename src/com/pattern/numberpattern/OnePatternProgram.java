package com.pattern.numberpattern;

public class OnePatternProgram {


    public static void main(String[] args) {

        int rows = 5;
        int a;
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                if (j % 2 == 0) {
                    a = 0;
                } else {
                    a = 1;
                }
                System.out.print(a);
            }
            System.out.println();
        }
    }
}
