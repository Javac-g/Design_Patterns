package com.company.Bridge.Students;

public class GoodStudent extends Student{
    public GoodStudent(Study study) {
        super(study);
    }

    @Override
    public void Studing() {

        System.out.println("Good student: ");
        study.doStudy();
    }
}
