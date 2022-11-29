package com.company.Lab3;

import com.company.Lab3.Facade.CarFacade.*;
import com.company.Lab3.Flyweight.CallsFlyweight.CallDirectory;
import com.company.Lab3.Flyweight.CallsFlyweight.Contact;
import com.company.Lab3.Flyweight.Example.EnglishCharacter;
import com.company.Lab3.Flyweight.Example.FlyweightFactory;

import java.util.Scanner;

public class Main {
    private final static Scanner sc = new Scanner(System.in);
    public static void flyweightDemo(){
        CallDirectory callDirectory = new CallDirectory();
        int command = -1;
        while(command != 3){
            System.out.println("Menu: ");
            System.out.println("1 - add contact");
            System.out.println("2 - find contact");
            System.out.println("3 - exit");
            command = sc.nextInt();
            switch (command) {
                case 1 -> {
                    System.out.println("Enter Name:");
                    String name = sc.next();
                    System.out.println("Enter Phone Number");
                    String number = sc.next();
                    callDirectory.addContact(name, number);

                }
                case 2 -> {
                    System.out.println("Enter phone number of person");
                    String number = sc.next();
                    Contact contact = callDirectory.getContact(number);
                    if (contact != null) {
                        contact.print();
                    } else {
                        System.out.println("Nobody found");
                    }

                }
                case 3 -> System.out.println("Bye");
                default -> System.out.println("Wrong command");
            }
        }

    }
    public static void facadeDemo(){
        new CarFacade(new Engine(),new Gear(),new Wheels(),new ABS()).turnOnCar();
    }
    public static void main(String...args){
        //facadeDemo();
        //flyweightDemo();
        flyweightDemo();
    }
}
