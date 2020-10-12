package com.hsbc;

import java.util.List;

public class JdbcBackedDao implements AccountDao {

	private DBUtility dbutility;
	
	public void setDbutility(DBUtility dbutility) {
		this.dbutility = dbutility;
	}

	public JdbcBackedDao() {
		System.out.println("JdbcBackedDao()");
	}
	@Override
	public void createAccount() {
		// old approach
		dbutility.getConnection();
		System.out.println("createAccount() of JdbcBackedDao");
	}
	@Override
	public List<String> getAccounts() {
		dbutility.getConnection();
		System.out.println("getAccounts() of JdbcBackedDao");
		return null;
	}

}
