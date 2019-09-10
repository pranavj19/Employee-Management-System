package com.sakha.boot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sakha.boot.modal.Employee;
import com.sakha.boot.repo.EmployeeRepo;

@Service
public class EmployeeService {
	
	@Autowired
	EmployeeRepo repo;
	

	public Employee save(Employee emp) {
		return repo.save(emp);
		
	}
	public Employee getByName(String name) {
		return repo.getEmployeeByName(name);
	}
	
	public Employee getEmployee(int empId) {
		return repo.getOne(empId);
	}
	
	public List<Employee> getAllEmployee(){
		return repo.findAll();
	}
	public void deleteEmployee(int empId) {
		 repo.deleteById(empId);
	}
	
	public Employee update(Employee emp) {
		// TODO Auto-generated method stub
		Employee myEmp=repo.getOne(emp.getEmpId());
		//System.out.println(myEmp);
		myEmp.setSal(emp.getSal());
		myEmp.setAge(emp.getAge());
		myEmp.setEmpName(emp.getEmpName());
		return repo.save(myEmp);
	}

}
