package com.example.SecondSpringApp.Model;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class EmployeeBean {

    private String name;
    private int id;

    @Autowired  // Injecting DepartmentBean Dependency
    private DepartmentBean department;

    public EmployeeBean() {
        this.name = "John Doe";
        this.id = 101;
    }

    public void showEmployeeDetails() {
        System.out.println("Employee ID: " + id);
        System.out.println("Employee Name: " + name);
        department.showDepartmentDetails();
    }
}

