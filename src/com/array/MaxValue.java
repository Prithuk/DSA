package com.array;

public class MaxValue {

    public static void main(String[] args) {
        int[] arr = {1, 2, 45, 56, 100, 10, 0};
        int max = 0;
        for (int i = 0; i <= arr.length - 1; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println(max);
    }
}
