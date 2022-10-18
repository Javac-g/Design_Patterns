package com.company.AbstractFactory;

public class Main {

    public static void main(String...args){

        CandyFactory candyFactory;

        candyFactory = new RoshenFactory();

        candyFactory.createBlackChocolate().printIngredients();
        candyFactory.createWhiteChocolate().printIngredients();

        candyFactory = new MilleniumFactory();

        candyFactory.createWhiteChocolate().printIngredients();
        candyFactory.createBlackChocolate().printIngredients();

    }
}
