package com.array;

import java.util.ArrayList;
import java.util.List;

public class Union_and_Intersection_Optimal {

    public static void main(String[] args) {

        int[] arr1 = {2, 3, 4, 7, 8};
        int[] arr2 = {1, 2, 4, 6, 7, 8, 10, 10};
        int arr1Length = arr1.length;
        int arr2Length = arr2.length;
        List<Integer> list = new ArrayList<>();
        int i = 0;
        int j = 0;

        //both array iteration , comparison and insertion.
        while (i < arr1Length && j < arr2Length) {
            while (i < arr1Length - 1 && arr1[i] == arr1[i + 1]) {
                i++;
            }
            while (j < arr2Length - 1 && arr2[j] == arr2[j + 1]) {
                j++;
            }
            if (arr1[i] > arr2[j]) {
                list.add(arr2[j]);
                j++;
            } else if (arr1[i] < arr2[j]) {
                list.add(arr1[i]);
                i++;
            } else {
                list.add(arr1[i]);
                i++;
                j++;
            }
        }

        //for duplicate after iteration compeltion of one array
        while (i < arr1Length) {

            if (i < arr1Length - 1 && arr1[i] == arr1[i + 1]) {
                i++;
            } else {
                list.add(arr1[i]);
                i++;
            }
        }
        while ( j < arr2Length) {
            if (j < arr2Length - 1 && arr2[j] == arr2[j + 1]) {
                j++;
            } else {
                list.add(arr2[j]);
                j++;
            }
        }

        for (int data : list) {
            System.out.print(data + " ");
        }
    }

}
