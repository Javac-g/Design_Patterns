package com.company.Lab5.State.Radio;

public class HappyFM implements RadioFrequancy{
    @Override
    public String getSongName() {
        return SongNames.Alan_Walker.getName();
    }

    @Override
    public void playNext(Radio radio) {
        radio.setRadioFrequancy(new TravelFM());
    }

    @Override
    public void playPrevious(Radio radio) {
        radio.setRadioFrequancy(new HitFM());
    }
}
