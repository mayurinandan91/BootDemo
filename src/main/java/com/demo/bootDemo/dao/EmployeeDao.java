package com.demo.bootDemo.dao;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.demo.bootDemo.mapper.EmployeeMapper;
import com.demo.bootDemo.model.EmployeeModel;

@Component
public class EmployeeDao 
{
	@Autowired
	JdbcTemplate template;
	
	public List<EmployeeModel> getData()
	{
		String query="select * from Employee";
		List<EmployeeModel> empList=template.query(query, new EmployeeMapper());
		return empList;
	}

}
