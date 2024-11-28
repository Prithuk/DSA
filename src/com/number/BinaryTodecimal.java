package com.number;

public class BinaryTodecimal {

    public static void main(String[] args) {
        int binaryData = 111011;
        int num = binaryData;
        int ans = 0;
        int i = 0;
        while (num != 0) {
            int rem = num % 10;
            num = num / 10;
            ans = (int) (ans + rem * Math.pow(2, i));
            i++;
        }
        System.out.println(ans);
    }
}
