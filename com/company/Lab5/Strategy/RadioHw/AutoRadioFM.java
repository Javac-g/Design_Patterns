package com.company.Lab5.Strategy.RadioHw;

public class AutoRadioFM implements RadioFrequency{
    @Override
    public void play() {
        System.out.println(" - - [Hit FM] - - ");
        System.out.println("Played Rihanna - Work");
    }
}
