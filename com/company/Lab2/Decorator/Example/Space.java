package com.company.Lab2.Decorator.Example;

public class Space extends Decorator{
    public Space(Component component){
        super(component);
    }

    @Override
    public void doOperation() {
        System.out.print(" ");
        super.doOperation();
    }

    @Override
    public void doNothing() {
        System.out.print(" space ");
    }
}
