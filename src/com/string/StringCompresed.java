package com.string;

public class StringCompresed {
    public static void main(String[] args) {
        String s = "aaabbbbccddde";
        String result = "";
        StringBuilder sb = new StringBuilder();

        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            char temp = ' ';
            System.out.println("ch: " + ch);
            System.out.println("sb:" + sb);
            ch = temp;
            if (temp == ch) {
                count++;
            }
            temp = ' ';
            result = " " + ch + count;
            count = 0;
        }
        System.out.println("result: " + result);
    }
}