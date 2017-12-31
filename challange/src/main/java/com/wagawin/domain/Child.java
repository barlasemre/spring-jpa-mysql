package com.wagawin.domain;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

import com.wagawin.responses.Color;

@Entity
public class Child {
	
	@Id
	@GeneratedValue
	private Long id;
	private String name;
	private int age;
	
	@ManyToMany
	private List<Meal> meals;
	
	@ManyToOne
	private Person person;
	
	@SuppressWarnings("unused")
	public Child(){}
	
	public Child(String name, int age){
		this.setName(name);
		this.setAge(age);
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

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

    public List<Meal> getMeals() {
        return meals;
    }
	
	public void setMeals(List<Meal> meals) {
		this.meals = meals;
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}
	
	protected Color color() {
		return new Color();
	}

	@Override
	public String toString() {
		return "Child [name=" + name + ", age=" + age + "]";
	}
	
	public Color printColor() {
		
		
		
		return color();
	}
	
}