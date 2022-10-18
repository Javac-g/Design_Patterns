package com.company.Decorator.XmasTree;

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
