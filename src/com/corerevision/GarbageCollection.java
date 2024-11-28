package com.corerevision;

public class GarbageCollection {

    public static void main(String[] args) {
        GarbageCollection ob = new GarbageCollection();
        GarbageCollection ob1 = new GarbageCollection();
        GarbageCollection ob2 = new GarbageCollection();
        GarbageCollection ob3 = new GarbageCollection();
        GarbageCollection ob4 = new GarbageCollection();
        System.out.println(ob);
        System.out.println(ob1);
        System.out.println(ob2);
        System.out.println(ob3);
        System.out.println(ob4);
        ob = null;
        System.out.println(ob);
        System.gc();
        System.out.println(ob);
    }
}
