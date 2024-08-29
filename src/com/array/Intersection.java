package com.array;

import java.util.ArrayList;
import java.util.List;

public class Intersection {

    public static void main(String[] args) {
        int[] arr1 = {2, 2, 2, 3, 3, 4, 7, 8};
        int[] arr2 = {1, 2, 4, 4, 6, 6, 7, 8, 10};
        List<Integer> intersection = new ArrayList<>();
        int i = 0;
        int j = 0;

        while (i < arr1.length && i < arr2.length) {

            while (i < arr1.length - 1 && arr1[i] == arr1[i + 1]) {
                i++;
            }

            while (j < arr2.length - 1 && arr1[j] == arr1[j + 1]) {
                j++;
            }

            
        }

        for (int finalResult : intersection) {
            System.out.print(finalResult + " ");
        }

    }
}
