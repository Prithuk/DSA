package com.designpatterns.creational.factory.modern.example;

public class ConcreteCreatorVeggie extends Creator {


    @Override
    public Pizza factoryMethod() {
        return new ConcreteVeggie();
    }
}
