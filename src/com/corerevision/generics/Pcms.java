package com.corerevision.generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Pcms {
    public static <T> void copyElements(List<? extends T> a, List<? super T> b) {

        for(T elements: a){
            b.add(elements);
        }
    }

    public static void main(String[] args) {
        List<Integer> source = Arrays.asList(1, 2, 3, 4);
        List<Number> destination = new ArrayList<>();
        copyElements(source, destination);

        System.out.println(destination);
    }
}
