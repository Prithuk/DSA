package com.string;

public class Reverse {

    public static void main(String[] args) {
        String s = "TATE";
        String rev="" ;

        for (int i = s.length()-1; i>=0; i--) {
            rev = rev + s.charAt(i);
        }
        System.out.println(rev);

        if(s.equals(rev)){
            System.out.println(s + " is a palindrome string");
        } else {
            System.out.println("Not a palindrome string");
        }
    }
}
