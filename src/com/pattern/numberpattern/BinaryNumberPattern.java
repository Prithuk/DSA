package com.pattern.numberpattern;

public class BinaryNumberPattern {

    public static void main(String[] args) {
        int rows = 5;
        int a;
        for (int i = 1; i <= rows; i++) {
            if (i % 2 == 0) {
                a = 1;
            } else {
                a = 0;
            }
            for (int j = 1; j <= rows; j++) {
                if (a == 0) {
                    a = 1;
                } else {
                    a = 0;
                }
                System.out.print(a);
            }
            System.out.println();
        }
    }
}
