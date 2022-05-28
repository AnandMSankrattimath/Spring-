package com.xowrkz.spring_integration_hibernate.dao;



import javax.transaction.Transactional;

import org.springframework.orm.hibernate5.HibernateTemplate;

import com.xowrkz.spring_integration_hibernate.entity.StudentEntity;

public class StudentDAO {

	private HibernateTemplate hibernateTemplate;

	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

	// save Student
	@Transactional
		public void insert(StudentEntity studentEntity) {
		Integer integer = (Integer) this.hibernateTemplate.save(studentEntity);

		System.out.println("calling th save ()");
	}
}
