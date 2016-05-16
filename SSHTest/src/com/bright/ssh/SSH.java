package com.bright.ssh;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SSH {
	public static ClassPathXmlApplicationContext beans = new ClassPathXmlApplicationContext(
			"../applicationContext.xml");

	public static Object getDAO(String daoName) {
		return beans.getBean(daoName);
	}
}
