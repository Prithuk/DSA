package com.java8.MethodReference;

import java.util.stream.Stream;

public class Impl {

    public static void main(String[] args) {
        IWork work = Stuff::doStuff;
        IWork work1 = () -> Stuff.doStuff();
        work.doTask();
        work1.doTask();
    }
}
