package com.sortingalgorithm;

public class ShellSort {
    public static void main(String[] args) {

        int[] a = {23, 29, 15, 19, 31, 7, 9, 5, 2};
        int length = a.length;
        for (int gap = length / 2; gap >= 1; gap = gap / 2) {
            for (int j = gap; j < length; j++) {
                for (int i = j - gap; i >= 0; i = i - gap) {
                    if (a[i + gap] > a[i]) {
                        break;
                    } else {
                        int temp = a[i + gap];
                        a[i + gap] = a[i];
                        a[i] = temp;
                    }
                }
            }
        }
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
