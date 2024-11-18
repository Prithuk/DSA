package com.string;

import java.util.Scanner;

public class ToggleString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder(sc.nextLine());
        System.out.println(sb);
        for (int i = 0; i < sb.length(); i++) {
            char ch = sb.charAt(i);
            if(ch == ' ' || (ch>=0 && ch<=9)) continue;
            int ascii = ch;
            if (ascii >= 65 && ascii < 97) {
                ch = (char) (ch + 32);
                sb.setCharAt(i, ch);
            } else {
                ch = (char) (ch - 32);
                sb.setCharAt(i, ch);
            }
        }
        System.out.println(sb);
    }
}
