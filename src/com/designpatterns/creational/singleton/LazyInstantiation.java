package com.designpatterns.creational.singleton;

public class LazyInstantiation {
    private LazyInstantiation() {
        System.out.println("First instance is created. ");
    }

    static LazyInstantiation instantiation;


    public static LazyInstantiation getInstance() {
        if (instantiation == null) {
            instantiation = new LazyInstantiation();
        }
        return instantiation;
    }
}
