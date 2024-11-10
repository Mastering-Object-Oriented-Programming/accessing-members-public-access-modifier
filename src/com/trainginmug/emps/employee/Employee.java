package com.trainginmug.emps.employee;

public class Employee extends Department{

    int id;
    String name;

    Payroll payroll;
    ProcessSalary processSalary;

    public Employee(){
    }

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    void employeeDetails(){
        System.out.println("Department id : " + super.id);
        super.departmentDetails();
    }
}
