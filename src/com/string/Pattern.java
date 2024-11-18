package com.string;

public class Pattern {
    public static void main(String[] args) {
        // Loop through each number to print the first part of the pattern
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        // Loop through each number to print the second part of the pattern
        for (int i = 2; i <= 3; i++) {
            for (int j = i; j <= 3; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
