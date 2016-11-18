package com.csu.service.impl;

import org.springframework.transaction.annotation.Transactional;

import com.csu.bean.User;
import com.csu.dao.UserDAO;
import com.csu.service.UserService;

@Transactional("transactionManager")
public class UserServiceImpl implements UserService{
	
	private UserDAO userDAO;

	public UserDAO getUserDAO() {
		return userDAO;
	}

	public void setUserDAO(UserDAO userDAO) {
		this.userDAO = userDAO;
	}

	@Override
	public void saveUser(User user) {
		userDAO.saveUser(user);
	}
}
