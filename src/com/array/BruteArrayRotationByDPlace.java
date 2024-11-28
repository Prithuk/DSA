package com.array;


public class BruteArrayRotationByDPlace {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int p = 1;
        int rotations = 20;

        while (p <= rotations) {
            int firstElement = arr[0];
            for (int j = 0; j < arr.length - 1; j++) {
                arr[j] = arr[j + 1];
            }
            arr[arr.length - 1] = firstElement;
            p++;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

//        for (int i = 0; i < rotations; i++) {
//            int firstEl = arr[0];
//            for (int j = 0; j < arr.length - 1; j++) {
//                arr[j] = arr[j + 1];
//            }
//            arr[arr.length - 1] = firstEl;
//            for (int k = 0; k < arr.length; k++) {
//                System.out.print(arr[k] + " ");
//            }
//            System.out.println();
//        }
    }
}
