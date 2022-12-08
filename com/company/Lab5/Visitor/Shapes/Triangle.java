package com.company.Lab5.Visitor.Shapes;

public class Triangle implements Shape {
    private int id, sideA, sideB, sideC;

    public Triangle(int id, int sideA, int sideB, int sideC) {
        this.id = id;
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;

    }

    @Override
    public void move(int x, int y) {

    }

    @Override
    public void draw() {

    }

    @Override
    public String accept(Visitor visitor) {
        return visitor.visitRectangle(this);
    }

    public int getId() {
        return id;
    }

    public int getSideA() {
        return sideA;
    }

    public int getSideB() {
        return sideB;
    }

    public int getSideC() {
        return sideC;
    }
}
