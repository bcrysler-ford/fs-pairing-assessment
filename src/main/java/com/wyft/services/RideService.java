package com.wyft.services;

import com.wyft.models.Driver;
import com.wyft.models.Ride;
import com.wyft.repositories.RideRepository;

public class RideService {

	private RideRepository rideRepository;

	public RideService (RideRepository rideRepository){
		this.rideRepository = rideRepository;
	}

	public void createRide(Ride rideToCreate){
		rideRepository.addRide(rideToCreate);
	}

	public int acceptRide(Driver driver, Integer acceptedRideID){
	    //check the logic for whether or not a ride can be accepted, then invoke a repository method to accept it

		return -999;
	}

	public boolean startRide(int rideID, int driverLocation){
	    //check the logic for whether or not a ride can be started, then invoke a repository method to start it

		return false;
	}

	public boolean endRide(int rideID, int driverLocation){
	    //check the logic for whether or not a ride can be started, then invoke a repository method to start it

		return false;
	}

	public int cancelRide(int rideID, int driverLocation) {
	    //check the logic for whether or not a ride can be cancelled, then invoke a repository method to cancel it

		return -999;
	}
}
