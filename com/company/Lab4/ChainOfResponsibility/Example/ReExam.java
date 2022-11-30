package com.company.Lab4.ChainOfResponsibility.Example;

public class ReExam extends Exam{
    private Student student;

    public ReExam(Student student) {
        this.student = student;
    }

    @Override
    public void executeExam() {
        if (student.getMark() < 3){
            System.out.println("Student excluded");
        }else{
            System.out.println("Student pass re-examination");
        }
    }
}
