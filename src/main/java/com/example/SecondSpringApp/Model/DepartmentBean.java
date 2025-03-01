package com.example.SecondSpringApp.Model;


import org.springframework.stereotype.Component;

@Component
public class DepartmentBean {

    private String deptName = "IT";

    public void showDepartmentDetails() {
        System.out.println("Department: " + deptName);
    }
}

