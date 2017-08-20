package com.hardik.spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hardik.spring.dao.EmployeeDao;
import com.hardik.spring.model.Employee;

/**
 * Employee Service Implementation
 * 
 * @author HARDIK HIRAPARA
 *
 */
@Service("employeeService")
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private DateService dateService;

	@Autowired
	private EmployeeDao employeeDao;

	/**
	 * Save Employee
	 */
	@Override
	public void save(Employee employee) {
		try {
			employee.setAssessmentDate(dateService.getNextAssessmentDate());
			employeeDao.save(employee);
		} catch (Exception ex) {
			System.out.println("Exception | EmployeeServiceImpl.save() : " + ex);
		}
	}

}
