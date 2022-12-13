package com.company.Lab4.Mediator.Products;

public interface Product {
    String getDescription();
    String getName();
    ProductType getProductType();
    void process();
}
