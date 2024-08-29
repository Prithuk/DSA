package com.array;

import java.util.Scanner;

public class RotateArrayByDpLaces {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int n = arr.length;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of times you want to rotate");
        int dTimes = sc.nextInt();
        dTimes = dTimes % n;

        int[] temp = {1, 2, 3};

        //for shifting
        for (int i = dTimes; i < arr.length; i++) {
            arr[i - dTimes] = arr[i];
        }

        //for putting back
        for (int i = n - dTimes; i < n; i++) {
            arr[i] = temp[i - (n - dTimes)];
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}
