package com.wagawin.responses;

import com.wagawin.domain.Meal;
import com.wagawin.domain.Person;

public class ChildInfo {

	private Person person;
	private Meal meal;
	
	public ChildInfo(Person person, Meal meal) {
		this.person = person;
		this.meal = meal;
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

	public Meal getMeal() {
		return meal;
	}

	public void setMeal(Meal meal) {
		this.meal = meal;
	}

}
