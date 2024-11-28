package com.java8.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.stream.Stream;

public class StreamDemo2 {
    public static void main(String[] args) {
        List<Integer> values = Arrays.asList(1, 2, 3, 4, 5, 6);
        Function<Integer, Integer> f = new Function() {
            @Override
            public Object apply(Object o) {
                return o;
            }
        };

        BinaryOperator<Integer> b = new BinaryOperator<Integer>() {
            @Override
            public Integer apply(Integer integer, Integer integer2) {
                return integer + integer2;
            }
        };

        Stream s1 = values.stream();
        Stream s2 = s1.map(f);
        Integer result = (Integer) s2.reduce(0, b);
        System.out.println(result);

        System.out.println(values.stream().reduce(0, (c, e) -> c + e));
        Integer r = values.stream().reduce(0, (c, e) -> c + e);

    }
}
