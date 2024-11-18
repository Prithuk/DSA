package com.corerevision.generics;

public class GenericDemo<T> {
    T value;
    public GenericDemo() {
        System.out.println("First time Generics. ");
    }

    public GenericDemo(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public static void main(String[] args) {
        GenericDemo<Integer> data = new GenericDemo<>();
        System.out.println(data);
        GenericDemo<Integer> data1 = new GenericDemo<>(5);
        System.out.println(data1.getValue());
    }
}
