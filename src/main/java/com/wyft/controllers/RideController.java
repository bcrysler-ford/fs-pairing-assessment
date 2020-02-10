package com.wyft.controllers;

import com.wyft.models.Ride;
import com.wyft.models.requests.RideRequest;
import com.wyft.services.RideService;

public class RideController {

	private RideService rideService;

	public RideController(RideService rideService) {
		this.rideService = rideService;
	}

	public String hailRide(Ride request){
		//invoke a service method which will try to create the ride, then return the result
		rideService.createRide(request);
		return "Ride has been hailed";
	}

	public String acceptRide(RideRequest request){
		//invoke a service method which will try to mark a ride as accepted, then return the result

		return "";
	}

	public String startRide(RideRequest request){
		//invoke a service method which will try to mark a ride as started, then return the result

		return "";
	}

	public String endRide(RideRequest request){
		//invoke a service method which will try to mark a ride as ended, then return the result

		return "";
	}

	public String cancelRide(RideRequest request){
		//invoke a service method which will try to mark a ride as ended, then return the result
		return "";
	}

}
