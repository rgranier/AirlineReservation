package com.flightreservation.model.domain;

public class Traveler {
	
	private int Id;
	private String firstName;
	private String lastName;
	
	
	public Traveler(int id, String firstName, String lastName) {
		super();
		Id = id;
		this.firstName = firstName;
		this.lastName = lastName;
	}


	@Override
	public String toString() {
		return "Traveler [Id=" + Id + ", firstName=" + firstName + ", lastName=" + lastName + "]";
	}

}
