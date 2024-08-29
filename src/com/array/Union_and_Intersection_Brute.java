package com.array;

import java.util.HashSet;
import java.util.Set;

public class Union_and_Intersection_Brute {

    public static void main(String[] args) {

        int[] arr1 = {1, 1, 2, 3, 4, 5};
        int[] arr2 = {1, 2, 3, 4, 5, 6};

        //BRUTE
        Set<Integer> data = new HashSet<>();
        for (int i = 0; i < arr1.length; i++) {
            data.add(arr1[i]);
        }

        for (int i = 0; i < arr2.length; i++) {
            data.add(arr2[i]);
        }

        for (int value : data) {
            System.out.print(value + " ");
        }

        
    }
}
