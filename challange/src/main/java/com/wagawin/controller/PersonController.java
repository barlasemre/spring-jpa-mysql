package com.wagawin.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wagawin.domain.Person;
import com.wagawin.service.PersonService;

@RestController
@RequestMapping("/person")
public class PersonController {
	
	private PersonService personService;
	
	@Autowired
	public PersonController(PersonService personService) {
		super();
		this.personService = personService;
	}

	
	public List<Person> list() {
		return personService.listAll();
	}
	
}
