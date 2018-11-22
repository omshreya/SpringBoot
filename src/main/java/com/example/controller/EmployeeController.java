package com.example.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.example.service.EmployeeService;
import com.example.springboot.Employee;

@Controller
@RequestMapping("/ctrl")
public class EmployeeController 
{
	
	private EmployeeService employeeservice;
	
	@Autowired
	public EmployeeController(EmployeeService employeeService) 
	{
		this.employeeservice=employeeService;
	}
	
	@GetMapping("/saveemp")
	public ModelAndView showInsert()
	{
		System.out.println("in insert");
		return new ModelAndView("Insert", "Emp", new Employee());
		//return "Insert";
	}
	
	@PostMapping("/saveemp")
	public ModelAndView addEmp(@ModelAttribute("Emp") Employee employee,Model model)
	{
		try
		{
			employeeservice.create(employee);
			model.addAttribute("message", "Employee added");
		}
		catch(Exception e)
		{
			model.addAttribute("message", "Filed");
		}
		return new ModelAndView("Insert","Emp",employee);
	}
	
	@RequestMapping("/home")
	public String showHome(Model model)
	{
		List<Employee> empList=new ArrayList<Employee>();
		empList=employeeservice.empList();
		model.addAttribute("empList", empList);
		employeeservice.empList();
		return "Home";
	}
	
//	@GetMapping(value = "/doEdit/{id}") 
//	public String showEdit(@PathVariable Integer id,Model model)
//	{
//		//employeeservice.updateRecord(id);
//		model.addAttribute("id","${id}");
//		return "Edit";
//	}
	
//	@PostMapping(value = "/doEdit/{id}") 
//	public String displayEdit(@PathVariable Integer id,Model model)
//	{
//		//employeeservice.updateRecord(id);
//		model.addAttribute("id","${id}");
//		return "Edit";
//	}
//	
//	@RequestMapping(value="/doDelete" , method=RequestMethod.GET)
//	public String showDelete(@RequestParam("id")Integer id,Model model)
//	{
//		try
//		{
//			employeeservice.deleteRecord(id);
//			model.addAttribute("message", "Record Deleted");
//		}
//		catch(Exception e)
//		{
//			model.addAttribute("message", "Deletion is failed");
//		}
//		//employeeservice.deleteRecord(id);
//		return "Delete";
//	}
	
	@RequestMapping("/doEdit/{id}")
	public String editEmp(@RequestParam("id") Integer id,Model model) 
	{
		Optional<Employee> employee = employeeservice.find(id);
		System.out.println(employee.toString());
		System.out.println(employee.get());
		Employee emp=employee.get();
	    model.addAttribute("id", emp.getId());
		model.addAttribute("name", emp.getName());
		model.addAttribute("salary", emp.getSalary());
		model.addAttribute("dept", emp.getDept());
		model.addAttribute("age", emp.getAge());
		System.out.println(emp.getName()+emp.getDept());
		model.addAttribute("emp", employee);
		return "Edit";
	}
	
	
	@RequestMapping("/emp/{id}")
	public String getEmp(@RequestParam("id") Integer id,Model model) 
	{
		Optional<Employee> employee = employeeservice.find(id);
		System.out.println(employee.toString());
		System.out.println(employee.get());
		Employee emp=employee.get();
	    model.addAttribute("id", emp.getId());
		model.addAttribute("name", emp.getName());
		model.addAttribute("salary", emp.getSalary());
		model.addAttribute("dept", emp.getDept());
		model.addAttribute("age", emp.getAge());
		System.out.println(emp.getName()+emp.getDept());
		model.addAttribute("emp", employee);
		return "Details";
	}
	
	@RequestMapping("/doSearch")
	public String doSearch()
	{
		return "Search";
	}
}
