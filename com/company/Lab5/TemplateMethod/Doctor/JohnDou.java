package com.company.Lab5.TemplateMethod.Doctor;

public class JohnDou extends Patient {
    public JohnDou() {
        this.name = "John Dou";
    }

    @Override
    String getDiagnosis() {
        return "not identified";
    }

    @Override
    String getTreatment() {
        return "not identified";
    }
}
