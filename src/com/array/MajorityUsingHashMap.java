package com.array;

import java.util.HashMap;
import java.util.Map;

public class MajorityUsingHashMap {

    public static void main(String[] args) {
        int[] arr = {3, 2, 3};
        int mathVal = arr.length / 2;

        Map<Integer, Integer> mapValue = new HashMap<>();

        for (int v : arr) {
            mapValue.put(v, mapValue.getOrDefault(v, 0) + 1);
            int getValue = mapValue.get(v);
            System.out.println("getValue: " + getValue);

            if (getValue> mathVal) {
                System.out.println(v);
            }
        }

    }
}
