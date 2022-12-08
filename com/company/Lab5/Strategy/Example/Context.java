package com.company.Lab5.Strategy.Example;

public class Context {
    private Strategy strategy;

    public void setStrategy(Strategy frequency) {
        this.strategy = frequency;
    }
    public int executeStrategy(int a, int b){
        return strategy.execute(a,b);
    }
}
