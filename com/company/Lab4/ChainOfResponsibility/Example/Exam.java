package com.company.Lab4.ChainOfResponsibility.Example;

public abstract class Exam {
    protected Exam next;
    public void setNext(Exam exam){
        this.next = exam;
    }
    public Exam getNext(){
        return next;
    }
    public abstract void executeExam();
}
