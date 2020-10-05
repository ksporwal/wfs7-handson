package com.hsbc.dao;

import java.util.List;

import com.hsbc.model.Employee;

public interface IEmployee {

	List<Employee> getAllEmployee();
	Employee addEmployee();
	void sortEmployee(List<Employee> empList, String varName, String type);
}
