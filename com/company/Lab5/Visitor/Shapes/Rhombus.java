package com.company.Lab5.Visitor.Shapes;

public class Rhombus extends Dot {
    private int sideC,sideE;

    public Rhombus(int id, int sideA, int sideB, int sideC,int sideE) {
        super(id, sideA , sideB);
        this.sideC = sideC;
        this.sideE = sideE;
    }

    @Override
    public String accept(Visitor visitor) {
        return visitor.visitCircle(this);
    }

    public int getSideC() {
        return sideC;
    }

    public int getSideE() {
        return sideE;
    }
}
