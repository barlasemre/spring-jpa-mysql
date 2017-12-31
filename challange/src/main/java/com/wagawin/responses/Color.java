package com.wagawin.responses;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class Color {

	private String bicycleColor;
	private String hairColor;
	
	public String getBicycleColor() {
		return bicycleColor;
	}

	public void setBicycleColor(String bicycleColor) {
		this.bicycleColor = bicycleColor;
	}



	public String getHairColor() {
		return hairColor;
	}
	public void setHairColor(String hairColor) {
		this.hairColor = hairColor;
	}
	
	
}
