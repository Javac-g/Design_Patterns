package com.company.Lab4.Command.TrafficLight;

public class TrafficLight {
    private Light currentLight;

    public void turnRed(){
        this.setCurrentLight(Light.RED);

    }
    public void turnGreen(){
        this.setCurrentLight(Light.GREEN);

    }
    public void turnYellow(){
        this.setCurrentLight(Light.YELLOW);

    }

    public Light getCurrentLight() {
        return currentLight;
    }

    public void setCurrentLight(Light currentLight) {
        this.currentLight = currentLight;
    }

    public void printCurrent(){
        System.out.println("Current light color: " + this.getCurrentLight());

    }
}
