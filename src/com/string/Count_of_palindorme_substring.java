package com.string;

public class Count_of_palindorme_substring {

    public static void main(String[] args) {
        String s = "abc";
        int count = findSubstring(s);
        System.out.println(count);
    }

    public static int findSubstring(String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j <= s.length(); j++) {
                System.out.println(s.substring(i, j));
                if (isPalindrome(s.substring(i, j))) {
                    count++;
                }
            }
        }
        return count;
    }

    public static boolean isPalindrome(String s) {
        String rev = "";
        for (int i = s.length()-1; i >= 0; i--) {
            rev = rev + s.charAt(i);
        }
        if (s.equals(rev)) {
            return true;
        }
        return false;
    }
}
