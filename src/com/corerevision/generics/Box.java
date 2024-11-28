package com.corerevision.generics;

public class Box<T> {

    T item;

    public T getItem() {
        return item;
    }

    public void setItem(T item) {
        this.item = item;
    }

    @Override
    public String toString() {
        return "Box{" + "item=" + item + '}';
    }

    public static void main(String[] args) {

        Box<Character> ob = new Box<>();
        ob.setItem('r');
        System.out.println(ob);
    }
}
