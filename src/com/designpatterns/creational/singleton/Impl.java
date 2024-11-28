package com.designpatterns.creational.singleton;

public class Impl {

    public static void main(String[] args) {

        Singleton s = Singleton.getInstance();
        System.out.println(s);
        Singleton s1 = Singleton.getInstance();
        System.out.println(s1);
    }
}
