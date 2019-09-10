package com.sakha.boot.modal;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
public class Employee {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int empId;
	
	String empName;
	int age;
	
	@DateTimeFormat(pattern="yyyy-MM-dd")
	LocalDate dt;
	
	float sal;
	/* float salary; */
	
	/*
	 * @DateTimeFormat(pattern="yyyy-MM-dd") LocalDate dt;
	 */
	
	
	
	/*
	 * public float getSalary() { return salary; }
	 * 
	 * 
	 * public void setSalary(float salary) { this.salary = salary; }
	 */


	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public float getSal() {
		return sal;
	}

	public void setSal(float sal) {
		this.sal = sal;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public LocalDate getDt() {
		return dt;
	}

	public void setDt(LocalDate dt) {
		this.dt = dt;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", age=" + age + ", dt=" + dt + ", sal=" + sal
				+ "]";
	}

	public Employee(int empId, String empName, int age, LocalDate dt, float sal) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.age = age;
		this.dt = dt;
		this.sal = sal;
	}

	

	

	
}


	
	


