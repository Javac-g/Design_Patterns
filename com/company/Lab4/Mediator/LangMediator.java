package com.company.Lab4.Mediator;

public class LangMediator {
    private Student student;

    public LangMediator(Student student) {
        this.student = student;
    }
    private static final String eng = "Hello";
    private static final String UA = "Доброго вечора";
    private static final String defaultStr = "Не розумію";

    public void executeCommunication(){
        switch (student.getLangType()){
            case ENGLISH -> System.out.println(eng + student.getName());
            case UKRAINIAN -> System.out.println(UA);
            default -> System.out.println(defaultStr);
        }
    }
}
