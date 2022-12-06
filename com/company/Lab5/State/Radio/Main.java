package com.company.Lab5.State.Radio;

public class Main {
    public static void main(String...args){
        Radio radio = new Radio();
        radio.setRadioFrequancy(new HitFM());
        System.out.println(radio.getStatusName());
        radio.getNextFrequancy();
        System.out.println(radio.getStatusName());
        radio.getNextFrequancy();
        System.out.println(radio.getStatusName());
        radio.getPreviousFrequancy();
        System.out.println(radio.getStatusName());
        radio.getNextFrequancy();
        System.out.println(radio.getStatusName());
    }
}
