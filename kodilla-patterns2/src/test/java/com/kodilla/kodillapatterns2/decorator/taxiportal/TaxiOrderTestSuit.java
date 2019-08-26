package com.kodilla.kodillapatterns2.decorator.taxiportal;

import org.junit.Test;
import java.math.BigDecimal;
import static org.junit.Assert.assertEquals;

public class TaxiOrderTestSuit {

    @Test
    public void testBasicTaxiOrderGetCost() {
        //Given
        TaxiOrder theOrder = new BasicTaxiOrder();
        //BasicTaxiOrder theOrder = new BasicTaxiOrder();

        //When
        BigDecimal calculatedCost = theOrder.getCost();

        //Then
        assertEquals(new BigDecimal(5.00), calculatedCost);
    }

    @Test
    public void testBasicTaxiOrderGetDescription() {
        //Given
        TaxiOrder theOrder = new BasicTaxiOrder();
        //BasicTaxiOrder theOrder = new BasicTaxiOrder();

        //When
        String description = theOrder.getDescription();

        //Then
        assertEquals("Drive a course", description);
    }

    @Test
    public void testTaxiNetworkGetCost() {
        //Given
        TaxiOrder theOrder = new BasicTaxiOrder();
        theOrder = new TaxiNetworkOrderDecorator(theOrder);

        //When
        BigDecimal cost = theOrder.getCost();

        //Then
        assertEquals(new BigDecimal(40.00), cost);
    }

    @Test
    public void testTaxiNetworkGetDescription() {
        //Given
        TaxiOrder theOrder = new BasicTaxiOrder();
        theOrder = new TaxiNetworkOrderDecorator(theOrder);

        //When
        String description = theOrder.getDescription();

        //Then
        assertEquals("Drive a course by Taxi Network", description);
    }

    @Test
    public void testUberNetworkGetCost() {
        //Given
        TaxiOrder theOrder = new BasicTaxiOrder();
        theOrder = new UberNetworkOrderDecor(theOrder);

        //When
        BigDecimal cost = theOrder.getCost();

        //Then
        assertEquals(new BigDecimal(25.00), cost);
    }

    @Test
    public void testUberNetworkGetDescription() {
        //Given
        TaxiOrder theOrder = new BasicTaxiOrder();
        theOrder = new UberNetworkOrderDecor(theOrder);

        //When
        String description = theOrder.getDescription();

        //Then
        assertEquals("Drive a course by Uber Network", description);
    }

    @Test
    public void testMyTaxiNetworkGetCost() {
        //Given
        TaxiOrder theOrder = new BasicTaxiOrder();
        theOrder = new MyTaxiNetworkOrderDekorator(theOrder);

        //When
        BigDecimal cost = theOrder.getCost();

        //Then
        assertEquals(new BigDecimal(35.00), cost);
    }

    @Test
    public void testMyTaxiNetworkGetDescription() {
        //Given
        TaxiOrder theOrder = new BasicTaxiOrder();
        theOrder = new MyTaxiNetworkOrderDekorator(theOrder);

        //When
        String description = theOrder.getDescription();

        //Then
        assertEquals("Drive a course by MyTaxi Network", description);
    }

    // Test with child seat

    @Test
    public void testMyTaxiWithChildSeatGetCost() {
        //Given
        TaxiOrder theOrder = new BasicTaxiOrder();
        theOrder = new MyTaxiNetworkOrderDekorator(theOrder);
        theOrder = new ChildSeatDecorator(theOrder);

        //When
        BigDecimal cost = theOrder.getCost();

        //Then
        assertEquals(new BigDecimal(37.00), cost);
    }

    @Test
    public void testMyTaxiWithChildSeatGetDescription() {
        //Given
        TaxiOrder theOrder = new BasicTaxiOrder();
        theOrder = new MyTaxiNetworkOrderDekorator(theOrder);
        theOrder = new ChildSeatDecorator(theOrder);

        //When
        String description = theOrder.getDescription();

        //Then
        assertEquals("Drive a course by MyTaxi Network + child seat", description);
    }

    @Test
    public void testUberWithTwoChildSeatCost() {
        //Given
        TaxiOrder theOrder = new BasicTaxiOrder();
        theOrder = new UberNetworkOrderDecor(theOrder);
        theOrder = new ChildSeatDecorator(theOrder);
        theOrder = new ChildSeatDecorator(theOrder);

        //When
        BigDecimal cost = theOrder.getCost();

        //Then
        assertEquals(new BigDecimal(29.00), cost);
    }

    @Test
    public void testUberWithTwoChildSeatDescription() {
        //Given
        TaxiOrder theOrder = new BasicTaxiOrder();
        theOrder = new UberNetworkOrderDecor(theOrder);
        theOrder = new ChildSeatDecorator(theOrder);
        theOrder = new ChildSeatDecorator(theOrder);

        //When
        String description = theOrder.getDescription();

        //Then
        assertEquals("Drive a course by Uber Network + child seat + child seat", description);
    }

    @Test
    public void testVipTaxiWithChildSeatExpressGetCost() {
        //Given
        TaxiOrder theOrder = new BasicTaxiOrder();
        theOrder = new TaxiNetworkOrderDecorator(theOrder);
        theOrder = new ExpressDecorator(theOrder);
        theOrder = new VipCarDecorator(theOrder);
        theOrder = new ChildSeatDecorator(theOrder);

        //When
        BigDecimal cost = theOrder.getCost();

        //Then
        assertEquals(new BigDecimal(57.00), cost);
    }

    @Test
    public void testVipTaxiWithChildSeatExpressGetDescription() {
        //Given
        TaxiOrder theOrder = new BasicTaxiOrder();
        theOrder = new TaxiNetworkOrderDecorator(theOrder);
        theOrder = new ExpressDecorator(theOrder);
        theOrder = new VipCarDecorator(theOrder);
        theOrder = new ChildSeatDecorator(theOrder);

        //When
        String description = theOrder.getDescription();

        //Then
        assertEquals("Drive a course by Taxi Network + express service + variant VIP + child seat", description);
    }
}
