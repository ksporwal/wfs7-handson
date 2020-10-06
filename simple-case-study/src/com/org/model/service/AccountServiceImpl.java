package com.org.model.service;

import java.util.List;
import java.util.stream.Collectors;

import com.org.model.beans.Account;
import com.org.model.dao.AccountDao;
import com.org.model.util.ObjectFactory;

public class AccountServiceImpl implements AccountService {

	
	private AccountDao accountDao = null;
	public AccountServiceImpl() {
		accountDao = ObjectFactory.getAccountDaoInstance();
	}
	
	
	@Override
	public Account createAccount(Account account) {
		// TODO Auto-generated method stub
		return accountDao.createAccount(account);
	}

	@Override
	public double getBalance(int accountNumber) {
		// TODO Auto-generated method stub
		return accountDao.getAccount(accountNumber).getBalance();
	}

	@Override
	public void transfer(int sourceAccount, int destincationAccount, double amount) {
		int flag1=0;
		int flag2=0;
		List<Account> accounts = accountDao.getAccounts();
		Account src = null,dest = null;
		for (Account account : accounts) {
			if(account.getAccountNumber()==sourceAccount) {
				 flag1=1;
				 src = account;
			}
			if(account.getAccountNumber()==destincationAccount) {
				 flag2=1;
				 dest = account;
			}
		}
		if(flag1!=1) {
			System.out.println("Source account doesnot exist");
		}
		else if(flag2!=1) 
			System.out.println("Destination account doesnot exist");
		
		else {
			if(src.getBalance()<amount) {
				System.out.println("Insufficient balance to transfer");
			}
			else {
				System.out.println("Updated src balance:"+accountDao.updateBalance(sourceAccount, src.getBalance()-amount).getBalance());
				System.out.println("Updated dest balance:"+accountDao.updateBalance(destincationAccount, dest.getBalance()+amount).getBalance());
			}
		}
	}

	@Override
	public List<Account> getAccountsSortedByName() {
		List<Account> accounts = accountDao.getAccounts();
		List<Account> sortedAccount = accounts.stream()
		.sorted((account1, account2) -> account1.getCustomerName().compareTo(account2.getCustomerName()))
		.collect(Collectors.toList());
		
		return sortedAccount;
	}

	@Override
	public List<Account> getAccountsSortedByAccountNumber() {
		List<Account> accounts = accountDao.getAccounts();
		List<Account> sortedAccount = accounts.stream()
		.sorted((account1, account2) -> account1.getAccountNumber()-account2.getAccountNumber())
		.collect(Collectors.toList());
		
		return sortedAccount;
	}

}
