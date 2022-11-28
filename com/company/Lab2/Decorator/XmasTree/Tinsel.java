package com.company.Lab2.Decorator.XmasTree;

public class Tinsel extends Decorator{
    public Tinsel(Toy toy) {
        super(toy);
    }

    @Override
    public void decorate() {
        System.out.print(" tinsel, ");
        super.decorate();
    }
}
