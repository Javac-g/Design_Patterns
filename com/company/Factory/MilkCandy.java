package com.company.Factory;

public class MilkCandy implements Candy {
    static {
        System.out.println("Milk candy created");
    }
    private String ingridients = "Milk, black chocolate, white chocolate";
    @Override
    public void printComponents() {
        System.out.println("Milk Candy ingridients: " + ingridients);
    }
}
