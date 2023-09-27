package com.sortingalgorithm;

public class SelectionSortSmallest {
    public static void main(String[] args) {
        int[] array = {10, 4, 7, 2, 1, 9, 6};

        System.out.println("Original array: ");
        printArray(array);

        // Selection Sort algorithm
        for (int i = 0; i < array.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = temp;

            System.out.println("Iteration " + (i + 1) + ": ");
            printArray(array);
        }

        System.out.println("Sorted array: ");
        printArray(array);
    }

    // Helper method to print the elements of an array
    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}
