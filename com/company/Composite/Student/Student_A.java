package com.company.Composite.Student;

public class Student_A implements Student{
    @Override
    public void getGrade(Integer grade) {
        System.out.println("Student A grade: " + grade);
    }
}
