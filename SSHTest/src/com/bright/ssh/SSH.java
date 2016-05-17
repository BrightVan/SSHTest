package com.bright.ssh;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SSH {
	public static ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext(
			"../applicationContext.xml");

	public static Object getDAO(String daoName) {
		return ctx.getBean(daoName);
	}
}
