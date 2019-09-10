package com.sakha.boot.repo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.sakha.boot.modal.Employee;

@Repository
public interface EmployeeRepo extends JpaRepository<Employee, Integer>{
	
	
	
	@Query("from Employee where empName=:empName")
	public Employee getEmployeeByName(String empName);
	
//	@Query("update Employee set empName=:empName, age=emp.age where empId=:empId")
//	public Employee updateEmployee(Employee emp,int empId);
//	
	

}
