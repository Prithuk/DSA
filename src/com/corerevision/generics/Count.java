package com.corerevision.generics;

import java.util.Arrays;
import java.util.List;

public class Count {

    public static <T> int countOccurences(List<T> a, T b) {
        int count = 0;
        for (T data : a) {
            if (data == b) {
                count++;
            }
        }
        return count;
    }


//    public static int countOccu(List<Integer> a, int b) {
//        int count = 0;
//        for (int i = 0; i < a.size(); i++) {
//            if (b == a.get(i)) {
//                count++;
//            }
//        }
//        return count;
//    }

    public static void main(String[] args) {
        int data = countOccurences(Arrays.asList(1, 4, 4, 4, 2), 4);
        System.out.println(data);

        int data1 = countOccurences(Arrays.asList("Prithu", "Prithu", "a", "b"),"Prithu");
        System.out.println(data1);
    }
}
