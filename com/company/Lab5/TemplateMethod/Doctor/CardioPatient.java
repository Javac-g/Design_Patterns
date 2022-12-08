package com.company.Lab5.TemplateMethod.Doctor;

public class CardioPatient extends Patient{
    public CardioPatient(String name) {
        this.name = name;
    }

    @Override
    String getDiagnosis() {
        return "Cardiomyopathy";
    }

    @Override
    String getTreatment() {
        return "Lover your blood pressure";
    }
}
