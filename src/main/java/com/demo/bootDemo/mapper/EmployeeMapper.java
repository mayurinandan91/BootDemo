package com.demo.bootDemo.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.demo.bootDemo.model.EmployeeModel;

public class EmployeeMapper implements RowMapper<EmployeeModel> 
{

	@Override
	public EmployeeModel mapRow(ResultSet rs, int arg1) throws SQLException 
	{
		// TODO Auto-generated method stub
		EmployeeModel emp=new EmployeeModel();
		emp.setEid(rs.getInt("eid"));
		emp.setName(rs.getString("name"));
		emp.setMob_no(rs.getString("mob_no"));
		emp.setGender(rs.getString("gender"));
		emp.setSalary(rs.getString("salary"));
		
		return emp;
	}

	
}
