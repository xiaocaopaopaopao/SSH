package com.csu.dao.impl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.csu.bean.User;
import com.csu.dao.UserDAO;

public class UserDAOImpl  implements UserDAO{
	
	private SessionFactory sessionFactory;

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}
	
	public Session getCurrentSession(){
		return sessionFactory.getCurrentSession();
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	public void saveUser(User user) {
		System.out.println(user);
		this.getCurrentSession().save(user);
	}
}
