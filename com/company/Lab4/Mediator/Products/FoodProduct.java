package com.company.Lab4.Mediator.Products;

public class FoodProduct implements Product{
    private Consumer consumer;
    private String name;

    public FoodProduct(String name,Consumer consumer) {
        this.name = name;
        this.consumer = consumer;
    }



    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getDescription() {
        return "Fresh food: ";
    }

    @Override
    public ProductType getProductType() {
        return ProductType.Food;
    }
    @Override
    public void process() {
        new SalesManMediator(this).executeProcess(consumer,name);
    }
}
