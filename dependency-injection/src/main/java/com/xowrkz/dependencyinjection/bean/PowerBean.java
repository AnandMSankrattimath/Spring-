package com.xowrkz.dependencyinjection.bean;

public class PowerBean {
	private int units;

	public int getUnits() {
		return units;
	}

	public void setUnits(int units) {
		this.units = units;
	}

	public void provideElecricity() {
		System.out.println("Providing elecricity...");
	}

}
