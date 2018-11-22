package com.example.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.EmployeeDao;
import com.example.springboot.Employee;
@Service
public class EmployeeServiceImpl implements EmployeeService
{
	@Autowired
	private EmployeeDao empdao;
	
	@Autowired
	public EmployeeServiceImpl(EmployeeDao empDao) 
	{
		this.empdao=empDao;
	}
	
	@Transactional
	@Override
	public void create(Employee employee) 
	{
		empdao.create(employee);
	}
	
	//@Transactional
	@Override
	public Optional<Employee> find(int id) 
	{
		//return new Employee();
		return empdao.find(id);
	}
	
	@Override
	public List<Employee> empList() 
	{
		return empdao.empList();
	}

	@Override
	public void deleteRecord(int id) 
	{
		empdao.deleteRecord(id);
	}
	
	public void updateRecord(int id,Employee employee)
	{
		
	}

	@Override
	public void updateRecord(Employee employee, Integer id) {
		// TODO Auto-generated method stub
		
	}
	
}



