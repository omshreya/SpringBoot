package com.example.springboot;

import org.springframework.data.repository.CrudRepository;

public interface EmpRepository extends CrudRepository<Employee,Integer>
{
	
}
