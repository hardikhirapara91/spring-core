package com.hardik.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.hardik.spring.configuration.AppConfig;
import com.hardik.spring.model.Employee;
import com.hardik.spring.service.EmployeeService;

/**
 * Application Main Class
 *
 * author HARDIK HIRAPARA
 */
public class App {
	public static void main(String[] args) {

		AbstractApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		EmployeeService employeeService = (EmployeeService) context.getBean("employeeService");

		Employee employee = new Employee();
		employee.setId(1);
		employee.setName("Hardik Hirapara");
		employeeService.save(employee);

		context.close();
	}
}
