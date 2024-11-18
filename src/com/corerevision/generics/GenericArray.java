package com.corerevision.generics;

public class GenericArray {

    public static <T> void printArray(T[] a) {
        for (T data : a) {
            System.out.print(data + " ");
        }
    }


    public static void main(String[] args) {
        Integer[] a = {1, 2, 3, 4, 5};
        printArray(a);
        String[] b = new String[]{"Prithu", "Kathet", "HI"};
        printArray(b);
    }
}
