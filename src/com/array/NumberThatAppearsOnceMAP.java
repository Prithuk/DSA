package com.array;

import javax.print.DocFlavor;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class NumberThatAppearsOnceMAP {

    public static int singleElement(int[] arr) {
        //write your logic here
        Map<Integer, Integer> data = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int freq = data.getOrDefault(arr[i], 0);
            data.put(arr[i], freq + 1);
        }
        for (int i = 0; i < arr.length; i++) {
            if (data.get(arr[i]) == 1) {
                return arr[i];
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 4, 5, 3, 4};
        Arrays.sort(arr);
        int single = singleElement(arr);
        if (single == -1) {
            System.out.println("No unique element found");
        } else {
            System.out.println("Unique element: " + single);
        }
    }
}

