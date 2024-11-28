package com.corerevision;

public class LocalInnerClass {

    public void innerClassDemo() {
        String s = "Hello";
        class LocalInnerClassDemo {
            String s1 = "test";
            public String testMethod() {
                return s + s1 + "Hello";
            }
        }
        LocalInnerClassDemo localInnerClassDemo = new LocalInnerClassDemo();
        String result = localInnerClassDemo.testMethod();
        System.out.println(result);
    }

    public static void main(String[] args) {
        LocalInnerClass localInnerClass = new LocalInnerClass();
        localInnerClass.innerClassDemo();
    }

}
