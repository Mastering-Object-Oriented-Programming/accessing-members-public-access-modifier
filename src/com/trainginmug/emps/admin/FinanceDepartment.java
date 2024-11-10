package com.trainginmug.emps.admin;

import com.trainginmug.emps.employee.Department;

public class FinanceDepartment extends Department {

    int noOfEmployee;
    double budget;

    public FinanceDepartment() {
    }

    public FinanceDepartment(int id, String name, String managerName, int noOfEmployee, double budget) {
        super(id, name, managerName);
        this.noOfEmployee = noOfEmployee;
        this.budget = budget;
    }

    void processBudget(){
        System.out.println("Department id : " + id);
        departmentDetails();
    }

}
