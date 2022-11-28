package com.company.Lab1.Factory;

public class CandyFactory {

    public Candy createCandy(Taste UI){

        if(UI.equals(Taste.BLACK)){

            return new BlackChocolateCandy();

        } else if (UI.equals(Taste.WHITE)) {

            return new WhiteChocolateCandy();

        }else if(UI.equals(Taste.MILK)){

            return new MilkCandy();
        }

        return null;
    }

}
