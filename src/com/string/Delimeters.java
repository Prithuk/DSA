package com.string;

public class Delimeters {

    public static void main(String[] args) {
        String str = "H ello, world!";
        String[] tokens = str.split(" "); // Split using a comma as the delimiter

        for (String token : tokens) {
            System.out.println(token); // Prints "Hello" and " world!"
        }
    }
}
