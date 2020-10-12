package com.hsbc;

import java.util.List;

public class HibernateBackedDAOImpl implements HibernateBackedDAO{

	DBUtility dbutility;
	
	public void setDbutility(DBUtility dbutility) {
		this.dbutility = dbutility;
	}
	@Override
	public void createAccount() {
		// old approach
		dbutility.getConnection();
		System.out.println("createAccount() of  HibernateBackedDAOIMPL");
	}
	@Override
	public List<String> getAccounts() {
		dbutility.getConnection();
		System.out.println("getAccounts() of  HibernateBackedDAOIMPL");
		return null;
	}
	@Override
	public List<String> getAccountsSortByName() {
		dbutility.getConnection();
		System.out.println("getAccountsSortByName() of  HibernateBackedDAOIMPL");
		return null;
	}

}
