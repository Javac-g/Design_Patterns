package com.company.Decorator;

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
