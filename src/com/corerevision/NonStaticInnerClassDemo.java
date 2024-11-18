package com.corerevision;

public class NonStaticInnerClassDemo {

    int outerVar;

    public void outerClass() {
        outerVar = 5;
        System.out.println("i love outervar" + outerVar);
    }

    class InsideInnerClass {
        int innerVar;
        public void insideInnerClass() {
            innerVar = 4;
            System.out.println("I love innervar" + innerVar);
        }
    }

    public static void main(String[] args) {
        NonStaticInnerClassDemo innerClassDemo = new NonStaticInnerClassDemo();
        innerClassDemo.outerClass();
        InsideInnerClass insideInnerClass = innerClassDemo.new InsideInnerClass();

        insideInnerClass.insideInnerClass();

    }
}
