package com.character;

public class StrTOChar {

    public static void main(String[] args) {
        String s1 = "Prithu"  ;
        System.out.println(s1);
        char [] ch = s1.toCharArray();
        for(char c : ch){
            System.out.println(c);
        }


    }
}
