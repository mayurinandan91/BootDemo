package com.demo.bootDemo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.demo.bootDemo.dao.EmployeeDao;
import com.demo.bootDemo.model.EmployeeModel;

@Component
public class EmployeeService 
{
	@Autowired
	EmployeeDao dao;
	
	public List<EmployeeModel> getData()
	{
		List<EmployeeModel> emp=dao.getData();
		return emp;
	}

}
