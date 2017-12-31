package com.wagawin.domain;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Meal {
	
	@Id
	@GeneratedValue
	private Long id;
	private String name;
	
	private String inventedDate;

	@SuppressWarnings("unused")
	private Meal(){}
	
	public Meal(String name, String invented){
		this.setName(name);
		this.setInventedDate(invented);
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getInventedDate() {
		return inventedDate;
	}

	public void setInventedDate(String inventedDate) {
		this.inventedDate = inventedDate;
	}

	@Override
	public String toString() {
		return "Meal [name=" + name + ", invented=" + inventedDate + "]";
	}
	
	
}