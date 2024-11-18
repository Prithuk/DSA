package com.designpatterns.creational.singleton;

public class LazyImpl {

    public static void main(String[] args) {

        LazyInstantiation s = LazyInstantiation.getInstance();
        LazyInstantiation s1 = LazyInstantiation.getInstance();

        System.out.println(s);
        System.out.println(s1);

    }
}
