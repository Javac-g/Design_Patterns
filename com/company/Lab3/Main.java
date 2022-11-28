package com.company.Lab3;

import com.company.Lab3.Facade.CarFacade.*;

public class Main {
    public static void facadeDemo(){
        new CarFacade(new Engine(),new Gear(),new Wheels(),new ABS()).turnOnCar();
    }
    public static void main(String...args){
        facadeDemo();
    }
}
