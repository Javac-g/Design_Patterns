package com.company.Lab3.Facade;

import com.company.Lab3.Facade.CarFacade.*;

public class Main {
    public static void main(String...args){
        new CarFacade(new Engine(),new Gear(),new Wheels(),new ABS()).turnOnCar();
    }
}
