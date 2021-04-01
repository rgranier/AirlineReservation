package com.flightreservation.ui;
import java.util.List;

import com.flightreservation.model.services.factory.ServiceFactory;
import com.flightreservation.model.services.reservationservice.IReservationService;
import com.flightreservation.model.domain.*;

public class RunApp {

	public static void main(String[] args) {
		
		ServiceFactory factory = new ServiceFactory();
		IReservationService reservation = factory.getReservationService();
		
		List<Flight> flightList = reservation.listFlights();
		
		System.out.println(flightList);
		
		for (Flight flight : flightList) {
			System.out.println("Flight ID: " + flight.getId());
			System.out.println("Origin Airport: " + flight.getOriginAirport() + "\t\tDeparture Time: " + flight.getDepartureTime());
			System.out.println("Destination Airport: " + flight.getOriginAirport() + "\t\tArrival Time: " + flight.getArrivalTime());
		}
		
		reservation.reserveFlight(100);
	

	}
}
