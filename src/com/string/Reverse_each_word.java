package com.string;

public class Reverse_each_word {

    public static void main(String[] args) {
        String s = "I am don";
        StringBuilder builder = new StringBuilder("");
        String ans = "";
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch != ' ') {
                builder.append(ch);
            } else {
                builder.reverse();
                ans = ans + builder;
                ans = ans + " ";
                builder = new StringBuilder();
            }
        }
        builder.reverse();
        ans = ans + builder;
        System.out.print(ans);
    }
}
