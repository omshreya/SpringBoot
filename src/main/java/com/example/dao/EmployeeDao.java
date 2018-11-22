package com.example.dao;

import java.util.List;
import java.util.Optional;

import com.example.springboot.Employee;

public interface EmployeeDao 
{
	public void create(Employee employee);
	public Optional<Employee> find(int id);
	public List<Employee> empList();
	public void deleteRecord(int id);
	void editRecord();
}
