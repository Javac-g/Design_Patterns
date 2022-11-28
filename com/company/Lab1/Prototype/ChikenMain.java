package com.company.Lab1.Prototype;

import java.util.ArrayList;

public class ChikenMain {

    public static void main(String...args) throws CloneNotSupportedException {

        Egg egg = new Egg();

        egg.setWeight(23);

        ArrayList<Egg> eggs = new ArrayList<>();
        for (int i = 0; i < 5; i++){
            Egg egg1 = new Egg();
            egg1.setWeight(i + 10);
            eggs.add(egg1);
        }

        Chicken chicken = new Chicken();
        chicken.setWeight(500);
        chicken.setEggs(eggs);
        chicken.setEgg(egg);

        Chicken chicken1 = (Chicken)chicken.clone();
        chicken1.getEgg().setWeight(88);
        System.out.println(chicken);
        System.out.println(chicken1);
        System.out.println(new Chicken(chicken1));





    }
}
