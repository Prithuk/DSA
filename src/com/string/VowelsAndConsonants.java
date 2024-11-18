package com.string;

import java.util.ArrayList;
import java.util.List;

public class VowelsAndConsonants {

    public static void main(String[] args) {
        String s = "Prithu";
        List<Character> vowels = new ArrayList<>();
        List<Character> consonants = new ArrayList<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
              vowels.add(ch);
            } else {
                consonants.add(ch);
            }
        }

        for(char ch : vowels){
            System.out.print(ch + " ");
        }
        System.out.println();
        for(char ch : consonants){
            System.out.print(ch + " ");
        }
    }
}
