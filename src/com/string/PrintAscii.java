package com.string;

public class PrintAscii {

    public static void main(String[] args) {

        //print ascci of  all character
        char ch;

        for(int i =0; i<128; i++){

            ch = (char) i;
            System.out.println(ch + " " + i);
        }
    }
}
