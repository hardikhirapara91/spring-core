package com.hardik.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.hardik.spring.model.Employee;
import com.hardik.spring.service.EmployeeService;

/**
 * Application Main Class
 * 
 * @author HARDIK HIRAPARA
 *
 */
public class AppWithConfig {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.scan("com.hardik.spring");
		context.refresh();

		EmployeeService employeeService = (EmployeeService) context.getBean("employeeService");

		Employee employee = new Employee();
		employee.setId(1);
		employee.setName("Hardik Hirapara");
		employeeService.save(employee);

		context.close();
	}
}
