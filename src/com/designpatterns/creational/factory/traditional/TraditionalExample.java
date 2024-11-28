package com.designpatterns.creational.factory.traditional;

public class TraditionalExample {

    public static void main(String[] args) {

        Product product = new ConcreteProductA();
        product.display();

        Product product2 = new ConcreteProductB();
        product2.display();
    }
}
