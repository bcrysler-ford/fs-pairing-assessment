package com.wyft.controllers;

import com.wyft.models.Ride;
import com.wyft.services.RideService;

public class RideController {

	private RideService rideService;

	public RideController(RideService rideService) {
		this.rideService = rideService;
	}

	public String hailRide(Ride newRide){
		//invoke a service method which will try to create the ride, then return the result
		rideService.createRide(newRide);
		return "Ride has been hailed";
	}

	//create a method called acceptRide
	//it must invoke a service method which will try to mark a ride as accepted, then return the result

	//create a method called startRide
	//it must invoke a service method which will try to mark a ride as started, then return the result

	//create a method called endRide
	//it must invoke a service method which will try to mark a ride as ended, then return the result

	//create a method called cancelRide
	//it must invoke a service method which will try to mark a ride as ended, then return the result
}
