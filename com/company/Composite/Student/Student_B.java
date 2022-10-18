package com.company.Composite.Student;

public class Student_B implements Student{
    @Override
    public void getGrade(Integer grade) {
        System.out.println("Student B grade: " + grade);
    }
}
