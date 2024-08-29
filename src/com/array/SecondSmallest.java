package com.array;

public class SecondSmallest {

    public static void main(String[] args) {
        int[] arr = {2, 4, 7, 7, 1, 5};
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;
        System.out.println(secondSmallest);
        for (int i = 1; i < arr.length; i++) {
            if (smallest > arr[i]) {
                smallest = arr[i];
            }
        }
        for (int m = 0; m < arr.length; m++) {
            if (arr[m] > smallest && arr[m] < secondSmallest) {
                secondSmallest = arr[m];
            }
        }
        System.out.println("smallest " + smallest);
        System.out.println(" secondSmallest " + secondSmallest);
    }
}
