package com.bridgelabs.cab;

import org.junit.Assert;
import org.junit.Test;

public class CabInvoiceGeneratorTest {
    @Test
    public void given_DistanceAndTime_ShouldReturnTotalFare() {
        InvoiceGenerator invoiceGenerator = new InvoiceGenerator();
        double fare = invoiceGenerator.getFare(4,20);
        Assert.assertEquals(60,fare,0.0);
    }

    @Test
    public void given_DistanceAndTime_ShouldReturnMinimumFare() {
        InvoiceGenerator invoiceGenerator = new InvoiceGenerator();
        double fare = invoiceGenerator.getFare(0.200,1);
        Assert.assertEquals(5,fare,0.0);

    }
}
