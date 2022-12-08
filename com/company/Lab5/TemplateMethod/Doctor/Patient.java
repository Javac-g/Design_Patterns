package com.company.Lab5.TemplateMethod.Doctor;

public abstract class Patient {
    protected String name;

    abstract String getDiagnosis();
    abstract String getTreatment();

    public void printDiagnos(){
        String illness = getDiagnosis();
        String treatment = getTreatment();
        System.out.println("Patient: " + this.name + " have diagnosis: " + illness);
        System.out.println("Proposed treatment: " + treatment);
    }
}
