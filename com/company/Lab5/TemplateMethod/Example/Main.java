package com.company.Lab5.TemplateMethod.Example;

import java.util.Scanner;

public class Main {
    public static void main(String...args){
        Scanner reader = new Scanner(System.in);
        System.out.print("Enter user name: ");
        String username = reader.nextLine();
        System.out.print("Enter password:");
        String password = reader.nextLine();
        System.out.print("Enter message:");
        String message = reader.nextLine();
        System.out.println("Choose Network to post:");
        System.out.println("1 - Facebook");
        System.out.println("2 - Twitter");
        int choice = Integer.parseInt(reader.nextLine());
        Network network = null;

        if(choice == 1){
            network = new Facebook(username,password);
        } else if (choice == 2) {
            network = new Twitter(username,password);
        }
        network.post(message);

    }
}
