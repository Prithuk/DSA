package com.pattern.starpattern;

public class SandglassStar {

    public static void main(String[] args) {
        int rows = 5; // Number of rows for the sandglass pattern

        for (int i = 0; i < rows * 2; i++) {
            // Determine the number of spaces and stars based on the row index
            int spaces = i < rows ? i : rows * 2 - i - 1;
            int stars = i < rows ? rows - i : i - rows + 1;

            // Print leading spaces
            for (int j = 0; j < spaces; j++) {
                System.out.print(" ");
            }

            // Print stars with spaces
            for (int j = 0; j < stars; j++) {
                System.out.print("* ");
            }

            // Move to the next line
            System.out.println();
        }
    }
}
