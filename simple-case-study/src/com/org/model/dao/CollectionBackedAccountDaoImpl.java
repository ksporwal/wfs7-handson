package com.org.model.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.org.model.beans.Account;

public class CollectionBackedAccountDaoImpl implements AccountDao {

	private static List<Account> database = new ArrayList<>();
	@Override
	public Account createAccount(Account account) {
		database.add(account);
		return account;
	}

	@Override
	public Account updateBalance(int accountNumber, double amount) {
		List<Account> temp = database.stream().filter(item -> item.getAccountNumber()==accountNumber).collect(Collectors.toList());
		for (Account account : temp) {
			account.setBalance(amount);
			return account;
		}
		return null;
	}

	@Override
	public Account getAccount(int accountNumber) {
		List<Account> temp =database.stream().filter(item -> item.getAccountNumber()==accountNumber).collect(Collectors.toList());
		for(Account a:temp)
			return a;
		return null;
	}

	@Override
	public List<Account> getAccounts() {
		// TODO Auto-generated method stub
		return database;
	}

}
