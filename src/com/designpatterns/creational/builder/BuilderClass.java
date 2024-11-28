package com.designpatterns.creational.builder;

public class BuilderClass {

    public static void main(String[] args) {

        EmployeeBuilder x = new EmployeeBuilder();

        x.setEmpId("1").setEmpName("Prithu").setEmpAddress("Kapan");

        System.out.println(x);

        Employee emp = x.build();
        System.out.println(emp);
    }




}
