package com.example.service;

import java.util.List;
import java.util.Optional;

import com.example.springboot.*;

public interface EmployeeService 
{
	public void create(Employee employee);
	public Optional<Employee> find(int id);
	public List<Employee> empList();
	public void deleteRecord(int id);
	public void updateRecord(Employee employee, Integer id);
}
