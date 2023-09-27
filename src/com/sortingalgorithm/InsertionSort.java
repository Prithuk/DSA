package com.sortingalgorithm;

public class InsertionSort {
    public static void main(String[] args) {
        int arr[] = {20, 35, -15, 7, 55, 1, -22};
        for (int i = 1; i < arr.length; i++) {
            int temp = arr[i];
            int j = i - 1;
            while (j >= 0 && (arr[j] > temp)) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j+1] = temp;
        }
        for(int i=0; i< arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
