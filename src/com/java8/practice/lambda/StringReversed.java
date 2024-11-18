package com.java8.practice.lambda;

public class StringReversed {

    public static void main(String[] args) {

        ManString manString = (s -> new StringBuilder(s).reverse().toString());
        String prithu = manString.manipulate("PRITHU");
        System.out.println(prithu);
    }
}
