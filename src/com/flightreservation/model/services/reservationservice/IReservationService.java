package com.flightreservation.model.services.reservationservice;
import com.flightreservation.model.domain.*;
import java.util.ArrayList;

/**
 * 
 * @author Randall Granier
 *
 */
public interface IReservationService {
	public ArrayList<Flight> listFlights();
	public ArrayList<Reservation> listReservations();
	public boolean reserveFlight(int id);
	public boolean cancelFlight(int id);

}
