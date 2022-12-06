package com.company.Lab5.State.Radio;

public class Radio {
    private RadioFrequancy radioFrequancy;

    public RadioFrequancy getRadioFrequancy() {
        return radioFrequancy;
    }

    public void setRadioFrequancy(RadioFrequancy radioFrequancy) {
        this.radioFrequancy = radioFrequancy;
    }
    public void getNextFrequancy(){
        radioFrequancy.playNext(this);
    }
    public void getPreviousFrequancy(){
        radioFrequancy.playPrevious(this);
    }
    public String getStatusName(){
        return radioFrequancy.getSongName();
    }
}
