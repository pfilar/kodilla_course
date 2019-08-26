package com.kodilla.kodillapatterns2.decorator.taxiportal;

import java.math.BigDecimal;

public class UberNetworkOrderDecor extends AbstractTaxiOrderDecorator {

    public UberNetworkOrderDecor(TaxiOrder taxiOrder) {
        super(taxiOrder);
    }

    @Override
    public BigDecimal getCost() {
        //hardcode stub cost = 25.00
        return super.getCost().add(new BigDecimal(20.00));
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " by Uber Network";
    }
}
