package com.trainginmug.emps.employee;

public class Payroll {

    int empId;
    double salary;

    Department department;

    public Payroll() {
        department = new Department();
    }

    void processEmployeeSalary(){
        System.out.println("Employee Salary is processed");
        System.out.println("Department id : " + department.id);
        department.departmentDetails();
    }
}
