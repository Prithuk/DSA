package com.java8.streamapi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DivisibleBy5 {

    public static void main(String[] args) {
        List<Integer> values = Arrays.asList(12, 10, 30, 40, 5, 6, 7);

        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < values.size(); i++) {
            if (values.get(i) % 5 == 0) {
                result.add(values.get(i));
            }
        }

        result.forEach(i -> System.out.print(i+ " "));

        System.out.println(values.stream().map(i -> i % 5 == 0).collect(Collectors.toList()));
        System.out.println( values.stream().filter(i -> i%5==0).collect(Collectors.toList()));

    }
}
