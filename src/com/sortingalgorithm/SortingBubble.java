package com.sortingalgorithm;

public class SortingBubble {
    public static void main(String[] args) {
        int[] arrayToSort = {20, 35, -15, 7, 55, 1, -22};


        //bubble sort
        for(int i=0; i<arrayToSort.length; i++){
            for(int j=1; j< arrayToSort.length-i; j++){
                if(arrayToSort[j-1]>arrayToSort[j]){
                    int temp = arrayToSort[j-1];
                    arrayToSort[j-1]=arrayToSort[j];
                    arrayToSort[j]= temp ;
                }
            }
        }

        for(int i=0 ; i<arrayToSort.length; i++){
            System.out.print(arrayToSort[i]+" ");
        }
    }
}
