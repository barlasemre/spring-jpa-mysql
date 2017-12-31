package com.wagawin.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.wagawin.domain.Meal;


@Repository
public interface MealRepository extends CrudRepository<Meal, Long> {

}
