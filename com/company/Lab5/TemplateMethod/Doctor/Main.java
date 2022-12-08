package com.company.Lab5.TemplateMethod.Doctor;

import java.util.Scanner;

public class Main {
    public static void main(String...args){
        Scanner reader = new Scanner(System.in);
        System.out.print("Enter patient name: ");
        String patientName = reader.nextLine();

        System.out.println("Choose medicine department to post:");
        System.out.println("1 - Cardio");
        System.out.println("2 - Therapy");
        System.out.println("3 - Surgery");
        int choice = Integer.parseInt(reader.nextLine());
        Patient patient = null;

        switch (choice){
            case 1 -> patient = new CardioPatient(patientName);
            case 2 -> patient = new TherapistPatient(patientName);
            case 3 -> patient = new SurgeryPatient(patientName);
            default -> patient = new JohnDou();
        }
        patient.printDiagnos();
    }
}
