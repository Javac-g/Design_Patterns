package com.company.Lab2.Decorator;

public class Hello extends Decorator{
    public Hello(Component component) {
        super(component);
    }

    @Override
    public void doOperation() {
        System.out.print("Hello");
        super.doOperation();
    }

    @Override
    public void doNothing() {
        super.doNothing();
    }
}
