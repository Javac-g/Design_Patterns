package com.company.Lab4.Mediator.Products;

import java.util.Scanner;

public class Main {
    private final static Scanner scanner = new Scanner(System.in);
    public static void readShopList(Consumer consumer){
        for (Product x : consumer.getProducts()){
            System.out.println(x.getDescription() + x.getName());
        }
    }
    public static void buy(Consumer consumer){
        boolean b = true;
        while (b){
            System.out.println("Menu");
            System.out.println("\n1 - buy food\n2 - buy furniture\n3 - exit");
            int choose = scanner.nextInt();
            Product product;
            b = switch (choose){
                case 1 -> {
                    System.out.println("Enter food to buy: ");
                    String name = scanner.next();
                    product = new FoodProduct(name,consumer);
                    product.process();
                    yield true;

                }
                case 2 ->{
                    System.out.println("Enter furniture to buy: ");
                    String name = scanner.next();
                    product = new FurnitureProduct(name,consumer);
                    product.process();
                    yield true;

                }case 3 ->{
                    System.out.println("Product list: ");
                    yield false;
                }
                default -> throw new IllegalStateException("Unexpected value: " + choose);
            };

        }
    }
    public static void main(String...args){
        Consumer consumer = new Consumer();

        buy(consumer);

        readShopList(consumer);

    }
}
