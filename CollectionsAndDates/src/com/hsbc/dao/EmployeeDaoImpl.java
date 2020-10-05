package com.hsbc.dao;

import java.time.LocalDate;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import com.hsbc.model.Employee;

public class EmployeeDaoImpl implements IEmployee{

	@Override
	public List<Employee> getAllEmployee() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Employee addEmployee() {
		
		Scanner sc = new Scanner(System.in);
		Scanner sc1 = new Scanner(System.in);
		Scanner sc2 = new Scanner(System.in);
		Scanner sc3 = new Scanner(System.in);
		
		System.out.println("Enter employee id::");
		int id = sc.nextInt();
		System.out.println("Enter employee name:");
		String name = sc1.nextLine();
		System.out.println("Enter salary:");
		double salary = sc2.nextDouble();
		System.out.println("Enter dob (yyyy-mm-dd)");
		LocalDate dob = LocalDate.parse(sc3.nextLine());
		
		
		Employee temp = new Employee(id,name,salary,dob);
		return temp;
		
	}

	@Override
	public void sortEmployee(List<Employee> empList, String varName, String type) {
		
		if(varName.equals("id")) {
			if(type.equals("asc")) {
				Collections.sort(empList,(u1,u2) -> u1.getId()-u2.getId());
				
			}
			else {
				Collections.sort(empList,(u1,u2) -> u2.getId()-u1.getId());
				
			}
			int y=0;
			for(Employee e:empList) {
				if(y<3)
					System.out.println("Employee data::"+e);
				y++;
			}
			if(empList.size()==0) {
				System.out.println("No Data Available");
			}
		}
		else if(varName.equals("name")) {
			if(type.equals("asc")) {
				Collections.sort(empList,(u1,u2) -> u1.getName().compareTo(u2.getName()));
			}
			else {
				Collections.sort(empList,(u1,u2) -> u2.getName().compareTo(u1.getName()));
			}
			int y=0;
			for(Employee e:empList) {
				if(y<3)
					System.out.println("Employee data::"+e);
				y++;
			}
			if(empList.size()==0) {
				System.out.println("No Data Available");
			}
		}
		else if(varName.equals("dob")) {
			if(type.equals("asc")) {
				Collections.sort(empList,(u1,u2) -> u1.getDob().compareTo(u2.getDob()));
			}
			else {
				Collections.sort(empList,(u1,u2) -> u2.getDob().compareTo(u1.getDob()));
			}
			int y=0;
			for(Employee e:empList) {
				if(y<3)
					System.out.println("Employee data::"+e);
				y++;
			}
			if(empList.size()==0) {
				System.out.println("No Data Available");
			}
		}
		else if(varName.equals("salary")) {
			if(type.equals("asc")) {
				Collections.sort(empList,(u1,u2) -> Double.compare(u1.getSalary(), u2.getSalary()));
			}
			else {
				Collections.sort(empList,(u1,u2) -> Double.compare(u2.getSalary(), u1.getSalary()));
			}
			int y=0;
			for(Employee e:empList) {
				if(y<3)
				System.out.println("Employee data::"+e);
				y++;
			}
			if(empList.size()==0) {
				System.out.println("No Data Available");
			}
		}
	}



}
