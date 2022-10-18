package com.company.Decorator;

public class Main {
    public static void main(String...args){
        Decorator decorator = new Hello(new Comma(new Space(new MainComponent())));
        decorator.doOperation();
        decorator.doNothing();
    }
}
