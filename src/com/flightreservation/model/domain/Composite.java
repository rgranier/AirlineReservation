/**
 * Used to hold references to other objects for moving information between layers (packages) 
 * of the program.
 * 
 * NOTE:  No validate in this one for now.  Not testing this one for now.
 */
package com.flightreservation.model.domain;
import java.util.ArrayList;

public class Composite {
	
	private Traveler traveler;
	private Reservation reservation;
	private Flight flight;
	private Itinerary itinerary;
	
	private ArrayList<Flight> flightList;
	
	
	// Constructors
	public Composite() {
	}

	// Getters and setters
	public Traveler getTraveler() {
		return traveler;
	}


	public Reservation getReservation() {
		return reservation;
	}


	public Flight getFlight() {
		return flight;
	}


	public Itinerary getItinerary() {
		return itinerary;
	}


	public ArrayList<Flight> getFlightList() {
		return flightList;
	}


	public void setTraveler(Traveler traveler) {
		this.traveler = traveler;
	}


	public void setReservation(Reservation reservation) {
		this.reservation = reservation;
	}


	public void setFlight(Flight flight) {
		this.flight = flight;
	}


	public void setItinerary(Itinerary itinerary) {
		this.itinerary = itinerary;
	}


	public void setFlightList(ArrayList<Flight> flightList) {
		this.flightList = flightList;
	}

	// toString
	@Override
	public String toString() {
		return "Composite [traveler=" + traveler + ", reservation=" + reservation + ", flight=" + flight
				+ ", itinerary=" + itinerary + ", flightList=" + flightList + "]";
	}

}
