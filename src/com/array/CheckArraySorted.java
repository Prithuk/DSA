package com.array;

public class CheckArraySorted {

    public static void main(String[] args) {

        int[] arr = {1, 2, 4, 7, 7, 5};
        boolean status = isArraySorted(arr);
        System.out.println(status);
    }


    public static boolean isArraySorted(int[] data) {
        for (int i = 1; i < data.length; i++) {
            if (data[i] >= data[i - 1]) {

            } else {
                return false;
            }
        }
        return true;
    }
}
