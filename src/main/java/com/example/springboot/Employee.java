package com.example.springboot;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Emp")
public class Employee 
{
	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@Column
	private String name;
	@Column
	private int salary;
	@Column
	private String dept;
	@Column
	private int age;
	
	
	public Employee() 
	{
	}

	public Employee(Integer id, String name, int salary, String dept, int age) 
	{
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.dept = dept;
		this.age = age;
	}

	public Integer getId() 
	{
		return id;
	}

	public void setId(Integer id) 
	{
		this.id = id;
	}

	public String getName() 
	{
		return name;
	}

	public void setName(String name) 
	{
		this.name = name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) 
	{
		this.salary = salary;
	}

	public String getDept() 
	{
		return dept;
	}

	public void setDept(String dept) 
	{
		this.dept = dept;
	}

	public int getAge() 
	{
		return age;
	}

	public void setAge(int age) 
	{
		this.age = age;
	}

	@Override
	public String toString() 
	{
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", dept=" + dept + ", age=" + age + "]";
	}

	public boolean isPresent()
	{
		// TODO Auto-generated method stub
		return false;
	}
	
}
