package com.company.Decorator.XmasTree;

public abstract class Decorator implements Toy{
    protected Toy toy;

    public Decorator(Toy toy) {
        this.toy = toy;
    }

    @Override
    public void decorate() {
        toy.decorate();
    }
}
