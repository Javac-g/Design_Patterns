package com.company.Lab5.TemplateMethod.Doctor;

public class SurgeryPatient extends Patient {

    public SurgeryPatient(String name) {
        this.name = name;
    }

    @Override
    String getDiagnosis() {
        return "Appendicitis";
    }

    @Override
    String getTreatment() {
        return "Amputation";
    }
}
