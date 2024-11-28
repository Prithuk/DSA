package com.designpatterns.creational.factory.modern.example;

public class ConcreteCreatorPepporoni extends Creator {
    @Override
    public Pizza factoryMethod() {
        return new ConcretePepperoni();
    }
}
