package com.pattern.starpattern;

public class RightPascal {

    public static void main(String[] args) {

        int rows = 9;
        int star = 1;
        int space = rows / 2;
        int midL = (rows / 2) + 1;
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= star; j++) {
                System.out.print("*");
            }
            for (int k = 1; k <= space; k++) {
                System.out.print(" ");
            }
            System.out.println();
            if (i < midL) {
                star++;
                space--;
            } else {
                star--;
                space++;
            }
        }
    }
}
