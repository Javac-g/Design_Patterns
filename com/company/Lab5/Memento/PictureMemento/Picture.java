package com.company.Lab5.Memento.PictureMemento;

public class Picture {
    private int contrast,brightness,sharpness;



    public void setContrast(int contrast) {
        this.contrast = contrast;
        System.out.println("Added contrast level: " + contrast);
    }



    public void setBrightness(int brightness) {
        this.brightness = brightness;
        System.out.println("Added brightness level: " + brightness);
    }


    public void setSharpness(int sharpness) {
        this.sharpness = sharpness;
        System.out.println("Added sharpness level: " + sharpness);
    }
    public void print(){
        System.out.println("Contrast level: " + contrast);
        System.out.println("Brightness level: " + brightness);
        System.out.println("Sharpness level: " + sharpness);
    }

    public PictureMemento saveSetting(){
        System.out.println("saving editing settings");
        return new PictureMemento(this.contrast,this.brightness,this.sharpness);
    }
    public void restoreSetting(PictureMemento memento){
        this.sharpness = memento.getSharpness();
        this.brightness = memento.getBrightness();
        this.contrast = memento.getContrast();
    }










}
