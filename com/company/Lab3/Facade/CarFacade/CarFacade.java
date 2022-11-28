package com.company.Lab3.Facade.CarFacade;

public class CarFacade {

    private Engine engine;
    private Gear gear;
    private Wheels wheels;
    private ABS abs;

    public CarFacade(Engine engine, Gear gear, Wheels wheels, ABS abs) {
        this.engine = engine;
        this.gear = gear;
        this.wheels = wheels;
        this.abs = abs;
    }

    public void turnOnCar(){
        engine.startEngine();
        gear.turnGear();
        abs.turnABS();
        wheels.runWheels();
    }
}
