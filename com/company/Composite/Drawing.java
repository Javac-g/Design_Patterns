package com.company.Composite;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Drawing implements Car{
    private List<Car> list = new ArrayList<>();

    public void add(Car...car){

        list.addAll(Arrays.asList(car));
    }
    public void clears(){
        list.clear();
    }
    @Override
    public void draw(String color) {
        for (Car car:list){
            car.draw(color);
        }
    }
}
