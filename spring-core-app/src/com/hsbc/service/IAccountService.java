package com.hsbc.service;

import java.util.List;

public interface IAccountService {
	public void createAccount();
	public List<String> getAccounts();
	public List<String> getAccountsSortByName();
}
