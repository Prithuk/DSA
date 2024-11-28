package com.array;

import java.util.ArrayList;
import java.util.List;

public class MoveZeroToLast_BRUTE {

    public static void main(String[] args) {

        int[] arr = {1, 0, 2, 3, 2, 0, 0, 4, 5, 1};

        List<Integer> temp = new ArrayList<>();

        //step = 1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                temp.add(arr[i]);
            }
        }

        //step 2
        for (int i = 0; i < temp.size(); i++) {
            arr[i] = temp.get(i);
        }

        int non_zero = temp.size();

        //step 3
        for (int i = non_zero; i < arr.length; i++) {
            arr[i] = 0;
        }

        //print final array

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}
