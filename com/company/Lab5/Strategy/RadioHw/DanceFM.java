package com.company.Lab5.Strategy.RadioHw;

public class DanceFM implements RadioFrequency{
    @Override
    public void play() {
        System.out.println(" - - [Dance FM] - - ");
        System.out.println("Played Pharrell Williams - Happy");
    }
}
