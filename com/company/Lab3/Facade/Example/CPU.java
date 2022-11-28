package com.company.Lab3.Facade.Example;

public class CPU {
    public void freeze(){
        System.out.println("Freeze processor");
    }
    public void jump(){
        System.out.println("Processor jump to another process");
    }
    public void execute(){
        System.out.println("Processor execute something");
    }
}
