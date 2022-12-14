package com.company.Lab2.Decorator.Example;

public abstract class Decorator implements Component{
    protected Component component;

    public Decorator(Component component) {
        this.component = component;
    }

    @Override
    public void doOperation() {
        component.doOperation();
    }
    public void doNothing(){
        System.out.print("Nothing to do");
    }
}
