package com.java8.interfacedemo;

public interface B {

    int data = 0;
    double a=5;
    default void show() {
        System.out.println("Hello from default Interface B");
    }

    static void retunHello() {
        System.out.println("Hello from static B");
    }

    void testB();
}
