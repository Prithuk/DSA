package com.array;

public class ArrayRotOptimalModulas {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int rotation = 17;
        int d = rotation % arr.length;
        for (int i = 0; i < d; i++) {
            int temp = arr[0];
            for (int j = 1; j < arr.length; j++) {
                arr[j - 1] = arr[j];
            }
            arr[arr.length - 1] = temp;
        }

        for(int i=0; i< arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
