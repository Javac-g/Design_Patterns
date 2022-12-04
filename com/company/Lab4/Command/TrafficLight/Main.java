package com.company.Lab4.Command.TrafficLight;

public class Main {
    public static void  main(String...args){
        TrafficLight trafficLight = new TrafficLight();
        SwitchGreen turnGreenOn = new SwitchGreen(trafficLight);
        SwitchYellow turnYellowOn = new SwitchYellow(trafficLight);
        SwitchRed turnRedOn = new SwitchRed(trafficLight);

        Registrator registrator = new Registrator();
        registrator.register("Red light",turnRedOn);
        registrator.register("Green light",turnGreenOn);
        registrator.register("Yellow light",turnYellowOn);

        registrator.execute("Green light");
        registrator.execute("Yellow light");
        registrator.execute("Red light");
    }
}
