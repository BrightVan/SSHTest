package com.bright.action;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.bright.bean.User;
import com.bright.bean.UserDAO;
import com.bright.ssh.SSH;
import com.opensymphony.xwork2.ActionSupport;

@SuppressWarnings("serial")
public class RegisterAction extends ActionSupport {
	private User user;

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@Override
	public String execute() throws Exception {
		// 检查用户名是否已被注册
		UserDAO userDAO = (UserDAO)SSH.getDAO("UserDAO");
		List<?> list = userDAO.findByUsername(user.getUsername());
		// 用户名已被注册，返回注册页面
		if (list.size() > 0) {
			return "error";
		}
		// 插入新用户
		userDAO.save(user);
		return "success";
	}

}
