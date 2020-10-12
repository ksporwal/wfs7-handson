package com.hsbc.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.hsbc.model.service.ProfileService;

public class MainViewController {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		ProfileService service = (ProfileService) context.getBean("service");
	}

}
