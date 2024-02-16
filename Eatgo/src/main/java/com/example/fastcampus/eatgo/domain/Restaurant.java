package com.example.fastcampus.eatgo.domain;

public class Restaurant {
	private final String name;
	private final String address;
	private final Long id;

	public Restaurant(long id, String name,String address) {
		this.name = name;
		this.address = address;
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public String getInformation() {
		return name+" in "+ address;
	}

	public String getAddress() {
		// TODO Auto-generated method stub
		return address;
	}
	
	public Long getId() {
		return id;
	}
}
