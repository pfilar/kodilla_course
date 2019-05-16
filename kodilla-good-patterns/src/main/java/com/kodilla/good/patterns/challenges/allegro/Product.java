package com.kodilla.good.patterns.challenges.allegro;

import java.math.BigDecimal;

public class Product {
    private String productName;
    private String productDescription;
    private BigDecimal productPrice;        // https://www.mberkan.pl/2014/08/03/operacje-na-kwotach-w-javie/

    public Product(String productName, String productDescription, BigDecimal productPrice) {
        this.productName = productName;
        this.productDescription = productDescription;
        this.productPrice = productPrice;
    }

    public String getProductName() {
        return productName;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public BigDecimal getProductPrice() {
        return productPrice;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productName='" + productName + '\'' +
                ", productDescription='" + productDescription + '\'' +
                ", productPrice=" + productPrice +
                '}';
    }
}
