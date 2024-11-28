package com.string;

public class StringBuilderDemo {

    public static void main(String[] args) {

        StringBuilder str = new StringBuilder("1");
        str.append("Prithu");
        System.out.println(str);
        System.out.println(str.capacity());
    }

}
