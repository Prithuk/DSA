package com.pattern.starpattern;

public class Star {
    public static void main(String[] args) {
        int n = 5; // Number of rows

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                // Print star followed by a space only if it's not the last star in the row
                if (j < i) {
                    System.out.print("* ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
