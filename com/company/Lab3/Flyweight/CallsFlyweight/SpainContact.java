package com.company.Lab3.Flyweight.CallsFlyweight;

public class SpainContact extends Contact{

    public SpainContact(String name, String number) {
        this.name = name;
        this.number = number;
        System.out.println("Spanish provider");
    }

    @Override
    public void print() {
        System.out.println("\nName: " + name + "\nPhone number: " + number);
    }
}
