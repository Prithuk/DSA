package com.designpatterns.creational.factory.modern.example;

public class ConcreteCreatorCheese extends Creator {
    @Override
    public Pizza factoryMethod() {
        return new ConcreteCheese();
    }
}
