package com.wyft.repositories;

import com.wyft.models.Ride;

import java.util.HashMap;
import java.util.Map;

public class RideRepository {

	//Treat this as the database for rides. Integer is the Ride ID, Ride is the corresponding Ride object.
	private Map<Integer, Ride> rideDatabase;

	public RideRepository(){
		this.rideDatabase = new HashMap<Integer, Ride>();
	}

	public void addRide(Ride rideToAdd){
		//add a ride to the database.
		rideToAdd.setStatus("Requested");
		this.rideDatabase.put(rideToAdd.getRideID(), rideToAdd);
	}

	//create a method called getRideInfo
	//it must retrieve a ride object

	//create a method called setRideToAccepted
	//it must get a ride from the database, and set its status to Accepted

	//create a method called startRide
	//it must get a ride from the database, and set its status to In Progress

	//create a method called endRide
	//it must get a ride from the database, and set its status to Ended

	//create a method called cancelRide
	//it must get a ride from the database, and set its status to Cancelled

	public int getSize(){
		return rideDatabase.size();
	}
}
