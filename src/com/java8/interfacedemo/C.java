package com.java8.interfacedemo;

public class C implements B {


    @Override
    public void testB() {
        System.out.println("Hello from IMPL");
    }

    public static void main(String[] args) {
        B b = new C();
        System.out.println(b.a);
        b.show();
        B.retunHello();
    }
}
