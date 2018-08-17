
package com.demo.bootDemo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController 
{
	@RequestMapping("/getEmployeeData")
	public String getEmployeeData()
	{
		return "Hello";
	}

}
