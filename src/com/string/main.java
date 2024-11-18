package com.string;

public class main {
    public static void main(String[] args) {
//        byte ascii[] = { 71, 70, 71 };
//
//        String firstString = new String(ascii);
//        System.out.println(firstString);
//
//        String secondString = new String(ascii, 1, 2);
//        System.out.println(secondString);


//        for (int  i = 60; i < 120; i++) {
//
//            char c = (char) i ;
//            System.out.println(c + " " + i);
//        }


        for (int i = 0; i < 128; i++) {
            char ch = (char) i;
            System.out.println(i + ":" + ch);
        }
    }
}
