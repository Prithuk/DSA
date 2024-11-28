package com.leetcode.string;

import java.util.Arrays;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        String[] strs = {"flower", "flow", "flight"};

        Arrays.sort(strs);
        String s1 = strs[0];
        String s2 = strs[strs.length - 1];
        for (String d : strs) {
            System.out.print(d + " ");
        }
        int d = 0;
        for (int i = 0; i < strs.length; i++) {
            if (s1.charAt(i) == s2.charAt(i)) {
                d++;
            } else {
                break;
            }

        }
        if (d == 0) {
            System.out.println(" ");
        } else {
            System.out.println(s1.substring(0,d));
        }
    }
}
