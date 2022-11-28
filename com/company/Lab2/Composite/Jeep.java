package com.company.Lab2.Composite;

public class Jeep implements Car{
    @Override
    public void draw(String color) {
        System.out.println("Draw " + color + " Jeep");
    }
}
