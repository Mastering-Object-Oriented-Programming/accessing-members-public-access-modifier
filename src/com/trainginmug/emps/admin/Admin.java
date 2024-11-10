package com.trainginmug.emps.admin;

import com.trainginmug.emps.employee.Department;
import com.trainginmug.emps.employee.Payroll;
import com.trainginmug.emps.employee.ProcessSalary;

public class Admin {

    String name;
    String email;

    Payroll payroll;
    ProcessSalary processSalary;

    Department department;

    public Admin() {
        payroll = new Payroll();
        department = new Department();
    }

    public Admin(String name, String email) {
        this.name = name;
        this.email = email;
    }

    void processSalary(){
        //invoke ProcessSalary method
        System.out.println("Department id : "+department.id);
        department.departmentDetails();
    }

}
