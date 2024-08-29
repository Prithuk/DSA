package com.array;

public class NewSecondSmallest {

    public static void main(String[] args) {
        int smallest = Integer.MAX_VALUE;
        int ssmallest = Integer.MAX_VALUE;
        int[] arr = {1, 2, 4, 7, 7, 5};
        int numberLength = arr.length;
        for (int i = 0; i < numberLength; i++) {
            if (arr[i] < smallest) {
                smallest = arr[i];
            }
        }
        //for finding second smallest

        for (int s = 0; s < numberLength; s++) {
            if (arr[s] < ssmallest && arr[s] > smallest) {
                ssmallest = arr[s];
            }
        }
        System.out.println("second smalles " + ssmallest);
        System.out.println("smallest " + smallest);
    }
}
