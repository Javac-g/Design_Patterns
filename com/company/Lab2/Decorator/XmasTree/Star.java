package com.company.Lab2.Decorator.XmasTree;

public class Star extends Decorator{
    public Star(Toy toy) {
        super(toy);
    }

    @Override
    public void decorate() {
        System.out.print(" star, ");
        super.decorate();
    }
}
