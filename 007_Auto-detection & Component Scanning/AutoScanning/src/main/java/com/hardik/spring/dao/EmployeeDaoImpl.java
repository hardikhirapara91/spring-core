package com.hardik.spring.dao;

import org.springframework.stereotype.Repository;

import com.hardik.spring.model.Employee;

/**
 * Employee DAO Implementation
 * 
 * @author HARDIK HIRAPARA
 *
 */
@Repository("employeeDao")
public class EmployeeDaoImpl implements EmployeeDao {

	/**
	 * Save Employee
	 */
	@Override
	public void save(Employee employee) {
		/*
		 * Logic to save in DB goes here
		 */
		System.out.println("Employee save successfully with id=" + employee.getId() + " and name=" + employee.getName()
				+ " and assessmentDate=" + employee.getAssessmentDate());
	}

}
