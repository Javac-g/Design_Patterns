package com.company.Lab3.Flyweight.CallsFlyweight;

public class PolishContact extends Contact{

    public PolishContact(String name,String number) {
        this.name = name;
        this.number = number;
        System.out.println("Polish provider");
    }

    @Override
    public void print() {
        System.out.println("\nName: " + name + "\nPhone number: " + number);
    }
}
