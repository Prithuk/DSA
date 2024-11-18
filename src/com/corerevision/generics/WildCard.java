package com.corerevision.generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WildCard {

    public static <T> double sum(List<? extends Number> value) {
        double sum = 0;
        for (Number d : value) {
            sum += d.doubleValue();
        }
        return sum;
    }

    public static void main(String[] args) {
        double sum = sum(Arrays.asList(1, 2, 3));
        System.out.println(sum);

    }

}
