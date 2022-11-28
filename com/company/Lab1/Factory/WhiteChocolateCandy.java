package com.company.Lab1.Factory;

public class WhiteChocolateCandy implements Candy {
    static{
        System.out.println("White chocolate candy created");
    }
    private String ingridients = "White chocolate , nuts";

    @Override
    public void printComponents() {
        System.out.println("White Chocolate Candy consists of: " + ingridients);
    }
}
