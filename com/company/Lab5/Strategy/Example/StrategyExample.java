package com.company.Lab5.Strategy.Example;

public class StrategyExample {
    public static void main(String...args){
        Context context = new Context();

        context.setStrategy(new ConcreteStrategyAdd());
        int resultA = context.executeStrategy(30,10);

        context.setStrategy(new ConcreteStrategySubstract());
        int resultB = context.executeStrategy(30,10);

        context.setStrategy(new ConcreteStrategyMultiply());
        int resultC = context.executeStrategy(30,10);

        System.out.println("A: " + resultA);
        System.out.println("B: " + resultB);
        System.out.println("C: " + resultC);
    }
}
