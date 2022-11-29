package com.company.Lab3.Flyweight.CallsFlyweight;

public class UkrainianContact extends Contact{

    public UkrainianContact(String name,String number) {
        this.name = name;
        this.number = number;
        System.out.println("Ukrainian provider");
    }

    @Override
    public void print() {
        System.out.println("\nName: " + name + "\nPhone number: " + number);
    }

}
