package com.pattern.starpattern;

public class LeftPascal {

    public static void main(String[] args) {

        int rows = 9;
        int space = rows / 2;
        int star = 1;
        int midLine = (rows / 2) + 1;

        for (int i = 1; i <= rows; i++) {

            for (int j = 1; j <= space; j++) {
                System.out.print(" ");
            }

            for (int k = 1; k <= star; k++) {
                System.out.print("*");
            }
            System.out.println();

            if (i < midLine) {
                space--;
                star++;
            } else {
                space++;
                star--;
            }

        }
    }
}
