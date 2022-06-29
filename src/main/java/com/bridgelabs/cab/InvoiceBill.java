package com.bridgelabs.cab;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class InvoiceBill {
    int totalNumRides;
    double totalFare;
    int avgFarePerRide;

    public InvoiceBill(int totalNumRides, double totalFare, int avgFarePerRide) {
        this.totalNumRides = totalNumRides;
        this.totalFare = totalFare;
        this.avgFarePerRide = avgFarePerRide;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        InvoiceBill that = (InvoiceBill) o;
        return totalNumRides == that.totalNumRides && Double.compare(that.totalFare, totalFare) == 0 && avgFarePerRide == that.avgFarePerRide;
    }

}
