package com.corerevision.generics;

public class Pair<T, U> {

    private T first;
    private U second;

    // Constructor to initialize both objects
    public Pair(T first, U second) {
        this.first = first;
        this.second = second;
    }

    // Getter for the first object
    public T getFirst() {
        return first;
    }

    // Getter for the second object
    public U getSecond() {
        return second;
    }

    // Method to swap the elements and return a new Pair<U, T>
    public Pair<U, T> swap() {
        return new Pair<>(second, first);
    }

    @Override
    public String toString() {
        return "Pair{" + "first=" + first + ", second=" + second + '}';
    }

    public static void main(String[] args) {

        Pair<String, Integer> pair  = new Pair<>("Prithu", 1);
        System.out.println(pair);

        System.out.println(pair.swap());


    }
}
