package com.company.Lab5.Strategy.RadioHw;

public class Main {
    public static void main(String...args){
        Radio radio = new Radio();

        radio.setFrequency(new HitFM());
        radio.executeStrategy();

        radio.setFrequency(new DanceFM());
        radio.executeStrategy();

        radio.setFrequency(new AutoRadioFM());
        radio.executeStrategy();

    }
}
