package com.collectionframework.set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Demo1 {

    public static void main(String[] args) {
        Set<Integer> hashset = new HashSet<>();
        hashset.add(10);
        hashset.add(1);
        hashset.add(2);
        hashset.add(10);
        hashset.add(3);
        System.out.println(hashset);
        System.out.println("=====");

        Set<Integer> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add(10);
        linkedHashSet.add(1);
        linkedHashSet.add(2);
        linkedHashSet.add(10);
        linkedHashSet.add(3);
        System.out.println(linkedHashSet);

        Set<Integer> treeSet = new TreeSet<>();
        treeSet.add(10);
        treeSet.add(1);
        treeSet.add(2);
        treeSet.add(10);
        treeSet.add(3);
        System.out.println(treeSet);


    }
}
