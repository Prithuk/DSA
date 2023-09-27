package com.sortingalgorithm;

public class SelectionSortLargest {
    public static void main(String[] args) {
        int intArray[] = {20, 35, -15, 7, 55, 1, -22};

        for (int unsortedIndex = intArray.length-1; unsortedIndex > 0; unsortedIndex--) {
            int largest = 0;
            for (int i = 1; i <= unsortedIndex; i++) {

                if (intArray[i] > intArray[largest]) {
                    largest = i;
                }

            }
            int temp = intArray[largest];
            intArray[largest] = intArray[unsortedIndex];
            intArray[unsortedIndex] = temp;
        }
        for (int i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i]+" ");
        }
    }
}
