package com.company.Lab5.Visitor.Shapes;

import java.util.ArrayList;
import java.util.List;

public class CompoundShape implements Shape {
    public int id;
    public List<Shape>  children = new ArrayList<>();

    public int getId() {
        return id;
    }

    public CompoundShape(int id) {
        this.id = id;
    }
    public void add(Shape shape){
        children.add(shape);
    }

    @Override
    public void move(int x, int y) {

    }

    @Override
    public void draw() {

    }

    @Override
    public String accept(Visitor visitor) {
        return visitor.visitCompoundGraphic(this);
    }
}
