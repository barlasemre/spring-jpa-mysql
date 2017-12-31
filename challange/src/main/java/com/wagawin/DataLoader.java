package com.wagawin;

import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.wagawin.domain.Daughter;
import com.wagawin.domain.House;
import com.wagawin.domain.HouseType;
import com.wagawin.domain.Meal;
import com.wagawin.domain.Person;
import com.wagawin.domain.Son;
import com.wagawin.repository.ChildRepository;
import com.wagawin.repository.HouseRepository;
import com.wagawin.repository.MealRepository;
import com.wagawin.repository.PersonRepository;

@Component
public class DataLoader {

	private PersonRepository personRepository;
	private ChildRepository childRepository;
	private HouseRepository houseRepository;
	private MealRepository mealRepository;

	@Autowired
	public DataLoader(PersonRepository personRepository, ChildRepository childRepository,
			HouseRepository houseRepository, MealRepository mealRepository) {
		this.personRepository = personRepository;
		this.childRepository = childRepository;
		this.houseRepository = houseRepository;
		this.mealRepository = mealRepository;
	}

	@PostConstruct
	private void loadData() throws ParseException {

		personRepository.deleteAll();
		childRepository.deleteAll();
		houseRepository.deleteAll();
		mealRepository.deleteAll();

		Person chris = new Person("Chris", 30);
		Person emilia = new Person("Emilia", 28);
		personRepository.save(chris);
		personRepository.save(emilia);
		
		House house1 = createHouse("Munich", "80331");
		House house2 = createHouse("Stuttgart", "70174");
		
		house1.setPerson(chris);
		house2.setPerson(emilia);
		
		houseRepository.save(house1);
		houseRepository.save(house2);

		createChilds(chris);
		
	}

	private void createChilds(Person person) throws ParseException {

		List<Meal> listOfMeals = createMeals();

		Son child1 = new Son("Sebastian", 9);
		child1.setBicycleColor("BLUE");
		child1.setPerson(person);
		child1.setMeals(chooseFavoriteMeals(listOfMeals));

		Daughter child2 = new Daughter("Hannah", 5);
		child2.setHairColor("BROWN");
		child2.setPerson(person);
		child2.setMeals(chooseFavoriteMeals(listOfMeals));

		Son child3 = new Son("Michael", 5);
		child3.setBicycleColor("RED");
		child3.setPerson(person);
		child3.setMeals(chooseFavoriteMeals(listOfMeals));

		childRepository.save(child1);
		childRepository.save(child2);
		childRepository.save(child3);

	}

	private List<Meal> chooseFavoriteMeals(List<Meal> allMeals){
		
		Random rand = new Random();
		List<Meal> favoriteMeals = rand.ints(3, 0, allMeals.size()).mapToObj(i -> allMeals.get(i))
				.distinct().collect(Collectors.toList());
		
		return favoriteMeals;
		
	}
	
	private List<Meal> createMeals() throws ParseException {
		Meal meal1 = new Meal("Hamburger", randomDate());
		Meal meal2 = new Meal("Kebab", randomDate());
		Meal meal3 = new Meal("Ravioli", randomDate());
		Meal meal4 = new Meal("Pasta", randomDate());
		Meal meal5 = new Meal("Tomato Soup", randomDate());
		Meal meal6 = new Meal("Beef", randomDate());
		Meal meal7 = new Meal("Sausage", randomDate());
		Meal meal8 = new Meal("Döner", randomDate());
		Meal meal9 = new Meal("Pizza", randomDate());
		Meal meal10 = new Meal("Chicken", randomDate());

		List<Meal> meals = new ArrayList<Meal>();
		meals.add(meal1);
		meals.add(meal2);
		meals.add(meal3);
		meals.add(meal4);
		meals.add(meal5);
		meals.add(meal6);
		meals.add(meal7);
		meals.add(meal8);
		meals.add(meal9);
		meals.add(meal10);

		mealRepository.save(meals);

		return meals;

	}

	private House createHouse(String city, String zipcode) throws ParseException {

		
		House house = new House(city, zipcode, HouseType.getRandomHouseType());

		return house;

	}

	private long getRandomTime() {
		long beginTime = Timestamp.valueOf("1900-01-01 00:00:00").getTime();
		long endTime = Timestamp.valueOf("2000-12-31 00:58:00").getTime();
		long diff = endTime - beginTime + 1;
		return beginTime + (long) (Math.random() * diff);
	}

	private String randomDate() {

		SimpleDateFormat sdf = new SimpleDateFormat("dd/M/yyyy");
		Date randomDate = new Date(getRandomTime());

		return sdf.format(randomDate);
	}
}