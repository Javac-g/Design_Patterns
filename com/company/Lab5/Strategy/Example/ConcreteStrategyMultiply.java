package com.company.Lab5.Strategy.Example;

public class ConcreteStrategyMultiply implements Strategy {
    @Override
    public int execute(int a, int b) {
        System.out.println("Called multiplication");
        return a * b;
    }
}
