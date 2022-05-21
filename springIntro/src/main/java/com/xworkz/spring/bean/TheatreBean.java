package com.xworkz.spring.bean;

public class TheatreBean {
	private String theatreName;
	private int seatingCapacity;
	
	
	
	public String getTheatreName() {
		return theatreName;
	}



	public void setTheatreName(String theatreName) {
		this.theatreName = theatreName;
	}



	public int getSeatingCapacity() {
		return seatingCapacity;
	}



	public void setSeatingCapacity(int seatingCapacity) {
		this.seatingCapacity = seatingCapacity;
	}



	public void showMovie() {
		System.out.println("Showing movie in "+theatreName);
	}

}
