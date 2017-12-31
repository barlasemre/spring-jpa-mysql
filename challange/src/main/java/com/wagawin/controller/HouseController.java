package com.wagawin.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wagawin.domain.House;
import com.wagawin.service.HouseService;

@RestController
@RequestMapping("/house")
public class HouseController {
	
	private HouseService houseService;
	
	@Autowired
	public HouseController(HouseService houseService) {
		super();
		this.houseService = houseService;
	}
	
	@RequestMapping("/{id}")
	public House getHouse(@PathVariable(value="id") Long id){
		
		return houseService.getByPersonId(id);
	}
}
