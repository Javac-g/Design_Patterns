package com.company.Lab2.Bridge.Students;

public class BadStudent extends Student{
    public BadStudent(Study study) {
        super(study);
    }

    @Override
    public void Studing() {

        System.out.println("Bad student: ");
        study.doStudy();
    }
}
