package com.hsbc.model.dao;

public class ProfileDaoImpl implements ProfileDao {
	
	private DBUtility dbUtility;
	
	
	public DBUtility getDbUtility() {
		return dbUtility;
	}


	public void setDbUtility(DBUtility dbUtility) {
		this.dbUtility = dbUtility;
	}


	public ProfileDaoImpl() {
		System.out.println("DAO Layer");
	}
}
