package com.company.Bridge.Students;

public abstract class Student {
    protected Study study;

    public Student(Study study) {
        this.study = study;
    }

    public abstract void Studing();
}
