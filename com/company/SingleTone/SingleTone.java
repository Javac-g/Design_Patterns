package com.company.SingleTone;

public class SingleTone {
    private static  volatile SingleTone instance;
    private SingleTone(){

    }
    public static SingleTone getInstance(){

        if (instance == null){

            synchronized (SingleTone.class){

                if (instance == null){

                    instance = new SingleTone();
                    System.out.println(instance);
                }
            }

        }
        return instance;
    }
}
