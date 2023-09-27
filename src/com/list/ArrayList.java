package com.list;

import java.util.List;
import java.util.Vector;

public class ArrayList {

    public static void main(String[] args) {
        List<Employee> employeeList = new Vector<>();
        employeeList.add(new Employee("Kathet", "Kathet", 10));
        employeeList.add(new Employee("Kathet", "Kathet", 10));
        employeeList.add(new Employee("Kathet", "Kathet", 10));
        employeeList.add(new Employee("Kathet", "Kathet", 10));
        employeeList.add(new Employee("Kathet", "Kathet", 10));
        employeeList.add(new Employee("Kathet", "Kathet", 10));

//        employeeList.forEach(employee -> System.out.println(employee));

        Object [] list = employeeList.toArray();
        System.out.println(list);
    }
}
