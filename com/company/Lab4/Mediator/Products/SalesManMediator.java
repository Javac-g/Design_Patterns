package com.company.Lab4.Mediator.Products;


public class SalesManMediator {
    private final Product product;



    public SalesManMediator(Product product) {
        this.product = product;
    }


    public void executeProcess(Consumer consumer,String name){
        switch (product.getProductType()){
            case Furniture ->consumer.add(new FurnitureProduct(name,consumer));
            case Food -> consumer.add(new FoodProduct(name,consumer));
            default -> System.out.println("Nothing was chosen");

        }
    }
}
