package com.xworkz.propertiesfile.Bean;

public class UserBean {
	private String firstName;
	private String lastName;
	
	public UserBean(String lastName) {
		this.lastName=lastName;
	}
	
public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	
	public void showUserDetail() {
		System.out.println("FirstName : "+firstName+" \nLastName : "+lastName);
	}


}
