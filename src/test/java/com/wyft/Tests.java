package com.wyft;

import com.wyft.controllers.RideController;
import com.wyft.models.Driver;
import com.wyft.models.Ride;
import com.wyft.models.requests.RideRequest;
import com.wyft.repositories.RideRepository;
import com.wyft.services.RideService;

public class Tests {

	RideRepository rideRepository;
	RideService rideService;
	RideController rideController;

	public Tests(){
		this.rideRepository = new RideRepository();
		this.rideService = new RideService(rideRepository);
		this.rideController = new RideController(rideService);
	}

	// A user must be able to request a ride from point A to point B.
	public void hailRideShouldReturnSuccess_WhenValidRequestProvided(){
		Ride currentRide = new Ride(1,3,70);
		TestHelper.assertEquals("Ride has been hailed", rideController.hailRide(currentRide));
	}

	// When a ride is requested, it must be registered in the database.
	public void hailRideShouldAddRideToRepository(){
		Ride currentRide = new Ride(1,3,70);
		rideController.hailRide(currentRide);
		TestHelper.assertEquals(1, rideRepository.getSize());
	}

	// A driver must be able to accept the ride request and receive the directions
	public void acceptRideShouldReturnDirectionsToPointA_ifDriverIsWithinRange(){
		Ride currentRide = new Ride(1,3,70);
		Driver currentDriver = new Driver(10);
		RideRequest rideRequest = new RideRequest(currentDriver, 1);

		rideController.hailRide(currentRide);

		TestHelper.assertEquals("Proceed to point A", rideController.acceptRide(rideRequest));
	}

//	// Only 1 driver can accept a ride request.
//	public void acceptRideShouldReturnAlreadyAccepted_whenRideAlreadyAccepted(){
//	}
//
//	// A driver must be within 10 miles of the requested ride starting location to accept the ride
//	public void acceptRideShouldReturnOutOfRange_whenDriverIsOutOfRange(){
//	}
//
//	// The user must be able to confirm/start the ride once the driver has accepted and arrives at point A
//	public void startRideShouldReturnStarted_whenDriverHasAcceptedAndArrived(){
//	}
//
//	// The user should not be able to start the ride if the driver is not in range
//	public void startRideShouldReturnDriverOutOfRange_whenDriverNotInRange(){
//	}
//
//
//	// The user can cancel the ride if it has not been started and driver has not arrived
//	public void cancelRideShouldReturnCancelled_whenRideHasNotYetStarted_andDriverHasNotArrived(){
//	}
//
//	// The user cannot cancel the ride if the driver has arrived
//	public void cancelRideShouldReturnDriverArrived_whenDriverHasArrived(){
//	}
//
//	// The user cannot cancel the ride if it has already started
//	public void cancelRideShouldReturnAlreadyInProgress_whenRideHasAlreadyStarted(){
//	}
//
//	// The driver can end the ride when they have arrived at point B
//	public void endRideShouldReturnSuccess_whenDriverIsAtPointB(){
//	}
//
//	// The driver cannot end the ride when they have not yet arrived
//	public void endRideShouldReturnFailure_whenDriverHasNotArrivedAtPointB(){
//	}
}
