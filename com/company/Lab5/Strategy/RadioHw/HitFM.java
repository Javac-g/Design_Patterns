package com.company.Lab5.Strategy.RadioHw;

public class HitFM implements RadioFrequency{
    @Override
    public void play() {
        System.out.println(" - - [Hit FM] - - ");
        System.out.println("Played Adele - Hello");
    }
}
