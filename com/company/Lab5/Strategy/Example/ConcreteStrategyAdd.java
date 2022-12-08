package com.company.Lab5.Strategy.Example;

public class ConcreteStrategyAdd implements Strategy {
    @Override
    public int execute(int a, int b) {
        System.out.println("Called addition");
        return a + b;
    }
}
