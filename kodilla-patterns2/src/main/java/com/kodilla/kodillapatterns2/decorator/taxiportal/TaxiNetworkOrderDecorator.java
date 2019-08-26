package com.kodilla.kodillapatterns2.decorator.taxiportal;

import java.math.BigDecimal;

public class TaxiNetworkOrderDecorator extends AbstractTaxiOrderDecorator {

    public TaxiNetworkOrderDecorator(TaxiOrder taxiOrder) {
        super(taxiOrder);
    }

    @Override
    public BigDecimal getCost() {
        //hardcode stub cost = 35.00
        return super.getCost().add(new BigDecimal(35.00));
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " by Taxi Network";
    }
}
