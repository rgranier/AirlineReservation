package com.flightreservation.model.services.reservationservice;

import java.time.LocalDateTime;
import java.util.ArrayList;

import com.flightreservation.model.domain.Traveler;
import com.flightreservation.model.domain.Flight;
import com.flightreservation.model.domain.Reservation;

public class ReservationServiceImpl implements IReservationService {

	@Override
	public ArrayList<Flight> listFlights() {
		System.out.println("List Flights.");
		return getFlights();
	}

	@Override
	public ArrayList<Reservation> listReservations() {
		System.out.println("List Reservations.");
		return getReservations();
	}

	@Override
	public boolean reserveFlight(int id) {
		System.out.println("Book Flight: " + id);
		return false;
	}

	@Override
	public boolean cancelFlight(int id) {
		System.out.println("Cancel Flight: " + id);
		return false;
	}
	
	/**
	 * A simulator for the database to be used until we get the DB.
	 * @return ArrayList<Flight> Flight List
	 */
	private ArrayList<Flight> getFlights(){
		ArrayList<Flight> flightList = new ArrayList<>();
		Flight flight1 = new Flight(100,"Atlanta","New York",LocalDateTime.parse("2021-04-01T12:00"),LocalDateTime.parse("2021-04-01T14:00"),"Boeing 737 Max",170);
		Flight flight2 = new Flight(101,"New York","Atlanta",LocalDateTime.parse("2021-04-01T12:00"),LocalDateTime.parse("2021-04-01T14:00"),"Boeing 737 Max",170);
		Flight flight3 = new Flight(200,"Atlanta","New Orleans",LocalDateTime.parse("2021-04-01T12:00"),LocalDateTime.parse("2021-04-01T14:00"),"Airbus A320",150);
		Flight flight4 = new Flight(200,"New Orleans","Atlanta",LocalDateTime.parse("2021-04-01T12:00"),LocalDateTime.parse("2021-04-01T14:00"),"Airbus A320",150);
		
		flightList.add(flight1);
		flightList.add(flight2);
		flightList.add(flight3);
		flightList.add(flight4);
		
		return flightList;
		
	}
	
	/**
	 * A simulator for the database to be used until we get the DB.
	 * @return ArrayList<Reservation> Reservation List
	 */
	private ArrayList<Reservation> getReservations(){
		ArrayList<Reservation> reservationList = new ArrayList<>();
		
		Traveler traveler = new Traveler(1000, "John", "Coltrane", "trane@jazz.com");
		Flight flight = new Flight(100,"Atlanta","New York",LocalDateTime.parse("2021-04-01T12:00"),LocalDateTime.parse("2021-04-01T14:00"),"Boeing 737 Max",170);
		Reservation reservation = new Reservation(2000, LocalDateTime.now(), traveler, flight);
		
		reservationList.add(reservation);
		return reservationList;
	}
}
