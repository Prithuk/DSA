package com.java8.practice.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Largest {

    public static void main(String[] args) {
        List<Integer> ele = Arrays.asList(1, 2, 45, 67, 87, 34, 56);


        Integer reduce = ele.stream()
                .map(i -> i * i)
                .reduce(0, (c, d) -> c + d);
        System.out.println(reduce);


//        Optional<Integer> largest = ele.stream().max(Integer::compareTo);
////        largest.ifPresent(l -> System.out.println("Largest element is: " + l));
//        largest.ifPresent(System.out::println);

//        List<Integer> collect = ele.stream()
//                .filter(i -> i % 2 == 0)
//                .collect(Collectors.toList());
//        System.out.println(collect);
    }
}
