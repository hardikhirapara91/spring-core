package com.hardik.spring.model;

import org.joda.time.LocalDate;
import org.springframework.stereotype.Component;

/**
 * Employee Model
 * 
 * @author HARDIK HIRAPARA
 *
 */
@Component
public class Employee {

	private Integer id;
	private String name;
	private LocalDate assessmentDate;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDate getAssessmentDate() {
		return assessmentDate;
	}

	public void setAssessmentDate(LocalDate assessmentDate) {
		this.assessmentDate = assessmentDate;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", assessmentDate=" + assessmentDate + "]";
	}
}
