package com.xworkz.spring.bean.tester;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.spring.bean.MetroBean;

public class MainClass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext containerApplicationContext = new ClassPathXmlApplicationContext("Spring-Bean-Metro.xml");
		
		MetroBean metroBean = containerApplicationContext.getBean(MetroBean.class);
		
		

	}

}
