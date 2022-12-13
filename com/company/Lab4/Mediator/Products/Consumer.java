package com.company.Lab4.Mediator.Products;

import java.util.ArrayList;
import java.util.List;

public class Consumer {
    private final List<Product> products = new ArrayList<>();

    public List<Product> getProducts() {
        return products;
    }

    public void add(Product product){
        products.add(product);
    }
}
