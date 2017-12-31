package com.wagawin.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wagawin.domain.Child;
import com.wagawin.domain.Meal;
import com.wagawin.domain.Person;
import com.wagawin.repository.ChildRepository;
import com.wagawin.responses.ChildInfo;

@Service
public class ChildService {

	private ChildRepository childRepository;
	
	@Autowired
	public ChildService(ChildRepository childRepository){
		this.childRepository = childRepository;
	}

	public Child get(Long id) {
		return childRepository.findOne(id);
	}

	public Child save(Child child) {
		return childRepository.save(child);
	}
	
	public List<Child> listAll(){
		return childRepository.findAll();
	}
	
	public ChildInfo getParentAndFavoriteMeal(Long id) {
		
		Child child = childRepository.findOne(id);
		Person parent = child.getPerson();
		Meal favoriteMeal = child.getMeals().get(0);
		
		ChildInfo childInfo = new ChildInfo(parent,favoriteMeal);
		return childInfo;
		
	}
	
}
