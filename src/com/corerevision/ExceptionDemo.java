package com.corerevision;

import java.io.IOException;

public class ExceptionDemo {

    public static void main(String[] args) {
        try {
            divide(10, 0);
        } catch (Exception ex) {
            System.out.println("Cannot divide by 0");
        } finally {
            System.out.println("Executed");
        }
        System.out.println("HIiii");
    }


    public static int divide(int a, int b) {
        return a / b;
    }

}
