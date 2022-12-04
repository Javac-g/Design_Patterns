package com.company.Lab4.Command.TrafficLight;

public class SwitchYellow implements Command{
    private final TrafficLight trafficLight;

    public SwitchYellow(TrafficLight trafficLight) {
        this.trafficLight = trafficLight;
    }

    @Override
    public void process() {
        trafficLight.turnYellow();
        trafficLight.printCurrent();
    }
}
