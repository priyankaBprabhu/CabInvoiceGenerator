package com.bridgelabs.cab;

public class InvoiceGenerator {
    private final int COST_PER_KM = 10;
    private final int COST_PER_MINUTE = 1;
    private final int MIN_FARE = 5;
    public double getFare(int distance, int time) {
        double fare = distance * COST_PER_KM + time * COST_PER_MINUTE;
        return fare;
    }
}
