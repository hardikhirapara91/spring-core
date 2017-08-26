package com.hardik.spring.model;

/**
 * Student
 * 
 * @author HARDIK HIRAPARA
 *
 */
public class Student {

	private Integer id;
	private String name;
	private String std;

	public Student(String name, Integer id) {
		this.name = name;
		this.id = id;
	}

	public Student(String name, String std) {
		this.name = name;
		this.std = std;
	}

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

	public String getStd() {
		return std;
	}

	public void setStd(String std) {
		this.std = std;
	}

}
