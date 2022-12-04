package com.company.Lab4.Command.TrafficLight;

public class SwitchRed implements Command {
    private final TrafficLight trafficLight;

    public SwitchRed(TrafficLight trafficLight) {
        this.trafficLight = trafficLight;
    }

    @Override
    public void process() {
        trafficLight.turnRed();
        trafficLight.printCurrent();
    }
}
