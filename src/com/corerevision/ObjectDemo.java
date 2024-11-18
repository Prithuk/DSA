package com.corerevision;

public class ObjectDemo {

    public static void main(String[] args) {


        ObjectDemo ob1  = new ObjectDemo();
        System.out.println(ob1);
        System.out.println(ob1.hashCode());

        ObjectDemo ob2 = ob1;
        System.out.println(ob2);

        ob1 = new ObjectDemo();
        System.out.println("new "+ ob1);
        System.out.println("old "+ob2);

    }
}
