
package com.demo.bootDemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.bootDemo.model.EmployeeModel;
import com.demo.bootDemo.service.EmployeeService;

@RestController
public class EmployeeController 
{
	@Autowired
	EmployeeService service;
	
	@RequestMapping("/getEmployeeData")
	public List<EmployeeModel> getEmployeeData()
	{
		List<EmployeeModel> emp=service.getData();
		return emp;
	}

}
