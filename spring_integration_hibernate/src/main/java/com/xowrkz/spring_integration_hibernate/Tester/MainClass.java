package com.xowrkz.spring_integration_hibernate.Tester;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xowrkz.spring_integration_hibernate.dao.StudentDAO;
import com.xowrkz.spring_integration_hibernate.entity.StudentEntity;

public class MainClass {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
		
		                StudentDAO studentDAO = context.getBean("studentDAO",StudentDAO.class);
		                
		                StudentEntity studentEntity = new StudentEntity(121,"anand","bangalore");
		                
		               studentDAO.insert(studentEntity);
		               System.out.println("inserted");
		                

	}

}
