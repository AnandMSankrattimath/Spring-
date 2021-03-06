package com.xworkz.spring.tester;



import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.spring.bean.TheatreBean;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*BeanFactory -- Lazy(default), doesn't supports AOP.
		 * 
		 * ApplicationContext--default(Eager) but supprots Lazy,supports AOP.
		 * 
		 * WebApplicationContext--default(Eager) but also supports Lazy,supports AOP.
		 * 
		 * classPath -- the classes which are in the src/main/java  & src/main/resources folders.
		 * 
		 * Container -- is an object to create & manages the bean object.
		 * 
		 * 
		 * */

		
			ApplicationContext container = new ClassPathXmlApplicationContext("spring-config.xml");//Bean generator using XML file through the ApplicationContext.
			
			//TheatreBean theatreBean = container.getBean(TheatreBean.class);// one Way
			
			TheatreBean theatreBean = (TheatreBean) container.getBean("theatre");//another way of getBean("String arguments").
			System.err.println(theatreBean);  // bean supports the singleton design pattern by default.
			System.err.println(theatreBean);  // 5 bean tag == container creates the 5 bean object.
			System.err.println(theatreBean); // creation of bean tag is dependence on no.of bean tag present in the meta(XML file).
			
			theatreBean.setTheatreName("Ravi's Show");
			theatreBean.setSeatingCapacity(1000);
			theatreBean.showMovie();
	}

}
