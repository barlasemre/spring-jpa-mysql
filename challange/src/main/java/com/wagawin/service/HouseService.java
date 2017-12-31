package com.wagawin.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wagawin.domain.House;
import com.wagawin.repository.HouseRepository;

@Service
public class HouseService {

	private HouseRepository houseRepository;
	
	@Autowired
	public HouseService(HouseRepository houseRepository){
		this.houseRepository = houseRepository;
	}

	public House get(Long id) {
		return houseRepository.findOne(id);
	}

	public House save(House house) {
		return houseRepository.save(house);
	}
	
	public House getByPersonId(long personId) {
		return houseRepository.findByPersonId(personId);
	}
	
}
