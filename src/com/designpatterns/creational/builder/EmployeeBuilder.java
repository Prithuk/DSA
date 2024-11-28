package com.designpatterns.creational.builder;

//builder
public class EmployeeBuilder {

    String empId;
    String empName;
    String empAddress;

    public EmployeeBuilder() {

    }

    public EmployeeBuilder setEmpId(String empid) {
        this.empId = empid;
        return this;
    }

    public EmployeeBuilder setEmpName(String empName) {
        this.empName = empName;
        return this;
    }

    public EmployeeBuilder setEmpAddress(String empAd) {
        this.empAddress = empAd;
        return this;
    }

    public Employee build() {
        Employee emp = new Employee(this);
        return emp;
    }


}
