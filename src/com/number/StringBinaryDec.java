package com.number;

public class StringBinaryDec {
    public static void main(String[] args) {
        String s = "111011";
        int i = s.length() - 1;
        int ans = 0;
        int inc = 0;
        while (i >= 0) {
            int data = (int) s.charAt(i) -'0';
            System.out.println(data);
            ans =ans +  (int) (data * Math.pow(2, inc));
            i--;
            inc++;
        }
        System.out.println(ans);
    }
}
