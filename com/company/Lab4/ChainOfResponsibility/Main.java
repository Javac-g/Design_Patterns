package com.company.Lab4.ChainOfResponsibility;

import com.company.Lab4.ChainOfResponsibility.Example.Automate;
import com.company.Lab4.ChainOfResponsibility.Example.ReExam;
import com.company.Lab4.ChainOfResponsibility.Example.Student;
import com.company.Lab4.ChainOfResponsibility.Example.Usual;

public class Main {
    public static void chainDemo(){

        Student student = new Student();

        student.setMark(2);

        Automate automate = new Automate(student);
        Usual usual = new Usual(student);
        ReExam reExam = new ReExam(student);

        automate.setNext(usual);
        usual.setNext(reExam);

        automate.executeExam();
    }
    public static void main(String...args){
        chainDemo();
    }
}
