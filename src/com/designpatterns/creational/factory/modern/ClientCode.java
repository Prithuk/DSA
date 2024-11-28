package com.designpatterns.creational.factory.modern;

public class ClientCode {

    public static void main(String[] args) {

        Creator creator = new ConcreteCreatorA();
        Product product = creator.factoryMethod();
        product.display();

        Creator creator2 = new ConcreteCreatorB();
        Product product2 = creator2.factoryMethod();
        product2.display();
    }
}
