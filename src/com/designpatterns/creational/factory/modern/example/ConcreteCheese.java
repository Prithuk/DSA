package com.designpatterns.creational.factory.modern.example;

public class ConcreteCheese extends Pizza {
    @Override
    public void prepare() {
        System.out.println("Cheese is preparing");
    }

    @Override
    public void bake() {
        System.out.println("Cheese is baked.");

    }
}
