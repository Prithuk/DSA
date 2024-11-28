package com.string;

public class RemoveSpaces {

    //many approach
    public static void main(String[] args) {
        String s = "My name is Prithu Kathet";
        String res ="";

//        for (int i = 0; i < s.length(); i++) {
//
//            char ch = s.charAt(i);
//
//            if (!Character.isWhitespace(ch)) {
//                res = res+ch;
//            }
//        }
//        System.out.println(res);


        String str = "     Geeks     for Geeks     ";

        // Call the replaceAll() method
        str = str.replaceAll("\\s", "");

        System.out.println(str);
    }
}
