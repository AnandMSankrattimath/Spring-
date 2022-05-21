package com.xowrkz.dependencyinjection.bean;

public class PCBean {

	public PowerBean getPowerBean() {
		return powerBean;
	}

	public void setPowerBean(PowerBean powerBean) {
		System.out.println("Calling setPowerBean()...");
		this.powerBean = powerBean;
	}

	private String name;
	private PowerBean powerBean;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void provideService() {
		powerBean.provideElecricity();
		System.out.println(" providing services....");

	}

}
