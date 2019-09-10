package com.sakha.boot.controller;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.sakha.boot.modal.Employee;
import com.sakha.boot.service.EmployeeService;

@Controller
public class EmployeeController {
	
	@Autowired
	EmployeeService service;
	
	@PostMapping("/employee")
	public String saveEmployee(@ModelAttribute Employee emp,Model m) {
		Employee savedEmp=service.save(emp);
		m.addAttribute("emp",savedEmp);
		return "view";
		
	}
	
	@PostMapping("/byname")
	public String getByName(@RequestParam("empName")String empName,Model m) {
		Employee empN=service.getByName(empName);
		m.addAttribute("empName",empN);
		return "viewname";
	}
	
	@PostMapping("/viewone")
	public String getEmployee(@RequestParam("empId")int empId,Model m) {
		Employee e=service.getEmployee(empId);
		m.addAttribute("em",e);
		return "viewone";
	}
	
	@PostMapping("/delete")
	public String deleteEmployee(@RequestParam("empId")int empId,Model m) {
		Employee d=service.getEmployee(empId);
		 service.deleteEmployee(empId);
		m.addAttribute("d",d);
		return "delete";
				
	}
	
	@PostMapping("/getall")
	public String getAllEmployee(Model m) {
		
		List<Employee> empList=service.getAllEmployee();
		m.addAttribute("empList",empList);
		return "getall";
	}
	
	@PostMapping("/updatecheck")
	public String updateCheck(@RequestParam("empId")int empId,Model m) {
		Employee upd=service.getEmployee(empId);
		m.addAttribute("empId",empId);
		if(upd!=null)
			return "updemp";
		else
			return "fail";
		
	}
	
//	@PostMapping("/update")
//	public String updateEmployee(@RequestParam("empName")String empName,@RequestParam("age")int age,@RequestParam("empId")int empId,Model m) {
//		Employee update=service.update(empName,age, empId);
//		/*
//		 * m.addAttribute("empName",empName); m.addAttribute("age",age);
//		 * m.addAttribute("empId",empId);
//		 */
//		
//		
//		return "success";
//	}
	
	@PostMapping("/update")
	public String updateEmployee(@ModelAttribute Employee emp,@RequestParam("sal")float sal,@RequestParam("empId")int empId,@RequestParam("age")int age,@RequestParam("dt")@DateTimeFormat(pattern="yyyy-MM-dd") LocalDate dt,@RequestParam("empName")String empName, Model m) {
		emp.setEmpName(empName);
		emp.setDt(dt);
		emp.setSal(sal);
		emp.setAge(age);
		emp.setEmpId(empId);
		Employee update=service.update(emp);
		m.addAttribute("emp",emp);
		return "success";
}
}
