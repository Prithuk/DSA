package com.java8.streamapi;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Consumer;

public class ForeachM {

    public static void main(String[] args) {
        Set<String> uniqueNames = new HashSet<>(Arrays.asList("Larry", "Steve", "James"));
        uniqueNames.forEach(System.out::println);
        //For each is a method which accepts object of consumer interface

        List<Integer> data  = Arrays.asList(1,2,3,4,5,6,7);

        Consumer<Integer> c = new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) {
                System.out.print(integer + " ");
            }
        };

        data.forEach(c);

//        data.forEach(System.out::println);
    }
}
