package com.java8.MethodReference;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Implementation {

    public static int compareByName(Person a, Person b) {
        return a.getName().compareTo(b.getName());
    }

    public static int compareByAge(Person a, Person b) {
        return a.getAge().compareTo(b.getAge());
    }

    public static void main(String[] args) {
        List<Person> personList = new ArrayList<>();
        personList.add(new Person("vicky", 24));
        personList.add(new Person("poonam", 25));
        personList.add(new Person("sachin", 19));
        Collections.sort(personList, Implementation::compareByName);

//        personList.forEach(i -> System.out.println(i.getName()));
//        personList.stream()
//                .map(x -> x.getName())
//                .forEach(System.out::println);

        Collections.sort(personList, Implementation::compareByAge);
        personList.stream().map(x -> x.getAge()).forEach(System.out::println);
    }
}