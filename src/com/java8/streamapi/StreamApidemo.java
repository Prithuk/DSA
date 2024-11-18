package com.java8.streamapi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.stream.Stream;

public class StreamApidemo {

    public static void main(String[] args) {

        List<Integer> data = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            data.add(i);
        }


        List<Integer> values = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
        List<Integer> finalreuslt = new ArrayList<>();

        for (int i = 0; i < values.size(); i++) {
            int result = values.get(i) * 2;
            finalreuslt.add(result);
        }

//        finalreuslt.forEach(i -> System.out.print(i + " "));


        //Instead of above we can do using STREAM

        //create object of function

        Function<Integer, Integer> f = new Function<Integer, Integer>() {

            @Override
            public Integer apply(Integer integer) {
                return integer * 2;
            }
        };

        Stream s = values.stream();
        Stream s1 = s.map(f);

//        s1.forEach(i -> System.out.print(i + " "));
        BinaryOperator<Integer> b = new BinaryOperator<Integer>() {
            @Override
            public Integer apply(Integer integer, Integer integer2) {
                return integer + integer2;
            }
        };
        Integer s2 = (Integer) s.reduce(0, (b));
        System.out.println(s2);

    }
}
