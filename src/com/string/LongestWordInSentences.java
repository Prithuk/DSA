package com.string;

import java.util.ArrayList;
import java.util.List;

public class LongestWordInSentences {
    public static void main(String[] args) {
        String text = "I am Brave and abundance of money is flowing into my life";
        String[] result = text.split(" ");
        List<Integer> finalValue = new ArrayList<>();
        for (int i = 0; i < result.length; i++) {
            String string = result[i];
            int value = string.length();
            finalValue.add(value);
        }

        int max = 0;
        for (int i = 0; i < finalValue.size(); i++) {
            if (finalValue.get(i) > max) {
                max = finalValue.get(i);
            }
        }

        System.out.println("max value is:"+ max);
//        for (int data : finalValue) {
//            System.out.print(data + " ");
//        }


    }
}
