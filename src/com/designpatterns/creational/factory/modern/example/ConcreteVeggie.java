package com.designpatterns.creational.factory.modern.example;

public class ConcreteVeggie extends Pizza {
    @Override
    public void prepare() {
        System.out.println("veggie is preparing");
    }

    @Override
    public void bake() {
        System.out.println("veggie is baked");
    }
}
