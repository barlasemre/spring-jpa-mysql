package com.wagawin.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.wagawin.domain.Child;


@Repository
public interface ChildRepository extends CrudRepository<Child, Long> {

	List<Child> findAll();	
	
}
