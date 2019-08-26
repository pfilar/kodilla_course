package com.kodilla.kodillapatterns2.decorator.taxiportal;

import java.math.BigDecimal;

public class MyTaxiNetworkOrderDekorator extends AbstractTaxiOrderDecorator {

    public MyTaxiNetworkOrderDekorator(TaxiOrder taxiOrder) {
        super(taxiOrder);
    }

    @Override
    public BigDecimal getCost() {
        //hardcode stub cost = 35.00
        return super.getCost().add(new BigDecimal(30.00));
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " by MyTaxi Network";
    }
}
