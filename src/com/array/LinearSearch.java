package com.array;

public class LinearSearch {

    public static void main(String[] args) {

        int[] arr = {6, 7, 8, 4, 1};

        int num = 4;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == 4) {
                System.out.print(i);
            }
        }

    }
}
