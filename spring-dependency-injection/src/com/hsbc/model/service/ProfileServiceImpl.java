package com.hsbc.model.service;

import com.hsbc.model.dao.ProfileDao;

public class ProfileServiceImpl implements ProfileService {

	
	private ProfileDao dao = null;
	
	
	public ProfileServiceImpl() {
		System.out.println("Service Layer");
	//	dao = ObjectFactory.getDaoInstance();
	}


	public ProfileDao getDao() {
		return dao;
	}


	public void setDao(ProfileDao dao) {
		System.out.println("setDao(): "+dao);
		this.dao = dao;
	}
	
	
}
