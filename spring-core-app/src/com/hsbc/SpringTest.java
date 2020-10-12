package com.hsbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringTest {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
//		DBUtility utility = (DBUtility)context.getBean("db");
//		System.out.println("Username = "+utility.getUsername());
//		System.out.println("Password = "+utility.getPassword());
//		utility.getConnection();
		
		AccountDao accountDao = (AccountDao)context.getBean("dao");
		accountDao.createAccount();
		accountDao.getAccounts();
		
		
	}

}
