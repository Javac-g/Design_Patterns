package com.company.Lab2.Composite.Example;

public class Jeep implements Car{
    @Override
    public void draw(String color) {
        System.out.println("Draw " + color + " Jeep");
    }
}
