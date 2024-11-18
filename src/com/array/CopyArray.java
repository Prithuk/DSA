package com.array;

public class CopyArray {
    public static void main(String[] args) {
        int a[] = new int[]{1, 2, 3};
        int b[] = new int[a.length];
        //copying
        for (int i = 0; i < a.length; i++) {
            b[i] = a[i];
        }
        System.out.println("A value");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
        //printing b
        System.out.println("B value");
        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i] + " ");
        }
        System.out.println();
        //changing data in b
        b[1]++;
        System.out.println("After changing");

        System.out.println("B value");
        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i] + " ");
        }
        System.out.println();
        System.out.println("A value");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }


    }
}
