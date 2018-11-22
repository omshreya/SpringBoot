package com.example.dao;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.springboot.EmpRepository;
import com.example.springboot.Employee;



@Repository
public class EmployeeDaoImpl implements EmployeeDao 
{
	@Autowired
	private EmpRepository repo;
	
	@Override
	public void create(Employee employee) 
	{	 
		 repo.save(employee);
	}

	@Override
	public Optional<Employee> find(int id) 
	{	
		return repo.findById(id);
	}

	@Override
	public List<Employee> empList() 
	{
		return (List<Employee>) repo.findAll();
	}

	@Override
	public void editRecord() 
	{
		
	}

	@Override
	public void deleteRecord(int id) 
	{
		repo.deleteById(id);
	}

}
