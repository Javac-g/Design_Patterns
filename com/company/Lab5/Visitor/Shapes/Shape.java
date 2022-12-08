package com.company.Lab5.Visitor.Shapes;

public interface Shape {
    void move(int x,int y);
    void draw();
    String accept(Visitor visitor);
}
