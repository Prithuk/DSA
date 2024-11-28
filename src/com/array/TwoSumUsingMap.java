package com.array;

import java.util.HashMap;
import java.util.Map;

public class TwoSumUsingMap {

    public static void main(String[] args) {

        int[] arr = {2, 6, 5, 8, 11};
        int target = 14;
        Map<Integer, Integer> mapValue = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            int value = target - arr[i];
            if (mapValue.containsKey(value)) {
                System.out.print(i + " " + mapValue.get(value));
            }
            mapValue.put(arr[i], i);
        }
    }
}
