package com.bridgelabs.cab;

import java.util.ArrayList;
import java.util.List;

public class InvoiceGenerator {
    private final int COST_PER_KM = 10;
    private final int COST_PER_MINUTE = 1;
    private final int MIN_FARE = 5;
    List<Ride> rides = new ArrayList();
    public double getFare(double distance, int time) {
        double fare = distance * COST_PER_KM + time * COST_PER_MINUTE;
        if(fare < MIN_FARE){
            return  MIN_FARE;
        }
        return fare;
    }

    public double getTotalFare() {
        double totalFare = 0;
        for(Ride ride : rides){
            totalFare += this.getFare(ride.getDistance(), ride.getTime());
        }
        return totalFare;
    }

    public void addRide(double distance, int time) {
        Ride ride = new Ride(distance,time);
        rides.add(ride);
    }
}
