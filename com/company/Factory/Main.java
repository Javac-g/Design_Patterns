package com.company.Factory;

public class Main {

    public static void main(String...args){

        CandyFactory candyFactory = new CandyFactory();

        candyFactory.createCandy(Taste.MILK).printComponents();
        candyFactory.createCandy(Taste.BLACK).printComponents();
        candyFactory.createCandy(Taste.WHITE).printComponents();
    }
}
