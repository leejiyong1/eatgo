package com.example.fastcampus.eatgo.domain;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;


@Component
public class RestaurantRepositoryImpl implements RestaurantRepository{
	private List<Restaurant> restaurants = new ArrayList<Restaurant>();
	
	//생성자
	public RestaurantRepositoryImpl() {
		restaurants.add(new Restaurant(1004L,"Bob zip", "Seoul"));
		restaurants.add(new Restaurant(2020L,"Cyber Food", "Seoul"));
	}
	
	@Override
	public List<Restaurant> findAll() {
		return restaurants;
	}
	
	@Override
	public Restaurant findById(Long id) {
		Restaurant restaurant = restaurants.stream().filter(r -> r.getId().equals(id))
				.findFirst()
				.orElse(null);
		return restaurant;
	}
	
	

}
