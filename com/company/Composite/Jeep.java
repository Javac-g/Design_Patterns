package com.company.Composite;

public class Jeep implements Car{
    @Override
    public void draw(String color) {
        System.out.println("Draw " + color + " jeep");
    }
}
