package com.company.Lab2.Decorator.XmasTree;

public class Candle extends Decorator{
    public Candle(Toy toy) {
        super(toy);
    }

    @Override
    public void decorate() {
        System.out.print (" candle - ");
        super.decorate();
    }
}
