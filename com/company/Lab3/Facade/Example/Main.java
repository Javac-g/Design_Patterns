package com.company.Lab3.Facade.Example;

public class Main {
    public static  void main(String...args){
        new ComputerFacade(new CPU(),new Memory(),new HardDrive()).start();
    }
}
