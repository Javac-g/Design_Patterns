package com.company.Lab2.Decorator.Example;

public class Comma extends Decorator{
    public Comma(Component component) {
        super(component);
    }

    @Override
    public void doOperation() {
        System.out.print(",");
        super.doOperation();
    }

    @Override
    public void doNothing() {
        super.doNothing();
    }
}
