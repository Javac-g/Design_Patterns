package com.company.Lab2.Bridge.Students;

public class GoodStuding implements Study{
    @Override
    public void doStudy() {
        System.out.println("Learning");
        System.out.println("Make lecture notes");
    }
}
