package com.company.Lab3;

import com.company.Lab3.Facade.CarFacade.*;
import com.company.Lab3.Flyweight.CallsFlyweight.CallDirectory;
import com.company.Lab3.Flyweight.CallsFlyweight.Contact;
import com.company.Lab3.Flyweight.CallsFlyweight.View;
import com.company.Lab3.Flyweight.Example.EnglishCharacter;
import com.company.Lab3.Flyweight.Example.FlyweightFactory;

import java.util.Scanner;

public class Main {
    private final static Scanner sc = new Scanner(System.in);
    private static final View  view = new View();
    public static void flyweightDemo(){
        CallDirectory callDirectory = new CallDirectory();
        int command = -1;
        while(command != 3){
            command = view.printMenu();
            switch (command) {
                case 1 -> {
                    String name = view.setString("Enter Name:");
                    String number = view.setString("Enter Phone Number");
                    callDirectory.addContact(name, number);

                }
                case 2 -> {
                    String number = view.setString("Enter phone number of person");
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
