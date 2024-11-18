package com.string;

import java.util.Scanner;

public class LowerUpperChar {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a character to convert");
        char c = sc.next().charAt(0);
        if (c >= 'a' && c <= 'z') {
            c = (char) (c - 32);
        } else if (c >= 'A' && c <= 'Z') {
            c = (char) (c + 32);
        }





    }
}
