package com.company.Lab2.Bridge.Example;

public class Rectangle extends Shape{
    public Rectangle(Color color) {
        super(color);
    }

    @Override
    public void draw() {
        color.fillColor();
        System.out.println("Triangle ");
    }
}
