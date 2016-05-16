package com.bright.action;

import java.util.List;

import com.bright.bean.User;
import com.bright.bean.UserDAO;
import com.bright.ssh.SSH;
import com.opensymphony.xwork2.ActionSupport;


public class LoginAction  extends ActionSupport{
	private User user;
	

	public User getUser() {
		return user;
	}


	public void setUser(User user) {
		this.user = user;
	}


	@Override
	public String execute() throws Exception {
		User instance = getUser();
		UserDAO userDAO = (UserDAO)SSH.getDAO("UserDAO");
		List<?> list = userDAO.findByExample(instance);
		if(list.size()>0){
			return "success";
		}else{
			return "error";
		}
	}
	
	
	
}
