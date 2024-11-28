package com.string;

public class StringBuilderClass {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder("Prithu");
        stringBuilder.setCharAt(5,'O');
        System.out.println(stringBuilder);

        stringBuilder.append(12345);
        System.out.println(stringBuilder);

        stringBuilder.insert(0,"don");
        System.out.println(stringBuilder);

        stringBuilder.delete(0,3);
        System.out.println(stringBuilder);
    }
}
