package com.collectionframework.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Demo3 {


    public static void main(String[] args) {
        List<String> list1 = Arrays.asList("apple", "banana", "orange", "grapes");
        List<String> list2 = Arrays.asList("apple", "grapes", "kiwi");
        list1 = new ArrayList<>(list1);
        list2 = new ArrayList<>(list2);
        //how we can use retainAll in methods in LIST

        boolean b = list1.retainAll(list2);
        //list1 = [apple, grapes]

//        System.out.println(b);
        list1.forEach(x -> System.out.print(x + " "));
    }
}
