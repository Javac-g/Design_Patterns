package com.company.Lab4.Mediator;

public class Main {
    public static void main(String...args){

        EnglishStudent englishStudent = new EnglishStudent();
        UkrainianStudent ukrainianStudent = new UkrainianStudent();
        englishStudent.communicate();
        ukrainianStudent.communicate();
    }
}
