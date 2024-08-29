package com.array;

public class SecondLargest {

    public static void main(String[] args) {
        int[] arr = {1, 59, 100, 56, 100, 100, 100};
        int largest = 0;
        int secondLargest = -1;
        for (int i = 0; i < arr.length - 1; i++) {

            if (arr[i] > largest) {
                largest = arr[i];
            }
        }
        for (int l = 0; l < arr.length - 1; l++) {

            if (arr[l] > secondLargest && arr[l] != largest) {
                secondLargest = arr[l];
            }
        }
        System.out.println(" largest element is " + largest);
        System.out.print(" Second largest element is " + secondLargest);
    }
}
