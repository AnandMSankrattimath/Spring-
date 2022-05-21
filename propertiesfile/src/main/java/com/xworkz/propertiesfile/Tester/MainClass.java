package com.xworkz.propertiesfile.Tester;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.propertiesfile.Bean.UserBean;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext containerApplicationContext = new ClassPathXmlApplicationContext("spring-config.xml");

		UserBean userBean = containerApplicationContext.getBean(UserBean.class);

		userBean.showUserDetail();

	}

}
