package com.example.fastcampus.eatgo.domain;

import java.util.List;

public interface RestaurantRepository {
	
	List<Restaurant> findAll();
	
	Restaurant findById(Long id);

}
