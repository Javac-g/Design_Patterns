package com.company.Lab3.Flyweight.CallsFlyweight;

public class UndefinedContact extends Contact{
    public UndefinedContact(String name,String number) {
        this.name = name;
        this.number = number;
        System.out.println("Undefined network provider");
    }

    @Override
    public void print() {
        System.out.println("\nName: " + name + "\nPhone number: " + number);
    }
}
