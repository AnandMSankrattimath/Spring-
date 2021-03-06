package com.xowrkz.dependencyinjection.tester;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xowrkz.dependencyinjection.bean.PCBean;

public class MainClass {

	public static void main(String[] args) {
		ApplicationContext containerApplicationContext = new ClassPathXmlApplicationContext("spring-bean-config.xml");

		PCBean pcBean = containerApplicationContext.getBean(PCBean.class);

		pcBean.provideService();

	}
}
