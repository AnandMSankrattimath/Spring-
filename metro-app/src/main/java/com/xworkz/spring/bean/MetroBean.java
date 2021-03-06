package com.xworkz.spring.bean;

import java.util.List;

public class MetroBean {

	private String fromStation;
	private String toStation;
	private int noOfStations;
	private double speed;
	private List<String> availableStations;

	
	 public List<String> getAvailableStations() {
		 return availableStations; 
		 }
	 
	 public void setAvailableStations(List<String> availableStations) {
		 
	  this.availableStations = availableStations;
	  }

/*	public MetroBean(String fromStation, String toStation, int noOfStations, double speed) {
		super();
		this.fromStation = fromStation;
		this.toStation = toStation;
		this.noOfStations = noOfStations;
		this.speed = speed;
		System.out.println("calling parameterized constructor....");
	}*/

	public String getFromStation() {
		return fromStation;
	}

	public void setFromStation(String fromStation) {
		this.fromStation = fromStation;
	}

	public String getToStation() {
		return toStation;
	}

	public void setToStation(String toStation) {
		this.toStation = toStation;
	}

	public int getNoOfStations() {
		return noOfStations;
	}

	public void setNoOfStations(int noOfStations) {
		this.noOfStations = noOfStations;
	}

	public double getSpeed() {
		return speed;
	}

	public void setSpeed(double speed) {
		this.speed = speed;
	}

	public void provideTransportation() {
		System.out.println("Providing Transportation " + fromStation + " to " + toStation);
	}

}
