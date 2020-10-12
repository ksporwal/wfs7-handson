package com.hsbc;

import java.util.List;

public interface HibernateBackedDAO {
	public void createAccount();
	public List<String> getAccounts();
	public List<String> getAccountsSortByName();
}
