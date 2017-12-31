package com.wagawin.domain;

import javax.persistence.Entity;

import com.wagawin.responses.Color;

@Entity
public class Son extends Child{

	private String bicycleColor;
	
	public Son(String name, int age) {
		super(name, age);
	}

	public Son() {
		
	}
	
	@Override
	protected Color color() {
		Color color = super.color();
		color.setBicycleColor(getBicycleColor());
		return color;
	}

	public String getBicycleColor() {
		return bicycleColor;
	}

	public void setBicycleColor(String bicycleColor) {
		this.bicycleColor = bicycleColor;
	}
	
	
}