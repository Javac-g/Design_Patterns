package com.company.Lab4.Mediator.Products;

public class FurnitureProduct implements Product{
    private  Consumer consumer;
    private String name;

    public FurnitureProduct(String  name,Consumer consumer) {
        this.name = name;
        this.consumer = consumer;
    }

    @Override
    public String getName() {
        return name;
    }


    @Override
    public String getDescription() {
        return "Soft furniture: ";
    }

    @Override
    public ProductType getProductType() {
        return ProductType.Furniture;
    }

    @Override
    public void process() {
        new SalesManMediator(this).executeProcess(consumer,name);
    }
}
