package com.java8.lambda;

public class Implementation {

    public static void main(String[] args) {

        SumNumbers s = (int a, int b) -> {
            int sum = a + b;
            return sum;
        };

        int result = s.add(4, 5);
        System.out.println("the result is: " + result);
    }
}
