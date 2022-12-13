package com.company.Lab2.Bridge.Example;

public class Triangle extends Shape{
    public Triangle(Color color) {
        super(color);
    }

    @Override
    public void draw() {
        color.fillColor();
        System.out.println("Triangle");
    }
}
