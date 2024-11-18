package com.string;

public class PrintOnlyUppercse {

    public static void main(String[] args) {
        String s = "Pr123It45Hu";

        //need to get number from above string
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if(Character.isDigit(ch)){
                System.out.println(ch);
            }
        }
    }
}
