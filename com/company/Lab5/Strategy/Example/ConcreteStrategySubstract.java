package com.company.Lab5.Strategy.Example;

public class ConcreteStrategySubstract implements Strategy {
    @Override
    public int execute(int a, int b) {
        System.out.println("Called substraction");
        return a - b;
    }
}
