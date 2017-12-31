package com.wagawin.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.wagawin.domain.House;


@Repository
public interface HouseRepository extends CrudRepository<House, Long> {

	House findByPersonId(long personId);

}
