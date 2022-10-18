package com.company.AbstractFactory;

public class MilleniumWhiteChocolate implements WhiteChocolate{
    private String ingredients = "Sugar,Cacao beans,milk";
    public MilleniumWhiteChocolate() {
        System.out.println("Created Millenium White Chocolate");
    }

    @Override
    public void printIngredients() {
        System.out.println("Millenium White chocolate consist of: " + ingredients);
    }
}
