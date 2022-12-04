package com.company.Lab4.Command.TrafficLight;

public class SwitchGreen implements Command{
    private final TrafficLight trafficLight;

    public SwitchGreen(TrafficLight trafficLight) {
        this.trafficLight = trafficLight;
    }

    @Override
    public void process() {
        trafficLight.turnGreen();
        trafficLight.printCurrent();
    }
}
