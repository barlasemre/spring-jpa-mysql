package com.wagawin.domain;

import javax.persistence.Entity;

import com.wagawin.responses.Color;

@Entity
public class Daughter extends Child{

	private String hairColor;
	
	public Daughter(String name, int age) {
		super(name, age);
	}
	
	public Daughter() {
	}

	@Override
	protected Color color() {
		Color color = super.color();
		color.setHairColor((getHairColor()));
		return color;
	}

	public String getHairColor() {
		return hairColor;
	}

	public void setHairColor(String hairColor) {
		this.hairColor = hairColor;
	}
	
}