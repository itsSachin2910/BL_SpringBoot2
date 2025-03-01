package com.example.SecondSpringApp;

import com.example.SecondSpringApp.Model.EmployeeBean;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringDependencyInjectionApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringDependencyInjectionApplication.class, args);

		// Retrieve EmployeeBean from Application Context
		EmployeeBean employee = context.getBean(EmployeeBean.class);
		employee.showEmployeeDetails();
	}
}
