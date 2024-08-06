package com.pattern.starpattern;

public class RIghtDownMirror {

    public static void main(String[] args) {
        int rows = 5;
        for (int i = 1; i <= rows; i++) {
            for (int k = i; k > 1; k--) {
                System.out.print(" ");
            }
            for (int j = rows; j >= i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
