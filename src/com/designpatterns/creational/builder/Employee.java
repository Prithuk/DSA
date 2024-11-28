package com.designpatterns.creational.builder;

//product
public class Employee {
    private final String empId;
    private final String empName;
    private final String empAddress;

    public Employee(EmployeeBuilder employeeBuilder) {
        this.empId = employeeBuilder.empId;
        this.empName = employeeBuilder.empName;
        this.empAddress = employeeBuilder.empAddress;
    }

    public String getEmpId() {
        return empId;
    }

    public String getEmpName() {
        return empName;
    }

    public String getEmpAddress() {
        return empAddress;
    }

//    static class EmployeeBuilder {
//
//        private String empId;
//        private String empName;
//        private String empAddress;
//
//        public EmployeeBuilder() {
//
//        }
//
//
//        public EmployeeBuilder setEmpId(String empid) {
//            this.empId = empid;
//            return this;
//        }
//
//        public EmployeeBuilder setEmpName(String empName) {
//            this.empName = empName;
//            return this;
//        }
//
//        public EmployeeBuilder setEmpAddress(String empAd) {
//            this.empAddress = empAd;
//            return this;
//        }
//
//        public Employee build() {
//            Employee emp = new Employee(this);
//            return emp;
//        }
//
//    }

    @Override
    public String toString() {
        return "Employee{" +
                "empId='" + empId + '\'' +
                ", empName='" + empName + '\'' +
                ", empAddress='" + empAddress + '\'' +
                '}';
    }
}
