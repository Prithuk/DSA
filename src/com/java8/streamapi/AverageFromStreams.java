package com.java8.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class AverageFromStreams {

    public static void main(String[] args) {

        List<Integer> values = Arrays.asList(1, 2, 3, 4, 5, 6, 7);

        // Step 1: Calculate the sum of all elements
        int sum = values.stream()
                .mapToInt(Integer::intValue) // Convert to int for easy summation
                .sum();

        // Step 2: Get the count of elements
        long count = values.stream().count(); // Count all elements

        // Step 3: Calculate the average
        double average = (count > 0) ? (double) sum / count : 0;

        System.out.println("Sum: " + sum);
        System.out.println("Count: " + count);
        System.out.println("Average: " + average);

        double average1 = values.stream()
                .mapToInt(Integer::intValue)  // Convert to IntStream
                .average()                   // Compute average
                .orElse(0);                  // Handle empty list case

    }
}
