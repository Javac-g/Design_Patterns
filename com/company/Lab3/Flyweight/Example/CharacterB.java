package com.company.Lab3.Flyweight.Example;

public class CharacterB extends EnglishCharacter{

    public CharacterB() {
        symbol = 'B';
        width = 15;
        height = 25;
    }

    @Override
    public void print() {
        System.out.println("\nSymbol: "  + symbol + "\nwidth: " + width + "\nheight: " + height);
    }
}
