package com.designpatterns.creational.factory.modern.example;

public class ConcretePepperoni extends Pizza {
    @Override
    public void prepare() {
        System.out.println("pepporoni is preparing");
    }

    @Override
    public void bake() {
        System.out.println("peppononi is baked");
    }
}
