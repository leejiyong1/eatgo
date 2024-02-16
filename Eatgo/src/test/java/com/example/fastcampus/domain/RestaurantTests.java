package com.example.fastcampus.domain;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.example.fastcampus.eatgo.domain.Restaurant;

public class RestaurantTests {
	
	@Test
	public void creation() {
		Restaurant restaurant = new Restaurant(1004L,"Bob zip","Seoul");
		
		assertEquals(restaurant.getId(), 1004);
		assertEquals(restaurant.getName(), "Bob zip");
		assertEquals(restaurant.getAddress(), "Seoul");
	}
	
	@Test
	public void information() {
		Restaurant restaurant = new Restaurant(1004L,"Bob zip" , "Seoul");
		assertEquals(restaurant.getInformation(), "Bob zip in Seoul");
	}

}
