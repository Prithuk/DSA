package com.corerevision;

public class ThrowDemo {

    public static void main(String[] args) {
//        try {
            check(15);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
        System.out.println("hello");
    }


    public static void check(int age) {
        if (age > 18) {
            System.out.println("You are allowed to vote");
        } else {
            throw new IllegalArgumentException("You cannot vote");
        }

    }
}
