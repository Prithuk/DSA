package com.corerevision.generics;

import java.util.Arrays;
import java.util.List;

public class MinMaxFinder<T extends Comparable<T>> {
    // Method to find the minimum and maximum elements in the list
    public Pair<T, T> findMinMax(List<T> list) {
        if (list == null || list.isEmpty()) {
            throw new IllegalArgumentException("List must not be null or empty");
        }

        T min = list.get(0);
        T max = list.get(0);

        for (T element : list) {
            if (element.compareTo(min) < 0) {
                min = element;
            }
            if (element.compareTo(max) > 0) {
                max = element;
            }
        }

        return new Pair<>(min, max);
    }

    // Test the MinMaxFinder class
    public static void main(String[] args) {
        MinMaxFinder<Integer> intFinder = new MinMaxFinder<>();
        List<Integer> intList = Arrays.asList(3, 5, 1, 4, 2);
        Pair<Integer, Integer> intMinMax = intFinder.findMinMax(intList);
        System.out.println("Integer Min/Max: " + intMinMax);

        MinMaxFinder<String> stringFinder = new MinMaxFinder<>();
        List<String> stringList = Arrays.asList("apple", "orange", "banana", "pear");
        Pair<String, String> stringMinMax = stringFinder.findMinMax(stringList);
        System.out.println("String Min/Max: " + stringMinMax);
    }
}
