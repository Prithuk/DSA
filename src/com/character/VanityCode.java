package com.character;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class VanityCode {
    public static void main(String[] args) {
        List<Integer> prithu = extractNumberFromString("Prithu");
        System.out.println(prithu);
    }


    public static List<Integer> extractNumberFromString(String s) {
        Map<Character, Integer> data = new HashMap<>();
        List<Integer> addedValue = new ArrayList<>();
        char ch = 'A';
        for (int i = 2; i < 10; i++) {
            int nums;
            if (i == 7 || i == 9) {
                nums = 4;
            } else {
                nums = 3;
            }
            for (int j = 0; j < nums; j++) {
                data.put(ch++, i);
            }
        }

        System.out.println(data);
        char[] extractChar = s.toUpperCase().toCharArray();
        for (int i = 0; i < extractChar.length; i++) {
            addedValue.add(data.get(extractChar[i]));
        }
        return addedValue;
    }
}
