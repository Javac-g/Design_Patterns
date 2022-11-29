package com.company.Lab3.Flyweight.Example;

public class CharacterC extends EnglishCharacter{
    public CharacterC() {
        symbol = 'c';
        height = 11;
        width = 22;
    }

    @Override
    public void print() {
        System.out.println("\nSymbol: "  + symbol + "\nwidth: " + width + "\nheight: " + height);
    }
}
