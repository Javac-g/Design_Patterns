package com.company.Lab2.Bridge.Students;

public class Main {
    public static void main(String...args){
        BadStudent badStudent = new BadStudent(new BadStuding());
        GoodStudent goodStudent = new GoodStudent(new GoodStuding());


        badStudent.Studing();
        goodStudent.Studing();

    }
}
