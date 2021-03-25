package com.flightreservation.model.domain;
import java.time.LocalDateTime;

/**
 * This class will hold the information presented to the traveler after making 
 * the reservations.  It is similar to the Reservation, but has more information
 * relevant to the traveler, e.g. which if my flights is the departing flight, which is
 * the return flight, etc?  The reservation just knows that the traveler has a seat 
 * reserved on the flight. 
 * 
 * This is generated dynamically from the database with a query and presented
 *  (report, screen, etc.) to the traveler.  This is not intended to be a persisted in
 *  the database.  It is derived, but this could be changed later.
 */
public class Itinerary {
	private LocalDateTime date;
	private Traveler traveler;
	private Flight departFlight;
	private Flight returnFlight;
	
	
	// Constructors
	public Itinerary() {
	}
	
	public Itinerary(LocalDateTime date, Traveler traveler, Flight departFlight, Flight returnFlight) {
		this.date = date;
		this.traveler = traveler;
		this.departFlight = departFlight;
		this.returnFlight = returnFlight;
	}

	// Getters and setters
	public LocalDateTime getDate() {
		return date;
	}

	public Traveler getTraveler() {
		return traveler;
	}

	public Flight getDepartFlight() {
		return departFlight;
	}

	public Flight getReturnFlight() {
		return returnFlight;
	}

	public void setDate(LocalDateTime date) {
		this.date = date;
	}

	public void setTraveler(Traveler traveler) {
		this.traveler = traveler;
	}

	public void setDepartFlight(Flight departFlight) {
		this.departFlight = departFlight;
	}

	public void setReturnFlight(Flight returnFlight) {
		this.returnFlight = returnFlight;
	}

	// toString
	@Override
	public String toString() {
		return "Itinerary [date=" + date + ", traveler=" + traveler + ", departFlight=" + departFlight
				+ ", returnFlight=" + returnFlight + "]";
	}
	

}
