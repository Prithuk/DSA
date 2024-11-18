package com.java8.practice.lambda;

public class SimpleCalculator {

    public static void main(String[] args) {

        //1. SUM
        Calculator sum = (double a, double b) -> (a + b);

        double sumData = sum.doMath(3, 4);
        System.out.println("SUM IS: " + sumData);


        //2. DIFFERENCE
        Calculator difference = (a, b) -> a - b;

        double differenceD = difference.doMath(4, 3);
        System.out.println("difference IS: " + differenceD);

        //same for other product, divison
    }


}
