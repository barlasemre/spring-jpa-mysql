package com.wagawin.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wagawin.domain.Child;
import com.wagawin.responses.ChildInfo;
import com.wagawin.responses.Color;
import com.wagawin.service.ChildService;

@RestController
@RequestMapping("/child")
public class ChildController {

	private ChildService childService;

	@Autowired
	public ChildController(ChildService childService) {
		super();
		this.childService = childService;
	}

	@RequestMapping("/list")
	public List<Child> list() {
		return childService.listAll();
	}

	@RequestMapping("/info/{id}")
	public ChildInfo childDetails(@PathVariable(value = "id") Long id) {

		ChildInfo childInfo = childService.getParentAndFavoriteMeal(id);

		return childInfo;

	}

	@RequestMapping("/color/{id}")
	public Color color(@PathVariable(value = "id") Long id) {

		Child child = childService.get(id);
		
		return child.printColor();

	}

}
