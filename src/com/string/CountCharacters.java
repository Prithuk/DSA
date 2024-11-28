package com.string;

public class CountCharacters {

    public static void main(String[] args) {
        //count uppercase characters

        String ch = "mY123 NA4me i5s PriTHu";
        int count = 0;

//        for (int i = 0; i < ch.length(); i++) {
//            char value = ch.charAt(i);
//
//            if (value >= 'A' && value <= 'Z') {
//                System.out.print(value + " ");
//                count++;
//            }
//        }

        for (int i = 0; i < ch.length(); i++) {
            char value = ch.charAt(i);
            if(Character.isDigit(value)){
                System.out.print(value);
                count ++ ;
            }
        }
        System.out.println();
        System.out.println(count);
    }
}
