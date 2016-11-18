package com.csu.action.user;

import com.csu.bean.User;
import com.csu.service.UserService;
import com.opensymphony.xwork2.ActionSupport;

public class SaveUserAction extends ActionSupport {
	
	private User user;
	
	private UserService userService;

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public UserService getUserService() {
		return userService;
	}

	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	@Override
	public String execute() throws Exception {
		try{
			userService.saveUser(user);
			return SUCCESS;
		}catch(Exception ex){
			return ERROR;
		}
	}
}
