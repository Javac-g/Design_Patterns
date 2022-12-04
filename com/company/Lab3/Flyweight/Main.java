package com.company.Lab3.Flyweight;

import com.company.Lab3.Flyweight.CallsFlyweight.CallDirectory;
import com.company.Lab3.Flyweight.CallsFlyweight.Contact;
import com.company.Lab3.Flyweight.CallsFlyweight.View;

public class Main {
    private static final View view = new View();
    public static void main(String...args){
        CallDirectory callDirectory = new CallDirectory();
        int command = -1;
        while(command != 3){
            command = view.printMenu();
            switch (command) {
                case 1 -> {
                    String name = view.setString("Enter Name:");
                    String number = view.setString("Enter Phone Number:");
                    callDirectory.addContact(name, number);


                }
                case 2 -> {
                    String number = view.setString("Enter phone number of person to find");
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
}
