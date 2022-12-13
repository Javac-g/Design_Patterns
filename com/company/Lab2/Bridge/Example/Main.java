package com.company.Lab2.Bridge.Example;

public class Main {
    public static void main(String...args){
        Rectangle rectangleRed = new Rectangle(new Red());
        Triangle triangleRed = new Triangle(new Red());

        triangleRed.draw();
        rectangleRed.draw();


    }
}
