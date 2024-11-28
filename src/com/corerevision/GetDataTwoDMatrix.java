package com.corerevision;

import java.util.Arrays;
import java.util.List;

public class GetDataTwoDMatrix {

    public static void main(String[] args) {

        List<List<Integer>> arr = Arrays.asList(
                Arrays.asList(1, 2, 3),
                Arrays.asList(4, 5, 6),
                Arrays.asList(7, 8, 9)
        );

        System.out.println(arr);
        int primaryDiagonalSum=0;
        int secondaryDiagonalSum =0;
        int n = arr.size();
        System.out.println("n: "+n);

        for (int i = 0; i < n; i++) {
            primaryDiagonalSum = arr.get(i).get(i); // Sum for the primary diagonal
            System.out.println(primaryDiagonalSum);
            secondaryDiagonalSum = arr.get(i).get(n - 1 - i);
        }
    }
}
