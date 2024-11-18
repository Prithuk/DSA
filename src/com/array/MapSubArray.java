package com.array;

import java.util.HashMap;
import java.util.Map;

public class MapSubArray {
    public static void main(String[] args) {
//        int arr[] = {1, 2, 3, 4, 5};
        int arr[] = {1,0,1,2,1,0,4,1,3};
        int originalSum = 4;
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            //find first cumulative sum
            //put sum in map and index
            //check sum-k exists in map or not
            //why sum-k is if current sum diffeernce k exist in previous cs, if exist then there is
            sum = sum + arr[i];
            map.put(sum, i);

            if (map.containsKey(sum - originalSum)) {
                int getOldIndex = 1+ map.get(sum - originalSum);
                System.out.println();
                int currsumIndex = map.get(sum);
                System.out.println("Subarray exists from " + getOldIndex + " and " + currsumIndex);
            }
        }
    }
}
