package com.wyft.controllers;

import com.wyft.models.Ride;
import com.wyft.repositories.RideRepository;
import com.wyft.services.RideService;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class RideControllerTest {

    RideRepository rideRepository;
    RideService rideService;
    RideController rideController;

    @Before
    public void setup(){
        this.rideRepository = new RideRepository();
        this.rideService = new RideService(rideRepository);
        this.rideController = new RideController(rideService);
    }

    @Test
    // A user must be able to request a ride from point A to point B.
    public void hailRideShouldReturnSuccess_WhenValidRequestProvided(){
        Ride currentRide = new Ride(1,3,70);
        assertEquals("Ride has been hailed", rideController.hailRide(currentRide));
    }

    @Test
    // When a ride is requested, it must be registered in the database.
    public void hailRideShouldAddRideToRepository(){
        //set up objects required for test
        Ride currentRide = new Ride(1,3,70);

        //execute test scenario
        rideController.hailRide(currentRide);

        //test results
        assertEquals(1, rideRepository.getSize());
    }

//    @Test
//	// A driver must be able to accept the ride request and receive the directions
//	public void acceptRideShouldReturnDirectionsToPointA_ifDriverIsWithinRange(){
//	}
//
//	@Test
//	// Only 1 driver can accept a ride request.
//	public void acceptRideShouldReturnAlreadyAccepted_whenRideAlreadyAccepted(){
//	}
//
//	@Test
//	// A driver must be within 10 miles of the requested ride starting location to accept the ride
//	public void acceptRideShouldReturnOutOfRange_whenDriverIsOutOfRange(){
//	}
//
//    @Test
//	// The user must be able to confirm/start the ride once the driver has accepted and arrives at point A
//	public void startRideShouldReturnStarted_whenDriverHasAcceptedAndArrived(){
//	}
//
//    @Test
//	// The user should not be able to start the ride if the driver is not in range
//	public void startRideShouldReturnDriverOutOfRange_whenDriverNotInRange(){
//	}
//
//    @Test
//	// The user can cancel the ride if it has not been started and driver has not arrived
//	public void cancelRideShouldReturnCancelled_whenRideHasNotYetStarted_andDriverHasNotArrived(){
//	}
//
//    @Test
//	// The user cannot cancel the ride if the driver has arrived
//	public void cancelRideShouldReturnDriverArrived_whenDriverHasArrived(){
//	}
//
//    @Test
//	// The user cannot cancel the ride if it has already started
//	public void cancelRideShouldReturnAlreadyInProgress_whenRideHasAlreadyStarted(){
//	}
//
//    @Test
//	// The driver can end the ride when they have arrived at point B
//	public void endRideShouldReturnSuccess_whenDriverIsAtPointB(){
//	}
//
//    @Test
//	// The driver cannot end the ride when they have not yet arrived
//	public void endRideShouldReturnFailure_whenDriverHasNotArrivedAtPointB(){
//	}

}
