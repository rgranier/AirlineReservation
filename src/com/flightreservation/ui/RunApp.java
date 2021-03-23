package com.flightreservation.ui;
import com.flightreservation.model.domain.*;

public class RunApp {

	public static void main(String[] args) {
		
		Traveler traveler = new Traveler(100, "Randall", "Granier");
		System.out.println(traveler.toString());

	}

}
