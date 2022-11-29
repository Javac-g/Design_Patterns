package com.company.Lab3.Flyweight.Example;

public class CharacterA extends EnglishCharacter{
    public CharacterA() {
        symbol = 'A';
        width = 10;
        height = 20;
    }

    @Override
    public void print() {
        System.out.println("\nSymbol: "  + symbol + "\nwidth: " + width + "\nheight: " + height);
    }
}
