package com.array;

public class ArrayRotation {
    public static void main(String[] args) {
//        Input:
//        arr[] = {1, 2, 3, 4, 5, 6, 7}, d = 2
//        Output: 3 4 5 6 7 1 2
//
//
//        Input: arr[] = {3, 4, 5, 6, 7, 1, 2}, d=2
//        Output: 5 6 7 1 2 3 4
        //by one place

        int[] arr = {1, 2, 3, 4, 5};
        System.out.println("Before:");
        for(int i=0; i< arr.length; i++){
            System.out.print(arr[i] + " ");
        }

        int temp = arr[0];
        for (int i = 1; i < arr.length; i++) {
            arr[i - 1] = arr[i];
        }

        arr[arr.length-1]= temp;
        System.out.println("AFTER> > ");
        for(int i=0; i< arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
