package com.flightreservation.model.domain;

import static org.junit.Assert.*;

import org.junit.Test;

public class TravelerTest {
	
	@Test
	public void passTest() {
		Traveler traveler = new Traveler(100, "John", "Coltrane", "coltrane@jazz.com");
		assertTrue("Expected result: Valid.", traveler.validate());
	}
	
	@Test
	public void failTest() {
		Traveler traveler = new Traveler();
		assertFalse("Expected result: Not Valid.", traveler.validate());
	}
}
