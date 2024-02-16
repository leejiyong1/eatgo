package com.example.fastcampus.eatgo.interfaces;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.fastcampus.eatgo.domain.Restaurant;
import com.example.fastcampus.eatgo.domain.RestaurantRepository;

@RestController
public class RestaurantController {
	

	private RestaurantRepository Repository = new RestaurantRepository();

	@GetMapping("/restaurants")
	public List<Restaurant> list() {
		List<Restaurant> restaurants= Repository.findAll();
		
		return restaurants;
	}
	
	@GetMapping("/restaurants/{id}")
	public Restaurant detail(@PathVariable("id") Long id) {
		Restaurant restaurant= Repository.findById(id);
		
		
		return restaurant;
	}

}
