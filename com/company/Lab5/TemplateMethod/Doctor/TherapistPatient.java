package com.company.Lab5.TemplateMethod.Doctor;

public class TherapistPatient extends Patient{

    public TherapistPatient(String name) {
        this.name = name;
    }

    @Override
    String getDiagnosis() {
        return "Overwork";
    }

    @Override
    String getTreatment() {
        return "More rest and walk outside";
    }
}
