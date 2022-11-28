package com.company.Lab1.SingleTone;

public class Single {
    private static volatile Single instance;
    private Single(){

    }
    public static Single getInstance(){
        if (instance == null){
            synchronized (Single.class){
                if (instance == null){
                    instance = new Single();
                    System.out.println(instance);
                }
            }
        }
        return instance;
    }
}
