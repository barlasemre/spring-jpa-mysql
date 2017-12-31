package com.wagawin.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.wagawin.domain.Person;


@Repository
public interface PersonRepository extends CrudRepository<Person, Long> {

	List<Person> findAll();
	
}
