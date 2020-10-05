package com.hsbc.view;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.hsbc.dao.EmployeeDaoImpl;
import com.hsbc.dao.IEmployee;
import com.hsbc.model.Employee;

public class MainClass {

	static List<Employee> empList = new ArrayList<>();
	static IEmployee iemp = new EmployeeDaoImpl();
	public static void main(String[] args) {
		
		showMenu();
	}
	
	//To display the menu
	public static void showMenu() {
		int choice;
		Scanner sc = new Scanner(System.in);
		Scanner sc1 = new Scanner(System.in);
		System.out.println("\nSelect below option [1,2,3]");
		System.out.println("1.Store\t2.Sort and Display\t3.Exit");
		
		try {
			choice = sc.nextInt();
			
			switch(choice) {
			case 1: 
				empList.add(iemp.addEmployee());
				break;
			
			case 2:
				System.out.println("Choose below option for sorting:");
				System.out.println("1.Sort by Id Asc\t2.Sort by Id Desc\n3.Sort By Dob Asc\t4.Sort by Dob Desc\n5.Sort By Salary Asc\t6.Sort by Salary Desc\n7.Sort By name Asc\t8.Sort By name Desc");
				int flag = sc1.nextInt();
				switch(flag) {
				case 1:
					iemp.sortEmployee(empList,"id","asc");
					break;
				case 2:
					iemp.sortEmployee(empList,"id","desc");
					break;
				case 3:
					iemp.sortEmployee(empList,"dob","asc");
					break;
				case 4:
					iemp.sortEmployee(empList,"dob","desc");
					break;	
				case 5:
					iemp.sortEmployee(empList,"salary","asc");
					break;
				case 6:
					iemp.sortEmployee(empList,"salary","desc");
					break;
				case 7:
					iemp.sortEmployee(empList,"name","asc");
					break;
				case 8:
					iemp.sortEmployee(empList,"name","desc");
					break;
				default:
					System.out.println("Invalid input");
					break;
		
				}
				break;
			default:
				System.out.println("exiting program");
				System.exit(0);
				break;
			}
		}
		catch(Exception e) {
			System.out.println("Invalid choice, please try again");
			
		}
		showMenu();
		
	}
}
