package com.company.Lab1.SingleTone;

public class Main {
    public static void main(String...args){
        Thread t = new Thread(){
          @Override
          public void run(){
              for (int i = 0; i < 10 ; i ++){
                  SingleTone.getInstance();
              }
          }
        };
        t.start();
    }
}
