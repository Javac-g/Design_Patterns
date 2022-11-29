package com.company.Lab3.Flyweight.CallsFlyweight;

import java.util.HashSet;
import java.util.Set;

public class CallDirectory {
    private final Set<Contact> book = new HashSet<>();
    private final static String ukr = "+38";
    private final static String pol = "+48";
    private final static  String spa = "+34";

    public  void addContact(String name,String number){

        Contact contact = switch (number.substring(0,3)){

                    case ukr -> new UkrainianContact(name,number);
                    case pol -> new PolishContact(name,number);
                    case spa ->new SpainContact(name, number);
                    default -> new UndefinedContact(name, number);
        };

        book.add(contact);
        System.out.println("Saved contact");


    }

    public  Contact getContact(String number){
        return find(number);
    }
    private Contact find(String number){
        for (Contact contact:book){
            if (contact.number.equals(number)){
                return contact;
            }
        }
        return null;
    }
}
