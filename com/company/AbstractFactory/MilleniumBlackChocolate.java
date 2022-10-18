package com.company.AbstractFactory;

public class MilleniumBlackChocolate implements BlackChocolate{
    private String ingredients = "Vanilin,Cocoa butter";
    public MilleniumBlackChocolate() {
        System.out.println("Created Millenium Black Chocolate");
    }

    @Override
    public void printIngredients() {
        System.out.println("Millenium Black Chocolate consist of: " + ingredients);
    }
}
