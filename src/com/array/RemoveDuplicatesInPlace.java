package com.array;

public class RemoveDuplicatesInPlace {

    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 2, 2, 3, 3, 3};
        int removeDuplicates = removeDuplicates(arr);
        System.out.println(removeDuplicates);
        System.out.println("=====");
        for (int i = 0; i < removeDuplicates; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static int removeDuplicates(int[] arr) {
        int n = arr.length;
        int uniqueIndex = 1;
        for (int i = 1; i < n; i++) {
            if (arr[i] != arr[i - 1]) {
                arr[uniqueIndex] = arr[i];
                uniqueIndex++;
            }
        }
        return uniqueIndex;
    }
}
