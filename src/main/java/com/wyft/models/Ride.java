package com.wyft.models;

public class Ride {
	private Integer rideID;

	private int pointA; //ben is at his house, which is at 12
	private int pointB; //ben wants to go to the store, which is at 25

	//this status should represent the state of the ride.
	//examples: "in progress", "accepted", "cancelled", "finished"
	private String status;

	public int getPointA() {
		return pointA;
	}

	public int getPointB() {
		return pointB;
	}

	public int getRideID() {
		return rideID;
	}

	public void setRideID(int rideID) {
		this.rideID = rideID;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Ride(Integer rideID, int pointA, int pointB) {
		this.pointA = pointA;
		this.rideID = rideID;
		this.pointB = pointB;
	}
}
