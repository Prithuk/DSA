package com.array;

public class MissingNumber {

    public static void main(String[] args) {


        int[] arr = {1, 2, 4, 5};

        for (int i = 1; i <= arr.length; i++) {
            int flag = 0;
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] == i) {
                    flag = 1;
                    break;
                }
            }
            if (flag == 0) {
                System.out.println("Missing number is " + i);
            }

        }
    }
}
