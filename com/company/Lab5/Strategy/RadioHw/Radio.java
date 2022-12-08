package com.company.Lab5.Strategy.RadioHw;

public class Radio {
    private RadioFrequency frequency;

    public void setFrequency(RadioFrequency frequency) {
        this.frequency = frequency;
    }
    public void executeStrategy(){
        frequency.play();
    }
}
