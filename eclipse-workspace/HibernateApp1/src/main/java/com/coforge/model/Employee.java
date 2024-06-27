package com.coforge.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="emp1")
public class Employee {
	
	@Id
	@GeneratedValue
	
	
	
	@Column(name="emp_id")
	private int id;
	@Column(name="emp_name",length=20,nullable=false)
	private String name;
	private LocalDate dob;
	@Column(name="emp_salary",nullable=false)
	private float salary;
	
	
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public float getSalary() {
		return salary;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	public LocalDate getDob() {
		return dob;
	}
	public void setDob(LocalDate dob) {
		this.dob = dob;
	}
	
	
	
	
}
