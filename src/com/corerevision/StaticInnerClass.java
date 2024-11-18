package com.corerevision;

public class StaticInnerClass {
    static int outerVar = 5;

    public static void outerMethod() {
        System.out.println(outerVar);
    }

    static class InnerClass {
        static int innerVar;

        public static void innerMethod() {
            innerVar = 2;
            System.out.println(innerVar);
        }
    }

    public static void main(String[] args) {
        StaticInnerClass.outerMethod();
        StaticInnerClass.InnerClass.innerMethod();
    }
}
