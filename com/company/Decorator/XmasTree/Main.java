package com.company.Decorator.XmasTree;

public class Main {
    public static void main(String...args){
        Decorator decorator = new Star(new Candle(new Tinsel(new Tree())));
        decorator.decorate();
    }
}
