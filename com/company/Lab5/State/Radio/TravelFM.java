package com.company.Lab5.State.Radio;

public class TravelFM implements RadioFrequancy{
    @Override
    public String getSongName() {
        return SongNames.Rihanna.getName();
    }

    @Override
    public void playNext(Radio radio) {
        System.out.println("-------White noise-------");
    }

    @Override
    public void playPrevious(Radio radio) {
        radio.setRadioFrequancy(new HappyFM());
    }
}
