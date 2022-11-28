package com.company.Lab2.Bridge.Students;

public class BadStuding implements Study{
    @Override
    public void doStudy() {
        System.out.println("Skip lections");
        System.out.println("Not listen lectures");
    }
}
