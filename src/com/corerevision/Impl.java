package com.corerevision;

public class Impl{

    public static void main(String[] args) {

        for(EnumDemo d: EnumDemo.values()){
//            System.out.println(d + " ");
            System.out.print(d.name() + " ");
        }
//        System.out.println();
//        System.out.println(EnumDemo.SATURDAY);
//        System.out.println();
    }
}
