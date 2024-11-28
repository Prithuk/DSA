package com.collectionframework.list;

import java.util.Arrays;
import java.util.List;

public class demo2 {

    public static void main(String[] args) {
        List<Integer> aL = Arrays.asList(1, 2, 4, 3);
        List<Integer> al1 = Arrays.asList(2, 3);
        al1.retainAll(aL);
        System.out.println(aL.containsAll(al1));
    }
}
