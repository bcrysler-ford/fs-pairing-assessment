package com.wyft.services;

import com.wyft.models.Driver;
import com.wyft.models.Ride;
import com.wyft.repositories.RideRepository;

public class RideService {

	private RideRepository rideRepository;

	public RideService (RideRepository rideRepository){
		this.rideRepository = rideRepository;
	}

	public void createRide(Ride rideToCreate){ rideRepository.addRide(rideToCreate); }

	//create a method called acceptRide
	//it must check the logic for whether or not a ride can be accepted, then invoke a repository method to accept it

	//create a method called startRide
	//it must check the logic for whether or not a ride can be started, then invoke a repository method to start it

	//create a method called endRide
	//it must check the logic for whether or not a ride can be started, then invoke a repository method to start it

	//create a method called cancelRide
	//it must check the logic for whether or not a ride can be cancelled, then invoke a repository method to cancel it
}
