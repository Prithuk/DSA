package com.java8.interfacedemo;

public class AbstractDem implements A {


    @Override
    public void checkA() {
        System.out.println("Hello A");
    }

    public static void main(String[] args) {

        A a = new AbstractDem();
        a.checkA();
    }
}
