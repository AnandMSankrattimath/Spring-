package com.xworkz.spring.bean.tester;


import org.springframework.context.ApplicationContext;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.spring.bean.MetroBean;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext container = new ClassPathXmlApplicationContext("Spring-Bean-Metro.xml");

		MetroBean metroBean1 = container.getBean(MetroBean.class);

		// metroBean1.setFromStation("Mahakavi Kuvempu road");
		// metroBean1.setToStation("Nadaprabhu Kempegouda Metro station");

		metroBean1.provideTransportation();
		System.out.println("Station counts : " + metroBean1.getNoOfStations());
		System.out.println("Speed : " + metroBean1.getSpeed());

		/*
		 * we can able to initialize the value through the constructor or getter &
		 * setter methods. in getter & setter method -- 2ways -- 1) set & get method &
		 * 2) in xml file <property>
		 */

		// syntax error -- SAXparseException
		// MetroBean metroBean = (MetroBean) container.getBean("metro");
		// System.out.println("Available Stations are
		// :"+metroBean.getAvailableStations());
		
		/*when we use setter method to initialize the value for the data member is called setter initialization.
		 * In XML we have to use <property name="datamembername " value="values">
		 * 
		 * Constructor initialization -- in xml we use <constructor-arg> -- value for the name == argument name/parameter name.
		 * no of parameter == no of <constructor-arg>
		 * 
		 * Spring bean supports setter initialization & constructor initialization and also supports both..
		 * 
		 * */
		//System.out.println("Available stations :" + metroBean1.getAvailableStations());
		 

	}

}
