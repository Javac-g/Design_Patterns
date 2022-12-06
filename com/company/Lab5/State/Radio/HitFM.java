package com.company.Lab5.State.Radio;

public class HitFM implements RadioFrequancy{
    @Override
    public String getSongName() {
        return SongNames.Adele.getName();
    }

    @Override
    public void playNext(Radio radio) {
        radio.setRadioFrequancy(new HappyFM());
    }

    @Override
    public void playPrevious(Radio radio) {
        System.out.println("--------White noise--------");
    }
}
