package com.company.Lab3.Flyweight.CallsFlyweight;

import java.util.Scanner;

public class View {
    private final static Scanner sc = new Scanner(System.in);

    public int printMenu(){
        System.out.println("Menu: ");
        System.out.println("1 - add contact");
        System.out.println("2 - find contact");
        System.out.println("3 - exit");
        return sc.nextInt();
    }
    public String setString(String msg){
        System.out.println(msg);
        return sc.next();
    }
}
