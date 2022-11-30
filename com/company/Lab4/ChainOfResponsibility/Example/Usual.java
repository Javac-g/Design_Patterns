package com.company.Lab4.ChainOfResponsibility.Example;

public class Usual extends Exam{
    private Student student;

    public Usual(Student student) {
        this.student = student;
    }

    @Override
    public void executeExam() {
        if(student.getMark() < 4){
            getNext().executeExam();
        }else{
            System.out.println("Student pass exam");
        }
    }
}
