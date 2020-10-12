package com.hsbc.service;

import java.util.List;

import com.hsbc.JdbcBackedDao;

public class AccountServiceImpl implements IAccountService {

	private JdbcBackedDao backedDao;
	
	public void setBackedDao(JdbcBackedDao backedDao) {
		this.backedDao = backedDao;
	}
	
	

	public AccountServiceImpl() {
		super();
		System.out.println("Const of AccountServiceImpl");
		// TODO Auto-generated constructor stub
	}



	@Override
	public void createAccount() {
		System.out.println("createAcc() from AccountService");
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<String> getAccounts() {
		System.out.println("getAcc() from AccountService");
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<String> getAccountsSortByName() {
		System.out.println("getAccSortedByName() from AccountService");
		// TODO Auto-generated method stub
		return null;
	}

}
