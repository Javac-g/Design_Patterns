package com.company.Lab2.Composite.Example;

public class SportCar implements Car{
    @Override
    public void draw(String color) {
        System.out.println("Draw " + color + " sport car");
    }
}
