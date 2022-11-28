package com.company.Lab2.Composite;

public class Main {
    static public void main(String...args){
//        SportCar sportCar = new SportCar();
//        sportCar.draw("black");
//        sportCar.draw("yellow");
//        sportCar.draw("Red");
//        Jeep jeep = new Jeep();
//        jeep.draw("yellow");
//        jeep.draw("black");
//        jeep.draw("Red");
        Jeep jeep = new Jeep();
        SportCar sportCar = new SportCar();
        Drawing drawing = new Drawing();

        drawing.add(sportCar,jeep);
        drawing.draw("Black");
        drawing.draw("Yellow");
        drawing.draw("Red");


    }
}
