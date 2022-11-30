package com.company.Lab4.ChainOfResponsibility.Example;

public class Automate extends Exam{

    private Student student;

    public Automate(Student student) {
        this.student = student;
    }

    @Override
    public void executeExam() {
        if (student.getMark() < 5){
            getNext().executeExam();
        }else{
            System.out.println("Student get automate");
        }
    }
}
