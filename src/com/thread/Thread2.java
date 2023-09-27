package com.thread;

public class Thread2 implements Runnable {
    @Override
    public void run() {
        int arr[] = {9, 3, 7, 1, 5, 4};
        for (int i = 0; i < arr.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            if (min != i) {
                int temp = arr[i];
                arr[i] = arr[min];
                arr[min] = temp;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println("Using selection sort algorithm: " + arr[i] + " ");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
