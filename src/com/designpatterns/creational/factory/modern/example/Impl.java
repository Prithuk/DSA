package com.designpatterns.creational.factory.modern.example;

public class Impl {

    public static void main(String[] args) {

        Creator creator = new ConcreteCreatorCheese();
        Pizza pizza = creator.factoryMethod();
        pizza.bake();
        pizza.prepare();
    }
}
