package com.flightreservation.model.domain;
import java.time.LocalDateTime;

/**
 * This class contains all of the information about the flight. 
 *
 */

public class Flight {
	private int id;
	private String originAirport;
	private String destinationAirport;
	private LocalDateTime departingTime;
	private LocalDateTime arrivalTime;
	private String aircraft;
	private int numSeats;
	
	// Constructors
	public Flight() {
	}

	public Flight(int id, String originAirport, String destinationAirport, LocalDateTime departingTime,
			LocalDateTime arrivalTime) {
		this.id = id;
		this.originAirport = originAirport;
		this.destinationAirport = destinationAirport;
		this.departingTime = departingTime;
		this.arrivalTime = arrivalTime;
	}

	public Flight(int id, String originAirport, String destinationAirport, LocalDateTime departingTime,
			LocalDateTime arrivalTime, String aircraft, int numSeats) {
		this.id = id;
		this.originAirport = originAirport;
		this.destinationAirport = destinationAirport;
		this.departingTime = departingTime;
		this.arrivalTime = arrivalTime;
		this.aircraft = aircraft;
		this.numSeats = numSeats;
	}

	// Getters and Setters
	public int getId() {
		return id;
	}

	public String getOriginAirport() {
		return originAirport;
	}

	public String getDestinationAirport() {
		return destinationAirport;
	}

	public LocalDateTime getDepartingTime() {
		return departingTime;
	}

	public LocalDateTime getArrivalTime() {
		return arrivalTime;
	}

	public String getAircraft() {
		return aircraft;
	}

	public int getNumSeats() {
		return numSeats;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setOriginAirport(String originAirport) {
		this.originAirport = originAirport;
	}

	public void setDestinationAirport(String destinationAirport) {
		this.destinationAirport = destinationAirport;
	}

	public void setDepartingTime(LocalDateTime departingTime) {
		this.departingTime = departingTime;
	}

	public void setArrivalTime(LocalDateTime arrivalTime) {
		this.arrivalTime = arrivalTime;
	}

	public void setAircraft(String aircraft) {
		this.aircraft = aircraft;
	}

	public void setNumSeats(int numSeats) {
		this.numSeats = numSeats;
	}

	
	//TODO:   Complete this method
	// Validate
	
	
	// toString
	@Override
	public String toString() {
		return "Flight [id=" + id + ", originAirport=" + originAirport + ", destinationAirport=" + destinationAirport
				+ ", departingTime=" + departingTime + ", arrivalTime=" + arrivalTime + ", aircraft=" + aircraft
				+ ", numSeats=" + numSeats + "]";
	}
}
