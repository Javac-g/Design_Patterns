package com.company.Lab5.State.Radio;

public enum SongNames {
    Alan_Walker("Alan Walker - Dark Side"),
    Adele("Adele - Hello"),
    Rihanna("Rihanna - Work");
    private String name;

    SongNames(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
