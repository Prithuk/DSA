package com.queue.linearqueue;

public class ArrayImpl {

    static int size = 0;
    static int f = -1;
    static int r = -1;
    static int[] arr = new int[5];

    public static void add(int value) {

        if (r == arr.length - 1) {
            System.out.println("Queue is full");
            return;
        }
        if (f == -1) {
            f = r = 0;
            arr[0] = value;
        } else {
            arr[r + 1] = value;
            r++;
        }
        size++;
    }

    public static void display() {

        if (f == -1) {
            System.out.println("Queue is empty");
            return;
        }

        for (int i = f; i <= r; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static int remove() {
        int removedValue = arr[f];
        f++;
        size--;
        return removedValue;
    }

    public static int peek() {
        return arr[f];
    }

    public boolean isEmpty() {
        if (size == 0) return true;
        return false;
    }


    public static void main(String[] args) {
        display();
        add(5);
        display();
        add(15);
        add(25);
        add(35);
        add(45);
        display();
        System.out.println(" size before : " + size);
        remove();
        display();
        System.out.println(" size after : " + size);
    }
}
