package com.company.Lab5.Memento.PictureMemento;

public class PictureMemento {
    private int contrast,brightness,sharpness;

    public PictureMemento(int contrast, int brightness, int sharpness) {
        this.contrast = contrast;
        this.brightness = brightness;
        this.sharpness = sharpness;
    }

    public int getContrast() {
        return contrast;
    }

    public int getBrightness() {
        return brightness;
    }

    public int getSharpness() {
        return sharpness;
    }
}
